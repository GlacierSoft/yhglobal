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
	<style type="text/css">
		body {
		    padding-top: 100px;
		}
	</style>
	<script type="text/javascript">
		$(function(){ 
			//控制左边导航高亮显示
			var types='<%=request.getAttribute("type")%>';  
			$("li").removeClass("active");
			//取到列表
			var li=$("#u2").children(); 
			var clas=null;
			$.each(li, function(key, val) {
				clas = $(val).attr('name');
			    if(types == clas){
			    	$("#u2").children().eq(key).addClass("active"); 
			    	return false;
			    } 
			}); 
		}); 
	 </script>
  </head>
<body>
  <jsp:include page="../nav.jsp"/>
  <!-- center-center --> 
  <div class="container"> 
	 <div class="row"> 
	       <!-- 左边导航 -->
	       <div class="col-md-2">
		       <div class="panel-group" id="accordion">
				    <div class="panel panel-default" >
				  		<div class="bs-example">
					      <ul class="nav nav-pills nav-stacked" id="u2" style="max-width: 300px;text-align: center;">
					        <li name="landCarriage"><a href="${ctx}/route/route.htm?&p=1&routeType=landCarriage">陆运班线</a></li> 
					        <li name="seaTransportation"><a href="${ctx}/route/route.htm?&p=1&routeType=seaTransportation">海运班线</a></li> 
					        <li name="air"><a href="${ctx}/route/route.htm?&p=1&routeType=air">空运班线</a></li> 
					      </ul>
				  		</div>  
			        </div>
		            <div class="panel panel-default">
						<img src="${pageContext.request.contextPath}/resources/images/newbie/about001.jpg" alt="联系我们">
					</div>
					<div class="panel panel-default">
						<img src="${pageContext.request.contextPath}/resources/images/index/weixin.jpg" width="163px" height="163" alt="联系我们">
						<p>扫描二维码关注越海物流微信，获取越海物流最新动态 </p>
					</div>
		        </div>
	       </div>
	       <div class="col-md-8" >
	            <!-- 班线详情面板 -->
	    		<div class="panel panel-default" style="height: 500px">
				  <div class="panel-heading">
				    <h3 class="panel-title"><b>班线详情</b></h3>
				  </div>
				  <div class="panel-body"> 
			          <h3  style="text-align: center;">${routerData.routeName}</h3>  
			          <table  style="border-style: none;">
			            <tr height="30px">
			              <td width="250px"  align="left" style="padding-left:120px;"><font size="2" color="#0697DA">班线编号:</font></td>
			              <td width="200px" >${routerData.routeNumber}</td>  
			              <td width="250px" align="left" style="padding-left:110px;"><font size="2" color="#0697DA">承运商：</font></td>
			              <td width="200px" >${routerData.carrierDisplay}</td>  
			            </tr>
			            <tr height="30px">
			              <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">班线类型:</font></td>
			              <td>
				              <c:if test="${routerData.routeType eq 'landCarriage' }">
							              陆运班线
							  </c:if>   
							  <c:if test="${routerData.routeType eq 'seaTransportation'}">
							              海运班线
							  </c:if> 
							  <c:if test="${routerData.routeType eq 'air'}">
							              空运班线
							  </c:if> 
			               </td>  
			               <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">在途时间：</font></td>
			               <td >${routerData.routeBytime}小时</td> 
			            </tr>
			            <tr height="30px">
				           <td  align="left" style="padding-left:120px;"><font size="2" color="#0697DA">班线起点：</font></td>
				           <td>${routerData.routeOrigin}</td>  
				           <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">发货地址：</font></td>
				           <td>${routerData.originAddress}</td>  
				        </tr>
			            <tr height="30px">
				           <td  align="left" style="padding-left:120px;"><font size="2" color="#0697DA">班线终点：</font></td>
				           <td>${routerData.routeStop}</td>  
				           <td  align="left" style="padding-left:110px;"><font size="2" color="#0697DA">提货地址：</font></td>
				           <td>${routerData.stopAddress}</td>  
				        </tr> 
			            <tr height="30px">
			               <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">发车时间：</font></td>
			               <td><fmt:formatDate value="${routerData.startofTime}" pattern="HH:mm"/></td>  
			               <td width="250px" align="left" style="padding-left:110px;"><font size="2" color="#0697DA">截止收货时间：</font></td>
			               <td><fmt:formatDate value="${routerData.ceaseTakeDeliveryTime}" pattern="HH:mm"/></td>  
			            </tr>  
			            <tr height="30px">
			               <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">车辆箱型：</font></td>
			               <td > 
				              <c:if test="${routerData.boxType eq 'fullClosed' }">
							              全封闭
							  </c:if>   
							  <c:if test="${routerData.boxType eq 'semiClosed'}">
							              半封闭
							  </c:if> 
							  <c:if test="${routerData.boxType eq 'flat'}">
							              平板
							  </c:if> 
			               </td>  
			               <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">可定仓位：</font></td>
			               <td >剩${routerData.availablePosition}%</td>  
			            </tr>
			            <tr height="30px">
			               <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">起步价：</font></td>
			               <td><fmt:formatNumber value='${routerData.startingPrice}' pattern='#,#00.00'/>元</td>  
			               <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">保险费：</font></td>
			               <td><fmt:formatNumber value='${routerData.premium}' pattern='#,#00.00'/>元</td>  
			            </tr>
			            <tr height="30px">
			               <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">轻货价：</font></td>
			               <td><fmt:formatNumber value='${routerData.lightGoodsPrice}' pattern='#,#00.00'/>元/立方</td>  
			               <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">重货价：</font></td>
			               <td><fmt:formatNumber value='${routerData.weightGoodsPrice}' pattern='#,#00.00'/>元/公斤</td>  
			            </tr>
			            <tr height="30px">
			               <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">里程：</font></td>
			               <td>${routerData.mileage}</td>  
			               <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">预计提货时间：</font></td>
			               <td>${routerData.extractGoodsTime}</td>  
			            </tr>
			            <tr height="30px">
			               <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">联系电话：</font></td>
			               <td>${routerData.telephone}</td>  
			               <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">发布时间：</font></td>
			               <td><fmt:formatDate value="${routerData.createTime}" type="both"/></td>  
			            </tr>
			            <tr height="30px">
			               <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">备注：</font></td>
			               <td  colspan="3">${routerData.remark}</td>  
			            </tr> 
			          </table>  
				</div> 
				<center>
			    	<button type="button" onclick="send('${routerData.routerId}')" class="btn btn-info" style="width: 150px">我要发货</button>
				 	<button type="button" target=_blank onclick="reouteMap('${routerData.routerId}')" class="btn btn-info" style="width: 150px">查看线路图</button>
				 </center> 
	    	</div>  
    	    </div>
    	<div class="col-md-2">
	    <!-- 物流案例 -->
		<div class="panel panel-default" style="width: 180px;float: left;">
			<div class="panel-heading" align="center">发货区域</div>
			<div class="bs-example bs-example-tabs">
			   	<div id="myTabContent" class="tab-content" style="margin-top: 10px;height: 155px;">
			  		<ul class="list-group" style="text-align: center;">  
				  		<c:if test="${empty routerData.deliverList}">
				  		   <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="#0697DA">暂无信息</font></li>
			            </c:if> 
			            <c:forEach items="${routerData.deliverList}" var="deliver">  
					       <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="#0697DA">&nbsp;&nbsp;${deliver.deliverName}&nbsp;&nbsp;
					       &nbsp;&nbsp;<fmt:formatNumber value='${deliver.price}' pattern='#,#00.00'/>元/次</font></li>
		                </c:forEach>  
				    </ul>
			   </div>
		    </div>
	   </div>
	   <div class="panel panel-default" style="width: 180px;float: left;margin-top: 10px" >
			<div class="panel-heading" align="center">收货区域</div>
			<div class="bs-example bs-example-tabs">
			   	<div id="myTabContent" class="tab-content" style="margin-top: 10px;height: 205px;">
			  		<ul class="list-group" style="text-align: center;">
			  		<c:if test="${empty routerData.pickUpList}">
				  		   <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="#0697DA">暂无信息</font></li>
			            </c:if> 
					   <c:forEach items="${routerData.pickUpList}" var="deliver">  
					       <li class="list-group-item" style="padding-bottom: 5px;padding-top: 5px;"><font size="2" color="#0697DA">&nbsp;&nbsp;${deliver.deliverName}&nbsp;&nbsp;
					       &nbsp;&nbsp;<fmt:formatNumber value='${deliver.price}' pattern='#,#00.00'/>元/次</font></li>
		                </c:forEach> 
					  </ul>
				</div>
		    </div>
		</div>
	 </div>
  </div>
  </div>
	<jsp:include page="../foot.jsp"/>
	<script type="text/javascript">
	 
	///构建表单,进入班线地图线路页面
	function reouteMap(str){
		// 创建Form  
	    var form = $('<form></form>');  
		// 设置属性  
	    form.attr('action', '<%=basePath%>route/routeMap.htm');  
	    form.attr('method', 'post');  
	    // form的target属性决定form在哪个页面提交  (_self -> 当前页面 _blank -> 新页面)  
	    form.attr('target', '_self');  
	    // 创建Input  
	    var my_input = $('<input type="text" name="routeId" />');   
	    my_input.attr('value', str);   
	    // 附加到Form  
	    form.append(my_input);  
	    //表单设置隐藏
	    form.css('display','none');
	    //表单的构建 完成并提交
	    form.appendTo(document.body).submit();
	 }
	  
	//进入发货页面
	function send(str){
		// 创建Form  
	    var form = $('<form></form>');  
		// 设置属性  
	    form.attr('action', '<%=basePath%>delivery/delivery.htm');  
	    form.attr('method', 'post');  
	    // form的target属性决定form在哪个页面提交  (_self -> 当前页面 _blank -> 新页面)  
	    form.attr('target', '_self');  
	    // 创建Input  
	    var my_input = $('<input type="text" name="routeId" />');   
	    my_input.attr('value', str);   
	    // 附加到Form  
	    form.append(my_input);  
	    //表单设置隐藏
	    form.css('display','none');
	    //表单的构建 完成并提交
	    form.appendTo(document.body).submit();
	 }
	</script>
</body>
</html>