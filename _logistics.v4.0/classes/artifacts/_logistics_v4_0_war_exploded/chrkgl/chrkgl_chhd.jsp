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
    	$("#btn").click(function() {

			$.ajax({
				type : "post",
				url :"addCMX.action" ,
				cache : false,
				data : $("#myform").serialize(),
				success : function() {
					//1 关闭窗口
					$("#mydialog").dialog("close");
					$("#wl_chhd").datagrid("unselectAll");
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
    	$("#wl_chhd").datagrid({
    		idField:"chdv.chk_bill",//id标识
    		rownumbers:true,//表格的行号
    		loadMsg:"数据正在加载，请耐心等待。。",
    		remoteSort:false,//定义不从服务器给数据排序。
    		url:"showCHD.action",
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
    		      field:"chdv.chk_bm",
    		      title:"出库单编码",
    		      width:100,
    		      align:"center",
    		      formatter:function(value , record , index){
						return '<span title='+value+'>'+value+'</span>';
				 },
    		      editor:{
						type:"validatebox", 
						options:{
							required:true , 
							missingMessage:"出库单编码必填!" 
						}
					}
    		    },     
    		     {
    		    	 field:"chdv.chk_date",
    		    	 title:"出库日期",
    		    	 width:100,
    		    	 align:"center",
    		    	 formatter:function(value , record , index){
							return '<span title='+value+'>'+value+'</span>';
					 } ,
					 editor:{
							type:"datebox", 
							options:{
								required:true , 
								missingMessage:"出库日期必填!" 
							}
						}
    		     },     
    		     {
    		    	     field:"chdv.cus_name",
    		    	     title:"客户名称",
    		    	     width:150,
    		    	     align:"center",
    		    	     formatter:function(value , record , index){
								return '<span title='+value+'>'+value+'</span>';
						 } ,
						 editor:{
		    		    	  type:'combobox',
								options:{
									url:'../ddgl/showComCus.action',
									valueField:'cus_name', 
									textField:'cus_name',
									required:true , 
									missingMessage:'客户名称必填!'
								}
						  }
    		     },     
    		     {
    		    	     field:"chdv.chkdd_bill",
    		    	     title:"客户订单编号",
    		    	     width:100,
    		    	     align:"center",
    		    	     editor:{
		    		    	  type:'combobox',
								options:{
									url:'../ddgl/findAllBill.action',
									valueField:'khchkdd_bill', 
									textField:'khchkdd_bill',
									required:true , 
									missingMessage:'客户订单编号必填!'
								}
						  }
    		     },     
    		     {
    		    	     field:"chdv.rec_name",
    		    	     title:"收货单位",
    		    	     width:100,
    		    	     align:"center",
    		    	     editor:{
      	    		    	  type:'combobox',
      							options:{
      								url:'../jcxx/showRec_name.action',
      								valueField:'rec_name', 
      								textField:'rec_name',
      								required:true , 
      								missingMessage:'收货单位必填!'
      							}
      					  }
    		     },     
    		     {
    		    	     field:"chdv.chkorccpxh",
    		    	     title:"出库类型",
    		    	     width:100,
    		    	     align:"center",
    		    	     formatter:function(value , record , index){
								if(value == 1){
									return '<span style=color:red; >正品出库</span>' ;
								} else if( value == 0){
									return '<span style=color:green; >残次品库</span>' ; 
								}
				} , 
 		    	     editor:{
								type:'combobox' ,
								options:{
									data:[{id:1 , val:'正品出库'},{id:0 , val:'残次品库'}] ,
									valueField:'id' , 
									textField:'val' ,
									required:true , 
									missingMessage:'出库类型必填!'
								}
							}
    		     },     
    		     {
    		    	     field:"chdv.sh_date",
    		    	     title:"送货日期",
    		    	     width:100,
    		    	     align:"center",
    		    	     sortable : true,
    		    	     editor:{
								type:"datebox", 
								options:{
									required:true , 
									missingMessage:"送货日期必填!" 
								}
							}
    		     },     
    		     {
    		    	     field:"chdv.shh_man",
    		    	     title:"收货人",
    		    	     width:100,
    		    	     align:"center",
    		    	     sortable : true,
    		    	     editor:{
								type:"validatebox", 
								options:{
									required:true , 
									missingMessage:"收货人必填!" 
								}
							}
    		     },     
    		     {
    		    	     field:"chdv.shh_tel",
    		    	     title:"收货人电话",
    		    	     width:100,
    		    	     align:"center",
    		    	     sortable : true,
    		    	     editor:{
								type:"validatebox",
								options:{
									required:true , 
									missingMessage:"收货人电话必填!"
								}
							}
    		     },
    		     {
    		    	     field:"chdv.chk_way",
    		    	     title:"出库方式",
    		    	     width:100,
    		    	     align:"center",
    		    	     sortable : true,
    		    	     editor:{
								type:"validatebox",
								options:{
									required:true , 
									missingMessage:"出库方式必填!"
								}
							}
    		     },
    		     {
    		    	     field:"chdv.sh_way",
    		    	     title:"送货方式",
    		    	     width:100,
    		    	     align:"center",
    		    	     sortable : true,
    		    	     editor:{
								type:"validatebox",
								options:{
									required:true , 
									missingMessage:"送货方式必填!"
								}
							}
    		     }
    		]],
    		pagination:true,//True 就会在 datagrid 的底部显示分页栏。
    		pageSize:5,//当设置了 pagination 特性时，初始化页码尺寸。
    		pageList:[5,10,15,20],//当设置了 pagination 特性时，初始化页面尺寸的选择列表。
    		toolbar:[
    		       {
    		    	 text:"新增出库单",
    		    	 iconCls:"icon-add",
    		    	 handler:function(){ 
    		    		 if(editing==undefined){
    		    			 flag="add";
    		    			 $('#wl_chhd').datagrid('unselectAll');//取消选中当前页所有的行。
    		    		     $("#wl_chhd").datagrid("appendRow",{});//追加一行
    		    		     editing=$("#wl_chhd").datagrid("getRows").length-1;//返回当前页的行。
    		    		     $("#wl_chhd").datagrid("beginEdit",editing);//开启编辑状态
    		    		 }
    		    	 }
    		       },
    		       {
    		    	 text:"修改出库单",
      		    	 iconCls:"icon-edit",
      		    	 handler:function(){
      		    		var arr = $("#wl_chhd").datagrid("getSelections");//返回所有选中的行，当没有选中的记录时，将返回空数组。
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
								editing = $("#wl_chhd").datagrid("getRowIndex" , arr[0]);
								//开启编辑状态
								$("#wl_chhd").datagrid("beginEdit",editing);
							}
						}
      		    	 }	 
    		       },
    		       {
      		    	 text:"添加出库单明细",
        		    	 iconCls:"icon-add",
        		    	 handler:function(){
        		    		var arr = $("#wl_chhd").datagrid("getSelections");
  						if(arr.length!=1){
  							$.messager.show({
  								title:"提示信息",
  								msg:"只能选择一条添加明细!"
  							});											
  						} else {
  									$("#chkmxchkd_id").val(arr[0]["chdv.chk_bill"]);
  									$("#mydialog").dialog("open");
  						} 
        		    	 }	
      		       },
    		       {
      		    	 text:"保存出库单",
        		     iconCls:"icon-save",
        		     handler:function(){
        		    		if($("#wl_chhd").datagrid("validateRow",editing)){//验证指定的行，有效时返回 true。
        		    			$("#wl_chhd").datagrid("endEdit",editing);//结束编辑状态
        		    			 $("#wl_chhd").datagrid('unselectAll');//取消选中当前页所有的行。
        		    			    editing=undefined;
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
							$("#wl_chhd").datagrid('rejectChanges');//回滚自从创建以来或最后一次调用acceptChanges以来所有更改的数据。
							editing = undefined;
							$("#main").layout("collapse","north");//关闭查询栏
							$("#mysearch").get(0).reset();//清空查询栏 
							$("#wl_chhd").datagrid("load" ,{});//数据重新加载。
      		    	 } 
    		       }
    		],
    	onAfterEdit:function(index , record){//当用户完成编辑一行时触发
    		
			$.post(flag=="add"?"addCHD.action":"updateCHD.action", record , function(result){
					$.messager.show({
						title:'提示信息',
						msg:'操作成功!'
					});
			});
		}
    	});
    	$("#searchCHD").click(function(){
    		
   	    $("#wl_chhd").datagrid("load" ,serializeForm($("#mysearch")));
   	    });
     	$("#clearCHD").click(function(){
   		     $("#mysearch").get(0).reset(); 
           	$("#wl_chhd").datagrid("load" ,{});
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
                                                   出库单编码:&nbsp;&nbsp;&nbsp;<input name="chdv.chk_bm" class="easyui-validatebox"  style="width:160px;"  value="" />
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					  出库日期:&nbsp;&nbsp;&nbsp;<input name="chdv.chk_date" class="easyui-datebox"  style="width:160px;"  value="" />
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
					   收货人:&nbsp;&nbsp;&nbsp;<input name="chdv.shh_man" class="easyui-validatebox"  style="width:160px;"  value="" />
					      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					      <a id="searchCHD"  class="easyui-linkbutton">查询</a> 
					      <a id="clearCHD"  class="easyui-linkbutton">清空</a>
                </form>
           </div>
           <div region="center" style="padding:5px;background-color:white;">
                <table id="wl_chhd"></table> 
           </div>
<!-- -------------------------------------------------------------------------------------------- -->          
           <div id="mydialog" class="easyui-dialog"
		style="width: 800px; height: 300px; padding: 20px;" title="添加出库单明细"
		closed=true iconCls="icon-add">
		<form action="" id="myform" method="post">
			<table>
				<tr>
					<td>商品名称</td>
					<td><select name="cmxv.chkmxshp_name" id="chkmxshp_name"
						style="width: 160px;">
					</select></td>
					<td>货物批次号</td>
					<td><input type="text" name="cmxv.chkhw_num" id="chkhw_num" /></td>
					<td>商品数量</td>
					<td><input type="text" name="cmxv.chkmx_amount" id="chkmx_amount" /></td>
				</tr>
				<tr>
					<td>货位</td>
					<td><input type="text" name="cmxv.chkhw" id="chkhw" /></td>
					<td>有效期限(月)</td>
					<td><input type="text" name="cmxv.chkyxq" id="chkyxq" /></td>
					<td>生产日期</td>
					<td><input type="text" name="cmxv.chkshch_date" class="easyui-datebox"  id="chkshch_date" /></td>
				</tr>
				<tr>
					<td>出库单编号</td>
					<td><input type="text" name="cmxv.chkmxchkd_id" id="chkmxchkd_id" /></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr align="center">
					<td colspan="3"><a id="btn" class="easyui-linkbutton">确认</a></td>
					<td><a id="btn1" class="easyui-linkbutton">关闭</a></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>