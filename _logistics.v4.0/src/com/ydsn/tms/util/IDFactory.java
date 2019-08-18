package com.ydsn.tms.util;

import java.util.UUID;

/**
 * �������ظ����ַ���
 *@author  ���
 *2015��6��9�� ����10:43:38
 */
public class IDFactory {
	/**
	 * ��Ʒ���������ƷID
	 * @param g_bill
	 * @return
	 */
  public static String  createG_id(String g_bill){
	 return g_bill+"-"+UUID.randomUUID()+""; 
  }
  /**
   * ��λ������
   * @param car_bill
   * @return
   */
  public static String createCar_id(String car_bill){
	 return car_bill+"-"+System.nanoTime()+"";
  }
  /**
   * �ͻ�������
   * @param cus_bill
   * @return
   */
  public static String createCus_id(String cus_bill){
	  return cus_bill+"-"+System.nanoTime()+"";
  }
  /**
   * �û�������������
   * @param user_mch
   * @return
   */
  public static String createUser_id(String user_mch){
	  return user_mch+"-"+System.nanoTime()+"";
  }
  /**
   *��ⶩ�� ����������
   * @return
   */
  public static String createRkdd_bill(){
	  return System.nanoTime()+"";
  }
  /**
   *���ⶩ������������
   * @return
   */
  public static String createChkdd_bill(){
	  return System.nanoTime()+"";
  }
  /**
   * �����ƿ�����������
   * @return
   */
  public static String createHwyk_bill(){
	  return System.nanoTime()+"";
  }
  /**
   * ������λ����������
   * @return
   */
  public static String createHwyw_bill(){
	  return System.nanoTime()+"";
  }
  /**
   * ���ⵥ����������
   * @param chk_bm
   * @return
   */
  public static String createChk_bill(String chk_bm){
	  return chk_bm+"-"+System.nanoTime()+"";
  }
  /**
   * ������ϸ����������
   * @param chkhw_num
   * @return
   */
  public static String createChkmx_bill(String chkhw_num){
	  return chkhw_num+"-"+System.nanoTime()+"";
  }
  /**
   * ��ⵥ����������
   * @return
   */
  public static String createRk_bill(){
	  return System.nanoTime()+"";
  }
  /**
   * ��ⵥ��ϸ����
   * @param rkd_id
   * @return
   */
  public static String createRkmx_bill(String rkd_id){
	  return rkd_id+"-"+System.nanoTime()+"";
  }
}
