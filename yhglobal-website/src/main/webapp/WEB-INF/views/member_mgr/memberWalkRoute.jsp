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
      <div class="row" style="margin-top: 15px;height: 60px;background-color: #ddf0f9;width: 700px;"> 
           <div class="panel-body" style="height: 30px;">
               <!-- 左边导航 -->
             	<button type="button" class="btn btn-warning"  style="background-color: #FF5400;" >&nbsp;货源信息&nbsp;&nbsp;</button>
	      		<div style="float:right;">【 记录<font color="#FF7300">1</font>条会员信息】
               </div>
          </div>   
     </div>
    <div class="row" style="margin-top: 15px;padding-top:15px; height: 65px;width: 700px;">  
	    <table class="table table-hover" style="text-align: center;">
	    <thead  >
		    <tr align="center">  
			    <th style="text-align: center;">货源名</th> 
			    <th style="text-align: center;">货源类型</th>
			    <th style="text-align: center;">发货地址</th>
			    <th style="text-align: center;">收获地址</th>
			    <th style="text-align: center;">信息</th>
			     <th style="text-align: center;"></th>
		    </tr>
	    </thead>
	    <tbody>
	  	   <tr> 
	            <td style="padding-top: 23px">${belaidupDae.belaidupProdName}</td> 
	            <td style="padding-top: 23px">${belaidupDae.goodsTypeDisplay}</td>
	            <td style="color: #999;font-size: 3;padding-top: 15px">
	                 <font color="#FF5400">${belaidupDae.orderAddress}</font><br>
	                 <font color="#FF5400">【${belaidupDae.belaidupInitiatin}】 </font>                                     
	                                     
	            </td>
	            <td style="color: #999;font-size: 3;padding-top: 15px">
	                 <font color="#FF5400">${belaidupDae.sendAddress}</font><br>
	                 <font color="#FF5400">【${belaidupDae.belaidupTerminu}】 </font>                                     
	            </td>
	            <td style="color: #999;font-size: 3"> 
	                                         重量：<font color="#FF5400"><fmt:formatNumber value='${belaidupDae.belaidupWeight}' pattern='#,#00.00'/></font>KG<br>
	                                         体积：<font color="#FF5400"><fmt:formatNumber value='${belaidupDae.belaidupBulk}' pattern='#,#00.00'/></font>m&sup3;<br>
	            </td>
	          	<td style="padding-top: 18px">
	          	    <button type="button" class="btn btn-warning" style="background-color: #FF5400">配送中</button>
	             </td>
	          </tr>
	     	 </tbody>
	    </table> 
   </div>
  </div> 
  
   <div class="container" style="margin-top: 60px;">  
      <div class="row" style="margin-top: 15px;height: 65px;background-color: #ddf0f9;width: 700px;"> 
          <div class="panel-body" style="height: 30px;">
               <!-- 左边导航 -->
             	<button type="button" class="btn btn-warning"  style="background-color: #FF5400;" >&nbsp;班线信息&nbsp;&nbsp;</button>
	      		<div style="float:right;">【记录<font color="#FF7300">1</font>条班线信息】
               </div>
          </div>   
     </div>
    <div class="row" style="margin-top: 15px;padding-top:15px; height: 65px;width: 700px;">  
	    <table class="table table-hover" style="text-align: center;">
	    <thead  >
		    <tr align="center">  
			    <th style="text-align: center;">承运商</th> 
			    <th style="text-align: center;">班线类型</th>
			    <th style="text-align: center;">起/终点</th>
			    <th style="text-align: center;">运输时效</th>
			    <th style="text-align: center;">价格</th>
			     <th style="text-align: center;"></th>
		    </tr>
	    </thead>
	    <tbody>
	  	   <tr> 
	            <td style="padding-top: 23px">${router.carrierDisplay}</td> 
	            <td style="padding-top: 23px">
	                        <c:if test="${router.routeType eq 'landCarriage' }">
							              陆运
							  </c:if>   
							  <c:if test="${router.routeType eq 'seaTransportation'}">
							              海运
							  </c:if> 
							  <c:if test="${router.routeType eq 'air'}">
							              空运
						  </c:if>
	            
	            </td>
	            <td style="color: #999;font-size: 3;padding-top: 15px">从：<font color="FF5400">${router.routeOrigin}</font> <br>
	                                                  到：<font color="FF5400">${router.routeStop}</font>
	            </td>
	            <td style="color: #999;font-size: 3;padding-top: 15px" >
	                 <font color="#FF5400">${router.routeBytime}</font>小时<br>
	                                                    箱型：<font color="#FF5400">
	                           <c:if test="${router.boxType eq 'fullClosed' }">
							              全封闭
							  </c:if>   
							  <c:if test="${router.boxType eq 'semiClosed'}">
							              半封闭
							  </c:if> 
							  <c:if test="${router.routeType eq 'air'}">
							              平板
							  </c:if>                  
	                    </font> 
	            </td> 
	            <td style="color: #999;font-size: 3"> 
	                                         起步价：<font color="#FF5400"><fmt:formatNumber value='${router.startingPrice}' pattern='#,#00.00'/></font>元&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>
	                                         轻货价：<font color="#FF5400"><fmt:formatNumber value='${router.lightGoodsPrice}' pattern='#,#00.00'/></font>元/立方<br>
	                                         重货价：<font color="#FF5400"><fmt:formatNumber value='${router.weightGoodsPrice}' pattern='#,#00.00'/></font>元/公斤<br>
	            </td>
	          	<td style="padding-top: 18px">
	          	    <button type="button" class="btn btn-warning" style="background-color: #FF5400">已发货</button>
	             </td>
	          </tr>
	     	 </tbody>
	    </table> 
   </div>
  </div> 
   
   <script>
    </script>
  </body>
</html>