<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable" width="800">
		<tr>
			<td>仓库类型名称：</td>
			<td>
				<input type="hidden" id="memberGrade_mgr_memberGrade_form_goodstypeId" name="goodstypeId" value="${goodstypeDate.goodstypeId}" />
				<input id="memberGrade_mgr_memberGrade_form_goodstypeName" style="width:268px;height: 20px;" name="goodstypeName" value="${goodstypeDate.goodstypeName}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>仓库类型状态：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_status" name="status"  style="width:268px;" readonly="readonly" value="${goodstypeDate.status}" class="spinner"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_createrDisplay" name="createrDisplay" readonly="readonly" style="width:268px;" value="${goodstypeDate.createrDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>创建时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_createTime" name="gradeDestination" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${goodstypeDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_updaterDisplay" name="gradeCashpayment" readonly="readonly" style="width:268px;" value="${goodstypeDate.updaterDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>更新时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_updateTime" name="updateTime" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${goodstypeDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="memberGrade_mgr_memberGrade_form_remark" name="remark" readonly="readonly" style="width:670px;" class="spinner formta">${goodstypeDate.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#memberGrade_mgr_memberGrade_form_status').val(renderGridValue('${goodstypeDate.status}',fields.status));
</script>
