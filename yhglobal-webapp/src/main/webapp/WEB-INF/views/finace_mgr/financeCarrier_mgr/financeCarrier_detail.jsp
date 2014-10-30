<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="carrierCarInformation_mgr_grade_form" method="post" style="padding:15px">
	<table class="detailtable" width="750">
		<tr>
			<td>承运商名称：</td>
			<td>
				<input type="hidden" id="finance_mgr_carrier_form_carrierId" name="carrierId" value="${CarrierData.carrierId}" />
				<input id="finance_mgr_carrier_form_carrierMemberDisplay" style="width:268px;height: 20px;" name="carrierMemberDisplay" value="${CarrierData.carrierMemberDisplay}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
			<td>收入总金额:</td>
	    	<td>
	    	<input id="finance_mgr_carrier_form_carrierIncome" style="width:268px;height: 20px;" class="easyui-validatebox spinner" readonly="readonly" type="text" name="carrierIncome" value="${CarrierData.carrierIncome}" required="true" />
	    	</td>
		</tr>
		<tr>
			<td>当前冻结金额:</td>
	    	<td>
	    	<input id="finance_mgr_carrier_form_carrierFreeze" style="width:268px;height: 20px;" name="carrierFreeze" value="<fmt:formatNumber value='${CarrierData.carrierFreeze}' pattern="#,#00.00元"/>" class="spinner" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>当前扣除金额:</td>
	    	<td>
	    	<input id="finance_mgr_carrier_form_carrierDeduct" style="width:268px;height: 20px;" type="text" name="carrierDeduct"  value="<fmt:formatNumber value='${CarrierData.carrierDeduct}' pattern="#,#00.00元"/>" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
		</tr>
		<tr>
			<td>返还总金额:</td>
	    	<td>
	    	<input id="finance_mgr_carrier_form_carrierReturn" style="width:268px;height: 20px;" type="text" name="carrierReturn"  value="<fmt:formatNumber value='${CarrierData.carrierReturn}' pattern="#,#00.00元"/>" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>充值总金额：</td>
			<td>
				<input id="finance_mgr_carrier_form_carrierRecharge" style="width:268px;height: 20px;" name="carrierRecharge" value="<fmt:formatNumber value='${CarrierData.carrierRecharge}' pattern="#,#00.00元"/>" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>提现总金额：</td>
			<td>
				<input id="finance_mgr_carrier_form_carrierWithdraw" style="width:268px;height: 20px;" name="carrierWithdraw" value="<fmt:formatNumber value='${CarrierData.carrierWithdraw}' pattern="#,#00.00元"/>" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:268px" value="${CarrierData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${CarrierData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:268px" value="${CarrierData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${CarrierData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="finance_mgr_carrier_form_remark" name="remark" style="width:650px;height: 170px;" class="spinner formta" readonly="readonly">${CarrierData.remark}</textarea>
			</td>
		</tr>
	</table>
</form>