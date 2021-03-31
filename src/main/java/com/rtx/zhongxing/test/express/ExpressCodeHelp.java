package com.rtx.zhongxing.test.express;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.rtx.zhongxing.annotation.mybatisHelp.RTXMybatisTableHelp;
import com.rtx.zhongxing.annotation.mybatisHelp.RtxMybatisQueryCondition;
import com.rtx.zhongxing.mybatis.entity.express.ResultEntity;

@SuppressWarnings("all")
public class ExpressCodeHelp {

	public static void main(String[] args) {
//		createMyBatisUpdateSql(ResultEntity.class);
//		createMyBatisInsertSql(ResultEntity.class);
	}
	
//	public static void createMyBatisUpdateSql(Class clazz) {
//		RTXMybatisTableHelp table = (RTXMybatisTableHelp) clazz.getAnnotation(RTXMybatisTableHelp.class);
//		List<Field> conditions = new ArrayList<Field>();
//		StringBuffer sb = new StringBuffer();
//		StringBuffer sb1 = new StringBuffer();
//		sb.append("<script>  update "+table.tablename()+"");
//		sb1.append("<script>  update "+table.tablename()+"\r\n");
//		sb.append("<set >");
//		sb1.append("<set >"+"\r\n");
//		for(Field field:clazz.getDeclaredFields()) {
//			if(null == field.getAnnotation(RtxMybatisColumnHelp.class)) {
//				continue;
//			}
//			if(field.getAnnotation(RtxMybatisColumnHelp.class).updCondition()) {
//				conditions.add(field);
//			};
//			String fieldname = field.getName();
//			String columnname = field.getName();
//			if(!StringUtils.isEmpty(field.getAnnotation(RtxMybatisColumnHelp.class).columnname())) {
//				columnname = field.getAnnotation(RtxMybatisColumnHelp.class).columnname();
//			}
//			sb.append("<if test=\""+fieldname+" != null\" > "+columnname+" = #{"+fieldname+",jdbcType=VARCHAR}, </if>");
//			sb1.append("<if test=\""+fieldname+" != null\" > "+columnname+" = #{"+fieldname+",jdbcType=VARCHAR}, </if>"+"\r\n");
//			
//		}
//		sb.append("</set>");
//		sb1.append("</set>"+"\r\n");
//		for(int i=0;i<conditions.size();i++) {
//			Field field =conditions.get(i); 
//			String fieldname = field.getName();
//			String columnname = field.getName();
//			if(!StringUtils.isEmpty(field.getAnnotation(RtxMybatisColumnHelp.class).columnname())) {
//				columnname = field.getAnnotation(RtxMybatisColumnHelp.class).columnname();
//			}
//			
//			if(i!=0) {
//				sb.append(" and ");
//				sb1.append(" and "+"\r\n");
//			}else {
//				sb.append("where ");
//				sb1.append("where "+"\r\n");
//			}
//			sb.append(" "+columnname+" =#{"+fieldname+"} ");
//			sb1.append(" "+columnname+" =#{"+fieldname+"} "+"\r\n");
//		}
//		System.out.println(sb1.toString());
//	}
	
//	public static void createMyBatisInsertSql(Class clazz) {
//		RTXMybatisTableHelp table = (RTXMybatisTableHelp) clazz.getAnnotation(RTXMybatisTableHelp.class);
//		
//		StringBuffer sb = new StringBuffer();
//		sb.append("<script> insert into "+table.tablename()+"");
//		
//		StringBuffer valueSb = new StringBuffer();
//		StringBuffer mapperValueSb = new StringBuffer();
//		Field[] fieldArray = clazz.getDeclaredFields();
//		
//		sb.append("<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\" >");
//		for(Field field:fieldArray) {
//			if(List.class.equals(field.getType())) {
//				continue;
//			}
//			if("serialkey".equals(field.getName())) {
//				continue;
//			}
//			String fieldName = field.getName();
//			RtxMybatisColumnHelp columnHelp = field.getAnnotation(RtxMybatisColumnHelp.class);
//			if(columnHelp!=null&&StringUtils.isEmpty(columnHelp.columnname())) {
//				fieldName = columnHelp.columnname();
//			}
//			valueSb.append("<if test=\""+fieldName+" != null\" >");
//			valueSb.append(field.getName()+",");
//			valueSb.append("</if>");
//			
//			mapperValueSb.append("<if test=\""+fieldName+" != null\" >");
//			mapperValueSb.append("#{"+fieldName+"},");
//			mapperValueSb.append("</if>");
//		}
//		sb.append(valueSb);
//		sb.append("</trim>");
//		
//		sb.append("<trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\" >");
//		sb.append(mapperValueSb);
//		sb.append("</trim> </script> ");
//		
//		System.out.println(sb.toString());
//	}
}
