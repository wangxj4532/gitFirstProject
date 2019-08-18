<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/common.css" />
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
<link rel="stylesheet" type="text/css" href="css/layout.css" />
<style type="text/css"></style>
<script type="text/javascript">
	$(function() {
		$("a[title]").click(
						function() {
							var title = $(this).html();
							var src = $(this).attr("title");
							if ($("#tt").tabs("exists", title)) {
								$("#tt").tabs("select", title);
							} else {
								$("#tt").tabs("add",{
													title : title,
													content : "<iframe frameborder=0 style=width:100%;height:100% src='"
															+ src
															+ "'></iframe>",
													closable : true
												});
							}
						});
	});

	/************************************导航栏显示时间代码*********************************/
	function offset(x) {
		if (x < 10) {
			return "0" + x;
		} else {
			return x;
		}
	}
	function dsptm() {
		var now = new Date();
		var year = now.getFullYear();
		var month = now.getMonth() + 1;
		month = offset(month);
		var date = now.getDate();
		date = offset(date);
		var hour = now.getHours();
		hour = offset(hour);
		var minutes = now.getMinutes();
		minutes = offset(minutes);
		var sconds = now.getSeconds();
		sconds = offset(sconds);

		$("#tm").html(
				year + "年" + month + "月" + date + "日  " + hour + ":" + minutes
						+ ":" + sconds);
		timer = setTimeout("dsptm()", 1000);
	}
	$(function() {
		dsptm();
	});
	/************************************导航栏显示时间*********************************/
</script>
</head>
<body class="easyui-layout" fit="true">
	<!-- ---------------------------north区域代码------------------------------- -->
	<div region="north" title="导航栏" id="nav" iconCls="icon-tip" split="true">
		<lable id="lab">圆道首诺仓储管理系统</lable>
		<div id="tm"></div>
	</div>
	
	<!-- ---------------------------north区域代码------------------------------- -->

	<!-- ---------------------------菜单栏区域代码------------------------------- -->

	<div region="west" split="true" title="菜单" iconCls="icon-menu" style="width: 200px;">
		<div id="touxiang">
			<p id="exit" >[<a href="#">退出</a>]</p >
			<p style="margin-left:120px;">用户：<s:property value="#session.user_name"/></p>
			<p style="margin-left:120px;">身份：${auth_name}</p>
		</div>
		<div id="aa" class="easyui-accordion" fit="true" style="width: 300px;">
			<div title="基础信息" iconCls="icon-jichuxinxi">
				<div class="a">
					<a title="jcxx/jcxx_comfile.jsp">商品档案</a>
				</div>
				<br>
				<div class="a">
					<a title="#">单品追踪</a>
				</div>
				<br>
				<div class="a">
					<a title="jcxx/jcxx_customer.jsp">客户档案</a>
				</div>
				<br>
				<div class="a">
					<a title="jcxx/jcxx_receiveFile.jsp">收货单位档案</a>
				</div>
				<br>
				<div class="a">
					<a title="jcxx/jcxx_storeroom.jsp">库房管理</a>
				</div>
				<br>
				<div class="a">
					<a title="jcxx/jcxx_cargoSpace.jsp">货位管理</a>
				</div>
			</div>
			<div title="财务管理" iconCls="icon-caiwuguanli">
				<div class="a">
					<a title="#">仓储计费</a>
				</div>
				<br>
				<div class="a">
					<a title="#">计费审核</a>
				</div>
				<br>
				<div class="a">
					<a title="#">发票管理</a>
				</div>
				<br>
				<div class="a">
					<a title="#">核销结转</a>
				</div>
				<br>
				<div class="a">
					<a title="#">计费报表</a>
				</div>
			</div>
			<div title="订单管理" iconCls="icon-dingdan">
				<div class="a">
					<a title="ddgl/ddgl_enterwarehouseOrder.jsp">入库订单</a>
				</div>
				<br>
				<div class="a">
					<a title="ddgl/ddgl_outofwarehouseOrder.jsp">出库订单</a>
				</div>
			</div>
			<div title="出入库管理" iconCls="icon-churuku">
				<div class="a">
					<a title="chrkgl/chrkgl_rukudan.jsp">入库单</a>
				</div>
				<br>
				<div class="a">
					<a title="chrkgl/chrkgl_chukudanminxi.jsp">入库单明细</a>
				</div>
				<br>
				<div class="a">
					<a title="chrkgl/chrkgl_chhd.jsp">出库单</a>
				</div>
				<br>
				<div class="a">
					<a title="chrkgl/chrkgl_chukudanminxi.jsp">出库单明细</a>
				</div>
				<br>
				<div class="a">
					<a title="#">拣货单</a>
				</div>
			</div>
			<div title="内部出入库管理" iconCls="icon-neibuchuruku">
				<div class="a">
					<a title="nbchrkgl/nbchrkgl_huowuyiwei.jsp">货物移位单</a>
				</div>
				<br>
				<div class="a">
					<a title="nbchrkgl/nbchrkgl_huowuyiku.jsp">货物移库单</a>
				</div>
				<br>
				<div class="a">
					<a title="#">库存损益</a>
				</div>
			</div>
			<div title="库存管理" iconCls="icon-kucunguanli">
				<div class="a">
					<a title="#">库存查询</a>
				</div>
				<br>
				<div class="a">
					<a title="#">残次品库存查询</a>
				</div>
			</div>
			<div title="系统管理" iconCls="icon-xitong" >
				<div class="a">
					<a title="xtgl/xtgl_authoritygroupManger.jsp">权限组管理</a>
				</div>
				<br>
				<div class="a">
					<a title="xtgl/xtgl_userInfo.jsp">操作用户管理</a>
				</div>
				<br>
				<div class="a">
					<a title="xtgl/xtgl_userPwdUpd.jsp">用户密码修改</a>
				</div>
			</div>
		</div>
	</div>
	<!-- ---------------------------菜单栏区域代码------------------------------- -->

	<!-- ---------------------------显示信息栏代码------------------------------- -->

	<div region="center" style="padding: 5px;">
		<div id="tt" class="easyui-tabs" fit="true">
		</div>
	</div>
	<!-- ---------------------------显示信息栏代码------------------------------- -->

</body>
</html>