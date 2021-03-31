package com.rtx.zhongxing.utils;

import java.security.MessageDigest;

public class MD5Helper {
	/**
	 * MD5加密
	 * @param data
	 * @param encode
	 * @return
	 */
	public static byte[] encryptMD5(String data,String encode) {
		byte[] b = {};
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(data.getBytes(encode));
	        b = md.digest();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	/**
	 * MD5+16进制转换
	 * @param data
	 * @return
	 */
	public static String encryptMD5And16Hex(String data) {
		byte[] b = encryptMD5(data,"utf-8");
		StringBuffer buffer = new StringBuffer(32);
		for (int i = 0; i < b.length; i++) {
			String temp = Integer.toHexString(b[i] & 0xff);
			 if (temp.length() < 2) {
				 buffer.append("0");
			 }
			 buffer.append(temp);
		}
		return buffer.toString();
	}
}
