package com.rtx.zhongxing.bean.qm.batchdeliveryorder;
public class Insurance {
	private String type;//保险类型, string (50)
	private String amount;//保险金额, double (18, 2)
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
	public String getamount() {
		return amount;
	}
	public void setamount(String amount) {
		this.amount = amount;
	}

}