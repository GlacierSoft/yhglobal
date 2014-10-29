<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="carrierCarInformation_mgr_grade_form" method="post" style="padding:15px">
	<table class="detailtable" width="750">
		<tr>
			<td>提现类型名称：</td>
			<td colspan="3">
				<input type="hidden" id="finace_mgr_withdrawSetCarrier_form_withdrawSetId" name="withdrawSetId" value="${withdrawSetCarrierData.withdrawSetId}" />
				<input id="finace_mgr_withdrawSetCarrier_form_withdrawName" style="width:268px;height: 20px;" name="withdrawName" value="${withdrawSetCarrierData.withdrawName}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>手续费率:</td>
	    	<td>
	    	<input id="finace_mgr_withdrawSetCarrier_form_withdrawRate" style="width:268px;height: 20px;" name="carrierMemberId" value="<fmt:formatNumber value='${withdrawSetCarrierData.withdrawRate}' pattern="#,#00.00元"/>" class="spinner" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>固定金额收取 ：</td>
			<td>
				<input id="finace_mgr_withdrawSetCarrier_form_withdrawMoney" style="width:268px;height: 20px;" name="withdrawMoney" value="<fmt:formatNumber value='${withdrawSetCarrierData.withdrawMoney}' pattern="#,#00.00元"/>" class="easyui-validatebox spinner" readonly="readonly"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>取费方式:</td>
	    	<td>
	    	<input id="finace_mgr_withdrawSetCarrier_form_feeWay" style="width:268px;height: 20px;" type="text" name="feeWay"  value="${withdrawSetCarrierData.feeWay}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>承运商等级：</td>
			<td>
				<input id="finace_mgr_withdrawSetCarrier_form_gradeDisplay" style="width:268px;height: 20px;" name="gradeDisplay" value="${withdrawSetCarrierData.gradeDisplay}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input id="finace_mgr_withdrawSetCarrier_form_auditState" name="auditState" value="${withdrawSetCarrierData.auditState}" class="spinner" style="height:18px;width:268px" readonly="readonly"/>
			</td>
			<td>审核说明：</td>
			<td>
				<input name="auditRemark" value="${withdrawSetCarrierData.auditOpinion}" class="spinner" style="height:18px;width:268px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input id="finace_mgr_withdrawSetCarrier_form_auditorDisplay" class="spinner" style="width:268px" value="${withdrawSetCarrierData.auditorDisplay}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${withdrawSetCarrierData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:268px" value="${withdrawSetCarrierData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${withdrawSetCarrierData.craeteTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:268px" value="${withdrawSetCarrierData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${withdrawSetCarrierData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="finace_mgr_withdrawSetCarrier_form_remark" name="remark" style="width:650px;height: 170px;" class="spinner formta" readonly="readonly">${withdrawSetCarrierData.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
$('#finace_mgr_withdrawSetCarrier_form_auditState').val(renderGridValue('${withdrawSetCarrierData.auditState}',fields.auditState));
$('#finace_mgr_withdrawSetCarrier_form_feeWay').val(renderGridValue('${withdrawSetCarrierData.feeWay}',fields.feeWay));
</script>