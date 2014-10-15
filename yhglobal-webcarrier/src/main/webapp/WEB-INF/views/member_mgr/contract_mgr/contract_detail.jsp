<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>货物名称：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${contractData.goodsId}"  readonly="readonly"/>
			</td>
			<td>乙方(货主)：</td>
			<td><input class="spinner" style="width:168px" value="${contractData.memberDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>甲方(平台)：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px"  value="${contractData.platformId}" readonly="readonly"/>
			</td>
			<td>合同类型：</td>
			<td><input class="spinner" style="width:168px"  value="${contractData.contractTypeDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>合同状态：</td>
			<td>
				<input class="spinner" id="contract_mgr_contract_detail_contractStatus" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>合同内容：</td>
			<td><input class="spinner" style="width:168px"  value="${contractData.contractContent}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>生效时间：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="<fmt:formatDate value="${contractData.operationTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"/>
			</td>
			<td>失效时间：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${contractData.closeTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${contractData.createrDisplay}" readonly="readonly"/></td>
		     <td>录入时间：</td>
			 <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${contractData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		 </tr>
		 <tr>   
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${contractData.updaterDisplay}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${contractData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>   
		     <td valign="top">记录备注：</td>
			 <td colspan="3"><textarea name="remark" style="width:420px;" maxlength="255" class="spinner formta" readonly="readonly">${contractData.remark}</textarea></td>
		</tr>
	</table>
</form>


<script type="text/javascript">
	$('#contract_mgr_contract_detail_contractStatus').val(renderGridValue('${contractData.status}',fields.status));
</script>
	

