package com.rtx.zhongxing.proxy.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.RUNTIME)
public @interface RtxApis {

	Class<?> primary();
	
	String primaryMethodName();
	
	Class<?> sub();
	
	String subMethodName();
}
