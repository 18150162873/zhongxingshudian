package com.rtx.zhongxing.test.express;

import com.alibaba.fastjson.JSON;
import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.request.seller.SellerVenderInfoGetRequest;
import com.jd.open.api.sdk.request.wujiemiandan.LdopAlphaProviderSignSuccessInfoGetRequest;
import com.jd.open.api.sdk.response.seller.SellerVenderInfoGetResponse;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaProviderSignSuccessInfoGetResponse;

@SuppressWarnings("all")
public class JDHelp {

	public static void main(String[] args) throws Exception {
		getshopInfo();
//		getProvider();
	}
	
	public static void getshopInfo() throws Exception {
		JdClient client=new DefaultJdClient("https://api.jd.com/routerjson","444b12d5521b465da5f840ce12711cb80yje","3394590D9E5185BD2C39FFCC403429B3","3bfb8c248cff4a908f58e9de5e85cd26");
		SellerVenderInfoGetRequest request=new SellerVenderInfoGetRequest();
		request.setExtJsonParam("test");
		SellerVenderInfoGetResponse response=client.execute(request);
		System.out.println(JSON.toJSONString(response));
	}
	
	public static void getProvider() throws Exception{
		JdClient client=new DefaultJdClient("https://api.jd.com/routerjson","444b12d5521b465da5f840ce12711cb80yje","3394590D9E5185BD2C39FFCC403429B3","3bfb8c248cff4a908f58e9de5e85cd26");
		LdopAlphaProviderSignSuccessInfoGetRequest request=new LdopAlphaProviderSignSuccessInfoGetRequest();
		request.setVenderCode("42463");
		LdopAlphaProviderSignSuccessInfoGetResponse response=client.execute(request);
		System.out.println(JSON.toJSONString(response));
	}
}
