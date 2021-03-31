package com.rtx.zhongxing.mybatis.mapper.express;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.rtx.zhongxing.mybatis.entity.express.SenderEntity;

@Mapper
public interface SenderMapper {

	/**
	 * 根据仓库获取发货地址等信息
	 * @param wmwhseid
	 * @return
	 */
	@Select("select sendaddr,sendprovince,sendcity,sendarea,sendmobile,sendname,sendphone from express_send where wmwhseid =#{wmwhseid}")
	SenderEntity querySenderByWmwhseid(@Param("wmwhseid")String wmwhseid);
}
