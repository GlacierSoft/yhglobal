<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<form method="post" style="padding:15px" id="ordersDispatching_add">
	<table class="formtable">
		<tr>
			<td>订单编号：</td>
			<td>
			    <input type="hidden" name="orderId" value="${orderDate.orderId }">
				<input type="text" class="easyui-validatebox spinner"  required="true" style="height:18px;width:180px" value="${orderDate.orderCode}" readonly="readonly" />
			</td>
			<td style="padding-left:20px;">价格总额：</td> 
		 	<td>
				<input type="text" class="easyui-validatebox spinner"  name="dispatchingGoodsDeposit"  required="true" style="height:18px;width:180px" value="${orderDate.orderPrice}" readonly="readonly" />
			</td> 
		 </tr>
		 <tr>
			<td>货物数量：</td>
			<td>
				<input type="text" class="easyui-validatebox spinner"  required="true" style="height:18px;width:180px" value="${orderDate.orderNum}" readonly="readonly" />
			</td>
			<td style="padding-left:20px;">订单状态：</td> 
		 	<td>
				<input id="orderStatus" name="orderStatus" required="true"  style="height:18px;width:180px;" class="easyui-validatebox spinner" readonly="readonly"/>
			</td> 
		 </tr>
		 <tr>
			<td>启禁状态：</td>
			<td>
				<input id="status" required="true"  style="height:18px;width:180px;" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
			<td style="padding-left:20px;">分配状态：</td> 
		 	<td>
				<input id="distributeStatus" required="true"  style="height:18px;width:180px;" class="easyui-validatebox spinner" readonly="readonly"/>
			</td> 
		 </tr>
		<tr>
			<td colspan="4">
			承运商：<input id="belaidup_mgr_belaidup_form_carrierDisplay" name="carrierId" class="easyui-combogrid"  style="width:125px;height: 20px;"  required="true" />
			车辆：<input id="belaidup_mgr_belaidup_form_carDisplay" name="carId"  style="width:125px;height: 20px;"  required="true" class="easyui-combogrid"  />
			配送：<input id="belaidup_mgr_belaidup_form_driverDisplay" name="driverId"  style="width:125px;height: 20px;"  required="true" class="easyui-combogrid" />
	      	</td>
	    </tr>

	</table>   
</form>

<!-- <a href="javascript: CheckOne();">点击查看详情</a>  -->
 

