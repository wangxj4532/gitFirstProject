package com.ydsn.tms.util;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

/**
 *将一个集合利用反射转成Json的数据格式 
 * 
 *@author  孙军
 *2015年6月3日 上午11:20:40
 */
public class List2json {
     public static String obj2json(Object obj,String str){
    	 @SuppressWarnings("rawtypes")
		Class clz=obj.getClass();
    	 Method[] methods=clz.getDeclaredMethods();
    	 StringBuffer sb=new StringBuffer();
    	 sb.append("{");
    	 int k=0;
    	 for(int i=0;i<methods.length;i++){
    	     Method m=methods[i];
    	     String mName=m.getName();
    	     
    	     if(m.getModifiers()==Modifier.PUBLIC&&mName.startsWith("get")){
    	    	 String attrName=mName.substring(3).toLowerCase();
    	    	 String  attrValue="";
    	    	 try {
					attrValue=m.invoke(obj).toString();
				} catch (Exception e) {
					e.printStackTrace();
				} 
    	    	 if(k!=0){
    	    		 sb.append(",");
    	    	 }
//    	    	 String json="{\"total\":"+stolist.size()+",\"rows\":"+JSONArray.fromObject(pagelist)+"}";
    	    	 sb.append("\""+str+"."+attrName+"\":"+"\""+attrValue+"\"");
    	    	 k++;
    	     }
    	 }
    	 sb.append("}");

    	 return sb.toString();
     }
     public static String obj2jsonArr(@SuppressWarnings("rawtypes") List list,String str){
    	 StringBuffer sb=new StringBuffer();
    	 sb.append("[");
    	 for(int i=0;i<list.size();i++){
    		 if(i!=0){
    			 sb.append(",");
    		 }
    		 sb.append(obj2json(list.get(i),str));
    	 }
    	 sb.append("]");
    	 return sb.toString();
     }
}
