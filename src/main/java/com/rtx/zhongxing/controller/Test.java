package com.rtx.zhongxing.controller;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rtx.zhongxing.bean.express.pdd.PddExpressOrderParameter;
import com.rtx.zhongxing.service.express.ExpressService;

@SuppressWarnings("all")
@RestController
public class Test {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Autowired
//	ExpressService expressService;
	
//	@Autowired
//	PddExpressOrderParameter parameter;
	
	@GetMapping(value = "test")
	public String SortingDeviceStatusDown() throws Exception {
		PddExpressOrderParameter parameter = new PddExpressOrderParameter();
		List<Field> fields = new ArrayList();
		fields.addAll(Arrays.asList(parameter.getClass().getDeclaredFields()));
		fields.addAll(Arrays.asList(parameter.getClass().getSuperclass().getDeclaredFields()));
		for(Field field:fields) {
			field.setAccessible(true);
			if(field.getType().equals(String.class)) {
				field.set(parameter, field.getName());
			}
		}
		parameter.setCarriercode("SF");
		parameter.setSendMobile("18150162873");
		parameter.setSendPhone("18150162873");
		parameter.setReceiverPhone("18150162873");
		parameter.setReceiverMobile("18150162873");
		parameter.setSendAddr("");
//		expressService.getWaybill(parameter);
		return "1";
	}
}
