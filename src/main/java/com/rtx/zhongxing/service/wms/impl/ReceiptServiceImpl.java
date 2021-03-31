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
import com.rtx.zhongxing.mybatis.entity.receipt.MidReceiptDetailEntity;
import com.rtx.zhongxing.mybatis.entity.receipt.MidReceiptEntity;
import com.rtx.zhongxing.mybatis.entity.receipt.ReceiptDetailEntity;
import com.rtx.zhongxing.mybatis.entity.receipt.ReceiptEntity;
import com.rtx.zhongxing.mybatis.mapper.receipt.ReceiptMapper;
import com.rtx.zhongxing.service.wms.CommonService;
import com.rtx.zhongxing.service.wms.ReceiptService;

@SuppressWarnings("all")
@Service
public class ReceiptServiceImpl implements ReceiptService{
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ReceiptMapper mapper;
	
	@Autowired
	CommonService commonService;

	@DataSourceAnnotation
	@Override
	public List<MidReceiptEntity> queryMidReceipt(String datasourcekey) {
		List<MidReceiptEntity> list = mapper.queryMidReceipt(new MidReceiptEntity());
		for(MidReceiptEntity entity:list) {
			MidReceiptDetailEntity querydition = new MidReceiptDetailEntity();
			querydition.setBatchid(entity.getBatchid());
			List<MidReceiptDetailEntity> detais = mapper.queryMidReceiptDetail(querydition);
		}
		return list;
	}
	
	/**
	 * 将中间表数据映射到wms
	 * @param wmsReceipt
	 * @return
	 */
	public ReceiptEntity midMapp(MidReceiptEntity wmsReceipt) {
		ReceiptEntity entity = new ReceiptEntity();
		
		return entity;
	}
	
	@Transactional
	@DataSourceAnnotation
	@Override
	public void addToWMS(String datasource, ReceiptEntity wmsReceipt) {
		int existsByExternreceipt = mapper.existsByExternreceiptkey(wmsReceipt.getExternreceiptkey());
		if(existsByExternreceipt > 0) {
			throw new RuntimeException("入库单已存在");
		}
		
		String receiptkey = commonService.getKey(datasource, "receipt");
		wmsReceipt.setWhseid(datasource);
		wmsReceipt.setReceiptkey(receiptkey);
		mapper.addReceipt(wmsReceipt);
		int linenumber = 1;
		for(ReceiptDetailEntity detail:wmsReceipt.getDetails()) {
			detail.setReceiptkey(receiptkey);
			detail.setReceiptlinenumber(String.format("%05d", linenumber++));
			mapper.addReceiptDetail(detail);
		}
	}

	@Override
	public void updMidReceiptStatus(String datasource, MidReceiptEntity receipt, String msg) {
		String status ="";
		String notNullMsg = Optional.ofNullable(msg).orElse("");
		String msgUseable = notNullMsg.length()>499?notNullMsg.substring(0,490):notNullMsg;
		
		if("OK".equals(msg)) {
			status ="S";
		}else {
			status ="F";
		}
		
		MidReceiptEntity entity = new MidReceiptEntity();
		entity.setEditflag(status);
		entity.setMsg(msgUseable);
		entity.setSerialkey(receipt.getSerialkey());
		mapper.updMidStatus(entity);
	}

}
