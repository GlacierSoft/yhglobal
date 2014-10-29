<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


	<table class="detailtable" width="750" style="margin: 15px;">
		<tr>
			<td>提现类型名称：</td>
			<td>
				<input id="finace_mgr_withdrawSetCarrier_form_withdrawName" style="width:268px;height: 20px;" name="withdrawName" value="${withdrawSetCarrierData.withdrawName}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>手续费率:</td>
	    	<td>
	    	<input id="finace_mgr_withdrawSetCarrier_form_withdrawRate" style="width:268px;height: 20px;" name="carrierMemberId" value="${withdrawSetCarrierData.withdrawRate}" class="spinner" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>固定金额收取 ：</td>
			<td>
				<input id="finace_mgr_withdrawSetCarrier_form_withdrawMoney" style="width:268px;height: 20px;" name="withdrawMoney" value="${withdrawSetCarrierData.withdrawMoney}" class="easyui-validatebox spinner" readonly="readonly"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>取费方式:</td>
	    	<td>
	    	<input id="finace_mgr_withdrawSetCarrier_form_feeWay" style="width:268px;height: 20px;" type="text" name="feeWay"  value="${withdrawSetCarrierData.feeWay}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>承运商等级：</td>
			<td>
				<input id="finace_mgr_withdrawSetCarrier_form_gradeDisplay" style="width:268px;height: 20px;" name="gradeDisplay" value="${withdrawSetCarrierData.gradeDisplay}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" value="${withdrawSetCarrierData.auditState}" class="spinner" style="height:18px;width:268px" readonly="readonly"/>
			</td>
			<td>审核说明：</td>
			<td>
				<input name="auditRemark" value="${withdrawSetCarrierData.auditOpinion}" class="spinner" style="height:18px;width:268px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input  class="spinner" style="width:268px" value="${withdrawSetCarrierData.auditorDisplay}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${withdrawSetCarrierData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:268px" value="${withdrawSetCarrierData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${withdrawSetCarrierData.craeteTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:268px" value="${withdrawSetCarrierData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${withdrawSetCarrierData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="carrier_mgr_carInformation_form_remark" name="remark" style="width:650px;" class="spinner formta">${withdrawSetCarrierData.remark}</textarea>
			</td>
		</tr>
		
	</table>

<script type="text/javascript">
	//审核按钮初始化
	if(${withdrawSetData.auditState == 'pass'}){
		document.all("carrier_mgr_carInformation_form_auditState")[1].checked=true;
	}else if(${withdrawSetData.auditState == 'failure'}){
		document.all("carrier_mgr_carInformation_form_auditState")[2].checked=true;
	}else{
		document.all("carrier_mgr_carInformation_form_auditState")[0].checked=true;
	}
</script>
<form id="memberGrade_mgr_grade_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>提现类型信息审核：</td>
			<td>
				<input type="hidden" id="finace_mgr_withdrawSetCarrier_form_withdrawSetId" name="withdrawSetId" value="${withdrawSetCarrierData.withdrawSetId}" />
				<input type="hidden" id="finace_mgr_withdrawSetCarrier_form_withdrawName2" name="withdrawName" value="${withdrawSetCarrierData.withdrawName}" />
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="authstr" /><span>审核中</span>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="pass" /><span>审核通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="failure"  checked="checked"/><span>审核失败</span>
			</td>
		</tr>
		<tr>
			<td>审核说明：</td>
			<td colspan="3"><textarea name="auditOpinion" class="spinner formta" style="height:50px;width:650px">${withdrawSetCarrierData.auditOpinion}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
$('#carrier_mgr_carInformation_form_auditState').val(renderGridValue('${withdrawSetCarrierData.auditState}',fields.auditState));
$('#carrier_mgr_carInformation_form_feeWay').val(renderGridValue('${withdrawSetCarrierData.feeWay}',fields.feeWay));
</script>