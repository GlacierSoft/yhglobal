<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<%    
String path = request.getContextPath();    
// 获得本项目的地址(例如: http://localhost:8080/MyApp/)赋值给basePath变量    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
// 将 "项目路径basePath" 放入pageContext中，待以后用EL表达式读出。    
pageContext.setAttribute("basePath",basePath);    
%> 

<script type="text/javascript">
$.util.namespace('glacier.website_mgr.announcement_mgr.announcement');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

//初始化公告DataGrid
glacier.website_mgr.announcement_mgr.announcement.announcementDataGrid = $('#announcementDataGrid').datagrid({
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
	url: ctx + '/do/announcement/list.json',
	sortName: 'webAnnNum',//排序字段名称
	sortOrder: 'DESC',//升序还是降序
	remoteSort: true,//开启远程排序，默认为false
	idField:'webAnnId',
	columns:[[
		{
			field:'webAnnId',
			title:'ID',
			checkbox:true
		},{
			field:'webAnnTheme',
			title:'公告主题',
			width:350,
			sortable:true
		},{
			field:'webAnnStatus',
			title:'公告状态',
			width:80,
			sortable:true,
			formatter: function(value,row,index){//数据格式化，例如enable显示启用，disable显示禁用
				return renderGridValue(value,fields.status);
			}
		},{
			field:'webAnnNum',
			title:'排序号',
			width:80,
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
		}
	]],
	pagination : true,//True 就会在 datagrid 的底部显示分页栏
	pannouncementSize : 10,//注意，pannouncementSize必须在pannouncementList存在
	pannouncementList : [2,10,50,100],//从session中获取
	rownumbers:true,//True 就会显示行号的列
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
			title: rowData.webAnnTheme,
			href : ctx + '/do/announcement/intoDetail.htm?webAnnId='+rowData.webAnnId,//从controller请求jsp页面进行渲染
			width : 720,
			height : 520,
			resizable: false,
			enableApplyButton : false,
			enableSaveButton : false
		});
	}
});
//panel切换
function  doClick(str,url){
    $("#layout_center_panel").panel("setTitle",str);
	$('#layout_center_panel').panel('refresh',ctx +url);
}
	
</script>
<div style="margin:10px 10px 40px 20px;">
	<div id="newsDataGridPanel" class="easyui-panel" title="提醒管理"    
	        style="width:1000%;height:300px;background:#fafafa; "> 
	<!-- 站内信消息 -->
	<div style="float:left;margin:20px 10px 15px 40px;">
		<div id="newsDataGridPanel" class="easyui-panel" title="我的消息"    
		        style="width:220px;height:220px;background:#fafafa;">  
			<table>
				<tr>
					<td style="padding-left: 20px">未读消息： </td>
					<td>( <span style="color:red;cursor: pointer;" onclick="doClick('未读消息信息','/do/carrierMemberMessageNotice/index.htm');">${countWithout}</span> ) 条</td>
				</tr>
				<tr>
					<td style="padding-left: 20px">已读消息： </td>
					<td>( <span style="color:red;cursor: pointer;" onclick="doClick('已读消息信息','/do/carrierMemberMessageNotice/index.htm');">${countAlready}</span> ) 条</td>
				</tr>
				<!-- <tr>
					<td style="padding-left: 20px">总消息： </td>
					<td>( <span style="color:red;cursor: pointer;" onclick="doClick('借款等待资料的审核','/do/borrowingLoan/borrowingLoanFirstAudit.htm');">5</span> ) 条</td>
				</tr> -->
			</table>
		</div>
	</div>
	<!-- 分配订单 -->
	<div style="float:left;margin:20px 25px 25px 20px;">
		<div id="newsDataGridPanel" class="easyui-panel" title="我的订单"    
		        style="width:280px;height:220px;background:#fafafa;">  
			<table>
				<tr>
					<td style="padding-left: 20px">未分配订单：</td>
					<td style="padding-left: 30px">( <span style="color:red; cursor: pointer; " onclick="doClick('未分配订单','/do/order/index.htm');">${waitdistribute }</span> ) 条</td>
				</tr>
				<tr>
					<td style="padding-left: 20px">已分配订单：</td>
					<td style="padding-left: 30px">( <span style="color:red; cursor: pointer; " onclick="doClick('已分配订单','/do/orderHistory/index.htm');">${hasdistribute }</span> ) 条</td>
				</tr>
			</table>
		</div>
	</div>
	<!-- 签收配送 -->
	<div style="float:left;margin:20px 25px 25px 20px;">
		<div id="newsDataGridPanel" class="easyui-panel" title="我的配送"    
		        style="width:280px;height:220px;background:#fafafa;">  
			<table>
				<tr>
					<td style="padding-left: 20px">未签收配送记录：</td>
					<td style="padding-left: 30px">( <span style="color:red; cursor: pointer; " onclick="doClick('未签收配送记录','/do/ordersDispatching/index.htm');">${notsigned }</span> ) 条</td>
				</tr>
				<tr>
					<td style="padding-left: 20px">已签收配送记录：</td>
					<td style="padding-left: 30px">( <span style="color:red; cursor: pointer; " onclick="doClick('已签收配送记录','/do/ordersDispatchingSign/index.htm');">${havesigned }</span> ) 条</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<!-- 公告展示 -->
<div style="float:left;margin:10px 10px 15px 0px;">
	<div id="announcementDataGridPanel" class="easyui-panel" title="公告展示"    
	        style="width:1000%;;height:340px;background:#fafafa;"  
	        data-options="iconCls:'icon-remind',closable:true,   
	                collapsible:true,maximizable:true">  
		<table id="announcementDataGrid"></table>
	</div>
</div>
