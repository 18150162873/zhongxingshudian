package com.rtx.zhongxing.mybatis.entity.express;

import com.rtx.zhongxing.annotation.mybatisHelp.RTXMybatisTableHelp;

@RTXMybatisTableHelp(tablename = "orders")
public class ResultEntity {
	
	private String externorderkey;//wms外部单号
	private String waybillno;//运单号
	
	public String getExternorderkey() {
		return externorderkey;
	}
	public void setExternorderkey(String externorderkey) {
		this.externorderkey = externorderkey;
	}
	public String getWaybillno() {
		return waybillno;
	}
	public void setWaybillno(String waybillno) {
		this.waybillno = waybillno;
	}
}
