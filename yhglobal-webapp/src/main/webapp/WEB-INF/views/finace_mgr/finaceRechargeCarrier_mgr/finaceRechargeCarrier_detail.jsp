<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="carrierCarInformation_mgr_grade_form" method="post" style="padding:15px">
	<table class="detailtable" width="750">
		<tr>
			<td>充值流水线：</td>
			<td>
				<input type="hidden" id="finace_mgr_rechargeCarrier_form_rechargeId" name="rechargeId" value="${rechargeCarrierData.rechargeId}" />
				<input id="finace_mgr_rechargeCarrier_form_rechargeCode" style="width:268px;height: 20px;" name="rechargeCode" value="${rechargeCarrierData.rechargeCode}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
			<td>充值方式:</td>
	    	<td>
	    	<input id="finace_mgr_rechargeCarrier_form_rechargeSetDisplay" style="width:268px;height: 20px;" class="easyui-validatebox spinner" readonly="readonly" type="text" name="rechargeSetDisplay" value="${rechargeCarrierData.rechargeSetDisplay}" required="true" />
	    	</td>
		</tr>
		<tr>
			<td>充值金额:</td>
	    	<td>
	    	<input id="finace_mgr_rechargeCarrier_form_rechargeMoney" style="width:268px;height: 20px;" name="rechargeMoney" value="${rechargeCarrierData.rechargeMoney}" class="spinner" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>优惠金额 ：</td>
			<td>
				<input id="finace_mgr_rechargeCarrier_form_saveMoney" style="width:268px;height: 20px;" name="saveMoney" value="${rechargeCarrierData.saveMoney}" class="easyui-validatebox spinner" readonly="readonly"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>手续费:</td>
	    	<td>
	    	<input id="finace_mgr_rechargeCarrier_form_chargeMoney" style="width:268px;height: 20px;" type="text" name="chargeMoney"  value="${rechargeCarrierData.chargeMoney}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>返现金额：</td>
			<td>
				<input id="finace_mgr_rechargeCarrier_form_returnMoney" style="width:268px;height: 20px;" name="returnMoney" value="${rechargeCarrierData.returnMoney}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>到账金额:</td>
	    	<td>
	    	<input id="finace_mgr_rechargeCarrier_form_receiveMoney" style="width:268px;height: 20px;" type="text" name="receiveMoney"  value="${rechargeCarrierData.receiveMoney}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>承运商名称：</td>
			<td>
				<input id="finace_mgr_rechargeCarrier_form_carrierDisplay" style="width:268px;height: 20px;" name="carrierDisplay" value="${rechargeCarrierData.carrierDisplay}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input id="finace_mgr_rechargeCarrier_form_auditState" name="auditState" value="${rechargeCarrierData.auditState}" class="spinner" style="height:18px;width:268px" readonly="readonly"/>
			</td>
			<td>审核说明：</td>
			<td>
				<input name="auditRemark" value="${rechargeCarrierData.auditOpinion}" class="spinner" style="height:18px;width:268px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input id="finace_mgr_rechargeCarrier_form_auditorDisplay" class="spinner" style="width:268px" value="${rechargeCarrierData.auditorDisplay}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${rechargeCarrierData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:268px" value="${rechargeCarrierData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${rechargeCarrierData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:268px" value="${rechargeCarrierData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${rechargeCarrierData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="finace_mgr_rechargeCarrier_form_remark" name="remark" style="width:650px;height: 170px;" class="spinner formta" readonly="readonly">${rechargeCarrierData.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
$('#finace_mgr_rechargeCarrier_form_auditState').val(renderGridValue('${rechargeCarrierData.auditState}',fields.auditState));
</script>