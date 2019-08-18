<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>出入库管理</title>
 <script type="text/javascript" src="../js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.2.6/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.2.6/themes/icon.css" />
	<script type="text/javascript" src="../js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
    $(function(){
    	$.ajax({
    		type:"post",
    		url:"../jcxx/showInCom.action",
    		cache:"false",
    		dataType:'json',
    		success:function(msg){
    			var str="<option></option>";
    			for(i=0;i<msg.length;i++){
    			   str=str+"<option>"+msg[i].g_name+"</option>";    				
    			}
    			$("#chkmxshp_name").html(str);
    		}
    	});

//----------页面加载时直接加载表格数据--------------------------------------------------------------
		var editing;//标记编辑状态
		var flag;//标记请求
    	$("#wl_chkdmx").datagrid({
    		idField:"cmxv.chkmx_bill",//id标识
    		rownumbers:true,//表格的行号
    		loadMsg:"数据正在加载，请耐心等待。。",
    		remoteSort:false,//定义不从服务器给数据排序。
    		url:"showCMX.action",
    		fitColumns:true,//表格宽度自适应大小。
    		striped:true,//隔行变色。
    		frozenColumns:[[//和列的特性一样，但是这些列将被冻结在左边。
							{field:"ck" , checkbox:true}//True 就显示 checkbox。									
			]],
            rowStyler:function(index,record){//返回例如 'background:red' 的样式，
    			if(record.age>30){
    				return "background:yellow";
    			}
    		},
    		columns:[[
    	    		   
    		   {
    		      field:"cmxv.chkhw_num",
    		      title:"货物批次号",
    		      width:100,
    		      align:"center",
    		      formatter:function(value , record , index){
						return '<span title='+value+'>'+value+'</span>';
				 }
    		    },     
    		     {
    		    	 field:"cmxv.chkmxchkd_id",
    		    	 title:"出库单编号",
    		    	 width:100,
    		    	 align:"center",
    		    	 formatter:function(value , record , index){
							return '<span title='+value+'>'+value+'</span>';
					 } 
    		     },     
    		     {
    		    	     field:"cmxv.chkmxshp_name",
    		    	     title:"商品名称",
    		    	     width:150,
    		    	     align:"center",
    		    	     formatter:function(value , record , index){
								return '<span title='+value+'>'+value+'</span>';
						 }
    		     },     
    		     {
    		    	     field:"cmxv.chkmx_amount",
    		    	     title:"商品数量",
    		    	     width:100,
    		    	     align:"center"
    		     },     
    		     {
    		    	     field:"cmxv.chkhw",
    		    	     title:"货位",
    		    	     width:100,
    		    	     align:"center"
    		     },     
    		     {
    		    	     field:"cmxv.chkshch_date",
    		    	     title:"生产日期",
    		    	     width:100,
    		    	     align:"center" 
    		     },     
    		     {
    		    	     field:"cmxv.chkyxq",
    		    	     title:"出库有效期",
    		    	     width:100,
    		    	     align:"center",
    		    	     sortable : true
    		     }
    		]],
    		pagination:true,//True 就会在 datagrid 的底部显示分页栏。
    		pageSize:5,//当设置了 pagination 特性时，初始化页码尺寸。
    		pageList:[5,10,15,20],//当设置了 pagination 特性时，初始化页面尺寸的选择列表。
    		toolbar:[
    		       {
										text : "删除用户",
										iconCls : "icon-cancel",
										handler : function() {
											var arr = $("#wl_chkdmx").datagrid(
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
																			str = arr[i]["cmxv.chkmx_bill"]+ ",";
																		}
																		str = str.substring(0,str.length - 1);
																		$.post("deleteCMX.action",{str : str},function() {
																							//1 刷新数据表格 
																							$("#wl_chkdmx").datagrid("reload");
																							//2 清空idField   
																							$('#wl_chkdmx').datagrid('unselectAll');
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
      		    	 text:"查询出库单",
        		    	 iconCls:"icon-search",
        		    	 handler:function(){
        		    		$("#main").layout("expand","north");
        		    	 } 
      		       },
    		       {
    		    	 text:"取消",
      		    	 iconCls:"icon-redo",
      		    	 handler:function(){
      		    		//回滚数据 
							$("#wl_chkdmx").datagrid('rejectChanges');//回滚自从创建以来或最后一次调用acceptChanges以来所有更改的数据。
							editing = undefined;
							$("#main").layout("collapse","north");//关闭查询栏
							$("#mysearch").get(0).reset();//清空查询栏 
							$("#wl_chkdmx").datagrid("load" ,{});//数据重新加载。
      		    	 } 
    		       }
    		],
    	});
    	$("#searchCMX").click(function(){
    		
   	    $("#wl_chkdmx").datagrid("load" ,serializeForm($("#mysearch")));
   	    });
     	$("#clearCMX").click(function(){
   		     $("#mysearch").get(0).reset(); 
           	$("#wl_chkdmx").datagrid("load" ,{});
        });
      });
    //js方法：序列化表单 			
	function serializeForm(form){
		var obj = {};
		$.each(form.serializeArray(),function(index){
			if(obj[this["name"]]){
				obj[this["name"]] = obj[this["name"]] + ","+this["value"];
			} else {
				obj[this["name"]] =this["value"];
			}
		});
		return obj;
	}
</script>
</head>
<body  class="easyui-layout"  id="main" style="width:100%;height:100%;background-color:white;" >
       <div region="north" title="出库单查询"  iconCls="icon-search"  collapsed=true style="height:100px;">
                <br>
                <form id="mysearch" name="mysearch" method="post">
                                                   货物批次号:<input name="cmxv.chkhw_num" class="easyui-validatebox"  style="width:160px;"  value="" />
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					  商品名称:<select name="cmxv.chkmxshp_name" id="chkmxshp_name" style="width:160px;">
		                   </select>
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					   生产日期:<input name="cmxv.chkshch_date" class="easyui-validatebox"  style="width:160px;"  value="" />
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					      <a id="searchCMX"  class="easyui-linkbutton">查询</a> 
					      <a id="clearCMX"  class="easyui-linkbutton">清空</a>
                </form>
           </div>
           <div region="center" style="padding:5px;background-color:white;">
                <table id="wl_chkdmx"></table> 
           </div>
</body>
</html>