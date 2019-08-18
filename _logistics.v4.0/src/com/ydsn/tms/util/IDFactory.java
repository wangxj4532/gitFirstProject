package com.ydsn.tms.util;

import java.util.UUID;

/**
 * 产生不重复的字符串
 *@author  孙军
 *2015年6月9日 上午10:43:38
 */
public class IDFactory {
	/**
	 * 商品档案表的商品ID
	 * @param g_bill
	 * @return
	 */
  public static String  createG_id(String g_bill){
	 return g_bill+"-"+UUID.randomUUID()+""; 
  }
  /**
   * 货位表主键
   * @param car_bill
   * @return
   */
  public static String createCar_id(String car_bill){
	 return car_bill+"-"+System.nanoTime()+"";
  }
  /**
   * 客户表主键
   * @param cus_bill
   * @return
   */
  public static String createCus_id(String cus_bill){
	  return cus_bill+"-"+System.nanoTime()+"";
  }
  /**
   * 用户表主键生成器
   * @param user_mch
   * @return
   */
  public static String createUser_id(String user_mch){
	  return user_mch+"-"+System.nanoTime()+"";
  }
  /**
   *入库订单 主键生成器
   * @return
   */
  public static String createRkdd_bill(){
	  return System.nanoTime()+"";
  }
  /**
   *出库订单主键生成器
   * @return
   */
  public static String createChkdd_bill(){
	  return System.nanoTime()+"";
  }
  /**
   * 货物移库主键生成器
   * @return
   */
  public static String createHwyk_bill(){
	  return System.nanoTime()+"";
  }
  /**
   * 货物移位主键生成器
   * @return
   */
  public static String createHwyw_bill(){
	  return System.nanoTime()+"";
  }
  /**
   * 出库单主键生成器
   * @param chk_bm
   * @return
   */
  public static String createChk_bill(String chk_bm){
	  return chk_bm+"-"+System.nanoTime()+"";
  }
  /**
   * 出库明细主键生成器
   * @param chkhw_num
   * @return
   */
  public static String createChkmx_bill(String chkhw_num){
	  return chkhw_num+"-"+System.nanoTime()+"";
  }
  /**
   * 入库单主键生成器
   * @return
   */
  public static String createRk_bill(){
	  return System.nanoTime()+"";
  }
  /**
   * 入库单明细主键
   * @param rkd_id
   * @return
   */
  public static String createRkmx_bill(String rkd_id){
	  return rkd_id+"-"+System.nanoTime()+"";
  }
}
