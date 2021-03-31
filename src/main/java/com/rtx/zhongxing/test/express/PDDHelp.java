package com.rtx.zhongxing.test.express;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.PopHttpClient;
import com.pdd.pop.sdk.http.api.pop.request.PddCloudprintStdtemplatesGetRequest;
import com.pdd.pop.sdk.http.api.pop.request.PddPopAuthTokenCreateRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudprintStdtemplatesGetResponse;
import com.pdd.pop.sdk.http.api.pop.response.PddPopAuthTokenCreateResponse;
import com.rtx.zhongxing.bean.express.pdd.PddExpressOrderParameter;
import com.rtx.zhongxing.mybatis.entity.express.PddStdtemplateEntity;
import com.rtx.zhongxing.mybatis.mapper.express.AccessTokenMapper;
import com.rtx.zhongxing.mybatis.mapper.express.OrderExpressMapper;
import com.rtx.zhongxing.mybatis.mapper.express.PddStdtemplatesMapper;
import com.rtx.zhongxing.service.express.impl.PDDExpressApi;

@SuppressWarnings("all")
public class PDDHelp {
	
	public static  String clientId = "9b5958cad12e40b48156b8d80fb67e01";
	public static  String clientSecret = "82b6c3fd0f10c1ad7c5b96aa130f9f2db3c60e9b";

	public static void main(String[] args) throws Exception {
//		getaccesstoken();
//		stdtemplates();
//		testPDD();
//		test();
		testSqlecute();
	}
	
	public static void testSqlecute() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlsession = factory.openSession();
		OrderExpressMapper mapper = sqlsession.getMapper(OrderExpressMapper.class);
//		mapper.updOrderStatus("insert into rtx_api_mapping(tablename,mybatistype)values('1','1')");
	}
	
	public static void test() throws Exception{
		InputStream in = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlsession = factory.openSession();
		PddStdtemplatesMapper stdtemplatesMapper = sqlsession.getMapper(PddStdtemplatesMapper.class);
		
		PddStdtemplateEntity parameter = new PddStdtemplateEntity();
		List<Field> fields = new ArrayList();
		fields.addAll(Arrays.asList(parameter.getClass().getDeclaredFields()));
		fields.addAll(Arrays.asList(parameter.getClass().getSuperclass().getDeclaredFields()));
		for(Field field:fields) {
			field.setAccessible(true);
			if(field.getType().equals(String.class)) {
				field.set(parameter, field.getName());
			}
		}
		stdtemplatesMapper.addStdtemplate(parameter);
	}
	public static void testPDD() throws Exception {
		InputStream in = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlsession = factory.openSession();
		
		PDDExpressApi api = new PDDExpressApi();
		AccessTokenMapper accessTokenMapper = sqlsession.getMapper(AccessTokenMapper.class);
		PddStdtemplatesMapper stdtemplatesMapper = sqlsession.getMapper(PddStdtemplatesMapper.class);
		
		for(Field field:api.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			if("clientId".equals(field.getName())) {
				field.set(api, clientId);
			}
			if("clientSecret".equals(field.getName())) {
				field.set(api, clientSecret);
			}
			if("expressAccessTokenMapper".equals(field.getName())) {
				field.set(api, accessTokenMapper);
			}
			if("stdtemplatesMapper".equals(field.getName())) {
				field.set(api, stdtemplatesMapper);
			}
		}
		
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
	}

	
	public Object getMapper(Class clazz) throws Exception {
		InputStream in = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlsession = factory.openSession();
		return sqlsession.getMapper(clazz);
	}
	
	
	public static void getaccesstoken() throws Exception {
//		String clientId = clientId;
//		String clientSecret = clientSecret;
		PopClient client = new PopHttpClient(clientId, clientSecret);

		PddPopAuthTokenCreateRequest request = new PddPopAuthTokenCreateRequest();
		request.setCode("f58b0236b785479281abd376a1b48423648ec330");
		PddPopAuthTokenCreateResponse response = client.syncInvoke(request);
		System.out.println(JsonUtil.transferToJson(response));
	}
	
	public static void stdtemplates() throws Exception {
        PopClient client = new PopHttpClient(clientId, clientSecret);

        PddCloudprintStdtemplatesGetRequest request = new PddCloudprintStdtemplatesGetRequest();
        request.setWpCode("SF");
        PddCloudprintStdtemplatesGetResponse response = client.syncInvoke(request);
        System.out.println(JsonUtil.transferToJson(response));
	}
	
}
