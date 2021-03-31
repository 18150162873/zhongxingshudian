package com.rtx.zhongxing.config;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.quartz.Scheduler;
import org.quartz.spi.JobFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * quartz job配置管理类
 * @project  rtx_xstep_api
 * @author   wujunming
 * @data     2018年3月27日下午5:35:19
 */
@Configuration
@EnableScheduling
public class SchedulerConfig implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private ApplicationContext applicationContext;
	
	
	@Bean
	public JobFactory jobFactory() {
		JobBeanJobFactory jobFactory = new JobBeanJobFactory();
		jobFactory.setApplicationContext(applicationContext);
		return jobFactory;
	}
	
	@Bean
	public SchedulerFactoryBean schedulerFactoryBean() throws IOException {
		SchedulerFactoryBean factory = new SchedulerFactoryBean();
		factory.setAutoStartup(true);
		factory.setJobFactory(jobFactory());
		factory.setStartupDelay(3000);
		factory.setQuartzProperties(quartzProperties());
		return factory;
	}

	@Bean
	public Properties quartzProperties() throws IOException {
		PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
		File file = new File("quartz.properties"); // 这里表示从jar同级目录加载
		if (!file.exists()) { // 如果同级目录没有，则去config下面找
			file = new File("config/quartz.properties");
		}
		Resource resource = new FileSystemResource(file);
		if (!resource.exists()) { // config目录下还是找不到，那就直接用classpath下的
			resource = new ClassPathResource("/quartz.properties");
		}
		propertiesFactoryBean.setLocation(resource);
		// propertiesFactoryBean.setLocation(new ClassPathResource("/quartz.properties"));
		propertiesFactoryBean.afterPropertiesSet();
		return propertiesFactoryBean.getObject();
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		try {
			Scheduler sc = schedulerFactoryBean().getScheduler();
			sc.start();
			System.out.println("SynchronizedData job  start...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
