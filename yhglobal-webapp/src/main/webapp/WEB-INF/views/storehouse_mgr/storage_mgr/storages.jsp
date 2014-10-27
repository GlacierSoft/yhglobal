<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	$.util.namespace('glacier.storage_mgr.storage_mgr.storage');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.storage_mgr.storage_mgr.storage.param = {
		toolbarId : 'storageDataGrid_toolbar',
		actions : {
	            edit:{flag:'edit',controlType:'single'},
	            del:{flag:'del',controlType:'multiple'},
	            repair:{flag:'repair',controlType:'single'}
	         }
     };

	//初始化DataGrid
	glacier.storage_mgr.storage_mgr.storage.storageDataGrid = $('#storageDataGrid').datagrid({
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
		url : ctx + '/do/storage/list.json',
		sortName : 'createTime',//排序字段名称
		sortOrder : 'DESC',//升序还是降序
		remoteSort : true,//开启远程排序，默认为false
		idField : 'storageId',
		columns : [ [ {
			field : 'storageId',
			title : 'ID',
			checkbox : true
		},{
			field : 'storageName',
			title : '仓库名称',
			width : 120,
			sortable : true
		},{
			field : 'storageTyperDisplay',
			title : '仓库类型',
			width : 120,
			sortable : true
		},{
			field : 'yesOrNo',
			title : '检修状态',
			width : 120,
			sortable : true,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.yesOrNo);
			}
		},{
			field : 'buildDate',
			title : '建造时间',
			width : 120,
			sortable : true
		},{
			field : 'weightUpperBound',
			title : '体重上限',
			width : 120,
			sortable : true
		},{
			field : 'usableWeight',
			title : '可用体重',
			width : 120,
			sortable : true
		},{
			field : 'bulkUpperBound',
			title : '体积上限',
			width : 120,
			sortable : true
		},{
			field : 'usableBulk',
			title : '可用体积',
			width : 120,
			sortable : true
		},{
			field : 'status',
			title : '仓库状态',
			width : 120,
			sortable : true,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.status);
			}
		},{
			field : 'userDisplay',
			title : '负责人',
			width : 120,
			sortable : true
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
		pstorageSize : 10,//注意，pstorageSize必须在pstorageList存在
		pstorageList : [ 2, 10, 50, 100 ],//从session中获取
		rownumbers : true,//True 就会显示行号的列
		toolbar : '#storageDataGrid_toolbar',
		onCheck : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.storage_mgr.storage_mgr.storage.param,this).check();
		},
		onCheckAll : function(rows) {//取消勾选行状态触发事件
			action_controller(
					glacier.storage_mgr.storage_mgr.storage.param,this).check();
		},
		onUncheck : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.storage_mgr.storage_mgr.storage.param,this).unCheck();
		},
		onUncheckAll : function(rows) {//取消勾选行状态触发事件
			action_controller(
					glacier.storage_mgr.storage_mgr.storage.param,this).unCheck();
		},
		onSelect : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.storage_mgr.storage_mgr.storage.param,this).select();
		},
		onUnselectAll : function(rows) {
			action_controller(
					glacier.storage_mgr.storage_mgr.storage.param,this).unSelect();
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
				title : '仓库详细信息',
				href : ctx+ '/do/storage/intoDetail.htm?storageId='+ rowData.storageId,//从controller请求jsp页面进行渲染
				width : 830,
				height : 500,
				resizable : false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	//点击增加按钮触发方法
	glacier.storage_mgr.storage_mgr.storage.addStorage = function(){
		glacier.basicAddOrEditDialog({
			title : '【仓库】- 增加',
			width : 840,
			height : 370,
			queryUrl : ctx + '/do/storage/intoForm.htm',
			submitUrl : ctx + '/do/storage/add.json',
			successFun : function (){
				glacier.storage_mgr.storage_mgr.storage.storageDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.storage_mgr.storage_mgr.storage.editStorage = function(){
		var row = glacier.storage_mgr.storage_mgr.storage.storageDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【仓库】- 编辑',
			width : 840,
			height : 370,
			queryUrl : ctx + '/do/storage/intoForm.htm',
			submitUrl : ctx + '/do/storage/edit.json',
			queryParams : {
				storageId : row.storageId
			},
			successFun : function (){
				glacier.storage_mgr.storage_mgr.storage.storageDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击删除按钮触发方法
	glacier.storage_mgr.storage_mgr.storage.delStorage = function() {
		var rows = glacier.storage_mgr.storage_mgr.storage.storageDataGrid.datagrid("getChecked");
		var storageIds = [];//删除的id标识
		var storageName = [];
		for ( var i = 0; i < rows.length; i++) {
			storageIds.push(rows[i].storageId);
			storageName.push(rows[i].storageName);
		}
		if (storageIds.length > 0) {
			$.messager.confirm('请确认','是否要删除该记录',function(r){
                   if (r){
                   	 $.ajax({ 
                   		type: "POST",
                   	    url : ctx+ '/do/storage/del.json',
						data : {
							storageIds : storageIds.join(','),
							storageName : storageName.join(',')
						},
						dataType : 'json',
						success : function(r) {
							if (r.success) {//因为失败成功的方法都一样操作，这里故未做处理
								$.messager.show({
									title : '提示',
									timeout : 3000,
									msg : r.msg
								});
                                            glacier.storage_mgr.storage_mgr.storage.storageDataGrid.datagrid('reload');
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
	
	//点击增加仓库维修方法
	glacier.storage_mgr.storage_mgr.storage.addRepair = function(){
		var row = glacier.storage_mgr.storage_mgr.storage.storageDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【仓库维修】- 增加',
			width : 740,
			height : 500,
			queryUrl : ctx + '/do/storage/addRepair.htm',
			submitUrl : ctx + '/do/storageRepair/add.json',
			queryParams : {
				storageId : row.storageId
			},
			successFun : function (){
				glacier.storage_mgr.storage_mgr.storage.storageDataGrid.datagrid('reload');
			}
		});
	};
	/* glacier.storage_mgr.repair_mgr.repair.addRepair = function(){
		$.easyui.showDialog({
			title : '【下拉值管理】- 增加',
			href : ctx + '/do/optgroupValue/intoForm.htm',//从controller请求jsp页面进行渲染
			width : 420,
			height : 330,
			resizable: false,
			enableSaveButton : false,
			enableApplyButton : false,
			buttons : [{
				text : '保存',
				iconCls : 'icon-save',
				handler : function(dia) {
					$('#optgroup_mgr_optgroupValue_form').form('submit', {
						url: ctx + '/do/optgroupValue/add.json',
						success: function(r){
							$.messager.show(r.msg);
							glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValuePropertyGrid.datagrid('reload');
						    dia.dialog("close");  
						}
					});
				}
			}],
			onLoad : function() {
				var optgroupRow = glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupTreeGrid.treegrid("getSelected");
				if(optgroupRow){//初始化所在菜单以及对应面板
					$("#optgroup_mgr_optgroupValue_form_optgroupId").combotree('setValue', optgroupRow.optgroupId);
				}
			}
		});
	}; */
	
	//模糊查询
	glacier.storage_mgr.storage_mgr.storage.quickquery = function(value, name) {
		var obj = $.parseJSON('{"' + name + '":"' + value + '"}');//将值和对象封装成obj作为参数传递给后台
		glacier.storage_mgr.storage_mgr.storage.storageDataGrid.datagrid('load',obj);
	};
	//下拉项的值
	$('#storageSearchForm_status').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.status
	});
	$('#storageSearchForm_type').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.storageType
	});
	
	//用于combogrid的仓库类型信息绑定
	$('#storage_mgr_storage_storagetypeId').combogrid({
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
	    //value:'${messageNoticeData.addresseeDisplay}',    
	    idField:'storagetypeId',    
	    textField:'storagetypeName',    
	    url: ctx + '/do/storagetype/list.json',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
	    columns : [ [ 
			{
				field:'storagetypeId',
				title:'ID',
				checkbox:true
			},{
				field : 'storagetypeName',
				title : '用户姓名',
				width : 80,
				sortable:true
			},{
				field : 'status',
				title : '仓库类型状态',
				width : 120,
				sortable : true,
				formatter : function(value, row, index) {
					return renderGridValue(value, fields.status);
				}
			} ] ],
			pagination : true,//True 就会在 datagrid 的底部显示分页栏
			pageSize : 10,//注意，pageSize必须在pageList存在
			pageList : [2,10,50,100],//从session中获取
			rownumbers : true,//True 就会显示行号的列
		loadMsg : '数据加载中....',
		mode : 'remote',
		delay : 200
	});
</script>

<!-- 所有列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="storageGridPanel" data-options="region:'center',border:true">
		<table id="storageDataGrid">
			<glacierui:toolbar panelEnName="StorageList"
				toolbarId="storageDataGrid_toolbar" menuEnName="storage" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="storageSearchForm">
			<table>
				<tr>
					<td>仓库名称：</td>
					<td><input name="storageName" style="width: 80px;"
						class="spinner" /></td> 
					<td>仓库类型名称：</td>
					<td><input id="storage_mgr_storage_storagetypeId" name="storagetypeName" style="width: 80px;"
						class="spinner" /></td> 
					<td>负责人名称：</td>
					<td><input name="userDisplay" style="width: 80px;"
						class="spinner" /></td> 
					<td>状态：</td>
					<td><input id="storageSearchForm_status" name="status" style="width: 80px;"
						 /></td> 
					<td>创建时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.storage_mgr.storage_mgr.storage.storageDataGrid.datagrid('load',glacier.serializeObject($('#storageSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#storageSearchForm input').val('');glacier.storage_mgr.storage_mgr.storage.storageDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>