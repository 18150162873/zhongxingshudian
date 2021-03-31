package com.rtx.zhongxing.service.wms;

import java.util.List;

import com.rtx.zhongxing.mybatis.entity.receipt.MidReceiptEntity;
import com.rtx.zhongxing.mybatis.entity.receipt.ReceiptEntity;
import com.rtx.zhongxing.mybatis.mapper.receipt.ReceiptMapper;
import com.rtx.zhongxing.proxy.annotation.RtxApiHelp;
import com.rtx.zhongxing.proxy.annotation.RtxQueryFormMid;

/**
 * 假如此接口在RtxapiConfiguration配置的目录下,并且类上有@RtxApiHelp注解
 * 此接口将被扫描 RtxProxyFactoryBean将为此接口生成一个代理,并注册到spring 容器当中
 */
//@RtxApiHelp
public interface ReceiptService{
	
	/**
	 * 获取将要写入wms的数据
	 * @return
	 */
//	@RtxQueryFormMid(
//			mapperclass = ReceiptMapper.class,
//			headmethodname = "queryMidReceipt",
//			detailmethodname = "queryMidReceiptDetail"
//			)
	List<MidReceiptEntity> queryMidReceipt(String datasourcekey);
	
	/**
	 * 将中间表数据映射到wms业务表
	 * @param wmsReceipt
	 * @return
	 */
	ReceiptEntity midMapp(MidReceiptEntity wmsReceipt);
	
	/**
	 * 将中间表数据写入wms
	 * @return
	 */
	void addToWMS(String datasource, ReceiptEntity wmsReceipt) ;
	
	/**
	 * 更新中间表状态
	 * @return
	 */
	void updMidReceiptStatus(String datasource, MidReceiptEntity receipt, String msg);
}
