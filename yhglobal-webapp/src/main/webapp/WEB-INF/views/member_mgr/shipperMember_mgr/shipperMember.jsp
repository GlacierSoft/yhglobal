<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	$.util.namespace('glacier.member_mgr.member_mgr.member');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.member_mgr.member.param = {
		toolbarId : 'memberDataGrid_toolbar',
		actions : {
             status:{flag:'status',controlType:'single'},
             audit:{flag:'audit',controlType:'single'}
          }
     };

	//选中行的时候默认调用的方法 
	glacier.member_mgr.member_mgr.member.alwaySelect = function(){
		 var row =  glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid("getSelected");
		 if(row.memberType=="individuality"){
			$('#shipperMember_btn_MemberList_audit').linkbutton('disable');//置灰企业认证按钮
		  }   
	};
	
	
	//初始化货主会员DataGrid
	glacier.member_mgr.member_mgr.member.memberDataGrid = $('#memberDataGrid').datagrid({
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
						url : ctx + '/do/shippermember/list.json',
						sortName : 'createTime',//排序字段名称
						sortOrder : 'DESC',//升序还是降序
						remoteSort : true,//开启远程排序，默认为false
						idField : 'memberId',
						columns : [ [ {
							field : 'memberId',
							title : 'ID',
							checkbox : true
						}, {
							field : 'memberName',
							title : '会员名称',
							width : 120,
							sortable : true
						},{
							field : 'status',
							title : '会员状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化，例如man显示是，woman显示女
								return renderGridValue(value, fields.status);
							}
						}, {
							field : 'memberType',
							title : '会员类型',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化，例如man显示是，woman显示女
								return renderGridValue(value, fields.memberType);
							}
						},{
							field : 'email',
							title : '会员邮箱',
							width : 120,
							sortable : true
						},{
							field : 'integral',
							title : '会员积分',
							width : 120,
							sortable : true
						},{
							field : 'accountBalance',
							title : '账户余额',
							width : 120,
							sortable : true
						}, {
							field : 'registrationTime',
							title : '注册时间',
							sortable : true,
							width : 200
						}, {
							field : 'loginCount',
							title : '登录次数',
							sortable : true,
							width : 120
						},{
							field : 'createrDisplay',
							title : '创建人',
							sortable : true,
							width : 120
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
							sortable : true,
							width : 120
						} ] ],
						pagination : true,//True 就会在 datagrid 的底部显示分页栏
						pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
						pmemberList : [ 2, 10, 50, 100 ],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						toolbar : '#memberDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.member_mgr.member_mgr.member.param,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.member_mgr.member_mgr.member.param,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.member_mgr.member_mgr.member.param,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.member_mgr.member_mgr.member.param,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.member_mgr.member_mgr.member.param,this).select();
						        	glacier.member_mgr.member_mgr.member.alwaySelect();
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.member_mgr.member_mgr.member.param,this).unSelect();
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
								title : '【' + rowData.memberName + '】会员详细信息',
								href : ctx+ '/do/shippermember/intoDetail.htm?memberId='+ rowData.memberId,//从controller请求jsp页面进行渲染
								height : 500,
								width : 610,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});
						}
					});
 

	
	//点击认证按钮触发方法
	glacier.member_mgr.member_mgr.member.audit= function(){
		var row =  glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid("getSelected");
		var auditState = row.memberType;
		if ("enterprise" == auditState) {
			glacier.basicAddOrEditDialog({
				title : '【'+row.memberName+'】-企业认证',
				width : 558,
				height : 500,
				queryUrl : ctx + '/do/shippermember/intoAudit.htm',
				submitUrl : ctx + '/do/shippermember/audit.json',
				queryParams : {
					memberId : row.memberId
				},
				successFun : function (){
					glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid('reload');
			    }
			}); 
		} else {
			alert("个体货主会员不需认证!");
		} 
	}; 
	
	
	//点击启用禁用按钮触发方法
	glacier.member_mgr.member_mgr.member.editMember = function(){
    var row = glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid("getSelected");
    $.messager.confirm('请确认', '是否要启用/禁用该会员?', function(r){
		if (r){ 
		    $.ajax({
				   type: "POST",
				   url: ctx + '/do/shippermember/status.json',
				   data: {memberId:row.memberId}, 
				   dataType:'json',
				   success: function(r){
					   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
						   $.messager.show({
								title:'提示',
								timeout:3000,
								msg:r.msg
							});
						   glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid('reload');
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
	//货主会员模糊查询
	glacier.member_mgr.member_mgr.member.quickquery = function(value, name) {
		var obj = $.parseJSON('{"' + name + '":"' + value + '"}');//将值和对象封装成obj作为参数传递给后台
		glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid('load',obj);
	};
	//下拉项的值
	$('#memberSearchForm_status').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.status
	});
	$('#memberSearchForm_type').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.memberType
	});
</script>

<!-- 所有货主会员列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="memberGridPanel" data-options="region:'center',border:true">
		<table id="memberDataGrid">
			<glacierui:toolbar panelEnName="memberList"
				toolbarId="memberDataGrid_toolbar" menuEnName="shipperMember" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="memberSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input name="memberName" style="width: 80px;"
						class="spinner" /></td> 
					<td>状态：</td>
					<td><input id="memberSearchForm_status" name="status"
						style="width: 80px;" class="spinner" /></td>
					<td>类型：</td>
					<td><input id="memberSearchForm_type" name="memberType"
						style="width: 80px;" class="spinner" /></td>
					<td>录入时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid('load',glacier.serializeObject($('#memberSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#memberSearchForm input').val('');glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>