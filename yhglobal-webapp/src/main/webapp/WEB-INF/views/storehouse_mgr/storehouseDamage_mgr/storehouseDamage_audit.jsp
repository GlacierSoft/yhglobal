<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>货物名称：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${storehouseDamageData.belaidupDisplay}"  readonly="readonly"/>
			</td>
			<td>退还状态：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" id="storageGoodsrun_mgr_goodsrunStatus"  readonly="readonly"/>
			</td>
			
		</tr>
		<tr>
			<td>审核人：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="${storehouseDamageData.auditorDisplay}" />
			</td>
			<td>审核状态：</td>
			<td>
				<input class="spinner" id="storageGoodsrun_mgr_damageStatus" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
		    <td>审核内容：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="${storehouseDamageData.auditOpinion}" />
			</td>
			<td>审核时间：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" readonly="readonly" value="<fmt:formatDate value="${storehouseDamageData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"/>
			</td>
		</tr>
		<tr>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${storehouseDamageData.createrDisplay}" readonly="readonly"/></td>
		     <td>录入时间：</td>
			 <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${storehouseDamageData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		 </tr>
		 <tr>   
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${storehouseDamageData.updaterDisplay}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${storehouseDamageData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>   
		     <td>审核状态设置：</td>
			 <td colspan="3">
			   <input type="hidden"  name="damageId" value="${storehouseDamageData.damageId}" />
			   <input id="contractManager_mgr_contractManager_form_auditState" name="auditStatus" type="radio" value="authstr" /><span>审核中</span>
			   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			   <input id="contractManager_mgr_contractManager_form_auditState" name="auditStatus" type="radio" value="pass" /><span>审核通过</span>
			   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			   <input id="contractManager_mgr_contractManager_form_auditState" name="auditStatus" type="radio" value="failure" /><span>审核失败</span>
			 </td>
		</tr>
		<tr>   
		     <td valign="top">损坏备注：</td>
			 <td colspan="3"><textarea name="remark" style="width:420px;" maxlength="255" class="spinner formta" readonly="readonly">${storehouseDamageData.remark}</textarea></td>
		</tr>
	</table>
</form>


<script type="text/javascript">
	$('#storageGoodsrun_mgr_goodsrunStatus').val(renderGridValue('${storehouseDamageData.yesOrNo}',fields.yesOrNo));
	$('#storageGoodsrun_mgr_damageStatus').val(renderGridValue('${storehouseDamageData.auditStatus}',fields.auditState));
	
	 //审核按钮初始化
	if(${storehouseDamageData.auditStatus == 'authstr'}){
		document.all("contractManager_mgr_contractManager_form_auditState")[0].checked=true;
	}else if(${storehouseDamageData.auditStatus  == 'pass'}){
		document.all("contractManager_mgr_contractManager_form_auditState")[1].checked=true;
	}else{
		document.all("contractManager_mgr_contractManager_form_auditState")[2].checked=true;
	}
	
</script>
	

