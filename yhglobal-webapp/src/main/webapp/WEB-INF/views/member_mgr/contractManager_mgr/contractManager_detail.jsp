<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>合同类型：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${contractManagerData.contractTypeName}"  readonly="readonly"/>
			</td>
			<td>有效期限：</td>
			<td><input class="spinner" style="width:168px" value="${contractManagerData.timeLimit}（天）" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td>
				<input name="sumFine"  id="contractManager_mgr_contractManager_detail_contractManagerStatus"  class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>简介：</td>
			<td><input class="spinner" style="width:168px"  value="${contractManagerData.remark}" readonly="readonly"/></td>
		</tr>
		<tr>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${contractManagerData.createrDisplay}" readonly="readonly"/></td>
		     <td>录入时间：</td>
			 <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${contractManagerData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		 </tr>
		 <tr>   
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${contractManagerData.updaterDisplay}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${contractManagerData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	$('#contractManager_mgr_contractManager_detail_contractManagerStatus').val(renderGridValue('${contractManagerData.status}',fields.status));
</script>
	

