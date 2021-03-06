<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.website_mgr.feedback_mgr.feedback');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.website_mgr.feedback_mgr.feedback.param = {
			toolbarId : 'feedbackDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化意见DataGrid
	glacier.website_mgr.feedback_mgr.feedback.feedbackDataGrid = $('#feedbackDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/feedback/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'webFdbId',
		columns:[[
			{
				field:'webFdbId',
				title:'ID',
				checkbox:true
			},{
				field:'webFdbName',
				title:'姓名',
				width:280,
				sortable:true
			},{
				field:'webFdbPhone',
				title:'联系号码',
				width:280,
				sortable:true
			},{
				field:'webFdbEmail',
				title:'邮箱',
				width:280,
				sortable:true
			},{
				field:'createrDisplay',
				title:'创建人',
				sortable:true,
				width:100
			},{
				field:'createTime',
				title:'创建时间',
				sortable:true,
				width:200
			},{
				field:'updaterDisplay',
				title:'更新人',
				sortable:true,
				width:100
			},{
				field:'updateTime',
				title:'更新时间',
				sortable:true,
				width:200
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pfeedbackSize : 10,//注意，pfeedbackSize必须在pfeedbackList存在
		pfeedbackList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#feedbackDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.website_mgr.feedback_mgr.feedback.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.website_mgr.feedback_mgr.feedback.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.website_mgr.feedback_mgr.feedback.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.website_mgr.feedback_mgr.feedback.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.website_mgr.feedback_mgr.feedback.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.website_mgr.feedback_mgr.feedback.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
			var rows=$(this).datagrid("getRows");
			if(rows.length==0){   
				var body = $(this).data().datagrid.dc.body2;
				body.find('table tbody').append('<tr><td width="' + body.width() + '" style="height: 25px; text-align: center;color:red">暂时没有记录</td></tr>');
			}
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: "【"+rowData.webFdbName+"】的意见详细信息",
				href : ctx + '/do/feedback/intoDetail.htm?webFdbId='+rowData.webFdbId,//从controller请求jsp页面进行渲染
				width : 740,
				height : 535,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击删除按钮触发方法
	glacier.website_mgr.feedback_mgr.feedback.delAnnouncement = function(){
		var rows = glacier.website_mgr.feedback_mgr.feedback.feedbackDataGrid.datagrid("getChecked");
		var webAnnIds = [];//删除的id标识
		var webAnnThemes = [];//意见主题
		for(var i=0;i<rows.length;i++){
			webAnnIds.push(rows[i].webFdbId);
			webAnnThemes.push(rows[i].webFdbName);
		}
		if(webAnnIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/feedback/del.json',
						   data: {webAnnIds:webAnnIds.join(','),webAnnThemes:webAnnThemes.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.website_mgr.feedback_mgr.feedback.feedbackDataGrid.datagrid('reload');
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
		}
	};
	//意见资料模糊查询
	glacier.website_mgr.feedback_mgr.feedback.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.website_mgr.feedback_mgr.feedback.feedbackDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有意见列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="feedbackGridPanel" data-options="region:'center',border:true" >
		<table id="feedbackDataGrid">
			<glacierui:toolbar panelEnName="FeedbackList" toolbarId="feedbackDataGrid_toolbar" menuEnName="feedback"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>