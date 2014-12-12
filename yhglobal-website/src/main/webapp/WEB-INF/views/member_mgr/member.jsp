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
						          <li class="active" style="width: 120px;"><a href="${ctx}/member/index.htm" class="btn btn-info" role="button">会员信息</a></li>
						          <li><a href="${ctx}/member/release.htm" class="btn btn-default" role="button">发布货源</a></li>
						          <li><a href="${ctx}/member/releaseManager.htm?loanState=firstAudit&p=1"  class="btn btn-default" role="button">货源管理</a></li>
						          <li><a href="${ctx}/member/memberLetterStation.htm?loanState=firstAudit&p=1" class="btn btn-default" role="button">站内信</a></li>
								  <li><a href="${ctx}/member/memberDetail.htm" class="btn btn-default" role="button">详细信息</a></li>
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
					      	  <a href="${ctx}/memberStatistics/memberStatistics.htm" class="btn btn-default" role="button">会员统计信息</a>
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
				    <h3 class="panel-title">我的个人信息</h3>
				  </div>
				  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
				     <table class="table" >
			            <tr><!-- style="width:100px;heigth:100px" -->
			              <td rowspan="5" >
			              <div style=" text-align:center;vertical-align: middle;">
			              <img src="${currentMember.memberPhoto}" style="width: 120px;height: 120px ;"/>
			              <a href="${ctx}/member/memberPhotoInto.htm" role="button"><p style="padding:10px;">更换头像</p></a>
			              </div>
			              </td>
			              <td>用户名：</td>
			              <td colspan="2">${currentMember.memberName}</td>
			            </tr>
			            <tr>
			              <td>注册时间：</td>
			              <td><fmt:formatDate value="${currentMember.registrationTime}" type="both"/></td>
			              <td>会员到期：</td>
			              <td><%-- <fmt:formatDate value="${currentMember.expireTime}" type="both"/> --%>待开通</td>
			            </tr>
			            <tr>
			              <td>会员积分：</td>
			              <td><%-- <fmt:formatNumber value='${currentMember.integral}' pattern='#,#00'/> --%>100</td>
			              <td>最后登录ip：</td>
			              <td>${currentMember.lastLoginIpAddress}</td>
			            </tr>
			            <tr>
			              <td>信誉度：</td>
			              <td>暂定</td>
			              <td>账户可用余额：</td>
			              <td>￥<%-- <fmt:formatNumber value='${currentMember.lastLoginTime}' pattern='#,#00.00'/> --%>0</td>
			            </tr>
			             <tr>
			              <td>个人统计:</td>
			              <td>发布&nbsp;10&nbsp;条货源记录，成交&nbsp;5&nbsp;条货源记录</td>
			              <td></td>
			              <td></td>
			            </tr>
			        </table>
			        <div style="border: 1px solid #DDDDDD;">
			        <div class="row" style="padding:10px;">
					  <div class="col-md-2 text-right"><img alt="" src="${ctx}/resources/images/member/wenxintisi.jpg"><span class="text-danger"><strong>温馨提示：</strong></span></div>
					  <div class="col-md-2"><span>未读站内信<a  href="#" onclick="doClick('messageNotice/intoMessageNotice.htm?&p=1','${currentMember.memberId}')" class="navbar-link"><span class="badge">8</span></a>封</span></div>
					 
					 </div>
			        </div>
			        <div style="margin:40px;text-align:center;vertical-align: middle;">
			        <table style="width:800px;padding: 10px;">
			        	<tr style="padding: 10px;">
			        		<td><img alt="" src="${ctx}/resources/images/member/chongzhi.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/daichu.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/zhaiquanzhuanrang.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/huankuan.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/daishoukuan.jpg"></td>
			        		<%-- <td><img alt="" src="${ctx}/resources/images/member/zijinliushui.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/jiekuan.jpg"></td> --%>
			        	</tr>
			        	<tr style="height:40px;margin: 10px;">
			        		<td><a href="${ctx}/member/rechargeWithdraw.htm?p=1" class="navbar-link"><span>我要充值</span></a></td>
			        		<td><a href="${ctx}/member/release.htm" class="navbar-link"><span>发布货源</span></a></td>
			        		<td><a href="${ctx}/orderQuery.htm?&p=1" class="navbar-link"><span>我的订单</span></a></td>
			        		<td><a href="${ctx}/member/releaseManager.htm?loanState=firstAudit&p=1"  class="navbar-link"><span>货源管理</span></a></td>
			        		<td><a href="${ctx}/member/changeMemberPassword.htm" class="navbar-link"><span>修改密码</span></a></td>
			        		<%-- <td><a href="#" onclick="checkRechargeWithdraw('${currentMember.memberId}','${ctx}/financeMember/rechargeWithdraw.htm?p=1');"  class="navbar-link"><span>车辆管理</span></a></td>
			        		<td><a href="${ctx}/borrow.htm" class="navbar-link"><span>查看档案</span></a></td> --%>
			        	</tr>
			        </table>
			        </div>
			       	<blockquote>
					       	<h5 class="text-danger"><strong>信息详情：</strong></h5>
					</blockquote>
					<c:if test="${currentMember.memberType == 'individuality'}">
						<table class="table table-bordered" style="padding: 10px;">
							<tr>
								<td><span>真实姓名：${individuality.memberRealName }</span></td>
								<c:if test="${currentMember.memberType == 'individuality'}">
									<td><span>会员类型：个体用户</span></td>
								</c:if>
								<c:if test="${currentMember.memberType == 'enterprise'}">
									<td><span>会员类型：企业用户</span></td>
								</c:if>
								<c:if test="${currentMember.status == 'enable'}">
									<td><span>会员状态：正常</span></td>
								</c:if>
								<c:if test="${currentMember.status == 'disable'}">
									<td><span>会员状态：冻结</span></td>
								</c:if>
							</tr>
							<tr>
								<td><span>年龄：${individuality.memberAge}</span></td>
								<c:if test="${individuality.sex == 'man'}">
									<td><span>性别：男</span></td>
								</c:if>
								<c:if test="${individuality.sex == 'woman'}">
									<td><span>性别：女</span></td>
								</c:if>
								<td><span>身份证：4********************4</span></td>
							</tr>
							<tr>
								
								<td><span>QQ：${individuality.memberQq }</span></td>
								<td><span>邮箱：${currentMember.email}</span></td>
								<td><span>手机：${individuality.mobileNumber }</span></td>
							</tr>
							<tr>
								<td colspan="3"><span>详细地址：${individuality.detailedAddress }</span></td>
							</tr>
						</table>
					</c:if>
					<c:if test="${currentMember.memberType == 'enterprise'}">
						<table class="table table-bordered" style="padding: 10px;">
							<tr>
								<td><span>企业名称：${enterprise.enterpriseName }</span></td>
								<td><span>企业类型：${enterprise.enterpriseType }</span></td>
								<td><span>企业状态：正常</span></td>
							</tr>
							<tr>
								<td><span>法人代表：${enterprise.deputy }</span></td>
								<td><span>所属地区：${enterprise.area }</span></td>
								<td><span>企业性质：${enterprise.property }</span></td>
							</tr>
							<tr>
								
								<td><span>所属行业：${enterprise.trade }</span></td>
								<td><span>企业标识：${enterprise.enterpriseName }</span></td>
								<td><span>企业传真：${enterprise.enterpriseFax }</span></td>
							</tr>
							<tr>
								<td><span>企业电话：${enterprise.enterprisePhone }</span></td>
							</tr>
							<tr>
								<td colspan="3"><span>企业地址：${enterprise.detailedAddress }</span></td>
							</tr>
						</table>
					</c:if>
			        <blockquote>
					       	<h5 class="text-danger"><strong>账户详情：</strong></h5>
					</blockquote>
					<table class="table table-bordered" style="padding: 10px;">
						<tr>
			        		<td colspan="3"><span><strong>账户总汇：</strong></span></td>
			        	</tr>
			        	<tr >
			        		<td><span>账户总额：￥<fmt:formatNumber value='1000' pattern='#,#00.00'/></span></td>
			        		<td><span>可用余额：￥<fmt:formatNumber value='1000' pattern='#,#00.00'/></span></td>
			        		<td><span>冻结金额：￥<fmt:formatNumber value='0' pattern='#,#00.00'/></span></td>
			        	</tr>
			        	<tr>
			        		<td><span>下单奖励：￥<fmt:formatNumber value='0' pattern='#,#00.00'/></span></td>
			        		<td><span>线下/线上冲值奖励：￥<fmt:formatNumber value='0' pattern='#,#00.00'/></span></td>
			        		<td><span>其它奖励：￥<fmt:formatNumber value='0' pattern='#,#00.00'/></span></td>
			        	</tr>
			        	<tr>
			        		<td colspan="3"><span><strong>订单总汇：</strong></span></td>
			        	</tr>
			        	<tr >
			        		<td><span>订单总额：￥<fmt:formatNumber value='0' pattern='#,#00.00'/></span></td>
			        		<td><span>订单本金：￥<fmt:formatNumber value='0' pattern='#,#00.00'/></span></td>
			        		<td><span>订单利润：￥<fmt:formatNumber value='0' pattern='#,#00.00'/></span></td>
			        	</tr>
			        	<tr>
			        		<td colspan="3"><span><strong>消费总汇：</strong></span></td>
			        	</tr>
			        	<tr >
			        		<td><span>停车消费：￥<fmt:formatNumber value='0' pattern='#,#00.00'/></span></td>
			        		<td><span>刷卡消费：￥<fmt:formatNumber value='0' pattern='#,#00.00'/></span></td>
			        		<td><span>其他消费：￥<fmt:formatNumber value='0' pattern='#,#00.00'/></span></td>
			        	</tr>
			        </table>
				  </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	   
	    </div>
	     <jsp:include page="../foot.jsp"/>
	     
	    <!-- CONTAINER START======================== -->
	    <script>
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
	    
	    //构建表单
		function doClick(url,str){
			// 创建Form  
			var form = $('<form></form>');  
			// 设置属性  
		    form.attr('action', '<%=basePath%>'+url);  
		    form.attr('method', 'post');  
		    // form的target属性决定form在哪个页面提交  (_self -> 当前页面 _blank -> 新页面)  
		    form.attr('target', '_self');  
		    // 创建Input  
		    var my_input = $('<input type="text" name="memberId" />');  
		    my_input.attr('value', str);  
		    // 附加到Form  
		    form.append(my_input);  
		    //表单的构建是否 完成
		    form.appendTo(document.body).submit();
		 }; 
	    </script>
</body>
</html>