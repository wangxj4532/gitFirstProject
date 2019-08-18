<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>入库订单</title>
 <script type="text/javascript" src="../js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
	<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.2.6/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.2.6/themes/icon.css" />
	<script type="text/javascript" src="../js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
    $(function(){
//----------页面加载时直接加载客户名称--------------------------------------------------------------
    	$.ajax({
    		type:"post",
    		url:"showComCus.action",
    		cache:"false",
    		dataType:'json',
    		success:function(msg){
    			var str="<option></option>";
    			for(i=0;i<msg.length;i++){
    				str=str+"<option>"+msg[i].cus_name+"</option>";    				
    			}
    			$("#cus_name").html(str);
    		}
    	});
//----------页面加载时直接加载商品名称--------------------------------------------------------------
    	$.ajax({
    		type:"post",
    		url:"showInCom.action",
    		cache:"false",
    		dataType:'json',
    		success:function(msg){
    			var str="<option></option>";
    			for(i=0;i<msg.length;i++){
    			   str=str+"<option>"+msg[i].g_name+"</option>";    				
    			}
    			$("#g_name").html(str);
    		}
    	});

//----------页面加载时直接加载表格数据--------------------------------------------------------------
		var editing;//标记编辑状态
		var flag;//标记请求
    	$("#wl_outOrder").datagrid({
    		idField:"occ.chkdd_bill",//id标识
    		rownumbers:true,//表格的行号
    		loadMsg:"数据正在加载，请耐心等待。。",
    		remoteSort:false,//定义不从服务器给数据排序。
    		url:"showOut.action",
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
    		      field:"occ.cus_name",
    		      title:"客户名称",
    		      width:100,
    		      align:"center",
    		      formatter:function(value , record , index){
						return '<span title='+value+'>'+value+'</span>';
				 } ,
    		      styler:function(value , record){//单元格的样式函数，返回样式字符串来自定义此单元格的样式，例如 'background:red' 
				       if(value=="纪晓岚"){
					      return 'background:blue;';
				       }
    		      },
    		      editor:{
    		    	  type:'combobox' ,
						options:{
							url:'showComCus.action',
							valueField:'cus_name', 
							textField:'cus_name',
							required:true , 
							missingMessage:'客户名称必填!'
						}
				  }
    		    },     
    		     {
    		    	 field:"occ.g_name",
    		    	 title:"商品名称",
    		    	 width:100,
    		    	 align:"center",
    		    	 formatter:function(value , record , index){
							return '<span title='+value+'>'+value+'</span>';
					 } ,
					 editor:{
	    		    	  type:'combobox',
							options:{
								url:'showInCom.action',
								valueField:'g_name', 
								textField:'g_name',
								required:true , 
								missingMessage:'客户名称必填!'
							}
					  }
    		     },     
    		     {
    		    	     field:"occ.khchkdd_bill",
    		    	     title:"订单编号",
    		    	     width:150,
    		    	     align:"center",
    		    	     formatter:function(value , record , index){
								return '<span title='+value+'>'+value+'</span>';
						 } ,
						 editor:{
								type:"validatebox", 
								options:{
										required:true , 
										missingMessage:"订单编号必填!"
								}
							}
    		     },     
    		     {
    		    	     field:"occ.khdd_amount",
    		    	     title:"商品数量",
    		    	     width:100,
    		    	     align:"center",
    		    	     editor:{
								type:"validatebox",
								options:{
									required:true , 
									missingMessage:"商品数量必填!"
								}
							}
    		     },     
    		     {
    		    	     field:"occ.chkorccphx",
    		    	     title:"出库类型",
    		    	     width:100,
    		    	     align:"center",
    		    	     formatter:function(value , record , index){
								if(value == 1){
									return '<span style=color:red; >正品出库</span>' ;
								} else if( value == 2){
									return '<span style=color:green; >残品出库</span>' ; 
								}
				} , 
 		    	     editor:{
								type:'combobox' ,
								options:{
									data:[{id:1, val:'正品出库'},{id:2 , val:'残品出库'}] ,
									valueField:'id' , 
									textField:'val' ,
									required:true , 
									missingMessage:'出库类型必填!'
								}
							}
    		     },     
    		     {
    		    	     field:"occ.chkddzht_status",
    		    	     title:"订单状态",
    		    	     width:100,
    		    	     align:"center",
    		    	     formatter:function(value , record , index){
								if(value == 1){
									return '<span style=color:red; >已出库</span>' ;
								} else if( value == 0){
									return '<span style=color:green; >预出库</span>' ; 
								}else if(value == 2){
									return '<span style=color:blue; >已取消</span>' ; 
								}
				} , 
 		    	     editor:{
								type:'combobox' ,
								options:{
									data:[{id:1 , val:'预出库'},{id:0 , val:'已出库'},{id:0 , val:'已取消'}] ,
									valueField:'id' , 
									textField:'val' ,
									required:true , 
									missingMessage:'订单状态必填!'
								}
							}
    		     },     
    		     {
    		    	     field:"occ.dd_date",
    		    	     title:"下单日期",
    		    	     width:100,
    		    	     align:"center",
    		    	     sortable : true,
    		    	     editor:{
								type:"datebox", 
								options:{
									required:true , 
									missingMessage:"下单日期必填!" 
								}
							}
    		     },     
    		     {
    		    	     field:"occ.yjchk_date",
    		    	     title:"预出库时间",
    		    	     width:100,
    		    	     align:"center",
    		    	     sortable : true,
    		    	     editor:{
								type:"datebox", 
								options:{
									required:true , 
									missingMessage:"预出库时间必填!" 
								}
							}
    		     },     
    		     {
    		    	     field:"occ.chkdd_man",
    		    	     title:"制单人",
    		    	     width:100,
    		    	     align:"center",
    		    	     sortable : true,
    		     },
    		     {
		    	     field:"occ.chkddzhd_time",
		    	     title:"制单时间",
		    	     width:100,
		    	     align:"center",
		    	     sortable : true,
		     }
    		]],
    		pagination:true,//True 就会在 datagrid 的底部显示分页栏。
    		pageSize:5,//当设置了 pagination 特性时，初始化页码尺寸。
    		pageList:[5,10,15,20],//当设置了 pagination 特性时，初始化页面尺寸的选择列表。
    		toolbar:[
    		       {
    		    	 text:"新增出库订单",
    		    	 iconCls:"icon-add",
    		    	 handler:function(){ 
    		    		 if(editing==undefined){
    		    			 flag="add";
    		    			 $('#wl_outOrder').datagrid('unselectAll');//取消选中当前页所有的行。
    		    		     $("#wl_outOrder").datagrid("appendRow",{});//追加一行
    		    		     editing=$("#wl_outOrder").datagrid("getRows").length-1;//返回当前页的行。
    		    		     $("#wl_outOrder").datagrid("beginEdit",editing);//开启编辑状态
    		    		 }
    		    	 }
    		       },
    		       {
    		    	 text:"修改出库订单",
      		    	 iconCls:"icon-edit",
      		    	 handler:function(){
      		    		var arr = $("#wl_outOrder").datagrid("getSelections");//返回所有选中的行，当没有选中的记录时，将返回空数组。
						if(arr.length != 1){
							alert(arr.length);
								$.messager.show({
									title:"提示信息",
									msg:"只能选择一条记录进行修改!"
								});
						} else {
							if(editing == undefined){
								flag = "updata";
								//根据行记录对象获取该行的索引位置
								editing = $("#wl_outOrder").datagrid("getRowIndex" , arr[0]);
								//开启编辑状态
								$("#wl_outOrder").datagrid("beginEdit",editing);
							}
						}
      		    	 }	 
    		       },
    		       {
      		    	 text:"保存出库订单",
        		     iconCls:"icon-save",
        		     handler:function(){
        		    		if($("#wl_outOrder").datagrid("validateRow",editing)){//验证指定的行，有效时返回 true。
        		    			$("#wl_outOrder").datagrid("endEdit",editing);//结束编辑状态
        		    			 $("#wl_outOrder").datagrid('unselectAll');//取消选中当前页所有的行。
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
							$("#wl_outOrder").datagrid('rejectChanges');//回滚自从创建以来或最后一次调用acceptChanges以来所有更改的数据。
							editing = undefined;
							$("#main").layout("collapse","north");//关闭查询栏
							$("#mysearch").get(0).reset();//清空查询栏 
							$("#wl_outOrder").datagrid("load" ,{});//数据重新加载。
      		    	 } 
    		       }
    		],
    	onAfterEdit:function(index , record){//当用户完成编辑一行时触发
    		
			$.post(flag=="add"?"addOut.action":"updateOut.action", record , function(result){
					$.messager.show({
						title:'提示信息',
						msg:'操作成功!'
					});
			});
		}
    	});
    	$("#searchOut").click(function(){
    		
   	    $("#wl_outOrder").datagrid("load" ,serializeForm($("#mysearch")));
   	    });
     	$("#clearOut").click(function(){
   		     $("#mysearch").get(0).reset(); 
           	$("#wl_outOrder").datagrid("load" ,{});
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
                                                   客户名称:<select name="occ.cus_name" id="cus_name" style="width:160px;">
		                   </select>
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					  商品名称:<select name="occ.g_name" id="g_name" style="width:160px;">
		                   </select>
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					  出库类型:<select name="occ.chkorccphx" id="RKorFPRK" style="width:160px;">
					           <option></option>
					           <option value="1">正品出库</option>
					           <option value="2">残品出库</option>
		                   </select>
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					   订单编号:&nbsp;&nbsp;&nbsp;<input name="icc.khchkdd_bill" class="easyui-validatebox"  style="width:160px;"  value="" />
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					      <a id="searchOut"  class="easyui-linkbutton">查询</a> 
					      <br>
					  商品数量:<input name="occ.khdd_amount" class="easyui-validatebox"   style="width:160px;"  value="" />	
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					  下单时间:<input   name="occ.dd_date"   class="easyui-datebox"  style="width:160px;"  value=""   />
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					  订单状态:<select name="occ.chkddzht_status" id="RKDD_status" style="width:160px;">
					           <option></option>
					           <option value="0">预出库</option>
					           <option value="1">已出库</option>
					           <option value="2">已取消</option>
		                   </select>
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					   预出库时间:<input name="occ.yjchk_date" class="easyui-datebox"  style="width:160px;"  value="" />
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					      <a id="clearOut"  class="easyui-linkbutton">清空</a>
                </form>
           </div>
           <div region="center" style="padding:5px;background-color:white;">
                <table id="wl_outOrder"></table> 
           </div>
</body>
</html>