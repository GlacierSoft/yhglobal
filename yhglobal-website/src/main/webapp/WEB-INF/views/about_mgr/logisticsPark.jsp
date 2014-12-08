<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
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
	<script type="text/javascript">
	$(function(){
		
		$("#u2").hide();
		$("#new").click(function(){ 
			//用于改变选择了的样式
			//$("li").removeClass("active");
			//$(this).parent().addClass("active");

			$("#u2").slideToggle("slow");
			
		});
	});
	
	</script>
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
					        <li class="active"><a href="${ctx}/logisticsPark.htm">物流园区</a></li>
					        <li><a href="${ctx}/logisticsExhibition.htm">物流展会</a></li>
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
				    <h3 class="panel-title">综合消息 / 物流园区</h3>
				  </div>
				  <div class="panel-body">
			          <h2>越海物流园区</h2>
			          <div style="margin-top: 5px;">
			            <p>越海物流园区以物品集散、交易、转运为一体的各种产品的区域。</p>
			            <p>越海长期专注于为ＩＴ产业提供综合性服务，到２００７年已是国内ＩＴ业最大的综合物流服务商之一，其液晶面板物流量占全球４０％。</p>
			            <p>该公司率先推出了“一体化供应链管理模式”，把采购、进出口代理、报关、仓储、配送、分销等集于一身，甚至分销渠道、售后服务等不属于传统物流的环节，也全部拿下。</p>
			          </div>
			          <div style="margin-top: 5px;">
			            <h3>发展趋势</h3>
			            <p><font color="orange">生态发展以及可持续发展趋势</font>，通过草地、林地、水域合理布局和工业废弃物的生态化处理，使园区经济形成良性的经济、社会、环境协调统一的可持续发展经济体系；</p>
			          	<p><font color="orange">功能化和结构化趋势</font>，经过合理规划布局，形成内部分工和合理结构，实现园区功能的优化，产生最大的资源优化配置效益；</p>
			          	<p><font color="orange">专业化和大型化趋势</font>，由于参与国际竞争程度加深，对产业的专业化水平和规模聚集水平产生了较高的要求，需要大型的专业化产业地域体系，参与国际竞争；</p>
			          </div>
			          <div style="margin-top: 5px;">
			            <h3>社会效益</h3>
			            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;作为进出货物的集散地和为大型厂商采购与分销提供的物流平台，物流园区在整个物流链条中占核心地位，其功能的正常发挥有利于货畅其流的目标实现。
			           	 物流园区以其规模大、综合服务功能强并同时具有物流组织管理和经济开发功能的特点，引起社会各界的极大关注。物流园区按照专业化、规模化的原则组织物流活动，
			           	 将众多物流企业集中在一起，建立战略协作关系形成跨行业的优势互补与协作，共享相关基础设施和配套服务设施，有利于发展整体优势，实现物流的专业化和服务专业化、集中化。</p>
			          </div>
			          <div style="margin-top: 5px;">
			            <h3>主要作用</h3>
			              <h5 style="margin-top: 5px;">物流园区对产业发展的推动作用</h5>
			              <p style="margin-top: 5px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;物流园区在聚集各种物流服务提供商的同时，也为物流企业提供了一个良好的发展空间，推动了物流企业自身的发展。本为将这些推动作用归结为资金推动、技术推动、人才推动和信息化管理水平推动。
			              	物流园区是属于政府出资进行的物流基础设施建设，通过政府的投资大大减轻了物流企业发展的前期投入成本，从而促进物流企业将更多的资金投入到核心能力和物流服务的开发之中，在高质量的服务中所获得的竞争优
			              	势将为物流服务提供者带来丰厚的利润，而物流园区通过各种为物流企业的服务获得良好的投资回报，由此可以形成了良性的资金链循环，促进物流服务的不断发展。</p>
			          		<div style="margin-top: 5px;text-align: center;margin-bottom: 10px;">
								<img src="${pageContext.request.contextPath}/resources/images/park/yuehaipart.jpg">
							 </div>
							<h5 style="margin-top: 5px;">信息化管理</h5>
							<p style="margin-top: 5px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;综合性、大规模的物流园区，同时也是指挥、管理和信息的中心，通过园区将信息集中，达到指挥调度的功能。现代物流企业面向的是供应链管理环境，没有良好的管理信息系统的支持几乎无法展开在市场中的竞争，
							但是信息化的风险和巨额的投资又使一些中小物流企业观望不前。物流园区通过引入技术较为成熟的信息系统，一方面再次引入这些小企业，同时也将这些企业在能力和管理上整合起来，通过整合园区内各企业的信息系统，
							形成一个统一的指挥管理中心，提高了整个园区工作的效率。</p>
							<p>而通过信息技术的运用也让中小物流企业获得了信息化管理带来的优势，逐步建立起具备现代管理水平的企业制度和文化，从而推动了整个产业管理的信息化。</p>
			          </div>
				  </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    </div>
	    <jsp:include page="../foot.jsp"/>
  </body>
</html>