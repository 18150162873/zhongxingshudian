package com.rtx.zhongxing.utils;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.alibaba.druid.pool.DruidDataSource;


public class DataSourceUtils {
	/**
	 * quartz数据源读取
	 * @param configfilename  数据文件名称（优先级 ： jar同级目录>jar同级目录config>项目内部配置）
	 * @return druid数据源
	 * @throws IOException
	 * @throws SQLException
	 */
	public static DataSource setQuartzDatesource(String configfilename)
			throws IOException, SQLException {
		DruidDataSource datasource=new DruidDataSource();
		Properties properties = dataSourceProperties(configfilename);
		datasource.setUrl(properties.getProperty("org.quartz.dataSource.qzDS.URL"));
		datasource.setUsername(properties.getProperty("org.quartz.dataSource.qzDS.user"));
		datasource.setPassword(properties.getProperty("org.quartz.dataSource.qzDS.password"));
		datasource.setDriverClassName(properties.getProperty("org.quartz.dataSource.qzDS.driver"));
		datasource.setInitialSize(Integer.parseInt(properties.getProperty("spring.datasource.initialSize","5")));
		datasource.setMinIdle(Integer.parseInt(properties.getProperty("spring.datasource.minIdle","5")));
		datasource.setMaxActive(Integer.parseInt(properties.getProperty("org.quartz.dataSource.qzDS.maxConnections","20")));
		datasource.setMaxWait(Integer.parseInt(properties.getProperty("spring.datasource.maxWait","30000")));
		datasource.setTimeBetweenEvictionRunsMillis(Integer.parseInt(properties.getProperty("spring.datasource.timeBetweenEvictionRunsMillis","60000")));
		datasource.setMinEvictableIdleTimeMillis(Integer.parseInt(properties.getProperty("spring.datasource.minEvictableIdleTimeMillis","30000")));
		datasource.setValidationQuery(properties.getProperty("spring.datasource.validationQuery","SELECT 1 FROM DUAL"));
		datasource.setTestWhileIdle(Boolean.parseBoolean(properties.getProperty("spring.datasource.testWhileIdle","true")));
		datasource.setTestOnBorrow(Boolean.parseBoolean(properties.getProperty("spring.datasource.testOnBorrow","false")));
		datasource.setTestOnReturn(Boolean.parseBoolean(properties.getProperty("spring.datasource.testOnReturn","false")));
		datasource.setFilters(properties.getProperty("spring.datasource.filters","stat,wall,log4j"));
		datasource.setUseGlobalDataSourceStat(true);
		return datasource;
	}
	
	/**
	 * 数据源读取
	 * @param configfilename  数据文件名称（优先级 ： jar同级目录>jar同级目录config>项目内部配置）
	 * @return druid数据源
	 * @throws IOException
	 * @throws SQLException
	 */
	public static DataSource setDruidDataSource(String configfilename)
			throws IOException, SQLException {
		DruidDataSource datasource=new DruidDataSource();
		Properties properties = dataSourceProperties(configfilename);
		datasource.setUrl(properties.getProperty("spring.datasource.url"));
		datasource.setUsername(properties.getProperty("spring.datasource.username"));
		datasource.setPassword(properties.getProperty("spring.datasource.password"));
		datasource.setDriverClassName(properties.getProperty("spring.datasource.driver-class-name"));
		datasource.setInitialSize(Integer.parseInt(properties.getProperty("spring.datasource.initialSize","5")));
		datasource.setMinIdle(Integer.parseInt(properties.getProperty("spring.datasource.minIdle","5")));
		datasource.setMaxActive(Integer.parseInt(properties.getProperty("spring.datasource.maxActive","20")));
		datasource.setMaxWait(Integer.parseInt(properties.getProperty("spring.datasource.maxWait","30000")));
		datasource.setTimeBetweenEvictionRunsMillis(Integer.parseInt(properties.getProperty("spring.datasource.timeBetweenEvictionRunsMillis","60000")));
		datasource.setMinEvictableIdleTimeMillis(Integer.parseInt(properties.getProperty("spring.datasource.minEvictableIdleTimeMillis","30000")));
		datasource.setValidationQuery(properties.getProperty("spring.datasource.validationQuery","SELECT 1 FROM DUAL"));
		datasource.setTestWhileIdle(Boolean.parseBoolean(properties.getProperty("spring.datasource.testWhileIdle","true")));
		datasource.setTestOnBorrow(Boolean.parseBoolean(properties.getProperty("spring.datasource.testOnBorrow","false")));
		datasource.setTestOnReturn(Boolean.parseBoolean(properties.getProperty("spring.datasource.testOnReturn","false")));
		datasource.setFilters(properties.getProperty("spring.datasource.filters","stat,wall,log4j"));
		datasource.setUseGlobalDataSourceStat(true);
		return datasource;
	}

	/**
	 * 获取配置文件（优先级 ： jar同级目录>jar同级目录config>项目内部配置）
	 * 
	 * @param configfilename  配置文件名
	 * @return 配置类对象
	 * @throws IOException
	 */
	public static Properties dataSourceProperties(String configfilename) throws IOException {
		PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
		// 这里表示从jar同级目录加载
		File file = new File(configfilename); 
		// 如果同级目录没有，则去config下面找
		if (!file.exists()) { 
			file = new File("config/" + configfilename);
		}
		Resource resource = new FileSystemResource(file);
		// config目录下还是找不到，那就直接用classpath下的
		if (!resource.exists()) { 
			resource = new ClassPathResource("/" + configfilename);
		}
		propertiesFactoryBean.setLocation(resource);
		propertiesFactoryBean.afterPropertiesSet();
		return propertiesFactoryBean.getObject();
	}

}
