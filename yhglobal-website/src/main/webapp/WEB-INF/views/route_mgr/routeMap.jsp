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
	<!--引入地图库  -->
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=28f141a7f98bb07afec4968ecd7fc808"></script> 
	<style type="text/css">
		body {
		    padding-top: 100px;
		} 
		#r-result{width:100%;margin-top:50px;}
	</style> 
  </head>

  <body>
    <jsp:include page="../nav.jsp"/> 
	    <div class="container">
	  	<div class="row"> 
	    	<div class="col-md-12">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				        <h3 class="panel-title"><b style="color: red">${routerMap.routeName}</b>线路详情</h3>
				  </div>
				  <div class="panel-body"> 
				   <div class="form-group" style="margin-top: 5px;margin-bottom: 10px">
						    <label for="inputEmail2" class="col-sm-2 control-label" > 根据条件选择最佳线路：</label> 
						    <div class="col-sm-4" align="left" id="driving_way" style="padding-left: 0px">
						     		<select class="form-control" onchange="chan()">
							        <option value="0">最少时间</option>
									<option value="1">最短距离</option>
									<option value="2">避开高速</option> 
							    </select>  
							</div> 
						    <div class="col-sm-6" align="left" style="padding-left: 0px"  id="group">
					   
					         </div> 
					</div>
					   
					   <br><br>
					 <div class="form-group" style="margin-top: 5px;margin-bottom: 10px"  >
					 	     <label for="inputEmail3" class="col-sm-2 control-label">起点详细地址:</label>
						     <label for="inputEmail3" class="col-sm-3 control-label" style="color: #717171;padding-left: 0px">${routerMap.deliverList[0].address}</label>
				 	         <label for="inputEmail3" class="col-sm-1 control-label" style="padding-right: 0px">电话:</label>
						     <label for="inputEmail3" class="col-sm-5 control-label" style="color: #717171;padding-left: 0px">${routerMap.deliverList[0].telephone}</label>
				 	</div>
					 <br>
					 <div class="form-group" style="margin-top: 5px;margin-bottom: 10px"  >
							 <label for="inputEmail3" class="col-sm-2 control-label">终点详细地址:</label>
						     <label for="inputEmail3" class="col-sm-3 control-label" style="color: #717171;padding-left: 0px">${routerMap.pickUpList[0].address}</label>
				 	         <label for="inputEmail3" class="col-sm-1 control-label" style="padding-right: 0px">电话:</label>
						     <label for="inputEmail3" class="col-sm-5 control-label" style="color: #717171;padding-left: 0px">${routerMap.pickUpList[0].telephone}</label>
				 	 </div>
					   
				    <div style="width:100%;height:550px;border: 1px solid #DADADA;margin-top: 20PX;float: left;border-radius:5px;z-index:9999;box-shadow:0px 0px 10px rgba(0, 0, 0, 0.3);">
						      <!--<div id="allmap" style="width: 890px;height: 430px;margin-top: 10px;margin-left: 15px;"></div>    	 -->
				       	
				       	      <div style="width:98%;height:530px;border:#ccc solid 1px;margin-top: 10px;margin-left: 10px;" id="dituContent"></div>
				    </div> 
				  </div>
				</div>
	    	</div>
	    </div> 
	    <hr class="featurette-divider2">
	    </div>
	    <jsp:include page="../foot.jsp"/>
<!-- 分页显示表格数据 -->
<script type="text/javascript">  

		// 百度地图API功能
		var map = new BMap.Map("dituContent"); 
		var start = new BMap.Point(${routerMap.deliverList[0].longitude},${routerMap.deliverList[0].latitude});//定义一个起点坐标
		var end = new BMap.Point(${routerMap.pickUpList[0].longitude},${routerMap.pickUpList[0].latitude});//定义一个终点坐标
	    map.enableScrollWheelZoom();
		
		//三种驾车策略：最少时间，最短距离，避开高速
		var routePolicy = [BMAP_DRIVING_POLICY_LEAST_TIME,BMAP_DRIVING_POLICY_LEAST_DISTANCE,BMAP_DRIVING_POLICY_AVOID_HIGHWAYS];
		map.clearOverlays(); 
		search(start,end,routePolicy[0]); 
		search(start,end,routePolicy[1]); 
		search(start,end,routePolicy[2]); 
		function search(start,end,route){ 
			var driving = new BMap.DrivingRoute(map, {renderOptions:{map: map, autoViewport: true},policy: route});
			driving.search(start,end);
		} 
		
		 //添加控件
		var top_left_control = new BMap.ScaleControl({anchor: BMAP_ANCHOR_TOP_LEFT});// 左上角，添加比例尺
		var top_left_navigation = new BMap.NavigationControl();  //左上角，添加默认缩放平移控件
		map.addControl(top_left_control);        
		map.addControl(top_left_navigation); 
		 
		//地图类型
		var mapType2 = new BMap.MapTypeControl({anchor: BMAP_ANCHOR_TOP_RIGHT}); 
		var overView = new BMap.OverviewMapControl();
		var overViewOpen = new BMap.OverviewMapControl({isOpen:true, anchor: BMAP_ANCHOR_BOTTOM_RIGHT});
		
		//添加地图类型和缩略图  ;          //2D图，卫星图
		map.addControl(mapType2);          //左上角，默认地图控件
		//map.setCurrentCity("北京");        //由于有3D图，需要设置城市哦
		map.addControl(overView);          //添加默认缩略地图控件
		map.addControl(overViewOpen);      //右下角，打开
		    
		function chan(){
		var driving; 
			var output = "&nbsp;&nbsp;<font size='5' color='red'>${routerMap.deliverList[0].deliverName}</font><img hspace='0' height='40px' vspace='0' src='${pageContext.request.contextPath}/resources/images/delivery/12.png'><font size='5' color='red'>${routerMap.pickUpList[0].deliverName}</font>&nbsp;&nbsp;驾车需要";
			var searchComplete = function (results){
				if (driving.getStatus() != BMAP_STATUS_SUCCESS){
					return ;
				}
				var plan = results.getPlan(0);
				output += ":&nbsp;<font size='2' color='#FF4000'>"+plan.getDuration(true)+"</font>";                //获取时间
				output += "&nbsp;&nbsp;总路程为：" ;
				output +="<font size='2' color='#FF4000'>"+ plan.getDistance(true)+"</font>";             //获取距离
			}  
			map.clearOverlays(); 
			var i=$("#driving_way select").val();
			search(start,end,routePolicy[i]); 
			function search(start,end,route){ 
				driving = new BMap.DrivingRoute(map, {renderOptions:{map: map, autoViewport: true},
				 	onSearchComplete: searchComplete,
					onPolylinesSet: function(){        
						setTimeout(function(){
							$("#info").remove();
							 $("#group").append("<div id='info'>"+output+"</div>");
							
						},"1000");
				     } 
				,policy: route});
				
				driving.search(start,end);
			} 
		}; 
</script> 
</body>
</html>