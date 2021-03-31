package com.rtx.zhongxing.aspect;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonInputMessage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdvice;

@ControllerAdvice(basePackages = "com.rtx.zhongxing.controller")
public class RequestAdvice implements RequestBodyAdvice {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean supports(MethodParameter methodParameter, Type targetType,
			Class<? extends HttpMessageConverter<?>> converterType) {
		 boolean b = methodParameter.getParameterAnnotation(RequestBody.class) != null;
		return b;
	}

	@Override
	public HttpInputMessage beforeBodyRead(HttpInputMessage inputMessage, MethodParameter parameter, Type targetType,
			Class<? extends HttpMessageConverter<?>> converterType) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputMessage.getBody()));
		StringBuffer sb = new StringBuffer();
		while(reader.ready()) {
			sb.append(reader.readLine());
		}
		LoggerFactory.getLogger(parameter.getDeclaringClass()).info("{}方法接收请求报文:{}",parameter.getMethod().getName(),sb.toString());
		return new MappingJacksonInputMessage(new ByteArrayInputStream(sb.toString().getBytes()), inputMessage.getHeaders());
	}

	@Override
	public Object afterBodyRead(Object body, HttpInputMessage inputMessage, MethodParameter parameter, Type targetType,
			Class<? extends HttpMessageConverter<?>> converterType) {
		try {
			Optional<Field> fieldOptional =  Arrays.asList(body.getClass().getDeclaredFields()).stream().filter(entity->"reqcode".equals(entity.getName())).findFirst();
			if(fieldOptional.isPresent()) {
				Field reqcode = fieldOptional.get();
				reqcode.setAccessible(true);
				
				reqcode.setAccessible(false);
			}
		} catch (Exception e) {
			log.error("",e);
		}
		return body;
	}

	@Override
	public Object handleEmptyBody(Object body, HttpInputMessage inputMessage, MethodParameter parameter,
			Type targetType, Class<? extends HttpMessageConverter<?>> converterType) {
		return null;
	}

}
