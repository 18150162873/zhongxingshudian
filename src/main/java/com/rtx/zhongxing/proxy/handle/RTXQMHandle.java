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
public class RTXQMHandle {

	protected ApplicationContext context;

	Logger LOG = LoggerFactory.getLogger(this.getClass());

	public RTXQMHandle(ApplicationContext context) {
		super();
		this.context = context;
	}

	public RTXQMHandle() {
		super();
	}



	Object handleQMAPI(Method proxyMethod,Object[] args) {
		Object keyValue = "";
		Object log = null;
		try {
			String uuid = UUID.randomUUID().toString();
			Object requstBodyEntity = null;
			String datasourcekey = "";
			Parameter[] parameters = proxyMethod.getParameters();
			for(int i=0 ;i<parameters.length;i++) {
				if(null !=parameters[i].getAnnotation(RequestBody.class)) {
					requstBodyEntity = args[i];
				}
				if(null !=parameters[i].getAnnotation(RtxDataSourcekey.class)) {
					datasourcekey = args[i]+"";
				}
			}
			
			
			
		} catch (Exception e) {
			LOG.error("",e);
		}
		return null;
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
