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
						<td ><input name="creditLimit" class="spinner" style="width:168px" value="<fmt:formatNumber value="${carrierMemberData.creditLimit}" pattern="#,#00.00"/>" readonly="readonly"/></td>
						<td style="padding-left:10px;">配送成功次数：</td>
						<td ><input name="deliverSuccess" class="spinner" style="width:168px" value="${carrierMemberData.deliverSuccess}" readonly="readonly"/></td>
					 </tr>
					 
					 <tr>
						<td>配送失败次数：</td>
						<td ><input name="deliverFail" class="spinner" style="width:168px" value="${carrierMemberData.deliverFail}" readonly="readonly"/></td>
						<td style="padding-left:10px;">审核状态：</td>
						<td ><input id="auditState" name="auditState" class="spinner" style="width:168px" value="${carrierMemberData.auditState}" readonly="readonly"/></td>
					 </tr>
					 <tr>
						<td>审核人：</td>
						<td ><input name="auditDisplay" class="spinner" style="width:168px" value="${carrierMemberData.auditDisplay}" readonly="readonly"/></td>
						<td style="padding-left:10px;">审核时间：</td>
						<td ><input name="auditTime" class="spinner" style="width:168px"  value="<fmt:formatDate value="${carrierMemberData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
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
			<legend>个人信息</legend>  
			<table  class="detailtable">
					 <tr>
					    <td>性 别：</td>
						<td><input id="member_mgr_member_form_sex" name="sex" class="spinner" style="width:168px" value='${individualityMemberData.sex}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">年 龄：</td>
						<td><input name="memberAge" class="spinner" style="width:168px" value="${individualityMemberData.memberAge}" readonly="readonly"/></td>
					 </tr>
					  <tr>
					    <td>Q Q：</td>
						<td><input  name="memberQq" class="spinner" style="width:168px" value='${individualityMemberData.memberQq}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">邮 箱：</td>
						<td><input name="email" class="spinner" style="width:168px" value="${carrierMemberData.email}" readonly="readonly"/></td>
					
					  </tr>
					   <tr>
					    <td>真实姓名：</td>
						<td><input  name="memberRealName" class="spinner" style="width:168px" value='${individualityMemberData.memberRealName}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">身份证：</td>
						<td><input name="cardId" class="spinner" style="width:168px" value="${individualityMemberData.cardId}" readonly="readonly"/></td>
					 </tr>
					  <tr>
					    <td>住宅电话：</td>
						<td><input  name="homePhone" class="spinner" style="width:168px" value='${individualityMemberData.homePhone}' readonly="readonly"/></td>
					    <td style="padding-left:10px;">手机号：</td>
						<td><input name="mobileNumber" class="spinner" style="width:168px" value="${individualityMemberData.mobileNumber}" readonly="readonly"/></td>
					 </tr> 
					 <tr>
						<td>详细地址：</td>
						<td colspan="3"> <textarea   name="detailedAddress" class="spinner" style="width:435px;" readonly="readonly" >${individualityMemberData.detailedAddress}</textarea></td>
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
	
	$('#auditState').val(renderGridValue('${carrierMemberData.auditState}',fields.auditState));
	$('#member_mgr_member_form_status').val(renderGridValue('${carrierMemberData.status}',fields.status));
	$('#member_mgr_member_form_memberType').val(renderGridValue('${carrierMemberData.memberType}',fields.memberType));
	$('#member_mgr_member_form_sex').val(renderGridValue('${individualityMemberData.sex}',fields.sex));
</script>
