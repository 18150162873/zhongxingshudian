package com.rtx.zhongxing.service.qm.impl;

import org.springframework.stereotype.Service;

import com.rtx.zhongxing.bean.qm.RtxQMResponse;
import com.rtx.zhongxing.bean.qm.ordercancel.OrderCancel;
import com.rtx.zhongxing.service.qm.QMDataDown;
import com.rtx.zhongxing.utils.JaxbObjectAndXmlUtil;

@SuppressWarnings("all")
@Service("orderCancel")
public class OrderCancelService implements QMDataDown{

	@Override
	public RtxQMResponse handelApiToWms(String datasourcekey, String body) {
		RtxQMResponse response = new RtxQMResponse();
		
		OrderCancel apiEntity = JaxbObjectAndXmlUtil.xml2Object(body, OrderCancel.class);
		return response;
	}
}
