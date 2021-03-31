package com.rtx.zhongxing.bean.qm.stockout;
import com.rtx.zhongxing.bean.qm.stockout.RelatedOrders;
import com.rtx.zhongxing.bean.qm.stockout.PickerInfo;
import com.rtx.zhongxing.bean.qm.stockout.SenderInfo;
import com.rtx.zhongxing.bean.qm.stockout.ReceiverInfo;
public class DeliveryOrder {
	private String totalOrderLines;//单据总行数，int，当单据需要分多个请求发送时，发送方需要将 totalOrderLines 填入，接收方收到后，根据实际接收到的条数和 totalOrderLines 进行比 对，如果小于，则继续等待接收请求。如果等于，则表示该单据的所有请求发送完成。
	private String deliveryOrderCode;//出库单号（ERP 分配）, string (50) , 必填
	private String targetEntryOrderCode;//关联的入库单号（ERP 分配）, string (50)
	private String sourcePlatformCode;//订单来源平台编码, string (50) , 必填,TB= 淘宝 、TM=天 猫 、JD=京东、DD=当当、PP=拍拍、YX=易讯、EBAY=ebay、QQ=QQ 网购、 AMAZON=亚马逊、SN=苏宁、GM=国美、WPH=唯品会、JM=聚美、LF=乐蜂、 MGJ=蘑菇街、JS=聚尚、PX=拍鞋、YT=银泰、YHD=1 号店、VANCL=凡客、YL=邮 乐、YG=优购、1688=阿里巴巴、POS=POS 门店、MIA=蜜芽、GW=商家官网、CT=村 淘、YJWD=云集微店、PDD=拼多多、OTHERS=其他, (只
	private String sourcePlatformName;//订单来源平台名称, string (200)
	private String orderType;//出库单类型, string (50) , 必填, PTCK=普通出库单，DBCK=调拨出库 ， B2BCK=B2B 出库，SCCK=生产出库，QTCK=其他出库，CGTH=采购退货出库 单,XNCK=虚拟出库单
	private RelatedOrders relatedOrders;
	private String warehouseCode;//出库仓库编码, string (50)，必填 ，统仓统配等无需 ERP 指定仓储 编码的情况填 OTHER
	private String warehouseName;//出库仓库名称, string (50)
	private String targetWarehouseCode;//入库仓库编码, string (50) ，统仓统配等无需 ERP 指定仓储 编码的情况填 OTHER
	private String targetWarehouseName;//入库仓库名称, string (50)
	private String ownerCode;//货主编码, string (50) , 必填
	private String createTime;//出库单创建时间, string (19) , YYYY-MM-DD HH:MM:SS, 必填
	private String scheduleDate;//要求出库时间, string (10) , YYYY-MM-DD
	private String shippingTime;//送货时间, string (10) , YYYY-MM-DD HH:MM:SS
	private String receivingTime;//到货时间, string (10) , YYYY-MM-DD HH:MM:SS
	private String logisticsCode;//物流公司编码, string (50) , SF=顺丰、EMS=标准快递、EYB=经济快 件、ZJS=宅急送、YTO=圆通 、ZTO=中通 (ZTO) 、HTKY=百世汇通、BSKY=百世快 运、UC=优速、STO=申通、TTKDEX=天天快递 、QFKD=全峰、FAST=快捷、POSTB= 邮政小包 、GTO=国通、YUNDA=韵达、JD=京东配送、DD=当当宅配、AMAZON=亚 马逊物流、DBWL=德邦物流、DBKD=德邦快递、DBKY=德邦快运、RRS=日日顺、 OTHER=其他 ，(只传英文编码)
	private String logisticsName;//物流公司名称（包括干线物流公司等）, string (200)
	private String expressCode;//运单号, string (50)
	private String supplierCode;//供应商编码 string (50)
	private String supplierName;//供应商名称 string (200)
	private String transportMode;//送货方式（到仓自提，快递，干线物流、汽运、空运）
	private PickerInfo pickerInfo;
	private SenderInfo senderInfo;
	private ReceiverInfo receiverInfo;
	private String remark;//备注, string (500)
	public String gettotalOrderLines() {
		return totalOrderLines;
	}
	public void settotalOrderLines(String totalOrderLines) {
		this.totalOrderLines = totalOrderLines;
	}
	public String getdeliveryOrderCode() {
		return deliveryOrderCode;
	}
	public void setdeliveryOrderCode(String deliveryOrderCode) {
		this.deliveryOrderCode = deliveryOrderCode;
	}
	public String gettargetEntryOrderCode() {
		return targetEntryOrderCode;
	}
	public void settargetEntryOrderCode(String targetEntryOrderCode) {
		this.targetEntryOrderCode = targetEntryOrderCode;
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
	public String getwarehouseCode() {
		return warehouseCode;
	}
	public void setwarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getwarehouseName() {
		return warehouseName;
	}
	public void setwarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public String gettargetWarehouseCode() {
		return targetWarehouseCode;
	}
	public void settargetWarehouseCode(String targetWarehouseCode) {
		this.targetWarehouseCode = targetWarehouseCode;
	}
	public String gettargetWarehouseName() {
		return targetWarehouseName;
	}
	public void settargetWarehouseName(String targetWarehouseName) {
		this.targetWarehouseName = targetWarehouseName;
	}
	public String getownerCode() {
		return ownerCode;
	}
	public void setownerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}
	public String getcreateTime() {
		return createTime;
	}
	public void setcreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getscheduleDate() {
		return scheduleDate;
	}
	public void setscheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public String getshippingTime() {
		return shippingTime;
	}
	public void setshippingTime(String shippingTime) {
		this.shippingTime = shippingTime;
	}
	public String getreceivingTime() {
		return receivingTime;
	}
	public void setreceivingTime(String receivingTime) {
		this.receivingTime = receivingTime;
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
	public String gettransportMode() {
		return transportMode;
	}
	public void settransportMode(String transportMode) {
		this.transportMode = transportMode;
	}
	public PickerInfo getPickerInfo() {
		return pickerInfo;
	}
	public void setPickerInfo(PickerInfo pickerInfo) {
		this.pickerInfo = pickerInfo;
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

}