package com.rtx.zhongxing.proxy;

import java.lang.reflect.Proxy;

import org.springframework.beans.factory.FactoryBean;

@SuppressWarnings("all")
public class RtxProxyFactoryBean<T> implements FactoryBean<T> {

	private Class<T> interfaces;
	
	public RtxProxyFactoryBean(Class<T> interfaces) {
        this.interfaces = interfaces;
    }
	
	@Override
    @SuppressWarnings("unchecked")
    public T getObject() throws Exception {
        return (T) Proxy.newProxyInstance(interfaces.getClassLoader(), new Class[]{interfaces}, new RtxProxy(interfaces));
    }

    @Override
    public Class<?> getObjectType() {
        return interfaces;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
	
}
