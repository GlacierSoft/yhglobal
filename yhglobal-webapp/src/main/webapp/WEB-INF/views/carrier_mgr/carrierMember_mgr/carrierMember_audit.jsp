<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div style="padding:15px">
	<table class="detailtable"> 
				    <tr> 
				        <td>会员名称：</td>
						<td>
							<input type="hidden" id="member_mgr_member_form_memberId" name="carrierMemberId" value="${carrierMemberData.carrierMemberId}" />
							<input id="member_mgr_member_form_memberName" name="memberName" class="spinner" style="width:168px" value="${carrierMemberData.memberName}"  readonly="readonly"/>
						</td>
						<td style="padding-left:10px;">注册时间：</td>
						<td ><input id="member_mgr_member_form_registrationTime" name="registrationTime" class="spinner" style="width:168px;" value="<fmt:formatDate value="${carrierMemberData.registrationTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr> 
					<tr>
					    <td>会员类型：</td>
						<td><input id="member_mgr_member_form_memberType" name="memberType" class="spinner" style="width:168px" value='${carrierMemberData.memberType}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">会员状态：</td>
						<td><input id="member_mgr_member_form_status" name="status" class="spinner" style="width:168px" value="${carrierMemberData.status}" readonly="readonly"/></td>
					 </tr>
					 <tr>
						<td>信誉度：</td>
						<td><input  name="creditworthiness" class="spinner" style="width:168px" value="<fmt:formatNumber value='${carrierMemberData.creditworthiness}' pattern="#,#00.00"/>" readonly="readonly"/></td>
					    <td style="padding-left:10px;">账户余额：</td>
					    <td><input name="surplusMonney" class="spinner" style="width:168px" value="<fmt:formatNumber value='${carrierMemberData.surplusMonney}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
				 	</tr>
					 <tr>
						<td>注册时间：</td>
						<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${carrierMemberData.registrationTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
						<td style="padding-left:10px;">上次登录时间：</td>
						<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${carrierMemberData.lastLoginTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>登录次数：</td>
						<td ><input name="loginCount" class="spinner" style="width:168px" value="${carrierMemberData.loginCount}" readonly="readonly"/></td>
						<td style="padding-left:10px;">上次登录ip：</td>
						<td ><input name="lastLoginIpAddress" class="spinner" style="width:168px" value="${carrierMemberData.lastLoginIpAddress}" readonly="readonly"/></td>
					 </tr>
					 
					 <tr>
						<td>信用额度：</td>
						<td ><input name="creditLimit" class="spinner" style="width:168px" value="${carrierMemberData.creditLimit}" readonly="readonly"/></td>
						<td style="padding-left:10px;">配送成功次数：</td>
						<td ><input name="deliverSuccess" class="spinner" style="width:168px" value="${carrierMemberData.deliverSuccess}" readonly="readonly"/></td>
					 </tr>
					 
					 <tr>
						<td>配送失败次数：</td>
						<td ><input name="deliverFail" class="spinner" style="width:168px" value="${carrierMemberData.deliverFail}" readonly="readonly"/></td>
						<td style="padding-left:10px;">审核状态：</td>
						<td ><input id="carrierMember_mgr_member_audit" name="auditState" class="spinner" style="width:168px" value="${carrierMemberData.auditState}" readonly="readonly"/></td>
					 </tr>
					 <tr>
						<td>审核人：</td>
						<td ><input name="auditDisplay" class="spinner" style="width:168px" value="${carrierMemberData.auditDisplay}" readonly="readonly"/></td>
						<td style="padding-left:10px;">审核时间：</td>
						<td ><input name="auditTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${carrierMemberData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"   readonly="readonly"/></td>
					 </tr>
					 
						<tr>
						<td>地 址：</td>
						<td colspan="3"><input  name="liveAddress" class="spinner" style="width:435px" value="${carrierMemberData.liveAddress}" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>备 注：</td>
						<td colspan="3"> <textarea   name="remark" class="spinner" style="width:435px;" readonly="readonly" >${carrierMemberData.remark}</textarea></td>
					</tr>
	</table>
</div>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>审核状态：</td>
			<td>
				<input type="hidden" name="carrierMemberId" value="${carrierMemberData.carrierMemberId}" />
			 	<input id="carrierMember_mgr_member_audit_authState" name="auditState" type="radio" value="authstr"  /><span>审核中</span>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
				<input id="carrierMember_mgr_member_audit_authState" name="auditState" type="radio" value="pass"  /><span>审核通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="carrierMember_mgr_member_audit_authState" name="auditState" type="radio" value="failure"  /><span>审核失败</span>
			</td>
		 	</tr>
		<tr>
			<td>审核说明：</td>
			<td colspan="3">
				<textarea name="auditOpinion" class="spinner" style="height:50px;width:445px">${carrierMemberData.auditOpinion}</textarea>
			</td>
		</tr>
	</table> 
</form>
 
<script type="text/javascript">  
    	$('#carrierMember_mgr_member_audit').val(renderGridValue('${carrierMemberData.auditState}',fields.auditState));
    	$('#member_mgr_member_form_status').val(renderGridValue('${carrierMemberData.status}',fields.status));
    	$('#member_mgr_member_form_memberType').val(renderGridValue('${carrierMemberData.memberType}',fields.memberType));
        //审核按钮初始化 
		if(${carrierMemberData.auditState== 'pass'}){
			document.all("carrierMember_mgr_member_audit_authState")[1].checked=true;
		}else if(${carrierMemberData.auditState == 'failure'}){
			document.all("carrierMember_mgr_member_audit_authState")[2].checked=true;
		}else{
			document.all("carrierMember_mgr_member_audit_authState")[0].checked=true;
		}  

</script>