<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>配送货物：</td>
			<td>
				<input type="text" class="easyui-validatebox spinner"  required="true" style="height:18px;width:180px" value="${belaidupDate.belaidupProdName}" readonly="readonly" />
			</td>
			<td style="padding-left:20px;">货物押金：</td> 
		 	<td>
				<input type="text" class="easyui-validatebox spinner"  required="true" style="height:18px;width:180px" value="${belaidupDate.belaidupUnitprice}" readonly="readonly" />
			</td> 
		 </tr>
		 <tr>
		    <td>配送状态：</td>
			<td>
			    <input id="dispatchingStatus" name="dispatchingStatus" required="true"  style="height:18px;width:180px;" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.dispatchingStatus" disabled="disabled" readonly="readonly"/>
			</td>
		    <td  style="padding-left:20px;">签收状态：</td>
			<td>
				<input id="dispatchingSignfor" name="dispatchingSignfor" required="true"  style="height:18px;width:180px;" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.dispatchingSignfor" disabled="disabled" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>配送车辆：</td>
			<td>
			   <input id="belaidup_mgr_belaidup_form_carDisplay" name="carId"  style="width:180px;height: 20px;"  required="true" disabled="disabled"/>
			</td>
			<td style="padding-left:20px;">配送员工：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_driverDisplay" name="driverId"  style="width:180px;height: 20px;"  required="true" disabled="disabled"/>
	    </tr>

	</table>   
</form>
 

<script type="text/javascript">


     
     
     //用于combogrid的客户信息绑定
	 $('#belaidup_mgr_belaidup_form_carDisplay').combogrid({
		panelWidth:450,
		fit:true,//控件自动resize占满窗口大小
		//iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
	    idField:'carrierId',    
	    textField:'plateNumber',    
	    url: ctx + '/do/carrierCarInformation/list.json?carStatus=enable&transportStatus=wait',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
	    columns : [ [ 
			{
				field:'carrierId',
				title:'ID',
				checkbox:true
			},{
				field : 'plateNumber',
				title : '车辆牌照',
				width : 80,
				sortable:true
			}, {
				field : 'carrierMemberRealName',
				title : '所属承运商',
				width : 120,
				sortable : true
			 }, {
				field : 'transportStatus',
				title : '运输状态',
				width : 120,
				sortable : true,
				formatter : function(value, row, index) {
					return renderGridValue(value, fields.transportStatus);
				}
			},{
				field : 'carStatus',
				title : '车辆状态',
				width : 120,
				sortable : true,
				formatter : function(value, row, index) {
					return renderGridValue(value, fields.status);
				}
			}] ],
			pagination : true,//True 就会在 datagrid 的底部显示分页栏
			pageSize : 10,//注意，pageSize必须在pageList存在
			pageList : [2,10,50,100],//从session中获取
			rownumbers : true,//True 就会显示行号的列
		loadMsg : '数据加载中....',
		mode : 'remote',
		delay : 200,
		onSelect: function (rowIndex, rowData){  
			   //$('#secondSelectBox').combogrid('reload', url);  
		       //$('#fourSelectBox').combogrid('clear', url);
		}
	});
     
     
	 //用于combogrid的客户信息绑定
	 $('#belaidup_mgr_belaidup_form_driverDisplay').combogrid({
		panelWidth:450,
		fit:true,//控件自动resize占满窗口大小
		//iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
	    idField:'driverId',    
	    textField:'driverName',    
	    //url: ctx + '/do/carrierCarInformation/list.json',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
	    columns : [ [ 
			{
				field:'driverId',
				title:'ID',
				checkbox:true
			}, {
				field : 'driverName',
				title : '配送员',
				width : 80,
				sortable:true
			}, {
				field : 'carrierMemberRealName',
				title : '所属承运商',
				width : 120,
				sortable : true
			 },{
				field : 'status',
				title : '启用状态',
				width : 120,
				sortable : true
			 }, {
				field : 'driverStatus',
				title : '配送状态',
				width : 120,
				sortable : true,
				formatter : function(value, row, index) {
					return renderGridValue(value, fields.transportStatus);
				}
			}] ],
			pagination : true,//True 就会在 datagrid 的底部显示分页栏
			pageSize : 10,//注意，pageSize必须在pageList存在
			pageList : [2,10,50,100],//从session中获取
			rownumbers : true,//True 就会显示行号的列
		loadMsg : '数据加载中....',
		mode : 'remote',
		delay : 200
	});
	 
	 $('#dispatchingStatus').val(renderGridValue('waitdistribution',fields.dispatchingStatus));
	 $('#dispatchingSignfor').val(renderGridValue('notsigned',fields.dispatchingSignfor));
</script> 