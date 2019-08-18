package com.ydsn.tms.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 生成指定日期格式的工具类
 *@author  孙军
 *2015年6月13日 上午10:19:40
 */
public class DateTools {
	
   public static String createRkddzhd_time(){
	   Date d=new Date();
	   DateFormat fmt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       return fmt.format(d);
   } 
}
