<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	
	$.util.namespace('glacier.storehouse_mgr.storehouseDamage.storehouseDamage');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.storehouse_mgr.storehouseDamage.storehouseDamage.param = {
		toolbarId : 'storehouseDamageDataGrid_toolbar',
		actions : {
			edit:{flag:'edit',controlType:'single'},
			del:{flag:'del',controlType:'multiple'},
			audit:{flag:'audit',controlType:'single'}
          }
     };

	//初始化客服DataGrid
	glacier.storehouse_mgr.storehouseDamage.storehouseDamage.storehouseDamageDataGrid = $('#storehouseDamageDataGrid').datagrid({
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
						url : ctx + '/do/storehouseDamage/list.json',
						sortName : 'createTime',//排序字段名称
						sortOrder : 'DESC',//升序还是降序
						remoteSort : true,//开启远程排序，默认为false
						idField : 'damageId',
						columns : [ [ {
							field : 'damageId',
							title : 'ID',
							checkbox : true
						},{
							field : 'belaidupId',
							title : '入库货物',
							width : 120,
							sortable : true
						}, {
							field : 'remark',
							title : '损坏说明',
							width : 120,
							sortable : true
						},{
							field : 'yesOrNo',
							title : '是否退货',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化
								return renderGridValue(value, fields.yesOrNo);
							}
						}, {
							field : 'auditStatus',
							title : '审核状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化
								return renderGridValue(value, fields.status);
							}
							
						}, {
							field : 'createrDisplay',
							title : '审核人',
							width : 120,
							sortable : true
						}, {
							field : 'auditOpinion',
							title : '审核内容',
							sortable : true,
							width : 120
						},{
							field : 'auditDate',
							title : '审核时间',
							sortable : true,
							width : 120
						}, {
							field : 'createrDisplay',
							title : '创建人',
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
						}, {
							field : 'remark',
							title : '备注',
							width : 120,
							sortable : true,
						} ] ],
						pagination : true,//True 就会在 datagrid 的底部显示分页栏
						pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
						pmemberList : [ 2, 10, 50, 100 ],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						toolbar : '#storehouseDamageDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.storehouse_mgr.storehouseDamage.storehouseDamage.param,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.storehouse_mgr.storehouseDamage.storehouseDamage.param,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.storehouse_mgr.storehouseDamage.storehouseDamage.param,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.storehouse_mgr.storehouseDamage.storehouseDamage.param,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.storehouse_mgr.storehouseDamage.storehouseDamage.param,this).select();
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.storehouse_mgr.storehouseDamage.storehouseDamage.param,this).unSelect();
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
								title : '【' + rowData.belaidupId + '】损坏详细信息',
								href : ctx+ '/do/storehouseDamage/intoDetail.htm?damageId='+ rowData.damageId,//从controller请求jsp页面进行渲染
								width : 560,
								height : 340,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});
						}
					});

	  //状态下拉项
	  $('#bankCardSearchForm_status').combobox({
			valueField : 'value',
			//height:18,
			width : 80,
			textField : 'label',
			panelHeight : 'auto',
			editable : false,
			//required:true,
			data : fields.auditState
		});
	  
	  $('#bankCardSearchForm_status_normal').combobox({
			valueField : 'value',
			//height:18,
			width : 80,
			textField : 'label',
			panelHeight : 'auto',
			editable : false,
			//required:true,
			data : fields.yesOrNo
		});
	
</script>



<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="storehouseDamageGridPanel" data-options="region:'center',border:true">
		<table id="storehouseDamageDataGrid">
			<glacierui:toolbar panelEnName="StorehouseDamageList"
				toolbarId="storehouseDamageDataGrid_toolbar" menuEnName="storageGoodsrun" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="contractSearchForm">
			<table>
				<tr>
					<td>货物名称：</td>
					<td><input name="belaidupDisplay" style="width: 80px;"
						class="spinner" /></td>
					<td>退还状态：</td>
					<td><input id="bankCardSearchForm_status" name="yesOrNo" style="width: 80px;" class="spinner"/></td>
					<td>审核状态：</td>
					<td><input id="bankCardSearchForm_status_normal" name="auditStatus" style="width: 80px;" class="spinner"/></td>
					<td>损坏时间：</td>
					<td><input name="damageStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="damageEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.storehouse_mgr.storehouseDamage.storehouseDamage.storehouseDamageDataGrid.datagrid('load',glacier.serializeObject($('#contractSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#contractSearchForm input').val('');glacier.storehouse_mgr.storehouseDamage.storehouseDamage.storehouseDamageDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>


