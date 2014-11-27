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
		ol, ul {
		    list-style: none outside none;
		    margin: 0;
    		padding: 0;
		}
		.IpNumber{
		  width: 260px;height: 40px;border-radius:5px;border: 1px solid #CCCCCC;
		}
		.BorrowAgreeDiv{
		  wdith:860px;margin-left: 60px;height: 20px;border: 0px solid red;line-height: 20px;font-size: 12px;
		}
		
		.table_one tr td{border:1px solid black;text-align: center;color: black;}
		
		.ManageMoneyDiv{width: 860px;margin-left: 60px;border: 0px solid red;font-size: 14px;margin-bottom: 20px;}
		
	</style>
  </head>
  <script type="text/javascript">
		$(function(){ 
			$("#u2").hide();
			$("#new").click(function(){ 
				//用于改变选择了的样式
				//$("li").removeClass("active");
				//$(this).parent().addClass("active"); 
				$("#u2").slideToggle("slow"); 
			});
		}); 
	</script>
  <body>
    <jsp:include page="../nav.jsp"/>
       
	    <div class="container">
	  	<div class="row">
		    <div class="col-md-2">
			    <div class="panel-group" id="accordion">
			    	<div class="panel panel-default">
				  		<div class="bs-example">
					      <ul class="nav nav-pills nav-stacked" style="max-width: 300px;">
					        <li><a href="${ctx}/aboutUs.htm" >公司简介</a></li>
					        <li><a href="${ctx}/announcement/announcement.htm?&p=1">网站公告</a></li>
						     <li><a href="${ctx}/hiring/hiring.htm?&p=1">招纳贤士</a></li>
					        <li><a href="${ctx}/contactUs.htm">联系我们</a></li>
					        <li><a href="${ctx}/others/otherAddress.htm">公司地图</a></li>
					        <li class="active"><a href="${ctx}/others/others.htm">其他业务</a></li>
					      </ul>
				  		</div>
				  	</div>
				  	<div class="panel panel-default">
				  		<div class="bs-example">
					      <ul class="nav nav-pills nav-stacked" style="max-width: 300px;">
					         <li><a href="#" id="new">新闻资讯>></a>
							   <ul class="nav nav-pills nav-stacked"   id="u2">
							       <li name="trade"><a href="${ctx}/news/news.htm?&p=1&type=trade">贸易新闻</a></li>
							       <li name="land"><a href="${ctx}/news/news.htm?&p=1&type=land">陆运新闻</a></li>
							       <li name="airlift"><a href="${ctx}/news/news.htm?&p=1&type=airlift">空运新闻</a></li>
							       <li name="sea"><a href="${ctx}/news/news.htm?&p=1&type=sea">海运新闻</a></li>
							    </ul>  
						    </li> 
					      </ul>
				  		</div>
				  	</div>
				  	<div class="panel panel-default">
						<img src="${pageContext.request.contextPath}/resources/images/newbie/about001.jpg" alt="联系我们">
					</div>
					<div class="panel panel-default">
						<img src="${pageContext.request.contextPath}/resources/images/index/weixin.jpg" width="163" height="163" alt="联系我们">
						<p>扫描二维码关注冰川越海物流微信，获取冰川越海物流最新动态 </p>
					</div>
			  	</div>
	  		</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">关于我们 /其他业务</h3>
				  </div>
				  <div class="panel-body">
				   <c:choose>
				      <c:when test="${str == 'IPNumber'}">  
				     	<div style="padding-top:10px;padding-bottom: 20px;">
				     	   <a id="repaymenting" href="${ctx}/others/others.htm?&str=IPNumber" class="btn btn-success" role="button">IP地址查询</a>
						   <a id="completed" href="${ctx}/others/others.htm?&str=TellNumber" class="btn btn-primary" role="button">手机号码查询</a>
						   <div style="width:920px;height:40px;border: 0px solid black;margin-top: 20px;line-height: 40px;">
						        <form action="${ctx}/others/FindIPAddress" method="Post" id="form_IpNUmber">
						            <label>IP地址 ： </label>
						            <input type="text"  id="IpNumber_one" name="IP" class="IpNumber" placeholder="请输入合法IP地址" value="${ResoutIP}">&nbsp;
						            <input type="button" id="IPNUmberCommit" class="btn btn-primary" value="查询">&nbsp;
						            <button class="btn btn-primary" id="CleanIPNumber">重置</button>&nbsp;
						        </form>
						   </div>
						   <div style="width:920px;height:30px;border: 0px solid black;margin-top: 25px;line-height: 30px;background-color: #F5F5F5;padding-left: 20px;">
						                                     查询结果：  
						             <c:if test="${Resout==null}">
						                 <input type="text" style="background: #F5F5F5;border: 0px;color: red;height: 30px;width: 250px;" value="暂无消息" readonly="readonly" id="IpNUmber_invest_First">
						             </c:if>
						             <c:if test="${Resout!=null}">
						                 <input type="text" style="background: #F5F5F5;border: 0px;color: red;height: 30px;width: 250px;" value="${Resout }" readonly="readonly" id="IpNumber_invest_Second">
						             </c:if>
						   </div>
						</div>
					 </c:when>
					 <c:when test="${str == 'TellNumber'}">  
				     	<div style="padding-top:10px;padding-bottom: 20px;">
				     	   <a id="repaymenting" href="${ctx}/others/others.htm?&str=IPNumber" class="btn btn-primary" role="button">IP地址查询</a>
						   <a id="completed" href="${ctx}/others/others.htm?&str=TellNumber" class="btn btn-success" role="button">手机号码查询</a>
						   <div style="width:920px;height:40px;border: 0px solid black;margin-top: 20px;line-height: 40px;">
						        <form action="${ctx}/others/FindTellAddress" method="post" id="form_mobile">
						            <label>请输入手机号 ： </label>
						            <input type="text"  id="TellNumberOne" name="mobileNumber" class="IpNumber" placeholder="请输入合法手机号" value="${ mobileNumber}" >&nbsp;
						            <input type="button" id="TellPhone_Commit" value="查询" class="btn btn-primary">&nbsp;
						            <button class="btn btn-primary" id="TellPhone_Clean" type="reset">重置</button>&nbsp;
						        </form>
						   </div>
						   <div style="width:920px;height:30px;border: 0px solid black;margin-top: 25px;line-height: 30px;background-color: #F5F5F5;padding-left: 20px;">
						                                     查询结果：
						                   <c:if test="${PhoneNumberAddress==null }">
						                    <input type="text" style="background: #F5F5F5;border: 0px;color: red;height: 30px;" value="暂无消息" readonly="readonly" id="Phone_Text"> 
						                   </c:if>
						                   <c:if test="${PhoneNumberAddress!=null }">
						                    <input type="text" style="background: #F5F5F5;border: 0px;color: red;height: 30px;width: 560px;" value="${PhoneNumberAddress}" readonly="readonly" id="Phone_Text_warn"> 
						                   </c:if>
						                
						   </div>
						</div>
					 </c:when>
					</c:choose>
				 </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    </div>
	    <jsp:include page="../foot.jsp"/>
