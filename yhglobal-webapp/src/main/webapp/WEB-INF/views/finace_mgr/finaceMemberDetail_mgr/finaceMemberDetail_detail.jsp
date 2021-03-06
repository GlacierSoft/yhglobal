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
			<td>货物名称：</td>
			<td><input class="spinner" style="width:168px" value="${finaceMemberDetailData.belaidupDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>付款方式：</td>
			<td>
				<input name="sumFine"   id="finaceMemberDetail_mdetail_type"  class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>应付金额：</td>
			<td><input class="spinner" style="width:168px"   value="${finaceMemberDetailData.mdetaillPayfor }" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>实付金额：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${finaceMemberDetailData.mdetailPay}"  readonly="readonly"/>
			</td>
			<td>备注：</td>
			<td>
				<input class="spinner" style="height:18px;width:180px" value="${finaceMemberDetailData.remark}"  readonly="readonly"/>
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
	</table>
</form>

<script type="text/javascript">
	
	$('#finaceMemberDetail_mdetail_type').val(renderGridValue('${finaceMemberDetailData.mdetailType}',fields.mdetailType));
	
</script>
	

