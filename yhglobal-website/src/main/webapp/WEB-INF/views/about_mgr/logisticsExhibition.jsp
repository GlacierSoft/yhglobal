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
					        <li><a href="${ctx}/logisticsPark.htm">物流园区</a></li>
					        <li class="active"><a href="${ctx}/logisticsExhibition.htm">物流展会</a></li>
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
				    <h3 class="panel-title">综合消息 / 物流展会</h3>
				  </div>
				  <div class="panel-body">
			          <h2 style="text-align: center;">越海物流展会</h2>
			          <div style="margin-top: 15px;text-align: center;margin-bottom: 10px;">
						<img src="${pageContext.request.contextPath}/resources/images/park/yuehaiexes.jpg" height="300">
					 </div>
			          <div style="margin-top: 5px;">
			            <h3>物流展会</h3>
			            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;指为会议、展览、展销、体育及其他各类活动提供的物流服务。关于会展物流的概念，在我国有多种描述，目前还没有统一的定论。比较流行的定义是：
			            	所谓会展物流，“是为满足参展商展品展览的特殊需要，将展品等特殊商品及时准确地从参展商所在国（地）转移到参展目的地，展览结束后再将展品从展览地运回的过程，
			            	包括展览前后的仓储、包装、国内运输、进出口报关和清关、及ATA报关、国际运输、展览中的装卸、搬运，以及在此过程中所需要的信息流动。”</p>
			          </div>
			          <div style="margin-top: 5px;">
			            <h3>服务的专业性</h3>
			            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;会展活动的特点要求为其提供物流服务的会展物流服务商，必须具有较高的专业化管理水平，
			            	必须拥有具备会展物流管理专业技能的人才、畅通的物流渠道、有效的物流配送手段和功能齐全的货物转运与仓储中心、完备的信息网络平台和信息技术作为支撑。因此，
			            	专业化程度相对较高是会展物流一个最为显著的特征。</p>
			          </div>
			          <div style="margin-top: 5px;">
			            <h3>流程的时效性</h3>
			            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;会展物流活动过程控制非常复杂，在时间上具有很强的阶段性，在空间上具有突发的集中性，
			            	在需求上具有双向性和不确定性，这就要求会展物流服务商提供更高层次的快速反应服务。如何在特定的时空里，满足参展商多种应急需求，是会展能否成功举办的关键。</p>
			          </div>
			          <div style="margin-top: 5px;">
			            <h3>展品的安全性</h3>
			            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;确保物流过程中的物品安全是会展物流的第一任务。会展活动所需的设备、物品一般由会展组织者采购，
			            	而参展商展销产品的运输则在会展组织者的统一调度下自行负责。承运人员在运送过程中要保证物品不发生霉烂、破损、水渍等损害展品原有使用价值的事故，避免因此而造
			            	成的供货质量问题导致的会展准备的中断。因此，会展物流服务商必须确保所运送物品不仅及时而且安全的达到目的地，通常还需再返回原地。</p>
			          </div>
			          <div style="margin-top: 5px;">
			            <h3>信息的实时性</h3>
			            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;信息化是我国会展产业与国际接轨的一个重要衡量标准。信息传递与共享是保障会展物流管理高效协调运行的重要基础。
			            	在会展物流的组织与管理过程中，会展主办方、参展商与物流服务商信息的实时沟通，为会展活动提供高效的物流服务支持，是会展物流服务商的重要目标之一。会展组织管理者应会同各参展商与物流服务商，
			            	不断对各种相关信息进行实时监控，并根据反馈信息及时调整会展物流过程中的具体行动措施。</p>
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