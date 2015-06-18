package com.skybow.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 字符传工具类
 * @author le
 * 2015年6月18日 下午12:25:33
 * 方法:
 * 	1HTMLChange HTML转码
 * 	2dateTimeChange 时间转换date->String("yyyy-MM-dd HH:mm:ss")
 */
public class DoString {
	/**
	 * HTML转码
	 * @param source
	 * @return
	 */
	public static String HTMLChange(String source){
		String changeStr="";
		changeStr=source.replaceAll("&","&amp;");
		changeStr=changeStr.replaceAll(" ","&nbsp;");
		changeStr=changeStr.replaceAll("<","&lt;");
		changeStr=changeStr.replaceAll(">","&gt;");		
		changeStr=changeStr.replaceAll("\r\n","<br>");
		return changeStr;
	}
	/**
	 * 时间转换
	 * @param source
	 * @return
	 */
	public static String dateTimeChange(Date source){
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String changeTime=format.format(source);		
		return changeTime;
	}
}
