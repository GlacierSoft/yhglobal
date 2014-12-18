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
      
      #tab{margin: 10px;}
      
      #tab td{
        
          padding: 5px;    
      }
      
      .str{text-align: right;}
      
       input{
         border: 1px solid white;
         border-radius:5px;
         padding-left :5px;
      }
        
    </style>
   </head>
   <body>
         <!--belaidupDate-->
         
        <table id="tab">
            <tr>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">货物名称:</span></td>
               <td><input value=" ${belaidupDate.belaidupProdName}" readonly="readonly"></td>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">交易手机:</span></td>
               <td><input value=" ${belaidupDate.membermobile }" readonly="readonly"></td>
            </tr>
            <tr>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">起始站点:</span></td>
               <td><input value="${belaidupDate.originationStation}" readonly="readonly"> </td>
                <td class="str" ><span class="label label-default" style="background-color: #F28041">加急配送:</span></td>
                <td><input value="${belaidupDate.belaidupUrgent=='yes'?'是':'否'}" readonly="readonly"></td>
            </tr>  
            <tr >
               <td class="str" ><span class="label label-default" style="background-color: #F28041">终点站点:</span></td>
               <td><input value="${belaidupDate.endStation}" readonly="readonly"> </td>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">取货方式:</span></td>
               <td><input value="${belaidupDate.receivcStyle=='storepickup'?'上门取货':'送货上门'}" readonly="readonly"></td>
            </tr>
            <tr>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">货物类型:</span></td>
               <td><input value="${belaidupDate.goodsTypeDisplay}" readonly="readonly"> </td>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">货物状态:</span></td>
               <td><input value=" ${belaidupDate.showStyle=='show'?'已发布':'未发布' }" readonly="readonly"></td>
            </tr>
           <tr>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">货物体积:</span></td>
               <td><input value="${belaidupDate.belaidupVolume}" readonly="readonly"> </td>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">货物重量:</span></td>
               <td><input value=" ${belaidupDate.belaidupWeight}" readonly="readonly"></td>
            </tr>
          </table>
   </body>
</html>