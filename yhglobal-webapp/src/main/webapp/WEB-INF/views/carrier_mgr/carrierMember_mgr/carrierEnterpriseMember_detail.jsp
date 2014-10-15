<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="member_mgr_member_form" method="post" style="padding:15px;width: 565px">
<div title="基本信息" style="padding:15px">
    	<fieldset id="user_mgr_user_form_userGenfieldset" style="padding:10px;" class="spinner">
			<legend>会员基本信息</legend>  
			<table  class="detailtable"> 
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
						<td>上次登录ip：</td>
						<td><input class="spinner" style="width:168px" value="${carrierMemberData.lastLoginIpAddress}"  readonly="readonly"/></td>
						<td style="padding-left:10px;">上次登录时间：</td>
						<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${carrierMemberData.lastLoginTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					</tr>
					<tr>
						<td>登录次数：</td>
						<td><input name="loginCount" class="spinner" style="width:168px" value="${carrierMemberData.loginCount}" readonly="readonly"/></td>
					 	<td style="padding-left:10px;">地 址：</td>
						<td><input  name="liveAddress" class="spinner" style="width:168px" value="${carrierMemberData.liveAddress}" readonly="readonly"/></td>
					 </tr> 
					 <tr>
						<td>信用额度：</td>
						<td ><input name="creditLimit" class="spinner" style="width:168px"  value="<fmt:formatNumber value="${carrierMemberData.creditLimit}" pattern="#,#00.00"/>"  readonly="readonly"/></td>
						<td style="padding-left:10px;">配送成功次数：</td>
						<td ><input name="deliverSuccess" class="spinner" style="width:168px" value="${carrierMemberData.deliverSuccess}" readonly="readonly"/></td>
					 </tr>
					 
					 <tr>
						<td>配送失败次数：</td>
						<td ><input name="deliverFail" class="spinner" style="width:168px" value="${carrierMemberData.deliverFail}" readonly="readonly"/></td>
						<td style="padding-left:10px;">审核状态：</td>
						<td ><input id="auditStateOne" name="auditState" class="spinner" style="width:168px" value="${carrierMemberData.auditState}" readonly="readonly"/></td>
					 </tr>
					 <tr>
						<td>审核人：</td>
						<td ><input name="auditDisplay" class="spinner" style="width:168px" value="${carrierMemberData.auditDisplay}" readonly="readonly"/></td>
						<td style="padding-left:10px;">审核时间：</td>
						<td ><input name="auditTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${carrierMemberData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
					 </tr> 
					<tr>
				      <td>创建人：</td>
					  <td><input class="spinner" style="width:168px"   value="${carrierMemberData.createrDisplay}" readonly="readonly"/></td>
				      <td style="padding-left:10px;">录入时间：</td>
					  <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${carrierMemberData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
				    </tr>
				    <tr>   
				     <td>更新人：</td>
					 <td><input class="spinner" style="width:168px"   value="${carrierMemberData.updaterDisplay}" readonly="readonly"/></td>
				     <td style="padding-left:10px;">更新时间：</td>
					 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${carrierMemberData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
				    </tr>
					<tr>
						<td>备 注：</td>
						<td colspan="3"> <textarea   name="remark" class="spinner" style="width:435px;" readonly="readonly" >${carrierMemberData.remark}</textarea></td>
					</tr>
				</table>
		</fieldset>
    </div>
    <div title="详细信息" style="padding:15px">
    	<fieldset id="user_mgr_user_form_connetGenfieldset" style="padding:10px;" class="spinner">
			<legend>企业信息</legend>  
			<table  class="detailtable">
					 <tr>
					    <td>企业名称：</td>
						<td><input  name="enterpriseName" class="spinner" style="width:168px" value='${enterpriseMemberData.enterpriseName}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">企业LOGO：</td>
						 <td rowspan="3">
						      <img src="${enterpriseMemberData.enterpriseLogo}" width="130" height="75"></img>
						</td>     
					 </tr>
					  <tr>
					    <td>法人代表：</td>
						<td><input name="deputy" class="spinner" style="width:168px" value="${enterpriseMemberData.deputy}" readonly="readonly"/></td>
					 </tr>
					   <tr>
					    <td>企业类型：</td>
						<td><input  name="enterpriseType" class="spinner" style="width:168px" value='${enterpriseMemberData.enterpriseType}' readonly="readonly"/></td>
					 </tr>
					 <tr>
					     <td>企业性质：</td>
						<td><input name="property" class="spinner" style="width:168px" value="${enterpriseMemberData.property}" readonly="readonly"/></td>
					    <td style="padding-left:10px;">所属行业：</td>
						<td><input name="trade" class="spinner" style="width:168px" value="${enterpriseMemberData.trade}" readonly="readonly"/></td>
					  </tr>
					  <tr>
					    <td>所属地区：</td>
						<td><input  name="area" class="spinner" style="width:168px" value='${enterpriseMemberData.area}' readonly="readonly"/></td>
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
						<td><input name="email" class="spinner" style="width:168px" value="${shipperMemberData.email}" readonly="readonly"/></td>
					
					 </tr>
					 <tr>
						<td>简 介：</td>
						<td colspan="3"> <textarea   name="enterpriseSummary" class="spinner" style="width:410px;" readonly="readonly" >${enterpriseMemberData.enterpriseSummary}</textarea></td>
					</tr>
					   <tr>
					    <td>认证状态：</td>
						<td><input id="authState" name="authState" class="spinner" style="width:168px" value='${enterpriseMemberData.authState}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">认证人：</td>
						<td><input name="auditDisplay" class="spinner" style="width:168px" value="${enterpriseMemberData.auditDisplay}" readonly="readonly"/></td>
					 </tr>
					 <tr>
					    <td>认证时间：</td>
						<td><input  name="authTime" class="spinner" style="width:168px" value="<fmt:formatDate value='${enterpriseMemberData.authTime}' pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
					     <td style="padding-left:10px;">认证备注：</td>
						<td><input name="authRemark" class="spinner" style="width:168px" value="${enterpriseMemberData.authRemark}" readonly="readonly"/></td>
					  </tr>
			</table>
		</fieldset>
    </div> 
</form>

<script type="text/javascript">
	$('#member_mgr_member_form').tabs({
		border:true,
		onSelect:function(){
			$("div").remove(".validatebox-tip");//解决关闭窗体偶尔出现验证条bug
		}
	}); 
	$('#member_mgr_member_form_status').val(renderGridValue('${carrierMemberData.status}',fields.status));
	$('#member_mgr_member_form_memberType').val(renderGridValue('${carrierMemberData.memberType}',fields.memberType));
	$('#authState').val(renderGridValue('${enterpriseMemberData.authState}',fields.auditState));
	$('#auditStateOne').val(renderGridValue('${carrierMemberData.auditState}',fields.auditState)); 
</script>
