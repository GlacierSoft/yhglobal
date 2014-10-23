<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable" width="800">
		<tr>
			<td>订单编号：</td>
			<td>
				<input type="hidden" id="memberGrade_mgr_memberGrade_form_orderId" name="orderId" value="${orderDate.orderId}" />
				<input id="memberGrade_mgr_memberGrade_form_orderCode" style="width:268px;height: 20px;" name="orderCode" value="${orderDate.orderCode}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>订单总金额：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_orderPrice" name="orderPrice"  style="width:268px;" readonly="readonly" value="${orderDate.orderPrice}" class="easyui-validatebox spinner" />
			</td>
		</tr>
		<tr>
			<td>货物数量：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_orderNum" style="width:268px;height: 20px;" name="orderNum" value="${orderDate.orderNum}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>订单状态：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_orderStatus" name="orderStatus"  style="width:268px;" readonly="readonly" value="${orderDate.orderStatus}" class="easyui-validatebox spinner" />
			</td>
		</tr>
		<tr>
			<td>分拣状态：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_distributeStatus" style="width:268px;height: 20px;" name="distributeStatus" value="${orderDate.distributeStatus}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_createrDisplay" name="createrDisplay" readonly="readonly" style="width:268px;" value="${orderDate.createrDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>创建时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_createTime" name="gradeDestination" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${orderDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_updaterDisplay" name="gradeCashpayment" readonly="readonly" style="width:268px;" value="${orderDate.updaterDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>更新时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_updateTime" name="updateTime" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${orderDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="memberGrade_mgr_memberGrade_form_remark" name="remark" readonly="readonly" style="width:670px;" class="spinner formta">${orderDate.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#memberGrade_mgr_memberGrade_form_orderStatus').val(renderGridValue('${orderDate.orderStatus}',fields.orderStatus));
	$('#memberGrade_mgr_memberGrade_form_distributeStatus').val(renderGridValue('${orderDate.distributeStatus}',fields.distributeStatus));
</script>
