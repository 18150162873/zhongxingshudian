package com.rtx.zhongxing.bean.qm.batchdeliveryorder;
import com.rtx.zhongxing.bean.qm.batchdeliveryorder.DeliveryRequirements;
import com.rtx.zhongxing.bean.qm.batchdeliveryorder.SenderInfo;
import com.rtx.zhongxing.bean.qm.batchdeliveryorder.ReceiverInfo;
import com.rtx.zhongxing.bean.qm.batchdeliveryorder.Invoices;
import com.rtx.zhongxing.bean.qm.batchdeliveryorder.Insurance;
public class DeliveryOrder {
	private String deliveryOrderCode;//出库单号, string (50) , 必填
	private String preDeliveryOrderCode;//原出库单号（ERP 分配）, string (50) , 条件必填，条件为 换货出库
	private String preDeliveryOrderId;//原出库单号（WMS 分配）, string (50) , 条件必填，条件为换 货出库
	private String orderType;//出库单类型, string (50) , 必填, JYCK=一般交易出库单, HHCK=换货出库 单, BFCK=补发出库单，QTCK=其他出库单
	private String warehouseCode;//仓库编码, string (50)，必填 ，统仓统配等无需 ERP 指定仓储编码 的情况填 OTHER
	private String orderFlag;//订单标记 ，用字符串格式来表示订单标记列表： 比如 COD, 中间用“^” 来隔开，string (200) ， COD =货到付款 , LIMIT=限时配送 , PRESELL=预售 , COMPLAIN=已投诉 , SPLIT=拆单, EXCHANGE=换货, VISIT=上门 , MODIFYTRANSPORT=是否可改配送方式, 是否可改配送方式 默认可更改 , CONSIGN = 物流宝代理发货, 自动更改发货状态 SELLER_AFFORD =是否卖家承担运费 默认是, 即没 , FENXIAO=分销订单，TCPS=区域零售
	private String sourcePlatformCode;//订单来源平台编码, string (50) , 必填,TB= 淘宝 、TM=天 猫 、JD=京东、DD=当当、PP=拍拍、YX=易讯、EBAY=ebay、QQ=QQ 网购、 AMAZON=亚马逊、SN=苏宁、GM=国美、WPH=唯品会、JM=聚美、LF=乐蜂、 MGJ=蘑菇街、JS=聚尚、PX=拍鞋、YT=银泰、YHD=1 号店、VANCL=凡客、YL=邮 乐、YG=优购、1688=阿里巴巴、POS=POS 门店、MIA=蜜芽、GW=商家官网、CT=村 淘、YJWD=云集微店、PDD=拼多多、OTHERS=其他, (只
	private String sourcePlatformName;//订单来源平台名称, string (200)
	private String createTime;//发货单创建时间, string (19) , YYYY-MM-DD HH:MM:SS, 必填
	private String placeOrderTime;//前台订单 (店铺订单) 创建时间 (下单时间) , string (19) , YYYY-MM-DD HH:MM:SS, 必填
	private String payTime;//订单支付时间, string (19) , YYYY-MM-DD HH:MM:SS
	private String payNo;//支付平台交易号, string(50), 淘系订单传支付宝交易号
	private String serviceCode;//服务编码, string (50)， NCWLJH=集包, 条件必填，条件为集包订单 发货
	private String operatorCode;//操作员 (审核员) 编码, string (50)
	private String operatorName;//操作员 (审核员) 名称, string (50)
	private String operateTime;//操作 (审核) 时间, string (19) , YYYY-MM-DD HH:MM:SS, 必填
	private String shopNick;//店铺名称, string (200) , 必填
	private String sellerNick;//卖家名称, string (200)
	private String buyerNick;//买家昵称, string (200)
	private String totalAmount;//订单总金额 (元) , double (18, 2) , 订单总金额=应收金额+已收金额= 商品总金额-订单折扣金额+快递费用
	private String itemAmount;//商品总金额 (元) , double (18, 2)
	private String discountAmount;//订单折扣金额 (元) , double (18, 2)
	private String freight;//快递费用 (元) , double (18, 2)
	private String arAmount;//应收金额 (元) , 消费者还需要支付多少（货到付款时消费者还需要支付多 少约定使用这个字段）, double (18, 2)
	private String gotAmount;//已收金额 (元) , 消费者已经支付多少, double (18, 2)
	private String serviceFee;//COD 服务费, double (18, 2)
	private String logisticsCode;//物流公司编码, string (50) , SF=顺丰、EMS=标准快递、EYB=经济快 件、ZJS=宅急送、YTO=圆通 、ZTO=中通 (ZTO) 、HTKY=百世汇通、BSKY=百世快 运、UC=优速、STO=申通、TTKDEX=天天快递 、QFKD=全峰、FAST=快捷、POSTB= 邮政小包 、GTO=国通、YUNDA=韵达、JD=京东配送、DD=当当宅配、AMAZON=亚 马逊物流、DBWL=德邦物流、DBKD=德邦快递、DBKY=德邦快运、RRS=日日顺、 OTHER=其他，必填, (只传英文编码)
	private String logisticsName;//物流公司名称, string (200)
	private String expressCode;//运单号, string (50)
	private String logisticsAreaCode;//快递区域编码, 大头笔信息, string (50)
	private DeliveryRequirements deliveryRequirements;
	private SenderInfo senderInfo;
	private ReceiverInfo receiverInfo;
	private String isUrgency;//是否紧急, Y/N, 默认为 N
	private String invoiceFlag;//是否需要发票, Y/N, 默认为 N
	private Invoices invoices;
	private String insuranceFlag;//是否需要保险, Y/N, 默认为 N
	private Insurance insurance;
	private String buyerMessage;//买家留言, string (500)
	private String sellerMessage;//卖家留言, string (500)
	private String remark;//备注，string（500）
	public String getdeliveryOrderCode() {
		return deliveryOrderCode;
	}
	public void setdeliveryOrderCode(String deliveryOrderCode) {
		this.deliveryOrderCode = deliveryOrderCode;
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
	public String getorderType() {
		return orderType;
	}
	public void setorderType(String orderType) {
		this.orderType = orderType;
	}
	public String getwarehouseCode() {
		return warehouseCode;
	}
	public void setwarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getorderFlag() {
		return orderFlag;
	}
	public void setorderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
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
	public String getcreateTime() {
		return createTime;
	}
	public void setcreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getplaceOrderTime() {
		return placeOrderTime;
	}
	public void setplaceOrderTime(String placeOrderTime) {
		this.placeOrderTime = placeOrderTime;
	}
	public String getpayTime() {
		return payTime;
	}
	public void setpayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getpayNo() {
		return payNo;
	}
	public void setpayNo(String payNo) {
		this.payNo = payNo;
	}
	public String getserviceCode() {
		return serviceCode;
	}
	public void setserviceCode(String serviceCode) {
		this.serviceCode = serviceCode;
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
	public String getbuyerNick() {
		return buyerNick;
	}
	public void setbuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	public String gettotalAmount() {
		return totalAmount;
	}
	public void settotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getitemAmount() {
		return itemAmount;
	}
	public void setitemAmount(String itemAmount) {
		this.itemAmount = itemAmount;
	}
	public String getdiscountAmount() {
		return discountAmount;
	}
	public void setdiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getfreight() {
		return freight;
	}
	public void setfreight(String freight) {
		this.freight = freight;
	}
	public String getarAmount() {
		return arAmount;
	}
	public void setarAmount(String arAmount) {
		this.arAmount = arAmount;
	}
	public String getgotAmount() {
		return gotAmount;
	}
	public void setgotAmount(String gotAmount) {
		this.gotAmount = gotAmount;
	}
	public String getserviceFee() {
		return serviceFee;
	}
	public void setserviceFee(String serviceFee) {
		this.serviceFee = serviceFee;
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
	public String getlogisticsAreaCode() {
		return logisticsAreaCode;
	}
	public void setlogisticsAreaCode(String logisticsAreaCode) {
		this.logisticsAreaCode = logisticsAreaCode;
	}
	public DeliveryRequirements getDeliveryRequirements() {
		return deliveryRequirements;
	}
	public void setDeliveryRequirements(DeliveryRequirements deliveryRequirements) {
		this.deliveryRequirements = deliveryRequirements;
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
	public String getisUrgency() {
		return isUrgency;
	}
	public void setisUrgency(String isUrgency) {
		this.isUrgency = isUrgency;
	}
	public String getinvoiceFlag() {
		return invoiceFlag;
	}
	public void setinvoiceFlag(String invoiceFlag) {
		this.invoiceFlag = invoiceFlag;
	}
	public Invoices getInvoices() {
		return invoices;
	}
	public void setInvoices(Invoices invoices) {
		this.invoices = invoices;
	}
	public String getinsuranceFlag() {
		return insuranceFlag;
	}
	public void setinsuranceFlag(String insuranceFlag) {
		this.insuranceFlag = insuranceFlag;
	}
	public Insurance getInsurance() {
		return insurance;
	}
	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	public String getbuyerMessage() {
		return buyerMessage;
	}
	public void setbuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}
	public String getsellerMessage() {
		return sellerMessage;
	}
	public void setsellerMessage(String sellerMessage) {
		this.sellerMessage = sellerMessage;
	}
	public String getremark() {
		return remark;
	}
	public void setremark(String remark) {
		this.remark = remark;
	}

}