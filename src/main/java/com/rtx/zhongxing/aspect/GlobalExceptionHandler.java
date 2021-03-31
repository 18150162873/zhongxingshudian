package com.rtx.zhongxing.aspect;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.alibaba.fastjson.JSON;
import com.rtx.zhongxing.bean.Result;

@ControllerAdvice(basePackages = "com.rtx.zhongxing.controller")
public class GlobalExceptionHandler {
	
	Logger log = LoggerFactory.getLogger(this.getClass());

	@ExceptionHandler(Exception.class)
    public Object handleUnProccessableServiceException(Exception e, HttpServletResponse response) throws IOException {
		Result result = new Result();
		result.setErrcode("1");
		result.setErrmsg(e.getMessage());
		response.getOutputStream().write(JSON.toJSONString(result).getBytes());
		response.getOutputStream().flush();
		log.error("",e);
        return result;
    }
}
