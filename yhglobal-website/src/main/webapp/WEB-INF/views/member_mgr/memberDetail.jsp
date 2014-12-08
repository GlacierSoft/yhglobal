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
							  <li><a href="#" class="btn btn-default" role="button">Content2</a></li>
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
				     <div id="myTabContent" class="tab-content">
				       	 <div class="tab-pane fade in active" id="tabPersonalDetails">
				       		<form id="personalMessageForm"  class=" form-horizontal" role="form"  method="post" onsubmit="return checkAll();">
						       <div class="tab-pane fade in active" id="tabPersonalBase">
							       	<br>
							        <blockquote>
								  		<p class="text-primary">* 为必填项，所有资料均会严格保密。*成为个体会员必填项。</p>
									</blockquote>
							  		  <div class="form-group">
							  		  	<input type="hidden" class="form-control" id="memberId" name="memberId" value="${member.memberId}" >
									    <!-- 判断是按保存按钮还是保存并提交审核按钮 -->
									    <input type="hidden" class="form-control" id="postAuth" name="postAuth" value="">
									    <label for="memberRealName" class="col-sm-2 control-label">*真实姓名:</label>
									    <div class="col-sm-4">
									      <input type="text" maxlength="8" class="form-control" onblur="checkMemberRealName();" id="memberRealName" name="memberRealName" value="${individuality.memberRealName}" onkeyup="value=value.replace(/[\d]/ig,'')"  placeholder="真实姓名" >
									      <span id="memberRealNameSpan"></span>
									    </div>
									    <label for="educational" class="col-sm-2 control-label">更换手机号码:</label>
									    <div class="col-sm-4">
									      <input type="tel"  class="form-control" maxlength="11" onblur="checkMobileNumber();" style="float: left;" name="mobileNumber" id="mobileNumber" value="${individuality.mobileNumber}"  placeholder="如不修改手机请保留为空" onkeyup='this.value=this.value.replace(/\D/gi,"")'>
									      <span id="mobileNumberSpan"></span>
									    </div>
									  </div>
									  <div class="form-group" >
									    <label for="mobileNumber" class="col-sm-2 control-label">*旧绑定邮箱:</label>
									    <div class="col-sm-4" style="width: 300px;float: left;">
									      <input type="tel"  class="form-control" style="width: 170px;float: left;" name="yanemail"  placeholder="如不修改请保留为空" >
									      	<button id="updatePhoneForm_form-group" type="submit" style="float: right;" disabled="disabled" class="btn btn-default">获取验证码</button>
									      <span id="mobileNumberSpan"></span>
					                 </div>
					                 <div class="form-group" style="float: left;width: 400px" >
									   <label for="mobileNumber" class="col-sm-2 control-label" style="float: left;width: 150px;margin-left: 38px" >*短信验证码:</label>
									      <div class="col-sm-4" style="float: left;">
									       	<input type="tel" class="form-control"  maxlength="6" style="width: 170px"  name="yz" id="yz"   placeholder="手机短信验证码" >
									      </div> 
									      </div>
									  </div>
									  <div class="form-group">
									  	<label for="educational" class="col-sm-2 control-label">更换绑定邮箱:</label>
									    <div class="col-sm-4">
									      <input type="tel"  class="form-control" style="float: left;" name="email" id="email" placeholder="新手机号码" >
									      <span id="mobileNumberSpan"></span>
									    </div>
									    <label for="sex" class="col-sm-2 control-label">性别:</label>
									  	<div class="col-sm-4">
									       <select class="form-control col-sm-6" name="sex" id="sex" >
											  <option value="man">男</option>
											  <option value="woman">女</option>
											  <option value="secret">保密</option>
											</select>
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="educational" class="col-sm-2 control-label">QQ:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" name="memberQq" id="memberQq" value="${individuality.memberQq}" onkeyup='this.value=this.value.replace(/\D/gi,"")' placeholder="会员QQ">
									    </div>
									    <label for="memberAge" class="col-sm-2 control-label">会员年龄:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" maxlength="3" name="memberAge" id="memberAge" value="${individuality.memberAge}" placeholder="会员年龄" onkeyup='this.value=this.value.replace(/\D/gi,"")'>
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="detailedAddress" class="col-sm-2 control-label">*详细地址:</label>
									    <div class="col-sm-10">
									      <textarea class="form-control" rows="3" onblur="checkLiveAddress();" name="detailedAddress" id="detailedAddress" value="${individuality.detailedAddress}"  placeholder="现居住地址"></textarea>
									      <span id="detailedAddressSpan"></span>
									    </div>
									  </div>
						       </div>
						    <!-- /example -->
						   <div class="form-group">
						    <div class="col-sm-2"></div>
						    <div class="col-sm-10">
						      <p class="text-warning">温馨提示:请确保您所填写的信息都是真实可靠的，一旦审核，如有发现虚假，将会审核失败！</p>
						    </div>
						  </div>
						    <div class="form-group">
						    <div class="col-sm-offset-2 col-sm-10" style="text-align: center;">
						      <button id="onlyPost" type="submit" class="btn btn-primary btn-lg" onclick="return checkAll();">保  存</button>
						      <!-- <button id="postAuthBut" type="submit" class="btn btn-primary btn-lg" onclick="return checkAll();">保存并提交审核</button> -->
						      <div style="float: right;margin-top: 10px;margin-right:300px;"><span id="tieshi"></span></div>
						    </div>
						  	</div>
						   </form>  
				       </div>
				     </div>
				   </div><!-- /example -->
				  </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    <jsp:include page="../foot.jsp"/>
	    <!-- CONTAINER START======================== -->
	    		 <div id="success_alert" style="width:100%;position: absolute;top:0px;z-index:5000;display: none;"> 
	      <div class="alert alert-success fade in">
	        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
	        <h4 style="text-align:center;"></h4>
	      </div> 
	    </div>
	    <div id="danger_alert" style="width:100%;position: absolute;top:0px;z-index:5000;display: none;"> 
	      <div class="alert alert-danger fade in">
	        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
	        <h4 style="text-align:center;"></h4>
	      </div> 
	    </div>
  </body>
