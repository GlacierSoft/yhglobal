<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>合同类型：</td>
			<td>
				<input type="hidden" id="contractManager_mgr_contractManager_form_contractTypeId" name="contractTypeId" value="${contractManagerData.contractTypeId}" />
				<input id="withdrawSet_mgr_withdrawSet_form_withdrawSetMinimum" name="contractTypeName"  class="easyui-validatebox spinner" style="width:298px;height: 16px;" required="true" maxlength="50" value="${contractManagerData.contractTypeName}"/>
			</td>
		</tr>
		<tr>
			<td>合同状态：</td>
			<td>
				<input id="contractManager_mgr_contractManager_form_status" name="status" value="${contractManagerData.status}" class="easyui-combobox" style="height:18px;width:300px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>合同有效期限：</td>
			<td>
			  <input maxlength="3" name="timeLimit" class="easyui-numberspinner spinner" value="${contractManagerData.timeLimit}" data-options="min:0,max:9999,required:true,missingMessage:'请输入有效期(天数),只能输入整数'" style="width: 300px;height:18px;"/>
			</td>
		</tr>
		<tr>
			<td>合同简介：</td>
			<td><textarea name="remark" style="width:298px;" maxlength="255" class="spinner formta">${contractManagerData.remark}</textarea></td>
		</tr> 
	   
	</table>
</form>
