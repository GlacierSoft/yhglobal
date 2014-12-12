<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
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
	</style>
  </head>
  <body>
<jsp:include page="../nav.jsp"/>
       
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
						         <li><a href="${ctx}/member/index.htm" class="btn btn-default" role="button">会员信息</a></li> 
						         <li><a href="${ctx}/member/release.htm" class="btn btn-default" role="button">发布货源</a></li>
						         <li><a href="${ctx}/member/releaseManager.htm?loanState=firstAudit&p=1"  class="btn btn-default" role="button">货源管理</a></li>
						         <li><a href="${ctx}/member/memberLetterStation.htm?p=1" class="btn btn-default" role="button">站内信</a></li>
						         <li class="active" style="width: 120px;"><a href="${ctx}/member/memberDetail.htm" class="btn btn-info" role="button">详细信息</a></li>
						         <li><a href="${ctx}/member/memberPhotoInto.htm" class="btn btn-default" role="button">会员头像</a></li>
						         <li><a href="#" class="btn btn-default" role="button">修改密码</a></li>
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
							  <li><a href="#" class="btn btn-default" role="button">交易密码修改</a></li>
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
					      	  <a href="#" class="btn btn-default" role="button">Content1</a>
					      	  <a href="#" class="btn btn-default" role="button">Content2</a>
					      	  <a href="#" class="btn btn-default" role="button">Content3</a>
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
				     
				     <!--企业会员详细信息  -->
				     <div class="tab-pane fade in active" id="finance">
				      <div class="row" style="width: 90%; margin: 0 auto; border-radius: 5px;margin-top: 25px;">
				       <div class="panel panel-default">
						  <div class="panel-heading" style="color: #FF5400;background-color: #FF5400;color: white;height:30px;padding-top: 2px;">企业会员详情</div>
						  <div class="panel-body">
						     <form id="enterPriseMessageForm"  class=" form-horizontal" role="form"  method="post" >     
					              <div class="form-group">
						  		  	<input type="hidden" class="form-control" id="memberId" name="memberId" value="${member.memberId}" >
								    <!-- 判断是按保存按钮还是保存并提交审核按钮 -->
								    <label for="enterpriseName" class="col-sm-2 control-label">企业名称:</label>
								    <div class="col-sm-4">
								      <input type="text" maxlength="8" class="form-control" id="enterpriseName" name="enterpriseName" value="${enterprise.enterpriseName}" onkeyup="value=value.replace(/[\d]/ig,'')"  placeholder="真实姓名" >
								     </div>
								    <label for="educational" class="col-sm-2 control-label">企业类型:</label>
								    <div class="col-sm-4">
								      <input type="tel"  class="form-control" maxlength="11" style="float: left;" name="enterpriseType" id="enterpriseType" value="${enterprise.enterpriseType}"  placeholder="请填写企业类型">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="enterpriseName" class="col-sm-2 control-label">法人代表:</label>
								    <div class="col-sm-4">
								      <input type="text" maxlength="8" class="form-control" id="deputy" name="deputy" placeholder="请填写法人代表"  value="${enterprise.deputy}">
								    </div>
								    <label for="educational" class="col-sm-2 control-label">企业性质:</label>
								    <div class="col-sm-4">
								      <input type="tel"  class="form-control" maxlength="11" style="float: left;" name="property" id="property" value="${enterprise.property}"  placeholder="请填写企业性质">
								    </div>
								  </div>
								  <div class="form-group">
									  	<label class="col-sm-2 control-label">手机变更:</label>
									    <div class="col-sm-4">
									      <input class="form-control" style="float: left;width:140px;" name="enterprisePhone" id="enterprisePhone" placeholder="手机号码" value="${enterprise.enterprisePhone }" readonly="readonly" >&nbsp;
									      <input type="button" value="获取验证码" id="btnSendCode" style="float: right;"  name="btnSendCode" class="btn btn-default" onclick="get_mobile_code();"/>
									    </div>
									    <label for="sex" class="col-sm-2 control-label">短信验证:</label>
									  	<div class="col-sm-4">
									      <input type="tel" class="form-control"  maxlength="6" id="mobileValidate"  name="mobileValidate" style="float: left;"  placeholder="手机短信验证码" onkeyup='this.value=this.value.replace(/\D/gi,"")' size="6" maxlength="6" >&nbsp;
									    </div>
								  </div>
								  <div class="form-group">
								    <label for="educational" class="col-sm-2 control-label">所属地区:</label>
								    <div class="col-sm-4">
								      <input type="tel"  class="form-control" maxlength="11" style="float: left;" name="area" id="area" value="${enterprise.area}"  placeholder="请填写所属地区">
								      <span id="areaSpan"></span>
								    </div>
								    <label for="enterpriseName" class="col-sm-2 control-label">所属行业:</label>
								       <div class="col-sm-4">
								      <input type="text" maxlength="8" class="form-control"  id="trade" name="trade" value="${enterprise.trade}" placeholder="请填写所属行业" >
								    </div>
								  </div>
								  
								  <div class="form-group">
								    <label for="educational" class="col-sm-2 control-label">企业传真:</label>
								    <div class="col-sm-4">
								      <input type="tel"  class="form-control" maxlength="11"  style="float: left;" name="enterpriseFax" id="enterpriseFax" value="${enterprise.enterpriseFax}"  placeholder="请填写企业传真" size="7" maxlength="7" onkeyup='this.value=this.value.replace(/\D/gi,"")'>
								    </div>
								   <label for="personalDes" class="col-sm-2 control-label">企业Logo:</label>
								    <div class="col-sm-4" style="float: left;">
										<input class="ke-input-text" type="text" name="enterpriseLogo" id="url" value="${enterprise.enterpriseLogo}" readonly="readonly" style="width:110px;"/>
										<input type="button" id="uploadButton" value="上传" style="background-color: #FF5400;color:white;"/>
										<img id="memberPhotoDivImg"  src="${enterprise.enterpriseLogo}" style="width: 50px;height: 50px ;margin-left: 20px;" />
								    </div> 
								  </div>
								  <div class="form-group">
								    <label for="detailedAddress" class="col-sm-2 control-label">详细地址:</label>
								    <div class="col-sm-10">
								      <textarea class="form-control" rows="3" name="detailedAddress" id="detailedAddress" placeholder="请填写详细地址">${enterprise.detailedAddress}</textarea>
								    </div>
								  </div>
					               <div class="form-group">
					    			<div class="col-sm-offset-2 col-sm-10" style="text-align: center;">
					      			    <input type="button" class="btn btn-primary" style="width: 70px; height: 30px; padding-top: 4px;" onclick="changeEntrpriseInfo();" value="提交">
					    			</div>
					  			</div>
						  </form>  
						  </div>
						</div>
				     </div>
				     </div>
				     <!-- 会员短信设置 -->
				     <div class="tab-pane fade" id="mobileChange">
				           <div class="row" style="width: 76%; margin: 0 auto; border-radius: 5px;">
				               <div class="panel panel-default" style="margin-top: 20px;">
								  <div class="panel-heading" style="color: #FF5400;background-color: #FF5400;color: white;height:30px;padding-top: 2px;">手机设置(修改/添加)</div>
								  <div class="panel-body">
								      <form id="updatePhoneForm" class="form-horizontal" role="form" method="post" >
									     <table id="tab" style="margin: auto;height: 250px;width:600px;" id="tableMobile">
											 <c:if test="${!empty enterprise.enterprisePhone}"> 
											    <tr>
												  <td><span class="label label-default" style="background-color: #FF5400">绑定手机:</span></td>
												  <td>
												      <input name="mobileCodeOld"  id="mobileCodeOld" value="${enterprise.enterprisePhone}" readonly="readonly" style="width: 220px;border-radius:3px;border: 1px solid #CCCCCC;" />
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
											 <c:if test="${empty enterprise.enterprisePhone}">
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
				     <!--会员邮箱设置  -->
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
				   </div>
				  </div>
				</div>
	    	</div>
	    </div>
	   </div>
	    <hr class="featurette-divider2">
	    <jsp:include page="../foot.jsp"/>
	</body>
