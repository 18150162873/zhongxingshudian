package com.rtx.zhongxing.service.wms.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtx.zhongxing.annotation.DataSourceAnnotation;
import com.rtx.zhongxing.mybatis.entity.orders.MidOrderDetailEntity;
import com.rtx.zhongxing.mybatis.entity.orders.MidOrderEntity;
import com.rtx.zhongxing.mybatis.entity.orders.OrderDetailEntity;
import com.rtx.zhongxing.mybatis.entity.orders.OrderEntity;
import com.rtx.zhongxing.mybatis.mapper.orders.OrderMapper;
import com.rtx.zhongxing.service.wms.CommonService;
import com.rtx.zhongxing.service.wms.OrderService;

@SuppressWarnings("all")
@Service
public class OrderServiceImpl implements OrderService{
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	OrderMapper mapper;
	
	@Autowired
	CommonService commonService;

	@DataSourceAnnotation
	@Override
	public List<MidOrderEntity> queryMidOrder(String datasourcekey) {
		List<MidOrderEntity> list = mapper.queryMidOrder(new MidOrderEntity());
		for(MidOrderEntity entity:list) {
			MidOrderDetailEntity querycondition = new MidOrderDetailEntity();
			querycondition.setBatchid(entity.getBatchid());
			List<MidOrderDetailEntity> detais = mapper.queryMidOrderDetail(querycondition);
		}
		return list;
	}
	
	/**
	 * 将中间表数据映射到wms
	 * @param wmsOrder
	 * @return
	 */
	public OrderEntity midMapp(MidOrderEntity wmsOrder) {
		OrderEntity entity = new OrderEntity();
		
		return entity;
	}
	
	@Transactional
	@DataSourceAnnotation
	@Override
	public void addToWMS(String datasource, OrderEntity wmsOrder) {
		int existsByExternOrder = mapper.existsByExternOrderkey(wmsOrder.getExternorderkey());
		if(existsByExternOrder > 0) {
			throw new RuntimeException("入库单已存在");
		}
		
		String Orderkey = commonService.getKey(datasource, "orders");
		wmsOrder.setWhseid(datasource);
		wmsOrder.setOrderkey(Orderkey);
		mapper.addOrder(wmsOrder);
		int linenumber = 1;
		for(OrderDetailEntity detail:wmsOrder.getDetails()) {
			detail.setOrderkey(Orderkey);
			detail.setOrderlinenumber(String.format("%05d", linenumber++));
			mapper.addOrderDetail(detail);
		}
	}

	@Override
	public void updOrderStatus(String datasource, MidOrderEntity midorder, String msg) {
		String status ="";
		String notNullMsg = Optional.ofNullable(msg).orElse("");
		String msgUseable = notNullMsg.length()>499?notNullMsg.substring(0,490):notNullMsg;
		
		if("OK".equals(msg)) {
			status ="S";
		}else {
			status ="F";
		}
		
		MidOrderEntity midentity = new MidOrderEntity();
		midentity.setEditflag(status);
		midentity.setMsg(msgUseable);
		midentity.setSerialkey(midorder.getSerialkey());
		mapper.updStatus(midentity);
	}

}
