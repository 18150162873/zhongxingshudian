package com.rtx.zhongxing.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 注解触发器名称
 * @project  jnby
 * @author   wujunming
 * @data     2018年3月28日上午10:39:44
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TriggerNameAnnotation {
	String value();
}
