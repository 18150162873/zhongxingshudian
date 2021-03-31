package com.rtx.zhongxing.test.express;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.UserSellerGetRequest;
import com.taobao.api.response.UserSellerGetResponse;

public class CNHelp {

	public static void main(String[] args) throws Exception {
		queryUserInfo();
	}
	
	public static void queryUserInfo() throws Exception {
		TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "30157491", "5970d8d837eb4db86b69017e9432dc5a");
		UserSellerGetRequest req = new UserSellerGetRequest();
		req.setFields("user_id");
		UserSellerGetResponse rsp = client.execute(req, "6102424e5f0f627da23bd3ebacec1e13146a2c87c73aab4832978172");
		System.out.println(rsp.getBody());
		
	}
}
