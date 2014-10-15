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
			<td>积分开始值：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_scopeStart" style="width:268px;height: 20px;" name="scopeStart" value="${gradeData.scopeStart}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>积分结束值：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_scopeStop" style="width:268px;height: 20px;" name="scopeStop" value="${gradeData.scopeStop}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>GPS定位服务：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_gradeGps" style="width:268px;" name="gradeGps" readonly="readonly" value="${gradeData.gradeGps}" class="spinner"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
			<td>邮件报告服务：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_gradeEmail" style="width:268px;" name="gradeEmail" readonly="readonly" value="${gradeData.gradeEmail}" class="spinner"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>短信报告服务：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_gradeMobile" name="gradeMobile"  style="width:268px;" readonly="readonly" value="${gradeData.gradeMobile}" class="spinner"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
			<td>订单优先处理：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_gradeFirst" name="gradeFirst"  style="width:268px;" readonly="readonly" value="${gradeData.gradeFirst}" class="spinner"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>月结：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_gradeMonthly" name="gradeMonthly"  style="width:268px;" readonly="readonly" value="${gradeData.gradeMonthly}" class="spinner"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
			<td>等级状态：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_status" name="status"  style="width:268px;" readonly="readonly" value="${gradeData.status}" class="spinner"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>现付：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_gradeCashpayment" name="gradeCashpayment" class="spinner" style="width:268px;" value="${gradeData.gradeCashpayment}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
			<td>到付：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_gradeDestination" name="gradeDestination"  class="spinner" readonly="readonly" style="width:268px;" />
			</td>
		</tr>
		<tr>
			<td>运输费用打折：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_gradeDiscount" name="gradeDiscount" readonly="readonly" style="width:268px;height: 20px;" value="${gradeData.gradeDiscount}" class="easyui-numberbox"  required="true" invalidMessage="必须至少输入一位数字" data-options="min:0,precision:2"/>
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
	$('#memberGrade_mgr_memberGrade_form_gradeGps').val(renderGridValue('${gradeData.gradeGps}',fields.status));
	$('#memberGrade_mgr_memberGrade_form_gradeEmail').val(renderGridValue('${gradeData.gradeEmail}',fields.status));
	$('#memberGrade_mgr_memberGrade_form_gradeMobile').val(renderGridValue('${gradeData.gradeMobile}',fields.status));
	$('#memberGrade_mgr_memberGrade_form_gradeFirst').val(renderGridValue('${gradeData.gradeFirst}',fields.status));
	$('#memberGrade_mgr_memberGrade_form_gradeMonthly').val(renderGridValue('${gradeData.gradeMonthly}',fields.status));
	$('#memberGrade_mgr_memberGrade_form_status').val(renderGridValue('${gradeData.status}',fields.status));
	$('#memberGrade_mgr_memberGrade_form_gradeCashpayment').val(renderGridValue('${gradeData.gradeCashpayment}',fields.status));
	$('#memberGrade_mgr_memberGrade_form_gradeDestination').val(renderGridValue('${gradeData.gradeDestination}',fields.status));	    
</script>
