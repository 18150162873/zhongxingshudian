package com.rtx.zhongxing.controller;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rtx.zhongxing.bean.qm.RtxQMResponse;
import com.rtx.zhongxing.service.qm.QMDataDown;
import com.rtx.zhongxing.utils.JaxbObjectAndXmlUtil;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.RequestParametersHolder;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

@SuppressWarnings("all")
@RestController
public class RtxQMController {
	
	private final Logger log = LoggerFactory.getLogger(RtxQMController.class);
	
	@Value(value = "${qm.secret}")
	private String secretKey;
	
	@Autowired
	ApplicationContext context;
	
	@Resource(name ="methodMapping")
	Map<String,String> qmMapping;

	@PostMapping(value = "rtx",produces="application/xml; charset=utf-8")
	public String RTXQMAPI(@RequestBody String body,HttpServletRequest request) throws IOException {
		RtxQMResponse response = new RtxQMResponse();
		try {
//			String msg = checkSign(request,body);
			String msg = "OK";
			if(!"OK".equals(msg)) {
				response.setFailure(msg);
				return JaxbObjectAndXmlUtil.object2Xml(response);
			}
			
			//获取对应API
			QMDataDown apiToMid = (QMDataDown) context.getBean(qmMapping.get(request.getParameter(Constants.METHOD)));
			//处理QM下发的数据
			response = apiToMid.handelApiToWms("middle",body);
			
		} catch (Exception e) {
			log.error("qm下发数据异常：",e);
			response.setFailure(e.getMessage().length()>30?e.getMessage().substring(0,29):e.getMessage());
		}
		
		return JaxbObjectAndXmlUtil.object2Xml(response);
	}
	
	//校验数据是否正确
	public String checkSign(HttpServletRequest request,String body) throws IOException {
		String isCheck = "OK";
		RequestParametersHolder requestHolder = new RequestParametersHolder();

		TaobaoHashMap protocalMustParams = new TaobaoHashMap();
		protocalMustParams.put(Constants.METHOD, request.getParameter(Constants.METHOD));
		protocalMustParams.put(Constants.VERSION, request.getParameter(Constants.VERSION));
		protocalMustParams.put(Constants.APP_KEY, request.getParameter(Constants.APP_KEY));
		protocalMustParams.put(Constants.TIMESTAMP, request.getParameter(Constants.TIMESTAMP));

		requestHolder.setProtocalMustParams(protocalMustParams);

		TaobaoHashMap protocalOptParams = new TaobaoHashMap();
		protocalOptParams.put(Constants.FORMAT, request.getParameter(Constants.FORMAT));
		protocalOptParams.put(Constants.SIGN_METHOD, request.getParameter(Constants.SIGN_METHOD));
		protocalOptParams.put(Constants.SESSION, null);
		protocalOptParams.put(Constants.PARTNER_ID, request.getParameter(Constants.PARTNER_ID));
		protocalOptParams.put(Constants.QM_CUSTOMER_ID, request.getParameter(Constants.QM_CUSTOMER_ID));
		requestHolder.setProtocalOptParams(protocalOptParams);

		String sign1 = TaobaoUtils.signTopRequestWithBody(requestHolder, body, secretKey, request.getParameter(Constants.SIGN_METHOD));
		String sign = request.getParameter(Constants.SIGN)==null?"":request.getParameter(Constants.SIGN);
		if(!sign.equals(sign1)) {
			isCheck ="接收奇门数据异常:数据签名不一致";
		}
		return isCheck;
	}
}
