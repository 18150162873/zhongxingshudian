package com.rtx.zhongxing.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.alibaba.fastjson.JSON;

@ControllerAdvice(basePackages = "com.rtx.zhongxing.controller")
public class ResponseAdvice implements ResponseBodyAdvice{
	
	Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean supports(MethodParameter returnType, Class converterType) {
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
		LoggerFactory.getLogger(returnType.getDeclaringClass()).info("{}响应报文:{}",returnType.getMethod().getName(),JSON.toJSONString(body));
		return body;
	}

}
