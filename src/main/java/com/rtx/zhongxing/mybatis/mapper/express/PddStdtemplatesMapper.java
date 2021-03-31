package com.rtx.zhongxing.mybatis.mapper.express;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.rtx.zhongxing.mybatis.entity.express.PddStdtemplateEntity;

@Mapper
public interface PddStdtemplatesMapper {

	/**
	 * 添加模板
	 * @return
	 */
	@Insert("<script> insert into express_pdd_stdtemplates<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\" ><if test=\"standardTemplateName != null\" >standardTemplateName,</if><if test=\"standardTemplateUrl != null\" >standardTemplateUrl,</if><if test=\"standardWaybillType != null\" >standardWaybillType,</if><if test=\"standardTemplateId != null\" >standardTemplateId,</if><if test=\"wpCode != null\" >wpCode,</if></trim><trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\" ><if test=\"standardTemplateName != null\" >#{standardTemplateName},</if><if test=\"standardTemplateUrl != null\" >#{standardTemplateUrl},</if><if test=\"standardWaybillType != null\" >#{standardWaybillType},</if><if test=\"standardTemplateId != null\" >#{standardTemplateId},</if><if test=\"wpCode != null\" >#{wpCode},</if></trim> </script>")
	int addStdtemplate(PddStdtemplateEntity stdtemplates);
	
	/**
	   * 获取模板
	 * @param wp_code
	 * @return
	 */
	@Select("select * from express_pdd_stdtemplates where wpcode=#{wpcode} and rownum=1")
	PddStdtemplateEntity queryStdtemplateByCode(@Param("wpcode")String wpcode);
}
