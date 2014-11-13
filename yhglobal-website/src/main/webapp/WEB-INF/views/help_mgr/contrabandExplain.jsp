<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!-- 越海物流违禁物品说明页面 -->
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
					        <li class="active"><a href="${ctx}/contrabandExplain.htm">禁运品说明</a></li> 
					         <li><a href="${ctx}/weightExplain.htm">轻/重货说明</a></li> 
					         <li><a href="${ctx}/collectFees.htm">增值服务说明</a></li> 
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
				    <h3 class="panel-title">禁运品说明</h3>
				  </div>
				  <div class="panel-body">
			          <h2  align="center">禁运品说明</h2> <br>
			          <table class="table table-bordered" style="text-align: center;" >
                      <tr>
                       <td width="270px"><b>类别</b></td>
                       <td><b>明细</b></td>
                      </tr>
                       <tr>
                       <td rowspan="7" style="padding-top: 106px">国家法定禁止运输物品</td>
                       <td style="text-align: left;">政府法律规定的禁运物品，如香烟、文物、走私、盗版等</td>
                      </tr>
                      <tr>
                       <td style="text-align: left;">鸦片、吗啡、大麻、可卡因、海洛因、摇头水、麻醉品等毒品</td>
                      </tr>
                      <tr>
                       <td style="text-align: left;">武器及其部件、枪支弹药、仿军火类玩具、管制刀具等</td>
                      </tr>
                      <tr>
                       <td style="text-align: left;">反动、淫秽、迷信、盗版等报刊书籍，光碟，赌博用的游戏机（老虎机）</td>
                      </tr>
                      <tr>
                       <td style="text-align: left;">尸体、动植物活体、人体器官及医学废弃物等</td>
                      </tr>
                      <tr>
                       <td style="text-align: left;"> 国家货币（现金等）、有价证券、金银、珠宝、贵重金属、古董等</td>
                      </tr>
                      <tr>
                       <td style="text-align: left;">动植物制品，如：未经处理的动物皮（皮毛）、象牙等</td>
                      </tr>
                       <tr>
                       <td rowspan="5" style="padding-top: 70px">危险品</td>
                       <td style="text-align: left;"><font color="blue">易燃易爆类：</font>烟花爆竹、油墨、丁烷、易燃油漆、蓄电池、汽油、乙醇（酒精）、液压刹车油、磷、镁、打火机、液压气瓶(无论是否空瓶)、有易燃易爆标志的货物等</td>
                      </tr>
                       <tr>
                        <td style="text-align: left;"><font color="blue">毒性物质：</font>水银、农药（中性毒及以上）、催泪弹、砒霜、生物培养基等</td>
                      </tr><tr>
                       <td style="text-align: left;"><font color="blue">放射性物质：</font>具有β、γ射线和中子流等的货物</td>
                      </tr><tr>
                       <td style="text-align: left;"><font color="blue">腐蚀物：</font>硫酸、强碱、硝酸、电池酸溴等</td>
                      </tr><tr>
                       <td style="text-align: left;"><font color="blue">杂项危险品：</font>天那水、麻醉品、毒性物质药品、干冰、石棉、疫苗等 </td>
                      </tr>  
                      <tr>
                       <td>海运禁运类</td>
                       <td style="text-align: left;">除包含以上类别外，禁止收运任何液体，乳状，胶状等流体类货物</td>
                      </tr>
                      <tr>
                       <td style="padding-top: 20px">空运违禁类</td>
                       <td style="text-align: left;">除包含以上类别外，不能收运香料、香精、香水等一切的液体类、榴莲、石棉、气囊、气压泵、潜水泵、砖头、音响、所有电池类、不间断电源、磁性材料、具有麻醉、毒害等能造成飞行人员或驾驶人员情绪烦燥或不适，影响飞行任务的正确执行或影响驾驶人员的物品</td>
                      </tr> 
                      <tr>
                       <td rowspan="7" style="padding-top: 106px">易碎物品类</td>
                       <td style="text-align: left;">纯玻璃制品（灯具除外）、亚克力板（有机玻璃）、含玻璃的家具（玻璃面积超过家具最大面面积30%）。</td>
                      </tr>
                      <tr>
                       <td style="text-align: left;">大理石、钢琴、马桶、游艇、红木家具</td>
                      </tr><tr>
                       <td style="text-align: left;">骨雕、木雕、石雕、玉雕雕塑类物品</td>
                      </tr><tr>
                       <td style="text-align: left;">汽车、飞机、房屋模型类物品</td>
                      </tr><tr>
                       <td style="text-align: left;">活性炭、易发霉变质物品；需要冷藏、保温、防晒等特殊条件保管的物品</td>
                      </tr><tr>
                       <td style="text-align: left;">磁铁、磁钢（仅指包含磁性）</td>
                      </tr><tr>
                       <td style="text-align: left;">非原厂包装的LED、电视、显示器（木架包装也需原厂包装）；床垫；酒（酒类仅限附件中区域可收取）</td>
                      </tr>
                      <tr>
                       <td rowspan="2" style="padding-top: 20px">价值难以确定的物品</td>
                       <td style="text-align: left;">有效证件、车牌、文件、技术资料、计算机软件内存</td>
                      </tr><tr>
                       <td style="text-align: left;">邮票、古玩、艺术品、字画、水晶、玉器、放射性金属、各种土壤样本</td>
                      </tr>
                      <tr>
                       <td   colspan="2" align="center"><font color="red">除以上标出品名货物外，含有以下标志的货物也禁止收取：</font></td>
                      </tr>
                      <tr>
                       <td  colspan="2" align="center"><img src="${pageContext.request.contextPath}/resources/images/delivery/danger.png"   class="img-rounded"></td>
                      </tr>
                      
                      
                      </table>
				</div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    </div>
	    
	    <jsp:include page="../foot.jsp"/>
  </body>
</html>