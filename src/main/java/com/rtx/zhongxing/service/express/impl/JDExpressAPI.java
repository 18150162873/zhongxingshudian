package com.rtx.zhongxing.service.express.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.domain.wujiemiandan.SignSuccessQueryApi.response.get.SignSuccessQueryDTO;
import com.jd.open.api.sdk.domain.wujiemiandan.SignSuccessQueryApi.response.get.WaybillAddress;
import com.jd.open.api.sdk.request.seller.SellerVenderInfoGetRequest;
import com.jd.open.api.sdk.request.wujiemiandan.LdopAlphaProviderSignSuccessInfoGetRequest;
import com.jd.open.api.sdk.request.wujiemiandan.LdopAlphaVendorBigshotQueryRequest;
import com.jd.open.api.sdk.response.seller.SellerVenderInfoGetResponse;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaProviderSignSuccessInfoGetResponse;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaVendorBigshotQueryResponse;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaWaybillReceiveResponse;
import com.rtx.zhongxing.bean.express.jd.JDWaybillRequest;
import com.rtx.zhongxing.bean.express.pdd.PddExpressOrderResult;
import com.rtx.zhongxing.mybatis.entity.express.ParameterEntity;
import com.rtx.zhongxing.service.express.ExpressService;
import com.rtx.zhongxing.utils.HttpsUtils;
import com.rtx.zhongxing.utils.MD5Helper;

@SuppressWarnings("all")
@Service
public class JDExpressAPI implements ExpressService<ParameterEntity,PddExpressOrderResult>{
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Value("${jd.url}")
	private String SERVER_URL;
	@Value("${jd.appKey}")
	private String appKey;
	@Value("${jd.appSecret}")
	private String appSecret;

	@Override
	public PddExpressOrderResult getWaybill(ParameterEntity parameter) {
		
		try {
			//映射字段
			JDWaybillRequest request = mappingToRequest(parameter);
			
			Map map = new HashMap();
			map.put("method", "jingdong.ldop.alpha.waybill.receive");
			map.put("access_token", "");
			map.put("app_key", appKey);
			map.put("timestamp", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));
			map.put("v", "2.0");
			map.put("360buy_param_json", JSON.toJSONString(""));
			map.put("sign", createJDSign(map));
			
			String result = HttpsUtils.sendSSLPostHttp(SERVER_URL, map);
			
			LdopAlphaWaybillReceiveResponse response = JSON.parseObject(result, LdopAlphaWaybillReceiveResponse.class);
			String waybillcode = response.getResultInfo().getData().getWaybillCodeList().get(0);
			
			LdopAlphaVendorBigshotQueryResponse bigshot = queryBigShot(parameter.getCarriercode(),waybillcode);
		} catch (Exception e) {
			log.error("京东平台获取快递单号异常:",e);
		}
		
		return null;
	}
	
	private String createJDSign(Map<String,String> map) {
		String access_token = map.get("access_token");
		String app_key = appKey;
		String method = map.get("method");
		String timestamp = map.get("timestamp");
		String v = map.get("v");
		String appSecret = this.appSecret;
		String buy_param_json = map.get("360buy_param_json");

//		String signStr = appSecret+"+access_token"+access_token+"app_key"+app_key+"method"+method+"timestamp"+timestamp+"v"+v+"+"+appSecret;
		String signStr = appSecret+"360buy_param_json"+buy_param_json+"access_token"+access_token+"app_key"+app_key+"method"+method+"timestamp"+timestamp+"v"+v+appSecret;
		String sign = MD5Helper.encryptMD5And16Hex(signStr).toUpperCase();
		return sign;
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception 
	 */
	private JDWaybillRequest  mappingToRequest(ParameterEntity parameter) throws Exception {
		JDWaybillRequest request = new JDWaybillRequest();
		String carriercode = parameter.getCarriercode();
		if(StringUtils.isEmpty(carriercode)) {
			throw new RuntimeException("承运商代码(carriercode)为空！");
		}
		SignSuccessQueryDTO currentSignProvider = null;
		List<SignSuccessQueryDTO>signProviderList =queryProvider();
		for(SignSuccessQueryDTO signProvider:signProviderList) {
			if(carriercode.equals(signProvider.getProviderCode())) {
				currentSignProvider = signProvider;
			};
		}
		
		if(currentSignProvider == null) {
			throw new RuntimeException("承运商代码(carriercode):"+carriercode+"在京东平台为配置！");
		}
		
		request.setWaybillType("1");
		request.setWaybillCount("1");
		request.setProviderId(currentSignProvider.getProviderId()+"");
		request.setProviderCode(carriercode);
		
		if("2".equals(currentSignProvider.getOperationType())) {
			request.setBranchCode(currentSignProvider.getBranchCode());
		}else {
			request.setSettlementCode(currentSignProvider.getSettlementCode());
		}
		
		request.setSalePlatform("");//销售平台
		request.setPlatformOrderNo(parameter.getExternorderkey());
		request.setVendorCode("42463");
		request.setVendorName("中信出版社官方旗舰店");
		request.setVendorCode(parameter.getExternorderkey());
		request.setFromAddress(currentSignProvider.getAddress());
		
		WaybillAddress toAddress = new WaybillAddress();
		toAddress.setAddress(parameter.getReceiverAddr());
		toAddress.setCityName(parameter.getReceiverCity());
		toAddress.setCountryName(parameter.getReceiverArea());
		toAddress.setProvinceName(parameter.getReceiverProvince());
		toAddress.setCountrysideName(parameter.getReceiverArea());
		request.setToAddress(toAddress);
		
		request.setWeight("0.00");
		request.setVolume("0.00");
		request.setGoodsName("书");
		request.setPromiseTimeType("0");
		request.setPayType("0");
		request.setGoodsMoney("0.00");
		request.setShouldPayMoney("0.00");
		request.setNeedGuarantee("flase");
		request.setGuaranteeMoney("0.00");
		request.setReceiveTimeType("0");
		if("SF".equals(carriercode)) {
			request.setExpressPayMethod(parameter.getPayMethod());
			request.setExpressType(parameter.getExpressType());
		}
		return request;
	}
	
	public LdopAlphaVendorBigshotQueryResponse queryBigShot(String carriercode,String waybillcode) throws Exception {
		JdClient client=new DefaultJdClient(SERVER_URL,"8d7c3f4906764321b4a57c21c62beb4cnmnd",appKey,appSecret);
		LdopAlphaVendorBigshotQueryRequest request=new LdopAlphaVendorBigshotQueryRequest();
		request.setWaybillCode(waybillcode);
		request.setProviderCode(carriercode);
		LdopAlphaVendorBigshotQueryResponse response=client.execute(request);
		return response;
	}
	
	public void getSellerInfo() throws Exception {
		JdClient client=new DefaultJdClient(SERVER_URL,"8d7c3f4906764321b4a57c21c62beb4cnmnd",appKey,appSecret);
		SellerVenderInfoGetRequest request=new SellerVenderInfoGetRequest();
		SellerVenderInfoGetResponse response=client.execute(request);
	}
	
	public List<SignSuccessQueryDTO>  queryProvider() throws Exception {
		JdClient client=new DefaultJdClient(SERVER_URL,"8d7c3f4906764321b4a57c21c62beb4cnmnd",appKey,appSecret);
		LdopAlphaProviderSignSuccessInfoGetRequest request=new LdopAlphaProviderSignSuccessInfoGetRequest();
		request.setVenderCode("42463");
		LdopAlphaProviderSignSuccessInfoGetResponse response=client.execute(request);
		return response.getResultInfo().getData();
	}
}
