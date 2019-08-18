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
 * ��½--���Ʋ�
 *@author  ���
 *2015��7��8�� ����4:35:56
 */
public class LoginAction {
   private LoginService log_ser;
   private String  user_name;
   private String  user_pwd;
   private String str;
	//�����ַ��ֵ�
   private char[] chars={'2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','P','Q','R','S','T','U','V','W','X','Y','Z'};  
   private Random random=new Random();//ʵ�������������
   /**
    * ���ַ��ֵ��������ȡ��λ�����
    * @return
    */
   private String getRandomString(){
  	StringBuffer sb=new StringBuffer();//ʵ�����ַ����������
  	for(int i=0;i<6;i++){
  		sb.append(chars[random.nextInt(chars.length)]);//ÿ�����ַ��ֵ������ȡһ���ַ�
  	}
  	return sb.toString();
   }
   /**
    * ��ȡ�������ɫ
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
	   response.setContentType("imag/jpeg");//�����������
		String randomString =this.getRandomString();//����ַ���
		   Map<String, Object>  session=(Map<String, Object>) ServletActionContext.getContext().getSession();
		session.put("randomString", randomString);//������ַ���������session��
		int width=100;//����ͼƬ�ĳ�
		int height=30;//����ͼƬ�Ŀ�
		Color c=this.getRandomColor();//�����ɫ���ڱ���ɫ
		Color reverse=this.getReverseColor(c);//��ɫ������������ɫ
		BufferedImage bi=new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
		//����һ����ɫͼƬ
		Graphics2D g2d=bi.createGraphics();//��ȡ��ͼ����
	    g2d.setFont(new Font(Font.SANS_SERIF,Font.BOLD,16));//��������
	    g2d.setColor(c);//������ɫ
	    g2d.fillRect(0, 0, width, height);//���ñ���
	    g2d.setColor(reverse);//������ɫ
	    g2d.drawString(randomString, 18, 20);//��������ַ�
       for(int i=0;i<random.nextInt(100);i++){
       	g2d.drawRect(random.nextInt(width), random.nextInt(height), 1, 1);//����100λ�������������
       }
		ServletOutputStream out=null;
		try {
			out = response.getOutputStream();
			 com.sun.image.codec.jpeg.JPEGImageEncoder encoder=com.sun.image.codec.jpeg.JPEGCodec.createJPEGEncoder(out);//������
		       encoder.encode(bi);//���б���
		       out.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
	   return null;
   }
   public String login(){
	   System.out.println("�û����� "+user_name+"----login action execute-------"+"���룺"+user_pwd);
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
