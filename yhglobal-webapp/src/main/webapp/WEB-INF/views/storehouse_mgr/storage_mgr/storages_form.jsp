<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="storage_mgr_storage_form" method="post" style="padding:15px">
	<table class="formtable" width="800">
		<tr>
			<td>仓库名称：</td>
			<td>
				<input type="hidden" id="storage_mgr_storage_form_storageId" name="storageId" value="${storageDate.storageId}" />
				<input id="storage_mgr_storage_form_storageName" style="width:268px;height: 20px;" name="storageName" value="${storageDate.storageName}" class="easyui-validatebox spinner"  required="true"/>
			</td>
			<td>仓库类型：</td>
			<td>
				<input id="storage_mgr_storage_form_storagetypeId" name="storagetypeId"  style="width:268px;height: 20px;" value="${storageDate.storagetypeId}"/>
			</td>
		</tr>
		<tr>
			<td>检修状态：</td>
			<td>
				<input id="storage_mgr_storage_form_yesOrNo" style="width:268px;height: 20px;" name="yesOrNo" value="${storageDate.yesOrNo}" required="true" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.yesOrNo"/>
			</td>
			<td>每年必检修次数：</td>
			<td>
				<input id="storage_mgr_storage_form_mustOverhaulNum" name="mustOverhaulNum"  style="width:268px;height: 20px;" value="${storageDate.mustOverhaulNum}" class="easyui-numberbox"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>体重上限：</td>
			<td>
				<input id="storage_mgr_storage_form_weightUpperBound" name="weightUpperBound"  style="width:268px;height: 20px;" value="${storageDate.weightUpperBound}" class="easyui-numberbox"  required="true"/>
			</td>
			<td>体积上限：</td>
			<td>
				<input id="storage_mgr_storage_form_bulkUpperBound" name="bulkUpperBound"  style="width:268px;height: 20px;" value="${storageDate.bulkUpperBound}" class="easyui-numberbox"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>仓库电话：</td>
			<td>
				<input id="storage_mgr_storage_form_storageTel" name="storageTel"  style="width:268px;height: 20px;" value="${storageDate.storageTel}" class="easyui-validatebox spinner"  required="true"/>
			</td>
			<td>仓库地址：</td>
			<td>
				<input id="storage_mgr_storage_form_storageAddress" name="storageAddress"  style="width:268px;height: 20px;" value="${storageDate.storageAddress}" class="easyui-validatebox spinner"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>类型状态：</td>
			<td>
				<input id="storage_mgr_storage_form_status" name="status"  style="width:268px;height: 20px;" value="${storageDate.status}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
			<td>负责人：</td>
			<td>
				<input id="storage_mgr_storage_form_userId" name="userId"  style="width:268px;height: 20px;" value="${storageDate.userId}"/>
			</td>
		</tr>
		<tr>
			<td>建造时间：</td>
			<td>
				<input id="storage_mgr_storage_form_buildDate" name="buildDate"  style="width:268px;height: 20px;" value="<fmt:formatDate value="${storageDate.buildDate}" pattern="yyyy-MM-dd"/>" class="easyui-datetimebox" data-options="showSeconds:false"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="storage_mgr_storage_form_remark" name="remark" style="width:690px;" class="spinner formta">${storageDate.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	//用于combogrid的负责人信息绑定
	$('#storage_mgr_storage_form_userId').combogrid({
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
	    //value:'${messageNoticeData.addresseeDisplay}',    
	    idField:'userId',    
	    textField:'userCnName',    
	    url: ctx + '/do/user/list.json',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
	    columns : [ [ 
			{
				field:'carrierMemberId',
				title:'ID',
				checkbox:true
			},{
				field : 'username',
				title : '用户名',
				width : 80,
				sortable:true
			}, {
				field : 'userCnName',
				title : '真实姓名',
				width : 60,
				sortable:true
			} ] ],
			pagination : true,//True 就会在 datagrid 的底部显示分页栏
			pageSize : 10,//注意，pageSize必须在pageList存在
			pageList : [2,10,50,100],//从session中获取
			rownumbers : true,//True 就会显示行号的列
		loadMsg : '数据加载中....',
		mode : 'remote',
		delay : 200
	});
	
	//用于combogrid的仓库类型信息绑定
	$('#storage_mgr_storage_form_storagetypeId').combogrid({
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
	    //value:'${messageNoticeData.addresseeDisplay}',    
	    idField:'storagetypeId',    
	    textField:'storagetypeName',    
	    url: ctx + '/do/storagetype/list.json',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
	    columns : [ [ 
			{
				field:'storagetypeId',
				title:'ID',
				checkbox:true
			},{
				field : 'storagetypeName',
				title : '用户姓名',
				width : 80,
				sortable:true
			},{
				field : 'status',
				title : '仓库类型状态',
				width : 120,
				sortable : true,
				formatter : function(value, row, index) {
					return renderGridValue(value, fields.status);
				}
			} ] ],
			pagination : true,//True 就会在 datagrid 的底部显示分页栏
			pageSize : 10,//注意，pageSize必须在pageList存在
			pageList : [2,10,50,100],//从session中获取
			rownumbers : true,//True 就会显示行号的列
		loadMsg : '数据加载中....',
		mode : 'remote',
		delay : 200
	});
</script>