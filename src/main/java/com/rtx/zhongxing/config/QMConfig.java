package com.rtx.zhongxing.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.fastjson.JSON;


/**
 * 快递配置
 * @author wq
 *
 */
@SuppressWarnings("all")
@Configuration
public class QMConfig {
	
	/**
	 * 初始化配置文件
	 * @param filename
	 * @return
	 * @throws Exception
	 */
	public Properties init(String filename) throws Exception{
		Properties pro = new Properties();
		File file = new File(filename);
		if(!file.exists()){
			file = new File("config/"+filename);
			if(!file.exists()){
				pro.load(new InputStreamReader(QMConfig.class.getClassLoader().getResourceAsStream(filename), "utf-8"));
			}else{
				pro.load(new InputStreamReader(new FileInputStream(file), "utf-8"));
			}
		}else{
			pro.load(new InputStreamReader(new FileInputStream(file), "utf-8"));
		}
		return pro;
	}
	
	@Bean("methodMapping")
	public Map multipleExpress() throws Exception{
		Properties pro = init("methodMapping.properties");
		Map qmConfig = new HashMap<String, String>();
		for(String key:pro.stringPropertyNames()) {
			qmConfig.put(key, pro.get(key));
		}
		return qmConfig;
	}
	
}
