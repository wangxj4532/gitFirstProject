<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户档案</title>
 <script type="text/javascript" src="../js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.2.6/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.2.6/themes/icon.css" />
	<script type="text/javascript" src="../js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
    $(function(){
    	$.ajax({
    		type:"post",
    		url:"../jcxx/showName.action",
    		cache:"false",
    		dataType:'json',
    		success:function(msg){
    			var str="<option></option>";
    			for(i=0;i<msg.length;i++){
    			   str=str+"<option>"+msg[i].sto_name+"</option>";    				
    			}
    			$("#hwywck_name").html(str);
    		}
    	});
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
    			$("#hwywshp_name").html(str);
    		}
    	});
    	$.ajax({
    		type:"post",
    		url:"../jcxx/showNameById.action",
    		cache:"false",
    		dataType:'json',
    		success:function(msg){
    			var str="<option></option>";
    			for(i=0;i<msg.length;i++){
    			   str=str+"<option>"+msg[i].car_bill+"</option>";    				
    			}
    			$("#hwychhw_bill").html(str);
    			$("#hwyrhw_bill").html(str);
    		}
    	});
    	
		var editing;//标记编辑状态
		var flag;//标记请求
    	$("#wl_huowuyiwei").datagrid({
    		idField:"ywvo.hwyw_bill",//id标识
    		rownumbers:true,//表格的行号
    		loadMsg:"数据正在加载，请耐心等待。。",
    		remoteSort:false,//定义不从服务器给数据排序。
    		url:"showYW.action",
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
    		      field:"ywvo.hwychhw_bill",
    		      title:"移出货位",
    		      width:100,
    		      align:"center",
    		      styler:function(value , record){//单元格的样式函数，返回样式字符串来自定义此单元格的样式，例如 'background:red' 
				       if(value=="纪晓岚"){
					      return 'background:blue;';
				       }
    		      },
    		      editor:{
    		    	  type:'combobox',
						options:{
							url:'../jcxx/showNameById.action',
							valueField:'car_bill', 
							textField:'car_bill',
							required:true , 
							missingMessage:'移出货位必填!'
						}
				  }
    		    },
    		    {
      		      field:"ywvo.hwyrhw_bill",
      		      title:"移入货位",
      		      width:100,
      		      align:"center",
      		      styler:function(value , record){//单元格的样式函数，返回样式字符串来自定义此单元格的样式，例如 'background:red' 
  				       if(value=="纪晓岚"){
  					      return 'background:blue;';
  				       }
      		      },
      		    editor:{
  		    	  type:'combobox' ,
						options:{
							url:'../jcxx/showNameById.action',
							valueField:'car_bill', 
							textField:'car_bill',
							required:true , 
							missingMessage:'移入货位必填!'
						}
				  }
      		    }, 
    		     {
    		    	 field:"ywvo.hwywshp_name",
    		    	 title:"移位商品",
    		    	 width:100,
    		    	 align:"center",
    		    	 editor:{
    	  		    	  type:'combobox' ,
    							options:{
    								url:'../jcxx/showInCom.action',
    								valueField:'g_name', 
    								textField:'g_name',
    								required:true , 
    								missingMessage:'移位商品必填!'
    							}
    					  }
    		     },     
    		     {
    		    		 field:"ywvo.hwywck_name",
    		    		 title:"移位仓库",
    		    		 width:150,
    		    		 align:"center",
    		    		 editor:{
    		  		    	  type:'combobox' ,
    								options:{
    									url:'../jcxx/showName.action',
    									valueField:'sto_name', 
    									textField:'sto_name',
    									required:true , 
    									missingMessage:'移位仓库必填!'
    								}
    						  }		
    		     },     
    		     {
    		    	     field:"ywvo.hwyw_num",
    		    	     title:"移位批次号",
    		    	     width:150,
    		    	     align:"center",
    		    	     formatter:function(value , record , index){
								return '<span title='+value+'>'+value+'</span>';
						 } ,
						 editor:{
								type:"validatebox", 
								options:{
										required:true , 
										missingMessage:"移位批次号必填!"
								}
							}
    		     },     
    		     {
    		    	     field:"ywvo.hwywbzhgg",
    		    	     title:"包装规格",
    		    	     width:100,
    		    	     align:"center",
    		    	     editor:{
								type:"validatebox",
								options:{
									required:true , 
									missingMessage:"包装规格必填!"
								}
							}
    		     },     
    		     {
    		    	     field:"ywvo.hwyw_amount",
    		    	     title:"商品数量",
    		    	     width:100,
    		    	     align:"center",
    		    	     editor:{
								type:"validatebox",
								options:{
									required:true , 
									missingMessage:"商品数量必填!",
								}
						 }
    		     },     
    		     {
    		    	     field:"ywvo.hwyw_reason",
    		    	     title:"移位原因",
    		    	     width:100,
    		    	     align:"center",
    		    	     sortable : true,
    		    	     editor:{
								type:"validatebox", 
								options:{
									required:true , 
									missingMessage:"移位原因必填!" 
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
    		    			 $('#wl_huowuyiwei').datagrid('unselectAll');//取消选中当前页所有的行。
    		    		     $("#wl_huowuyiwei").datagrid("appendRow",{});//追加一行
    		    		     editing=$("#wl_huowuyiwei").datagrid("getRows").length-1;//返回当前页的行。
    		    		     $("#wl_huowuyiwei").datagrid("beginEdit",editing);//开启编辑状态
    		    		 }
    		    	 }
    		       },
    		       {
    		    	 text:"修改客户",
      		    	 iconCls:"icon-edit",
      		    	 handler:function(){
      		    		var arr = $("#wl_huowuyiwei").datagrid("getSelections");//返回所有选中的行，当没有选中的记录时，将返回空数组。
						if(arr.length != 1){
								$.messager.show({
									title:"提示信息",
									msg:"只能选择一条记录进行修改!"
								});
						} else {
							if(editing == undefined){
								flag = "updata";
								//根据行记录对象获取该行的索引位置
								editing = $("#wl_huowuyiwei").datagrid("getRowIndex" , arr[0]);
								//开启编辑状态
								$("#wl_huowuyiwei").datagrid("beginEdit",editing);
							}
						}
      		    	 }	 
    		       },
    		       {
    		    	 text:"删除客户",
      		    	 iconCls:"icon-cancel",
      		    	 handler:function(){
      		    		var arr = $("#wl_huowuyiwei").datagrid("getSelections");
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
										str += arr[i]["ywvo.hwyw_bill"] + ",";
									}
									str = str.substring(0,str.length-1);
									$.post("deleteYW.action" , {str:str},function(result){
										 $('#wl_huowuyiwei').datagrid('unselectAll');//取消选中当前页所有的行。
										    $("#wl_huowuyiwei").datagrid("reload");
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
      		    	 text:"保存客户",
        		     iconCls:"icon-save",
        		     handler:function(){
        		    		if($("#wl_huowuyiwei").datagrid("validateRow",editing)){//验证指定的行，有效时返回 true。
        		    			$("#wl_huowuyiwei").datagrid("endEdit",editing);//结束编辑状态
        		    			 $("#wl_huowuyiwei").datagrid('unselectAll');//取消选中当前页所有的行。
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
							$("#wl_huowuyiwei").datagrid('rejectChanges');//回滚自从创建以来或最后一次调用acceptChanges以来所有更改的数据。
							editing = undefined;
							$("#main").layout("collapse","north");//关闭查询栏
							$("#mysearch").get(0).reset();//清空查询栏 
							$("#wl_huowuyiwei").datagrid("load" ,{});//数据重新加载。
      		    	 } 
    		       }
    		],
    	onAfterEdit:function(index , record){//当用户完成编辑一行时触发
    		
			$.post(flag=="add"?"addYW.action":"updateYW.action", record , function(result){
					$.messager.show({
						title:'提示信息',
						msg:'操作成功!'
					});
			});
		}
    	});
    	$("#searchYW").click(function(){
    		
   	    $("#wl_huowuyiwei").datagrid("load" ,serializeForm($("#mysearch")));
   	    });
     	$("#clearYW").click(function(){
   		     $("#mysearch").get(0).reset(); 
           	$("#wl_huowuyiwei").datagrid("load" ,{});
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
                                                    移出货位:<select name="ywvo.hwychhw_bill" id="hwychhw_bill" style="width:160px;">
		                   </select>
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					  移入货位:<select name="ywvo.hwyrhw_bill" id="hwyrhw_bill" style="width:160px;">
		                   </select>
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					  商品名称:<select name="ywvo.hwywshp_name" id="hwywshp_name" style="width:160px;">
		                   </select>
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					 仓库名称 :<select name="ywvo.hwywck_name" id="hwywck_name" style="width:160px;">
		                   </select>
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					      <a id="searchYW"  class="easyui-linkbutton">查询</a> 
					      <br>
					  移位批次号:<input name="ywvo.hwyw_num" class="easyui-validatebox"   style="width:160px;"  value="" />	
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					  包装规格:<input   name="ywvo.hwywbzhgg"   class="easyui-validatebox"  style="width:160px;"  value=""   />
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				           商品数量:&nbsp;&nbsp;&nbsp;<input name="ywvo.hwyw_amount" class="easyui-validatebox"  style="width:160px;"  value="" />
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					  移位原因:<input name="ywvo.hwyw_reason" class="easyui-validatebox"  style="width:160px;"  value="" />
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					      <a id="clearYW"  class="easyui-linkbutton">清空</a>
					    
                </form>
           </div>
           <div region="center" style="padding:5px;background-color:white;">
                <table id="wl_huowuyiwei"></table> 
           </div>
</body>
</html>