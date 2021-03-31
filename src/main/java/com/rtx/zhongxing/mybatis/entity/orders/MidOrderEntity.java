package com.rtx.zhongxing.mybatis.entity.orders;

import java.util.List;

import com.rtx.zhongxing.annotation.mybatisHelp.RTXMybatisTableHelp;

@RTXMybatisTableHelp(tablename = "api_orders")
public class MidOrderEntity extends OrderEntity{
	
	private String batchid;
	private String rtxapitype;
	private String editflag;
	private String msg;
	
	private List<MidOrderDetailEntity> detail;

	public String getBatchid() {
		return batchid;
	}
	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}
	public List<MidOrderDetailEntity> getDetail() {
		return detail;
	}
	public void setDetail(List<MidOrderDetailEntity> detail) {
		this.detail = detail;
	}
	public String getRtxapitype() {
		return rtxapitype;
	}
	public void setRtxapitype(String rtxapitype) {
		this.rtxapitype = rtxapitype;
	}
	public String getEditflag() {
		return editflag;
	}
	public void setEditflag(String editflag) {
		this.editflag = editflag;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
