package com.rtx.zhongxing.bean.qm;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class RtxQMResponse {

	protected String flag;//success|failure
	protected String code;//响应码
	protected String message;//响应信息
	
	public void setSuccess(String msg) {
		this.flag="success";
		this.code="0";
		this.message=msg;
	};
	
	public void setFailure(String msg) {
		this.flag="failure";
		this.code="50";
		this.message=msg;
	};
	
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
