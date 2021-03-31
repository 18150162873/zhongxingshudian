package com.rtx.zhongxing.test.codehelp;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;

import com.rtx.zhongxing.mybatis.entity.receipt.ReceiptDetailEntity;

@SuppressWarnings("all")
public class CodeHelp {

	public static void main(String[] args) throws Exception {
//		createDynamicInsertSql(PddStdtemplateEntity.class,"express_pdd_stdtemplates");
		createDynamicInsertSqlByFieldname(ReceiptDetailEntity.class,"API_RECEIPTDETAIL");
	}
	
	public static void createDynamicInsertSqlByFieldname(Class clazz,String tableName) {
		StringBuffer sb = new StringBuffer();
		sb.append("<script> insert into "+tableName+"");
		
		StringBuffer valueSb = new StringBuffer();
		StringBuffer mapperValueSb = new StringBuffer();
		List<Field> fieldArray = new ArrayList<Field>();
		List list1 = Arrays.asList(clazz.getSuperclass().getDeclaredFields());
		List list2 = Arrays.asList(clazz.getDeclaredFields());
		fieldArray.addAll(list1);
		fieldArray.addAll(list2);
		
		sb.append("<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\" >");
		for(Field field:fieldArray) {
			if(List.class.equals(field.getType())) {
				continue;
			}
			if("serialkey".equals(field.getName())) {
				continue;
			}
			String fieldName = field.getName();
			valueSb.append("<if test=\""+fieldName+" != null\" >");
			valueSb.append(field.getName()+",");
			valueSb.append("</if>");
			
			mapperValueSb.append("<if test=\""+fieldName+" != null\" >");
			mapperValueSb.append("#{"+fieldName+"},");
			mapperValueSb.append("</if>");
		}
		sb.append(valueSb);
		sb.append("</trim>");
		
		sb.append("<trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\" >");
		sb.append(mapperValueSb);
		sb.append("</trim> </script> ");
		
		System.out.println(sb.toString());
	}
	
	public static void createDynamicInsertSql(Class clazz,String tableName) throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append("<script> insert into "+tableName+"");
		
		StringBuffer valueSb = new StringBuffer();
		StringBuffer mapperValueSb = new StringBuffer();
		Field[] fieldArray = clazz.getDeclaredFields();
		
		sb.append("<trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\" >");
		for(Field field:fieldArray) {
			if(List.class.equals(field.getType())) {
				continue;
			}
			if("serialkey".equals(field.getName())) {
				continue;
			}
			String fieldName = field.getName();
			valueSb.append("<if test=\""+fieldName+" != null\" >");
			valueSb.append(field.getName()+",");
			valueSb.append("</if>");
			
			mapperValueSb.append("<if test=\""+fieldName+" != null\" >");
			mapperValueSb.append("#{"+fieldName+"},");
			mapperValueSb.append("</if>");
		}
		sb.append(valueSb);
		sb.append("</trim>");
		
		sb.append("<trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\" >");
		sb.append(mapperValueSb);
		sb.append("</trim> </script> ");
		
		System.out.println(sb.toString());
//		OutputStream out = new FileOutputStream(new File("C:\\Users\\ren\\Desktop\\import\\sad.log"));
//		out.write(sb.toString().getBytes());
//		out.close();
	}
}
