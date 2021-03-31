package com.rtx.zhongxing.mybatis.mapper.express;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.rtx.zhongxing.mybatis.entity.express.ParameterEntity;
import com.rtx.zhongxing.mybatis.entity.express.ResultEntity;

/**
 * 映射
 * ParameterEntity
 * ResultEntity
 * @author 
 *
 */
@Mapper
public interface OrderExpressMapper {

	/**
	 * 获取待取快递单号的订单
	 * @return
	 */
	@Select("select * from orders")
	ParameterEntity queryOrderParameter();
	
	/**
	 * 更新状态以及更新 快递单号字段
	 * @return
	 */
	@Insert("")
	int updOrderStatus();
}
