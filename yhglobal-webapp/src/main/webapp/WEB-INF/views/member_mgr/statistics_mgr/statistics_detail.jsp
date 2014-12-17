<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>客户名称：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${shipperMemberStatisticsData.memberId}"  readonly="readonly"/>
			</td>
			<td>成功交易次数：</td>
			<td><input class="spinner" style="width:168px" value="${shipperMemberStatisticsData.countstatus}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>充值总金额：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px"  value="<fmt:formatNumber value='${shipperMemberStatisticsData.mrechageadd}' pattern="#,#00.00元"/>" readonly="readonly"/>
			</td>
			<td>实际充值总金额：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatNumber value='${shipperMemberStatisticsData.receivemoney}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>提现总金额：</td>
			<td>
				<input class="spinner" style="width:168px"  value="<fmt:formatNumber value='${shipperMemberStatisticsData.withdrawmoney}' pattern="#,#00.00元"/>" readonly="readonly"/>
			</td>
			<td>实际提现总金额：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatNumber value='${shipperMemberStatisticsData.withdrawreallymoney}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>获赔总金额：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="<fmt:formatNumber value='${shipperMemberStatisticsData.mrechargemark}' pattern="#,#00.00元"/>"/>
			</td>
			<td>运输总费用：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatNumber value='${shipperMemberStatisticsData.counttransportation}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
		    <td>保险总费用：</td>
			<td><input class="spinner" style="width:168px"   value="<fmt:formatNumber value='${shipperMemberStatisticsData.countinsurance}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		 	<td>总金额：</td>
			 <td><input class="spinner" style="width:168px"   value="<fmt:formatNumber value='${shipperMemberStatisticsData.countgoods}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		 </tr>
	</table>
</form>	