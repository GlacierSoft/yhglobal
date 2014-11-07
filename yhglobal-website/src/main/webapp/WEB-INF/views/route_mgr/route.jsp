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
  </head>
    <script type="text/javascript">
		$(function(){ 
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
  <body>
  <jsp:include page="../nav.jsp"/>
    <!-- center-center --> 
	<div class="container">  
	  <div class="row">
	   <div class="col-md-2">
	      <!-- 左边导航 -->
	      <div class="panel-group" id="accordion" style="margin-left: 0px">
			    <div class="panel panel-default" >
			  		<div class="bs-example">
				      <ul class="nav nav-pills nav-stacked" id="u2" style="max-width: 300px;text-align: center;">
				        <li name="landCarriage"><a href="${ctx}/route/route.htm?&p=1&routeType=landCarriage">陆运班线</a></li> 
				        <li name="seaTransportation"><a href="${ctx}/route/route.htm?&p=1&routeType=seaTransportation">海运班线</a></li> 
				        <li name="air"><a href="${ctx}/route/route.htm?&p=1&routeType=air">空运班线</a></li> 
				      </ul>
			  	  </div>  
		        </div>
	            <div class="panel panel-default" style="margin-top: 20px">
					<img src="${pageContext.request.contextPath}/resources/images/newbie/about001.jpg" alt="联系我们">
				</div>
				<div class="panel panel-default" style="height: 255px">
					<img src="${pageContext.request.contextPath}/resources/images/index/weixin.jpg" width="163px" height="163" alt="联系我们">
					<p>扫描二维码关注越海物流微信，获取越海物流最新动态 </p>
				</div>
	      </div> 
	   </div>
	   <!-- 右边布局 -->
       <div class="col-md-10"> 
	          <!-- 条件查询表单 -->
		      <form id="form" action="<%=basePath%>route/selectRoute.htm?&p=1" method="post">
			       <input type="hidden" name="routeType" value="${type}"> 
				   <label for="name" style="float: left; padding-top: 5px">承运商：</label>
			       <input type="text" style="width: 180px;float: left;" class="form-control" id="carrierDisplay" 
			       name="carrierDisplay" value="${carrierRouteQueryDTO.carrierDisplay}" placeholder="请输入承运商名称"/> 
			       <label for="name" style="float: left;padding-top: 5px;margin-left: 5px">&nbsp;出发站：</label> 
			       <input type="text" style="width: 180px;float: left;" value="${carrierRouteQueryDTO.routeOrigin}" 
			       name="routeOrigin" id="routeOrigin" onkeydown="return false;" onfocus="adjustCssDel();" style="height: 23px;border-color: #c3d9e0" autocomplete="off" type="text" placeholder="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll form-control">
	               <label for="name" style="float: left;padding-top: 5px;margin-left: 5px">&nbsp;终点站：</label>
			       <input type="text" style="width: 180px;float: left;" value="${carrierRouteQueryDTO.routeStop}" 
			       name="routeStop" id="routeStop" onkeydown="return false;" onfocus="adjustCssAdd();" style="height: 23px;border-color: #c3d9e0" autocomplete="off" type="text" placeholder="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll form-control">
	               &nbsp;&nbsp;&nbsp; 
			       <button type="submit" style="margin-top: 5px" class="btn btn-primary"  
					data-toggle="button" onclick="formsumit()"> 查询
				   </button>
				   <button type="reset" style="margin-top: 5px" class="btn btn-primary"  
				   data-toggle="button" onclick="formreset()"> 重置
				   </button>
		       </form>
			   <!-- 面板 -->
			   <div class="panel panel-default" style="margin-top: 10px"> 
				  <!-- Default panel contents -->
				  <div class="panel-heading">
				     <b> 
						 <c:if test="${type eq 'landCarriage' }">
						              陆运班线查询
						  </c:if>   
						  <c:if test="${type eq 'seaTransportation'}">
						              海运班线查询
						  </c:if> 
						  <c:if test="${type eq 'air'}">
						              空运班线查询
						  </c:if>
					  </b>
			      </div>  
			      <!-- Table --> 
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
							          	<td ><a href="#" onclick="doClick('${router.routerId}');"><font size="2" color="#0697DA">查看详细</font></a></td>
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
      </div>
	</div>
	<jsp:include page="../foot.jsp"/>
		<!-- 分页显示表格数据 -->
	<script type="text/javascript">
	    var type='<%=request.getAttribute("type")%>';
		//构建表单
		function doClick(str){
			// 创建Form  
		    var form = $('<form></form>');  
			// 设置属性  
		    form.attr('action', '<%=basePath%>route/routeDetail.htm');  
		    form.attr('method', 'post');  
		    // form的target属性决定form在哪个页面提交  (_self -> 当前页面 _blank -> 新页面)  
		    form.attr('target', '_self');  
		    // 创建Input  
		    var my_input = $('<input type="text" name="routerId" />');  
		    var typetext=$('<input type="text" name="type" />');  
		    my_input.attr('value', str);  
		    typetext.attr("value",type);
		    // 附加到Form  
		    form.append(my_input); 
		    form.append(typetext);
		    //表单设置隐藏
		    form.css('display','none');
		    //表单的构建 完成并提交
		    form.appendTo(document.body).submit();
		 }
	
		$(function(){
			//获得浏览器参数
			$.extend({
				getUrlVars: function(){
					var vars = [], hash;
					var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
					for(var i = 0; i < hashes.length; i++){
						hash = hashes[i].split('=');
						vars.push(hash[0]);
						vars[hash[0]] = hash[1];
					}
					return vars;
				},
				getUrlVar: function(name){
					return $.getUrlVars()[name];
				}
			});
		
		//封装浏览器参数
		var composeUrlParams=function(){
			var param='';
			$.each($.getUrlVars(), function(i, item) {
				if(item!='p'){
					var val=$.getUrlVar(item);
					if(val) param += "&" + item+"="+val;
				}
			});
			return param;
		}
		
		var element = $('#pageNews'); 
		//设置分页的总页数
		var total=${routerDatas.total}/10; 
		if(total>1){ 
		if(parseInt(total)==total){
			var total = parseInt(total);
		}else {
			var total = parseInt(total)+1;
		} 
		var options = {
		    bootstrapMajorVersion:3,
		    currentPage: ${routerDatas.p},
		    numberOfPages: 5,
		    totalPages:total,
		    pageUrl: function(type, page, current){
		    	return "${ctx}/route/route.htm?"+composeUrlParams()+"&p="+page+"&type="+type;
		    	}
		}
		
		element.bootstrapPaginator(options);
		}
		})
	</script> 
	<!--弹出省省市style="z-index:30;position:absolute;margin-left: 85px;margin-top: -820px;"-->
	<div class="provinceCityAll" id="provinceCityAll" style="z-index:30;position:absolute;">
	  <div class="tabsArea clearfix" >
	    <ul class="">
	      <li><a href="javascript:" class="current" tb="hotCityAll">热门城市</a></li>
	      <li><a href="javascript:" tb="provinceAll">省份</a></li>
	      <li><a href="javascript:" tb="cityAll" id="cityAll">城市</a></li>
	      <li><a href="javascript:" tb="countyAll" id="countyAll">区县</a></li>
	    </ul>
	  </div>
	  <div class="con" style="height: 150px;">
	    <div class="hotCityAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	    <div class="provinceAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	          <!-- 					<li><a href="javascript:"  class="current">江西省</a></li> -->
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	    <div class="cityAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	          <!-- 					<li><a href="javascript:"  class="current">南京</a></li> -->
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	    <div class="countyAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	  </div> 
	</div> 
<script src="${ctx}/resources/area/js/public.js"></script> 
<script type="text/javascript">
	//终点的增加距离
	function adjustCssAdd(){
		var provinceCityAlls = document.getElementById("provinceCityAll");
		provinceCityAlls.style.marginLeft = "850px";
		provinceCityAlls.style.marginTop = "-820px";
	}	 
	//始发站的减少距离
	function adjustCssDel(){
		var provinceCityAlls = document.getElementById("provinceCityAll");
		provinceCityAlls.style.marginLeft = "600px";
		provinceCityAlls.style.marginTop = "-820px";
	} 
	//表单提交
	function formsumit(){    
		$("#form").submit(); 
	  }  
	//表单重置查询
	function formreset(){
		$("#carrierDisplay").val(""); 
		$("#routeOrigin").val("");
		$("#routeStop").val(""); 
		$("#form").submit(); 
	}
</script>

</body>
</html>