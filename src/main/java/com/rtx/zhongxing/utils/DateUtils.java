package com.rtx.zhongxing.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	/**
	 * 获取指定fromat的时间,有误则返回当前时间
	 * @return
	 */
	public static Date getFormateDate(String formate,String dateStr) {
		Date date = null;
		try {
			SimpleDateFormat df = new SimpleDateFormat(formate);
			date = df.parse(dateStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * YYYY-MM-DD HH:MM:SS
	 * @return
	 */
	public static String getFormateDate(String dateStr) {
		String str = "";
		try {
			SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS");
			Date date = df.parse(dateStr);
			str = df.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}
}
