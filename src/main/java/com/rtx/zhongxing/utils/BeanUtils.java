package com.rtx.zhongxing.utils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class BeanUtils {

	/**
	 *复制相同属性名称的值
	 *如果目标属性类型是List实现类 如果目标属性有定义泛型,则新建泛型类对象,将源属性对象中属性值拷贝到新建泛型类对象中
	 * @param source
	 * @param target
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static void copyProperties(Object source,Object target){
		List<Field> sourceFieldList = Arrays.asList(source.getClass().getDeclaredFields());
		List<Field> targetFieldList = Arrays.asList(target.getClass().getDeclaredFields());
		
		try {
			Map targetMap = new HashMap();
			for(Field field:sourceFieldList) {
				field.setAccessible(true);
				String key = field.getName()+field.getType().hashCode();
				targetMap.put(key, field.get(source));
			}

			for(Field field:targetFieldList) {
				if(targetMap.containsKey(field.getName()+field.getType().hashCode())) {
					field.setAccessible(true);
					Object value = targetMap.get(field.getName()+field.getType().hashCode());
					if(null !=value) {
						if(field.getType().equals(List.class)) {
							copyListValue(value,field,target);
						}else {
							field.set(target, value);
						}
					}
				};
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void copyProperties(List sourceList,List targetList,Class targetClazz) throws Exception {
		if(null==targetList) {
			Class targetClass = targetList.getClass();
			if(targetClass.isInterface()) {
				targetList = new ArrayList();
			}else {
				targetList = (List) targetClass.newInstance();
			}
		}
		
		for(Object source:sourceList) {
			Object object = targetClazz.newInstance();
			copyProperties(source,object);
			targetList.add(object);
		}
	}
	
	private static void copyListValue(Object source,Field targetField,Object targetObject) throws Exception {
		Class targetGenericClazz = null;
		Type genericType = targetField.getGenericType(); 
		if(genericType != null) {
			// 如果是泛型参数的类型   
			if(genericType instanceof ParameterizedType){   
				ParameterizedType pt = (ParameterizedType) genericType;
				//得到泛型里的class类型
				targetGenericClazz = (Class<?>)pt.getActualTypeArguments()[0]; 
			} 
		}; 
		
		if(targetGenericClazz == null) {
			targetField.set(targetObject, source);
		}else {
			Class targetClass = targetField.getType();
			List targetList = null;
			if(targetClass.isInterface()) {
				targetList = new ArrayList();
			}else {
				targetList = (List) targetClass.newInstance();
			}
			
			List sourceList = (List)source;
			for(Object sourceEntity:sourceList) {
				Object newTargetObject = targetGenericClazz.newInstance();
				copyProperties(sourceEntity,newTargetObject);
				targetList.add(newTargetObject);
			}
			targetField.set(targetObject, targetList);
		}
	}
	
	public static void main(String[] args) {
		copyProperties(new ArrayList(),new ArrayList<String>());
	}
}
