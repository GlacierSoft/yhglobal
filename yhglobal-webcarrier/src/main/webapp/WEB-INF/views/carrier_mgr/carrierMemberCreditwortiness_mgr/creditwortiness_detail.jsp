<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="carrierMemberCreditworthinessId" value="${creditwortinessData.carrierMemberCreditworthinessId}" />
				<input class="spinner" style="width:168px"  value="${creditwortinessData.memberName}" readonly="readonly"/>
			</td>
			<td>积分类型：</td>
			<td><input id="creditwortiness_mgr_creditwortiness_detail_creditwortinessType" value="${creditwortinessData.creditworthinessType}" class="spinner" style="width:168px" readonly="readonly"/></td>
		</tr>

		<tr>
			<td>改变类型：</td>
			<td><input id="creditwortiness_mgr_creditwortiness_detail_changeType" value="${creditwortinessData.changeType}" class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>改变值：</td>
			<td><input class="spinner" style="width:168px" value="${creditwortinessData.changeValue}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${creditwortinessData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${creditwortinessData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${creditwortinessData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#creditwortiness_mgr_creditwortiness_detail_creditwortinessType').val(renderGridValue('${creditwortinessData.creditworthinessType}',fields.creditwortinssType));
	$('#creditwortiness_mgr_creditwortiness_detail_changeType').val(renderGridValue('${creditwortinessData.changeType}',fields.changeType));
</script>
