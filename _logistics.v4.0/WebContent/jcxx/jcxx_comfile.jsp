<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/common.css" />
<script type="text/javascript"
	src="../js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="../js/jquery-easyui-1.2.6/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="../js/jquery-easyui-1.2.6/themes/icon.css" />
<script type="text/javascript"
	src="../js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="../js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="../js/commons.js"></script>
<script type="text/javascript">
	$(function() {
		/*-----------------------弹出框新增和修改商品档案信息-------------------------------------------*/

		$("#btn").click(function() {

			$.ajax({
				type : "post",
				url : flag == "add" ? "addCom.action" : "updateCom.action",
				cache : false,
				data : $("#myform").serialize(),
				success : function() {
					//1 关闭窗口
					$("#mydialog").dialog("close");
					$("#id_user").datagrid("unselectAll");
					//2刷新datagrid 
					$("#id_user").datagrid("reload");
					//3 提示信息
					$.messager.show({
						title : "提示信息",
						msg : "操作成功！"
					});
				}
			});
		});
		//点击关闭按钮关闭商品的新增和修改弹出框
		$("#btn1").click(function() {
			$("#mydialog").dialog("close");
		});
		//onload事件加载客户名称

		$.ajax({
			type : "post",
			url : "showComCus.action",
			cache : false,
			success : function(msg) {
				eval("rs=" + msg);
				var str = "<option>请选择客户</option>";
				for (i = 0; i < rs.length; i++) {
					str += "<option>" + rs[i].cus_name + "</option><br>";
				}
				$("#cus_name").html(str);
			}
		});

		/*-----------------------弹出框新增和修改商品档案信息-------------------------------------------*/

		/*-----------------------------------商品档案表格数据初始化---------------------------------------*/
		var editing;
		var flag;
		$("#id_user").datagrid(
						{
							idField : "cc.g_id",
							rownumbers : true,
							loadMsg : "数据正在加载，请耐心等待。。",
							remoteSort : false,
							url : "showCom.action",
							fitColumns : true,
							striped : true,//隔行变色
							frozenColumns : [ [ {
								field : 'ck',
								checkbox : true
							} ] ],
							rowStyler : function(index, record) {
								if (record.age > 30) {
									return "background:yellow";
								}
							},
							columns : [ [ {
								field : "cc.cus_name",
								title : "客户名称",
								width : 150,
								align : "center",
							}, {
								field : "cc.g_class",
								title : "商品分类",
								width : 100,
								align : "center",
							}, {
								field : "cc.g_bill",
								title : "商品编码",
								width : 150,
								align : "center",
							}, {
								field : "cc.g_name",
								title : "商品名称",
								width : 150,
								align : "center",
							}, {
								field : "cc.g_unit",
								title : "商品单位",
								width : 100,
								align : "center"
							}, {
								field : "cc.g_weight",
								title : "商品重量",
								width : 100,
								align : "center",
								sortable : true
							}, {
								field : "cc.g_standard",
								title : "商品规格",
								width : 100,
								align : "center",
								sortable : true,
							}, {
								field : "cc.g_length",
								title : "商品长",
								width : 100,
								align : "center",
							}, {
								field : "cc.g_width",
								title : "商品宽",
								width : 100,
								align : "center",
							} ] ],
							pagination : true,
							pageSize : 5,
							pageList : [ 5, 10, 15, 20 ],
							toolbar : [
									{
										text : "新增用户",
										iconCls : "icon-add",
										handler : function() {
											flag = "add";
											$('#mydialog').dialog({
												title : '新增用户',
												iconCls : "icon-add",
											});
											$("#myform").get(0).reset();
											$("#mydialog").dialog("open");
										}
									},
									{
										text : "修改用户",
										iconCls : "icon-edit",
										handler : function() {
											flag = "updata";
											var arr = $("#id_user").datagrid("getSelections");//主键标识idFeild
											if (arr.length != 1) {
												$.messager.show({
													title : "提示信息",
													msg : "必须选择一条记录进行修改！",
												});
											} else {
												$("#mydialog").dialog({
													title : "修改用户",
													iconCls : "icon-edit",
												});
												$("#mydialog").dialog("open"); //打开窗口
												$("#myform").get(0).reset(); //清空表单数据 
												$("#myform").form("load",{ //调用load方法把所选中的数据load到表单中,非常方便
												                   	"cc.g_id": arr[0]["cc.g_id"],
												                   	"cc.cus_name" : arr[0]["cc.cus_name"],
												                   	"cc.g_class" : arr[0]["cc.g_class"],
												                   	"cc.g_bill" : arr[0]["cc.g_bill"],
												                   	"cc.g_name" : arr[0]["cc.g_name"],
												                   	"cc.g_unit" : arr[0]["cc.g_unit"],
												                   	"cc.g_weight" : arr[0]["cc.g_weight"],
												                   	"cc.g_length" : arr[0]["cc.g_length"],
																	"cc.g_width" : arr[0]["cc.g_width"],
																	"cc.g_height" : arr[0]["cc.g_height"],
																	"cc.g_packamount" : arr[0]["cc.g_packamount"],
																	"cc.g_standard" : arr[0]["cc.g_standard"],
																	"cc.g_price" : arr[0]["cc.g_price"],
																	"cc.g_packunit" : arr[0]["cc.g_packunit"],
																	"cc.g_packweight" : arr[0]["cc.g_packweight"],
																	"cc.g_packlength" : arr[0]["cc.g_packlength"],
																	"cc.g_packwidth" : arr[0]["cc.g_packwidth"],
																	"cc.g_packheight" : arr[0]["cc.g_packheight"],
																	"cc.g_remarks" : arr[0]["cc.g_remarks"],
																	"cc.g_time" : arr[0]["cc.g_time"],
																	"cc.g_value" : arr[0]["cc.g_value"],
																	"cc.cus_num" : arr[0]["cc.cus_num"],	
																});
											}
											if(arr[0]["cc.g_serial"]=="否"){
												document.getElementById("g_serial2").checked="checked";
												
											}
										}
									},
									
									{
										text : "删除用户",
										iconCls : "icon-cancel",
										handler : function() {
											var arr = $("#id_user").datagrid(
													"getSelections");
											if (arr.length < 1) {
												$.messager.show({
													title : "提示信息",
													msg : "至少选择一行记录进行删除！"
												});
											} else {
												$.messager.confirm(
																"提示信息",
																"确认删除？",
																function(r) {
																	if (r) {
																		var str = "";
																		for (var i = 0; i < arr.length; i++) {
																			str = arr[i]["cc.g_id"]+ ",";
																		}
																		str = str.substring(0,str.length - 1);
																		$.post("deleteCom.action",{str : str},function() {
																							//1 刷新数据表格 
																							$("#id_user").datagrid("reload");
																							//2 清空idField   
																							$('#id_user').datagrid('unselectAll');
																							//2 清空idField   
																							//$('#id_user').datagrid('unselectAll');
																							//3 给提示信息 
																							$.messager.show({
																										title : '提示信息!',
																										msg : '操作成功!'
																									});
																						});
																	} else {
																		return false;
																	}
																});

											}
										}
									},
									{
										text : "查询用户",
										iconCls : "icon-search",
										handler : function() {
											$("#main")
													.layout("expand", "north");
										}
									},
									{
										text : "取消",
										iconCls : "icon-redo",
										handler : function() {
											//回滚数据 
											$("#id_user").datagrid(
													"rejectChanges");
											$("#main").layout("collapse",
													"north");
										}
									} ],
							onAfterEdit : function(index, record) {

								$.post(flag == "add" ? "addCom.action": "updateCom.action", record, function(result) {
									$.messager.show({
										title : '提示信息',
										msg : '操作成功!'
									});
								});
							}
						});
		$("#searchComCus").click(function() {
			$("#id_user").datagrid("load", serializeForm($("#mysearch")));
		});
		$("#clearComCus").click(function() {
			$("#mysearch").get(0).reset();
			$("#id_user").datagrid("load", {});
		});
	});
	/*-----------------------------------商品档案表格数据初始化---------------------------------------*/

	//js方法：序列化表单 			
	function serializeForm(form) {
		var obj = {};
		$.each(form.serializeArray(), function(index) {
			if (obj[this["name"]]) {
				obj[this["name"]] = obj[this["name"]] + "," + this["value"];
			} else {
				obj[this["name"]] = this["value"];
			}
		});
		return obj;
	}
