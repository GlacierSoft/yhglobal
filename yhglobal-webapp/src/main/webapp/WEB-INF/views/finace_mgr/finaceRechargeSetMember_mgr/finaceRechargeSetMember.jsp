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
	$.util.namespace('glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeSetMember');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeSetMember.param = {
		toolbarId : 'finaceRechargeSetMemberDataGrid_toolbar',
		actions : {
             edit:{flag:'edit',controlType:'single'},
             del:{flag:'del',controlType:'multiple'},
             print:{flag:'print',controlType:'single'}
          }
     };

	//初始化承运商合同记录DataGrid
	glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeSetMember.finaceRechargeSetMemberDataGrid = $('#finaceRechargeSetMemberDataGrid ').datagrid({
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
						}] ],
						pagination : true,//True 就会在 datagrid 的底部显示分页栏
						pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
						pmemberList : [ 2, 10, 50, 100 ],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						toolbar : '#finaceRechargeSetMemberDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeSetMember.param,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeSetMember.param,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeSetMember.param,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeSetMember.param,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeSetMember.param,this).select();
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeSetMember.param,this).unSelect();
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
								title : '【' + rowData.rechargeSetName + '】充值详细信息',
								href : ctx+ '/do/finaceRechargeSetMemberController/intoDetail.htm?rechargeSetId='+ rowData.rechargeSetId,//从controller请求jsp页面进行渲染
								width : 560,
								height : 420,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});
						}
					});
	
	
	glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeSetMember.addFinaceRechargeSetMember=function(){
		  alert("add");
	};
	
	glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeSetMember.delFinaceRechargeSetMember=function(){
		 alert("del");
	};
	
	glacier.finace_mgr.finaceRechargeMember_mgr.finaceRechargeSetMember.editFinaceRechargeSetMember=function(){
		 alert("edit");
	};
	
</script>

<!-- 所有承运商合同记录表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="finaceRechargeSetMemberGridPanel" data-options="region:'center',border:true">
		<table id="finaceRechargeSetMemberDataGrid">
			<glacierui:toolbar panelEnName="FinaceRechargeSetMemberList"
				toolbarId="finaceRechargeSetMemberDataGrid_toolbar" menuEnName="finaceRechargeSetMember" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>