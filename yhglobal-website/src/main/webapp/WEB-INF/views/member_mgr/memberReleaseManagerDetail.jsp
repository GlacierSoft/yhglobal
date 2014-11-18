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
    <title>冰川网贷平台</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="../inc.jsp"/>
   </head>
   <body>
         <!--belaidupDate-->
        <table>
            <tr>
               <td>货物名称:<td>
               <td>${belaidupDate.belaidupProdName}</td>
            </tr>
            <tr>
               <td>起始站:<td>
               <td>${belaidupDate.belaidupInitiatin}</td>
            </tr>  
            <tr>
               <td>终点站:<td>
               <td>${belaidupDate.belaidupTerminu}</td>
            </tr>
            <tr>
               <td>货物类型:<td>
               <td>${belaidupDate.goodsTypeDisplay}</td>
            </tr>
        </table>
        <hr/>
        <table>
            <tr>
               <td>交易手机</td>
               <td>${belaidupDate.orderPhone }</td>
               <td>加急配送</td>
               <td>${belaidupDate.yesOrNo}</td>
               <td>取货方式</td>
               <td>${belaidupDate.replenishment}</td>
            </tr>
            <tr>
               <td>货物数量</td>
               <td>${belaidupDate.belaidupStatus }</td>
               <td>货物体积</td>
               <td>${belaidupDate.belaidupBulk}</td>
               <td>货物重量</td>
               <td>${belaidupDate.belaidupWeight }</td>
            </tr>
        </table>
   </body>
</html>