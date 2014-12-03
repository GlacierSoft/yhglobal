<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	$.util.namespace('glacier.order_mgr.order_mgr.order');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.order_mgr.order_mgr.order.param = {
		toolbarId : 'orderDataGrid_toolbar',
		actions : {
	            edit:{flag:'edit',controlType:'single'},
	            del:{flag:'del',controlType:'multiple'},
	            dispatching:{flag:'dispatching',controlType:'single'}
	         }
     };

	//初始化DataGrid
	glacier.order_mgr.order_mgr.order.orderDataGrid = $('#orderDataGrid').datagrid({
		fit : true,//控件自动resize占满窗口大小
		iconCls : 'icon-save',//图标样式
		border : false,//是否存在边框
		fitColumns : true,//自动填充行
		nowrap : true,//禁止单元格中的文字自动换行
		autoRowHeight : false,//禁止设置自动行高以适应内容
		striped : true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect : true,//限制单选
		checkOnSelect : false,//选择复选框的时候选择该行
		selectOnCheck : false,//选择的时候复选框打勾
		url : ctx + '/do/order/list.json',
		sortName : 'createTime',//排序字段名称
		sortOrder : 'DESC',//升序还是降序
		remoteSort : true,//开启远程排序，默认为false
		idField : 'orderId',
		columns : [ [ {
			field : 'orderId',
			title : 'ID',
			checkbox : true
		}, {
			field : 'orderCode',
			title : '订单编号',
			width : 120,
			sortable : true
		},{
			field : 'orderPrice',
			title : '订单总额',
			width : 120,
			sortable : true
		},{
			field : 'orderNum',
			title : '货物数量',
			width : 120,
			sortable : true
		},{
			field : 'orderStatus',
			title : '订单状态',
			width : 120,
			sortable : true,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.orderStatus);
			}
		},{
			field : 'distributeStatus',
			title : '订单分拣状态',
			width : 120,
			sortable : true,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.distributeStatus);
			}
		},{
			field : 'status',
			title : '订单启禁状态',
			width : 120,
			sortable : true,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.status);
			}
		},{
			field : 'createrDisplay',
			title : '创建人',
			sortable : true,
			width : 120
		},{
			field : 'createTime',
			title : '创建时间',
			sortable : true,
			width : 200
		},{
			field : 'updaterDisplay',
			title : '更新人',
			sortable : true,
			width : 120
		}, {
			field : 'updateTime',
			title : '更新时间',
			sortable : true,
			width : 200
		},{
			field : 'remark',
			title : '备注',
			sortable : true
		} ] ],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		porderSize : 10,//注意，porderSize必须在porderList存在
		porderList : [ 2, 10, 50, 100 ],//从session中获取
		rownumbers : true,//True 就会显示行号的列
		toolbar : '#orderDataGrid_toolbar',
		onCheck : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.order_mgr.order_mgr.order.param,this).check();
		},
		onCheckAll : function(rows) {//取消勾选行状态触发事件
			action_controller(
					glacier.order_mgr.order_mgr.order.param,this).check();
		},
		onUncheck : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.order_mgr.order_mgr.order.param,this).unCheck();
		},
		onUncheckAll : function(rows) {//取消勾选行状态触发事件
			action_controller(
					glacier.order_mgr.order_mgr.order.param,this).unCheck();
		},
		onSelect : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.order_mgr.order_mgr.order.param,this).select();
		},
		onUnselectAll : function(rows) {
			action_controller(
					glacier.order_mgr.order_mgr.order.param,this).unSelect();
		},
		onLoadSuccess : function(index, record) {//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
			var rows=$(this).datagrid("getRows");
			if(rows.length==0){   
				var body = $(this).data().datagrid.dc.body2;
				body.find('table tbody').append('<tr><td width="' + body.width() + '" style="height: 25px; text-align: center;color:red">暂时没有记录</td></tr>');
			}
		},
		onDblClickRow : function(rowIndex, rowData){
                    $.easyui.showDialog({
				title : '订单详细信息',
				href : ctx+ '/do/order/intoDetail.htm?orderId='+ rowData.orderId,//从controller请求jsp页面进行渲染
				width : 830,
				height : 380,
				resizable : false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	//点击删除按钮触发方法
	glacier.order_mgr.order_mgr.order.delOrder = function() {
		var rows = glacier.order_mgr.order_mgr.order.orderDataGrid.datagrid("getChecked");
		var orderIds = [];//删除的id标识
		var orderName = [];
		for ( var i = 0; i < rows.length; i++) {
			orderIds.push(rows[i].orderId);
			orderName.push(rows[i].orderName);
		}
		if (orderIds.length > 0) {
			$.messager.confirm('请确认','是否要删除该记录',function(r){
                   if (r){
                   	 $.ajax({ 
                   		type: "POST",
                   	    url : ctx+ '/do/order/del.json',
						data : {
							orderIds : orderIds.join(','),
							orderName : orderName.join(',')
						},
						dataType : 'json',
						success : function(r) {
							if (r.success) {//因为失败成功的方法都一样操作，这里故未做处理
								$.messager.show({
									title : '提示',
									timeout : 3000,
									msg : r.msg
								});
                                            glacier.order_mgr.order_mgr.order.orderDataGrid.datagrid('reload');
							} else {
								$.messager.show({//后台验证弹出错误提示信息框
											title : '错误提示',
											width : 380,
											height : 120,
											msg : '<span style="color:red">'+ r.msg+ '<span>',
											timeout : 4500
										});
							}
						}
					});
				}
			});
		}
	};
	
	//配送
	glacier.order_mgr.order_mgr.order.addDispatching=function(){
		var row= glacier.order_mgr.order_mgr.order.orderDataGrid.datagrid("getSelected");
		if(row.status=="enable"){
			if(row.distributeStatus=="waitdistribute"){
				glacier.basicAddOrEditDialog({
					title : '【'+row.orderCode+'】- 配送',
					width : 560,
					height : 230,
					queryUrl : ctx + '/do/order/intoDispatching.htm',
					submitUrl : ctx + '/do/ordersDispatching/addDispatching.json',
					queryParams : {
						orderId : row.orderId
					},
					successFun : function (){
						glacier.order_mgr.order_mgr.order.orderDataGrid .datagrid('reload');
					}
				});
			}else{
				$.messager.alert("操作提示", "该条记录已在配送中!","info");
			}
		}else{
			$.messager.alert("操作提示", "该条记录禁用中，无法配送!","info");
		}
	
	}
	
	
	//模糊查询
	glacier.order_mgr.order_mgr.order.quickquery = function(value, name) {
		var obj = $.parseJSON('{"' + name + '":"' + value + '"}');//将值和对象封装成obj作为参数传递给后台
		glacier.order_mgr.order_mgr.order.orderDataGrid.datagrid('load',obj);
	};
	//下拉项的值
	$('#orderSearchForm_status').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.status
	});
	$('#orderSearchForm_type').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.orderType
	});
</script>

<!-- 所有列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="orderGridPanel" data-options="region:'center',border:true">
		<table id="orderDataGrid">
			<glacierui:toolbar panelEnName="OrderList"
				toolbarId="orderDataGrid_toolbar" menuEnName="order" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="orderSearchForm">
			<table>
				<tr>
					<td>订单名称：</td>
					<td><input name="orderName" style="width: 80px;"
						class="spinner" /></td> 
					<td>状态：</td>
					<td><input id="orderSearchForm_status" name="status" style="width: 80px;"
						 /></td> 
					<td>创建时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.order_mgr.order_mgr.order.orderDataGrid.datagrid('load',glacier.serializeObject($('#orderSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#orderSearchForm input').val('');glacier.order_mgr.order_mgr.order.orderDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>