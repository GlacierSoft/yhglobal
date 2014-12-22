<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>承运商名称：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${carrierMemberStatisticsData.memberName}"  readonly="readonly"/>
			</td>
			<td>收入总金额：</td>
			<td><input class="spinner" style="width:168px" value="${carrierMemberStatisticsData.income}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>返还总金额：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px"  value="<fmt:formatNumber value='${carrierMemberStatisticsData.retruns}' pattern="#,#00.00元"/>" readonly="readonly"/>
			</td>
			<td>充值总金额：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatNumber value='${carrierMemberStatisticsData.recharge}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>提现总金额：</td>
			<td>
				<input class="spinner" style="width:168px"  value="<fmt:formatNumber value='${carrierMemberStatisticsData.withdarw}' pattern="#,#00.00元"/>" readonly="readonly"/>
			</td>
			<td>驾驶员总人数：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatNumber value='${carrierMemberStatisticsData.driverCount}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>车辆总数：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="<fmt:formatNumber value='${carrierMemberStatisticsData.carCount}' pattern="#,#00.00元"/>"/>
			</td>
			<td>运送成功次数：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatNumber value='${carrierMemberStatisticsData.dispatchingCount}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
	</table>
</form>	