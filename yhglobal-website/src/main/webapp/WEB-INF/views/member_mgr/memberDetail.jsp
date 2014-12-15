<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
%>

<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>越海物流</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="../inc.jsp"/>
	<style type="text/css">
		body {
		    padding-top: 100px;
		}
		#tableMobile td{
		  padding:30px;
		}
	</style>
  </head>
  <body>
  <jsp:include page="../nav.jsp"/>
       
	    <!-- CONTAINER START======================== -->
	    <div class="container">
	    <div class="row">
		   <div class="col-md-2">
	    		<div class="panel-group" id="accordion">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
					      	  基本信息
					        </a>
					      </h4>
					    </div>
					    <div id="collapseOne" class="panel-collapse collapse in">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					          <ul class="nav nav-pills nav-stacked" id="u2" style="max-width: 300px;text-align: center;">
						          <li><a href="${ctx}/member/index.htm" class="btn btn-default"  role="button">会员信息</a></li>
						          <li><a href="${ctx}/member/release.htm" class="btn btn-default" role="button">发布货源</a></li>
						          <li><a href="${ctx}/member/releaseManager.htm?loanState=firstAudit&p=1"  class="btn btn-default" role="button">货源管理</a></li>
						          <li><a href="${ctx}/member/memberLetterStation.htm?loanState=firstAudit&p=1" class="btn btn-default" role="button">站内信</a></li>
								  <li class="active" style="width: 120px;"><a href="${ctx}/member/memberDetail.htm" role="button"  class="btn btn-info">详细信息</a></li>
								  <li><a href="${ctx}/member/memberPhotoInto.htm" class="btn btn-default" role="button">会员头像</a></li>
								  <li><a href="${ctx}/member/changeMemberPassword.htm" class="btn btn-default" role="button">修改密码</a></li>
							  </ul>
							</div>
					      </div>
					    </div>
					  </div>
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
					         	财务信息
					        </a>
					      </h4>
					    </div>
					    <div id="collapseTwo" class="panel-collapse collapse">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					          <ul class="nav nav-pills nav-stacked" id="u2" style="max-width: 300px;text-align: center;">
							  <li><a href="${ctx }/member/rechargeWithdraw.htm?p=1" class="btn btn-default" role="button">充值提现</a></li>
						      <li><a href="${ctx }/member/memberFinance.htm?p=1" class="btn btn-default" role="button">资金记录</a></li>
							  <li><a href="${ctx}/member/changeChargePassword.htm" class="btn btn-default" role="button">交易密码修改</a></li>
							  </ul>
							</div>
					      </div>
					    </div>
					  </div>
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseThree">
					    	     统计信息
					        </a>
					      </h4>
					    </div>
					    <div id="collapseThree" class="panel-collapse collapse">
					      <div class="panel-body">
								<div class="btn-group-vertical">
									<ul class="nav nav-pills nav-stacked" id="u2"
										style="max-width: 300px; text-align: center;">
										<li style="width: 120px;"><a href="${ctx}/memberStatistics/memberStatistics.htm" class="btn btn-default" role="button">会员统计信息</a></li>
									</ul>
								</div>
							</div>
					  </div>
					</div>
				</div>
	    	</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">个人设置</h3>
				  </div>
				  <div class="panel-body">
				   <div class="bs-example bs-example-tabs">
				    <ul id="myTab" class="nav nav-tabs">
				        <li class="active"><a href="#finance" data-toggle="tab">详细信息</a></li>
				        <li><a href="#mobileChange" data-toggle="tab">手机设置</a></li>
				        <li><a href="#emailChange" data-toggle="tab">邮箱设置</a></li>
				      </ul>
				    <div id="myTabContent" class="tab-content">
				      <div class="tab-pane fade in active" id="finance">
			              <div class="row" style="width: 76%; margin: 0 auto; border-radius: 5px;">
			                <div class="panel panel-default" style="margin-top: 20px;">
							  <div class="panel-heading" style="color: #FF5400;background-color: #FF5400;color: white;height:30px;padding-top: 2px;">会员详情</div>
							  <div class="panel-body">
									<form id="personalMessageForm"  class=" form-horizontal" role="form"  method="post" >
								       	 <div class="tab-pane fade in active" id="tabPersonalBase">
									       <div class="form-group">
									  		  	<input type="hidden" class="form-control" id="memberId" name="memberId" value="${member.memberId}" >
											    <label for="memberRealName" class="col-sm-2 control-label">真实姓名:</label>
											    <div class="col-sm-4">
											      <input  class="form-control" maxlength="11" style="float: left;" name="memberRealName" id="memberRealName" value="${individuality.memberRealName}"  placeholder="请填写真实姓名" onkeyup='this.value=this.value.replace(/\D/gi,"")'>
											    </div>
											    <label for="educational" class="col-sm-2 control-label">省份证号:</label>
											    <div class="col-sm-4">
											      <input class="form-control" maxlength="11" style="float: left;" name="cardId" id="cardId" value="${individuality.cardId}"  placeholder="请填写省份证号" onkeyup='this.value=this.value.replace(/\D/gi,"")'>
											    </div>
											  </div>
											  <div class="form-group">
											  	<label for="mobileNumber" class="col-sm-2 control-label">手机变更:</label>
											    <div class="col-sm-4">
											      <input class="form-control" style="float: left;width:100px;" name="mobileNumber" id="mobileNumber" placeholder="手机号码" value="${individuality.mobileNumber }" readonly="readonly" >&nbsp;
											      <input type="button" value="获取验证码" id="btnSendCode" style="float: right;"  name="btnSendCode" class="btn btn-default" onclick="get_mobile_code();"/>
											    </div>
											    <label for="sex" class="col-sm-2 control-label">短信验证:</label>
											  	<div class="col-sm-4">
											      <input type="tel" class="form-control"  maxlength="6" id="mobileValidate"  name="mobileValidate" style="float: left;"  placeholder="手机短信验证码" >&nbsp;
											    </div>
											  </div>
											  <div class="form-group">
											  	<label for="educational" class="col-sm-2 control-label">住宅电话:</label>
											    <div class="col-sm-4">
											      <input  class="form-control" style="float: left;" name="homePhone" value="${individuality.homePhone}" placeholder="填写住宅电话(非必填项)" >
											    </div>
											    <label for="sex" class="col-sm-2 control-label">会员性别:</label>
											  	<div class="col-sm-4">
											       <select class="form-control col-sm-6" name="sex" id="sex" >
													  <option value="man">男</option>
													  <option value="woman">女</option>
													</select>
											    </div>
											  </div>
											  <div class="form-group">
											    <label for="educational" class="col-sm-2 control-label">QQ帐号:</label>
											    <div class="col-sm-4">
											      <input type="text" class="form-control" name="memberQq" value="${individuality.memberQq}" onkeyup='this.value=this.value.replace(/\D/gi,"")' placeholder="请填写会员QQ">
											    </div>
											    <label for="memberAge" class="col-sm-2 control-label">会员年龄:</label>
											    <div class="col-sm-4">
											      <input type="text" class="form-control" maxlength="3" name="memberAge" id="memberAge" value="${individuality.memberAge}" placeholder="会员年龄" onkeyup='this.value=this.value.replace(/\D/gi,"")'>
											    </div>
											  </div>
											  <div class="form-group">
											    <label for="detailedAddress" class="col-sm-2 control-label">详细地址:</label>
											    <div class="col-sm-10">
											      <textarea class="form-control" rows="3" name="detailedAddress" id="detailedAddress"   placeholder="现居住地址">${individuality.detailedAddress}</textarea>
											    </div>
											  </div>
										      <div class="form-group">
										        <div class="col-sm-offset-2 col-sm-10" style="text-align: center;">
										        <button type="submit" class="btn btn-primary btn-lg" style="width: 60px;height: 30px;padding-top: 2px;" >保  存</button>
										    </div>
										  	</div>
								       </div>
								      </form>  
					      		 </div>
					      	  </div>
			               </div>
				      </div><!-- 详情结束 -->
				      <div class="tab-pane fade" id="mobileChange">
				           <div class="row" style="width: 76%; margin: 0 auto; border-radius: 5px;">
				               <div class="panel panel-default" style="margin-top: 20px;">
								  <div class="panel-heading" style="color: #FF5400;background-color: #FF5400;color: white;height:30px;padding-top: 2px;">手机设置(修改/添加)</div>
								  <div class="panel-body">
								      <form id="updatePhoneForm" class="form-horizontal" role="form" method="post" >
									     <table id="tab" style="margin: auto;height: 250px;width:600px;" id="tableMobile">
											 <c:if test="${!empty individuality.mobileNumber}"> 
											    <tr>
												  <td><span class="label label-default" style="background-color: #FF5400">绑定手机:</span></td>
												  <td>
												      <input name="mobileCodeOld"  id="mobileCodeOld" value="${individuality.mobileNumber}" readonly="readonly" style="width: 220px;border-radius:3px;border: 1px solid #CCCCCC;" />
							               			  <input class="btn btn-default"  name="mobileCodeButton" id="mobileCodeButton" type="button" value=" 发送手机验证码 " onclick="doSendMobileCode();" >
												   </td>
											   </tr>
											   <tr>
												<td><span class="label label-default" style="background-color: #FF5400">手机号码:</span></td>
												<td>
												    <input class="form-control"  placeholder="输入新手机号码" name="mobileCodeOldNew" id="mobileCodeOldNew" style="width: 350px;" size="11" maxlength="11" onkeyup='this.value=this.value.replace(/\D/gi,"")'>
												</td>
											    </tr>
											 </c:if>
											 <c:if test="${empty individuality.mobileNumber}">
											   <td><span class="label label-default" style="background-color: #FF5400">绑定手机:</span></td>
												  <td>
												      <input type="text" name="mobileCodeOld" id="mobileCodeOld"  placeholder="输入要绑定的手机号码" style="width: 220px;border-radius:3px;border: 1px solid #CCCCCC;" size="11" maxlength="11" onkeyup='this.value=this.value.replace(/\D/gi,"")'/>
							               			  <input class="btn btn-default"  name="mobileCodeButton"  id="mobileCodeButton" type="button" value=" 发送手机验证码 " onclick="doSendMobileCode();">
												   </td>
											 </c:if>
											<tr>
												<td><span class="label label-default" style="background-color: #FF5400">手机验证:</span></td>
												<td><input  name="mobileCodeCheck" id="mobileCodeCheck" class="form-control"  placeholder="请输入手机验证码" id="newPassword" style="width: 350px;" size="6" maxlength="6" onkeyup='this.value=this.value.replace(/\D/gi,"")'></td>
											</tr>
											<tr>
												<td><span  class="label label-default" style="background-color: #FF5400">变更备注:</span></td>
												<td><input name="secondPassword" class="form-control"  placeholder="变更备注" id="secondPassword" style="width: 350px;"></td>
											</tr>
											<tr>
												<td colspan="2" style="padding-left: 200px;">
													<input type="button" class="btn btn-primary" style="width: 50px; height: 25px; padding-top: 2px;" onclick="MobileCodeChange();" value="提交">
													<button type="reset" class="btn btn-primary" style="width: 50px; height: 25px; padding-top: 2px;">重置</button>
												</td>
											</tr>
										</table>
									  </form>
								  </div>
								</div>
				           </div>
				      </div>
				      <div class="tab-pane fade" id="emailChange">
				      	   <div class="row" style="width: 76%; margin: 0 auto; border-radius: 5px;">
				               <div class="panel panel-default" style="margin-top: 20px;">
								  <div class="panel-heading" style="color: #FF5400;background-color: #FF5400;color: white;height:30px;padding-top: 2px;">邮箱设置</div>
								  <div class="panel-body">
								      <form id="updateEmailForm" class="form-horizontal" role="form" method="post" >
									     <table style="margin: auto;height: 250px;width:600px;" id="tableEmail">
									         <tr>
									            <td><span class="label label-default" style="background-color: #FF5400">当前邮箱:</span></td>
												<td>
												    <input value="${member.email}"  name="emailCodeOld" id="emailCodeOld"  readonly="readonly" style="width: 220px;border-radius:3px;border: 1px solid #CCCCCC;" />
							               			<input class="btn btn-default"  name="emailCodeButton" id="emailCodeButton" type="button" value=" 发送邮箱验证码 " onclick="doSendEmailCode();" >
												</td>
											</tr>
											 <tr>
												<td><span class="label label-default" style="background-color: #FF5400">邮箱绑定:</span></td>
												<td>
												    <input class="form-control"  placeholder="输入新绑定邮箱" name="emailCodeNew" id="emailCodeNew" style="width: 350px;">
												</td>
											    </tr>
											<tr>
												<td><span class="label label-default" style="background-color: #FF5400">邮箱验证:</span></td>
												<td><input  name="emailCodeCheck" id="emailCodeCheck" class="form-control"  placeholder="请输入邮箱验证码" id="newPassword" style="width: 350px;" size="6" maxlength="6" onkeyup='this.value=this.value.replace(/\D/gi,"")'></td>
											</tr>
											<tr>
												<td><span  class="label label-default" style="background-color: #FF5400">变更备注:</span></td>
												<td><input name="secondPassword" class="form-control"  placeholder="变更备注" id="secondPassword" style="width: 350px;"></td>
											</tr>
											<tr>
										     <td colspan="2" style="padding-left: 200px;">
													<input type="button" class="btn btn-primary" style="width: 50px; height: 25px; padding-top: 2px;" onclick="EmailCodeChange();" value="提交">
													<button type="reset" class="btn btn-primary" style="width: 50px; height: 25px; padding-top: 2px;">重置</button>
												</td>
											</tr>
									     </table>
									   </form>
								  </div>
								</div>
				           </div>
				       </div>
				      </div> 
				    </div><!-- /example -->
				  </div>
				</div>
	    	</div>
	    </div>
	   <jsp:include page="../foot.jsp"/>
	</body>
