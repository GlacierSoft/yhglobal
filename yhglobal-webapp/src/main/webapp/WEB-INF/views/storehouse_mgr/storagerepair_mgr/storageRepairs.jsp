<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	$.util.namespace('glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.param = {
		toolbarId : 'storageRepairDataGrid_toolbar',
		actions : {
	            edit:{flag:'edit',controlType:'single'},
	            del:{flag:'del',controlType:'multiple'}
	         }
     };

	//初始化DataGrid
	glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.storageRepairDataGrid = $('#storageRepairDataGrid').datagrid({
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
		url : ctx + '/do/storageRepair/list.json',
		sortName : 'createTime',//排序字段名称
		sortOrder : 'DESC',//升序还是降序
		remoteSort : true,//开启远程排序，默认为false
		idField : 'repairId',
		columns : [ [ {
			field : 'repairId',
			title : 'ID',
			checkbox : true
		},{
			field : 'repairTitle',
			title : '仓库维修标题',
			width : 120,
			sortable : true
		},{
			field : 'storageDisplay',
			title : '仓库名称',
			width : 120,
			sortable : true
		},{
			field : 'repairGrade',
			title : '严重程度',
			width : 120,
			sortable : true,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.grade);
			}
		},{
			field : 'repairStauts',
			title : '维修状态',
			width : 120,
			sortable : true,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.repairStauts);
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
		pstorageRepairSize : 10,//注意，pstorageRepairSize必须在pstorageRepairList存在
		pstorageRepairList : [ 2, 10, 50, 100 ],//从session中获取
		rownumbers : true,//True 就会显示行号的列
		toolbar : '#storageRepairDataGrid_toolbar',
		onCheck : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.param,this).check();
		},
		onCheckAll : function(rows) {//取消勾选行状态触发事件
			action_controller(
					glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.param,this).check();
		},
		onUncheck : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.param,this).unCheck();
		},
		onUncheckAll : function(rows) {//取消勾选行状态触发事件
			action_controller(
					glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.param,this).unCheck();
		},
		onSelect : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.param,this).select();
		},
		onUnselectAll : function(rows) {
			action_controller(
					glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.param,this).unSelect();
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
				title : '仓库维修详细信息',
				href : ctx+ '/do/storageRepair/intoDetail.htm?storageRepairId='+ rowData.repairId,//从controller请求jsp页面进行渲染
				width : 740,
				height : 500,
				resizable : false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	//点击增加按钮触发方法
	glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.addStorageRepair = function(){
		glacier.basicAddOrEditDialog({
			title : '【仓库维修】- 增加',
			width : 740,
			height : 500,
			queryUrl : ctx + '/do/storageRepair/intoForm.htm',
			submitUrl : ctx + '/do/storageRepair/add.json',
			successFun : function (){
				glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.storageRepairDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.editStorageRepair = function(){
		var row = glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.storageRepairDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【仓库维修】- 编辑',
			width : 740,
			height : 500,
			queryUrl : ctx + '/do/storageRepair/intoForm.htm',
			submitUrl : ctx + '/do/storageRepair/edit.json',
			queryParams : {
				storageRepairId : row.repairId
			},
			successFun : function (){
				glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.storageRepairDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击删除按钮触发方法
	glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.delStorageRepair = function() {
		var rows = glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.storageRepairDataGrid.datagrid("getChecked");
		var storageRepairIds = [];//删除的id标识
		var storageRepairName = [];
		for ( var i = 0; i < rows.length; i++) {
			storageRepairIds.push(rows[i].repairId);
			storageRepairName.push(rows[i].repairTitle);
		}
		if (storageRepairIds.length > 0) {
			$.messager.confirm('请确认','是否要删除该记录',function(r){
                   if (r){
                   	 $.ajax({ 
                   		type: "POST",
                   	    url : ctx+ '/do/storageRepair/del.json',
						data : {
							storageRepairIds : storageRepairIds.join(','),
							storageRepairName : storageRepairName.join(',')
						},
						dataType : 'json',
						success : function(r) {
							if (r.success) {//因为失败成功的方法都一样操作，这里故未做处理
								$.messager.show({
									title : '提示',
									timeout : 3000,
									msg : r.msg
								});
                                            glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.storageRepairDataGrid.datagrid('reload');
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
	//模糊查询
	glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.quickquery = function(value, name) {
		var obj = $.parseJSON('{"' + name + '":"' + value + '"}');//将值和对象封装成obj作为参数传递给后台
		glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.storageRepairDataGrid.datagrid('load',obj);
	};
	//下拉项的值
	$('#storageRepairSearchForm_status').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.status
	});
	$('#storageRepairSearchForm_status').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.repairStauts
	});
	
</script>

<!-- 所有列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="storageRepairGridPanel" data-options="region:'center',border:true">
		<table id="storageRepairDataGrid">
			<glacierui:toolbar panelEnName="StorageRepairList"
				toolbarId="storageRepairDataGrid_toolbar" menuEnName="storageRepair" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="storageRepairSearchForm">
			<table>
				<tr>
					<td>仓库名称：</td>
					<td><input name="storageDisplay" style="width: 80px;"
						class="spinner" /></td> 
					<td>状态：</td>
					<td><input id="storageRepairSearchForm_status" name="repairStauts" style="width: 80px;"
						 /></td> 
					<td>创建时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.storageRepairDataGrid.datagrid('load',glacier.serializeObject($('#storageRepairSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#storageRepairSearchForm input').val('');glacier.storageRepairRepair_mgr.storageRepairRepair_mgr.storageRepair.storageRepairDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>