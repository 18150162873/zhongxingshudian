package com.rtx.zhongxing.proxy.handle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.rtx.zhongxing.proxy.annotation.RtxQMApi;
import com.rtx.zhongxing.proxy.annotation.RtxQueryFormMid;

@SuppressWarnings("all")
public class RtxProxyHandel{

	protected ApplicationContext context;

	public RtxProxyHandel(ApplicationContext context) {
		super();
		this.context = context;
	}

	public RtxProxyHandel() {
		super();
	}
	
	public Object handelProxyMethod(Method proxyMethod,Class<?> interfaces, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Object returnObject = null;
		Object serverImpl = null;

		//获取spring容器中实现该接口的所有实例
		Map<String,Object> map = (Map<String, Object>) this.context.getBeansOfType(interfaces);
		for(String key:map.keySet()) {
			Object impl = map.get(key);
			if(impl.getClass().isAnnotationPresent(Service.class)) {
				serverImpl = impl;
				break;
			}
			//该类不止实现一个接口且接口列表中无被代理接口认为该实例为spring生成的动态代理实现类
			if(impl.getClass().getInterfaces().length!=1 && !Arrays.asList(impl.getClass().getInterfaces()).contains(interfaces)) {
				serverImpl = impl;
				break;
			}
		}
		
		RtxQMApi rtxqmapi = proxyMethod.getAnnotation(RtxQMApi.class);
		RtxQueryFormMid queryFormMid = proxyMethod.getAnnotation(RtxQueryFormMid.class);
		
		if(null != rtxqmapi) {
//			RTXLiLangProxyCommon liLangProxyCommon = new RTXLiLangProxyCommon(context);
//			returnObject = liLangProxyCommon.handleCommonMethod(proxyMethod,args);
		}else if(null != queryFormMid){
			
		}else {
			if(serverImpl ==null) {
				throw new RuntimeException("代理方法"+proxyMethod.getName()+"无实现方法");
			}
			returnObject = proxyMethod.invoke(serverImpl, args);
		}
		return returnObject;
	}
}
