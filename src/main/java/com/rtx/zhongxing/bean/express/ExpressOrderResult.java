package com.rtx.zhongxing.bean.express;

public class ExpressOrderResult {

	protected String externorderkey;//wms外部单号
	protected String wayBillNo;//运单号
	
	
	public ExpressOrderResult(String externorderkey) {
		super();
		this.externorderkey = externorderkey;
	}
	
	
	public ExpressOrderResult() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getExternorderkey() {
		return externorderkey;
	}
	public void setExternorderkey(String externorderkey) {
		this.externorderkey = externorderkey;
	}
	public String getWayBillNo() {
		return wayBillNo;
	}
	public void setWayBillNo(String wayBillNo) {
		this.wayBillNo = wayBillNo;
	}
	
	
}
