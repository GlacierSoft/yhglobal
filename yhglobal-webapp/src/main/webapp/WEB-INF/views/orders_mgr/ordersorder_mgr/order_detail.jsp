<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">
	$.util.namespace('glacier.order_info_mgr.order_info_mgr.order_info');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.order_info_mgr.order_info_mgr.order_info.param = {
		toolbarId : 'order_infoDataGrid_toolbar',
		actions : {
	            edit:{flag:'edit',controlType:'single'},
	            del:{flag:'del',controlType:'multiple'}
	         }
     };

	//初始化DataGrid
	glacier.order_info_mgr.order_info_mgr.order_info.order_infoDataGrid = $('#order_infoDataGrids').datagrid({
		fit : true,//控件自动resize占满窗口大小
		iconCls : 'icon-save',//图标样式
		border : false,//是否存在边框
		fitColumns : true,//自动填充行
		nowrap : true,//禁止单元格中的文字自动换行
		autoRowHeight : false,//禁止设置自动行高以适应内容
		striped : true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect : true,//限制单选
		checkOnSelect : false,//选择复选框的时候选择该行
		selectOnCheck : false,//选择的时候复选框打勾
		url : ctx + '/do/order_info/list.json',
		sortName : 'createTime',//排序字段名称
		sortOrder : 'DESC',//升序还是降序
		remoteSort : true,//开启远程排序，默认为false
		idField : 'belaidupId',
		columns : [ [ {
			field : 'belaidupId',
			title : 'ID',
			checkbox : true
		},{
			field : 'belaidupDisplay',
			title : '货物名称',
			width : 100,
			sortable : true
		},{
			field : 'number',
			title : '数量',
			width : 120,
			sortable : true
		},{
			field : 'belaidupWeight',
			title : '重量',
			width : 120,
			sortable : true
		},{
			field : 'belaidupBulk',
			title : '体积',
			width : 120,
			sortable : true
		},{
			field : 'consignor',
			title : '发货人',
			width : 120,
			sortable : true
		},{
			field : 'sendPhone',
			title : '发货人电话',
			width : 120,
			sortable : true
		},{
			field : 'sendAddress',
			title : '发货地址',
			width : 120,
			sortable : true
		},{
			field : 'orderConsignee',
			title : '收货人',
			width : 120,
			sortable : true
		},{
			field : 'orderPhone',
			title : '收货人电话',
			width : 120,
			sortable : true
		},{
			field : 'orderAddress',
			title : '收货地址',
			width : 120,
			sortable : true
		},{
			field : 'yesOrNo',
			title : '损坏状态',
			width : 120,
			sortable : true,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.yesOrNo);
			}
		},{
			field : 'belaidupRemark',
			title : '注意事项',
			sortable : true,
			width : 120
		} ] ],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		porder_infoSize : 10,//注意，porder_infoSize必须在porder_infoList存在
		porder_infoList : [ 2, 10, 50, 100 ],//从session中获取
		rownumbers : true,//True 就会显示行号的列
		toolbar : '#order_infoDataGrid_toolbar',
		onCheck : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.order_info_mgr.order_info_mgr.order_info.param,this).check();
		},
		onCheckAll : function(rows) {//取消勾选行状态触发事件
			action_controller(
					glacier.order_info_mgr.order_info_mgr.order_info.param,this).check();
		},
		onUncheck : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.order_info_mgr.order_info_mgr.order_info.param,this).unCheck();
		},
		onUncheckAll : function(rows) {//取消勾选行状态触发事件
			action_controller(
					glacier.order_info_mgr.order_info_mgr.order_info.param,this).unCheck();
		},
		onSelect : function(rowIndex, rowData) {//选择行事件触发
			action_controller(
					glacier.order_info_mgr.order_info_mgr.order_info.param,this).select();
		},
		onUnselectAll : function(rows) {
			action_controller(
					glacier.order_info_mgr.order_info_mgr.order_info.param,this).unSelect();
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
		title : '货物详细信息',
		href : ctx+ '/do/belaidup/intoDetail.htm?belaidupId='+ rowData.belaidupId,//从controller请求jsp页面进行渲染
		width : 830,
		height : 630,
		resizable : false,
		enableApplyButton : false,
		enableSaveButton : false
	});
        }
	}); 
	 
</script>

<!-- 所有列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="order_infoGridPanel" data-options="region:'center',border:true">
		<table id="order_infoDataGrids">
			<%-- <glacierui:toolbar panelEnName="Order_infoList"
				toolbarId="order_infoDataGrid_toolbar" menuEnName="order_info" /> --%>
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div> 
</div>