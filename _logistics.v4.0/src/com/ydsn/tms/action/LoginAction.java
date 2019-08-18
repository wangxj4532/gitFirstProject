package com.ydsn.tms.action;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.ydsn.tms.po.xtgl_UserInfo;
import com.ydsn.tms.service.LoginService;

/**
 * 登陆--控制层
 *@author  孙军
 *2015年7月8日 下午4:35:56
 */
public class LoginAction {
   private LoginService log_ser;
   private String  user_name;
   private String  user_pwd;
   private String str;
	//定义字符字典
   private char[] chars={'2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','P','Q','R','S','T','U','V','W','X','Y','Z'};  
   private Random random=new Random();//实例化随机数对象
   /**
    * 从字符字典中随机获取六位随机数
    * @return
    */
   private String getRandomString(){
  	StringBuffer sb=new StringBuffer();//实例化字符串缓存对象
  	for(int i=0;i<6;i++){
  		sb.append(chars[random.nextInt(chars.length)]);//每次在字符字典中随机取一个字符
  	}
  	return sb.toString();
   }
   /**
    * 获取随机的颜色
    * @return
    */
   private Color getRandomColor(){
  	 return new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
   }
   private Color getReverseColor(Color c){
  	 return new Color(255-c.getRed(),255-c.getGreen(),255-c.getBlue());
   }
   
   public String yzhm(){
	   HttpServletResponse response=ServletActionContext.getResponse();
	   response.setContentType("imag/jpeg");//设置输出类型
		String randomString =this.getRandomString();//随机字符串
		   Map<String, Object>  session=(Map<String, Object>) ServletActionContext.getContext().getSession();
		session.put("randomString", randomString);//将随机字符串保存在session中
		int width=100;//设置图片的长
		int height=30;//设置图片的宽
		Color c=this.getRandomColor();//随机颜色用于背景色
		Color reverse=this.getReverseColor(c);//反色，用于字体颜色
		BufferedImage bi=new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
		//创建一个彩色图片
		Graphics2D g2d=bi.createGraphics();//获取绘图对象
	    g2d.setFont(new Font(Font.SANS_SERIF,Font.BOLD,16));//设置字体
	    g2d.setColor(c);//设置颜色
	    g2d.fillRect(0, 0, width, height);//设置背景
	    g2d.setColor(reverse);//设置颜色
	    g2d.drawString(randomString, 18, 20);//绘制随机字符
       for(int i=0;i<random.nextInt(100);i++){
       	g2d.drawRect(random.nextInt(width), random.nextInt(height), 1, 1);//绘制100位置随机的噪音点
       }
		ServletOutputStream out=null;
		try {
			out = response.getOutputStream();
			 com.sun.image.codec.jpeg.JPEGImageEncoder encoder=com.sun.image.codec.jpeg.JPEGCodec.createJPEGEncoder(out);//编码器
		       encoder.encode(bi);//进行编码
		       out.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
	   return null;
   }
   public String login(){
	   System.out.println("用户名： "+user_name+"----login action execute-------"+"密码："+user_pwd);
	   System.out.println(ServletActionContext.getContext().getSession());
	   Map<String, Object>  session=(Map<String, Object>) ServletActionContext.getContext().getSession();
	  session.put("user_name", user_name);
	  System.out.println("==session=="+session.get("user_name"));
	  
	   List<xtgl_UserInfo> list=log_ser.login(user_name, user_pwd);
	   String randomString= (String) session.get("randomString");
	   System.out.println("---------list.size()--------->"+list.size());
	   if(list.size()==1&&randomString.equals(str)){
		   return Action.SUCCESS;  
	   }else{
		   return Action.ERROR;
	   }
	   
   }
   
   
public LoginService getLog_ser() {
	return log_ser;
}
public void setLog_ser(LoginService log_ser) {
	this.log_ser = log_ser;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getUser_pwd() {
	return user_pwd;
}
public void setUser_pwd(String user_pwd) {
	this.user_pwd = user_pwd;
}
public String getStr() {
	return str;
}
public void setStr(String str) {
	this.str = str;
}
   
  
   
}