<script type="text/javascript">
     
	//用于combogrid的客户信息绑定
	$('#belaidup_mgr_belaidup_form_carrierDisplay').combogrid({
		panelWidth:450,
		fit:true,//控件自动resize占满窗口大小
		//iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
	   idField:'carrierMemberId',    
	   textField:'memberName',    
	   url: ctx + '/do/carrierMember/list.json?status=enable&audit_state=pass',
	   sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
	   columns : [ [ 
			{
				field:'carrierMemberId',
				title:'ID',
				checkbox:true
			},{
				field : 'memberName',
				title : '承运商',
				width : 80,
				sortable:true
			}, {
				field : 'memberType',
				title : '类型',
				width : 120,
				sortable : true,
				formatter : function(value, row, index) {
					return renderGridValue(value, fields.memberType);
				}
			 }, {
				field : 'status',
				title : '状态',
				width : 120,
				sortable : true,
				formatter : function(value, row, index) {
					return renderGridValue(value, fields.status);
				}
			}] ],
			pagination : true,//True 就会在 datagrid 的底部显示分页栏
			pageSize : 10,//注意，pageSize必须在pageList存在
			pageList : [2,10,50,100],//从session中获取
			rownumbers : true,//True 就会显示行号的列
		loadMsg : '数据加载中....',
		mode : 'remote',
		delay : 200,
		onSelect: function (rowIndex, rowData){
			  $('#belaidup_mgr_belaidup_form_carDisplay').combogrid("clear");
			  $('#belaidup_mgr_belaidup_form_driverDisplay').combogrid("clear");
			   doCheck_Carrier(rowData.carrierMemberId);
		},
		onLoadSuccess: function(){   
			var rows= $('#belaidup_mgr_belaidup_form_carrierDisplay').combogrid('grid').datagrid('getRows');
			if(rows.length>0)
				$('#belaidup_mgr_belaidup_form_carrierDisplay').combogrid('grid').datagrid('selectRow',0);
			else{
				$('#belaidup_mgr_belaidup_form_carDisplay').combogrid("grid").datagrid("reload", {'carrierMemberId':0});
				$('#belaidup_mgr_belaidup_form_driverDisplay').combogrid("grid").datagrid("reload", {'carrierMemberId':0});
			}
		} 
	});
	
	function doCheck_Carrier(carrierMemberId){
		
		//用于combogrid的客户信息绑定
		 $('#belaidup_mgr_belaidup_form_carDisplay').combogrid({
			panelWidth:450,
			fit:true,//控件自动resize占满窗口大小
			//iconCls:'icon-save',//图标样式
			border:false,//是否存在边框
			fitColumns:true,//自动填充行
			nowrap: true,//禁止单元格中的文字自动换行
			autoRowHeight: false,//禁止设置自动行高以适应内容
			striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
			singleSelect:true,//限制单选
			checkOnSelect:false,//选择复选框的时候选择该行
			selectOnCheck:false,//选择的时候复选框打勾
		    idField:'carId',    
		    textField:'plateNumber',    
		    url: ctx + '/do/carrierCarInformation/list.json?carStatus=enable&transportStatus=wait&auditState=pass&carrierMemberId='+carrierMemberId,
		    sortName: 'createTime',//排序字段名称
			sortOrder: 'ASC',//升序还是降序
			remoteSort: true,//开启远程排序，默认为false
		    columns : [ [ 
				{
					field:'carId',
					title:'ID',
					checkbox:true
				},{
					field : 'plateNumber',
					title : '车辆牌照',
					width : 80,
					sortable:true
				}, {
					field : 'carrierMemberRealName',
					title : '所属承运商',
					width : 120,
					sortable : true
				 }, {
					field : 'transportStatus',
					title : '运输状态',
					width : 120,
					sortable : true,
					formatter : function(value, row, index) {
						return renderGridValue(value, fields.transportStatus);
					}
				},{
					field : 'carStatus',
					title : '车辆状态',
					width : 120,
					sortable : true,
					formatter : function(value, row, index) {
						return renderGridValue(value, fields.status);
					}
				}] ],
				pagination : true,//True 就会在 datagrid 的底部显示分页栏
				pageSize : 10,//注意，pageSize必须在pageList存在
				pageList : [2,10,50,100],//从session中获取
				rownumbers : true,//True 就会显示行号的列
			loadMsg : '数据加载中....',
			mode : 'remote',
			delay : 200,
			onSelect: function (rowIndex, rowData){
				  $('#belaidup_mgr_belaidup_form_driverDisplay').combogrid("clear");
				  doCheck_Car(rowData.carrierMemberId);
				  //$('#belaidup_mgr_belaidup_form_driverDisplay').combogrid("grid").datagrid("reload", {'carrierMemberId':rowData.carrierMemberId});
				  //var rows= $('#belaidup_mgr_belaidup_form_driverDisplay').combogrid('grid').datagrid('getRows');
				 
				 
			},
			onLoadSuccess: function(){   
				var rows= $('#belaidup_mgr_belaidup_form_carDisplay').combogrid('grid').datagrid('getRows');
				if(rows.length>0)
					$('#belaidup_mgr_belaidup_form_carDisplay').combogrid('grid').datagrid('selectRow',0);
				else{
					$('#belaidup_mgr_belaidup_form_driverDisplay').combogrid("grid").datagrid("reload", {'carrierMemberId':0});
				}
			} 
		});
	};
	
	
	
	function doCheck_Car(carrierMemberId){
    	 //用于combogrid的客户信息绑定
    	 $('#belaidup_mgr_belaidup_form_driverDisplay').combogrid({
    		panelWidth:450,
    		fit:true,//控件自动resize占满窗口大小
    		//iconCls:'icon-save',//图标样式
    		border:false,//是否存在边框
    		fitColumns:true,//自动填充行
    		nowrap: true,//禁止单元格中的文字自动换行
    		autoRowHeight: false,//禁止设置自动行高以适应内容
    		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
    		singleSelect:true,//限制单选
    		checkOnSelect:false,//选择复选框的时候选择该行
    		selectOnCheck:false,//选择的时候复选框打勾
    	    idField:'driverId',    
    	    textField:'driverName',    
    	    url: ctx + '/do/carrierDriver/list.json?status=enable&auditState=pass&driverStatus=wait&carrierMemberId='+carrierMemberId,
    	    sortName: 'createTime',//排序字段名称
    		sortOrder: 'ASC',//升序还是降序
    		remoteSort: true,//开启远程排序，默认为false
    	    columns : [ [ 
    			{
    				field:'driverId',
    				title:'ID',
    				checkbox:true
    			}, {
    				field : 'driverName',
    				title : '配送员',
    				width : 80,
    				sortable:true
    			}, {
    				field : 'carrierDisplay',
    				title : '所属承运商',
    				width : 120,
    				sortable : true
    			 },{
    				field : 'status',
    				title : '启用状态',
    				width : 120,
    				sortable : true,
    				formatter : function(value, row, index) {
    					return renderGridValue(value, fields.status);
    				}
    			 }, {
    				field : 'driverStatus',
    				title : '配送状态',
    				width : 120,
    				sortable : true,
    				formatter : function(value, row, index) {
    					return renderGridValue(value, fields.transportStatus);
    				}
    			}] ],
    			pagination : true,//True 就会在 datagrid 的底部显示分页栏
    			pageSize : 10,//注意，pageSize必须在pageList存在
    			pageList : [2,10,50,100],//从session中获取
    			rownumbers : true,//True 就会显示行号的列
    		loadMsg : '数据加载中....',
    		mode : 'remote',
    		delay : 200,
    		onLoadSuccess: function(){
    			//var data=$('#belaidup_mgr_belaidup_form_driverDisplay').combogrid('grid').datagrid('getSelected');
    			var rows= $('#belaidup_mgr_belaidup_form_driverDisplay').combogrid('grid').datagrid('getRows');
    			if(rows.length>0)
				$('#belaidup_mgr_belaidup_form_driverDisplay').combogrid('grid').datagrid('selectRow',0); 
    		 }
    	}); 
      };
     
	
	  //下拉框数初始化
	 $('#orderStatus').val(renderGridValue('${orderDate.orderStatus}',fields.orderStatus));
	 $('#status').val(renderGridValue('${orderDate.status}',fields.status));
	 $('#distributeStatus').val(renderGridValue('${orderDate.distributeStatus}',fields.distributeStatus));
	 
	 function CheckOne(){
		alert($("#ordersDispatching_add").serialize());
	}
</script> 