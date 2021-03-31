package com.rtx.zhongxing.proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.util.StringUtils;

public class ProxyRegister implements BeanDefinitionRegistryPostProcessor {

	private String basePackage;

	public ProxyRegister(String basePackage) {
		this.basePackage = basePackage;
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		if (StringUtils.isEmpty(basePackage)) {
			return;
		}
		ServiceInterfacesScanner scanner = new ServiceInterfacesScanner(registry);
		String[] basePackages = basePackage.split(",");
		for(String temppackage:basePackages) {
			scanner.doScan(temppackage);
		}
//		scanner.doScan(basePackage);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

	}
}
