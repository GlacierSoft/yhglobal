<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable" width="800">
		<tr>
			<td>订单编号：</td>
			<td>
				<input type="hidden" id="memberGrade_mgr_memberGrade_form_orderInfoId" name="orderInfoId" value="${order_infoDate.orderInfoId}" />
				<input id="memberGrade_mgr_memberGrade_form_orderCodeDisplay" style="width:268px;height: 20px;" name="orderCodeDisplay" value="${order_infoDate.orderCodeDisplay}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>货物名称：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_belaidupDisplay" name="belaidupDisplay"  style="width:268px;" readonly="readonly" value="${order_infoDate.belaidupDisplay}" class="easyui-validatebox spinner" />
			</td>
		</tr>
		<tr>
			<td>损坏状态：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_yesOrNo" name="status"  style="width:268px;" readonly="readonly" value="${order_infoDate.yesOrNo}" class="spinner"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.yesOrNo"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_createrDisplay" name="createrDisplay" readonly="readonly" style="width:268px;" value="${order_infoDate.createrDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>创建时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_createTime" name="gradeDestination" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${order_infoDate.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_updaterDisplay" name="gradeCashpayment" readonly="readonly" style="width:268px;" value="${order_infoDate.updaterDisplay}" class="easyui-validatebox spinner"/>
			</td>
			<td>更新时间：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_updateTime" name="updateTime" readonly="readonly" style="width:268px;" value="<fmt:formatDate value="${order_infoDate.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="memberGrade_mgr_memberGrade_form_remark" name="remark" readonly="readonly" style="width:670px;" class="spinner formta">${order_infoDate.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#memberGrade_mgr_memberGrade_form_yesOrNo').val(renderGridValue('${order_infoDate.yesOrNo}',fields.yesOrNo));
</script>
