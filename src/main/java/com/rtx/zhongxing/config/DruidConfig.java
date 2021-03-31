package com.rtx.zhongxing.config;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rtx.zhongxing.utils.DataSourceUtils;
import com.rtx.zhongxing.utils.MultipleDataSource;

@Configuration
public class DruidConfig {
	
    @Value("${spring.security.user.name}")
    private String username;

    @Value("${spring.security.user.password}")
    private String password;

    @Value("${spring.datasource.logSlowSql}")
    private String logSlowSql;

    @Value("${rtx.datasource.name}")
    private String [] dataPeoperties;
    
    

    /**
     * 配置多数据源
     * @return
     * @throws IOException
     * @throws SQLException
     */
    public MultipleDataSource setMultipleDataSource() throws IOException, SQLException {
    	MultipleDataSource dataSource=new MultipleDataSource();
    	Map<Object,Object> map=new HashMap<>();
    	dataSource.setDefaultTargetDataSource(DataSourceUtils.setDruidDataSource("wmwhse1.properties"));
    	for (String pro : dataPeoperties) {
        	System.out.println("***********************************************************");
        	System.out.println("加载数据源===="+pro);
        	System.out.println("***********************************************************");
    		map.put(pro, DataSourceUtils.setDruidDataSource(pro+".properties"));
		}
    	dataSource.setTargetDataSources(map);
    	return dataSource;
    }
    
    @Bean
    public DataSource druidDataSource() {
        try {
			return setMultipleDataSource();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return null;
    }
}