<script type="text/javascript"> 
    
	var countMail =60; //间隔函数，1秒执行 
	var curCountMail;//当前剩余秒数  
	var InterValObjMail;//记录定时器
	var validateNumbMail=false;//记录验证码发送次数
    //邮箱验证
    function doSendEmailCode(){
    	 curCountMail=countMail;
    	 validateNumbMail=true;
    	 $("#emailCodeButton").attr("disabled", "true");  
		 $("#emailCodeOld").css("width","200px");
		 $("#emailCodeButton").val("请在" + countMail + "秒内输入验证码");  
		 InterValObjMail = window.setInterval(SetRemainTimeMail, 1000); // 启动计时器，1秒执行一次 
    	 $.ajax({
			   type: "POST",
			   url: '${ctx}/memberDetail/sendMailCode.json',
			   dataType:'json',
			   success: function(r){
				 alert(r.msg);
			   }
 	     });
    }
	
	function SetRemainTimeMail(){
		if (curCountMail == 0) {
			window.clearInterval(InterValObjMail);// 停止计时器  
	        $("#emailCodeButton").removeAttr("disabled");// 启用按钮  
	        $("#emailCodeOld").css("width","200px");
	        $("#emailCodeButton").val("重新发送验证码"); 
	        $("#emailCodeCheck").val("");
	        validateNumbMail=false;
	    }else {  
	    	curCountMail--;
	       $("#emailCodeButton").val("请在" + curCountMail + "秒内输入验证码");  
	    }
	}
	
	//邮箱验证
    function EmailCodeChange(){
    	 var filter  = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    	  if(validateNumbMail){
    		   if($("#emailCodeNew").val()!=null&&$("#emailCodeNew").val()!=""){
    			   if(filter.test($("#emailCodeNew").val())){
    				    if($("#emailCodeCheck").val()!=null&&$("#emailCodeCheck").val()!=""){
    				    	 if($("#emailCodeCheck").val().length==6){
    				    		 var url="${ctx}/memberDetail/updateMail.json?email="+$("#emailCodeNew").val()+"&emailValidate="+$("#emailCodeCheck").val(); 
								 doMobileCheck("你确定要修改绑定邮箱?",url,'email'); 
    				    	 }else{
    				    		 doShowError("验证码填写错误,验证码长度为6位!!"); 
    				    	 }
    				    }else{
    				    	 doShowError("请填写邮箱验证码!"); 
    				    }
    			   }else{
    				   doShowError("请正确填写邮箱格式的邮箱!"); 
    			   }
    		   }else{
    			   doShowError("请填写需要绑定的邮箱!");
    		   }
    	  }else{
    		  doShowError("请填写邮箱验证码!");
    	  }
    }

  $("#personalMessageForm").validate({
         rules:{
        	 memberRealName:{
        		 required:true
        	 },
             cardId:{
        		 required:true,
        		 number:true
        	},
        	 mobileNumber:{
        		 required:true,
        		 number:true,
        		 isMobile:true
        	 },
        	 mobileValidate:{
        		 required:true,
        		 number:true,
        		 
        	 },
        	 homePhone:{
        		 isPhone:true 
        	 },
        	 sex:{
        	    required:true
        	 },
        	 memberQq:{
        		 required:true,
        		 number:true
        	},
        	 memberAge:{
        		required:true,
        		number:true,
        		min:18,
        		max:100
        	 },
        	 detailedAddress:{
        		 required:true
        	 }        	 
         },
         messages:{
        	 memberRealName:{
        		 required:"真实姓名不能为空！"
        	 },
        	 cardId:{
            	 required:"省份证不能为空！",
            	 number:"请正确填写身份证格式！ "
             },
        	 mobileNumber:{
        		 required:"身份证号不能为空！",
        		 number:"请正确填写手机号码格式",
        		 isMobile:"请正确填写手机号码格式"
        	 },
        	 mobileValidate:{
                  required:"请填写验证码",
                  number:"请正确填写验证码格式",
                  min:"验证码长度为6位",
                  max:"验证码长度为6位"
        	 },
        	 homePhone:{
        		   isPhone:"请正确电话格式！" 
        	 },
        	 memberQq:{
        		 required:"请填写QQ号码",
        		 number:'请正确填写QQ号码格式'
        	},
        	 memberAge:{
        		 required:"请填写会员年龄",
        		 number:'请填写正确格式',
        		 min:"最小年龄不低于18",
        		 max:"最大年龄不超过100"
        	 },
        	 detailedAddress:{
        		 required:"请填写详细地址"
        	 }
         },errorPlacement: function(error, element) {     
 			if (element.attr("name") == "mobileNumber" )  
		        error.insertAfter(element.next()); 
			else
				error.insertAfter(element); 
		  },
         submitHandler:function(){
        	if(validateNumb){
        		var d =art.dialog({
 		  		    title:'操作提示',
 		  		    fixed:true,
 		      	    lock: true,
 		      	    icon:'question',
 		      	    background:"#E6E6E6",
 		     		opacity:0.4,
 		  		    content: '你确定进行信息【保存】操作吗?',
 		  		    ok: function () {
 		  		    	$.ajax({
 				   				   type: "POST",
 				   				   url: ctx+"/memberDetail/addPro.json",
 				   				   dataType: "json",
 				   				   data:$("#personalMessageForm").serialize(),
 				    			   success: function(r) {
 				    				   window.clearInterval(InterValObj);// 停止计时器  
 							  	       $("#btnSendCode").removeAttr("disabled");// 启用按钮
 							  	       $("#mobileNumber").css("width","40px");
 							  	       $("#btnSendCode").val("重新发送验证码"); 
 							  	       mobile_code=0;
 							  	       validateNumb=false;
 							  	       if(r.success){
 							  	    	 $('#personalMessageForm')[0].reset();  
 							  	    	 doShow(r.msg); 	   
 							  	       }else{
 							  	    	 doShowError(r.msg);  
 							  	       }
 				    				 },
 				                    error: function() {
 				                    	doShowError("提交出错！"); 
 				                    }
 				   				});
 		  		    },
 		  		    cancel: function () {
 		  		        this.close();
 		  		    }
 		  		});
 		  		d.show(); 
            }else{
     		doShowError("请先获取验证码之后在做操作!");
     	  }
       } 	
    });
    
    
    var count =30; //间隔函数，1秒执行 
	var curCount;//当前剩余秒数  
	var InterValObj;//记录定时器
	var clickNumber=false;//记录验证码发送次数
	var validateNumb=false;//记录验证码发送次数
    
    function get_mobile_code(){
    	 curCount=count;
  	     validateNumb=true;
    	 if($("#mobileNumber").val()!=null&&$("#mobileNumber").val()!=""){
    		 if('${individuality.mobileNumber}'!=null&&'${individuality.mobileNumber}'!=""){
    			 $("#btnSendCode").attr("disabled", "true");  
        		 $("#mobileNumber").css("width","35px");
        		 $("#btnSendCode").val("请在" + curCount + "秒内输入验证码");  
            	 InterValObj = window.setInterval(SetRemainTime, 1000); // 启动计时器，1秒执行一次 
            	  $.post('<%=basePath%>resources/note/sms.jsp', {"mobile":'${individuality.mobileNumber}'}, function(msg) {
            			if(msg=='提交成功'){
            				//暂无响应事件
            		   }	
          		});  
    		 }else{
    			 $("#btnSendCode").attr("disabled", "true");  
            	 $("#mobileNumber").css("width","35px"); 
            	  $("#btnSendCode").val("请在" + curCount + "秒内输入验证码");  
            	  InterValObj = window.setInterval(SetRemainTime, 1000); // 启动计时器，1秒执行一次 
            	  $.post('<%=basePath%>resources/note/sms.jsp', {"mobile":$("mobileNumber").val()}, function(msg) {
            			if(msg=='提交成功'){
            				//暂无响应事件
            		   }	
          		});   
    		 }
    	 }else{
    		 doShowError("请先添加手机!"); 
    	 }
    }
	
	//手机绑定变更
     function doSendMobileCode(){
    	  curCount=count;
    	  clickNumber=true;
		  if('${individuality.mobileNumber}'!=null&&'${individuality.mobileNumber}'!=""){
			 $("#mobileCodeButton").attr("disabled", "true");  
     		 $("#mobileCodeOld").css("width","200px");
     		 $("#mobileCodeButton").val("请在" + curCount + "秒内输入验证码");  
         	 InterValObj = window.setInterval(SetRemainTimeChange, 1000); // 启动计时器，1秒执行一次 
         	  $.post('<%=basePath%>resources/note/sms.jsp', {"mobile":'${individuality.mobileNumber}'}, function(msg) {
         			if(msg=='提交成功'){
         				//暂无响应事件
         		   }	
       		});  
		  }else{
			if($("#mobileCodeOld").val()!=null&&$("#mobileCodeOld").val()!=""){
				var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
				if(mobile.test($("#mobileCodeOld").val())){
					$("#mobileCodeButton").attr("disabled", "true");  
		     		 $("#mobileCodeOld").css("width","200px");
		     		 $("#mobileCodeButton").val("请在" + curCount + "秒内输入验证码");  
		         	 InterValObj = window.setInterval(SetRemainTimeChange, 1000); // 启动计时器，1秒执行一次 
		         	  $.post('<%=basePath%>resources/note/sms.jsp', {"mobile":$("mobileCodeOld").val()}, function(msg) {
		         			if(msg=='提交成功'){
		         				//暂无响应事件
		         		   }	
		       		}); 
				}else{
					doShowError("请填入格式正确的手机号码!");
				}
			}else{
				doShowError("请填入需要绑定的手机号码!");
			}
		  }
		}
	
	
	//手机变更
	function MobileCodeChange(){
		var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
		if(clickNumber){
			if('${individuality.mobileNumber}'!=null&&'${individuality.mobileNumber}'!=""){
				if($("#mobileCodeOld").val()!=null&&$("#mobileCodeOld").val()!=""){
					  if($("#mobileCodeOldNew").val()!=null&&$("#mobileCodeOldNew").val()!=""){
						  if(mobile.test($("#mobileCodeOldNew").val())){
							  if($("#mobileCodeCheck").val()!=null&&$("#mobileCodeOldNew").val()!=""){
								  if($("#mobileCodeCheck").val().length==6){
									  var url="${ctx}/memberDetail/addPro.json?mobileNumber="+$("#mobileCodeOldNew").val()+"&mobileValidate="+$("#mobileCodeCheck").val(); 
									  doMobileCheck("你确定要修改绑定的手机?",url,'mobile');
								  }else{
									  doShowError("请填写验证码,验证码为任意随机数，且长度为6！");
								  }
							  }else{
								  doShowError("请填写验证码信息!");	 
							  }
						  }else{
							  doShowError("请正确填写需要绑定的手机号码格式");
						  }
					  }else{
						  doShowError("请填写需要绑定的手机号码");		  
					  }
				}else{
					
				}
		 }else{
			 if($("#mobileCodeOld").val()!=null&&$("#mobileCodeOld").val()!=""){
				 if(mobile.test($("#mobileCodeOld").val())){
					 if($("#mobileCodeCheck").val()!=null&&$("#mobileCodeOldNew").val()!=""){
						  if($("#mobileCodeCheck").val().length==6){
							var url="${ctx}/memberDetail/addPro.json?mobileNumber="+$("#mobileCodeOld").val()+"&mobileValidate="+$("#mobileCodeCheck").val();
							doMobileCheck("你确定要添加绑定手机?",url,'mobile');
						  }else{
							  doShowError("请填写验证码,验证码为任意随机数，且长度为6！");
						  }
					  }else{
						  doShowError("请填写验证码信息!");	 
					  }
				 }else{
					 doShowError("请正确填写绑定手机号码格式！");
				 }
			 }else{
				 doShowError("请填写需要绑定的手机号码！");
			 }
		 }
		}else{
			doShowError("请发送验证码之后在做操作!");
		}
	}
	
	
	//timer函数手机变更
	function SetRemainTimeChange(){
		if (curCount == 0) {
			window.clearInterval(InterValObj);// 停止计时器  
	        $("#mobileCodeButton").removeAttr("disabled");// 启用按钮  
	        $("#mobileCodeOld").css("width","200px");
	        $("#mobileCodeButton").val("重新发送验证码"); 
	        $("#mobileCodeCheck").val("");
	        clickNumber=false;
	    }else {  
	       curCount--;
	       $("#mobileCodeButton").val("请在" + curCount + "秒内输入验证码");  
	    }
	}
	
	//timer处理函数  
	function SetRemainTime() {  
		if (curCount == 0) {
			window.clearInterval(InterValObj);// 停止计时器  
	        $("#btnSendCode").removeAttr("disabled");// 启用按钮  
	        $("#mobileNumber").css("width","70px");
	        $("#btnSendCode").val("重新发送验证码"); 
	        $("#mobile_code").val("");
	        validateNumb=false;
	    }else {  
	     curCount--;
	     $("#btnSendCode").val("请在" + curCount + "秒内输入验证码");  
	    }  
	} 
   //提示对话款
    function doShowError(str){
   	 var d =art.dialog({
   		    title: '提示',
   		    content:str ,
   		    fixed:true,
         	    lock: true,
         	    icon:'error',
         	    background:"#E6E6E6",
        		opacity:0.4,
   		    okValue: '确定',
   		    ok: function () {
   		    	 this.close;
   		    }
   		});
   		d.show();
    } 
	 //提示对话款
    function doShow(str){
   	 var d =art.dialog({
   		    title: '提示',
   		    content:str ,
   		    fixed:true,
         	    lock: true,
         	    icon:'succeed',
         	    background:"#E6E6E6",
        		opacity:0.4,
   		    okValue: '确定',
   		    ok: function () {
   		    	 this.close;
   		    	 location.href="${ctx}/member/memberDetail.htm";
   		    }
   		});
   		d.show();
    }
	 
    //确认提示框
    function doMobileCheck(str,url,sign){
      var d =art.dialog({
   		    title:'操作提示',
   		    fixed:true,
       	    lock: true,
       	    icon:'question',
       	    background:"#E6E6E6",
      		opacity:0.4,
   		    content: str,
   		    ok: function () {
   		    	 $.ajax({
 					   type: "POST",
 					   url: url,
 					   dataType:'json',
 					   data:{"memberId":'${individuality.memberId}'},
 					   success: function(r){
 						  if(sign=="mobile"){
 							  window.clearInterval(InterValObj);// 停止计时器  
 							  $("#mobileCodeOld").css("width","200px");
 							  $("#mobileCodeButton").removeAttr("disabled");// 启用按钮  
 	 					      $("#mobileCodeButton").val("重新发送验证码"); 
 	 					      $("#mobileCodeCheck").val("");
 	 					      clickNumber=false; 
 						  }else{
 							  window.clearInterval(InterValObjMail);// 停止计时器  
							  $("#emailCodeOld").css("width","200px");
							  $("#emailCodeButton").removeAttr("disabled");// 启用按钮  
	 					      $("#emailCodeButton").val("重新发送验证码"); 
	 					      $("#emailCodeCheck").val("");
	 					     validateNumbMail=false;
 						  }
 						 if(r.success){
 							 doShow(r.msg);  
 						 }
 						 else{
 							doShowError(r.msg);
 						 }
 					   }
           	     });
   		    },
   		    cancel: function () {
   		        this.close();
   		    }
   		});
   		d.show(); 
    }
</script>
</html>
