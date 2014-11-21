<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.LockedAccountException"%>
<%@ page import="com.glacier.basic.exception.IncorrectCaptchaException"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>越海物流</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="../inc.jsp"/>
	<!-- Custom styles for this template -->
    
    <style type="text/css">
		body {
			padding-top: 75px;
		}
	</style>
	</head>
  <body>
  <jsp:include page="../nav.jsp"/>
             
    <!--大容器  -->         
     <div class="container">
         <div class="row">
         <div class="col-md-2">
              <!-- 左边导航 -->
		      <div class="panel-group" id="accordion" style="margin-left: 0px">
				    <div class="panel panel-default" >
				  		<div class="bs-example">
					      <ul class="nav nav-pills nav-stacked" id="u2" style="max-width: 300px;text-align: center;">
					        <li  class="active"><a href="#">发货模板管理</a></li> 
					      </ul>
				  	  </div>  
			        </div>
		            <div class="panel panel-default" style="margin-top: 20px">
						<img src="${pageContext.request.contextPath}/resources/images/newbie/about001.jpg" alt="联系我们">
					</div>
					<div class="panel panel-default" style="height: 255px">
						<img src="${pageContext.request.contextPath}/resources/images/index/weixin.jpg" width="163px" height="163" alt="联系我们">
						<p>扫描二维码关注越海物流微信，获取越海物流最新动态 </p>
					</div>
		      </div> 
         </div>
         <div class="col-md-10">
      	 <form action="" method="post" id="form_delivery">
                 <div class="panel panel-primary">
                    <div class="panel-heading">
    					<h3 class="panel-title">发货模板管理</h3>
  					</div>
					<div class="panel-body">
					      <table class="table table-bordered" style="text-align: left;">
							<thead>
								<tr>
									<th>模板名称</th><th>收货地</th>
									<th>发货地</th><th>货物信息</th>
									<th>车辆要求</th><th>创建时间</th>
									<th>操作</th>
								</tr>
							</thead>
							<c:forEach items="${templateList.rows}" var="getDatas" varStatus="status">
								<tr>
									<td>${getDatas.templatename}</td><td>${getDatas.receivingarea}</td>
									<td>${getDatas.deliveryarea}</td><td>${getDatas.belaidupprodname}</td>
									<td>${getDatas.lengthstart}米 - ${getDatas.lengthstop}米</td>
									<td><fmt:formatDate value="${getDatas.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
									<td><a href="#">查看详情</a>&nbsp;&nbsp;<a href="#">修改</a>&nbsp;&nbsp;<a href="#">删除</a></td>
								</tr>
							</c:forEach>
							<c:if test="${empty templateList.rows}">
					        	<tfoot>
						          <tr>
						            <th colspan="8">
						            	<div align="right">
										    您还未有添加发货模板哦~~
										</div>
									</th>
						          </tr>
						        </tfoot>
					        </c:if>
						</table>
					</div>
                 </div>
              </form>
            </div>  
        </div>
    </div>

   
   <jsp:include page="../foot.jsp"/>
   </body>
</html>

