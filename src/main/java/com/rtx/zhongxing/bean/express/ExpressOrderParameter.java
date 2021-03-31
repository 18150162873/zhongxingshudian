package com.rtx.zhongxing.bean.express;

public class ExpressOrderParameter {

	protected String externorderkey;//外部单号
	protected String carriercode;//承运商代码
	
	//寄件人信息
	protected String sendAddr="详细地址";//详细地址
	protected String sendProvince="寄件省份";//寄件省份
	protected String sendCity="寄件城市";//寄件城市
	protected String sendArea="寄件区县";//寄件区县
	protected String sendMobile="手机";//手机
	protected String sendName="姓名";//姓名
	protected String sendPhone="固定电话";//固定电话
	
	//收件人信息
	protected String receiverAddr;//详细地址
	protected String receiverProvince;//收件省份
	protected String receiverCity;//收件城市
	protected String receiverArea;//收件区县
	protected String receiverMobile;//手机
	protected String receiverName;//姓名
	protected String receiverPhone;//固定电话
	
	
	
	public ExpressOrderParameter(String externorderkey) {
		super();
		this.externorderkey = externorderkey;
	}
	
	public ExpressOrderParameter() {
		super();
	}


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
	public String getSendAddr() {
		return sendAddr;
	}
	public void setSendAddr(String sendAddr) {
		this.sendAddr = sendAddr;
	}
	public String getSendProvince() {
		return sendProvince;
	}
	public void setSendProvince(String sendProvince) {
		this.sendProvince = sendProvince;
	}
	public String getSendCity() {
		return sendCity;
	}
	public void setSendCity(String sendCity) {
		this.sendCity = sendCity;
	}
	public String getSendArea() {
		return sendArea;
	}
	public void setSendArea(String sendArea) {
		this.sendArea = sendArea;
	}
	public String getSendMobile() {
		return sendMobile;
	}
	public void setSendMobile(String sendMobile) {
		this.sendMobile = sendMobile;
	}
	public String getSendName() {
		return sendName;
	}
	public void setSendName(String sendName) {
		this.sendName = sendName;
	}
	public String getSendPhone() {
		return sendPhone;
	}
	public void setSendPhone(String sendPhone) {
		this.sendPhone = sendPhone;
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
}
