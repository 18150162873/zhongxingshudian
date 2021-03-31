package com.rtx.zhongxing.proxy.handle;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;

import com.rtx.zhongxing.proxy.annotation.RtxDataSourcekey;
import com.rtx.zhongxing.proxy.annotation.RtxQueryFormMid;
import com.rtx.zhongxing.utils.MultipleDataSource;


/**
 * @author ltt
 *
 */
@SuppressWarnings("all")
public class RTXQueryFormMidHandel {

	protected ApplicationContext context;

	Logger LOG = LoggerFactory.getLogger(this.getClass());

	public RTXQueryFormMidHandel(ApplicationContext context) {
		super();
		this.context = context;
	}

	public RTXQueryFormMidHandel() {
		super();
	}



	Object handleQueryFormMid(Method proxyMethod,Object[] args) {
		Object keyValue = "";
		Object log = null;
		List headList = null;
		try {
			String datasourcekey = "";
			Parameter[] parameters = proxyMethod.getParameters();
			for(int i=0 ;i<parameters.length;i++) {
				if(null !=parameters[i].getAnnotation(RtxDataSourcekey.class)) {
					datasourcekey = args[i]+"";
				}
			}
			MultipleDataSource.setDataSourceKey(datasourcekey);
			
			RtxQueryFormMid queryFormMid = proxyMethod.getDeclaredAnnotation(RtxQueryFormMid.class);
			
			Class mapperClass = queryFormMid.mapperclass();
			String calssname = mapperClass.getName().split("\\.")[mapperClass.getName().split("\\.").length-1];
			String springbeanname = calssname.substring(0, 1).toLowerCase()+ calssname.substring(1);
			Object mapperProxy = this.context.getBean(springbeanname);
			
			MultipleDataSource.setDataSourceKey(datasourcekey);
			String headmethodname = queryFormMid.headmethodname();
			String detailmethodname = queryFormMid.detailmethodname();
			
			Method[] methods = mapperClass.getDeclaredMethods();
			
			Method headmethod=null;
			Method detailmethod=null;
			for(Method tempmethod:methods) {
				if(tempmethod.getName().endsWith(headmethodname)) {
					headmethod =tempmethod;
				};
				if(tempmethod.getName().endsWith(headmethodname)) {
					detailmethod =tempmethod;
				};
			}
			
			String associationkeyname = queryFormMid.associationkeyname();
			
			headList = (List) headmethod.invoke(mapperProxy);
			for(Object head:headList) {
				Object associationkey = getFieldValueByFieldName(head,associationkeyname);
				List detaiList = (List) detailmethod.invoke(mapperProxy, associationkey);
			}
			
		} catch (Exception e) {
			LOG.error("获取中间表数据异常",e);
		}
		return headList;
	}
	
	List<Field> getAllField(Object object){
		List<Field> list = new ArrayList<Field>();
		list.addAll(Arrays.asList(object.getClass().getDeclaredFields()));
		list.addAll(Arrays.asList(object.getClass().getSuperclass().getDeclaredFields()));
		return list;
	}
	
	private void setFieldValueByFieldName(Object object,String fieldname,Object value) {
		try {
			List<Field> fields =getAllField(object);
			for(Field field:fields) {
				if(fieldname.equals(field.getName())) {
					field.setAccessible(true);
					field.set(object, value);
					break;
				}
			}
		} catch (Exception e) {
			LOG.error("",e);
		}
	}
	
	private Object getFieldValueByFieldName(Object object,String fieldname) {
		Object value = null;
		try {
			List<Field> fields =getAllField(object);
			for(Field field:fields) {
				if(fieldname.equals(field.getName())) {
					field.setAccessible(true);
					value = field.get(object);
					break;
				}
			}
		} catch (Exception e) {
			LOG.error("",e);
		}
		return value;
	}
	
}
