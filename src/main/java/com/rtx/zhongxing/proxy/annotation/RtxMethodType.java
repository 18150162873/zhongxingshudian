package com.rtx.zhongxing.proxy.annotation;

public enum RtxMethodType {

	//更新状态方法
	UPDATESTATUS(),
	//写入中间表方法
	ADDTOMID(),
	/**
	 * 利郎wms与wcs接口数据交互转发数据并记录日志通用实现
	 */
	LILANGWCSCOMMON(),
	//奇门
	QM(),
	//无代理方法
	NOPROXY();
	
}
