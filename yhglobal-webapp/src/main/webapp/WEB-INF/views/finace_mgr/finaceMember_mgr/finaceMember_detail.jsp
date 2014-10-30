<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${finaceMemberDetailData.memberDisplay}"  readonly="readonly"/>
			</td>
			<td>充值总金额：</td>
			<td><input class="spinner" style="width:168px" value="${finaceMemberDetailData.mrechageAdd}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>支出总金额：</td>
			<td>
				<input name="sumFine"   value="${finaceMemberDetailData.mrechagePay }" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>优惠总金额：</td>
			<td><input class="spinner" style="width:168px"   value="${finaceMemberDetailData.mrechagePrefer }" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>账户余额：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${finaceMemberDetailData.mrechageRemain}"  readonly="readonly"/>
			</td>
			<td>获赔总金额：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${finaceMemberDetailData.mrechargeMark}"  readonly="readonly"/>
			</td>
		</tr>
		<tr>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${finaceMemberDetailData.createrDisplay}" readonly="readonly"/></td>
		     <td>录入时间：</td>
			 <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${finaceMemberDetailData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		 </tr>
		 <tr>   
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${finaceMemberDetailData.updaterDisplay}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${finaceMemberDetailData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>
		   <td valign="top">备注</td>
		   <td colspan="3">
		       <textarea name="remark" style="width:420px;" maxlength="255" class="spinner formta" readonly="readonly">${finaceMemberDetailData.remark}</textarea>
		   </td>
		</tr>
	</table>
</form>


	

