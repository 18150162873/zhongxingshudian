package com.rtx.zhongxing.mybatis.entity.receipt;

import java.util.List;

import com.rtx.zhongxing.annotation.mybatisHelp.RTXMybatisTableHelp;

@RTXMybatisTableHelp(tablename = "api_receipt")
public class MidReceiptEntity extends ReceiptEntity{
	
	private String batchid;
	private String editflag;
	private String msg;
	private List<MidReceiptDetailEntity> detail;

	public String getBatchid() {
		return batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}

	public List<MidReceiptDetailEntity> getDetail() {
		return detail;
	}

	public void setDetail(List<MidReceiptDetailEntity> detail) {
		this.detail = detail;
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
