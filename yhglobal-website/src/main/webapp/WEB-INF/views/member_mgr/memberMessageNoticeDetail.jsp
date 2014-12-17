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
     <style>
      #tab{
         width: 480px;text-align: center;float: left;
      }
      
      .str{text-align: right;}
      
      #tab{margin: 10px;}
      
      #tab td{
          padding: 5px;    
      }
      
      input{
         border: 1px solid white;
         padding :0px 5px;
         border-radius:5px;
      }
      
      textarea{
         border: 1px solid white;
         padding :0px 5px;
         border-radius:5px;
      }
      
     </style>
   </head>
   <body>
        <table id="tab">
            <tr>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">发件人:</span></td>
               <td><input value="${memberMessageNoticeDetailDate.senderDisplay}" readonly="readonly"> </td>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">收件人:</span></td>
               <td><input value="${memberMessageNoticeDetailDate.receiverDisplay }" readonly="readonly" ></td>
            </tr>
            <tr>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">类型:</span></td>
               <td><input value="${memberMessageNoticeDetailDate.lettertype=='system'?'系统信息':'账户信息'}" readonly="readonly" ></td>
                <td class="str" ><span class="label label-default" style="background-color: #F28041">状态:</span></td>
               <td><input value="${memberMessageNoticeDetailDate.letterstatus=='read'?'已读':'未读'}" readonly="readonly" ></td>
            </tr>  
            <tr >
                <td class="str" ><span class="label label-default" style="background-color: #F28041">标题:</span></td>
                <td><input value="${memberMessageNoticeDetailDate.title}" readonly="readonly" ></td>
                <td class="str" ><span class="label label-default" style="background-color: #F28041">时间:</span></td>
                <td><input value="<fmt:formatDate value="${memberMessageNoticeDetailDate.sendtime}" type="both"/>" readonly="readonly" ></td>
            </tr>
            <tr>
               
               <td class="str" ><span class="label label-default" style="background-color: #F28041">备注</span></td>
               <td colspan="3" style="text-align: center;">
                    	<textarea style="width:400px;height: 30px;" readonly="readonly" >${memberMessageNoticeDetailDate.remark}</textarea>
               </td>
            </tr>
            <tr>
               <td class="str" ><span class="label label-default" style="background-color: #F28041">正文:</span></td>
               <td colspan="3" style="text-align: center;">
                    	<textarea style="width:400px;height: 60px;" readonly="readonly" >${memberMessageNoticeDetailDate.content}</textarea>
               </td>
               
            </tr>
        </table>
        
   </body>
</html>