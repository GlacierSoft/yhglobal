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
					      	  Titles Name
					        </a>
					      </h4>
					    </div>
					    <div id="collapseOne" class="panel-collapse collapse in">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					          <a href="${ctx}/member/index.htm" class="btn btn-default" role="button">Content1</a>
					          <a href="#" <%-- onclick="checkRechargeWithdraw('${currentMember.memberId}','${ctx}/financeMember/rechargeWithdraw.htm?p=1');" --%> class="btn btn-default" role="button">Content2</a>
					          <a href="${ctx}/member/memberAuth.htm?&p=0" <%-- onclick="checksMember('${currentMember.memberId}','${ctx}/member/memberAuth.htm?&p=0');" --%> class="btn btn-default" role="button">Content3</a>
					          <a href="${ctx}/messageNotice/intoMessageNotice.htm?&p=1" <%-- onclick="checksMember('${currentMember.memberId}','${ctx}/messageNotice/intoMessageNotice.htm?&p=1');" --%> class="btn btn-default" role="button">Content4</a>
							  <a href="${ctx}/member/memberDetail.htm" class="btn btn-info" role="button">会员信息详情</a>
							  <a href="${ctx}/member/memberPhotoInto.htm" <%-- onclick="checksMember('${currentMember.memberId}','${ctx}/member/memberPhotoInto.htm');" --%> class="btn btn-default" role="button">Content6</a>
							  <a href="${ctx}/member/memberEmail.htm" class="btn btn-default" role="button">Content7</a>
							</div>
					      </div>
					    </div>
					  </div>
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
					         	Titles Name Two
					        </a>
					      </h4>
					    </div>
					    <div id="collapseTwo" class="panel-collapse collapse">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
							  <a href="#" class="btn btn-default" role="button">Content1</a>
							  <a href="#" class="btn btn-default" role="button">Content2</a>
							  <a href="#" class="btn btn-default" role="button">Content3</a>
							</div>
					      </div>
					    </div>
					  </div>
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseThree">
					    	     Titles Name Three
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
								  		<p class="text-primary">* 为必填项，所有资料均会严格保密。*成为企业会员必填项。</p>
									</blockquote>
							  		  <div class="form-group">
							  		  	<input type="hidden" class="form-control" id="memberId" name="memberId" value="${member.memberId}" >
									    <!-- 判断是按保存按钮还是保存并提交审核按钮 -->
									    <input type="hidden" class="form-control" id="postAuth" name="postAuth" value="">
									    <label for="enterpriseName" class="col-sm-2 control-label">*企业名称:</label>
									    <div class="col-sm-4">
									      <input type="text" maxlength="8" class="form-control" onblur="checkEnterpriseName();" id="enterpriseName" name="enterpriseName" value="${enterprise.enterpriseName}" onkeyup="value=value.replace(/[\d]/ig,'')"  placeholder="真实姓名" >
									      <span id="enterpriseNameSpan"></span>
									    </div>
									    <label for="educational" class="col-sm-2 control-label">*企业类型:</label>
									    <div class="col-sm-4">
									      <input type="tel"  class="form-control" maxlength="11" onblur="checkEnterpriseType();" style="float: left;" name="enterpriseType" id="enterpriseType" value="${enterprise.enterpriseType}"  placeholder="请填写企业类型">
									      <span id="enterpriseTypeSpan"></span>
									    </div>
									  </div>
									  <!-- -------------------------------------------------------------------------- -->
									  <div class="form-group">
									    <label for="enterpriseName" class="col-sm-2 control-label">*法人代表:</label>
									    <div class="col-sm-4">
									      <input type="text" maxlength="8" class="form-control" onblur="checkDeputy();" id="deputy" name="deputy" value="${enterprise.deputy}" placeholder="请填写法人代表" >
									      <span id="deputySpan"></span>
									    </div>
									    <label for="educational" class="col-sm-2 control-label">*企业性质:</label>
									    <div class="col-sm-4">
									      <input type="tel"  class="form-control" maxlength="11" onblur="checkProperty();" style="float: left;" name="property" id="property" value="${enterprise.property}"  placeholder="请填写企业性质">
									      <span id="propertySpan"></span>
									    </div>
									  </div>
									  
									  <div class="form-group">
									      <span style="color:#F00;margin-left: 70px"> * 演示站点不发送短信验证</span>
									  </div>
									  <div class="form-group" >
									    <label for="enterpriseType" class="col-sm-2 control-label">*旧绑定邮箱:</label>
									    <div class="col-sm-4" style="width: 300px;float: left;">
									      <input type="tel"  class="form-control" style="width: 170px;float: left;" name="yanemail"  placeholder="如不修改请保留为空" >
									      	<button id="updatePhoneForm_form-group" type="submit" style="float: right;" disabled="disabled" class="btn btn-default">获取验证码</button>
									      <span id="enterpriseTypeSpan"></span>
					                 </div>
					                 <div class="form-group" style="float: left;width: 400px" >
									   <label for="enterpriseType" class="col-sm-2 control-label" style="float: left;width: 150px;margin-left: 38px" >*短信验证码:</label>
									      <div class="col-sm-4" style="float: left;">
									       	<input type="tel" class="form-control"  maxlength="6" style="width: 170px"  name="yz" id="yz"   placeholder="手机短信验证码" >
									      </div> 
									      </div>
									  </div>
									  <div class="form-group">
									  	<label for="educational" class="col-sm-2 control-label">更换绑定邮箱:</label>
									    <div class="col-sm-4">
									      <input type="tel"  class="form-control" style="float: left;" name="email" id="email" placeholder="新手机号码" >
									      <span id="enterpriseTypeSpan"></span>
									    </div>
									    <label for="educational" class="col-sm-2 control-label">*所属地区:</label>
									    <div class="col-sm-4">
									      <input type="tel"  class="form-control" maxlength="11" onblur="checkArea();" style="float: left;" name="area" id="area" value="${enterprise.area}"  placeholder="请填写所属地区">
									      <span id="areaSpan"></span>
									    </div>
									  </div>
									  
									  <div class="form-group">
									    <label for="enterpriseName" class="col-sm-2 control-label">*所属行业:</label>
									    <div class="col-sm-4">
									      <input type="text" maxlength="8" class="form-control" onblur="checkTrade();" id="trade" name="trade" value="${enterprise.trade}" placeholder="请填写所属行业" >
									      <span id="tradeSpan"></span>
									    </div>
									    <label for="educational" class="col-sm-2 control-label">*企业传真:</label>
									    <div class="col-sm-4">
									      <input type="tel"  class="form-control" maxlength="11" onblur="checkEnterpriseFax();" style="float: left;" name="enterpriseFax" id="enterpriseFax" value="${enterprise.enterpriseFax}"  placeholder="请填写企业传真">
									      <span id="enterpriseFaxSpan"></span>
									    </div>
									  </div>
									  
									  <div class="form-group">
									    <label for="educational" class="col-sm-2 control-label">企业电话:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" name="enterprisePhone" id="enterprisePhone" value="${enterprise.enterprisePhone}" onkeyup='this.value=this.value.replace(/\D/gi,"")' placeholder="请填写企业电话">
									    </div>
									    <%-- <label for="personalDes" class="col-sm-2 control-label">企业Logo:</label>
									    <div class="col-sm-4" style="float: left;">
											<input class="ke-input-text" type="text" name="enterpriseLogo" id="url" value="${enterprise.enterpriseLogo}" readonly="readonly" />
											<input type="button" id="uploadButton" value="上传"/>
									    </div> 
									    <div class="col-sm-6" id="memberPhotoDiv" style="border: 1px #DDDDDD;">
											<img id="memberPhotoDivImg"  src="${enterprise.enterpriseLogo}" style="width: 50px;height: 50px ;" />
										</div> --%>
									  </div>
									  <div class="form-group">
									    <label for="detailedAddress" class="col-sm-2 control-label">*详细地址:</label>
									    <div class="col-sm-10">
									      <textarea class="form-control" rows="3" onblur="checkLiveAddress();" name="detailedAddress" id="detailedAddress" value="${enterprise.detailedAddress}"  placeholder="请填写详细地址"></textarea>
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

	     /*  function updatesGo(){
	    	  $.ajax({
   			   type: "POST",
   			   url: ctx+"/member/editEnterprise.htm",
   			   dataType: "json",
   			   data: $("#personalMessageForm").serialize(),
   			   success: function(r) { 
   					 	notClonedialog(r);
                 },
                 error: function() {
                     alert("提交出错！");
                 }
   	    	});
	      } */
	    
	    /*-------------------------------------------------基本信息验证开始---------------------------------------------*/
	  	//验证所有
		function checkAll(){
			return checkEnterpriseName()&&checkEnterpriseType()&&checkDeputy()&&checkArea()&&updatesGo();
		}
	    
		//真实姓名验证
	 	function checkEnterpriseName(){
			var enterpriseName = $("#enterpriseName").val();
			if(enterpriseName == ""){
				document.getElementById("enterpriseNameSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>企业名称不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("enterpriseNameSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
		
	 	//法人代表验证
	 	function checkDeputy(){
			var enterpriseName = $("#deputy").val();
			if(enterpriseName == ""){
				document.getElementById("deputySpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>法人代表不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("deputySpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
		
		//企业性质验证
	 	function checkProperty(){
			var enterpriseName = $("#property").val();
			if(enterpriseName == ""){
				document.getElementById("propertySpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>企业性质不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("propertySpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
		
	 	//所属地区验证
	 	function checkArea(){
			var enterpriseName = $("#area").val();
			if(enterpriseName == ""){
				document.getElementById("areaSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>所属地区不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("areaSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
	 	
	 	//所属行业验证
	 	function checkTrade(){
			var enterpriseName = $("#trade").val();
			if(enterpriseName == ""){
				document.getElementById("tradeSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>所属行业不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("tradeSpan").innerHTML="";
				$("#tieshi").html("");
				return true;
			}
		}
	 	
	 	//企业传真验证
	 	function checkEnterpriseFax(){
			var enterpriseName = $("#enterpriseFax").val();
			if(enterpriseName == ""){
				document.getElementById("enterpriseFaxSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>企业传真不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("enterpriseFaxSpan").innerHTML="";
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
		function checkEnterpriseType(){
			var enterpriseType = $("#enterpriseType").val();
			if(enterpriseType == ""){
				document.getElementById("enterpriseTypeSpan").innerHTML="<font style='color: #F00;font-weight: bold;float:left;'>企业类型不能为空!</font>";
				$("#tieshi").html("<font style='color: #F00;font-weight: bold;float:left;'>还有必填信息为空，请填写!</font>");
				return false;
			}else{
				document.getElementById("enterpriseTypeSpan").innerHTML="";
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
	    
	  	$("#personalMessageForm").validate({
    		rules:{
    		},
    		messages:{
    		},
    		submitHandler:function(){
    			$.ajax({
    				   type: "POST",
    				   url: ctx+"/member/editEnterprise.htm",
    				   dataType: "json",
    				   data: $("#personalMessageForm").serialize(),
	    			   success: function(r) {
	    				   successAddBankCard(r); 
	                    },
	                    error: function() {
	                        alert("提交出错！");
	                    }
    			 });
    		}
    	});
	  	
	  	
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
