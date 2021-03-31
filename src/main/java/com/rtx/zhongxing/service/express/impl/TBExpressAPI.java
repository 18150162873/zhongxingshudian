package com.rtx.zhongxing.service.express.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.rtx.zhongxing.bean.express.pdd.PddExpressOrderResult;
import com.rtx.zhongxing.mybatis.entity.express.ParameterEntity;
import com.rtx.zhongxing.service.express.ExpressService;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.WlbWaybillIGetRequest;
import com.taobao.api.request.WlbWaybillIGetRequest.PackageItem;
import com.taobao.api.request.WlbWaybillIGetRequest.TradeOrderInfo;
import com.taobao.api.request.WlbWaybillIGetRequest.WaybillAddress;
import com.taobao.api.request.WlbWaybillIGetRequest.WaybillApplyNewRequest;
import com.taobao.api.response.WlbWaybillIGetResponse;

@SuppressWarnings("all")
@Service
public class TBExpressAPI implements ExpressService<ParameterEntity,PddExpressOrderResult>{
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Value("${tb.url}")
	private String SERVER_URL;
	@Value("${tb.appKey}")
	private String appKey;
	@Value("${tb.appSecret}")
	private String appSecret;

	@Override
	public PddExpressOrderResult getWaybill(ParameterEntity parameter) {
		try {
			TaobaoClient client = new DefaultTaobaoClient(SERVER_URL, appKey, appSecret);
			WlbWaybillIGetRequest req = mappingToRequest(parameter);
			WlbWaybillIGetResponse rsp = client.execute(req, "6102424e5f0f627da23bd3ebacec1e13146a2c87c73aab4832978172");
		} catch (Exception e) {
			log.error("菜鸟平台获取快递单号异常",e);
		}
		return null;
	}
	
	private WlbWaybillIGetRequest mappingToRequest(ParameterEntity parameter) {
		WlbWaybillIGetRequest req = new WlbWaybillIGetRequest();
		WaybillApplyNewRequest obj1 = new WaybillApplyNewRequest();
		obj1.setCpCode(parameter.getCarriercode());
		
		WaybillAddress shippingAddress = new WaybillAddress();
		shippingAddress.setArea(parameter.getSender().getSendArea());
		shippingAddress.setProvince(parameter.getSender().getSendProvince());
		shippingAddress.setTown(parameter.getSender().getSendArea());
		shippingAddress.setAddressDetail(parameter.getSender().getSendAddr());
		shippingAddress.setCity(parameter.getSender().getSendCity());
		obj1.setShippingAddress(shippingAddress);
		
		List<TradeOrderInfo> tradeOrderInfoList = new ArrayList<TradeOrderInfo>();
		TradeOrderInfo tradeOrderInfo = new TradeOrderInfo();
		tradeOrderInfo.setConsigneeName(parameter.getReceiverName());
		tradeOrderInfo.setOrderChannelsType(parameter.getOrderchannelstype());
		tradeOrderInfo.setTradeOrderList(Arrays.asList(parameter.getExternorderkey()));
		tradeOrderInfo.setConsigneePhone(parameter.getReceiverPhone());
		tradeOrderInfo.setSendPhone(parameter.getSender().getSendPhone());
		tradeOrderInfo.setWeight(0L);
		tradeOrderInfo.setSendName(parameter.getSender().getSendName());
		tradeOrderInfo.setProductType(parameter.getExpressType());
		tradeOrderInfo.setRealUserId(832978172l);
		tradeOrderInfo.setVolume(0L);
		tradeOrderInfo.setPackageId(parameter.getExternorderkey());
		tradeOrderInfoList.add(tradeOrderInfo);
		
		WaybillAddress consigneeaddress = new WaybillAddress();
		consigneeaddress.setArea(parameter.getReceiverArea());
		consigneeaddress.setProvince(parameter.getReceiverProvince());
		consigneeaddress.setTown(parameter.getReceiverArea());
		consigneeaddress.setAddressDetail(parameter.getReceiverAddr());
		consigneeaddress.setCity(parameter.getReceiverCity());
		tradeOrderInfo.setConsigneeAddress(consigneeaddress);
		
		List<PackageItem> packageItems = new ArrayList<PackageItem>();
		PackageItem packageitem = new PackageItem();
		packageitem.setItemName("书");
		packageitem.setCount(0L);
		packageItems.add(packageitem);
		tradeOrderInfo.setPackageItems(packageItems);
		
		obj1.setTradeOrderInfoCols(tradeOrderInfoList);
		req.setWaybillApplyNewRequest(obj1);
		return req;
	}
	
}
