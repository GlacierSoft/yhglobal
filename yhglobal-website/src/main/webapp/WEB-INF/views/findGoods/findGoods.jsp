<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.LockedAccountException"%>
<%@ page import="com.glacier.basic.exception.IncorrectCaptchaException"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>越海物流</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="../inc.jsp"/>
	<!-- Custom styles for this template -->
    
    <style type="text/css">
		body {
			padding-top: 75px;
		}
	</style>
	</head>
  <body>
  <jsp:include page="../nav.jsp"/>
             
    <!--大容器  -->         
     <div class="container">
         <div class="row">
         <div class="col-md-2">
              <!-- 左边导航 -->
		      <div class="panel-group" id="accordion" style="margin-left: 0px">
				    <div class="panel panel-default" >
				  		<div class="bs-example">
					      <ul class="nav nav-pills nav-stacked" id="u2" style="max-width: 300px;text-align: center;">
					         <li  class="active"><a href="#">我要发货</a></li> 
					         <li  class="active"><a href="${ctx}/template/index.htm?&p=1">模板管理</a></li>
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
         <div class="col-md-10">
      	 <form action="${ctx}/delivery/findGoods.htm?&p=1" method="post" id="form_delivery">
                 <div class="panel panel-primary">
                    <div class="panel-heading">
    					<h3 class="panel-title">货运</h3>
  					</div>
  					
					<div class="panel-body">
						   <input type="hidden" name="routeType" value="${type}"> 
						   <label for="name" style="float: left; padding-top: 5px">车长：</label>
					       <select style="width: 180px;float: left;" class="form-control" id="shorteslength" 
					       name="shorteslength" >
					       		<option value="">不限</option>
					       		<option value="4.5">4.5米</option>
					       		<option value="5.5">5.5米</option>
					       		<option value="6.5">6.5米</option>
					       </select> 
					       <label for="name" style="float: left;padding-top: 5px;margin-left: 5px">&nbsp;出发站：</label> 
					       <input type="text" style="width: 180px;float: left;" value="${storehouseBelaidupQueryDTO.belaidupInitiatin}" 
					       name="belaidupInitiatin" id="belaidupInitiatin" style="height: 23px;border-color: #c3d9e0" autocomplete="off" type="text" placeholder="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll form-control">
			               <label for="name" style="float: left;padding-top: 5px;margin-left: 5px">&nbsp;终点站：</label>
					       <input type="text" style="width: 180px;float: left;" value="${storehouseBelaidupQueryDTO.belaidupTerminu}" 
					       name="belaidupTerminu" id="belaidupTerminu"  style="height: 23px;border-color: #c3d9e0" autocomplete="off" type="text" placeholder="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll form-control">
			               &nbsp;&nbsp;&nbsp; 
					       <button type="submit" style="margin-top: 5px" class="btn btn-primary"  
							> 查询
						   </button>
						   <!-- <button type="reset" style="margin-top: 5px" class="btn btn-primary"  
						   data-toggle="button" onclick="formreset()"> 重置
						   </button> -->
					      <table class="table table-bordered" style="text-align: left;margin-top: 10px;float: right;">
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
									<td><a href="${ctx}">详情</a>&nbsp;&nbsp;</td>
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
              </form>
            </div>  
        </div>
    </div>

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
   
   <jsp:include page="../foot.jsp"/>
   </body>
</html>
<script type="text/javascript">
$("#shorteslength").val("${storehouseBelaidupQueryDTO.shorteslength}");

//公共对话框定义
function  doDailog(Id){
	  KindEditor.ready(function(K) {
		  var dialog = K.dialog({
		        width : 500,
		        title : '发货提示',
		        body : '<div style="margin:10px;"><strong>确定删除此发货模板信息</strong></div>',
		        closeBtn : {
	                  name : '关闭',
	                  click : function(e) {
	                          dialog.remove();
	                  }
	          },
		     yesBtn : {
	                name : '确定',
	                click : function(e) {
	                	$.ajax({
	         			   type: "POST",
	         			   url: ctx + '/template/delTemplateGoods.json?&templateId='+Id,
	         			   dataType:'json',
	         			   success: function(r){
	         				 if(r.success){
	         					doDailog(r.msg);
	         					dialog.remove();
	         					location.href="${ctx}/template/index.htm?&p=1";
	         				 }
	         				 else{
	         					doDailog(r.msg);
	         					dialog.remove();
	         				 }
	         			   }
	         			 });
	                }
	        },
	        noBtn : {
	                name : '取消',
	                click : function(e) {
	                        dialog.remove();
	                }
	        }
		}); 
	  });
}
</script>
