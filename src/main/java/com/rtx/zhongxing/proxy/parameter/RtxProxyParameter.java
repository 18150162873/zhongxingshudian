package com.rtx.zhongxing.proxy.parameter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RtxProxyParameter {

	private boolean multipleMapper;
	private List<Map<String,Object>> primaryParameter;
	private List<Map<String,Object>> subParameter;
	
	public List<Map<String, Object>> getPrimaryParameter() {
		if(primaryParameter ==null) {
			this.primaryParameter = new ArrayList<Map<String,Object>>();
		}
		return primaryParameter;
	}
	public void setPrimaryParameter(List<Map<String, Object>> primaryParameter) {
		this.primaryParameter = primaryParameter;
	}
	public List<Map<String, Object>> getSubParameter() {
		return subParameter;
	}
	public void setSubParameter(List<Map<String, Object>> subParameter) {
		this.subParameter = subParameter;
	}
	public boolean isMultipleMapper() {
		return multipleMapper;
	}
	public void setMultipleMapper(boolean multipleMapper) {
		this.multipleMapper = multipleMapper;
	}
}
