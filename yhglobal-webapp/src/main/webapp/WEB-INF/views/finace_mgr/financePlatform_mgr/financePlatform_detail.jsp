<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr> 
			<td>编号：</td>
			<td>
				<input name="platformCode" value="${financePlatformData.platformCode}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr> 
			<td>账号名称：</td>
			<td>
				<input type="hidden"  name="platformId" value="${financePlatformData.platformId}" />
				<input name="platformName" class="spinner" style="width:180px" value="${financePlatformData.platformName}" readonly="readonly"/>
			</td>
			<td>余额：</td>
			<td>
				<input name="remainMoney" value="<fmt:formatNumber value='${financePlatformData.remainMoney}' pattern="#,#00.00元"/>" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
		</tr>
			<tr>
			<td>开户银行：</td>
			<td>
				<input name="platformBank" value="${financePlatformData.platformBank}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td style="width:80px">银行卡名称：</td>
			<td>
				<input name="bankName" value="${financePlatformData.bankName}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
		</tr>
		
		<tr>
			<td style="width:100px">平台资金类型：</td>
			<td>
				<input name="bankType" id="financePlatform_mgr_financePlatform_detail_platformType" value="${financePlatformData.bankType}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>银行卡号：</td>
			<td>
				<input name="bankCode" value="${financePlatformData.bankCode}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input name="auditState" id="financePlatform_mgr_financePlatform_detail_auditState" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>审核说明：</td>
			<td>
				<input name="auditOpinion" value="${financePlatformData.auditOpinion}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td>
				<input name="auditor" value="${financePlatformData.auditDisplay}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${financePlatformData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:180px" value="${financePlatformData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${financePlatformData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:180px" value="${financePlatformData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${financePlatformData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:445px" readonly="readonly">${financePlatformData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#financePlatform_mgr_financePlatform_detail_auditState').val(renderGridValue('${financePlatformData.auditState}',fields.auditState));
	$('#financePlatform_mgr_financePlatform_detail_platformType').val(renderGridValue('${financePlatformData.bankType}',fields.platformType));
	
</script>