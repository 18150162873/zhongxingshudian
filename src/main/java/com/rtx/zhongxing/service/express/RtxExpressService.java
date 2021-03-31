package com.rtx.zhongxing.service.express;

import java.util.List;

import com.rtx.zhongxing.mybatis.entity.express.ParameterEntity;

public interface RtxExpressService {

	List<ParameterEntity> queryFromOrders();
}
