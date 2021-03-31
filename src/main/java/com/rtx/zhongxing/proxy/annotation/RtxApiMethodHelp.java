package com.rtx.zhongxing.proxy.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.PACKAGE, ElementType.TYPE ,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RtxApiMethodHelp {

	RtxMethodType methodType() default RtxMethodType.NOPROXY;
	
	Class<?> mapperclass() default Object.class;
	
	String methodname() default "";
	
	Class<?> primary() default Object.class;
	
	String primaryMethodName() default "";
	
	Class<?> sub() default Object.class;
	
	String subMethodName() default "";
	
	String requesturl() default "";
}
