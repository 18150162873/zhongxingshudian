package com.rtx.zhongxing.service.wms;

import java.util.List;

import com.rtx.zhongxing.mybatis.entity.orders.MidOrderEntity;
import com.rtx.zhongxing.mybatis.entity.orders.OrderEntity;

/**
 * 假如此接口在RtxapiConfiguration配置的目录下,并且类上有@RtxApiHelp注解
 * 此接口将被扫描 RtxProxyFactoryBean将为此接口生成一个代理,并注册到spring 容器当中
 */
//@RtxApiHelp
public interface OrderService{
	
	/**
	 * 获取将要写入wms的数据
	 * @return
	 */
//	@RtxQueryFormMid(
//			mapperclass = OrderMapper.class,
//			headmethodname = "queryMidOrder",
//			detailmethodname = "queryMidOrderDetail"
//			)
	List<MidOrderEntity> queryMidOrder(String datasourcekey);
	
	/**
	 * 将中间表数据映射到wms业务表
	 * @param wmsOrder
	 * @return
	 */
	OrderEntity midMapp(MidOrderEntity wmsOrder);
	
	/**
	 * 将中间表数据写入wms
	 * @return
	 */
	void addToWMS(String datasource, OrderEntity wmsOrder) ;
	
	/**
	 * 更新中间表状态
	 * @return
	 */
	void updOrderStatus(String datasource, MidOrderEntity Order, String msg);
}
