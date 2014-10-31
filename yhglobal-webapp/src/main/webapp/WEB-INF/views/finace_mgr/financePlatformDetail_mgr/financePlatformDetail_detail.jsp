<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>平台资金名称：</td> 
			<td class="forminputtable">
			    <input type="hidden"  name="detailId" value="${transactionData.detailId}" />
				<input name="platformName" class="spinner" style="width:180px" value="${transactionData.platformName}" readonly="readonly"/>
			</td>
			<td>交易对象：</td>
			<td>
				<input name="tradeTarget" class="spinner" style="width:180px" value="${transactionData.tradeTarget}" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>交易类型：</td>
			<td>
				<input name="tradeType" class="spinner" style="width:180px" value="${transactionData.tradeType}" readonly="readonly"></input>
			</td>
			<td>收入金额：</td>
			<td>
				<input name="tradeEarn" class="spinner" style="width:180px" value="<fmt:formatNumber value='${transactionData.tradeEarn}' pattern="#,#00.00元"/>" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>支出金额：</td>
			<td>
				<input name="tradeSpend" class="spinner" style="width:180px" value="<fmt:formatNumber value='${transactionData.tradeSpend}' pattern="#,#00.00元"/>" readonly="readonly"></input>
			</td>
			<td>总金额：</td>
			<td>
				<input name="tradeAmount" class="spinner" style="width:180px" value="<fmt:formatNumber value='${transactionData.tradeAmount}' pattern="#,#00.00元"/>" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:180px" value="${transactionData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${transactionData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:180px" value="${transactionData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${transactionData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:445px" readonly="readonly">${transactionData.remark}</textarea></td>
		</tr>
	</table>
</form> 