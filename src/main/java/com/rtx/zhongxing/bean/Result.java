package com.rtx.zhongxing.bean;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModelProperty;

public class Result {
	
	@JSONField(serialize = false)
	@ApiModelProperty(hidden = true)
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 状态码0—成功；1—失败
	 */
	@ApiModelProperty(value = "状态码0—成功；1—失败",required = true,example = "0")
	private String errcode="";
	@ApiModelProperty(value = "消息",required = true,example = "调用报错返回的具体消息;无错误时字段为空")
	private String errmsg="";
	private ResultData data=new ResultData();
	
	
	
	public Result() {
		super();
	}
	
	
	public Result(Object object) {
		super();
		Optional<Field> fieldtemp = Arrays.asList(object.getClass().getDeclaredFields()).stream().filter(field->"reqcode".equals(field.getName().toLowerCase())).findFirst();
		if(fieldtemp.isPresent()) {
			fieldtemp.get().setAccessible(true);
			ResultData data = new ResultData();
			try {
				if(null == this.data) {
					data.setReqcode(fieldtemp.get().get(object)+"");
					this.data = data;
				}else {
					this.data.setReqcode(fieldtemp.get().get(object)+"");
				}
			} catch (Exception e) {
				log.error("",e);
			}
		}
	}


	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public ResultData getData() {
		return data;
	}
	public void setData(ResultData data) {
		this.data = data;
	}
	
	
}
