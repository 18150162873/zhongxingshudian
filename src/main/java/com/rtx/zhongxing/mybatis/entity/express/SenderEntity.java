package com.rtx.zhongxing.mybatis.entity.express;

public class SenderEntity {

	//寄件人信息
	protected String sendAddr;//详细地址
	protected String sendProvince;//寄件省份
	protected String sendCity;//寄件城市
	protected String sendArea;//寄件区县
	protected String sendMobile;//手机
	protected String sendName;//姓名
	protected String sendPhone;//固定电话
	protected String wmwhseid;//固定电话
	
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
	public String getWmwhseid() {
		return wmwhseid;
	}
	public void setWmwhseid(String wmwhseid) {
		this.wmwhseid = wmwhseid;
	}
}
