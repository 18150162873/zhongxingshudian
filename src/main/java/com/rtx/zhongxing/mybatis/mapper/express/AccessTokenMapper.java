package com.rtx.zhongxing.mybatis.mapper.express;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.rtx.zhongxing.mybatis.entity.express.AccessTokenEntity;

@Mapper
public interface AccessTokenMapper {

	/**
	 * 
	 * @param type
	 * @return
	 */
	@Select("select accesstoken from express_accesstoken where type =#{type}")
	AccessTokenEntity queryAccessTokenByType(@Param("type")String type);
}
