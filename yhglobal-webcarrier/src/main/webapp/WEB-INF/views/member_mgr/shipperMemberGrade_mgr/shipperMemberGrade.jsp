<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	$.util.namespace('glacier.memberGrade_mgr.memberGrade_mgr.memberGrade');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.param = {
		toolbarId : 'memberGradeDataGrid_toolbar',
		actions : {
             edit:{flag:'edit',controlType:'single'},
             del:{flag:'del',controlType:'multiple'}
          }
     };

	//初始化客服DataGrid
	glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.memberGradeDataGrid = $('#memberGradeDataGrid').datagrid({
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
						url : ctx + '/do/shipperMemberGrade/list.json',
						sortName : 'createTime',//排序字段名称
						sortOrder : 'DESC',//升序还是降序
						remoteSort : true,//开启远程排序，默认为false
						idField : 'gradeId',
						columns : [ [ {
							field : 'gradeId',
							title : 'ID',
							checkbox : true
						}, {
							field : 'gradeName',
							title : '等级名称',
							width : 120,
							sortable : true
						}, {
							field : 'scopeStart',
							title : '积分开始值',
							width : 120,
							sortable : true
						}, {
							field : 'scopeStop',
							title : '积分结束值',
							width : 120,
							sortable : true
						}, {
							field : 'gradeGps',
							title : '是否享有GPS跟踪服务',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {
								return renderGridValue(value, fields.status);
							}
						}, {
							field : 'gradeEmail',
							title : '是否享有邮件服务',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {
								return renderGridValue(value, fields.status);
							}
						}, {
							field : 'gradeMobile',
							title : '是否享有短信服务',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {
								return renderGridValue(value, fields.status);
							}
						},{
							field : 'status',
							title : '等级状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {
								return renderGridValue(value, fields.status);
							}
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
						pmemberGradeSize : 10,//注意，pmemberGradeSize必须在pmemberGradeList存在
						pmemberGradeList : [ 2, 10, 50, 100 ],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						toolbar : '#memberGradeDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.param,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.param,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.param,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.param,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.param,this).select();
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.param,this).unSelect();
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
								title : '【' + rowData.gradeName + '】会员等级详细信息',
								href : ctx+ '/do/shipperMemberGrade/intoDetail.htm?gradeId='+ rowData.gradeId,//从controller请求jsp页面进行渲染
								width : 840,
								height : 460,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});
						}
					});

	// 增加会员信用等级
	glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.addMemberGrade = function(){
		glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.memberGradeDialog('【会员等级】- 增加会员等级',false,'/do/shipperMemberGrade/add.json');
	};
	
	//编辑会员信用等级
	glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.editMemberGrade = function(){
		glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.memberGradeDialog('【会员等级】- 编辑会员等级',true,'/do/shipperMemberGrade/edit.json');
	};
	
	/**
	打开新建或者编辑窗口
	title:要打开的窗口标题
	editModel: true or false ，是否复制当前选择行数据到form中
	url:点击保存按钮请求的url
	*/
	glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.memberGradeDialog = function(title,editModel,url){
		$.easyui.showDialog({
			href : ctx + '/do/shipperMemberGrade/intoForm.htm',//从controller请求jsp页面进行渲染
			width : 840,
			height : 415,
			resizable: false,
			enableSaveButton : false,
			enableApplyButton : false,
			title : title,
			buttons : [{
				text : '保存',
				iconCls : 'icon-save',
				handler : function(dia) {
					$('#memberGrade_mgr_grade_form').form('submit', {
						url: ctx + url,
						success: function(r){
							glacier.show({msg:r.msg,result:r.success});
							glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.memberGradeDataGrid.datagrid('reload');
						    dia.dialog("close"); 
						}
					});
				}
			}],
			onLoad : function() {
				if(editModel){//编辑模式
					var row = glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.memberGradeDataGrid.datagrid("getSelected");
					if(row){
						$('#memberGrade_mgr_grade_form').form('load', row );
					}else{
						$.messager.show({//提示用户
							title : '提示',
							timeout:3000,
							msg : '请选择一行数据进行编辑'
						});
					}
				}
			}
		});
	};
	
	//点击删除按钮触发方法
	glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.delMemberGrade = function() {
		var rows = glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.memberGradeDataGrid.datagrid("getChecked");
		var memberGradeIds = [];//删除的id标识
		var memberGradeNames = [];
		for ( var i = 0; i < rows.length; i++) {
			memberGradeIds.push(rows[i].gradeId);
			memberGradeNames.push(rows[i].gradeName);
		}
		if (memberGradeIds.length > 0) {
			$.messager.confirm('请确认','是否要删除该记录',function(r){
                   if (r){
                   	 $.ajax({ 
                   		type: "POST",
                   	    url : ctx+ '/do/shipperMemberGrade/del.json',
						data : {
							memberGradeIds : memberGradeIds.join(','),
							memberGradeNames : memberGradeNames.join(',')
						},
						dataType : 'json',
						success : function(r) {
							if (r.success) {//因为失败成功的方法都一样操作，这里故未做处理
								$.messager.show({
									title : '提示',
									timeout : 3000,
									msg : r.msg
								});
                                            glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.memberGradeDataGrid.datagrid('reload');
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
	glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.quickquery = function(value, name) {
		var obj = $.parseJSON('{"' + name + '":"' + value + '"}');//将值和对象封装成obj作为参数传递给后台
		glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.memberGradeDataGrid.datagrid('load',obj);
	};
	//下拉项的值
	$('#memberGradeSearchForm_status').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.status
	});
	$('#memberGradeSearchForm_type').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.memberGradeType
	});
</script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="memberGradeGridPanel" data-options="region:'center',border:true">
		<table id="memberGradeDataGrid">
			<glacierui:toolbar panelEnName="MemberGradList"
				toolbarId="memberGradeDataGrid_toolbar" menuEnName="memberGrade" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="memberGradeSearchForm">
			<table>
				<tr>
					<td>会员等级名称：</td>
					<td><input name="gradeName" style="width: 80px;"
						class="spinner" /></td> 
					<td>录入时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.memberGradeDataGrid.datagrid('load',glacier.serializeObject($('#memberGradeSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#memberGradeSearchForm input').val('');glacier.memberGrade_mgr.memberGrade_mgr.memberGrade.memberGradeDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>