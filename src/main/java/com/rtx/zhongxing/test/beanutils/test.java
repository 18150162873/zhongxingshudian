package com.rtx.zhongxing.test.beanutils;


import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class test {

	public static void main(String[] args) {
		Object bo = new Object();
		for(Field field:bo.getClass().getDeclaredFields()) {
			if(field.getType().equals(List.class)) {
				Type genericType = field.getGenericType();
				if(genericType==null) {
					continue;
				}
				if(genericType instanceof ParameterizedType) {
					ParameterizedType pt = (ParameterizedType) genericType;
					Class<?> genericClazz = (Class<?>)pt.getActualTypeArguments()[0];
					System.out.println(genericClazz.getName());
				}
			};
		}
	}
	
	
}
