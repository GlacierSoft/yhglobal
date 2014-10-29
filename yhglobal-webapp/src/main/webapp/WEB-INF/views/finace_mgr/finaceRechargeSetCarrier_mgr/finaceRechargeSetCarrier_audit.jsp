<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


	<table class="detailtable" width="750" style="margin: 15px;">
		<tr>
			<td>充值类型名称：</td>
			<td>
				<input id="finace_mgr_rechargeSetCarrier_form_rechargeName" style="width:268px;height: 20px;" name="rechargeName" value="${rechargeSetCarrierData.rechargeName}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
			<td>充值类型:</td>
	    	<td>
	    	<input id="finace_mgr_rechargeSetCarrier_form_rechargeType" style="width:268px;height: 20px;" class="easyui-validatebox spinner" readonly="readonly" type="text" name="rechargeType" value="${rechargeSetCarrierData.rechargeType}" required="true" />
	    	</td>
		</tr>
		<tr>
			<td>手续费率:</td>
	    	<td>
	    	<input id="finace_mgr_rechargeSetCarrier_form_rechargeRate" style="width:268px;height: 20px;" name="carrierMemberId" value="${rechargeSetCarrierData.rechargeRate}" class="spinner" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>固定金额收取 ：</td>
			<td>
				<input id="finace_mgr_rechargeSetCarrier_form_rechargeMoney" style="width:268px;height: 20px;" name="rechargeMoney" value="${rechargeSetCarrierData.rechargeMoney}" class="easyui-validatebox spinner" readonly="readonly"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>取费方式:</td>
	    	<td>
	    	<input id="finace_mgr_rechargeSetCarrier_form_feeWay" style="width:268px;height: 20px;" type="text" name="feeWay"  value="${rechargeSetCarrierData.feeWay}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>承运商等级：</td>
			<td>
				<input id="finace_mgr_rechargeSetCarrier_form_gradeDisplay" style="width:268px;height: 20px;" name="gradeDisplay" value="${rechargeSetCarrierData.gradeDisplay}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" value="${rechargeSetCarrierData.auditState}" class="spinner" style="height:18px;width:268px" readonly="readonly"/>
			</td>
			<td>审核说明：</td>
			<td>
				<input name="auditRemark" value="${rechargeSetCarrierData.auditOpinion}" class="spinner" style="height:18px;width:268px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input  class="spinner" style="width:268px" value="${rechargeSetCarrierData.auditorDisplay}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${rechargeSetCarrierData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:268px" value="${rechargeSetCarrierData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${rechargeSetCarrierData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:268px" value="${rechargeSetCarrierData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${rechargeSetCarrierData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="carrier_mgr_carInformation_form_remark" name="remark" style="width:650px;" class="spinner formta">${rechargeSetCarrierData.remark}</textarea>
			</td>
		</tr>
		
	</table>

<script type="text/javascript">
	//审核按钮初始化
	if(${rechargeSetData.auditState == 'pass'}){
		document.all("carrier_mgr_carInformation_form_auditState")[1].checked=true;
	}else if(${rechargeSetData.auditState == 'failure'}){
		document.all("carrier_mgr_carInformation_form_auditState")[2].checked=true;
	}else{
		document.all("carrier_mgr_carInformation_form_auditState")[0].checked=true;
	}
</script>
<form id="memberGrade_mgr_grade_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>充值类型信息审核：</td>
			<td>
				<input type="hidden" id="finace_mgr_rechargeSetCarrier_form_rechargeSetId" name="rechargeSetId" value="${rechargeSetCarrierData.rechargeSetId}" />
				<input type="hidden" id="finace_mgr_rechargeSetCarrier_form_rechargeName2" name="rechargeName" value="${rechargeSetCarrierData.rechargeName}" />
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="authstr" /><span>审核中</span>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="pass" /><span>审核通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="failure"  checked="checked"/><span>审核失败</span>
			</td>
		</tr>
		<tr>
			<td>审核说明：</td>
			<td colspan="3"><textarea name="auditOpinion" class="spinner formta" style="height:50px;width:650px">${rechargeSetCarrierData.auditOpinion}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
$('#carrier_mgr_carInformation_form_auditState').val(renderGridValue('${rechargeSetCarrierData.auditState}',fields.auditState));
$('#carrier_mgr_carInformation_form_rechargeType').val(renderGridValue('${rechargeSetCarrierData.rechargeType}',fields.rechargeType));
$('#carrier_mgr_carInformation_form_feeWay').val(renderGridValue('${rechargeSetCarrierData.feeWay}',fields.feeWay));
</script>