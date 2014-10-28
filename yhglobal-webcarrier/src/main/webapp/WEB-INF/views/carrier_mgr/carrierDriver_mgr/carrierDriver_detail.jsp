<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table  class="detailtable">  
			<tr>  
			    <td>姓名：</td>
			    <td>
			          <input  name=driverName class="spinner" style="width:168px" value='${carrierDriverData.driverName}' readonly="readonly"/>
                </td>
                <td style="padding-left:10px;">头像：</td>
				<td rowspan="4">
				   <img src="${carrierDriverData.driverPhoto}" width="140" height="75"></img>
				 </td>
				
			</tr>
			<tr>
				<td>年龄：</td>
				<td ><input name="age" class="spinner" style="width:168px" value="${carrierDriverData.age}" readonly="readonly"/></td>
		 	</tr>
		 	<tr>
				<td>状态：</td>
				<td ><input id="status" name="status" class="spinner" style="width:168px" value="${carrierDriverData.status}" readonly="readonly"/></td>
		 	</tr>  
		 	<tr>
		 	    <td>性别：</td>
				<td ><input id="sex" name="sex" class="spinner" style="width:168px" value="${carrierDriverData.sex}" readonly="readonly"/></td>
			 </tr> 
		 	 <tr>
		 	 	<td>承运商：</td>
				<td ><input name="carrierDisplay" class="spinner" style="width:168px" value="${carrierDriverData.carrierDisplay}" readonly="readonly"/></td>
		        <td style="padding-left:10px;">驾驶年龄：</td>
				<td ><input name="driverAge" class="spinner" style="width:168px" value="${carrierDriverData.driverAge}" readonly="readonly"/></td>
			 </tr>
			  <tr>
				<td>身份证编号：</td>
				<td ><input name="cardId" class="spinner" style="width:168px" value="${carrierDriverData.cardId}" readonly="readonly"/></td>
				<td style="padding-left:10px;">有效期限：</td>
				<td ><input name="driverLicenseTime" class="spinner" style="width:168px"   
				value="<fmt:formatDate value="${carrierDriverData.driverLicenseTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" 
				 readonly="readonly"/></td>
			 </tr>
			  <tr>
				<td>驾驶证编号：</td>
				<td ><input name="driverLicenseId" class="spinner" style="width:168px" value="${carrierDriverData.driverLicenseId}" readonly="readonly"/></td>
				<td style="padding-left:10px;">驾驶状态：</td>
				<td ><input id="driverStatus" name="driverStatus" class="spinner" style="width:168px" value="${carrierDriverData.driverStatus}" readonly="readonly"/></td>
			 </tr>
			   <tr>
				<td>联系电话：</td>
				<td ><input name="phone" class="spinner" style="width:168px" value="${carrierDriverData.phone}" readonly="readonly"/></td>
				<td style="padding-left:10px;">居住地址：</td>
				<td ><input  name="address" class="spinner" style="width:168px" value="${carrierDriverData.address}" readonly="readonly"/></td>
			 </tr>
			 <tr>
				<td>邮箱：</td>
				<td ><input name="email" class="spinner" style="width:168px" value="${carrierDriverData.email}" readonly="readonly"/></td>
				<td style="padding-left:10px;">审核状态：</td>
				<td ><input id="auditState" name="auditState" class="spinner" style="width:168px" value="${carrierDriverData.auditState}" readonly="readonly"/></td>
			 </tr>
			 <tr>
				<td>审核人：</td>
				<td ><input name="auditDisplay" class="spinner" style="width:168px" value="${carrierDriverData.auditDisplay}" readonly="readonly"/></td>
				<td style="padding-left:10px;">审核时间：</td>
				<td ><input name="auditTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${carrierDriverData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
			 </tr> 
			<tr>
		      <td>创建人：</td>
			  <td><input class="spinner" style="width:168px"   value="${carrierDriverData.createrDisplay}" readonly="readonly"/></td>
		      <td style="padding-left:10px;">录入时间：</td>
			  <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${carrierDriverData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		    </tr>
		    <tr>   
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${carrierDriverData.updaterDisplay}" readonly="readonly"/></td>
		     <td style="padding-left:10px;">更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${carrierDriverData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		    </tr>
			<tr>
				<td>备 注：</td>
				<td colspan="3"> <textarea   name="remark" class="spinner" style="width:435px;" readonly="readonly" >${carrierDriverData.remark}</textarea></td>
			</tr>
	 </table>
</form>
<script type="text/javascript">
	$('#status').val(renderGridValue('${carrierDriverData.status}',fields.status));
	$('#sex').val(renderGridValue('${carrierDriverData.sex}',fields.sex));
	$('#driverStatus').val(renderGridValue('${carrierDriverData.driverStatus}',fields.driverStatus));
	$('#auditState').val(renderGridValue('${carrierDriverData.auditState}',fields.auditState));
</script> 