<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>权限组管理</title>
 <script type="text/javascript" src="../js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.2.6/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.2.6/themes/icon.css" />
	<script type="text/javascript" src="../js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
    $(function(){
		var editing;//标记编辑状态
		var flag;//标记请求
    	$("#wl_auth").datagrid({
    		idField:"id",//id标识
    		rownumbers:true,//表格的行号
    		loadMsg:"数据正在加载，请耐心等待。。",
    		remoteSort:false,//定义不从服务器给数据排序。
    		url:"showAuth.action",
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
    		      field:"auth.auth_id",
    		      title:"权限编号",
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
						        missingMessage:"权限编号必填!"
				        }
				  }
    		    },     
    		     {
    		    	 field:"auth.auth_name",
    		    	 title:"权限名称",
    		    	 width:100,
    		    	 align:"center",
    		    	 editor:{
							type:"validatebox",
							options:{
								required:true , 
								missingMessage:"权限名称必填!" 
							}
						}
    		     },     
    		     {
    		    		 field:"auth.auth_level",
    		    		 title:"权限级别",
    		    		 width:150,
    		    		 align:"center",
						 editor:{
							type:"validatebox", 
							options:{
									required:true , 
									missingMessage:"权限级别必填!"
							}
						}			
    		     }
    		]],
    		pagination:true,//True 就会在 datagrid 的底部显示分页栏。
    		pageSize:5,//当设置了 pagination 特性时，初始化页码尺寸。
    		pageList:[5,10,15,20],//当设置了 pagination 特性时，初始化页面尺寸的选择列表。
    		toolbar:[
    		       {
    		    	 text:"新增客户",
    		    	 iconCls:"icon-add",
    		    	 handler:function(){ 
    		    		 if(editing==undefined){
    		    			 flag="add";
    		    			 $('#wl_auth').datagrid('unselectAll');//取消选中当前页所有的行。
    		    		     $("#wl_auth").datagrid("appendRow",{});//追加一行
    		    		     editing=$("#wl_auth").datagrid("getRows").length-1;//返回当前页的行。
    		    		     $("#wl_auth").datagrid("beginEdit",editing);//开启编辑状态
    		    		 }
    		    	 }
    		       },
    		       {
    		    	 text:"修改客户",
      		    	 iconCls:"icon-edit",
      		    	 handler:function(){
      		    		var arr = $("#wl_auth").datagrid("getSelections");//返回所有选中的行，当没有选中的记录时，将返回空数组。
						if(arr.length != 1){
								$.messager.show({
									title:"提示信息",
									msg:"只能选择一条记录进行修改!"
								});
						} else {
							if(editing == undefined){
								flag = "updata";
								//根据行记录对象获取该行的索引位置
								editing = $("#wl_auth").datagrid("getRowIndex" , arr[0]);
								//开启编辑状态
								$("#wl_auth").datagrid("beginEdit",editing);
							}
						}
      		    	 }	 
    		       },
    		       {
      		    	 text:"保存客户",
        		     iconCls:"icon-save",
        		     handler:function(){
        		    		if($("#wl_auth").datagrid("validateRow",editing)){//验证指定的行，有效时返回 true。
        		    			$("#wl_auth").datagrid("endEdit",editing);//结束编辑状态
        		    			 $("#wl_auth").datagrid('unselectAll');//取消选中当前页所有的行。
        		    			    editing=undefined;
        		    		}
        		    	 }	
      		       },
      		       {
      		    	 text:"查询客户",
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
							$("#wl_auth").datagrid('rejectChanges');//回滚自从创建以来或最后一次调用acceptChanges以来所有更改的数据。
							editing = undefined;
							$("#main").layout("collapse","north");//关闭查询栏
							$("#mysearch").get(0).reset();//清空查询栏 
							$("#wl_auth").datagrid("load" ,{});//数据重新加载。
      		    	 } 
    		       }
    		],
    	onAfterEdit:function(index , record){//当用户完成编辑一行时触发
    		
			$.post(flag=="add"?"addAuth.action":"updateAuth.action", record , function(result){
					$.messager.show({
						title:'提示信息',
						msg:'操作成功!'
					});
			});
		}
    	});
    	$("#searchAuth").click(function(){
    		
   	    $("#wl_auth").datagrid("load" ,serializeForm($("#mysearch")));
   	    });
     	$("#clearAuth").click(function(){
   		     $("#mysearch").get(0).reset(); 
           	$("#wl_auth").datagrid("load" ,{});
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
       <div region="north" title="权限组查询"  iconCls="icon-search"  collapsed=true style="height:100px;">
                <br>
                <form id="mysearch" name="mysearch" method="post">
                                                   权限编号:&nbsp;&nbsp;&nbsp;<input name="auth.auth_id" class="easyui-validatebox"  style="width:160px;"  value="" />
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					  权限名称:<input name="auth.auth_name" class="easyui-validatebox"   style="width:160px;"  value="" />	
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					 权限级别:<input   name="auth.auth_level"   class="easyui-validatebox"  style="width:160px;"  value=""   />
					     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					     <a id="searchAuth"  class="easyui-linkbutton">查询</a> <a id="clearAuth"  class="easyui-linkbutton">清空</a>
                </form>
           </div>
           <div region="center" style="padding:5px;background-color:white;">
                <table id="wl_auth"></table> 
           </div>
</body>
</html>