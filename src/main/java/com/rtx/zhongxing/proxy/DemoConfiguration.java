package com.rtx.zhongxing.proxy;

import org.springframework.context.annotation.Bean;

//@Configuration
public class DemoConfiguration {

	@Bean
    public ProxyRegister proxyRegister() {
        return new ProxyRegister("com.rtx.zhongxing.service");
    }
}
