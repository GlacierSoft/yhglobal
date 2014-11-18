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
     <style>
      #tab{
         width: 480px;text-align: center;float: left;
      }
      
      
      .str{text-align: right;}
        
    </style>
   </head>
   <body>
         <!--belaidupDate-->
         
        <table id="tab">
            <tr>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">货物名称:</span></td>
               <td>${belaidupDate.belaidupProdName}</td>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">交易手机</span></td>
               <td>${belaidupDate.orderPhone }</td>
            </tr>
            <tr>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">起始站:</span></td>
               <td>${belaidupDate.belaidupInitiatin}</td>
                <td class="str" ><span class="label label-default" style="background-color: #F28041">加急配送</span></td>
                <td>${belaidupDate.yesOrNo=='yes'?'是':'否'}</td>
            </tr>  
            <tr >
               <td class="str" ><span class="label label-default" style="background-color: #F28041">终点站:</span></td>
               <td>${belaidupDate.belaidupTerminu}</td>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">取货方式</span></td>
               <td>${belaidupDate.replenishment=='storepickup'?'上门取货':'送货上门'}</td>
            </tr>
            <tr>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">货物类型:</span></td>
               <td>${belaidupDate.goodsTypeDisplay}</td>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">货物状态</span></td>
               <td>${belaidupDate.stauts=='enable'?'已发布':'已撤销' }</td>
            </tr>
           <tr>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">货物体积</span></td>
               <td>${belaidupDate.belaidupBulk}</td>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">货物重量</span></td>
               <td>${belaidupDate.belaidupWeight }</td>
            </tr>
        </table>
        
   </body>
</html>