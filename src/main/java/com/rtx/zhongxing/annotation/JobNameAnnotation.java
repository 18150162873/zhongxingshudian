package com.rtx.zhongxing.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * job名称注解
 * @project  jnby
 * @author   wujunming
 * @data     2018年3月28日上午10:39:14
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JobNameAnnotation {
	 String value();
}
