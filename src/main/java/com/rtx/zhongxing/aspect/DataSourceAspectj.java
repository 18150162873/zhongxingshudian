package com.rtx.zhongxing.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import com.rtx.zhongxing.utils.MultipleDataSource;


/**
 * 自定义切面
 * 
 * @project rtx_xstep_api
 * @author wujunming
 * @data 2018年3月28日下午2:56:53
 */
@Component
@Aspect
public class DataSourceAspectj implements Ordered {

	
	/**
	 * 在方法之前织入数据源切换
	 * @param point
	 * @throws Throwable
	 */
	@Before("execution(@com.rtx.zhongxing.annotation.DataSourceAnnotation * *(..))")
	public void dataSourceExchange(JoinPoint point) throws Throwable {
		MultipleDataSource.setDataSourceKey(point.getArgs()[0] + "");
	}
	
	@After("execution(@com.rtx.zhongxing.annotation.DataSourceAnnotation * *(..))")
	public void dataSourCeclear(JoinPoint point) throws Throwable {
		MultipleDataSource.ClearDataSourceKey();;
	}
	

	@Override
	public int getOrder() {
		return -1;
	}

}
