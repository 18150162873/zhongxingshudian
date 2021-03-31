package com.rtx.zhongxing.utils;

import java.io.IOException;

/**
 * base64加密类
 * @project  rtx_wms_api
 * @author   wujunming
 * @data     2018年3月29日下午3:11:33
 */
public class Base64Helper {

	/** 
	 * 编码 
	 *  
	 * @param bstr 
	 * @return String 
	 */  
	public static String encode(byte[] bstr) {  
		return new sun.misc.BASE64Encoder().encode(bstr);  
	}  

	/** 
	 * 解码 
	 *  
	 * @param str 
	 * @return string 
	 */  
	public static byte[] decode(String str) {  
		byte[] bt = null;  
		try {  
			sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();  
			bt = decoder.decodeBuffer(str);  
		} catch (IOException e) {  
			e.printStackTrace();  
		}  

		return bt;  
	}  
}
