package com.rtx.zhongxing.mybatis.mapper;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.rtx.zhongxing.annotation.mybatisHelp.RTXMybatisTableHelp;
import com.rtx.zhongxing.annotation.mybatisHelp.RtxMybatisQueryCondition;
import com.rtx.zhongxing.annotation.mybatisHelp.RtxMybatisUpdateColumn;

@SuppressWarnings("all")
public class SqlProvider {
	
	Logger log = LoggerFactory.getLogger(this.getClass());

	public String insert(Object entity) {
		StringBuffer insertsql = new StringBuffer();
		List<String> columns =new ArrayList<String>();
		List<String> values =new ArrayList<String>();
		
		try {
			Class clazz = entity.getClass();
			List<Field> fieldArray = new ArrayList<Field>();
			List list1 = Arrays.asList(clazz.getSuperclass().getDeclaredFields());
			List list2 = Arrays.asList(clazz.getDeclaredFields());
			fieldArray.addAll(list1);
			fieldArray.addAll(list2);
			
			RTXMybatisTableHelp tableNameHelp = (RTXMybatisTableHelp) clazz.getDeclaredAnnotation(RTXMybatisTableHelp.class);
			String tableName =tableNameHelp.tablename();
			
			for(Field field:fieldArray) {
				field.setAccessible(true);
				Object value = field.get(entity);
				if(value == null) {
					continue;
				}
				if(value instanceof List) {
					continue;
				}
				
				String valueStr = "";
				if(Date.class.equals(field.getType())) {
					String dateStr = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(field.get(entity));
					valueStr = "to_date('"+dateStr+"','yyyy-mm-dd hh:mi:ss')";
				}else {
					valueStr =(field.get(entity)+"").replaceAll("'", "");
				}
				columns.add(field.getName());
				
				values.add("'"+valueStr+"'");
			}
			
			insertsql.append("insert into "+tableName);
			insertsql.append("("+columns.stream().collect(Collectors.joining(","))+")");
			insertsql.append(" values ");
			insertsql.append("("+values.stream().collect(Collectors.joining(","))+")");
			log.debug("{}插入sql:{}",tableName,insertsql.toString());
		} catch (Exception e) {
			log.error("生成insert语句异常",e);
		}

		return insertsql.toString();
	}
	
	public String queryByCondition(Object entity) {
		StringBuffer querysql = new StringBuffer();
		List<String> columns =new ArrayList<String>();
		List<String> querycondition =new ArrayList<String>();
		
		try {
			Class clazz = entity.getClass();
			List<Field> fieldArray = new ArrayList<Field>();
			List list1 = Arrays.asList(clazz.getSuperclass().getDeclaredFields());
			List list2 = Arrays.asList(clazz.getDeclaredFields());
			fieldArray.addAll(list1);
			fieldArray.addAll(list2);
			
			RTXMybatisTableHelp tableNameHelp = (RTXMybatisTableHelp) clazz.getDeclaredAnnotation(RTXMybatisTableHelp.class);
			String tableName = tableNameHelp.tablename();
			
			for(Field field:fieldArray) {
				field.setAccessible(true);
				Object value = field.get(entity);
				
				columns.add(field.getName());
				
				RtxMybatisQueryCondition querydition = field.getDeclaredAnnotation(RtxMybatisQueryCondition.class);
				if(querydition !=null) {
					String defaultvalue = "";
					if(StringUtils.isEmpty(querydition.queryDefaultValue())) {
						defaultvalue = querydition.queryDefaultValue();
					}else {
						defaultvalue = field.get(entity)+"";
					}
					querycondition.add(defaultvalue);
					querycondition.add(field.getName()+"='"+defaultvalue+"'");
				}
			}
			querysql.append("select ");
			querysql.append(columns.stream().collect(Collectors.joining(",")));
			querysql.append(" from "+tableName+" ");
			for(int i =0;i<querycondition.size();i++) {
				if(i==0) {
					querysql.append(" where ");
				}else {
					querysql.append(" and ");
				}
				querysql.append(querycondition.get(i));
			}
			log.debug("{}查询sql:{}",tableName,querysql.toString());
		} catch (Exception e) {
			log.error("生成查询语句异常",e);
		}

		return querysql.toString();
	}
	
	
	public String updStatusSql(Object entity) {
		StringBuffer updsql = new StringBuffer();
		List<String> updColumns =new ArrayList<String>();
		List<String> conditionColumns =new ArrayList<String>();
		
		try {
			Class clazz = entity.getClass();
			List<Field> fieldArray = new ArrayList<Field>();
			List list1 = Arrays.asList(clazz.getSuperclass().getDeclaredFields());
			List list2 = Arrays.asList(clazz.getDeclaredFields());
			fieldArray.addAll(list1);
			fieldArray.addAll(list2);
			
			RTXMybatisTableHelp tableNameHelp = (RTXMybatisTableHelp) clazz.getDeclaredAnnotation(RTXMybatisTableHelp.class);
			String tableName = tableNameHelp.tablename();
			
			for(Field field:fieldArray) {
				field.setAccessible(true);
				RtxMybatisUpdateColumn UpdateColumn= field.getDeclaredAnnotation(RtxMybatisUpdateColumn.class);
				updColumns.add(field.getName()+"='"+field.get(entity)+"'");
				conditionColumns.add(field.getName()+"='"+field.get(entity)+"'");
			}
			updsql.append("update "+tableName+" ");
			updsql.append("set ");
			updsql.append(" "+updColumns.stream().collect(Collectors.joining(","))+" ");
			for(int i =0;i<conditionColumns.size();i++) {
				if(i==0) {
					updsql.append(" where ");
				}else {
					updsql.append(" and ");
				}
				updsql.append(conditionColumns.get(i));
			}
			log.debug("{}修改sql:{}",tableName,updsql.toString());
		} catch (Exception e) {
			log.error("生成查询语句异常",e);
		}

		return updsql.toString();
	}
}
