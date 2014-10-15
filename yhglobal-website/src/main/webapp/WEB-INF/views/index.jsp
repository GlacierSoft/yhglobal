<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
          <p><a class="btn btn-default" href="${ctx}/borrowingProcess.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img src="${pageContext.request.contextPath}/resources/images/index/4.jpg" alt="Generic placeholder image">
          <h2>订单查询</h2>
          <p>用户可根据得到的<br/>订单编号进行查询，及时跟踪货物信息</p>
          <p><a class="btn btn-default" href="${ctx}/investmentProcess.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img src="${pageContext.request.contextPath}/resources/images/index/6.jpg"  alt="Generic placeholder image">
          <h2>网点查询</h2>
          <p>可查询本站各个地方的<br/>物流网点(储运仓库、流通仓库、中转仓库等)</p>
          <p><a class="btn btn-default" href="${ctx}/riskGuarantee.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->

 	  <%-- <h3>最新公告</h3>
      <div class="row featurette">
        <div class="col-md-12">
          <table class="table table-hover">
	      	<tbody>
	          	<c:forEach items="${announcementDatas.rows}" var="announcement" begin="0" end="4" step="1">
			          <tr>
			            <td class="col-md-8">${announcement.webAnnTheme}</td>
			            <td class="col-md-2"><fmt:formatDate value="${announcement.createTime}" type="both"/></td>
			          	<td class="col-md-2"><a href="${ctx}/announcement/announcementDetail.htm?&webAnnId=${announcement.webAnnId}">查看详细</a></td>
			          </tr>
		      	</c:forEach>
		    </tbody>
	      	<tfoot>
	          <tr>
	            <th colspan="3"><h4 align="center"><a  href="${ctx}/announcement/announcement.htm?&p=1" >查看更多网站公告 >></a></h4></th>
	          </tr>
	        </tfoot>
	      </table>
        </div>
      </div> --%>
      
      <!-- center-top -->
      <div style="width: 1170px;height: 360px;">
	      <!-- 企业与个体会员活跃显示 -->
	      <div class="panel panel-default" style="width: 230px;height: 350px;float: left;">
	      	 <div class="panel-body">
			   <div class="bs-example bs-example-tabs">
			   	<ul id="myTab" class="nav nav-tabs">
			   		<li class="active"><a href="#tabCompanyBase" data-toggle="tab">企业会员</a></li>
			   		<li><a href="#tabPersonalBase" data-toggle="tab">个体会员</a></li>
			   	</ul>
			   	<br>
			   	<div id="myTabContent" class="tab-content">
					<div class="tab-pane fade in active" id="tabCompanyBase">
				  		<table class="table" style="text-align: center;">
				  			<tr>
				  				<td>1</td><td>张三</td><td>100</td>
				  			</tr>
				  			<tr>
				  				<td>2</td><td>董喜超</td><td>90</td>
				  			</tr>
				  			<tr>
				  				<td>3</td><td>成龙</td><td>80</td>
				  			</tr>
				  		</table>
					</div>
					<div class="tab-pane fade" id="tabPersonalBase">
				  		<table class="table" style="text-align: center;">
				  			<tr>
				  				<td>1</td><td>李四</td><td>50</td>
				  			</tr>
				  		</table>
					</div>
				</div>
			   </div>
			 </div>
	      </div>
      
	      <!-- 运输介绍 -->
	      <div class="panel panel-default" style="height: 350px;width: 928px;float: left;margin-left: 10px;">
	      	 <div class="panel-body">
			   <div class="bs-example bs-example-tabs">
			   	<ul id="myTab" class="nav nav-tabs">
			   		<li class="active"><a href="#tabSeaCarriageBase" data-toggle="tab">海运</a></li>
			   		<li><a href="#tabAirTransportationBase" data-toggle="tab">空运</a></li>
			   		<li><a href="#tabHaulageBase" data-toggle="tab">陆运</a></li>
			   		<li><a href="#tabUtilityBase" data-toggle="tab">实用工具</a></li>
			   	</ul>
			   	<br>
			   	<div id="myTabContent" class="tab-content">
					<div class="tab-pane fade in active" id="tabSeaCarriageBase">
				  		<h2>海运 <small>海洋运输</small></h2>
				  		<p>
					  		海洋运输是国际贸易中最主要的运输方式，国际贸易总运量中的三分之二以上，
					  		我国绝大部分进出口货物，都是通过海洋运输方式运输的。海洋运输的运量大，海运费用低，航道四通八达，是其优势所在。
				  		</p>
				  		<h4>特点：</h4>
				  		<p>
					  		海洋运输避免额外费用的产生、免除重复报关的困扰以及避免二次查验的烦恼！
				  		</p>
				  		<h4>方式：</h4>
				  		<p>
					  		按照船舶的经营方式，海洋运输可分为班轮运输和租船运输。
				  		</p>
				  		<button type="button" class="btn btn-primary" style="float: right;margin-top: -10px;">进行海运</button>
					</div>
					<div class="tab-pane fade" id="tabAirTransportationBase">
				  		<h2>空运 <small>空中运输</small></h2>
				  		<p>
					  		一般是比较急用的货物，公路运输不能符合客户要求的时效的情况下客户会选择空运。空运以其迅捷，安全。
					  		准时的超高效率赢得了相当大的市场，大大缩短了交货期，对于物流供应链加快资金周转及循环起到了极大的促动作用。
					  		各大航空公司相继投入大量航班分取货运这块蛋糕。但空运相对海运成本较高。
				  		</p>
				  		<h4>特点：</h4>
				  		<p>
					  		空中运输运送速度快、不受地面条件影响以安全、准确与其他运输方式比航空运输的安全性较高，相对来说运费昂贵！
				  		</p>
				  		<h4>方式：</h4>
				  		<p>
					  		班机运输、包机运输、集中托运方式；航空急件传送、货到付款方式、航空运输方式等。
				  		</p>
				  		<button type="button" class="btn btn-primary" style="float: right;margin-top: -30px;">进行空运</button>
					</div>
					<div class="tab-pane fade" id="tabHaulageBase">
				  		<h2>陆运 <small>公路运输</small></h2>
				  		<p>
					  		由于公路运输网一般比铁路、水路网的密度要大十几倍，分布面也广，因此公路运输车辆可以“无处不到、无时不有”。
					  		公路运输在时间方面的机动性也比较大，车辆可随时调度、装运，
					  		各环节之间的衔接时间较短。尤其是公路运输对客、货运量的多少具有很强的适应性，
					  		汽车的载重吨位有小 (0.25t～1t左右)、有大(200t～300t左右)，既可以单个车辆独立运输，也可以由若干车辆组成车队同时运输，
				  		</p>
				  		<h4>特点：</h4>
				  		<p>
					  		机动灵活，适应性强；可实现“门到门”直达运输；在中、短途运输中，运送速度较快！
				  		</p>
				  		<h4>方式：</h4>
				  		<p>
					  		集装箱汽车运输，笨重物件运输，快件货物运输，出租汽车货运，搬家货物运输，危险货物运输。
				  		</p>
				  		<button type="button" class="btn btn-primary" style="float: right;margin-top: -30px;">进行陆运</button>
					</div>
					<div class="tab-pane fade" id="tabUtilityBase">
				  		
					</div>
				</div>
			   </div>
			 </div>
	      </div>
      </div>
      
      <!-- center-center -->
      <div style="width: 1170px;height: 360px;">
      	<!-- 站内消息 -->
      	<div class="panel panel-default" style="width: 230px;height: 350px;float: left;">
		  <div class="panel-heading">站内消息<a href="#" style="float: right;">更多</a></div>
		  <ul class="list-group">
			  <li class="list-group-item"><a href="#" title="物流公共信息平台资讯2012第十二期">物流公共信息平台资讯2012...</a></li>
			  <li class="list-group-item"><a href="#" title="物流公共信息平台资讯2012第十一期">物流公共信息平台资讯2012...</a></li>
			  <li class="list-group-item"><a href="#" title="物流公共信息平台资讯2012第十期">物流公共信息平台资讯2012...</a></li>
			  <li class="list-group-item"><a href="#" title="物流公共信息平台资讯2012第九期">物流公共信息平台资讯2012...</a></li>
			  <li class="list-group-item"><a href="#" title="物流公共信息平台资讯2012第八期">物流公共信息平台资讯2012...</a></li>
		  </ul>
		</div>
		
		<!-- 最新成功交易信息 -->
		<div class="panel panel-default" style="width: 928px;height: 350px;float: left;margin-left: 10px;">
			<div class="panel-heading">最新交易成功信息</div>
			<table class="table table-bordered" style="text-align: center;">
				<thead>
		          <tr>
		            <th>会员名称</th>
		            <th>货物价格</th>
		            <th>货物数量</th>
		            <th>状态</th>
		            <th>起始站</th>
		            <th>终点站</th>
		            <th>交易成功时间</th>
		          </tr>
	        	</thead>
	        	<tbody>
	        		<tr>
	        			<td>张三</td><td>120000$</td>
	        			<td>100</td><td>交易成功</td>
	        			<td>广东</td><td>北京</td>
	        			<td>2014-10-31</td>
	        		</tr>
	        	</tbody>
	        	<tfoot>
		          <tr>
		            <th colspan="7"><h4 align="center"><a  href="#" >查看更多成功交易信息 >></a></h4></th>
		          </tr>
		        </tfoot>
			</table>
		</div>
      </div>
      
      <!-- center-buttom -->
      <div style="width: 1170px;">
      	<!-- 交易中心 -->
      	<div class="panel panel-default" style="width: 575px;height: 500px;float: left;">
			<div class="panel-heading">交易中心</div>
			<div class="bs-example bs-example-tabs">
			   	<ul id="myTab" class="nav nav-tabs">
			   		<li class="active"><a href="#tabSupplyBase" data-toggle="tab">供应信息</a></li>
			   		<li><a href="#tabBuyBase" data-toggle="tab">求购信息</a></li>
			   	</ul>
			   	<br>
			   	<div id="myTabContent" class="tab-content">
					<div class="tab-pane fade in active" id="tabSupplyBase">
				  		<table class="table" style="text-align: left;">
				  			<tbody>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-30</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-29</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-28</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-27</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-26</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-26</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-26</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-26</td>
				  				</tr>
				  			</tbody>
				  			<tfoot>
					          <tr>
					            <th colspan="7"><h4 align="center"><a  href="#" >查看更多供应信息 >></a></h4></th>
					          </tr>
					        </tfoot>
				  		</table>
					</div>
					<div class="tab-pane fade" id="tabBuyBase">
				  		<table class="table" style="text-align: left;">
				  			<tbody>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-30</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-29</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-28</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-27</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-26</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-26</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-26</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-26</td>
				  				</tr>
				  			</tbody>
				  			<tfoot>
					          <tr>
					            <th colspan="7"><h4 align="center"><a  href="#" >查看更多求购信息 >></a></h4></th>
					          </tr>
					        </tfoot>
				  		</table>
					</div>
				</div>
			   </div>
		</div>
		
		<!-- 物流招标投标 -->
		<div class="panel panel-default" style="width: 580px;height: 500px;float: left;margin-left: 10px;">
			<div class="panel-heading">物流招标投标</div>
			<div class="bs-example bs-example-tabs">
			   	<div id="myTabContent" class="tab-content">
			  		<table class="table" style="text-align: left;">
			  			<tbody>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">·两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  			</tbody>
				  			<tfoot>
					          <tr>
					            <th colspan="7"><h4 align="center"><a  href="#" >查看更多物流招标投标信息 >></a></h4></th>
					          </tr>
					        </tfoot>
			  		</table>
				</div>
		    </div>
		</div>
      </div>
      
      <div style="width: 1170px;">
      	<!-- 政府 -->
		<div class="panel panel-default" style="width: 575px;height: 350px;float: left;">
			<div class="panel-heading">政府</div>
			<div class="bs-example bs-example-tabs">
			   	<div id="myTabContent" class="tab-content" style="margin-top: 10px;height: 130px;">
			  		<img src="asdasd/asd" style="float: left;margin-left: 10px;" width="120" height="120" >
			  		<div class="tab-content" style="float: left;width: 420px;margin-left: 10px;">
			  			<p><a href="#">国家将建立兼顾基本生活和资源节约</a></p>
			  			  国家发展和改革委员会主任徐绍史30日表示，为减少资源价格改革对居民生活的影响，对居民...
			  		</div>
				</div>
				<div style="border-bottom: 1px dashed #aaccee;margin-left: 10px;"></div>
				<ul class="list-group">
				  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
				  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
				  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
				  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
				  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
				</ul>
		    </div>
		</div>
		
		<!-- 园区 -->
		<div class="panel panel-default" style="width: 580px;height: 350px;float: left;margin-left: 10px;">
			<div class="panel-heading">园区</div>
			<div class="bs-example bs-example-tabs">
			   	<div id="myTabContent" class="tab-content" style="margin-top: 10px;height: 130px;">
			  		<img src="asdasd/asd" style="float: left;margin-left: 10px;" width="120" height="120" >
			  		<div class="tab-content" style="float: left;width: 420px;margin-left: 10px;">
			  			<p><a href="#">国家将建立兼顾基本生活和资源节约</a></p>
			  			  国家发展和改革委员会主任徐绍史30日表示，为减少资源价格改革对居民生活的影响，对居民...
			  		</div>
				</div>
				<div style="border-bottom: 1px dashed #aaccee;margin-left: 10px;"></div>
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
      
      <h3>资讯专区</h3>
      <div style="width: 1170px;">
      	<!-- 综合新闻 -->
      	<div class="panel panel-default" style="width: 575px;height: 500px;float: left;">
			<div class="panel-heading">综合新闻</div>
			<div class="bs-example bs-example-tabs">
			   	<div id="myTabContent" class="tab-content">
					<div class="tab-pane fade in active" id="tabSupplyBase">
				  		<table class="table" style="text-align: left;">
				  			<tbody>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-30</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-29</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-28</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-27</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-26</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-26</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-26</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-26</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-26</td>
				  				</tr>
				  				<tr>
				  					<td><a href="#" title="【物流设备】广东的珠海--->广州XXXX">【物流设备】广东的珠海--->广州...</a></td><td>2014-10-26</td>
				  				</tr>
				  			</tbody>
				  		</table>
					</div>
				</div>
			   </div>
		</div>
		
		<!-- 物流展会 -->
		<div class="panel panel-default" style="width: 580px;height: 500px;float: left;margin-left: 10px;">
			<div class="panel-heading">物流展会</div>
			<div class="bs-example bs-example-tabs">
			   	<div id="myTabContent" class="tab-content">
			  		<table class="table" style="text-align: left;">
			  			<tbody>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">·两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  				<tr>
				  					<td><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#" title="两大利好政策“护航” 运输物流板块有望“起锚扬帆”">两大利好政策“护航” 运输物...</a></td><td>2014-10-31</td>
				  				</tr>
				  			</tbody>
			  		</table>
				</div>
		    </div>
		</div>
      </div>
      
      <div style="width: 1170px;">
      	<!-- 政府 -->
		<div class="panel panel-default" style="width: 575px;height: 350px;float: left;">
			<div class="panel-heading">政策法规</div>
			<div class="bs-example bs-example-tabs">
			   	<div id="myTabContent" class="tab-content" style="margin-top: 10px;height: 130px;">
			  		<img src="asdasd/asd" style="float: left;margin-left: 10px;" width="120" height="120" >
			  		<div class="tab-content" style="float: left;width: 420px;margin-left: 10px;">
			  			<p><a href="#">国家将建立兼顾基本生活和资源节约</a></p>
			  			  国家发展和改革委员会主任徐绍史30日表示，为减少资源价格改革对居民生活的影响，对居民...
			  		</div>
				</div>
				<div style="border-bottom: 1px dashed #aaccee;margin-left: 10px;"></div>
				<ul class="list-group">
				  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
				  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
				  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
				  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
				  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
				</ul>
		    </div>
		</div>
		
		<!-- 物流案例 -->
		<div class="panel panel-default" style="width: 580px;height: 350px;float: left;margin-left: 10px;">
			<div class="panel-heading">物流案例</div>
			<div class="bs-example bs-example-tabs">
			   	<div id="myTabContent" class="tab-content" style="margin-top: 10px;height: 130px;">
			  		<ul class="list-group">
					  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
					  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
					  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
					  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
					  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
					  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
					  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
					  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
					  <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="orange"><b>·</b>&nbsp;&nbsp;</font><a href="#">国家发展和改革委员会主任徐绍史3</a></li>
					</ul>
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