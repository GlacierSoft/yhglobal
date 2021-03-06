<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.finance_mgr.transaction_mgr.transaction');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	 
	//初始化平台资金记录DataGrid
	glacier.finance_mgr.transaction_mgr.transaction.transactionDataGrid = $('#transactionDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		//fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/platformTransaction/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'detailId',
		columns:[[
			{
				field:'detailId',
				title:'ID',
				checkbox:true
			},{
				field:'platformName',
				title:'平台资金名称',
				width:150,
				sortable:true
			},{
				field:'tradeTarget',
				title:'交易对象',
				width:150,
				sortable:true
			},{
				field:'tradeType',
				title:'交易类型',
				width:120,
				sortable:true
			},{
				field:'tradeEarn',
				title:'收入金额(元)',
				width:120,
				sortable:true
			},{
				field:'tradeSpend',
				title:'支出金额(元)',
				width:120,
				sortable:true
			},{
				field:'tradeAmount',
				title:'平台资金总金额(元)',
				width:120,
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
			},{
				field:'remark',
				title:'备注',
				width:120,
				sortable:true
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		ptransactionSize : 10,//注意，ptransactionSize必须在ptransactionList存在
		ptransactionList : [2,10,50,100],//从session中获取
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
				title: "【"+rowData.platformName+"】的平台资金记录详细信息",
				href : ctx + '/do/platformTransaction/intoDetail.htm?detailId='+rowData.detailId,//从controller请求jsp页面进行渲染
				width : 580,
				height : 320,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//平台资金记录资料模糊查询
	glacier.finance_mgr.transaction_mgr.transaction.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.finance_mgr.transaction_mgr.transaction.transactionDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有平台资金记录列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="transactionGridPanel" data-options="region:'center',border:true" >
		<table id="transactionDataGrid">
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="platformTransactionDataGrid">
			<table>
				<tr>
					<td>平台资金名称：</td>
					<td><input name="platformName" style="width: 60px;" class="spinner"/></td>
					<td>交易类型：</td>
					<td><input name="tradeType" style="width: 60px;" class="spinner"/></td>
					<td>创建时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 100px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 100px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.finance_mgr.transaction_mgr.transaction.transactionDataGrid.datagrid('load',glacier.serializeObject($('#platformTransactionDataGrid')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#platformTransactionDataGrid input').val('');glacier.finance_mgr.transaction_mgr.transaction.transactionDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>