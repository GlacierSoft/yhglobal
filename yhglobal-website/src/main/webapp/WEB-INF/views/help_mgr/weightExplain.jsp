<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!-- 越海物流轻重货物标准说明页面 -->
<!DOCTYPE html>
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
       
	    <div class="container">
	  	<div class="row">
		    <div class="col-md-2">
			    <div class="panel-group" id="accordion">
				    <div class="panel panel-default">
				  		<div class="bs-example">
					      <ul class="nav nav-pills nav-stacked" style="max-width: 300px;">
					        <li ><a href="${ctx}/contrabandExplain.htm">禁运品说明</a></li> 
					         <li class="active"><a href="${ctx}/weightExplain.htm">轻/重货说明</a></li> 
					         <li ><a href="${ctx}/collectFees.htm">增值服务说明</a></li> 
					         <li><a href="${ctx}/insuranceExplain.htm">货运险承保说明</a></li> 
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
				    <h3 class="panel-title">轻重货物说明</h3>
				  </div>
				  <div class="panel-body">
			          <h2  align="center">轻重货物说明</h2> <br>
			          <font size="3" color="#FF7300"> 什么是轻货和重货? </font>
			          <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;物流公司在计算运费单价时的依据，如果根据体积折算的重量大于货物的实际重量，则该货物是轻货，计算运费时采用轻货单价。反之则是重货，计算运费时采用重货单价。如在托运棉花时，棉花的体积折算成的重量大于其实际的重量，计算运费时采用轻货单价。而在托运钢材时，货物体积折算的重量小于实际重量，计算运费时采用重货单价。                    
				</p><br>
				 <font size="3" color="#FF7300"> 运费计算规则：</font>
				 <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;如果货物的轻货单价*货物的体积大于货物的重货单价*货物的重量，则采用轻货单价，运费为轻货单价*体积。</p><br>
				<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;如果货物的轻货单价*货物的体积小于货物的重货单价*货物的重量，则采用重货单价，运费为重货单价*重量。</p><br>
				<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;此外，还要考虑最低一票的价格，即物流公司的底价。如果根据轻货单价和重货单价计算出来的费用都低于最低一票的费用，则按照最低一票费用收取运费。</p><br>
				<font size="3" color="#FF7300"> 举例：</font>
					<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;如果一件30公斤重体积为0.4方的货物，越海物流从北京到上海重货单价0.93元/公斤，轻货单价187元/立方。</p><br>
						<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;根据其重货单价计算，运费为：0.93元/公斤*30公斤=27.9元</p><br>
							<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;根据其重货单价计算，运费为：0.93元/公斤*30公斤=27.9元</p><br>
								<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;根据上述计算结果，根据轻货单价计算出的费用大于根据重货单价计算出的费用，且轻货费用大于最低一票费用（30元），则该票应该收取运费74.8元。</p><br>
				</div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    </div>
	    
	    <jsp:include page="../foot.jsp"/>
  </body>
</html>