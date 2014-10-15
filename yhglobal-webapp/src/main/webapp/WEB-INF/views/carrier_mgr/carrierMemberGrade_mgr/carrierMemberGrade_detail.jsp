<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable" width="800">
		<tr>
			<td>等级名称：</td>
			<td>
				<input type="hidden" id="memberGrade_mgr_memberGrade_form_gradeId" name="gradeId" value="${gradeData.gradeId}" />
				<input id="memberGrade_mgr_memberGrade_form_gradeName" style="width:268px;height: 20px;" name="gradeName" value="${gradeData.gradeName}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>级别图标:</td>
	    	<td>
	    	<img src="${gradeData.gradeImg}" width="30" height="30">
	    	</td>
		</tr>
		<tr>
			<td>信誉开始值：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_scopeStart" style="width:268px;height: 20px;" name="scopeStart" value="${gradeData.scopeStart}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>信誉结束值：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_scopeStop" style="width:268px;height: 20px;" name="scopeStop" value="${gradeData.scopeStop}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>等级状态：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_status" name="status"  style="width:268px;" readonly="readonly" value="${gradeData.status}" class="spinner"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_createrDisplay" name="createrDisplay" readonly="readonly" style="width:268px;" value="${gradeData.createrDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>创建时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_createTime" name="gradeDestination" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${gradeData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_updaterDisplay" name="gradeCashpayment" readonly="readonly" style="width:268px;" value="${gradeData.updaterDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>更新时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_updateTime" name="updateTime" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${gradeData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="memberGrade_mgr_memberGrade_form_remark" name="remark" readonly="readonly" style="width:670px;" class="spinner formta">${gradeData.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#memberGrade_mgr_memberGrade_form_status').val(renderGridValue('${gradeData.status}',fields.status));
</script>
