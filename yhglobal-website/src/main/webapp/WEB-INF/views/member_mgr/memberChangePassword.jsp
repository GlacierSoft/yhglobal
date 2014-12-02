<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
%>
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
	   #tab{margin: 10px;}
      
      #tab td{
          padding: 16px;    
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
								<a data-toggle="collapse" data-toggle="collapse"
									data-parent="#accordion" href="#collapseOne"> 基本信息 </a>
							</h4>
						</div>
						<div id="collapseOne" class="panel-collapse collapse in">
							<div class="panel-body">
								<div class="btn-group-vertical">
									<ul class="nav nav-pills nav-stacked" id="u2"
										style="max-width: 300px; text-align: center;">
										<li><a href="${ctx}/member/index.htm"
											class="btn btn-default" role="button">会员信息</a></li>
										<li><a href="${ctx}/member/release.htm"
											class="btn btn-default" role="button">发布货源</a></li>
										<li><a
											href="${ctx}/member/releaseManager.htm?loanState=firstAudit&p=1"
											class="btn btn-default" role="button">货源管理</a></li>
										<li><a
											href="${ctx}/member/memberLetterStation.htm?loanState=firstAudit&p=1"
											class="btn btn-default" role="button">站内信</a></li>
										<li><a href="${ctx}/member/memberDetail.htm"
											class="btn btn-default" role="button">详细信息</a></li>
										<li><a href="${ctx}/member/memberPhotoInto.htm"
											class="btn btn-default" role="button">会员头像</a></li>
										<li class="active" style="width: 120px;"><a
											href="${ctx}/member/changeMemberPassword.htm"
											class="btn btn-info" role="button">修改密码</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-toggle="collapse"
									data-parent="#accordion" href="#collapseTwo"> 财务信息 </a>
							</h4>
						</div>
						<div id="collapseTwo" class="panel-collapse collapse">
							<div class="panel-body">
								<div class="btn-group-vertical">
									<ul class="nav nav-pills nav-stacked" id="u2"
										style="max-width: 300px; text-align: center;">
										<li><a href="${ctx }/member/rechargeWithdraw.htm?p=1"
											class="btn btn-default" role="button">充值提现</a></li>
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
								<a data-toggle="collapse" data-toggle="collapse"
									data-parent="#accordion" href="#collapseThree"> 统计信息 </a>
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
						<h3 class="panel-title">密码修改</h3>
					</div>
					<div class="panel-body">
						<div class="row" style="width: 70%; height: 300px; margin: 0 auto; border-radius: 5px;">
							<div class="panel panel-default">
								<div class="panel-body">
								    <table style="float: left;border-radius:5px;margin: auto;">
								        <tr>
								            <td><img src="${ctx}/resources/images/pwd/pwd.jpg" /></td>
								        </tr>
								    </table>
									<form action="">
										<table id="tab" style="margin: auto;float: left;">
											<tr>
												<td><span class="label label-default" style="background-color: #FF5400">输入旧密码:</span></td>
												<td><input type="password" class="form-control"  placeholder="请输入当前登录密码" name="oldPassword" id="oldPassword"></td>
											</tr>
											<tr>
												<td><span class="label label-default" style="background-color: #FF5400">输入新密码:</span></td>
												<td><input type="password" name="newPassword" class="form-control"  placeholder="请输入新登录密码" id="newPassword"></td>
											</tr>
											<tr>
												<td><span class="label label-default" style="background-color: #FF5400">重复新密码:</span></td>
												<td><input type="password" name="secondPassword" class="form-control"  placeholder="请确认新登录密码" id="secondPassword"></td>
											</tr>
											<tr>
												<td colspan="2" style="text-align: center;">
													<button type="button" class="btn btn-primary" style="width: 50px; height: 25px; padding-top: 2px;" onclick="doChange();">提交</button>
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
		<hr class="featurette-divider2">
	</div>
  <jsp:include page="../foot.jsp" />
<script>
	function doChange() {
		if ($("#oldPassword").val() == "") {
			doShowError("请填写当前密码,再做操作!");
		} else if ($("#newPassword").val() == "") {
			doShowError("请填写新密码,之后再做操作！")
		} else if ($("#secondPassword").val() == "") {
			doShowError("请确认密码之后在做操作!")
		} else {
			if ($("#newPassword").val() != $("#secondPassword").val()) {
				doShowError("密码认证错误，请重新填写！");
			} else {
				doCheck("你确定要修改修改登录密码?","${ctx}/memberPassword/changeLoginPwd.json");
			}
		}
	}
    //确认提示框
    function doCheck(str,url){
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
 					   data:{"oldPassword":$('#oldPassword').val(),"newPassword":$('#newPassword').val()},
 					   dataType:'json',
 					   success: function(r){
 						 if(r.success){
 							  doShowRight(r.msg);  
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
	
  //警告对话款
	function doShowError(str) {
		var d = art.dialog({
			title : '提示',
			content : str,
			fixed : true,
			lock : true,
			icon : 'error',
			background : "#E6E6E6",
			opacity : 0.4,
			okValue : '确定',
			ok : function() {
				this.close;
			}
		});
		d.show();
	}
	
	//警告对话款
	function doShowRight(str) {
		var d = art.dialog({
			title : '提示',
			content : str,
			fixed : true,
			lock : true,
			icon : 'succeed',
			background : "#E6E6E6",
			opacity : 0.4,
			okValue : '确定',
			ok : function() {
				this.close;
				window.location.href="${ctx}/logout.htm";
			}
		});
		d.show();
	}	
 	
</script>
</body>
</html>