package com.rtx.zhongxing.bean.qm.returnorder;
import com.rtx.zhongxing.bean.qm.returnorder.SenderInfo;
public class ReturnOrder {
	private String returnOrderCode;//ERP 的退货入库单编码, string (50) , 必填
	private String ownerCode;//货主编码, string (50) , 必填
	private String warehouseCode;//仓库编码, string (50)，必填 ，统仓统配等无需 ERP 指定仓储编码的情况填 OTHER
	private String orderType;//单据类型, string (50)，THRK=退货入库，HHRK=换货入库 (只传英文编码)
	private String sourcePlatformCode;//订单来源平台编码, string (50),TB= 淘宝 、TM=天猫 、JD=京东、DD=当当、PP=拍拍、YX=易讯、EBAY=ebay、QQ=QQ 网购、AMAZON=亚马逊、SN=苏宁、GM=国美、WPH=唯品会、JM=聚美、LF=乐蜂、MGJ=蘑菇街、JS=聚尚、PX=拍鞋、YT=银泰、YHD=1 号店、VANCL=凡客、YL=邮乐、YG=优购、1688=阿里巴巴、POS=POS 门店、MIA=蜜芽、GW=商家官网、CT=村淘、YJWD=云集微店、PDD=拼多多、OTHERS=其他, (只
	private String sourcePlatformName;//订单来源平台名称, string (200) 
	private String shopNick;//店铺名称, string (200) 
	private String sellerNick;//卖家名称, string (200) 
	private String orderFlag;//用字符串格式来表示订单标记列表：比如 VISIT^ SELLER_AFFORD^SYNC_RETURN_BILL 等, 中间用“^”来隔开 订单标记 list (所有字母全部大写) ： VISIT=上门；SELLER_AFFORD=是否卖家承担运费 (默认是) ；SYNC_RETURN_BILL=同时退回发票；
	private String preDeliveryOrderCode;//原出库单号（ERP 分配）, string(50) ,必填
	private String preDeliveryOrderId;//原出库单号（WMS 分配）, string (50)，条件必填
	private String logisticsCode;//物流公司编码, string (50) , SF=顺丰、EMS=标准快递、EYB=经济快件、ZJS=宅急送、YTO=圆通 、ZTO=中通 (ZTO) 、HTKY=百世汇通、BSKY=百世快运、UC=优速、STO=申通、TTKDEX=天天快递 、QFKD=全峰、FAST=快捷、POSTB=邮政小包 、GTO=国通、YUNDA=韵达、JD=京东配送、DD=当当宅配、AMAZON=亚马逊物流、DBWL=德邦物流、DBKD=德邦快递、DBKY=德邦快运、RRS=日日顺、OTHER=其他，必填, (只传英文编码) 
	private String logisticsName;//物流公司名称, string (200) 
	private String expressCode;//运单号, string (50) 
	private String returnReason;//退货原因, string (200) 
	private String buyerNick;//买家昵称, string (50) 
	private SenderInfo senderInfo;
	private String remark;//备注, string (500) 
	public String getreturnOrderCode() {
		return returnOrderCode;
	}
	public void setreturnOrderCode(String returnOrderCode) {
		this.returnOrderCode = returnOrderCode;
	}
	public String getownerCode() {
		return ownerCode;
	}
	public void setownerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}
	public String getwarehouseCode() {
		return warehouseCode;
	}
	public void setwarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getorderType() {
		return orderType;
	}
	public void setorderType(String orderType) {
		this.orderType = orderType;
	}
	public String getsourcePlatformCode() {
		return sourcePlatformCode;
	}
	public void setsourcePlatformCode(String sourcePlatformCode) {
		this.sourcePlatformCode = sourcePlatformCode;
	}
	public String getsourcePlatformName() {
		return sourcePlatformName;
	}
	public void setsourcePlatformName(String sourcePlatformName) {
		this.sourcePlatformName = sourcePlatformName;
	}
	public String getshopNick() {
		return shopNick;
	}
	public void setshopNick(String shopNick) {
		this.shopNick = shopNick;
	}
	public String getsellerNick() {
		return sellerNick;
	}
	public void setsellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}
	public String getorderFlag() {
		return orderFlag;
	}
	public void setorderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
	}
	public String getpreDeliveryOrderCode() {
		return preDeliveryOrderCode;
	}
	public void setpreDeliveryOrderCode(String preDeliveryOrderCode) {
		this.preDeliveryOrderCode = preDeliveryOrderCode;
	}
	public String getpreDeliveryOrderId() {
		return preDeliveryOrderId;
	}
	public void setpreDeliveryOrderId(String preDeliveryOrderId) {
		this.preDeliveryOrderId = preDeliveryOrderId;
	}
	public String getlogisticsCode() {
		return logisticsCode;
	}
	public void setlogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}
	public String getlogisticsName() {
		return logisticsName;
	}
	public void setlogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}
	public String getexpressCode() {
		return expressCode;
	}
	public void setexpressCode(String expressCode) {
		this.expressCode = expressCode;
	}
	public String getreturnReason() {
		return returnReason;
	}
	public void setreturnReason(String returnReason) {
		this.returnReason = returnReason;
	}
	public String getbuyerNick() {
		return buyerNick;
	}
	public void setbuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	public SenderInfo getSenderInfo() {
		return senderInfo;
	}
	public void setSenderInfo(SenderInfo senderInfo) {
		this.senderInfo = senderInfo;
	}
	public String getremark() {
		return remark;
	}
	public void setremark(String remark) {
		this.remark = remark;
	}

}