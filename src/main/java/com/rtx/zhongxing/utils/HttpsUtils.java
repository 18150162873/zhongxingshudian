package com.rtx.zhongxing.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;

public class HttpsUtils {

	/**
	 * 发送HTTP POST方式请求
	 * @param url
	 * @param map
	 * @return
	 */
	public static String sendPostHttp(String url, Map<String, String> map) {
		String str = "";
		PostMethod postMethod = null;
		BufferedReader br = null;
		InputStream stream = null;
		try {
			HttpClient client = new HttpClient();
			URI uri = new URI(url, false);
			postMethod = new PostMethod(uri.getEscapedURI());
			//PostMethod postMethod = new PostMethod(url);
			//postMethod.setRequestHeader("Connection", "close"); 
			postMethod.setRequestHeader("Content-Type","application/x-www-form-urlencoded; charset=UTF-8");
			//postMethod.setRequestHeader("username", "wjm");
			//postMethod.setRequestHeader("password", "123456");
			if (map != null && map.size() > 0) {
				for (String key : map.keySet()) {
					postMethod.setParameter(key, map.get(key));
				}
			}
			client.executeMethod(postMethod);
			stream = postMethod.getResponseBodyAsStream();
			br = new BufferedReader(new InputStreamReader(stream, "utf-8"));
			StringBuffer buffer = new StringBuffer("");
			String s = br.readLine();
			while(s != null){
				buffer.append(s);
				s = br.readLine();
			}
			str = buffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(postMethod != null) {
				postMethod.releaseConnection();
			}
			try {
				if(br != null) 
				br.close();
				if(stream != null)
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return str;
	}
	/**
	 * 发送HTTP POST请求
	 * @param url  请求地址
	 * @param request  请求参数
	 * @return
	 * @throws Exception 
	 */
	public static String sendPostHttp(String url, String request) {
		String str = "";
		PostMethod postMethod = null;
		BufferedReader br = null;
		InputStream stream = null;
		InputStream requestStream = null;
		try {
			ProtocolSocketFactory fcty = new MySecureProtocolSocketFactory();
		    Protocol.registerProtocol("https", new Protocol("https", fcty, 443));
			HttpClient client = new HttpClient();
			URI uri = new URI(url, false);
			postMethod = new PostMethod(uri.getEscapedURI());
			//postMethod.setRequestHeader("Content-Type","application/octet-stream;charset=UTF-8");
			postMethod.setRequestHeader("Content-Type","application/json; charset=UTF-8");
			requestStream = new ByteArrayInputStream(request.getBytes("utf-8"));
			RequestEntity requestEntity = new InputStreamRequestEntity(requestStream);
			postMethod.setRequestEntity(requestEntity);
			client.executeMethod(postMethod);
			stream = postMethod.getResponseBodyAsStream();
			br = new BufferedReader(new InputStreamReader(stream, "utf-8"));
			StringBuffer buffer = new StringBuffer("");
			String s = br.readLine();
			while(s != null){
				buffer.append(s);
				s = br.readLine();
			}
			str = buffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(postMethod != null)
			postMethod.releaseConnection();
			try {
				if(br != null)
				br.close();
				if(stream != null)
				stream.close();
				if(requestStream != null)
				requestStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return str;
	}
	
	/**
	 * 发送HTTP POST方式请求
	 * @param url
	 * @param map
	 * @return
	 */
	public static String sendSSLPostHttp(String url, Map<String, String> map) {
		String str = "";
		PostMethod postMethod = null;
		BufferedReader br = null;
		InputStream stream = null;
		ProtocolSocketFactory fcty = new MySecureProtocolSocketFactory();
	    Protocol.registerProtocol("https", new Protocol("https", fcty, 443));
		HttpClient client = new HttpClient();
		try {
			URI uri = new URI(url, false);
			postMethod = new PostMethod(uri.getEscapedURI());
			postMethod.setRequestHeader("Content-Type","application/x-www-form-urlencoded; charset=UTF-8");
			if (map != null && map.size() > 0) {
				for (String key : map.keySet()) {
					postMethod.setParameter(key, map.get(key));
				}
			}
			client.executeMethod(postMethod);
			stream = postMethod.getResponseBodyAsStream();
			br = new BufferedReader(new InputStreamReader(stream, "utf-8"));
			StringBuffer buffer = new StringBuffer("");
			String s = br.readLine();
			while(s != null){
				buffer.append(s);
				s = br.readLine();
			}
			str = buffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(postMethod != null) {
				postMethod.releaseConnection();
				client.getHttpConnectionManager().closeIdleConnections(0);
			}
			try {
				if(br != null) 
				br.close();
				if(stream != null)
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return str;
	}
}
