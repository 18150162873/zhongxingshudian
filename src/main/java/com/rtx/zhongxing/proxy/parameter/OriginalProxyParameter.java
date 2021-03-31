package com.rtx.zhongxing.proxy.parameter;

import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.rtx.zhongxing.proxy.annotation.RtxParam;

@SuppressWarnings("all")
public class OriginalProxyParameter {

	private String type;
	private List<Map<String,Object>> originalParameter = new ArrayList<Map<String,Object>>();
	
	private Parameter parameter;
	private Object parameterValue;

	public OriginalProxyParameter(Parameter parameter, Object parameterValue) throws Exception {
		super();
		this.parameter = parameter;
		this.parameterValue = parameterValue;
		this.originalParameterMapping();
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Map<String, Object>> getOriginalParameter() {
		return originalParameter;
	}
	public void setOriginalParameter(List<Map<String, Object>> originalParameter) {
		this.originalParameter = originalParameter;
	}
	
	public Parameter getParameter() {
		return parameter;
	}

	public void setParameter(Parameter parameter) {
		this.parameter = parameter;
	}

	private void originalParameterMapping() throws Exception {
		//注解标识
		boolean isparamMapping = parameter.isAnnotationPresent(RtxParam.class);
		//不带RtxParam注解不进行映射
		if(!isparamMapping) {
			return;
		}

		//判断是否为可以直接映射类型
		String parameterType = isBasetype(parameter);

		switch (parameterType) {
		case "base":
			Map paramMapping = new HashMap();
			baseTypeMapping(parameter,parameterValue,paramMapping);
			originalParameter.add(paramMapping);
			break;
		case "array":
			Object[] objarray = (Object[]) parameterValue;
			for(Object temp:objarray) {
				Map tempMapping = new HashMap();
				objectTypeMapping(temp,tempMapping);
				originalParameter.add(tempMapping);
			}
			break;
		case "list":
			List list = (List)parameterValue;
			for(Object temp:list) {
				Map tempMapping = new HashMap();
				objectTypeMapping(temp,tempMapping);
				originalParameter.add(tempMapping);
			}
			break;
		case "object":
			Map tempMapping = new HashMap();
			objectTypeMapping(parameterValue,tempMapping);
			originalParameter.add(tempMapping);
			break;
		default:
			break;
		}

		//标记入参类型
		RtxParam rtxParam = parameter.getAnnotation(RtxParam.class);
		String proxyParameterType = "common";
		if(rtxParam.primary()) {
			proxyParameterType = "primary";
		}
		if(rtxParam.sub()) {
			proxyParameterType = "sub";
		}
		this.type=proxyParameterType;
	}

	//判断是否为可以直接映射类型
	//String Date char lang double int short float byte为直接映射类型
	private String isBasetype(Parameter parameter) {
		String type ="";
		Class<?> paramType = parameter.getType();
		List<Class> baseList =Arrays.asList(String.class,Date.class,Char.class,char.class,Long.class,long.class,Double.class,double.class,Integer.class,int.class,Short.class,short.class,Float.class,float.class,Byte.class,byte.class);
		if(baseList.contains(paramType)) {
			type = "base";
		}else if(paramType.isArray()) {
			type = "array";
		}else if(Arrays.asList(paramType.getInterfaces()).contains(List.class)) {
			type = "list";
		}else {
			type = "object";
		}
		return type;
	}

	private void objectTypeMapping(Object object,Map map) throws Exception {
		for(Field field:object.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			Object value = field.get(object);
			baseTypeMapping(field,value,map);
		}
	}

	//基础类型值映射
	private void baseTypeMapping(Object rtxParamSource,Object mappingValue,Map map) {

		RtxParam rtxParam = rtxParamSource.getClass().getAnnotation(RtxParam.class);
		if(rtxParam != null) {
			if(rtxParam.Transient()) {
				return;
			}
		}

		//获取映射名称
		String mappingName = mappingNameHandel(rtxParamSource,rtxParam);
		//处理映射值
		mappingValue = mappingValueHandel(rtxParamSource,rtxParam,mappingValue);

		map.put(mappingName, mappingValue);
	}

	//来源于参数直接取参数中注解处理
	//来源于类属性取如注解有值取注解中的值没值取属性名
	private String mappingNameHandel(Object rtxParamSource,RtxParam rtxParam) {
		String mappingName = "";
		if(Parameter.class.equals(rtxParamSource.getClass())) {
			mappingName = rtxParam.value();
		}else if(Field.class.equals(rtxParamSource.getClass())){
			Field field = (Field)rtxParamSource;
			mappingName = field.getName();
		}
		return mappingName;
	}

	//RtxParam.limitLength 最大字符串长度
	private Object mappingValueHandel(Object rtxParamSource,RtxParam rtxParam,Object mappingValue) {

		if(String.class.equals(mappingValue.getClass())) {
			int limitLength =  rtxParam.limitLength();
			if(limitLength > 1) {
				String mappingValueStr = String.valueOf(mappingValue);
				mappingValue = mappingValueStr.length()>limitLength?mappingValueStr.subSequence(0, limitLength-1):mappingValueStr;
			}
		}
		return mappingValue;
	}
}
