<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	$.util.namespace('glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.param = {
		toolbarId : 'carrierCarInformationDataGrid_toolbar',
		actions : {
             edit:{flag:'edit',controlType:'single'},
             del:{flag:'del',controlType:'multiple'},
             audit:{flag:'audit',controlType:'single'}
          }
     };

	//选中行的时候默认调用的方法 
	glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.alwaySelect = function(){
		var rows = glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.carrierCarInformationDataGrid.datagrid("getSelected");
		if(rows.auditState == 'pass'){
			$('#carrierCarInformation_btn_carrierCarInformationList_edit').linkbutton('disable');//置灰修改按钮
			$('#carrierCarInformation_btn_carrierCarInformationList_audit').linkbutton('disable');//置灰审核按钮
		}
		if(rows.auditState == 'failure'){
			$('#carrierCarInformation_btn_carrierCarInformationList_audit').linkbutton('disable');//置灰审核按钮
		}
	};
	
	//初始化DataGrid
	glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.carrierCarInformationDataGrid = $('#carrierCarInformationDataGrid').datagrid({
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
						url : ctx + '/do/carrierCarInformation/list.json',
						sortName : 'createTime',//排序字段名称
						sortOrder : 'DESC',//升序还是降序
						remoteSort : true,//开启远程排序，默认为false
						idField : 'carId',
						columns : [ [ {
							field : 'carId',
							title : 'ID',
							checkbox : true
						}, {
							field : 'carrierMemberRealName',
							title : '承运商名称',
							width : 120,
							sortable : true
						}, {
							field : 'routeName',
							title : '车辆编号',
							width : 120,
							sortable : true
						},{
							field : 'transportType',
							title : '运输类型',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {
								return renderGridValue(value, fields.transportType);
							}
						},{
							field : 'serviceType',
							title : '服务类型',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {
								return renderGridValue(value, fields.serviceType);
							}
						},{
							field : 'plateNumber',
							title : '车牌号',
							width : 120,
							sortable : true
						},{
							field : 'carAge',
							title : '车龄',
							width : 120,
							sortable : true
						},{
							field : 'transportStatus',
							title : '车辆运输状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {
								return renderGridValue(value, fields.transportStatus);
							}
						},{
							field : 'carTypeDisplay',
							title : '车辆类型',
							width : 120,
							sortable : true
						},{
							field : 'carLength',
							title : '车辆长度',
							width : 120,
							sortable : true
						},{
							field : 'carLoad',
							title : '车辆载重',
							width : 120,
							sortable : true
						},{
							field : 'carStatus',
							title : '车辆状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {
								return renderGridValue(value, fields.status);
							}
						},{
							field : 'auditState',
							title : '审核状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {
								return renderGridValue(value, fields.auditState);
							}
						},{
							field : 'auditorDisplay',
							title : '审核人',
							width : 120,
							sortable : true
						},{
							field : 'auditTime',
							title : '审核时间',
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
							sortable : true,
							width : 120
						} ] ],
						pagination : true,//True 就会在 datagrid 的底部显示分页栏
						pcarrierCarInformationSize : 10,//注意，pcarrierCarInformationSize必须在pcarrierCarInformationList存在
						pcarrierCarInformationList : [ 2, 10, 50, 100 ],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						toolbar : '#carrierCarInformationDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.param,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.param,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.param,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.param,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.param,this).select();
							glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.alwaySelect();
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.param,this).unSelect();
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
								title : '车辆详细信息',
								href : ctx+ '/do/carrierCarInformation/intoDetail.htm?gradeId='+ rowData.carId,//从controller请求jsp页面进行渲染
								width : 830,
								height : 590,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});
						}
					});

	//点击增加按钮触发方法
	glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.addMemberGrade = function(){
		glacier.basicAddOrEditDialog({
			title : '【车辆】- 增加车辆',
			width : 790,
			height : 420,
			queryUrl : ctx + '/do/carrierCarInformation/intoForm.htm',
			submitUrl : ctx + '/do/carrierCarInformation/add.json',
			successFun : function (){
				glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.carrierCarInformationDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击编辑按钮触发方法
	glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.editMemberGrade = function(){
		var row = glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.carrierCarInformationDataGrid.datagrid("getSelected");
		var auditState = row.auditState;
		if ("pass" != auditState) {
			glacier.basicAddOrEditDialog({
				title : '【车辆】- 编辑',
				width : 790,
				height : 420,
				queryUrl : ctx + '/do/carrierCarInformation/intoForm.htm',
				submitUrl : ctx + '/do/carrierCarInformation/edit.json',
				queryParams : {
					carId : row.carId
				},
				successFun : function (){
					glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.carrierCarInformationDataGrid.datagrid('reload');
				}
			});
		} else {
			alert("该记录已经审核成功，不能进行修改。");
		}
	};
	
	//点击审核按钮触发方法
	glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.auditCarInfor = function(){
		var row = glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.carrierCarInformationDataGrid.datagrid("getSelected");
		var auditState = row.auditState;
		if ("authstr" == auditState) {
			glacier.basicAddOrEditDialog({
				title : '【车辆】- 审核',
				width : 830,
				height : 635,
				queryUrl : ctx + '/do/carrierCarInformation/intoAudit.htm',
				submitUrl : ctx + '/do/carrierCarInformation/audit.json',
				queryParams : {
					carId : row.carId
				},
				successFun : function (){
					glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.carrierCarInformationDataGrid.datagrid('reload');
				}
			});
		} else {
			alert("该记录已经进行了审核，不需要重复操作。");
		}
	};
	
	//点击删除按钮触发方法
	glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.delMemberGrade = function() {
		var rows = glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.carrierCarInformationDataGrid.datagrid("getChecked");
		var carrierCarInformationIds = [];//删除的id标识
		var carrierCarInformationNames = [];
		for ( var i = 0; i < rows.length; i++) {
			carrierCarInformationIds.push(rows[i].carId);
			carrierCarInformationNames.push(rows[i].plateNumber);
		}
		if (carrierCarInformationIds.length > 0) {
			$.messager.confirm('请确认','是否要删除该记录',function(r){
                   if (r){
                   	 $.ajax({ 
                   		type: "POST",
                   	    url : ctx+ '/do/carrierCarInformation/del.json',
						data : {
							carrierCarInformationIds : carrierCarInformationIds.join(','),
							carrierCarInformationNames : carrierCarInformationNames.join(',')
						},
						dataType : 'json',
						success : function(r) {
							if (r.success) {//因为失败成功的方法都一样操作，这里故未做处理
								$.messager.show({
									title : '提示',
									timeout : 3000,
									msg : r.msg
								});
                                            glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.carrierCarInformationDataGrid.datagrid('reload');
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
	//客服资料模糊查询
	glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.quickquery = function(value, name) {
		var obj = $.parseJSON('{"' + name + '":"' + value + '"}');//将值和对象封装成obj作为参数传递给后台
		glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.carrierCarInformationDataGrid.datagrid('load',obj);
	};
	//下拉项的值
	$('#carrierCarInformationSearchForm_status').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.status
	});
	$('#carrierCarInformationSearchForm_type').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.carrierCarInformationType
	});
</script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="carrierCarInformationGridPanel" data-options="region:'center',border:true">
		<table id="carrierCarInformationDataGrid">
			<glacierui:toolbar panelEnName="carrierCarInformationList"
				toolbarId="carrierCarInformationDataGrid_toolbar" menuEnName="carrierCarInformation" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="carrierCarInformationSearchForm">
			<table>
				<tr>
					<td>承运商名称：</td>
					<td><input name="carrierMemberRealName" style="width: 80px;"
						class="spinner" /></td> 
					<td>车辆牌号：</td>
					<td><input name="plateNumber" style="width: 80px;"
						class="spinner" /></td> 	
					<td>创建时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.carrierCarInformationDataGrid.datagrid('load',glacier.serializeObject($('#carrierCarInformationSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#carrierCarInformationSearchForm input').val('');glacier.carrierCarInformation_mgr.carrierCarInformation_mgr.carrierCarInformation.carrierCarInformationDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>