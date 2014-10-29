<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
%>

<script type="text/javascript">
	$.util.namespace('glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember.param = {
		toolbarId : 'finaceRechargeMemberDataGrid_toolbar',
		actions : {
             edit:{flag:'edit',controlType:'single'},
             del:{flag:'del',controlType:'multiple'},
             print:{flag:'print',controlType:'single'}
          }
     };

	//初始化承运商合同记录DataGrid
	glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember.finaceRechargeMemberDataGrid = $('#finaceRechargeMemberDataGrid').datagrid({
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
						url : ctx + '/do/finaceRechargeMemberController/list.json',
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
							title : '充值编号',
							width : 120,
							sortable : true
						}, {
							field : 'rechargeSetName',
							title : '充值名称',
							width : 120,
							sortable : true
						}, {
							field : 'rechargeMoney',
							title : '充值金额',
							width : 120,
							sortable : true,
						}, {
							field : 'saveMoney',
							title : '优惠金额',
							width : 120,
							sortable : true,
						},  {
							field : 'chargeMoney',
							title : '手续费',
							width : 120,
							sortable : true
						}, {
							field : 'returnMoney',
							title : '返现金额',
							width : 120,
							sortable : true,
						}, {
							field : 'receiveMoney',
							title : '到账金额',
							width : 120,
							sortable : true
						},  {
							field : 'feeWay',
							title : '取费方式',
							width : 140,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化
								return renderGridValue(value, fields.feeWay);
							}
						},{
							field : 'rechargeSetType',
							title : '充值方式',
							width : 140,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化
								return renderGridValue(value, fields.rechargeType);
							}
						},{
							field : 'memberDisplay',
							title : '会员',
							width : 140,
							sortable : true,
						},{
							field : 'auditState',
							title : '状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化
								return renderGridValue(value, fields.auditState);
							}
						},  {
							field : 'auditOpinion',
							title : '审核内容',
							width : 140,
							sortable : true,
						},  {
							field : 'auditorDisplay',
							title : '审核人',
							sortable : true,
							width : 120
						}, {
							field : 'auditTime',
							title : '审核时间',
							sortable : true,
							width : 120
						},{
							field : 'createTime',
							title : '创建时间',
							sortable : true,
							width : 200
						}, {
							field : 'updaterDisplay',
							title : '更新人',
							sortable : true,
							width : 120
						}, {
							field : 'updateTime',
							title : '更新时间',
							sortable : true,
							width : 200
						} , {
							field : 'remark',
							title : '备注',
							sortable : true,
							width : 120
						}] ],
						pagination : true,//True 就会在 datagrid 的底部显示分页栏
						pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
						pmemberList : [ 2, 10, 50, 100 ],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						toolbar : '#finaceRechargeMemberDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember.param,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember.param,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember.param,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember.param,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember.param,this).select();
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember.param,this).unSelect();
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
								title : '【' + rowData.memberDisplay + '】充值详细信息',
								href : ctx+ '/do/finaceRechargeMemberController/intoDetail.htm?rechargeId='+ rowData.rechargeId,//从controller请求jsp页面进行渲染
								width : 560,
								height : 420,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});
						}
					});
	
	glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember.expFinaceRechargeMember=function(){
		location.href=ctx+"/do/finaceRechargeMemberController/exp.json";
	}
	
	glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember.auditFinaceRechargeMember=function(){
		var row = glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember.finaceRechargeMemberDataGrid.datagrid("getSelected");
		var auditState = row.auditState;
		if ("authstr" == auditState||"failure"==auditState) {
			glacier.basicAddOrEditDialog({
				title : '【会员充值设置记录】- 审核',
				width : 600,
				height : 450,
				queryUrl : ctx + '/do/finaceRechargeMemberController/intoAudit.htm',
				submitUrl : ctx + '/do/finaceRechargeMemberController/audit.json',
				queryParams : {
					rechargeId : row.rechargeId
				},
				successFun : function (){
					glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember.finaceRechargeMemberDataGrid.datagrid('reload');
				}
			});
		} else {
			if(row.rechargeSetType=="online")
			   $.messager.alert("提示","线上充值,审核已通过!","info");
			else
				$.messager.alert("提示","该条记录已审核完成!","info");	
		}
	}
	
	
	
	
	//下拉项的值
	$('#finaceRechargeSetMemberSearchForm_type').combobox({
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

<!-- 所有承运商合同记录表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="finaceRechargeMemberGridPanel" data-options="region:'center',border:true">
		<table id="finaceRechargeMemberDataGrid">
			<glacierui:toolbar panelEnName="FinaceRechargeMemberList"
				toolbarId="finaceRechargeMemberDataGrid_toolbar" menuEnName="finaceRechargeMember" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="finaceRechargeMemberSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input name="memberDispaly" style="width: 80px;"
						class="spinner" /></td>
					<td>充值类型：</td>
					<td><input id="finaceRechargeSetMemberSearchForm_type" name="rechargeSetType" style="width: 80px;"
						class="spinner" /></td> 	
					<td>创建时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember.finaceRechargeMemberDataGrid.datagrid('load',glacier.serializeObject($('#finaceRechargeMemberSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#finaceRechargeMemberSearchForm input').val('');glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeMember.finaceRechargeMemberDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>