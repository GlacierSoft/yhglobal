<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="carrierCarInformation_mgr_grade_form" method="post" style="padding:15px">
	<table class="detailtable" width="750">
		<tr>
			<td>承运商名称：</td>
			<td>
				<input type="hidden" id="finance_mgr_carrierDetail_form_detailId" name="detailId" value="${CarrierDetailData.detailId}" />
				<input id="finance_mgr_carrierDetail_form_carrierMemberDisplay" style="width:268px;height: 20px;" name="carrierMemberDisplay" value="${CarrierDetailData.carrierMemberDisplay}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td> 
		</tr>
		<tr>
			<td>收入金额:</td>
	    	<td>
	    	<input id="finance_mgr_carrierDetail_form_detailIncome" style="width:268px;height: 20px;" name="detailIncome" value="<fmt:formatNumber value='${CarrierDetailData.detailIncome}' pattern="#,#00.00元"/>" class="spinner" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
	    	<td>冻结金额:</td>
	    	<td>
	    	<input id="finance_mgr_carrierDetail_form_detailFreeze" style="width:268px;height: 20px;" type="text" name="detailFreeze"  value="<fmt:formatNumber value='${CarrierDetailData.detailFreeze}' pattern="#,#00.00元"/>" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
	    	</td>
		</tr> 
		<tr>
			<td>解冻金额：</td>
			<td>
				<input id="finance_mgr_carrierDetail_form_removeFreeze" style="width:268px;height: 20px;" name="removeFreeze" value="<fmt:formatNumber value='${CarrierDetailData.removeFreeze}' pattern="#,#00.00元"/>" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
			<td>返还金额：</td>
			<td>
				<input id="finance_mgr_carrierDetail_form_detailReturn" style="width:268px;height: 20px;" name="detailReturn" value="<fmt:formatNumber value='${CarrierDetailData.detailReturn}' pattern="#,#00.00元"/>" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>扣除金额：</td>
			<td>
				<input id="finance_mgr_carrierDetail_form_detailMark" style="width:268px;height: 20px;" name="detailMark" value="<fmt:formatNumber value='${CarrierDetailData.detailMark}' pattern="#,#00.00元"/>" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
			<td>资金状态：</td>
			<td>
				<input id="finace_mgr_withdrawCarrier_form_detailStatus" name="detailStatus" value="${withdrawCarrierDetailData.detailStatus}" class="spinner" style="height:18px;width:268px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:268px" value="${CarrierDetailData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${CarrierDetailData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:268px" value="${CarrierDetailData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${CarrierDetailData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="finance_mgr_carrierDetail_form_remark" name="remark" style="width:650px;height: 170px;" class="spinner formta" readonly="readonly">${CarrierDetailData.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
$('#finace_mgr_withdrawCarrier_form_detailStatus').val(renderGridValue('${CarrierDetailData.detailStatus}',fields.detailStatus));
</script>