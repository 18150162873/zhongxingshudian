package com.rtx.zhongxing.proxy.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.PACKAGE, ElementType.TYPE ,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RtxQMApi {
	
	Class<?> headmapperclass() default Object.class;
	String headmappermethodname();
	
	Class<?> detailmapperclass() default Object.class;
	String detailmappermethodname();
	
	Class<?> ResultClass() default Object.class;
}
