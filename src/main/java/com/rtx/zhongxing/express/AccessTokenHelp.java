package com.rtx.zhongxing.express;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.rtx.zhongxing.mybatis.entity.express.AccessTokenEntity;
import com.rtx.zhongxing.mybatis.mapper.express.AccessTokenMapper;

@SuppressWarnings("all")
public class AccessTokenHelp {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	public static String pddAccesstoken;
	public static String jdAccesstoken;
	public static String cNAccesstoken;
	public volatile static boolean pddAccesstokenRefresh;
	public volatile static boolean jdAccesstokenRefresh;
	public volatile static boolean cNAccesstokenRefresh;
	
	private static AccessTokenHelp instance = new AccessTokenHelp(); 
	
	public static AccessTokenHelp getInstance() {
		return instance;
	}
	
	public String resetAccesstoken(AccessTokenMapper mapper,String type) {
		String accesstoken = null;
		if(StringUtils.isEmpty(type)) {
			throw new RuntimeException("获取快递平台accesstoken类型不能为空!");
		}
		
		switch (type) {
		case "PDD":
			if(pddAccesstokenRefresh || StringUtils.isEmpty(pddAccesstoken)) {
				AccessTokenEntity temp = mapper.queryAccessTokenByType(type);
				if(null==temp) {
					throw new RuntimeException("拼多多accesstoken未在express_accesstoken表中配置！");
				}
				this.pddAccesstoken = temp.getAccesstoken();
				this.pddAccesstokenRefresh = false;
			}
			break;
		case "JD":
			if(jdAccesstokenRefresh || StringUtils.isEmpty(jdAccesstoken)) {
				AccessTokenEntity temp = mapper.queryAccessTokenByType(type);
				if(null==temp) {
					throw new RuntimeException("京东accesstoken未在express_accesstoken表中配置！");
				}
				this.jdAccesstoken = temp.getAccesstoken();
				this.jdAccesstokenRefresh = false;
			}
			break;
		case "CN":
			if(cNAccesstokenRefresh || StringUtils.isEmpty(cNAccesstokenRefresh)) {
				AccessTokenEntity temp = mapper.queryAccessTokenByType(type);
				if(null==temp) {
					throw new RuntimeException("菜鸟accesstoken未在express_accesstoken表中配置！");
				}
				this.cNAccesstoken = temp.getAccesstoken();
				this.cNAccesstokenRefresh = false;
			}
			break;

		default:
			throw new RuntimeException("获取快递平台accesstoken类型不能为空!");
		}
		return null;
	}
	
	
	public synchronized void resetRefresh(String type) {
		if(StringUtils.isEmpty(type)) {
			throw new RuntimeException("重置token类型不能为空!");
		}
		
		switch (type) {
		case "PDD":
				this.pddAccesstokenRefresh = false;
			break;
		case "JD":
				this.jdAccesstokenRefresh = false;
			break;
		case "CN":
				this.cNAccesstokenRefresh = false;
			break;
		default:
			throw new RuntimeException("获取快递平台accesstoken类型不能为空!");
		}
	}
}
