package com.rtx.zhongxing.bean.qm.entryorder;
import com.rtx.zhongxing.bean.qm.entryorder.RelatedOrders;
import com.rtx.zhongxing.bean.qm.entryorder.SenderInfo;
import com.rtx.zhongxing.bean.qm.entryorder.ReceiverInfo;
import com.rtx.zhongxing.bean.qm.entryorder.ExtendProps;
public class EntryOrder {
	private String totalOrderLines;//单据总行数，int，当单据需要分多个请求发送时，发送方需要将totalOrderLines 填入，接收方收到后，根据实际接收到的条数和 totalOrderLines 进行比对，如果小于，则继续等待接收请求。如果等于，则表示该单据的所有请求发送完成。
	private String entryOrderCode;//入库单号, string (50) , 必填
	private String ownerCode;//货主编码, string (50) , 必填
	private String purchaseOrderCode;//采购单号，string(50)，当 orderType=CGRK 时，使用
	private String warehouseCode;//仓库编码, string (50)，必填 ，统仓统配等无需 ERP 指定仓储编码的情况填 OTHER
	private String orderCreateTime;//订单创建时间, string (19) , YYYY-MM-DD HH:MM:SS
	private String orderType;//业务类型 (SCRK=生产入库，LYRK=领用入库，CCRK=残次品入库，CGRK=采购入库，DBRK=调拨入库, QTRK=其他入库，B2BRK=B2B 入库,XNRK=虚拟入库 string (50) , (只传英文编码) 
	private RelatedOrders relatedOrders;
	private String expectStartTime;//预期到货时间, string (19) , YYYY-MM-DD HH:MM:SS
	private String expectEndTime;//最迟预期到货时间, string (19) , YYYY-MM-DD HH:MM:SS
	private String logisticsCode;//物流公司编码, string (50) , SF=顺丰、EMS=标准快递、EYB=经济快件、ZJS=宅急送、YTO=圆通 、ZTO=中通 (ZTO) 、HTKY=百世汇通、BSKY=百世快运、UC=优速、STO=申通、TTKDEX=天天快递 、QFKD=全峰、FAST=快捷、POSTB=邮政小包 、GTO=国通、YUNDA=韵达、JD=京东配送、DD=当当宅配、AMAZON=亚马逊物流、DBWL=德邦物流、DBKD=德邦快递、DBKY=德邦快运、RRS=日日顺、OTHER=其他(只传英文编码) 
	private String logisticsName;//物流公司名称, string (200) 
	private String expressCode;//运单号, string (50) 
	private String supplierCode;//供应商编码 string (50) 
	private String supplierName;//供应商名称 string (200) 
	private String operatorCode;//操作员编码, string (50) 
	private String operatorName;//操作员名称, string (50) 
	private String operateTime;//操作时间, string (19) , YYYY-MM-DD HH:MM:SS
	private SenderInfo senderInfo;
	private ReceiverInfo receiverInfo;
	private String remark;//备注, string (500) 
	private ExtendProps extendProps;
	public String gettotalOrderLines() {
		return totalOrderLines;
	}
	public void settotalOrderLines(String totalOrderLines) {
		this.totalOrderLines = totalOrderLines;
	}
	public String getentryOrderCode() {
		return entryOrderCode;
	}
	public void setentryOrderCode(String entryOrderCode) {
		this.entryOrderCode = entryOrderCode;
	}
	public String getownerCode() {
		return ownerCode;
	}
	public void setownerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}
	public String getpurchaseOrderCode() {
		return purchaseOrderCode;
	}
	public void setpurchaseOrderCode(String purchaseOrderCode) {
		this.purchaseOrderCode = purchaseOrderCode;
	}
	public String getwarehouseCode() {
		return warehouseCode;
	}
	public void setwarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getorderCreateTime() {
		return orderCreateTime;
	}
	public void setorderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}
	public String getorderType() {
		return orderType;
	}
	public void setorderType(String orderType) {
		this.orderType = orderType;
	}
	public RelatedOrders getRelatedOrders() {
		return relatedOrders;
	}
	public void setRelatedOrders(RelatedOrders relatedOrders) {
		this.relatedOrders = relatedOrders;
	}
	public String getexpectStartTime() {
		return expectStartTime;
	}
	public void setexpectStartTime(String expectStartTime) {
		this.expectStartTime = expectStartTime;
	}
	public String getexpectEndTime() {
		return expectEndTime;
	}
	public void setexpectEndTime(String expectEndTime) {
		this.expectEndTime = expectEndTime;
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
	public String getsupplierCode() {
		return supplierCode;
	}
	public void setsupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}
	public String getsupplierName() {
		return supplierName;
	}
	public void setsupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getoperatorCode() {
		return operatorCode;
	}
	public void setoperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}
	public String getoperatorName() {
		return operatorName;
	}
	public void setoperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getoperateTime() {
		return operateTime;
	}
	public void setoperateTime(String operateTime) {
		this.operateTime = operateTime;
	}
	public SenderInfo getSenderInfo() {
		return senderInfo;
	}
	public void setSenderInfo(SenderInfo senderInfo) {
		this.senderInfo = senderInfo;
	}
	public ReceiverInfo getReceiverInfo() {
		return receiverInfo;
	}
	public void setReceiverInfo(ReceiverInfo receiverInfo) {
		this.receiverInfo = receiverInfo;
	}
	public String getremark() {
		return remark;
	}
	public void setremark(String remark) {
		this.remark = remark;
	}
	public ExtendProps getExtendProps() {
		return extendProps;
	}
	public void setExtendProps(ExtendProps extendProps) {
		this.extendProps = extendProps;
	}

}