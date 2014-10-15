<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form id="creditType_mgr_creditType_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>积分类型名称：</td>
			<td>
				<input type="hidden" name="integralTypeId" value="${integralTypeData.integralTypeId}" />
				<c:if test="${integralTypeData.integralTypeId!=null}">
					<input type="hidden" name="integralType" value="${integralTypeData.integralType}">
					<input disabled="disabled" readonly="readonly" id="integralType"  class="easyui-validatebox spinner" style="width:268px" required="true" value="${integralTypeData.integralType}" data-options="validType:'code'"/>
				</c:if>
				<c:if test="${integralTypeData.integralTypeId==null}">
					<input name="integralType" id="integralType"  class="easyui-validatebox spinner" style="width:268px" required="true" value="${integralTypeData.integralType}" data-options="validType:'code'"/>
				</c:if>
			</td>
		</tr>
		<tr>
			<td>积分：</td>
			<td><input maxlength="3" name="changeValue" class="easyui-numberspinner spinner" value="${integralTypeData.changeValue}" data-options="min:0,max:9999,required:true,missingMessage:'请输入写信用积分,只能输入整数'" style="width: 270px;height:18px;"/></td>
		</tr>
		<tr>
			<td>改变类型：</td>
			<td><input disabled="disabled" id="changeType" name="changeType" value="${integralTypeData.changeType}" /></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${integralTypeData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript"> 
	//初始化下拉框
	$('#changeType').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.changeType
	});
	$('#integralType').val(renderGridValue('${integralTypeData.integralType}',fields.integralType));
	$('#changeType').val(renderGridValue('${integralTypeData.changeType}',fields.changeType));
</script>