</script>
</head>
<body class="easyui-layout" id="main"
	style="width: 100%; height: 100%; background-color: white;">
	<div region="north" title="用戶查询" iconCls="icon-search" collapsed=true  style="height: 100px;">
		<br>
		<form id="mysearch" name="mysearch" method="post">
			客户名称:&nbsp;&nbsp;&nbsp;<input name="cc.cus_name" type="text" value="" />
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 商品分类:<input name="cc.g_class"
				type="text" value="" /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 商品名称:<input
				type="text" name="cc.g_name" value="" />
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a id="searchComCus"
				class="easyui-linkbutton">查询</a> <a id="clearComCus"
				class="easyui-linkbutton">清空</a>
		</form>
	</div>
	<div region="center" style="padding: 5px; background-color: white;">
		<table id="id_user"></table>
	</div>
	<!-- -----------------新增和修改商品档案代码----------------------- -->
	<div id="mydialog" class="easyui-dialog"
		style="width: 800px; height: 350px; padding: 20px;" title="新增商品"
		closed=true iconCls="icon-add">
		<form action="" id="myform" method="post">
			<!-- g_id隐藏域对修改传递参数 -->
			<input type="hidden" id="g_id" name="cc.g_id">
			<table>
				<tr>
					<td>客户名称</td>
					<td><select name="cc.cus_name" id="cus_name"
						style="width: 160px;">
					</select></td>
					<td>商品分类</td>
					<td><input type="text" name="cc.g_class" id="g_class" /></td>
					<td>商品编码</td>
					<td><input type="text" name="cc.g_bill" id="g_bill" /></td>
				</tr>
				<tr>
					<td>商品名称</td>
					<td><input type="text" name="cc.g_name" id="g_name" /></td>
					<td>商品单位</td>
					<td><input type="text" name="cc.g_unit" id="g_unit" /></td>
					<td>商品重量(克)</td>
					<td><input type="text" name="cc.g_weight" id="g_weight" /></td>
				</tr>
				<tr>
					<td>商品包装数</td>
					<td><input type="text" name="cc.g_packamount" id="g_packamount" /></td>
					<td>商品规格</td>
					<td><input type="text" name="cc.g_standard" id="g_standard" /></td>
					<td>商品长(cm)</td>
					<td><input type="text" name="cc.g_length" id="g_length" /></td>
				</tr>
				<tr>
					<td>商品高(cm)</td>
					<td><input type="text" name="cc.g_height" id="g_height" /></td>
					<td>商品宽(cm)</td>
					<td><input type="text" name="cc.g_width" id="g_width" /></td>
					<td>包装单位</td>
					<td><input type="text" name="cc.g_packunit" id="g_packunit" /></td>
				</tr>
				<tr>
					<td>商品包装长(cm)</td>
					<td><input type="text" name="cc.g_packlength"
						id="g_packlength" /></td>
					<td>商品包装宽(cm)</td>
					<td><input type="text" name="cc.g_packwidth" id="g_packwidth" /></td>
					<td>商品包装高(cm)</td>
					<td><input type="text" name="cc.g_packheight" id="g_packheight" /></td>
				</tr>
				<tr>
					<td>包装重量(kg)</td>
					<td><input type="text" name="cc.g_packweight" id="g_packweight" /></td>
					<td>商品备注</td>
					<td><input type="text" name="cc.g_remarks" id="g_remarks" /></td>
					<td>商品价格(元)</td>
					<td><input type="text" name="cc.g_price" id="g_price" /></td>
				</tr>
				<tr>
					<td>商品预警值(单个)</td>
					<td><input type="text" name="cc.g_value" id="g_value" /></td>
					<td>商品有限期限(月)</td>
					<td><input type="text" name="cc.g_time" id="g_time" /></td>
					<td>是否有追踪追踪号</td>
					<td><input type="radio" name="cc.g_serial" id="g_serial1"
						value="是" checked="checked" />是 <input type="radio"
						name="cc.g_serial" id="g_serial2" value="否" />否</td>
				</tr>
				<tr align="center">
					<td colspan="3"><a id="btn" class="easyui-linkbutton">确认</a></td>
					<td><a id="btn1" class="easyui-linkbutton">关闭</a></td>
				</tr>
			</table>
		</form>
	</div>
	<!-- -----------------新增和修改商品档案代码----------------------- -->
</body>
</html>