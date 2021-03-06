<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>充值编号：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${finaceRechargeMemberData.rechargeCode}"  readonly="readonly"/>
			</td>
			<td>充值名称：</td>
			<td><input class="spinner" style="width:168px" value="${finaceRechargeMemberData.rechargeSetName}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>充值类型：</td>
			<td>
				<input name="sumFine"   id="finaceRechargeMember_detail_rechargeSetType"  class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>取费方式：</td>
			<td><input class="spinner" style="width:168px"   id="finaceRechargeMember_detail_feeWay" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>充值金额：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${finaceRechargeMemberData.rechargeMoney}"  readonly="readonly"/>
			</td>
			<td>优惠金额：</td>
			<td><input class="spinner" style="width:168px" value="${finaceRechargeMemberData.saveMoney}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>手续费：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${finaceRechargeMemberData.chargeMoney}"  readonly="readonly"/>
			</td>
			<td>返现金额：</td>
			<td><input class="spinner" style="width:168px" value="${finaceRechargeMemberData.returnMoney}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>到账金额：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${finaceRechargeMemberData.receiveMoney}"  readonly="readonly"/>
			</td>
			<td>充值方：</td>
			<td><input class="spinner" style="width:168px" value="${finaceRechargeMemberData.memberDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" id="finaceRechargeMember_detail_auditState" readonly="readonly"/>
			</td>
			<td>审核内容：</td>
			<td><input class="spinner" style="width:168px" value="${finaceRechargeMemberData.auditOpinion}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${finaceRechargeMemberData.auditorDisplay}" readonly="readonly"/>
			</td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${finaceRechargeMemberData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${finaceRechargeMemberData.createrDisplay}" readonly="readonly"/></td>
		     <td>录入时间：</td>
			 <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${finaceRechargeMemberData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		 </tr>
		 <tr>   
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${finaceRechargeMemberData.updaterDisplay}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${finaceRechargeMemberData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>充值类型信息审核：</td>
			<td>
			    <input type="hidden" value="${finaceRechargeMemberData.rechargeId}" name="rechargeId">
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="authstr" /><span>审核中</span>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="pass" /><span>审核通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="failure"  checked="checked"/><span>审核失败</span>
			</td>
		</tr>
		<tr>
		   <td valign="top">备注</td>
		   <td colspan="3">
		       <textarea name="remark" style="width:420px;" maxlength="255" class="spinner formta" readonly="readonly">${finaceRechargeMemberData.remark}</textarea>
		   </td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	$('#finaceRechargeMember_detail_auditState').val(renderGridValue('${finaceRechargeMemberData.auditState}',fields.auditState));
	$('#finaceRechargeMember_detail_rechargeSetType').val(renderGridValue('${finaceRechargeMemberData.rechargeSetType}',fields.rechargeType));
	$('#finaceRechargeMember_detail_feeWay').val(renderGridValue('${finaceRechargeMemberData.feeWay}',fields.feeWay));

	//审核按钮初始化
	if(${finaceRechargeSetMemberData.auditState == 'pass'}){
		document.all("carrier_mgr_carInformation_form_auditState")[1].checked=true;
	}else if(${finaceRechargeSetMemberData.auditState == 'failure'}){
		document.all("carrier_mgr_carInformation_form_auditState")[2].checked=true;
	}else{
		document.all("carrier_mgr_carInformation_form_auditState")[0].checked=true;
	}	
	
	
</script>
	

