<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="storagetype_mgr_storageType_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>类型名称：</td>
			<td>
				<input type="hidden" id="storagetype_mgr_storageType_form_storagetypeId" name="storagetypeId" value="${storagetypeDate.storagetypeId}" />
				<input id="storagetype_mgr_storageType_form_storagetypeName" style="width:268px;height: 20px;" name="storagetypeName" value="${storagetypeDate.storagetypeName}" class="easyui-validatebox spinner"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>类型状态：</td>
			<td>
			<input id="storagetype_mgr_storageType_form_status" name="status"  style="width:268px;" value="${storagetypeDate.status}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td>
				<textarea id="storagetype_mgr_storageType_form_remark" name="remark" style="width:268px;" class="spinner formta">${storagetypeDate.remark}</textarea>
			</td>
		</tr>
	</table>
</form>