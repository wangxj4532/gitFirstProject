<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../tag.jsp"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>库房管理</title>
 <script type="text/javascript" src="../js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.2.6/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.2.6/themes/icon.css" />
	<script type="text/javascript" src="../js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
    $(function(){
		var editing;//标记编辑状态
		var flag;//标记请求
    	$("#wl_stoFile").datagrid({
    		idField:"sto.sto_id",//id标识
    		rownumbers:true,//表格的行号
    		loadMsg:"数据正在加载，请耐心等待。。",
    		remoteSort:false,//定义不从服务器给数据排序。
    		url:"show.action",
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
    		      field:"sto.sto_bill",
    		      title:"库房编号",
    		      width:100,
    		      align:"center",
    		      styler:function(value , record){//单元格的样式函数，返回样式字符串来自定义此单元格的样式，例如 'background:red' 
				       if(value=="纪晓岚"){
					      return 'background:blue;';
				       }
    		      },
    		      editor:{
				        type:"validatebox" ,
				        options:{
						        required:true , 
						        missingMessage:"库房编号必填!"
				        }
				  }
    		    },     
    		     {
    		    	 field:"sto.sto_name",
    		    	 title:"库房名称",
    		    	 width:100,
    		    	 align:"center",
    		    	 editor:{
							type:"validatebox",
							options:{
								required:true , 
								missingMessage:"库房名称必填!" 
							}
						}
    		     },     
    		     {
    		    		 field:"sto.sto_phone",
    		    		 title:"库房电话",
    		    		 width:150,
    		    		 align:"center",
						 editor:{
							type:"validatebox", 
							options:{
									required:true , 
									missingMessage:"库房电话必填!"
							}
						}			
    		     },     
    		     {
    		    	     field:"sto.sto_addr",
    		    	     title:"库房地址",
    		    	     width:150,
    		    	     align:"center",
    		    	     formatter:function(value , record , index){
								return '<span title='+value+'>'+value+'</span>';
						 } ,
						 editor:{
								type:"validatebox", 
								options:{
										required:true , 
										missingMessage:"库房地址必填!"
								}
							}
    		     },     
    		     {
    		    	     field:"sto.sto_man",
    		    	     title:"库房负责人",
    		    	     width:100,
    		    	     align:"center",
    		    	     editor:{
								type:"validatebox",
								options:{
									required:true , 
									missingMessage:"库房负责人必填!"
								}
							}
    		     }
    		]],
    		pagination:true,//True 就会在 datagrid 的底部显示分页栏。
    		pageSize:5,//当设置了 pagination 特性时，初始化页码尺寸。
    		pageList:[5,10,15,20],//当设置了 pagination 特性时，初始化页面尺寸的选择列表。
    		toolbar:[
    		       {
    		    	 text:"新增收货单位",
    		    	 iconCls:"icon-add",
    		    	 handler:function(){ 
    		    		 if(editing==undefined){
    		    			 flag="add";
    		    			 $("#wl_stoFile").datagrid("unselectAll");//取消选中当前页所有的行。
    		    		     $("#wl_stoFile").datagrid("appendRow",{});//追加一行
    		    		     editing=$("#wl_stoFile").datagrid("getRows").length-1;//返回当前页的行。
    		    		     $("#wl_stoFile").datagrid("beginEdit",editing);//开启编辑状态
    		    		 }
    		    	 }
    		       },
    		       {
    		    	 text:"修改收货单位",
      		    	 iconCls:"icon-edit",
      		    	 handler:function(){
      		    		var arr = $("#wl_stoFile").datagrid("getSelections");//返回所有选中的行，当没有选中的记录时，将返回空数组。
      		    		
						if(arr.length != 1){
								$.messager.show({
									title:"提示信息",
									msg:"只能选择一条记录进行修改!"
								});
						} else {
							if(editing == undefined){
								flag = "update";
								//根据行记录对象获取该行的索引位置
								editing = $("#wl_stoFile").datagrid("getRowIndex" , arr[0]);
								//开启编辑状态
								$("#wl_stoFile").datagrid("beginEdit",editing);
							}
						}
      		    	 }	 
    		       },
    		       {
    		    	 text:"删除收货单位",
      		    	 iconCls:"icon-cancel",
      		    	 handler:function(){
      		    		var arr = $("#wl_stoFile").datagrid("getSelections");
						if(arr.length <= 0 ){
							$.messager.show({
								title:"提示信息",
								msg:"请选择进行删除操作!"
							});											
						} else {
							$.messager.confirm("提示信息" , "确认删除?", function(r){
								if(r){
									var str = "";
									for(var i = 0 ; i < arr.length ; i++){
										str += arr[i]["sto.sto_id"] + ",";
									}
									str = str.substring(0,str.length-1);
									$.post("delete.action" , {str:str},function(result){
										    $("#wl_stoFile").datagrid("reload");
											$.messager.show({
												title:"提示信息",
												msg:"操作成功!"
											});
									});
									
									
								} else {
									 return ;
								}
							});
						} 
      		    	 }	
    		       },
    		       {
      		    	 text:"保存收货单位",
        		     iconCls:"icon-save",
        		     handler:function(){
        		    		if($("#wl_stoFile").datagrid("validateRow",editing)){//验证指定的行，有效时返回 true。
        		    			$("#wl_stoFile").datagrid("endEdit",editing);//结束编辑状态
        		    			 $("#wl_stoFile").datagrid('unselectAll');//取消选中当前页所有的行。
        		    			    editing=undefined;
        		    		}
        		    	 }	
      		       },
      		       {
      		    	 text:"查询收货单位",
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
							$("#wl_stoFile").datagrid('rejectChanges');//回滚自从创建以来或最后一次调用acceptChanges以来所有更改的数据。
							editing = undefined;
							$("#main").layout("collapse","north");//关闭查询栏
							$("#mysearch").get(0).reset();//清空查询栏 
							$("#wl_stoFile").datagrid("load" ,{});//数据重新加载。
      		    	 } 
    		       }
    		],
    	onAfterEdit:function(index , record){//当用户完成编辑一行时触发
			$.post(flag=="add"?"add.action":"update.action", record , function(result){
					$.messager.show({
						title:'提示信息',
						msg:'操作成功!'
					});
			});
		}
    	});
    	$("#searchSto").click(function(){
   	            $("#wl_stoFile").datagrid("load" ,serializeForm($("#mysearch")));
   	    });
     	$("#clearSto").click(function(){
   		        $("#mysearch").get(0).reset(); 
            	$("#wl_stoFile").datagrid("load" ,{});
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
       <div region="north" title="用戶查询"  iconCls="icon-search"  collapsed=true style="height:100px;">
                <br>
                <form id="mysearch" name="mysearch" method="post">
                <input type="hidden" name="sto.sto_id"></input>
                <table style="width:800px;">
                      <tr>
                          <td>库房编号:</td>
                          <td><input name="sto.sto_bill" class="easyui-validatebox"  style="width:100px;"  value="" /></td>
                          <td>库房名称:</td>
                          <td><input name="sto.sto_name" class="easyui-validatebox"  style="width:100px;"  value="" /></td>
                          <td>库房电话:</td>
                          <td><input name="sto.sto_phone" class="easyui-validatebox"  style="width:100px;"  value="" /></td>
                      </tr>
                      <tr>
                          <td>库房地址:</td>
                          <td><input name="sto.sto_addr" class="easyui-validatebox"   style="width:100px;"  value="" /></td>
                          <td>库房负责人:</td>
                          <td><input   name="sto.sto_man"   class="easyui-validatebox"  style="width:100px;"  value=""   /></td>
                          <td><a id="searchSto"  class="easyui-linkbutton">查询</a></td>
                          <td> <a id="clearSto"  class="easyui-linkbutton">清空</a></td>
                      </tr>
                </table>
                </form>
           </div>
           <div region="center" style="padding:5px;background-color:white;">
                <table id="wl_stoFile"></table> 
           </div>
</body>
</html>