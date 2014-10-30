<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>提现编号：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${finaceWithdrawMemberData.withdrawCode}"  readonly="readonly"/>
			</td>
			<td>提现名称：</td>
			<td><input class="spinner" style="width:168px" value="${finaceWithdrawMemberData.withdrawName}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>取费方式：</td>
			<td>
			   <input name="sumFine"   id="finaceWithdrawMember_detail_feeWay"  class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>提现金额：</td>
			<td>
			    <input class="spinner" style="height:18px;width:180px" value="${finaceWithdrawMemberData.withdrawMoney}"  readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>手续费：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${finaceWithdrawMemberData.chargeMoney}"  readonly="readonly"/>
			</td>
			<td>实际金额：</td>
			<td><input class="spinner" style="width:168px" value="${finaceWithdrawMemberData.withdrawReallyMoney}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" id="finaceWithdrawMember_detail_auditState" readonly="readonly"/>
			</td>
			<td>审核内容：</td>
			<td><input class="spinner" style="width:168px" value="${finaceWithdrawMemberData.auditOpinion}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${finaceWithdrawMemberData.auditorDisplay}" readonly="readonly"/>
			</td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${finaceWithdrawMemberData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${finaceWithdrawMemberData.createrDisplay}" readonly="readonly"/></td>
		     <td>录入时间：</td>
			 <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${finaceWithdrawMemberData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		 </tr>
		 <tr>   
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${finaceWithdrawMemberData.updaterDisplay}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${finaceWithdrawMemberData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>提现方：</td>
			<td colspan="3">
				<input class="spinner" style="height:18px;width:180px" value="${finaceWithdrawMemberData.memberDisplay}"  readonly="readonly"/>
			</td>
		</tr>
		<tr>
		   <td valign="top">备注</td>
		   <td colspan="3">
		       <textarea name="remark" style="width:420px;" maxlength="255" class="spinner formta" readonly="readonly">${finaceWithdrawMemberData.remark}</textarea>
		   </td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	$('#finaceWithdrawMember_detail_auditState').val(renderGridValue('${finaceWithdrawMemberData.auditState}',fields.auditState));
	$('#finaceWithdrawMember_detail_feeWay').val(renderGridValue('${finaceWithdrawMemberData.feeWay}',fields.feeWay));
</script>
	

