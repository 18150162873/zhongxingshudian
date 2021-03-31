package com.rtx.zhongxing.bean.qm.batchdeliveryorder;
public class Item {
	private String itemName;//商品名称, string (50)
	private String unit;//商品单位, string (50)
	private String price;//商品单价, double (18, 2)
	private String quantity;//数量, int
	private String amount;//金额, double (18, 2)
	public String getitemName() {
		return itemName;
	}
	public void setitemName(String itemName) {
		this.itemName = itemName;
	}
	public String getunit() {
		return unit;
	}
	public void setunit(String unit) {
		this.unit = unit;
	}
	public String getprice() {
		return price;
	}
	public void setprice(String price) {
		this.price = price;
	}
	public String getquantity() {
		return quantity;
	}
	public void setquantity(String quantity) {
		this.quantity = quantity;
	}
	public String getamount() {
		return amount;
	}
	public void setamount(String amount) {
		this.amount = amount;
	}

}