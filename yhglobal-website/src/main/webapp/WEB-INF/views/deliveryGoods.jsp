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
	<jsp:include page="inc.jsp"/>
	<!-- Custom styles for this template -->
    
    <style type="text/css">
		body {
		    padding-top: 100px;
		}
	</style>
	</head>
  <body>
  <jsp:include page="nav.jsp"/>
             
    <!--大容器  -->         
    <Div class="Container">       
        <Div class="row">
           <Div class="col_md_2 ">
                
           </Div> 
           <Div class="col_md_10 ">
               
           </Div>       
        </Div>       
    </Div>     
  
  <jsp:include page="foot.jsp"/>
  <script type="text/javascript">
    
  </script>
  </body>
</html>

