package com.rtx.zhongxing.config;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.quartz.utils.ConnectionProvider;

import com.alibaba.druid.pool.DruidDataSource;
import com.rtx.zhongxing.utils.DataSourceUtils;

/**
 * 配置quartz连接池
 * @author wq
 *
 */
public class DruidConnectionProvider implements ConnectionProvider{
	
    //JDBC驱动
    public String driver;
    //JDBC连接串
    public String URL;
    //数据库用户名
    public String user;
    //数据库用户密码
    public String password;
    //数据库最大连接数
    public int maxConnections;

	private DruidDataSource dataSource;
	
	@Override
	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	@Override
	public void initialize() throws SQLException {
		Properties properties = null;
		dataSource = new DruidDataSource();
		try {
			properties = DataSourceUtils.dataSourceProperties("quartz.properties");
		} catch (Exception e) {
			e.printStackTrace();
			throw new SQLException("未找到定时任务配置文件");
		}
		dataSource.setUrl(properties.getProperty("org.quartz.dataSource.qzDS.URL"));
		dataSource.setUsername(properties.getProperty("org.quartz.dataSource.qzDS.user"));
		dataSource.setPassword(properties.getProperty("org.quartz.dataSource.qzDS.password"));
		dataSource.setDriverClassName(properties.getProperty("org.quartz.dataSource.qzDS.driver"));
		dataSource.setInitialSize(Integer.parseInt(properties.getProperty("spring.datasource.initialSize","5")));
		dataSource.setMinIdle(Integer.parseInt(properties.getProperty("spring.datasource.minIdle","5")));
		dataSource.setMaxActive(Integer.parseInt(properties.getProperty("org.quartz.dataSource.qzDS.maxConnections","20")));
		dataSource.setMaxWait(Integer.parseInt(properties.getProperty("spring.datasource.maxWait","30000")));
		dataSource.setTimeBetweenEvictionRunsMillis(Integer.parseInt(properties.getProperty("spring.datasource.timeBetweenEvictionRunsMillis","60000")));
		dataSource.setMinEvictableIdleTimeMillis(Integer.parseInt(properties.getProperty("spring.datasource.minEvictableIdleTimeMillis","30000")));
		dataSource.setValidationQuery(properties.getProperty("spring.datasource.validationQuery","SELECT 1 FROM DUAL"));
		dataSource.setTestWhileIdle(Boolean.parseBoolean(properties.getProperty("spring.datasource.testWhileIdle","true")));
		dataSource.setTestOnBorrow(Boolean.parseBoolean(properties.getProperty("spring.datasource.testOnBorrow","false")));
		dataSource.setTestOnReturn(Boolean.parseBoolean(properties.getProperty("spring.datasource.testOnReturn","false")));
		dataSource.setFilters(properties.getProperty("spring.datasource.filters","stat,wall,log4j"));
		dataSource.setUseGlobalDataSourceStat(true);
	}

	@Override
	public void shutdown() throws SQLException {
		dataSource.close();
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMaxConnections() {
		return maxConnections;
	}

	public void setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
	}

}
