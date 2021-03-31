package com.rtx.zhongxing.config;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.quartz.SpringBeanJobFactory;
import org.springframework.stereotype.Component;

/**
 * spring 自定义组件 （把Job交给Spring来管理，这样Job就能使用由Spring产生的Bean）
 * @project  rtx_xstep_api
 * @author   wujunming
 * @data     2018年3月27日下午5:34:05
 */
@Component
public class JobBeanJobFactory extends SpringBeanJobFactory implements ApplicationContextAware {

    private ApplicationContext applicationContext;  
    
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {  
        this.applicationContext = applicationContext;  
    }  
  
    @Override  
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {  
        Object jobInstance = super.createJobInstance(bundle);   
        applicationContext.getAutowireCapableBeanFactory().autowireBean(jobInstance);  
        return jobInstance;  
    }  
}
