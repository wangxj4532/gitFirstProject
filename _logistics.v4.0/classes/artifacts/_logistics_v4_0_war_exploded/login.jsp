<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.2.6/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.2.6/themes/icon.css" />
<script type="text/javascript"
	src="js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="css/login.css" />
<style type="text/css">
</style>
<script language=javaScript>
	function txt() {
		$("#user_name").val("");
	}
	function pw() {
		$("#user_pwd").val("");
	}
	function ic() {
		$("#yanzhengma").val("");

	}
	 function login() {
		 alert("==");
		$.ajax({
			type : "POST",
			url : "login.do",
			cache : false,
			//async:true,
			data : "user_name=" + $("#user_name").val() + "&user_pwd="
					+ $("#user_pwd").val(),
			success:function(mes){
				alert(mes);
				if(mes==0){
					window.confirm("密码或用户名有误！");
				}else{
					window.confirm("登陆成功！");
				}		
			}
		});
	} 
	function clo() {
		$("#denlu").css("display", "none");
	}
	 function reloadImage(){
		 document.getElementById("yzhm").src="yzhm.action?a="+new Date().getTime();
	 }
	
</script>
</head>
<body>

	<div id="fc">
		<form action="login.action" method="post">
			<label class="lb">账 &nbsp;&nbsp; 号</label> <input onclick="txt()"
				type="text" id="user_name" name="user_name" value="USER_NAME" /><br>
			<p></p>
			<label class="lb">密 &nbsp;&nbsp; 码</label> <input onclick="pw()"
				type="password" id="user_pwd" name="user_pwd" value="USER_PWD" /> <br>
			<p></p>
			<label class="lb">验证码</label> <input type="text" name="str" onclick="ic()"
				id="yanzhengma" value="CODE" />
				<img src="yzhm.action" id="yzhm"/>
				<input type="button" value="换一张" onclick="reloadImage()"/>
				<br>
			<p></p>
			<p id="rukou">
				<input type="submit" value="登陆" id="sbt"/> 
				<input type="button" value="关闭" onclick="clo()" id="btn" />
			</p>
			</form>
	</div>
</body>
</html>