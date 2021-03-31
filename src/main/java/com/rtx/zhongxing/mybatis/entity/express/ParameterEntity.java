package com.rtx.zhongxing.mybatis.entity.express;

public class ParameterEntity{

	private String externorderkey;//外部单号
	private String carriercode;//承运商代码
	private String wmwhseid;//仓库id
	
	//收件人信息
	private String receiverAddr;//详细地址
	private String receiverProvince;//收件省份
	private String receiverCity;//收件城市
	private String receiverArea;//收件区县
	private String receiverMobile;//手机
	private String receiverName;//姓名
	private String receiverPhone;//固定电话
	
	//拼多多字段
	private String orderchannelstype;//订单来源
	
	//京东平台字段 (顺丰付款方式)
	private String payMethod;
	//京东平台字段 (快件产品类别1.顺丰次日   2.顺丰隔日)
	private String expressType;
	
	private SenderEntity sender;
	
	public String getExternorderkey() {
		return externorderkey;
	}
	public void setExternorderkey(String externorderkey) {
		this.externorderkey = externorderkey;
	}
	public String getCarriercode() {
		return carriercode;
	}
	public void setCarriercode(String carriercode) {
		this.carriercode = carriercode;
	}
	public String getReceiverAddr() {
		return receiverAddr;
	}
	public void setReceiverAddr(String receiverAddr) {
		this.receiverAddr = receiverAddr;
	}
	public String getReceiverProvince() {
		return receiverProvince;
	}
	public void setReceiverProvince(String receiverProvince) {
		this.receiverProvince = receiverProvince;
	}
	public String getReceiverCity() {
		return receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}
	public String getReceiverArea() {
		return receiverArea;
	}
	public void setReceiverArea(String receiverArea) {
		this.receiverArea = receiverArea;
	}
	public String getReceiverMobile() {
		return receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public String getWmwhseid() {
		return wmwhseid;
	}
	public void setWmwhseid(String wmwhseid) {
		this.wmwhseid = wmwhseid;
	}
	public SenderEntity getSender() {
		return sender;
	}
	public void setSender(SenderEntity sender) {
		this.sender = sender;
	}
	public String getOrderchannelstype() {
		return orderchannelstype;
	}
	public void setOrderchannelstype(String orderchannelstype) {
		this.orderchannelstype = orderchannelstype;
	}
	public String getPayMethod() {
		return payMethod;
	}
	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}
	public String getExpressType() {
		return expressType;
	}
	public void setExpressType(String expressType) {
		this.expressType = expressType;
	}
}
