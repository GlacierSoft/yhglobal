<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	
	$.util.namespace('glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.param = {
		toolbarId : 'carrierBankCardDataGrid_toolbar',
		actions : {
             edit:{flag:'edit',controlType:'single'},
             del:{flag:'del',controlType:'multiple'},
             audit:{flag:'audit',controlType:'single'}
          }
     };

	//初始化客服DataGrid
	glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.carrierBankCardDataGrid = $('#carrierBankCardDataGrid').datagrid({
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
 						url : ctx + '/do/carrierBankCard/list.json',
						sortName : 'createTime',//排序字段名称
						sortOrder : 'DESC',//升序还是降序
						remoteSort : true,//开启远程排序，默认为false
						idField : 'bankcardId',
						columns : [ [ {
							field : 'bankcardId',
							title : 'ID',
							checkbox : true
						}, {
							field : 'memberDisplay',
							title : '账户名称',
							width : 120,
							sortable : true
						}, {
							field : 'bankName',
							title : '开户行名称',
							width : 120,
							sortable : true
						},{
							field : 'cardName',
							title : '银行卡名称',
							width : 120,
							sortable : true
						}, {
							field : 'cardNumber',
							title : '银行卡号',
							width : 120,
							sortable : true,
						}, {
							field : 'auditState',
							title : '审核状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化
								return renderGridValue(value, fields.auditState);
							}
						}, {
							field : 'auditDisplay',
							title : '审核人',
							width : 120,
							sortable : true,
						}, {
							field : 'auditOpinion',
							title : '审核内容',
							width : 120,
							sortable : true,
						}, {
							field : 'auditTime',
							title : '审核时间',
							sortable : true,
							width : 120
						}, {
							field : 'createrDisplay',
							title : '创建人',
							sortable : true,
							width : 120
						}, {
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
						toolbar : '#carrierBankCardDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.param ,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.param ,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.param ,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.param ,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.param ,this).select();
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.param ,this).unSelect();
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
								title : '【' + rowData.memberDisplay + '】银行卡帐号详情',
								href : ctx+ '/do/carrierBankCard/intoDetail.htm?bankcardId='+ rowData.bankcardId,//从controller请求jsp页面进行渲染
								width : 540,
								height : 360,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});
						}
					});
	
	//点击审核触发按钮
	glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.checkCarrierBankCard=function(){
		var row =glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.carrierBankCardDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
				title :"【"+row.carrierDisplay+"】银行卡信息审核",
				width : 580,
				height : 380,
				queryUrl : ctx + '/do/carrierBankCard/intoAudit.htm',
				submitUrl : ctx + '/do/carrierBankCard/audit.json',
				queryParams : {
					bankcardId : row.bankcardId
				},
				successFun : function (){
					glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.carrierBankCardDataGrid.datagrid('reload');
				}
			});
	};
	
	
</script>


<div class="easyui-layout" data-options="fit:true">
    
    <div id="carrierBankCardGridPanel" data-options="region:'center',border:true">
		<table id="carrierBankCardDataGrid">
			<glacierui:toolbar panelEnName="CarrierBankCardList"
				toolbarId="carrierBankCardDataGrid_toolbar" menuEnName="carrierBankCard" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>

  <div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="carrierBankCodeSearchForm">
			<table>
				<tr>
					<td>账户名称：</td>
					<td><input name="memberDisplay" style="width: 80px;"
						class="spinner" /></td>
					<td>银行卡名称：</td>
					<td><input name="cardName" style="width: 80px;"
						class="spinner" /></td>
					<td>银行卡号：</td>
					<td><input id="cardNumber" name="cardNumber"
						style="width: 80px;" class="spinner" /></td>
					<td>录入时间：</td>
					<td><input name="bankCardStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="bankCardEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.carrierBankCardDataGrid.datagrid('load',glacier.serializeObject($('#carrierBankCodeSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#carrierBankCodeSearchForm input').val('');glacier.carrier_mgr.carrierBankCard_mgr.carrierBankCard.carrierBankCardDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
	
	
	
</div>