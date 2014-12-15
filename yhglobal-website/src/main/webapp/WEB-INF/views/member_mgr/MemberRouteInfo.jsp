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
     </style>
   </head>
   <body>
         <div class="container" >  
           <div class="row" style="margin-top: 15px;height: 65px;width:150px;float: left;"> 
            
                 <div style="background-color:#fffbe4;width:150px;height: 216px;float: left;" >
	                 <span style="color:#0697DA;padding-left: 5px" >起步价：<label id="qi" style="color: #FF7300"></label></span><br>
	                 <span style="color:#0697DA;padding-left: 5px">轻&nbsp;&nbsp;货：<label id="qing" style="color: #FF7300"></label></span><br>
	                 <span style="color:#0697DA;padding-left: 5px">重&nbsp;&nbsp;货：<label id="zhong" style="color: #FF7300"></label></span><br>
	                 <label style="width: 150px;border-bottom-style: solid;border-bottom-width: 2px;border-bottom-color: #669900"></label>
	                 <span style="color:#0697DA;padding-left: 5px">运输费：<label id="yun" style="color: #FF7300">0.00&nbsp;元</label></span><br>
	             	 <span style="color:#0697DA;padding-left: 5px">保险费：<label id="bao" style="color: #FF7300">0.00&nbsp;元</label></span><br>
	                 <span style="color:#0697DA;padding-left: 5px">合&nbsp;&nbsp;&nbsp;计：<label id="bao" style="color: #FF7300">0.00&nbsp;元</label></span><br>
                     <label style="width: 150px;border-bottom-style: solid;border-bottom-width: 2px;border-bottom-color: #669900"></label>
                </div> 
         </div>
          
          <div class="row" style="margin-top: 15px;height: 65px;width: 580px;float: left;margin-left: 15px;">
                 <div class="panel-body">
                <div style="width:550px;height: auto; float: left;margin-left: 10px;">
                 <div style="border: solid;border-width: 1px;border-color: #e7e5e5;height: auto">
                   <b style="margin-left: 10px">选择网点</b><label style="margin-left: 10px;color:#999">选择附近的网点，物流跟进更及时</label><br>
                    <div class="row" style="width:550px;"> 
				           <!-- 左边导航 -->
				          <div class="col-md-3" align="left">
				                                 发货网点：
					      </div> 
					      <div class="col-md-9" align="left">
				             <select class="form-control"  name="sendSite" onchange="selectDeliver()" id="sendSite">
							</select>
							<div id="info" style="color:#FF7300; "> </div>
					      </div> 
					</div>
					 <div class="row" style="width:550px;margin-top: 5px"> 
				             <!-- 左边导航 -->
				             <div class="col-md-3" align="center">
				              	收货网点：
					        </div> 
					      	<div class="col-md-9" align="left" style="margin-bottom: 5px">
				            <select class="form-control" name="orderSite" onchange="selectPickUp()"  id="orderSite">
							</select>
							<div id="infos" style="color:#FF7300"></div>
					       </div> 
					</div>    
			     </div>
                </div>
              </div>
          
          </div>
  </div> 
 </body>
 <script>
          
</script>
</html>