package com.rtx.zhongxing.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rtx.zhongxing.proxy.handle.RtxProxyHandel;

@SuppressWarnings("all")
public class RtxProxy<T> extends RtxApplicationContextHolder implements InvocationHandler{
	
	Logger log = LoggerFactory.getLogger(RtxProxy.class);

	private Class<T> interfaces;

	RtxProxy(Class<T> interfaces) {
        this.interfaces = interfaces;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    	
    	if (method.getDeclaringClass().equals(interfaces)) {
    		RtxProxyHandel rtxProxyHandel = new RtxProxyHandel(this.context);
    		Object returnObject = rtxProxyHandel.handelProxyMethod(method, interfaces,args);
    		return returnObject;
    	} else {
    		return method.invoke(proxy, args);
    	}
    }
    
}
