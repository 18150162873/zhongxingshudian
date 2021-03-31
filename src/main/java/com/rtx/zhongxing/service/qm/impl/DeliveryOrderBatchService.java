package com.rtx.zhongxing.service.qm.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.rtx.zhongxing.annotation.DataSourceAnnotation;
import com.rtx.zhongxing.bean.qm.RtxQMResponse;
import com.rtx.zhongxing.bean.qm.batchdeliveryorder.DeliveryOrderBatchDTO;
import com.rtx.zhongxing.bean.qm.batchdeliveryorder.Order;
import com.rtx.zhongxing.mybatis.entity.orders.MidOrderDetailEntity;
import com.rtx.zhongxing.mybatis.entity.orders.MidOrderEntity;
import com.rtx.zhongxing.mybatis.mapper.orders.OrderMapper;
import com.rtx.zhongxing.service.qm.QMDataDown;
import com.rtx.zhongxing.utils.JaxbObjectAndXmlUtil;

@SuppressWarnings("all")
@Service(value = "batchDeliveryorder")
public class DeliveryOrderBatchService implements QMDataDown{
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	OrderMapper orderMapper;

	@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRES_NEW)
	@DataSourceAnnotation
	@Override
	public RtxQMResponse handelApiToWms(String datasourcekey,String body) {
		log.info("奇门出库单数据(批量)下发请求报文:{}",body);
		RtxQMResponse response = new RtxQMResponse();
		try {
			//将requestBody中数据转换为对应API的实体类
			DeliveryOrderBatchDTO apiEntity = JaxbObjectAndXmlUtil.xml2Object(body, DeliveryOrderBatchDTO.class);
			//将实体类转换成中间表数据
			List<MidOrderEntity> midList = apiConvertToMidEntity(apiEntity);
			for(MidOrderEntity mid:midList) {
				insertToMid("middle",mid);
			}
		} catch (Exception e) {
			log.error("奇门出库单数据(批量)下发接口异常",e);
			response.setSuccess(e.getMessage());
			throw e;
		}
		log.info("奇门出库单数据(批量)下发响应报文:{}",JSON.toJSONString(response));
		return response;
	}
	
	/**
	 * 映射到中间表
	 * @param entryOrder
	 * @return
	 */
	private List<MidOrderEntity> apiConvertToMidEntity(DeliveryOrderBatchDTO deliveryOrder) {
		List<MidOrderEntity> list = new ArrayList<MidOrderEntity>();
		for(Order order:deliveryOrder.getOrders().getOrder()) {
			MidOrderEntity mid = new MidOrderEntity();
			list.add(mid);
		}
		
		return list;
	}
	
	/**
	 * 保存到中间表
	 * @param datasource
	 * @param midOrder
	 * @return
	 */
	public void insertToMid(String datasource,MidOrderEntity midOrder) {
		String batchid = UUID.randomUUID().toString().replaceAll("-", "");
		for(MidOrderDetailEntity detail:midOrder.getDetail()) {
			detail.setBatchid(batchid);
			orderMapper.addMidOrderDetail(detail);
		}
		midOrder.setBatchid(batchid);
		orderMapper.addMidOrder(midOrder);
	}
}
