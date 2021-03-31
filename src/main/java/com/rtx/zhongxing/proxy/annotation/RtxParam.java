package com.rtx.zhongxing.proxy.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.rtx.zhongxing.proxy.parameter.RtxParameterType;

@Documented
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RtxParam {

	String value() default "";
	
	int limitLength() default 0;
	
	RtxParameterType type();
	
	boolean isArray() default false;
	
	boolean Transient() default false;
	
	boolean primary() default false;
	
	boolean sub() default false;
}
