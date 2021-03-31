package com.rtx.zhongxing.annotation.mybatisHelp;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RTXMybatisTableHelp {

	/**
	 * 字段名称
	 * @return
	 */
	String tablename();
}
