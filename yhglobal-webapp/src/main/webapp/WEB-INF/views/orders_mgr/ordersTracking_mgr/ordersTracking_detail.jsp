<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>配送编号：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${ordersTrackingData.dispatchingDisplay}"  readonly="readonly"/>
			</td>
			<td>跟踪状态：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" id="ordersTracking_status" readonly="readonly"/>
			</td>
		</tr>
		<tr>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${ordersTrackingData.createrDisplay}" readonly="readonly"/></td>
		     <td>录入时间：</td>
			 <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${ordersDispatchingData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		 </tr>
		 <tr>   
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${ordersTrackingData.updaterDisplay}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${ordersTrackingData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>
		    <td valign="top">处理信息：</td>
		    <td colspan="3"><textarea name="remark" style="width:420px;" maxlength="255" class="spinner formta" readonly="readonly">${ordersTrackingData.message}</textarea></td>
		</tr>
	</table>
</form>


<script type="text/javascript">   
	$('#ordersTracking_status').val(renderGridValue('${ordersTrackingData.status}',fields.status));
	
</script>
	

