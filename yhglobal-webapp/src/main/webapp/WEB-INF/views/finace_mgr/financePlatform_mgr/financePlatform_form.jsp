<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form  method="post" style="padding:15px">
	<table class="formtable"> 
	     <tr>
			<td>编号：</td>
			<td>
				<input  maxlength="5" name="platformCode" class=" easyui-validatebox spinner"  style="width:268px" required="true"  value="${financePlatformData.platformCode}"  validType="customReg['[0-9]{5}','<fmt:message key="FinancePlat.platformCode.illegal"/>']"/>
			</td> 
		</tr>
		<tr>
			<td>账号名称：</td>
			<td>
				<input type="hidden" name="platformId" value="${financePlatformData.platformId}" />
			    <input  name="platformName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.platformName}" validType="customReg['^[\u0391-\uFFE5]{4,10}','<fmt:message key="FinancePlat.platformName.illegal"/>']"/>
			</td>
		</tr> 
         <tr>
			<td>开户银行：</td>
			<td>
				<input  name="platformBank" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.platformBank}" validType="customReg['^[\u0391-\uFFE5]{4,10}','<fmt:message key="FinancePlat.openingBank.illegal"/>']"/>
			</td>
		</tr> 
		 <tr>
			<td>支行：</td>
			<td>
				<input  name="bankStream" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.bankStream}"  validType="customReg['^[\u0391-\uFFE5]{4,10}','<fmt:message key="FinancePlat.subbranch.illegal"/>']"/>
			</td>
		</tr>
		
		 <tr>
			<td>银行卡名称：</td>
			<td>
				<input  name="bankName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.bankName}"  validType="customReg['^[\u0391-\uFFE5]{4,10}','<fmt:message key="FinancePlat.cardName.illegal"/>']"/>
			</td>
		</tr> 
		<tr>
			<td>银行卡号：</td>
			<td>
				<input  maxlength="19" name="bankCode" class="easyui-validatebox spinner"   style="width:268px" required="true" value="${financePlatformData.bankCode}"  validType="customReg['^[0-9]{19}','<fmt:message key="FinancePlat.cardNumber.illegal"/>']"/>
			</td>
		</tr>  
		<tr>
			<td>余额：</td>
			<td>
				<input name="remainMoney" class="easyui-validatebox spinner"   style="width:268px" required="true" value="<fmt:formatNumber value='${financePlatformData.remainMoney}' pattern="#,#00.00元"/>"  validType="customReg['^[0-9]','余额只能输入整数以及保留小数位']"/> 
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea class="spinner" style="width:268px" name="remark">${financePlatformData.remark}</textarea></td>
		</tr>
	</table>
</form>
