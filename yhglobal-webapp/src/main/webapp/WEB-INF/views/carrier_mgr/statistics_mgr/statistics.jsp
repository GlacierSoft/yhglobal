<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	
	$.util.namespace('glacier.member_mgr.statistics_mgr.statistics');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.statistics_mgr.statistics.param = {
		toolbarId : 'statisticsDataGrid_toolbar',
		actions : {
             edit:{flag:'edit',controlType:'single'},
             del:{flag:'del',controlType:'multiple'},
             audit:{flag:'audit',controlType:'single'}
          }
     };

	//初始化货主银行卡DataGrid
	glacier.member_mgr.statistics_mgr.statistics.statisticsDataGrid = $('#statisticsDataGrid').datagrid({
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
 						url : ctx + '/do/carrierMemberStatistics/list.json',
						sortName : 'memberId',//排序字段名称
						sortOrder : 'DESC',//升序还是降序
						remoteSort : true,//开启远程排序，默认为false
						idField : 'memberId',
						columns : [ [ {
							field : 'memberId',
							title : 'ID',
							checkbox : true
						}, {
							field : 'memberName',
							title : '承运商名称',
							width : 120,
							sortable : true
						}, {
							field : 'income',
							title : '收入总金额',
							width : 120,
							sortable : true
						},{
							field : 'retruns',
							title : '返还总金额',
							width : 120,
							sortable : true
						}, {
							field : 'recharge',
							title : '充值总金额',
							width : 120,
							sortable : true
						}, {
							field : 'withdarw',
							title : '提现总金额',
							width : 120,
							sortable : true
						},{
							field : 'driverCount',
							title : '驾驶员总人数',
							width : 120,
							sortable : true
						}, {
							field : 'carCount',
							title : '车辆总数',
							sortable : true,
							width : 120
						}, {
							field : 'dispatchingCount',
							title : '运送成功次数',
							sortable : true,
							width : 120
						}] ],
						pagination : true,//True 就会在 datagrid 的底部显示分页栏
						pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
						pmemberList : [ 2, 10, 50, 100 ],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						toolbar : '#statisticsDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.member_mgr.statistics_mgr.statistics.param,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.member_mgr.statistics_mgr.statistics.param,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.member_mgr.statistics_mgr.statistics.param,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.member_mgr.statistics_mgr.statistics.param,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.member_mgr.statistics_mgr.statistics.param,this).select();
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.member_mgr.statistics_mgr.statistics.param,this).unSelect();
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
								title : '【' + rowData.memberName + '】承运商统计详情',
								href : ctx+ '/do/carrierMemberStatistics/intoDetail.htm?memberId='+ rowData.memberId,//从controller请求jsp页面进行渲染
								width : 570,
								height : 260,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});
						}
					});
	
</script>


<div class="easyui-layout" data-options="fit:true">
    
    <div id="statisticsGridPanel" data-options="region:'center',border:true">
		<table id="statisticsDataGrid">
			<%-- <glacierui:toolbar panelEnName="BankCardList"
				toolbarId="statisticsDataGrid_toolbar" menuEnName="carrierStatistics" /> --%>
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>

  <div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="statisticsSearchForm">
			<table>
				<tr>
					<td>承运商名称：</td>
					<td><input name="memberName" style="width: 80px;"
						class="spinner" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.member_mgr.statistics_mgr.statistics.statisticsDataGrid.datagrid('load',glacier.serializeObject($('#statisticsSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#statisticsSearchForm input').val('');glacier.member_mgr.statistics_mgr.statistics.statisticsDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
	
	
	
</div>