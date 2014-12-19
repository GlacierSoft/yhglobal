<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	$.util.namespace('glacier.carrierDetail_mgr.carrierDetail_mgr.financeCarrierDetail');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.carrierDetail_mgr.carrierDetail_mgr.financeCarrierDetail.param = {
		toolbarId : 'financeCarrierDetailDataGrid_toolbar',
		actions : {
             edit:{flag:'edit',controlType:'single'},
             del:{flag:'del',controlType:'multiple'},
             audit:{flag:'audit',controlType:'single'}
          }
     };

	//初始化DataGrid
	glacier.carrierDetail_mgr.carrierDetail_mgr.financeCarrierDetail.financeCarrierDetailDataGrid = $('#financeCarrierDetailDataGrid').datagrid({
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
						url : ctx + '/do/financeCarrierDetail/list.json',
						sortName : 'createTime',//排序字段名称
						sortOrder : 'DESC',//升序还是降序
						remoteSort : true,//开启远程排序，默认为false
						idField : 'detailId',
						columns : [ [ {
							field : 'detailId',
							title : 'ID',
							checkbox : true
						}, {
							field : 'carrierMemberDisplay',
							title : '承运商名称',
							width : 120,
							sortable : true
						}, {
							field : 'articleDisplay',
							title : '订单编号',
							width : 120,
							sortable : true
						},{
							field : 'detailIncome',
							title : '收入金额',
							width : 120,
							sortable : true
						},{
							field : 'detailFreeze',
							title : '冻结金额',
							width : 120,
							sortable : true
						},/* {
							field : 'detailStart',
							title : '冻结时间',
							width : 120,
							sortable : true
						},{
							field : 'detailEnd',
							title : '解冻时间',
							width : 120,
							sortable : true
						}, */{
							field : 'removeFreeze',
							title : '解冻金额',
							width : 120,
							sortable : true
						},{
							field : 'detailStatus',
							title : '资金状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {
								return renderGridValue(value, fields.detailStatus);
							}
						},{
							field : 'detailMark',
							title : '扣除金额',
							width : 120,
							sortable : true
						},{
							field : 'detailReturn',
							title : '返还金额',
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
						pfinanceCarrierDetailSize : 10,//注意，pfinanceCarrierDetailSize必须在pfinanceCarrierDetailList存在
						pfinanceCarrierDetailList : [ 2, 10, 50, 100 ],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						toolbar : '#financeCarrierDetailDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.carrierDetail_mgr.carrierDetail_mgr.financeCarrierDetail.param,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.carrierDetail_mgr.carrierDetail_mgr.financeCarrierDetail.param,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.carrierDetail_mgr.carrierDetail_mgr.financeCarrierDetail.param,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.carrierDetail_mgr.carrierDetail_mgr.financeCarrierDetail.param,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.carrierDetail_mgr.carrierDetail_mgr.financeCarrierDetail.param,this).select();
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.carrierDetail_mgr.carrierDetail_mgr.financeCarrierDetail.param,this).unSelect();
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
								title : '提现类型详细信息',
								href : ctx+ '/do/financeCarrierDetail/intoDetail.htm?carrierId='+ rowData.detailId,//从controller请求jsp页面进行渲染
								width : 830,
								height : 490,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});
						}
					});

	
	//资料模糊查询
	glacier.carrierDetail_mgr.carrierDetail_mgr.financeCarrierDetail.quickquery = function(value, name) {
		var obj = $.parseJSON('{"' + name + '":"' + value + '"}');//将值和对象封装成obj作为参数传递给后台
		glacier.carrierDetail_mgr.carrierDetail_mgr.financeCarrierDetail.financeCarrierDetailDataGrid.datagrid('load',obj);
	};
	//下拉项的值
	$('#financeCarrierDetailSearchForm_type').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.withdrawType
	});
</script>

<!-- 所有列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="financeCarrierDetailGridPanel" data-options="region:'center',border:true">
		<table id="financeCarrierDetailDataGrid">
			<%-- <glacierui:toolbar panelEnName="financeCarrierDetailList"
				toolbarId="financeCarrierDetailDataGrid_toolbar" menuEnName="financeCarrierDetail" /> --%>
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="financeCarrierDetailSearchForm">
			<table>
				<tr>
					<td>承运商名称：</td>
					<td><input id="carrierMemberDisplay" name="carrierMemberDisplay" style="width: 80px;"
						class="spinner" /></td> 	
					<td>货物名称：</td>
					<td><input id="articleDisplay" name="articleDisplay" style="width: 80px;"
						class="spinner" /></td> 
					<td>创建时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.carrierDetail_mgr.carrierDetail_mgr.financeCarrierDetail.financeCarrierDetailDataGrid.datagrid('load',glacier.serializeObject($('#financeCarrierDetailSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#financeCarrierDetailSearchForm input').val('');glacier.carrierDetail_mgr.carrierDetail_mgr.financeCarrierDetail.financeCarrierDetailDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>