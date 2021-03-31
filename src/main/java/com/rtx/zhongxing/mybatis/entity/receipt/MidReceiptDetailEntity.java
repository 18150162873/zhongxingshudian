package com.rtx.zhongxing.mybatis.entity.receipt;

import com.rtx.zhongxing.annotation.mybatisHelp.RTXMybatisTableHelp;

@RTXMybatisTableHelp(tablename = "api_receiptdetail")
public class MidReceiptDetailEntity extends ReceiptDetailEntity{

	private String batchid;

	public String getBatchid() {
		return batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}
}
