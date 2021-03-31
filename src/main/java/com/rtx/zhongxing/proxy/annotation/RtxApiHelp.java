package com.rtx.zhongxing.proxy.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 加在接口中将为接口生成一个代理类并注册在spring容器中
 * @author ltt
 *
 */
@Target({ ElementType.PACKAGE, ElementType.TYPE ,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RtxApiHelp {

}
