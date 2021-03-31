package com.rtx.zhongxing.service.wms.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rtx.zhongxing.annotation.DataSourceAnnotation;
import com.rtx.zhongxing.mybatis.mapper.common.CommonMapper;
import com.rtx.zhongxing.service.wms.CommonService;

@SuppressWarnings("all")
@Service("commonService")
public class CommonServiceImpl implements CommonService{

	@Autowired
	CommonMapper commonMapper;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@DataSourceAnnotation
	@Override
	public String getKey(String datasource, String tablename) {
		String key = "";
		int existFlag = commonMapper.existByTableName(tablename);
		if(existFlag == 0) {
			commonMapper.addNcounter(tablename)	;
			key = String.format("%010d", 1);
		}else {
			commonMapper.updNcounter(tablename);
			key =commonMapper.queryKey(tablename);
		}
		return key;
	}

}
