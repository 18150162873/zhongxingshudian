package com.rtx.zhongxing.bean.qm.batchdeliveryorder;
public class OrderLine {
	private String orderLineNo;//单据行号，string（50）
	private String sourceOrderCode;//交易平台订单, string (50)
	private String subSourceOrderCode;//交易平台子订单编码, string (50)
	private String ownerCode;//货主编码, string (50) , 必填
	private String itemCode;//商品编码, string (50) , 必填
	private String itemId;//仓储系统商品编码, string (50) ,条件必填
	private String inventoryType;//库存类型，string (50) , ZP=正品, CC=残次,JS=机损, XS= 箱损, ZT=在途库存，DJ=冻结，默认为查所有类型的库存
	private String itemName;//商品名称, string (200)
	private String extCode;//交易平台商品编码, string (50)
	private String planQty;//应发商品数量, int, 必填
	private String retailPrice;//零售价, double (18, 2) , 零售价=实际成交价+单件商品折扣金额
	private String actualPrice;//实际成交价, double (18, 2) , 必填
	private String discountAmount;//单件商品折扣金额, double (18, 2)
	private String batchCode;//批次编码, string (50)
	private String productDate;//生产日期，string(10)，YYYY-MM-DD
	private String expireDate;//过期日期，string(10)，YYYY-MM-DD
	public String getorderLineNo() {
		return orderLineNo;
	}
	public void setorderLineNo(String orderLineNo) {
		this.orderLineNo = orderLineNo;
	}
	public String getsourceOrderCode() {
		return sourceOrderCode;
	}
	public void setsourceOrderCode(String sourceOrderCode) {
		this.sourceOrderCode = sourceOrderCode;
	}
	public String getsubSourceOrderCode() {
		return subSourceOrderCode;
	}
	public void setsubSourceOrderCode(String subSourceOrderCode) {
		this.subSourceOrderCode = subSourceOrderCode;
	}
	public String getownerCode() {
		return ownerCode;
	}
	public void setownerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}
	public String getitemCode() {
		return itemCode;
	}
	public void setitemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getitemId() {
		return itemId;
	}
	public void setitemId(String itemId) {
		this.itemId = itemId;
	}
	public String getinventoryType() {
		return inventoryType;
	}
	public void setinventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
	public String getitemName() {
		return itemName;
	}
	public void setitemName(String itemName) {
		this.itemName = itemName;
	}
	public String getextCode() {
		return extCode;
	}
	public void setextCode(String extCode) {
		this.extCode = extCode;
	}
	public String getplanQty() {
		return planQty;
	}
	public void setplanQty(String planQty) {
		this.planQty = planQty;
	}
	public String getretailPrice() {
		return retailPrice;
	}
	public void setretailPrice(String retailPrice) {
		this.retailPrice = retailPrice;
	}
	public String getactualPrice() {
		return actualPrice;
	}
	public void setactualPrice(String actualPrice) {
		this.actualPrice = actualPrice;
	}
	public String getdiscountAmount() {
		return discountAmount;
	}
	public void setdiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getbatchCode() {
		return batchCode;
	}
	public void setbatchCode(String batchCode) {
		this.batchCode = batchCode;
	}
	public String getproductDate() {
		return productDate;
	}
	public void setproductDate(String productDate) {
		this.productDate = productDate;
	}
	public String getexpireDate() {
		return expireDate;
	}
	public void setexpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

}