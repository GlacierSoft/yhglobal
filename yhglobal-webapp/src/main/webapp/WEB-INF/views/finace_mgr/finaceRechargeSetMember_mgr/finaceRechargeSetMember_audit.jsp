<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="carrierCarInformation_mgr_grade_form" method="post" style="padding:10px">
	<table class="detailtable" >
		<tr>
			<td>充值类型名称：</td>
			<td>
				<input type="hidden" id="finace_mgr_rechargeSetCarrier_form_rechargeSetId" name="rechargeSetId" value="${finaceRechargeSetMemberData.rechargeSetId}" />
				<input id="finace_mgr_rechargeSetCarrier_form_rechargeName" style="width:168px;height: 20px;"  value="${finaceRechargeSetMemberData.rechargeSetName}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
			<td>充值类型:</td>
	    	<td>
	    	<input id="finace_mgr_rechargeSetCarrier_form_rechargeType" style="width:168px;height: 20px;" class="easyui-validatebox spinner" readonly="readonly" type="text"   required="true" />
	    	</td>
		</tr>
		<tr>
			<td>手续费率:</td>
	    	<td>
	    	<input id="finace_mgr_rechargeSetCarrier_form_rechargeRate" style="width:168px;height: 20px;"  value="${finaceRechargeSetMemberData.rechargeRate}" class="spinner" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>固定金额收取 ：</td>
			<td>
				<input id="finace_mgr_rechargeSetCarrier_form_rechargeMoney" style="width:168px;height: 20px;" value="${finaceRechargeSetMemberData.rechargeMoney}" class="easyui-validatebox spinner" readonly="readonly"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>取费方式:</td>
	    	<td>
	    	<input id="finace_mgr_rechargeSetCarrier_form_feeWay" style="width:168px;height: 20px;" type="text"  value="${finaceRechargeSetMemberData.feeWay}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>会员等级：</td>
			<td>
				<input id="finace_mgr_rechargeSetCarrier_form_gradeDisplay" style="width:168px;height: 20px;"  value="${finaceRechargeSetMemberData.gradeDisplay}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input id="finace_mgr_rechargeSetCarrier_form_auditState"value="${finaceRechargeSetMemberData.auditState}" class="spinner" style="height:18px;width:168px" readonly="readonly"/>
			</td>
			<td>审核说明：</td>
			<td>
				<input value="${finaceRechargeSetMemberData.auditOpinion}" class="spinner" style="height:18px;width:168px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input id="finace_mgr_rechargeSetCarrier_form_auditorDisplay" class="spinner" style="width:168px" value="${finaceRechargeSetMemberData.auditorDisplay}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${finaceRechargeSetMemberData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${finaceRechargeSetMemberData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${finaceRechargeSetMemberData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${finaceRechargeSetMemberData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${finaceRechargeSetMemberData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
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
			<td>审核说明：</td>
			<td colspan="3">
			   <textarea name="remark" style="width:420px;" maxlength="255" class="spinner formta" >${finaceRechargeSetMemberData.remark}</textarea>
			</td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	//审核按钮初始化
	if(${finaceRechargeSetMemberData.auditState == 'pass'}){
		document.all("carrier_mgr_carInformation_form_auditState")[1].checked=true;
	}else if(${finaceRechargeSetMemberData.auditState == 'failure'}){
		document.all("carrier_mgr_carInformation_form_auditState")[2].checked=true;
	}else{
		document.all("carrier_mgr_carInformation_form_auditState")[0].checked=true;
	}
	
	$('#finace_mgr_rechargeSetCarrier_form_auditState').val(renderGridValue('${finaceRechargeSetMemberData.auditState}',fields.auditState));
	$('#finace_mgr_rechargeSetCarrier_form_rechargeType').val(renderGridValue('${finaceRechargeSetMemberData.rechargeSetType}',fields.rechargeType));
	$('#finace_mgr_rechargeSetCarrier_form_feeWay').val(renderGridValue('${finaceRechargeSetMemberData.feeWay}',fields.feeWay));
</script>