<script type="text/javascript"> 
	    //禁用Enter键表单自动提交
	      document.onkeydown = function(event) {
	          var target, code, tag;
	          if (!event) {
	              event = window.event; //针对ie浏览器
	              target = event.srcElement;
	              code = event.keyCode;
	              if (code == 13) {
	                  tag = target.tagName;
	                  if (tag == "TEXTAREA") {
	                  	return true; 
	                  } else {
	                  	return false;
	                  }
	              }
	          }else {
	              target = event.target; //针对遵循w3c标准的浏览器，如Firefox
	              code = event.keyCode;
	              if (code == 13) {
	                  tag = target.tagName;
	                  if (tag == "INPUT") { 
	                  	return false;
	                  	
	                  	}else{ 
	                  		return true; 
	                  	} 
	              }
	          }
	      };

	    	  $("#personalMessageForm").validate({
	    		  rules:{
	      		  },
	      		  messages:{
	      		  },
	    		  submitHandler:function(){
	    			 $.ajax({
    				   type: "POST",
    				   url: ctx+"/member/editIndividuality.htm",
    				   dataType: "json",
    				   data: $("#personalMessageForm").serialize(),
	    			   success: function(r) { 
	   					 	notClonedialog(r);
	                    },
	                    error: function() {
	                        alert("提交出错！");
	                    }
			    	});
	    		  }
	    	  });
	      
	    /*-------------------------------------------------基本信息验证开始---------------------------------------------*/
	  	//验证所有
		function checkAll(){
			return checkMemberRealName()&&checkMobileNumber()&&checkLiveAddress();
		}
	    
		//真实姓名验证
	 	function checkMemberRealName(){
			var memberRealName = $("#memberRealName").val();
			if(memberRealName == ""){
				document.getElementById("memberRealNameSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>真实姓名不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("memberRealNameSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
	    
		//身份证验证
		function checkCardId(){
			var cardId = $("#cardId").val();
			if(cardId == ""){
				document.getElementById("cardIdSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>身份证号码不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("cardIdSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
		
		//身份证验证
		function checkMobileNumber(){
			var mobileNumber = $("#mobileNumber").val();
			if(mobileNumber == ""){
				document.getElementById("mobileNumberSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>手机号码不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("mobileNumberSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
	
		//居住地址验证
		function checkLiveAddress(){
			var detailedAddress = $("#detailedAddress").val();
			if(detailedAddress == ""){
				document.getElementById("detailedAddressSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>居住地址不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("detailedAddressSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
		
	   	//功能判断
	    function checksMember(memberId,url){
	    	$.ajax({
				   type: "POST",
				   url: ctx+"/member/judgeCheckMember.json",
				   dataType: "json",
				   data: 'memberId='+memberId,
			   success: function(r) {
				   successHint(r,url);
               },
               error: function() {
            	   location.href="${ctx}/login.htm";
               }
			});
	    }
	    
	    //充值提现判断
	    function checkRechargeWithdraw(memberId,url){
	    	$.ajax({
				   type: "POST",
				   url: ctx+"/financeMember/judgeCheckRechargeWithdraw.json",
				   dataType: "json",
				   data: 'memberId='+memberId,
			   success: function(r) {
				   successHint(r,url);
	            },
	            error: function() {
	            	location.href="${ctx}/login.htm";
	            }
			});
	    }
	    
	  	function successHint(data,url){
	  		//如果不存在，则转到借款页面
	  		if(data.success){
	    		window.location.href=url;
	    	}else{//如果存在，则提示错误信息
	    		KindEditor.ready(function(K) {
					var dialog = K.dialog({
				        width : 500,
				        title : "提示",
				        body : '<div style="margin:10px;"><strong>'+data.msg+'</strong></div>',
				        closeBtn : {
			                name : '关闭',
			                click : function(e) {
			                        dialog.remove();
			                        window.location.href="${ctx}/member/memberDetail.htm";
			                }
			        	},
				        yesBtn : {
			                name : '关闭',
			                click : function(e) {
			                	dialog.remove();
			                	window.location.href="${ctx}/member/memberDetail.htm";
			                }
				        }
					});
				});
	      	}
	    }
	    
	  	/*-------------------------------------------------基本信息验证结束---------------------------------------------*/
	   	//功能判断
	    function checksMember(memberId,url){
	    	$.ajax({
				   type: "POST",
				   url: ctx+"/member/judgeCheckMember.json",
				   dataType: "json",
				   data: 'memberId='+memberId,
			   success: function(r) {
				   successHint(r,url);
               },
               error: function() {
            	   location.href="${ctx}/login.htm";
               }
			});
	    }
	    
	    function successHint(data,url){
	  		//如果不存在，则转到借款页面
	  		if(data.success){
	    		window.location.href=url;
	    	}else{//如果存在，则提示错误信息
	    		KindEditor.ready(function(K) {
					var dialog = K.dialog({
				        width : 500,
				        title : "提示",
				        body : '<div style="margin:10px;"><strong>'+data.msg+'</strong></div>',
				        closeBtn : {
			                name : '关闭',
			                click : function(e) {
			                        dialog.remove();
			                        window.location.href="${ctx}/member/memberDetail.htm";
			                }
			        	},
				        yesBtn : {
			                name : '关闭',
			                click : function(e) {
			                	dialog.remove();
			                	window.location.href="${ctx}/member/memberDetail.htm";
			                }
				        }
					});
				});
	      	}
	    }
	    
	  	//通过设置这个隐藏文本的值来判断是保存按钮还是保存并提交审核按钮。进行相应的操作。
	    $('#postAuthBut').bind('click', function(){    
	    	$("#postAuth").val("postAuth");
	        }); 
	  	//通过判断是待审核或已审核，将表单改为只读状态。
		 if('${requestScope.infoAndWorAuthstr}' == 'infoAndWorRealOnly'){
			$("form[id='personalMessageForm'] input,textarea[id='remark']").prop("readonly", true);
			$("form[id='personalMessageForm'] select,button[id='onlyPost'],button[id='postAuthBut']").prop("disabled", true);
			$("button[id='onlyPost']").prop("disabled", true);
		} ;
	    
      	function addSecretSecuritydialog(data){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
					        title : '提示信息',
					        body : '<div style="margin:10px;"><strong>'+data.msg+'</strong></div>',
					        closeBtn : {
					                name : '关闭',
					                click : function(e) {
					                        dialog.remove();
					                }
					        },
					        yesBtn : {
					                name : '确定',
					                click : function(e) {
					                		dialog.remove();
					                		window.location.href="${ctx}/member/memberDetail.htm";
					                }
					        }
						});
			});
		}
      	function notClonedialog(msg){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
					        title : '提示信息',
					        body : '<div style="margin:10px;"><strong>'+msg.msg+'</strong></div>',
					        closeBtn : {
					                name : '关闭',
					                click : function(e) {
					                        dialog.remove();
					                }
					        },
					        yesBtn : {
					                name : '确定',
					                click : function(e) {
					                		dialog.remove();
					                }
					        }
						});
			});
		}
		
		
</script>
		

</html>
