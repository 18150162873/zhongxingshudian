package com.rtx.zhongxing.bean.express.pdd;

import com.rtx.zhongxing.bean.express.ExpressOrderParameter;

public class PddExpressOrderParameter extends ExpressOrderParameter{
	
	private String orderChannelsType;

	public PddExpressOrderParameter() {
		super("");
		// TODO Auto-generated constructor stub
	}

	public PddExpressOrderParameter(String externorderkey) {
		super(externorderkey);
		// TODO Auto-generated constructor stub
	}

	public String getOrderChannelsType() {
		return orderChannelsType;
	}

	public void setOrderChannelsType(String orderChannelsType) {
		this.orderChannelsType = orderChannelsType;
	}
}
