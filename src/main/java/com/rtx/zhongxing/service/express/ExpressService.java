package com.rtx.zhongxing.service.express;

public interface ExpressService <P,R>{

	//获取快递面单号
	public R getWaybill(P Parameter);
}
