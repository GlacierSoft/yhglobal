<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.carrier_mgr.creditwortinss_mgr.creditwortinss');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//初始化承运商信誉记录DataGrid
	glacier.carrier_mgr.creditwortinss_mgr.creditwortinss.creditwortinssDataGrid = $('#creditwortinssDataGrid').datagrid({
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
		url: ctx + '/do/memberCreditwortiness/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'DESC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'carrierMemberCreditworthinessId',
		columns:[[
			{
				field:'carrierMemberCreditworthinessId',
				title:'ID',
				checkbox:true
			},{
				field:'memberName',
				title:'会员名称',
				width:120,
				sortable:true
			},{
				field:'creditworthinessType',
				title:' 信誉类型',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如('borrow'借款,'invest'投资)
					return renderGridValue(value,fields.creditwortinssType);
				}
			},{
				field:'changeType',
				title:'改变类型',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如('increase'增加,'reduction'减少)
					return renderGridValue(value,fields.changeType);
				}
			},{
				field:'changeValue',
				title:'改变值',
				width:120,
				sortable:true
			},{
				field:'remark',
				title:'备注',
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
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pintegralSize : 10,//注意，pintegralSize必须在pintegralList存在
		pintegralList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#membercreditwortinssDataGrid_toolbar',
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
				title: '【'+rowData.memberName+'】信誉记录详细信息',
				href : ctx + '/do/memberCreditwortiness/intoDetail.htm?carrierMemberCreditworthinessId='+rowData.carrierMemberCreditworthinessId,//从controller请求jsp页面进行渲染
				width : 530,
				height : 250,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//下拉项的值
	$('#memberCreditwortinssSearchForm_type').combobox({  
		valueField : 'value',
		height:18,
		width:130,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.creditwortinssType
	});
	$('#memberCreditwortinssSearchForm_changeType').combobox({  
		valueField : 'value',
		height:18,
		width:80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.changeType
	});
</script>

<!-- 所有会员信誉记录列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="integralGridPanel" data-options="region:'center',border:true" >
		<table id="creditwortinssDataGrid">
			<!--<glacierui:toolbar panelEnName="MemberIntegralList" toolbarId="memberIntegralDataGrid_toolbar" menuEnName="memberIntegral"/> 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="memberCreditwortinssSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input name="memberName" style="width: 80px;" class="spinner"/></td>
					<td>信誉类型：</td>
					<td><input id="memberCreditwortinssSearchForm_type" name="creditworthinessType" style="width: 150px;" class="spinner"/></td>
					<td>改变类型：</td>
					<td><input id="memberCreditwortinssSearchForm_changeType" name="changeType" style="width: 80px;" class="spinner"/></td>
					<td>录入时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 150px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 150px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.carrier_mgr.creditwortinss_mgr.creditwortinss.creditwortinssDataGrid.datagrid('load',glacier.serializeObject($('#memberCreditwortinssSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#memberCreditwortinssSearchForm input').val('');glacier.carrier_mgr.creditwortinss_mgr.creditwortinss.creditwortinssDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>