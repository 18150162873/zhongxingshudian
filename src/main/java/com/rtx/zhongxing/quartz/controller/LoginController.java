package com.rtx.zhongxing.quartz.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @project rtx_wms_api
 * @author wujunming
 * @data 2018年3月29日上午11:39:14
 */
@Controller
public class LoginController {

	@Value("${spring.security.user.name}")
	private String sysusername;

	@Value("${spring.security.user.password}")
	private String syspassword;

	@RequestMapping(value = "/login")
	public @ResponseBody String login(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		//验证登陆
		if (username.equals(sysusername) && password.equals(syspassword)) {
			request.getSession().setAttribute("username", username);
			request.getSession().setAttribute("password", password);
			return "/index.html";
		} else {
			return "error";
		}
	}
}
