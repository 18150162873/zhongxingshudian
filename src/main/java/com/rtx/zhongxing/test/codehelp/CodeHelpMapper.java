package com.rtx.zhongxing.test.codehelp;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CodeHelpMapper {

	@Select("select column_name,data_type from user_tab_cols where table_name =#{tableName}")
	List<TableMetadata> queryByTableName(@Param("tableName")String tableName);
}
