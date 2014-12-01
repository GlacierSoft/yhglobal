<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>越海物流</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="inc.jsp"/>
	</head>
	<style type="text/css">
		body {
		    padding-top: 50px;
		}
		
		#tabsTemp td,th{
			text-align: center;
		}
		
	</style>
  <body>
  <jsp:include page="nav.jsp"/>

    <!-- Marketing messaging and featurettes ====================== -->
    <div class="container marketing">
    
	    <!-- Carousel ============================== -->
	    <div id="myCarousel" class="carousel slide" data-ride="carousel">
	      <!-- Indicators -->
	      <ol class="carousel-indicators">
	        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
	        <li data-target="#myCarousel" data-slide-to="1"></li>
	        <li data-target="#myCarousel" data-slide-to="2"></li>
	      </ol>
	      <div class="carousel-inner">
	        <div class="item active">
	          <img src="${pageContext.request.contextPath}/resources/images/index/1.jpg" alt="First slide">
	          <div class="container">
	            <div class="carousel-caption">
	            </div>
	          </div>
	        </div>
	        <div class="item">
	          <img src="${pageContext.request.contextPath}/resources/images/index/2.jpg" alt="Second slide">
	          <div class="container">
	            <div class="carousel-caption">
	            </div>
	          </div>
	        </div>
	        <div class="item">
	          <img src="${pageContext.request.contextPath}/resources/images/index/3.jpg" alt="Third slide">
	          <div class="container">
	            <div class="carousel-caption">
	            </div>
	          </div>
	        </div>
	      </div>
	      <a class="left carousel-control" href="#myCarousel" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
	      <a class="right carousel-control" href="#myCarousel" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
	    </div><!-- /.carousel -->

      <!-- Three columns of text below the carousel -->
      <div class="row">
      	<div class="col-lg-4">
          <img src="${pageContext.request.contextPath}/resources/images/index/5.jpg"  alt="Generic placeholder image">
          <h2>寄送货物</h2>
          <p>填写寄送货物的<br/>信息以及寄送地址等相关信息</p>
          <p><a class="btn btn-default" href="${ctx}/index.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img src="${pageContext.request.contextPath}/resources/images/index/4.jpg" alt="Generic placeholder image">
          <h2>订单查询</h2>
          <p>用户可根据得到的<br/>订单编号进行查询，及时跟踪货物信息</p>
          <p><a class="btn btn-default" href="${ctx}/index.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img src="${pageContext.request.contextPath}/resources/images/index/6.jpg"  alt="Generic placeholder image">
          <h2>网点查询</h2>
          <p>可查询本站各个地方的<br/>物流网点(储运仓库、流通仓库、中转仓库等)</p>
          <p><a class="btn btn-default" href="${ctx}/index.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->

	  <div class="row">
        <div class="col-md-4">
         	<div class="panel panel-primary">
                <div class="panel-heading">
					<h3 class="panel-title">物流百宝箱</h3>
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-4">
				          <img src="${pageContext.request.contextPath}/resources/images/index/box_icon1.png"  alt="Generic placeholder image">
				          <p>车辆追踪</p>
				        </div>
				        <div class="col-lg-4">
				          <img src="${pageContext.request.contextPath}/resources/images/index/box_icon3.png" alt="Generic placeholder image">
				          <p>发布货源</p>
				        </div>
				        <div class="col-lg-4">
				          <img src="${pageContext.request.contextPath}/resources/images/index/box_icon4.png"  alt="Generic placeholder image">
				          <p>查找物流</p>
				        </div>
					</div>
					<div class="row">
						<div class="col-lg-4">
				          <img src="${pageContext.request.contextPath}/resources/images/index/box_icon5.png"  alt="Generic placeholder image">
				          <p>查找车辆</p>
				        </div>
				        <div class="col-lg-4">
				          <img src="${pageContext.request.contextPath}/resources/images/index/box_icon2.png" alt="Generic placeholder image">
				          <p>三证查询</p>
				        </div>
				        <div class="col-lg-4">
				          <img src="${pageContext.request.contextPath}/resources/images/index/box_icon6.png"  alt="Generic placeholder image">
				          <p>查询运单</p>
				        </div>
					</div>
					<div class="row">
						<div class="col-lg-4">
				          <img src="${pageContext.request.contextPath}/resources/images/index/box_icon7.png"  alt="Generic placeholder image">
				          <p>查询信用</p>
				        </div>
					</div>
				</div>
            </div>
            <div class="panel panel-primary">
                <div class="panel-heading">
					<h3 class="panel-title">每日特价班线</h3>
				</div>
				<div class="panel-body">
				
					<p>广东省-珠海市-斗门区 &nbsp; <span class="glyphicon glyphicon-arrow-right"></span> &nbsp; 广东省-广州市-花都区</p>
					<p>广东省-珠海市-香洲区 &nbsp; <span class="glyphicon glyphicon-arrow-right"></span> &nbsp; 广东省-深圳市-宝安区</p>
					<br>
					<H2>￥0.45/公斤（9.7折）</H2>
					
				</div>
            </div>
            <div class="panel panel-primary">
                <div class="panel-heading">
					<h3 class="panel-title">最新公告</h3>
				</div>
				<div class="panel-body">
					<ul class="list-group">
					  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
					  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
					  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
					  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
					  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
					</ul>
				</div>
            </div>
         </div>
         <div class="col-md-8">
         	<div class="panel panel-primary">
                <div class="panel-heading">
					<h3 class="panel-title">班线列表</h3>
				</div>
				<div class="panel-body">

					<table class="table table-bordered" style="text-align: center;">
						<thead>
				          <tr>
						     <td width="100px"><b>编号</b></td>
						     <td><b>班线名称</b></td>  
						     <td><b>承运商</b></td>
						     <td><b>班线起点</b></td>
						     <td><b>班线终点</b></td>
						     <td><b>发布时间</b></td>
						     <td><b>操作</b></td>
						  </tr>
			            </thead> 
			        	<tbody>
			        	    <c:if test="${empty routerDatas.rows}">
									<tr>
						           		<td colspan="7" style="text-align:center;vertical-align: middle;"><strong style="color: #0697DA">暂无信息</strong></td>
						          	</tr>
							</c:if>
				        	<c:forEach items="${routerDatas.rows}" var="router"> 
						         <tr>
						            <td >${router.routeNumber}</td>
						            <td >${router.routeName}</td>
						            <td >${router.carrierDisplay}</td>
						            <td >${router.routeOrigin}</td>
						            <td >${router.routeStop}</td> 
						            <td ><fmt:formatDate value="${router.createTime}" type="both"/></td>
						          	<td >
						          	 <a href="#" onclick="doClick('${router.routerId}');"><font size="2" color="#0697DA">查看详细</font></a>
			                         <button type="button" onclick="send('${router.routerId}')" class="btn btn-warning">发货</button>
			                    	</td>
						          </tr>
					      	</c:forEach>   
						    <tr >
				            <th colspan="7"> 
				            	<div align="right"  >
								    <ul id='pageNews'></ul>
								</div> 
							</th>
				          </tr>
						 </tbody>
			        </table>
					
				</div>
            </div>
            
            <div class="panel panel-primary">
                <div class="panel-heading">
					<h3 class="panel-title">货物列表</h3>
				</div>
				<div class="panel-body">

					<table class="table table-bordered" style="text-align: center;">
						<thead>
								<tr>
									<th>发货地</th><th>货重</th>
									<th>车长</th><th>货物类型</th>
									<th>发布日期</th><th>操作</th>
								</tr>
							</thead>
							<c:forEach items="${belaidupList.rows}" var="belaidup" varStatus="status">
								<tr>
									<td width="300">${fn:replace(belaidup.belaidupInitiatin,'-','')}&nbsp;&nbsp;<img src="${ctx}/resources/images/delivery/lineIcon.gif">&nbsp;&nbsp;${fn:replace(belaidup.belaidupTerminu,'-','')}</td>
									<td>${belaidup.belaidupWeight}&nbsp;吨</td>
									<td>${belaidup.shorteslength}&nbsp;米</td><td>${belaidup.goodsTypeDisplay}</td>
									<td><fmt:formatDate value="${belaidup.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
									<td><a href="${ctx}/delivery/findGoodsDeailt.htm?&belaidupId=${belaidup.belaidupId}">详情</a>&nbsp;&nbsp;</td>
								</tr>
							</c:forEach>
							<c:if test="${empty belaidupList.rows}">
					        	<tfoot>
						          <tr>
						            <th colspan="8">
						            	<div align="right">
										    没有货物信息哦~~
										</div>
									</th>
						          </tr>
						        </tfoot>
					        </c:if>
			        </table>
					
				</div>
            </div>
            
            
         </div>
      </div>
      
      <hr class="featurette-divider2">
      <!-- /END THE FEATURETTES -->
      <!-- /.container -->
	  <!-- FOOTER -->
   </div>
   <jsp:include page="foot.jsp"/>
  </body>
</html>