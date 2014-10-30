<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


	<table class="detailtable" width="750" style="margin: 15px;">
		<tr>
			<td>提现流水线：</td>
			<td>
				<input type="hidden" id="finace_mgr_withdrawCarrier_form_withdrawId" name="withdrawId" value="${withdrawCarrierData.withdrawId}" />
				<input id="finace_mgr_withdrawCarrier_form_withdrawCode" style="width:268px;height: 20px;" name="withdrawCode" value="${withdrawCarrierData.withdrawCode}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
			<td>提现方式:</td>
	    	<td>
	    	<input id="finace_mgr_withdrawCarrier_form_withdrawSetDisplay" style="width:268px;height: 20px;" class="easyui-validatebox spinner" readonly="readonly" type="text" name="withdrawSetDisplay" value="${withdrawCarrierData.withdrawSetDisplay}" required="true" />
	    	</td>
		</tr>
		<tr>
			<td>提现金额:</td>
	    	<td>
	    	<input id="finace_mgr_withdrawCarrier_form_withdrawMoney" style="width:268px;height: 20px;" name="withdrawMoney" value="<fmt:formatNumber value='${withdrawCarrierData.withdrawMoney}' pattern="#,#00.00元"/>" class="spinner" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>手续费:</td>
	    	<td>
	    	<input id="finace_mgr_withdrawCarrier_form_chargeMoney" style="width:268px;height: 20px;" type="text" name="chargeMoney"  value="<fmt:formatNumber value='${withdrawCarrierData.chargeMoney}' pattern="#,#00.00元"/>" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
		</tr>
		<tr>
			<td>实际金额:</td>
	    	<td>
	    	<input id="finace_mgr_withdrawCarrier_form_withdrawReallyMoney" style="width:268px;height: 20px;" type="text" name="withdrawReallyMoney"  value="<fmt:formatNumber value='${withdrawCarrierData.withdrawReallyMoney}' pattern="#,#00.00元"/>" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>承运商名称：</td>
			<td>
				<input id="finace_mgr_withdrawCarrier_form_carrierDisplay" style="width:268px;height: 20px;" name="carrierDisplay" value="${withdrawCarrierData.carrierDisplay}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" value="${withdrawCarrierData.auditState}" class="spinner" style="height:18px;width:268px" readonly="readonly"/>
			</td>
			<td>审核说明：</td>
			<td>
				<input name="auditRemark" value="${withdrawCarrierData.auditOpinion}" class="spinner" style="height:18px;width:268px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input  class="spinner" style="width:268px" value="${withdrawCarrierData.auditorDisplay}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${withdrawCarrierData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:268px" value="${withdrawCarrierData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${withdrawCarrierData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:268px" value="${withdrawCarrierData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${withdrawCarrierData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="carrier_mgr_carInformation_form_remark" name="remark" style="width:650px;" class="spinner formta">${withdrawCarrierData.remark}</textarea>
			</td>
		</tr>
		
	</table>

<script type="text/javascript">
	//审核按钮初始化
	if(${withdrawData.auditState == 'pass'}){
		document.all("carrier_mgr_carInformation_form_auditState")[1].checked=true;
	}else if(${withdrawData.auditState == 'failure'}){
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
				<input type="hidden" id="finace_mgr_withdrawCarrier_form_withdrawId" name="withdrawId" value="${withdrawCarrierData.withdrawId}" />
				<input type="hidden" id="finace_mgr_withdrawCarrier_form_withdrawCode2" name="withdrawCode" value="${withdrawCarrierData.withdrawCode}" />
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="authstr" /><span>审核中</span>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="pass" /><span>审核通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="failure"  checked="checked"/><span>审核失败</span>
			</td>
		</tr>
		<tr>
			<td>审核说明：</td>
			<td colspan="3"><textarea name="auditOpinion" class="spinner formta" style="height:50px;width:650px">${withdrawCarrierData.auditOpinion}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
$('#carrier_mgr_carInformation_form_auditState').val(renderGridValue('${withdrawCarrierData.auditState}',fields.auditState));
</script>