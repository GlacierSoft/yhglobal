<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>账户名称：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${shipperMemberBankCardData.memberDisplay}"  readonly="readonly"/>
			</td>
			<td>开户名称：</td>
			<td><input class="spinner" style="width:168px" value="${shipperMemberBankCardData.bankName}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>银行卡名称：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px"  value="${shipperMemberBankCardData.cardName}" readonly="readonly"/>
			</td>
			<td>银行卡号：</td>
			<td><input class="spinner" style="width:168px"  value="${shipperMemberBankCardData.cardNumber}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input class="spinner" id="bankCard_mgr_bankCard_detail_auditState" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>审核人：</td>
			<td><input class="spinner" style="width:168px"  value="${shipperMemberBankCardData.auditDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核内容：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="${shipperMemberBankCardData.auditOpinion}"/>
			</td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${shipperMemberBankCardData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${shipperMemberBankCardData.createrDisplay}" readonly="readonly"/></td>
		     <td>录入时间：</td>
			 <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${shipperMemberBankCardData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		 </tr>
		 <tr>   
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${shipperMemberBankCardData.updaterDisplay}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${shipperMemberBankCardData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>   
		     <td valign="top">记录备注：</td>
			 <td colspan="3"><textarea name="remark" style="width:420px;" maxlength="255" class="spinner formta" readonly="readonly">${shipperMemberBankCardData.remark}</textarea></td>
		</tr>
	</table>
</form>


<script type="text/javascript">
	$('#bankCard_mgr_bankCard_detail_auditState').val(renderGridValue('${shipperMemberBankCardData.auditState}',fields.auditState));
</script>
	