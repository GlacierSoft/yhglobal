<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	$.util.namespace('glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.param = {
		toolbarId : 'finaceRechargeSetMemberDataGrid_toolbar',
		actions : {
             edit:{flag:'edit',controlType:'single'},
             del:{flag:'del',controlType:'multiple'},
             audit:{flag:'audit',controlType:'single'}
          }
		
     };

	//选中行的时候默认调用的方法 
	glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.alwaySelect = function(){
		var rows = glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.finaceRechargeSetMemberDataGrid.datagrid("getSelected");
		if(rows.auditState == 'pass'){
			$('#finaceRechargeSetMember_btn_FinaceRechargeSetMemberList_edit').linkbutton('disable');//置灰修改按钮
			$('#finaceRechargeSetMember_btn_FinaceRechargeSetMemberList_audit').linkbutton('disable');//置灰审核按钮
		}
		if(rows.auditState == 'failure'){
			$('#finaceRechargeSetMember_btn_FinaceRechargeSetMemberList_audit').linkbutton('disable');//置灰审核按钮
		}
	};
	
	//初始化客服DataGrid
	glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.finaceRechargeSetMemberDataGrid = $('#finaceRechargeSetMemberDataGrid').datagrid({
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
						url : ctx + '/do/finaceRechargeSetMemberController/list.json',
						sortName : 'createTime',//排序字段名称
						sortOrder : 'DESC',//升序还是降序
						remoteSort : true,//开启远程排序，默认为false
						idField : 'rechargeSetId',
						columns : [ [ {
							field : 'rechargeSetId',
							title : 'ID',
							checkbox : true
						}, {
							field : 'rechargeSetName',
							title : '充值名称',
							width : 120,
							sortable : true
						}, {
							field : 'rechargeSetType',
							title : '充值类型',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {
								return renderGridValue(value, fields.rechargeType);
							}
						},{
							field : 'rechargeRate',
							title : '手续费率',
							width : 120,
							sortable : true
						},{
							field : 'rechargeMoney',
							title : '固定金额收取',
							width : 120,
							sortable : true
						},{
							field : 'feeWay',
							title : '取费方式',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {
								return renderGridValue(value, fields.feeWay);
							}
						},{
							field : 'gradeDisplay',
							title : '会员等级',
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
						pfinaceRechargeSetCarrierSize : 10,//注意，pfinaceRechargeSetCarrierSize必须在pfinaceRechargeSetCarrierList存在
						pfinaceRechargeSetCarrierList : [ 2, 10, 50, 100 ],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						toolbar : '#finaceRechargeSetMemberDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.param,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.param,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.param,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.param,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.param,this).select();
							glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.alwaySelect();
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.param,this).unSelect();
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
								href : ctx+ '/do/finaceRechargeSetMemberController/intoDetail.htm?rechargeSetId='+ rowData.rechargeSetId,//从controller请求jsp页面进行渲染
								width : 560,
								height : 360,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});
						}
					});

	//点击增加按钮触发方法
	glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.addFinaceRechargeSetMember = function(){
		 glacier.basicAddOrEditDialog({
			title : '【充值设置】- 增加',
			width : 800,
			height : 300,
			queryUrl : ctx + '/do/finaceRechargeSetMemberController/intoForm.htm',
			submitUrl : ctx + '/do/finaceRechargeSetMemberController/add.json',
			successFun : function (){
				glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.finaceRechargeSetMemberDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.editFinaceRechargeSetMember = function(){
		var row = glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.finaceRechargeSetMemberDataGrid.datagrid("getSelected");
		if ("authstr" ==row.auditState||"failure"==row.auditState) {
			glacier.basicAddOrEditDialog({
				title : '【充值设置】- 编辑',
				width : 800,
				height : 300,
				queryUrl : ctx + '/do/finaceRechargeSetMemberController/intoForm.htm',
				submitUrl : ctx + '/do/finaceRechargeSetMemberController/edit.json',
				queryParams : {
					rechargeSetId : row.rechargeSetId
				},
				successFun : function (){
					glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.finaceRechargeSetMemberDataGrid.datagrid('reload');
				}
			});
		}
		else{
			$.messager.alert('提示','已审核完毕,无法进行修改操作!','info');
		}
	};
	
	//点击审核按钮触发方法
	glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.auditFinaceRechargeSet= function(){
		var row =glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.finaceRechargeSetMemberDataGrid.datagrid("getSelected");
		var auditState = row.auditState;
		if ("authstr" == auditState||"failure"==auditState) {
			glacier.basicAddOrEditDialog({
				title : '【充值设置】- 审核',
				width : 660,
				height : 380,
				queryUrl : ctx + '/do/finaceRechargeSetMemberController/intoAudit.htm',
				submitUrl : ctx + '/do/finaceRechargeSetMemberController/audit.json',
				queryParams : {
					rechargeSetId : row.rechargeSetId
				},
				successFun : function (){
					glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.finaceRechargeSetMemberDataGrid.datagrid('reload');
				}
			});
		} else {
			$.messager.alert('提示','已审核完毕,请另选数据!','info');
		}
	};
	
	//点击删除按钮触发方法
	glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.delFinaceRechargeSetMember = function() {
		var rows =glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.finaceRechargeSetMemberDataGrid.datagrid("getChecked");
		var rechargeSetIds = [];//删除的id标识 
		var pass_numb=0;
		var str;
		for(var i=0;i<rows.length;i++){
			if(rows[i].auditState=="pass"){
				pass_numb+=1;
			}else{
				rechargeSetIds.push(rows[i].rechargeSetId);		
			}
		}
		if(pass_numb>0)
			str= "<font style='color:red;font-weight: bold;'>【"+pass_numb+"】</font>记录已审核,删除余下<font style='color:red;font-weight: bold;'>【"+rechargeSetIds.length+"】</font>记录？";
		else
			str="是否删除<font style='color:red;font-weight: bold;'>【"+rechargeSetIds.length+"】</font>记录信息!";
		
		if(rechargeSetIds.length > 0){
				$.messager.confirm('请确认',str, function(r){
						if (r){
							$.ajax({
								   type: "POST",
								   url: ctx + '/do/finaceRechargeSetMemberController/del.json',
								   data: {rechargeSetIds:rechargeSetIds.join(',')},
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
										   glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.finaceRechargeSetMemberDataGrid.datagrid('reload');
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
			}else{
				$.messager.confirm('请确认','记录信息已审核完毕,无法就行删除操作!', function(r){
					
				});
			}
		
	};
	
	
	
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

<!-- 所有列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="finaceRechargeSetMemberGridPanel" data-options="region:'center',border:true">
		<table id="finaceRechargeSetMemberDataGrid">
			<glacierui:toolbar panelEnName="FinaceRechargeSetMemberList"
				toolbarId="finaceRechargeSetMemberDataGrid_toolbar" menuEnName="finaceRechargeSetMember" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="finaceRechargeSetMemberSearchForm">
			<table>
				<tr>
					<td>类型名称：</td>
					<td><input name="rechargeSetName" style="width: 80px;"
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
						onclick="glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.finaceRechargeSetMemberDataGrid .datagrid('load',glacier.serializeObject($('#finaceRechargeSetMemberSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#finaceRechargeSetMemberSearchForm input').val('');glacier.finace_mgr.finaceRechargeSetMember_mgr.finaceRechargeSetMember.finaceRechargeSetMemberDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>