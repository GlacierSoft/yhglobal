<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>  
<script type="text/javascript">
	$.util.namespace('glacier.carrier_mgr.carrierDriver_mgr.driver');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.carrier_mgr.carrierDriver_mgr.driver.param = {
		toolbarId : 'driverDataGrid_toolbar',
		actions : { 
             add:{flag:'add',controlType:'add'},
             edit:{flag:'edit',controlType:'single'}, 
             del:{flag:'del',controlType:'multiple'}
          }
     }; 

	//初始化班线DataGrid
	glacier.carrier_mgr.carrierDriver_mgr.driver.driverDataGrid = $('#driverDataGrid').datagrid({
						fit : true,//控件自动resize占满窗口大小
						iconCls : 'icon-save',//图标样式
						border : false,//是否存在边框
						fitColumns : false,//自动填充行
						nowrap : true,//禁止单元格中的文字自动换行
						autoRowHeight : false,//禁止设置自动行高以适应内容
						striped : true,//true就是把行条纹化。（即奇偶行使用不同背景色）
						singleSelect : true,//限制单选
						checkOnSelect : false,//选择复选框的时候选择该行
						selectOnCheck : false,//选择的时候复选框打勾
						url : ctx + '/do/carrierDriver/list.json',
						sortName : 'createTime',//排序字段名称
						sortOrder : 'DESC',//升序还是降序
						remoteSort : true,//开启远程排序，默认为false
						idField : 'driverId',
						columns : [ [ {
							field : 'driverId',
							title : 'ID',
							checkbox : true
						},{
							field : 'driverName',
							title : '驾驶员姓名',
							width : 120,
							sortable : true
						},{
							field : 'carrierDisplay',
							title : '所属承运商',
							width : 120,
							sortable : true
						},{
							field : 'age',
							title : '年龄',
							width : 120,
							sortable : true
						},{
							field : 'driverAge',
							title : '驾驶年龄',
							width : 120,
							sortable : true
						},{
							field : 'sex',
							title : '性别',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化，例如man显示是，woman显示女
								return renderGridValue(value, fields.sex);
							}
						},{
							field : 'status',
							title : '状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化，例如man显示是，woman显示女
								return renderGridValue(value, fields.status);
							}
						},{
							field : 'driverLicenseId',
							title : '驾驶证编号',
							width : 120,
							sortable : true
						},{
							field : 'driverLicenseTime',
							title : '驾驶证有效期限',
							width : 120,
							sortable : true
						},{
							field : 'phone',
							title : '联系电话',
							width : 120,
							sortable : true
						},{
							field : 'address',
							title : '详细住址',
							width : 120,
							sortable : true
						},{
							field : 'cardId',
							title : '身份证编号',
							width : 120,
							sortable : true
						},{
							field : 'driverStatus',
							title : '驾驶状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化，例如man显示是，woman显示女
								return renderGridValue(value, fields.driverStatus);
							}
						},{
							field : 'email',
							title : '邮箱',
							width : 120,
							sortable : true
						},{
							field : 'auditState',
							title : '审核状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化，例如man显示是，woman显示女
								return renderGridValue(value, fields.auditState);
							}
						},{
							field : 'auditDisplay',
							title : '审核人',
							width : 120,
							sortable : true
						},{
							field : 'auditTime',
							title : '审核时间',
							width : 120,
							sortable : true
						},{
							field : 'auditOpinion',
							title : '审核备注',
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
						},{
							field : 'updateTime',
							title : '更新时间',
							sortable : true,
							width : 200
						},{
							field : 'remark',
							title : '备注',
							sortable : true,
							width : 120
						} ] ],
						pagination : true,//True 就会在 datagrid 的底部显示分页栏
						pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
						pmemberList : [ 2, 10, 50, 100 ],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						toolbar : '#driverDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发 
							action_controller( 
									glacier.carrier_mgr.carrierDriver_mgr.driver.param,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.carrier_mgr.carrierDriver_mgr.driver.param,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发 
							action_controller(
									glacier.carrier_mgr.carrierDriver_mgr.driver.param,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.carrier_mgr.carrierDriver_mgr.driver.param,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
						  	action_controller(
										glacier.carrier_mgr.carrierDriver_mgr.driver.param,this).select();
						 	},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.carrier_mgr.carrierDriver_mgr.driver.param,this).unSelect();
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
								title : '驾驶员【' + rowData.driverName + '】详细信息',
								href : ctx+ '/do/carrierDriver/intoDetail.htm?driverId='+ rowData.driverId,//从controller请求jsp页面进行渲染
								height : 500,
								width:555,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});  
						}
					}); 
	//点击增加按钮触发方法
	glacier.carrier_mgr.carrierDriver_mgr.driver.addDriver = function(){ 
		glacier.basicAddOrEditDialog({
			title : '【驾驶员】- 增加',
			height : 400,
			width:555,
			queryUrl : ctx + '/do/carrierDriver/intoForm.htm',
			submitUrl : ctx + '/do/carrierDriver/addDriver.json',
			successFun : function (){
				glacier.carrier_mgr.carrierDriver_mgr.driver.driverDataGrid.datagrid('reload');
			}
		});
	}; 
	  
	
	//点击编辑按钮触发方法
     glacier.carrier_mgr.carrierDriver_mgr.driver.editDriver = function(){
		var row =glacier.carrier_mgr.carrierDriver_mgr.driver.driverDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【'+row.driverName+'】-班线编辑',
			height : 400,
			width:555,
			queryUrl : ctx + '/do/carrierDriver/intoForm.htm',
			submitUrl : ctx + '/do/carrierDriver/edit.json',
			queryParams : {
				driverId : row.driverId
			},
			successFun : function (){
				glacier.carrier_mgr.carrierDriver_mgr.driver.driverDataGrid.datagrid('reload');
			}
		});
	}; 
	
	//点击删除按钮触发方法
	glacier.carrier_mgr.carrierDriver_mgr.driver.delDriver= function() { 
		var rows =glacier.carrier_mgr.carrierDriver_mgr.driver.driverDataGrid.datagrid("getChecked");
		var carrierRouteIds = [];//删除的id标识
		var carrierRouteNames = [];
		for ( var i = 0; i < rows.length; i++) {
			carrierRouteIds.push(rows[i].routerId);
			carrierRouteNames.push(rows[i].routeName);
		}
		if (carrierRouteIds.length > 0) {
			$.messager.confirm('请确认','是否要删除该记录',function(r){
                   if (r){
                   	 $.ajax({ 
                   		type: "POST",
                   	    url : ctx+ '/do/carrierRoute/del.json',
						data : {
							carrierRouteIds : carrierRouteIds.join(','),
							carrierRouteNames : carrierRouteNames.join(',')
						},
						dataType : 'json',
						success : function(r) {
							if (r.success) {//因为失败成功的方法都一样操作，这里故未做处理
								$.messager.show({
									title : '提示',
									timeout : 3000,
									msg : r.msg
								});
								glacier.carrier_mgr.carrierDriver_mgr.driver.driverDataGrid.datagrid('reload');
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
	//班线资料模糊查询
	glacier.carrier_mgr.carrierDriver_mgr.driver.quickquery = function(value, name) {
		var obj = $.parseJSON('{"' + name + '":"' + value + '"}');//将值和对象封装成obj作为参数传递给后台
		glacier.carrier_mgr.carrierDriver_mgr.driver.driverDataGrid.datagrid('load',obj);
	};
	  //下拉项的值
	$('#driverSearchForm_status').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.status
	}); 
	//下拉项的值
	$('#driverSearchForm_driverStatus').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.driverStatus
	});  
</script>

<!-- 所有班线列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="driverGridPanel" data-options="region:'center',border:true">
		<table id="driverDataGrid">
			<glacierui:toolbar panelEnName="driverList"
				toolbarId="driverDataGrid_toolbar" menuEnName="carrierDriver" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>  
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="driverSearchForm">
			<table>
				<tr>
				<td>驾驶员名称：</td>
					<td><input name="driverName" style="width: 80px;height: 23px;"
						class="spinner" /></td>   
					<td>状态：</td>
					<td><input id="driverSearchForm_status" name="status"
						style="width: 80px;height: 23px;" class="spinner" /></td> 
					<td>驾驶状态：</td>
					<td><input id="driverSearchForm_driverStatus" name="status"
						style="width: 80px;height: 23px;" class="spinner" /></td> 
					<td>创建时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.carrier_mgr.carrierDriver_mgr.driver.driverDataGrid.datagrid('load',glacier.serializeObject($('#driverSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#driverSearchForm input').val('');glacier.carrier_mgr.carrierDriver_mgr.driver.driverDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>   
		</form>    
	</div>
</div>  
