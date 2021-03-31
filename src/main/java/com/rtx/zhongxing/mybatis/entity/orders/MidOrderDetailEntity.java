package com.rtx.zhongxing.mybatis.entity.orders;

import com.rtx.zhongxing.annotation.mybatisHelp.RTXMybatisTableHelp;

@RTXMybatisTableHelp(tablename = "api_orderdetail")
public class MidOrderDetailEntity extends OrderDetailEntity{

	private String batchid;

	public String getBatchid() {
		return batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}
}
