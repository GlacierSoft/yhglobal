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
						<div id="collapseOne" class="panel-collapse collapse">
							<div class="panel-body">
								<div class="btn-group-vertical">
									<ul class="nav nav-pills nav-stacked" id="u2"
										style="max-width: 300px; text-align: center;">
										<li style="width: 120px;"><a href="${ctx}/member/index.htm"
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
										<li><a href="${ctx}/member/changeMemberPassword.htm" class="btn btn-default" role="button">修改密码</a></li>
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
								<a data-toggle="collapse" data-toggle="collapse"
									data-parent="#accordion" href="#collapseThree"> 统计信息 </a>
							</h4>
						</div>
						<div id="collapseThree" class="panel-collapse in">
							<div class="panel-body">
								<div class="btn-group-vertical">
									<ul class="nav nav-pills nav-stacked" id="u2"
										style="max-width: 300px; text-align: center;">
										<li class="active" style="width: 120px;"><a href="${ctx}/memberStatistics/memberStatistics.htm" class="btn btn-info" role="button">会员统计信息</a></li>
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
						<h3 class="panel-title">会员信息统计</h3>
					</div>
					<div class="panel-body">
						<div class="row" style="height: 300px; margin: 0 auto; border-radius: 5px;">
							<div class="panel panel-default">
								<div class="panel-body">
									<table class="table table-bordered">
							          	<thead>
								          <tr>
								            <th colspan="8" style="text-align: center;" >会员信息统计</th>
								          </tr>
								        </thead>
							          	<tbody>
									          <tr>
									          	<td>交易成功次数</td>
									            <td>充值总金额</td>
									            <td>提现总金额</td>
									            <td>实际提现金额</td>
									            <td>获赔总金额</td>
									            <td>运输费总金额</td>
									            <td>保险费总金额</td>
									            <td>总费用金额</td>
									          </tr>
									          <tr>
									          	<td>${CountStatusData}次</td>
									            <td>￥<fmt:formatNumber value='${finaceMemberData.mrechageAdd}' pattern='#,#00.00'/></td>
									            <td>￥<fmt:formatNumber value='${withdrawMoneyData[0]}' pattern='#,#00.00'/></td>
									            <td>￥<fmt:formatNumber value='${withdrawReallyMoneyData[0]}' pattern='#,#00.00'/></td>
									            <td>￥<fmt:formatNumber value='${finaceMemberData.mrechargeMark}' pattern='#,#00.00'/></td>
									            <td>￥<fmt:formatNumber value='${CountTransportationData[0]}' pattern='#,#00.00'/></td>
									            <td>￥<fmt:formatNumber value='${CountInsuranceData[0]}' pattern='#,#00.00'/></td>
									            <td>￥<fmt:formatNumber value='${CountGoodsData[0]}' pattern='#,#00.00'/></td>
									          </tr>
								      	</tbody>
								      </table>
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
			doShowError("请填写当前登录密码,再做操作!");
		} else if ($("#newPassword").val() == "") {
			doShowError("请填写新登录密码,之后再做操作！")
		} else if ($("#secondPassword").val() == "") {
			doShowError("请确认登录密码之后在做操作!")
		} else {
			if($("#newPassword").val().length<5){
				doShowError("登录密码最低长度不少于6位,请重新设定！");
			}else if($("#newPassword").val().length>17){
				doShowError("登录密码最大长度不超过16位,请重新设定！");
			}else{
				if ($("#newPassword").val() != $("#secondPassword").val()) {
					doShowError("确认密码填写错误，请重新填写！");
				} else {
					doCheck("你确定要修改登录密码?","${ctx}/memberPassword/changeLoginPwd.json");
				}
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
				window.location.href="${ctx}/login.htm";
			}
		});
		d.show();
	}	
 	
</script>
</body>
</html>