<script type="text/javascript"> 

	var count =30; //间隔函数，1秒执行 
	var curCount;//当前剩余秒数  
	var InterValObj;//记录定时器
	var clickNumber=false;//记录验证码发送次数
	var validateNumb=false;//记录验证码发送次数

  function changeEntrpriseInfo(){
	   if(validateNumb){
		   if($("#mobileValidate").val()!=""&&$("#mobileValidate").val()!=null){
			   if($("#mobileValidate").val().length==6){
				   if($("#url").val()!=null&&$("#url").val()!=""){
					   $.ajax({
						   type: "POST",
						   url: ctx+"/memberDetail/addEnterPrise.json?mobileValidate="+$('#mobileValidate').val(),
						   dataType: "json",
						   data: $('#enterPriseMessageForm').serialize(),
						   success: function(data) {
							   window.clearInterval(InterValObj);// 停止计时器  
						  	   $("#btnSendCode").removeAttr("disabled");// 启用按钮
					  	       $("#enterprisePhone").css("width","110px");
						       $("#btnSendCode").val("重新发送验证码"); 
						       $("#mobileValidate").val("");
					  	       validateNumb=false;
					  	       count=30;
							    if(data.success){
							    	doShow(data.msg);
							    }else{
							    	doShowError(data.msg);
							    }   
							},
				        	error: function() {
				        		doShowError("提交出错！");
				        	}
						});   
				   }else{
					   doShowError("请上传企业LOGO图片!");  
				   }
				}else{
				   doShowError("验证码为长度为6的随机数，请合理填写!");  
			   }
			}else{
			   doShowError("请先填写手机验证码!");
		   }
		 }
	   else{
		   doShowError("请先发送手机验证码!"); 
	   }
	}
   
	//获取验证码
   function get_mobile_code(){
	   curCount=count;
	   validateNumb=true;
  	  if($("#enterprisePhone").val()!=null&&$("#enterprisePhone").val()!=""){
		   $("#btnSendCode").attr("disabled", "true");  
           $("#enterprisePhone").css("width","70px"); 
           $("#btnSendCode").val("请在" + curCount + "秒内输入验证码");  
           InterValObj = window.setInterval(SetRemainTime, 1000); // 启动计时器，1秒执行一次 
           $.post('<%=basePath%>resources/note/sms.jsp', {"mobile":$("enterprisePhone").val()}, function(msg) {
      			if(msg=='提交成功'){
      				//暂无响应事件
      		    }	
           });   
	  }else{
  		   doShowError("请先添加手机!"); 
  	  }
	}
	
     //timer处理函数  
	function SetRemainTime() {  
		if (curCount == 0) {
			window.clearInterval(InterValObj);// 停止计时器  
	        $("#btnSendCode").removeAttr("disabled");// 启用按钮  
	        $("#enterprisePhone").css("width","110px");
	        $("#btnSendCode").val("重新发送验证码"); 
	        $("#mobileValidate").val("");
	        validateNumb=false;
	    }else {  
	     curCount--;
	     $("#btnSendCode").val("请在" + curCount + "秒内输入验证码");  
	    }  
	} 
  
    //手机绑定变更
     function doSendMobileCode(){
    	  curCount=count;
    	  clickNumber=true;
		  if('${enterprise.enterprisePhone}'!=null&&'${enterprise.enterprisePhone}'!=""){
			 $("#mobileCodeButton").attr("disabled", "true");  
     		 $("#mobileCodeOld").css("width","200px");
     		 $("#mobileCodeButton").val("请在" + curCount + "秒内输入验证码");  
         	 InterValObj = window.setInterval(SetRemainTimeChange, 1000); // 启动计时器，1秒执行一次 
         	  $.post('<%=basePath%>resources/note/sms.jsp', {"mobile":'${enterprise.enterprisePhone}'}, function(msg) {
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
			if('${enterprise.enterprisePhone}'!=null&&'${enterprise.enterprisePhone}'!=""){
				if($("#mobileCodeOld").val()!=null&&$("#mobileCodeOld").val()!=""){
					  if($("#mobileCodeOldNew").val()!=null&&$("#mobileCodeOldNew").val()!=""){
						  if(mobile.test($("#mobileCodeOldNew").val())){
							  if($("#mobileCodeCheck").val()!=null&&$("#mobileCodeOldNew").val()!=""){
								  if($("#mobileCodeCheck").val().length==6){
									  var url="${ctx}/memberDetail/addEnterPrise.json?enterprisePhone="+$("#mobileCodeOldNew").val()+"&mobileValidate="+$("#mobileCodeCheck").val(); 
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
							var url="${ctx}/memberDetail/addEnterPrise.json?enterprisePhone="+$("#mobileCodeOld").val()+"&mobileValidate="+$("#mobileCodeCheck").val();
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
     
     //个人头像上传。
   KindEditor.ready(function(K) {
		var uploadbutton = K.uploadbutton({
			button : K('#uploadButton')[0],
			fieldName : 'imgFile',
			url : ctx+'/resources/js/kindeditor/jsp/upload_json.jsp?dir=image',
			afterUpload : function(data) {
				if (data.error === 0) {
					var url = K.formatUrl(data.url, 'domain');
					K('#url').val(url);
					$("#memberPhotoDivImg").attr("src",url);
				} else {
					alert(data.message);
				}
			},
			afterError : function(str) {
				alert('自定义错误信息: ' + str);
			}
		});
		uploadbutton.fileBox.change(function(e) {
			uploadbutton.submit();
		});
	});	
    
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
					   data:{"memberId":'${enterprise.memberId}'},
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