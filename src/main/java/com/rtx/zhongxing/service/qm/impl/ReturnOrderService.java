package com.rtx.zhongxing.service.qm.impl;

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
import com.rtx.zhongxing.bean.qm.entryorder.EntryOrderResponseDTO;
import com.rtx.zhongxing.bean.qm.returnorder.ReturnOrderDTO;
import com.rtx.zhongxing.mybatis.entity.receipt.MidReceiptDetailEntity;
import com.rtx.zhongxing.mybatis.entity.receipt.MidReceiptEntity;
import com.rtx.zhongxing.mybatis.mapper.receipt.ReceiptMapper;
import com.rtx.zhongxing.service.qm.QMDataDown;
import com.rtx.zhongxing.utils.JaxbObjectAndXmlUtil;

@Service(value = "returnorderCreate")
public class ReturnOrderService implements QMDataDown{
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ReceiptMapper receiptMapper;

	@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRES_NEW)
	@DataSourceAnnotation
	@Override
	public RtxQMResponse handelApiToWms(String datasourcekey,String body) {
		log.info("奇门退货入库下发数据:{}",body);
		EntryOrderResponseDTO response = new EntryOrderResponseDTO();
		try {
			//将requestBody中数据转换为对应API的实体类
			ReturnOrderDTO apiEntity = JaxbObjectAndXmlUtil.xml2Object(body, ReturnOrderDTO.class);
			//将实体类转换成中间表数据
			MidReceiptEntity midReceipt = apiConvertToMidEntity(apiEntity);
			//将数据写入中间表
			String res = insertToMid("middle",midReceipt);
			if("OK".equals(res)) {
				response.setSuccess(res);
			}else {
				response.setFailure(res);
			}
		} catch (Exception e) {
			log.error("entryOrder下发接口异常",e);
			throw e;
		}
		log.info("奇门退货入库下发数据:{}"+JSON.toJSONString(response));
		return response;
	}
	
	private MidReceiptEntity apiConvertToMidEntity(ReturnOrderDTO returnorder) {
		return null;
	}
	
	public String insertToMid(String datasource,MidReceiptEntity receipt) {
		String msg = "OK";
		String batchid = UUID.randomUUID().toString().replaceAll("-", "");
		for(MidReceiptDetailEntity detail:receipt.getDetail()) {
			detail.setBatchid(batchid);
			receiptMapper.addMidReceiptDetail(detail);
		}
		receipt.setBatchid(batchid);
		receiptMapper.addMidReceipt(receipt);

		return msg;
	}
}