<!-- 分页显示表格数据 -->
<script type="text/javascript">
       
       $(function(){
    	 //重置事件
    	  $("#CleanIPNumber").click(function(){
    		 $("#IpNumber_one").attr("value",""); 
    	  });
    	 $("#TellPhone_Clean").click(function(){
    		 $("#TellNumberOne").attr("value",""); 
    	 });
    	 
    	 //手机号验证
    	 $("#TellPhone_Commit").click(function(){
            var str=$("#TellNumberOne").val();
            if(str){
            	if(!(/^0?(13[0-9]|15[012356789]|18[0236789]|14[57])[0-9]{8}$/.test(str))){
            		$("#Phone_Text").val("手机号格式输入错误!!!");
            		$("#Phone_Text_warn").val("手机号格式输入错误!!!");
            	}else{
            		$("#form_mobile").submit();
            	}
            }else{
            	$("#Phone_Text").val("请正确填写手机号!!!");
            	$("#Phone_Text_warn").val("请正确填写手机号!!!");
            }
    	});
    	 //IP验证
    	 $("#IPNUmberCommit").click(function(){
    		 var str=$("#IpNumber_one").val();
    		 if(str){
    			 if(!(/^(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])\.(\d{1,2}|1\d\d|2[0-4]\d|25[0-5])$/.test(str))){
   				 $("#IpNUmber_invest_First").val("IP地址格式输入错误!!!");
   	    		 $("#IpNUmber_invest_Second").val("IP地址格式输入错误!!!");  
   			  }else{
   				$("#form_IpNUmber").submit();
   			  }
    		 }else{
    			 $("#IpNUmber_invest_First").val("请正确填写IP号!");
    			 $("#IpNUmber_invest_Second").val("请正确填写IP号!");
    		 }
    	 });
      }); 	 
</script>
</body>
</html>