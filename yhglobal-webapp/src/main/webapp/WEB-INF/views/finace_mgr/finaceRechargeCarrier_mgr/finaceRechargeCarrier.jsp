<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	$.util.namespace('glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.param = {
		toolbarId : 'finaceRechargeCarrierDataGrid_toolbar',
		actions : {
             edit:{flag:'edit',controlType:'single'},
             del:{flag:'del',controlType:'multiple'},
             audit:{flag:'audit',controlType:'single'}
          }
     };

	//初始化客服DataGrid
	glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.finaceRechargeCarrierDataGrid = $('#finaceRechargeCarrierDataGrid').datagrid({
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
						url : ctx + '/do/finaceRechargeCarrier/list.json',
						sortName : 'createTime',//排序字段名称
						sortOrder : 'DESC',//升序还是降序
						remoteSort : true,//开启远程排序，默认为false
						idField : 'rechargeId',
						columns : [ [ {
							field : 'rechargeId',
							title : 'ID',
							checkbox : true
						}, {
							field : 'rechargeCode',
							title : '充值流水线',
							width : 120,
							sortable : true
						}, {
							field : 'rechargeSetDisplay',
							title : '充值方式',
							width : 120,
							sortable : true
						},{
							field : 'rechargeMoney',
							title : '充值金额',
							width : 120,
							sortable : true
						},{
							field : 'saveMoney',
							title : '优惠金额',
							width : 120,
							sortable : true
						},{
							field : 'chargeMoney',
							title : '手续费',
							width : 120,
							sortable : true
						},{
							field : 'returnMoney',
							title : '返现金额',
							width : 120,
							sortable : true
						},{
							field : 'receiveMoney',
							title : '到账金额',
							width : 120,
							sortable : true
						},{
							field : 'carrierDisplay',
							title : '承运商名称',
							width : 120,
							sortable : true
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
						pfinaceRechargeCarrierSize : 10,//注意，pfinaceRechargeCarrierSize必须在pfinaceRechargeCarrierList存在
						pfinaceRechargeCarrierList : [ 2, 10, 50, 100 ],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						toolbar : '#finaceRechargeCarrierDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.param,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.param,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.param,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.param,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.param,this).select();
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.param,this).unSelect();
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
								title : '充值类型详细信息',
								href : ctx+ '/do/finaceRechargeCarrier/intoDetail.htm?rechargeId='+ rowData.rechargeId,//从controller请求jsp页面进行渲染
								width : 830,
								height : 490,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});
						}
					});

	//点击增加按钮触发方法
	glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.addRecharge = function(){
		glacier.basicAddOrEditDialog({
			title : '【充值设置】- 增加',
			width : 800,
			height : 300,
			queryUrl : ctx + '/do/finaceRechargeCarrier/intoForm.htm',
			submitUrl : ctx + '/do/finaceRechargeCarrier/add.json',
			successFun : function (){
				glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.finaceRechargeCarrierDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.editRecharge = function(){
		var row = glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.finaceRechargeCarrierDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【充值设置】- 编辑',
			width : 800,
			height : 300,
			queryUrl : ctx + '/do/finaceRechargeCarrier/intoForm.htm',
			submitUrl : ctx + '/do/finaceRechargeCarrier/edit.json',
			queryParams : {
				rechargeId : row.rechargeId
			},
			successFun : function (){
				glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.finaceRechargeCarrierDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击审核按钮触发方法
	glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.auditRecharge = function(){
		var row = glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.finaceRechargeCarrierDataGrid.datagrid("getSelected");
		var auditState = row.auditState;
		if ("authstr" == auditState) {
			glacier.basicAddOrEditDialog({
				title : '【充值设置】- 审核',
				width : 830,
				height : 535,
				queryUrl : ctx + '/do/finaceRechargeCarrier/intoAudit.htm',
				submitUrl : ctx + '/do/finaceRechargeCarrier/audit.json',
				queryParams : {
					rechargeId : row.rechargeId
				},
				successFun : function (){
					glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.finaceRechargeCarrierDataGrid.datagrid('reload');
				}
			});
		} else {
			alert("该记录已经进行了审核，不需要重复操作。");
		}
	};
	
	//点击删除按钮触发方法
	glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.delRecharge = function() {
		var rows = glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.finaceRechargeCarrierDataGrid.datagrid("getChecked");
		var finaceRechargeCarrierIds = [];//删除的id标识
		var finaceRechargeCarrierNames = [];
		for ( var i = 0; i < rows.length; i++) {
			finaceRechargeCarrierIds.push(rows[i].rechargeId);
			finaceRechargeCarrierNames.push(rows[i].rechargeName);
		}
		if (finaceRechargeCarrierIds.length > 0) {
			$.messager.confirm('请确认','是否要删除该记录',function(r){
                   if (r){
                   	 $.ajax({ 
                   		type: "POST",
                   	    url : ctx+ '/do/finaceRechargeCarrier/del.json',
						data : {
							finaceRechargeCarrierIds : finaceRechargeCarrierIds.join(','),
							finaceRechargeCarrierNames : finaceRechargeCarrierNames.join(',')
						},
						dataType : 'json',
						success : function(r) {
							if (r.success) {//因为失败成功的方法都一样操作，这里故未做处理
								$.messager.show({
									title : '提示',
									timeout : 3000,
									msg : r.msg
								});
                                            glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.finaceRechargeCarrierDataGrid.datagrid('reload');
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
	glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.quickquery = function(value, name) {
		var obj = $.parseJSON('{"' + name + '":"' + value + '"}');//将值和对象封装成obj作为参数传递给后台
		glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.finaceRechargeCarrierDataGrid.datagrid('load',obj);
	};
	//下拉项的值
	$('#finaceRechargeCarrierSearchForm_type').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.rechargeType
	});
</script>

<!-- 所有列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="finaceRechargeCarrierGridPanel" data-options="region:'center',border:true">
		<table id="finaceRechargeCarrierDataGrid">
			<glacierui:toolbar panelEnName="finaceRechargeCarrierList"
				toolbarId="finaceRechargeCarrierDataGrid_toolbar" menuEnName="finaceRechargeCarrier" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="finaceRechargeCarrierSearchForm">
			<table>
				<tr>
					<td>充值流水线：</td>
					<td><input name="rechargeCode" style="width: 80px;"
						class="spinner" /></td> 
					<td>充值方式：</td>
					<td><input id="rechargeSetDisplay" name="rechargeSetDisplay" style="width: 80px;"
						class="spinner" /></td> 	
					<td>创建时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.finaceRechargeCarrierDataGrid.datagrid('load',glacier.serializeObject($('#finaceRechargeCarrierSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#finaceRechargeCarrierSearchForm input').val('');glacier.rechargeCarrier_mgr.rechargeCarrier_mgr.finaceRechargeCarrier.finaceRechargeCarrierDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>