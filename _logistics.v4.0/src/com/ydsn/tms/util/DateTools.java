package com.ydsn.tms.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ָ�����ڸ�ʽ�Ĺ�����
 *@author  ���
 *2015��6��13�� ����10:19:40
 */
public class DateTools {
	
   public static String createRkddzhd_time(){
	   Date d=new Date();
	   DateFormat fmt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       return fmt.format(d);
   } 
}
