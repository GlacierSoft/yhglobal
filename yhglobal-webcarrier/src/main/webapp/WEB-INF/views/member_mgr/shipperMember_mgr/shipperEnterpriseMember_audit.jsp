<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div style="padding:15px">
	<table class="detailtable"> 
		 <tr>
		    <td>企业名称：</td>
			<td><input  name="enterpriseName" class="spinner" style="width:168px" value='${enterpriseMemberData.enterpriseName}' readonly="readonly"/></td>
		    <td style="padding-left:10px;">法人代表：</td>
			<td><input name="deputy" class="spinner" style="width:168px" value="${enterpriseMemberData.deputy}" readonly="readonly"/></td>
		 </tr>
		  <tr>
		    <td>所属地区：</td>
			<td><input  name="area" class="spinner" style="width:168px" value='${enterpriseMemberData.area}' readonly="readonly"/></td>
		    <td style="padding-left:10px;">企业性质：</td>
			<td><input name="property" class="spinner" style="width:168px" value="${enterpriseMemberData.property}" readonly="readonly"/></td>
		 </tr>
		   <tr>
		    <td>企业类型：</td>
			<td><input  name="enterpriseType" class="spinner" style="width:168px" value='${enterpriseMemberData.enterpriseType}' readonly="readonly"/></td>
		    <td style="padding-left:10px;">所属行业：</td>
			<td><input name="trade" class="spinner" style="width:168px" value="${enterpriseMemberData.trade}" readonly="readonly"/></td>
		 </tr>
		  <tr>
		    <td>企业LOGO：</td>
			<td><input  name="enterpriseLogo" class="spinner" style="width:168px" value='${enterpriseMemberData.enterpriseLogo}' readonly="readonly"/></td>
		    <td style="padding-left:10px;">企业标识：</td>
			<td><input name="enterpriseImg" class="spinner" style="width:168px" value="${enterpriseMemberData.enterpriseImg}" readonly="readonly"/></td>
		 </tr>
		 <tr>
		     <td>企业传真：</td>
			<td><input name="enterpriseFax" class="spinner" style="width:168px" value="${enterpriseMemberData.enterpriseFax}" readonly="readonly"/></td>
		    <td style="padding-left:10px;">详细地址：</td>
			<td><input name="detailedAddress" class="spinner" style="width:168px" value="${enterpriseMemberData.detailedAddress}" readonly="readonly"/></td>
		  </tr>
		  <tr>
		    <td>企业电话：</td>
			<td><input name="enterprisePhone" class="spinner" style="width:168px" value="${enterpriseMemberData.enterprisePhone}" readonly="readonly"/></td>
		     <td style="padding-left:10px;">企业邮箱：</td>
			 <td><input class="spinner" style="width:168px" value="${shipperMemberData.email}" readonly="readonly"/></td>
		  </tr>
		 <tr>
			<td>简 介：</td>
			<td colspan="3"> <textarea   name="enterpriseSummary" class="spinner" style="width:410px;" readonly="readonly" >${enterpriseMemberData.enterpriseSummary}</textarea></td>
		</tr>  
		<tr>
			<td>认证状态：</td>
			<td>
				<input name="authState"  class="spinner" id="shipperMember_mgr_enterpriseMember_audit" value="${enterpriseMemberData.authState}"  style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>认证人：</td>
			<td><input  name="auditDisplay" class="spinner" style="width:168px"  value="${enterpriseMemberData.auditDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>认证说明：</td>
			<td>
				<input name="authRemark"  class="spinner" style="height:18px;width:180px" readonly="readonly" value="${enterpriseMemberData.authRemark}"/>
			</td>
			<td>认证时间：</td>
			<td><input  name="authTime" class="spinner" style="width:168px"  value="<fmt:formatDate value="${enterpriseMemberData.authTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr> 
	</table>
</div>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>认证状态：</td>
			<td>
				<input type="hidden" name="memberId" value="${enterpriseMemberData.memberId}" />
			 	<input id="shipperMember_mgr_enterpriseMember_audit_authState" name="authState" type="radio" value="authstr"  /><span>认证中</span>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
				<input id="shipperMember_mgr_enterpriseMember_audit_authState" name="authState" type="radio" value="pass"  /><span>认证通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="shipperMember_mgr_enterpriseMember_audit_authState" name="authState" type="radio" value="failure"  /><span>认证失败</span>
			</td>
		 	</tr>
		<tr>
			<td>认证说明：</td>
			<td colspan="3">
				<textarea name="authRemark" class="spinner" style="height:50px;width:445px">${enterpriseMemberData.authRemark}</textarea>
			</td>
		</tr>
	</table> 
</form>
 
<script type="text/javascript"> 
        $('#shipperMember_mgr_enterpriseMember_audit').val(renderGridValue('${enterpriseMemberData.authState}',fields.auditState)); 
	    //审核按钮初始化 
		if(${enterpriseMemberData.authState== 'pass'}){
			document.all("shipperMember_mgr_enterpriseMember_audit_authState")[1].checked=true;
		}else if(${enterpriseMemberData.authState == 'failure'}){
			document.all("shipperMember_mgr_enterpriseMember_audit_authState")[2].checked=true;
		}else{
			document.all("shipperMember_mgr_enterpriseMember_audit_authState")[0].checked=true;
		}  

</script>