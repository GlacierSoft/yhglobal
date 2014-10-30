<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="carrierCarInformation_mgr_grade_form" method="post" style="padding:10px">
	<table class="detailtable" >
		<tr>
			<td>提现名称：</td>
			<td>
				<input type="hidden" id="finace_mgr_rechargeSetCarrier_form_rechargeSetId" name="withdrawSetId" value="${finaceWithdrawSetMemberData.withdrawSetId}" />
				<input id="finace_mgr_rechargeSetCarrier_form_rechargeName" style="width:168px;height: 20px;" name="withdrawName" value="${finaceWithdrawSetMemberData.withdrawName}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
			<td>提现比例:</td>
	    	<td>
	    	   <input id="finace_mgr_rechargeSetCarrier_form_rechargeName" style="width:168px;height: 20px;" name="withdrawRate" value="${finaceWithdrawSetMemberData.withdrawRate}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
		</tr>
		<tr>
			<td>固定金额:</td>
	    	<td>
	    	<input id="finace_mgr_rechargeSetCarrier_form_rechargeRate" style="width:168px;height: 20px;" name="withdrawMoney" value="${finaceWithdrawSetMemberData.withdrawMoney}" class="spinner" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>取费方式:</td>
	    	<td>
	    	<input type="hidden" name="feeWay"  value="${finaceWithdrawSetMemberData.feeWay }">
	    	<input id="finace_mgr_rechargeSetCarrier_form_feeWay" style="width:168px;height: 20px;" type="text" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
		</tr>
		<tr>
			<td>会员等级：</td>
			<td>
			    <input type="hidden" name="gradeId" value="${finaceWithdrawSetMemberData. gradeId}">
				<input id="finace_mgr_rechargeSetCarrier_form_gradeDisplay" style="width:168px;height: 20px;" value="${finaceWithdrawSetMemberData.gradeDisplay}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
			<td>审核状态：</td>
			<td>
				<input id="finace_mgr_rechargeSetCarrier_form_auditState"  class="spinner" style="height:18px;width:168px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核说明：</td>
			<td>
				<input value="${finaceWithdrawSetMemberData.auditOpinion}" class="spinner" style="height:18px;width:168px" readonly="readonly"/>
			</td>
			<td>审核人：</td>
			<td><input id="finace_mgr_rechargeSetCarrier_form_auditorDisplay" class="spinner" style="width:168px" value="${finaceWithdrawSetMemberData.auditorDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${finaceWithdrawSetMemberData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${finaceWithdrawSetMemberData.createrDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${finaceWithdrawSetMemberData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		    <td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${finaceWithdrawSetMemberData.updaterDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新时间：</td>
			<td colspan="3"><input class="spinner" style="width:168px" value="<fmt:formatDate value="${finaceWithdrawSetMemberData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		
		<tr>
			<td>充值类型信息审核：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="authstr" /><span>审核中</span>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="pass" /><span>审核通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="failure"  checked="checked"/><span>审核失败</span>
			</td>
		</tr>
		
		
		
		<tr>
			<td>备注：</td>
			<td colspan="3">
				 <textarea name="remark" style="width:420px;" maxlength="255" class="spinner formta" >${finaceWithdrawSetMemberData.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">

//审核按钮初始化
if(${finaceWithdrawSetMemberData.auditState == 'pass'}){
	document.all("carrier_mgr_carInformation_form_auditState")[1].checked=true;
}else if(${finaceWithdrawSetMemberData.auditState == 'failure'}){
	document.all("carrier_mgr_carInformation_form_auditState")[2].checked=true;
}else{
	document.all("carrier_mgr_carInformation_form_auditState")[0].checked=true;
}


$('#finace_mgr_rechargeSetCarrier_form_auditState').val(renderGridValue('${finaceWithdrawSetMemberData.auditState}',fields.auditState));
$('#finace_mgr_rechargeSetCarrier_form_feeWay').val(renderGridValue('${finaceWithdrawSetMemberData.feeWay}',fields.feeWay));
</script>