package com.rtx.zhongxing.bean.qm.entryorder;
import com.rtx.zhongxing.bean.qm.entryorder.SnList;
import com.rtx.zhongxing.bean.qm.entryorder.ExtendProps;
public class OrderLine {
	private String outBizCode;//外部业务编码, 消息 ID, 用于去重，当单据需要分批次发送时使用
	private String orderLineNo;//入库单的行号，string（50）
	private String ownerCode;//货主编码, string (50) , 必填
	private String itemCode;//商品编码, string (50) , 必填
	private String itemId;//仓储系统商品 ID,string(50)，条件必填
	private SnList snList;
	private String itemName;//商品名称, string (200) 
	private String planQty;//应收商品数量, int, 必填
	private String skuProperty;//商品属性, string (200) 
	private String purchasePrice;//采购价, double (18, 2) 
	private String retailPrice;//零售价, double (18, 2) 
	private String inventoryType;//库存类型，string (50) , ZP=正品, CC=残次,JS=机损, XS= 箱损，默认为 ZP
	private String productDate;//商品生产日期 YYYY-MM-DD
	private String expireDate;//商品过期日期 YYYY-MM-DD
	private String produceCode;//生产批号, string (50) 
	private String batchCode;//批次编码, string (50) 
	private ExtendProps extendProps;
	public String getoutBizCode() {
		return outBizCode;
	}
	public void setoutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}
	public String getorderLineNo() {
		return orderLineNo;
	}
	public void setorderLineNo(String orderLineNo) {
		this.orderLineNo = orderLineNo;
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
	public String getitemName() {
		return itemName;
	}
	public void setitemName(String itemName) {
		this.itemName = itemName;
	}
	public String getplanQty() {
		return planQty;
	}
	public void setplanQty(String planQty) {
		this.planQty = planQty;
	}
	public String getskuProperty() {
		return skuProperty;
	}
	public void setskuProperty(String skuProperty) {
		this.skuProperty = skuProperty;
	}
	public String getpurchasePrice() {
		return purchasePrice;
	}
	public void setpurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public String getretailPrice() {
		return retailPrice;
	}
	public void setretailPrice(String retailPrice) {
		this.retailPrice = retailPrice;
	}
	public String getinventoryType() {
		return inventoryType;
	}
	public void setinventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
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
	public String getbatchCode() {
		return batchCode;
	}
	public void setbatchCode(String batchCode) {
		this.batchCode = batchCode;
	}
	public ExtendProps getExtendProps() {
		return extendProps;
	}
	public void setExtendProps(ExtendProps extendProps) {
		this.extendProps = extendProps;
	}

}