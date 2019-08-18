<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户密码修改</title>
<link rel="stylesheet" type="text/css" href="../css/common.css" />
<script type="text/javascript" src="../js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.2.6/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.2.6/themes/icon.css" />
<script type="text/javascript" src="../js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="../css/userPwdUpd.css" />
<style type="text/css">
</style>
<script type="text/javascript">
	$(function(){
		 $.extend($.fn.validatebox.defaults.rules, {   
	   	        equallength: {   
	                              validator: function(value, param){   
	                              return value.length == param[0];   
	                              },   
	                              message: '密码必须为6位'  
	                      }  
	   		     });
		//点击旧密码框的同时检测旧密码框的值是否等于“旧密码填写错误！”，如果等于则点击清空文本框生效。
		$("#old_pwd").click(function(){
            if($("#old_pwd").val()=="旧密码填写错误！"){
            	$("#old_pwd").val("");
			}
		});
		//点击新密码框的同时验证，发起异步请求，校验旧密码框的密码输入是否正确，不正确就加以提示
		$("#new_pwd").click(function(){
			 $.ajax({
				 type:"post",
				 url:"vilPwd.action",
			     data:"user_id=2&old_pwd="+$("#old_pwd").val(),
			     success:function(msg){
			    	 if(msg==1){
			    		 $("#old_pwd").val("旧密码填写错误！"); 
			    	 }
			     }
			 });
		});
		    
 			  $("#btn").click(function(){
 				  //点击提交按钮校验两次新密码是否一致，不一致则终止提交，并加以提示。
 				 if($("#new_pwd").val()!=$("#second_pwd").val()){
 					 $.messager.show({
 		               	title:"提示信息",
 			    		msg:"新旧密码有误！"
 		               });
 					 return false;
 				 }
 				  //判断表单是否通过校验，通过就发起异步请求，修改密码
 				if($("#myform").form("validate")){
 	        	  $.ajax({
 						type: "post" ,
 						url:"submit.action",
 						cache:false ,
 						data:"new_pwd="+$("#new_pwd").val()+"&user_id=2",
 						success:function(result){
 							$.messager.show({
 								title:'提示信息!' ,
 		    			        msg:"修改成功！"
 							});
 							//提交成功就隐藏修改DIV
 							$("#main").css("display","none");
 						} 
 					});
		        }else{
			         $.messager.show({
					      title:'提示信息!' ,
					      msg:'数据验证不通过,无法提交!'
				     }); 
		        }
 			}); 
 		//点击关闭隐藏修改DIV		
		 $("#btn1").click(function(){
				$("#main").css("display","none");
		});
	});
</script>
</head>
<body>
	<div id="main">
		<p id="tit">密码修改</p>
		<form action="" name="myform" method="post">
			<input type="hidden" name="user_id" value="2" />
			<table class="tb">
				<tr>
					<td>请输入原密码</td>
					<td><input type="text" class="easyui-validatebox"
						missingMessage="用户名不能为空！" required=true name="old_pwd"
						id="old_pwd" value="" /></td>
				</tr>
				<tr>
					<td>请输入新密码</td>
					<td><input type="password" class="easyui-validatebox"
						missingMessage="用户名不能为空！" validType="equallength[6]" required=true
						name="new_pwd" id="new_pwd" /></td>
				</tr>
				<tr>
					<td>请再次输入新密码</td>
					<td><input type="password" class="easyui-validatebox"
						missingMessage="用户名不能为空！" validType="equallength[6]" required=true
						name="second_pwd" id="second_pwd" /></td>
				</tr>
			</table>
			<br>
			<p id="rukou">
				<a id="btn" class="easyui-linkbutton">修改</a>
				<!-- <input type="submit" value="修改" class="easyui-linkbutton" id="sbt"/> -->
				&nbsp;&nbsp;&nbsp;&nbsp; <input type="button" value="关闭" id="btn1" />
			</p>
		</form>
	</div>
</body>
</html>