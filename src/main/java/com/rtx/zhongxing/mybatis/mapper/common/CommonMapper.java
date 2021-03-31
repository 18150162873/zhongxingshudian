package com.rtx.zhongxing.mybatis.mapper.common;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CommonMapper {

	@Select("select count(1) from ncounter where keyname = #{tablename}")
	int existByTableName(@Param("tablename")String tablename);
	
	@Insert("insert into ncounter (keyname, keycount) values (#{tablename}, 1)")
	int addNcounter(@Param("tablename")String tableName);
	
	@Update("update ncounter set keycount = keycount + 1 where keyname = #{tablename}")
	int updNcounter(@Param("tablename")String tableName);
	
	@Select("select lpad(keycount,10,'0') from ncounter where keyname = #{tablename}")
	String queryKey(@Param("tablename")String tableName);
}
