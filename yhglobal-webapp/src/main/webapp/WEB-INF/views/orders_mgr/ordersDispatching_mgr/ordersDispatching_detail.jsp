<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>配送编号：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${ordersDispatchingData.dispatchingCode}"  readonly="readonly"/>
			</td>
			<td>承运商：</td>
			<td><input class="spinner" style="width:168px" value="${ordersDispatchingData.carrierDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>货物押金：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${ordersDispatchingData.dispatchingGoodsDeposit}"  readonly="readonly"/>
			</td>
			<td>配送状态：</td>
			<td>
				<input class="spinner" id="ordersDispatching_dispatchingStatus" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
		    <td>送货名称：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${ordersDispatchingData.driverDisplay}"  readonly="readonly"/>
			</td>
			<td>签收状态：</td>
			<td><input class="spinner" style="width:168px" id="ordersDispatching_dispatchingSignfor" readonly="readonly"/></td>	
		</tr>
		<tr>
		    <td>车辆编号：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${ordersDispatchingData.carDisplay}"  readonly="readonly"/>
			</td>
			<td>发车时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${ordersDispatchingData.dispatchTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>	
		</tr>
		<tr>
		    <td>到站时间：</td>
			<td>
				<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${ordersDispatchingData.arriveTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
			</td>
			<td>启用/禁用：</td>
			<td><input class="spinner" style="width:168px" id="ordersDispatching_status" readonly="readonly"/></td>	
		</tr>
		<tr>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${ordersDispatchingData.createrDisplay}" readonly="readonly"/></td>
		     <td>录入时间：</td>
			 <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${ordersDispatchingData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		 </tr>
		 <tr>   
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${ordersDispatchingData.updaterDisplay}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${ordersDispatchingData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
	</table>
</form>


<script type="text/javascript">   
	
	$('#ordersDispatching_dispatchingStatus').val(renderGridValue('${ordersDispatchingData.dispatchingStatus}',fields.dispatchingStatus));
	$('#ordersDispatching_dispatchingSignfor').val(renderGridValue('${ordersDispatchingData.dispatchingSignfor}',fields.dispatchingSignfor));
	$('#ordersDispatching_status').val(renderGridValue('${ordersDispatchingData.status}',fields.status));
	
</script>
	

