package com.rtx.zhongxing.bean.qm.returnorder;
import com.rtx.zhongxing.bean.qm.returnorder.SnList;
public class OrderLine {
	private String orderLineNo;//单据行号，string（50）
	private String sourceOrderCode;//交易平台订单, string (50) 
	private String subSourceOrderCode;//交易平台子订单编码, string (50) 
	private String ownerCode;//货主编码, string (50) , 必填
	private String itemCode;//商品编码, string (50) , 必填
	private String itemId;//仓储系统商品编码, string (50) , 条件必填，条件为提供后端（仓储系统）商品编码的仓储系统
	private SnList snList;
	private String inventoryType;//库存类型, string (50) , ZP=正品, CC=残次,JS=机损, XS= 箱损, 默认为 ZP, 
	private String planQty;//应收商品数量, int, 必填
	private String batchCode;//批次编码, string (50) 
	private String productDate;//生产日期, string (10) , YYYY-MM-DD
	private String expireDate;//过期日期, string (10) , YYYY-MM-DD
	private String produceCode;//生产批号, string (50) 
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
	public SnList getSnList() {
		return snList;
	}
	public void setSnList(SnList snList) {
		this.snList = snList;
	}
	public String getinventoryType() {
		return inventoryType;
	}
	public void setinventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
	public String getplanQty() {
		return planQty;
	}
	public void setplanQty(String planQty) {
		this.planQty = planQty;
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
	public String getproduceCode() {
		return produceCode;
	}
	public void setproduceCode(String produceCode) {
		this.produceCode = produceCode;
	}

}