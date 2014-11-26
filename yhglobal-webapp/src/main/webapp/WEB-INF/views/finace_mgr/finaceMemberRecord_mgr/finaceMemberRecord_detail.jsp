<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${finaceMemberRecordData.memberDisplay}"  readonly="readonly"/>
			</td>
			<td>交易对象：</td>
			<td><input class="spinner" style="width:168px" value="${finaceMemberRecordData.transactionTarget}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>交易类型：</td>
			<td>
				<input class="spinner" style="width:168px" value="${finaceMemberRecordData.transactionType}" readonly="readonly"/>
			</td>
			<td>收入金额：</td>
			<td><input class="spinner" style="width:168px"   value="${finaceMemberRecordData.earningMoney }" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>支出金额：</td>
			<td>
				<input class="spinner" style="width:168px" value="${finaceMemberRecordData.expendMoney}" readonly="readonly"/>
			</td>
			<td>可用金额：</td>
			<td><input class="spinner" style="width:168px"   value="${finaceMemberRecordData.usableMoney }" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>冻结金额：</td>
			<td>
				<input class="spinner" style="width:168px" value="${finaceMemberRecordData.frozenMoney}" readonly="readonly"/>
			</td>
			<td>待收金额：</td>
			<td><input class="spinner" style="width:168px"   value="${finaceMemberRecordData.collectingMoney }" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>待还金额：</td>
			<td>
				<input class="spinner" style="width:168px" value="${finaceMemberRecordData.refundMoney}" readonly="readonly"/>
			</td>
			<td>总金额：</td>
			<td><input class="spinner" style="width:168px"   value="${finaceMemberRecordData.amount }" readonly="readonly"/></td>
		</tr>
		<tr>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${finaceMemberRecordData.createrDisplay}" readonly="readonly"/></td>
		     <td>录入时间：</td>
			 <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${finaceMemberRecordData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		 </tr>
		 <tr>   
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${finaceMemberRecordData.updaterDisplay}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${finaceMemberRecordData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td style="vertical-align: top;">审核说明：</td>
			<td colspan="3">
			   <textarea name="remark" style="width:420px;height: 50px;" maxlength="255" class="spinner formta" >${finaceMemberRecordData.remark}</textarea>
			</td>
		</tr>
	</table>
</form>

	

