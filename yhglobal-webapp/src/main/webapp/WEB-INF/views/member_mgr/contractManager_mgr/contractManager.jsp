<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	
	$.util.namespace('glacier.member_mgr.contractManager_mgr.contractManager');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.contractManager_mgr.contractManager.param = {
		toolbarId : 'contractManagerDataGrid_toolbar',
		actions : {
			edit:{flag:'edit',controlType:'single'},
			del:{flag:'del',controlType:'multiple'},
			audit:{flag:'audit',controlType:'single'}
          }
     };

	//初始化客服DataGrid
	glacier.member_mgr.contractManager_mgr.contractManager.contractManagerDataGrid = $('#contractManagerDataGrid').datagrid({
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
						url : ctx + '/do/contractManager/list.json',
						sortName : 'createTime',//排序字段名称
						sortOrder : 'DESC',//升序还是降序
						remoteSort : true,//开启远程排序，默认为false
						idField : 'contractTypeId',
						columns : [ [ {
							field : 'contractTypeId',
							title : 'ID',
							checkbox : true
						},{
							field : 'contractTypeName',
							title : '合同类型',
							width : 120,
							sortable : true
						}, {
							field : 'timeLimit',
							title : '有效期限',
							width : 120,
							sortable : true
						},{
							field : 'status',
							title : '合同状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化
								return renderGridValue(value, fields.status);
							}
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
						toolbar : '#contractManagerDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.member_mgr.contractManager_mgr.contractManager.param,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.member_mgr.contractManager_mgr.contractManager.param,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.member_mgr.contractManager_mgr.contractManager.param,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.member_mgr.contractManager_mgr.contractManager.param,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.member_mgr.contractManager_mgr.contractManager.param,this).select();
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.member_mgr.contractManager_mgr.contractManager.param,this).unSelect();
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
								title : '【' + rowData.contractTypeName + '】合同详细信息',
								href : ctx+ '/do/contractManager/intoDetail.htm?contractTypeId='+ rowData.contractTypeId,//从controller请求jsp页面进行渲染
								width : 560,
								height : 240,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});
						}
					});
	
	//点击添加按钮触发按钮
	glacier.member_mgr.contractManager_mgr.contractManager.addContractorManager=function(){
		glacier.basicAddOrEditDialog({
			title : '合同类型增加',
			width : 450,
			height : 300,
			queryUrl : ctx + '/do/contractManager/intoForm.htm',
			submitUrl : ctx + '/do/contractManager/add.json',
			successFun : function (){
				glacier.member_mgr.contractManager_mgr.contractManager.contractManagerDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击修改触发按钮
	glacier.member_mgr.contractManager_mgr.contractManager.updateContractorManager=function(){
		var row =glacier.member_mgr.contractManager_mgr.contractManager.contractManagerDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : "【"+row.contractTypeName+"】编辑合同类型设置",
			width : 450,
			height : 300,
			queryUrl : ctx + '/do/contractManager/intoForm.htm',
			submitUrl : ctx + '/do/contractManager/edit.json',
			queryParams : {
				contractTypeId : row.contractTypeId
			},
			successFun : function (){
				glacier.member_mgr.contractManager_mgr.contractManager.contractManagerDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击删除触发按钮
	glacier.member_mgr.contractManager_mgr.contractManager.delContractorManager=function(){
		var rows =glacier.member_mgr.contractManager_mgr.contractManager.contractManagerDataGrid.datagrid("getChecked");
		var contractTypeIds = [];//删除的id标识 
		for(var i=0;i<rows.length;i++){
			contractTypeIds.push(rows[i].contractTypeId); 
		}
		if(contractTypeIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/contractManager/del.json',
						   data: {contractTypeIds:contractTypeIds.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										width:380,
										height:120,
										timeout:3000,
										msg:r.msg,
										icon:'info'
									});
								   glacier.member_mgr.contractManager_mgr.contractManager.contractManagerDataGrid.datagrid('reload');
							   }else{
									$.messager.show({//后台验证弹出错误提示信息框
										title:'错误提示',
										width:380,
										height:120,
										msg: r.msg,
										icon:'error',
										timeout:4500
									});
								}
						   }
					});
				}
			});
		}
	};
	
	//点击启用禁用触发按钮
	glacier.member_mgr.contractManager_mgr.contractManager.editContractorManager=function(){
		var row = glacier.member_mgr.contractManager_mgr.contractManager.contractManagerDataGrid.datagrid("getSelected");
		var str="";
		if(row.status=="enable")
			  str="禁用";
		else
			  str="启用";
        $.messager.confirm('请确认', '是否要'+str+'该条合同类型记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/contractManager/audit.json',
						   data: {contractTypeId:row.contractTypeId},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.member_mgr.contractManager_mgr.contractManager.contractManagerDataGrid.datagrid('reload');
							   }else{
								   $.messager.show({//后台验证弹出错误提示信息框
										title:'错误提示',
										width:380,
										height:120,
										msg: '<span style="color:red">'+r.msg+'<span>',
										timeout:4500
									});
								}
						   }
					});
				}
			});
		

		
	};
	
</script>



<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="contractManagerGridPanel" data-options="region:'center',border:true">
		<table id="contractManagerDataGrid">
			<glacierui:toolbar panelEnName="ContractManagerList"
				toolbarId="contractManagerDataGrid_toolbar" menuEnName="contractManager" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>