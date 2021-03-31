package com.rtx.zhongxing.bean;

import io.swagger.annotations.ApiModelProperty;

public class ResultData {

	@ApiModelProperty(value = "请求号",required = true,example = "uuid")
	private String reqcode;

	public String getReqcode() {
		return reqcode;
	}
	public void setReqcode(String reqcode) {
		this.reqcode = reqcode;
	}
}
