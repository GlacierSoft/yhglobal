<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.LockedAccountException"%>
<%@ page import="com.glacier.basic.exception.IncorrectCaptchaException"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
					        <li  class="active"><a href="#">订单查询</a></li> 
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
      	 <form action="${ctx }/orderQuery.htm?&p=1" method="post" id="form_delivery">
                 <div class="panel panel-primary">
                    <div class="panel-heading">
    					<h3 class="panel-title">订单查询</h3>
  					</div>
					<div class="panel-body">
					      <div class="form-group col-sm-12">
							    <label for="tisp" class="control-label col-sm-1">提示</label>
							    <label for="tisp1" class="control-label col-sm-4"  style="color: #428BCA;">可凭单号进行货物跟踪查询</label>
						  </div>
					      <!-- <div class="form-group col-sm-12">
						    
						    <div class="col-sm-4">
						     </div>
						  </div>
						  <div style="float: left;">
						  	
						  	<div class="col-sm-4" style="margin-left: -30px;">
						  	
						  	</div>
						  	
						  	<div class="col-sm-4" style="margin-left: -30px;">
						  	
						  	</div>
						  </div> -->
						  
						  <table class="table table-bordered">
						  	<tr>
						  		<td><label for="orderNumber">订单号</label></td>
						  		<td colspan="3">
						  			<input type="text" placeholder="请输入订单号" class="form-control" value="${orderCodeDisplay }" name="orderCodeDisplay">
						  		</td>
						  	</tr>
						  	<tr>
						  		<td>
						  			<label for="orderNumber">起始时间</label>
						  		</td>
						  		<td>
						  			<input id="createStartTime" style="width: 260px;" class="form-control" name="createStartTime" type="text" class="inp140"  value="<fmt:formatDate value="${createStartTime }" type="date"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'createEndTime\')||\'%y-%M-%d\'}'})"/>
						  		</td>
						  		<td>
						  			<label for="orderNumber">结束时间</label>
						  		</td>
						  		<td>
						  			<input id="createEndTime" style="width: 260px;" class="form-control" name="createEndTime" type="text" class="inp140"  value="<fmt:formatDate value="${createEndTime }" type="date"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'createStartTime\')}',maxDate:'%y-%M-%d'})"/>
						  		</td>
						  	</tr>
						  	<tr>
						  		<td colspan="4" align="center"><button type="submit" class="btn btn-primary">查询</button></td>
						  	</tr>
						  	
						  </table>
					</div>
					<!-- 显示返回消息 -->
					<div id="returnTisp">
						<table class="table table-bordered" style="text-align: left;width: 910px;margin-left: 15px;">
							<thead>
								<tr>
									<th>订单编号</th><th>货物名称</th>
									<th>收货人</th><th>目的站</th>
									<th>开单日期</th><th>物流状态</th>
									<th>总费用</th><th>操作</th>
								</tr>
							</thead>
							<c:forEach items="${getDatas.rows}" var="getDatas" varStatus="status">
								<tr>
									<td>${getDatas.orderCodeDisplay}</td><td>${getDatas.belaidupProdName}</td>
									<td>${getDatas.orderConsignee}</td><td>${getDatas.belaidupTerminu}</td>
									<td><fmt:formatDate value="${getDatas.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
									<c:choose>
										   <c:when test="${getDatas.belaidupStatus == 'receiving'}">  
										   		<td>收货入库</td>
										   </c:when>
										   <c:when test="${getDatas.belaidupStatus == 'delivery'}">  
										   		<td>出库运输</td>
										   </c:when>
										   <c:when test="${getDatas.belaidupStatus == 'return'}">  
										   		<td>申请退货</td>
										   </c:when>
										   <c:when test="${getDatas.belaidupStatus == 'completed'}">  
										   		<td>退货完成</td>
										   </c:when>
										   <c:when test="${getDatas.belaidupStatus == 'wayback'}">  
										   		<td>回途中</td>
										   </c:when>
										   <c:when test="${getDatas.belaidupStatus == 'business'}"> 
										   		<td>交易完成</td> 
										   </c:when>
									</c:choose>
									<td><fmt:formatNumber value='${getDatas.belaidupUnitprice}' pattern="#,#00.00元"/></td><td>GPS功能</td>
								</tr>
							</c:forEach>
							<c:if test="${empty getDatas.rows}">
					        	<tfoot>
						          <tr>
						            <th colspan="8">
						            	<div align="right">
										    <ul id='pageorderLoad'>暂时木有数据哦~亲</ul>
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

   
   <jsp:include page="../foot.jsp"/>
  </body>
</html>
<script type="text/javascript">

/* $("#form_delivery").validate({
	 rules:{
		 codeNumber:{
			 required:true
		 }
  	 },
	 messages:{
		 codeNumber:{
			 required:"订单号不能为空!"
		 }
	 },
	 submitHandler:function(){
		 $.ajax({
			   type: "POST",
			   url: ctx+"/orderQuery.htm?&p=1",
			   dataType: "json",
			   data: $("#form_delivery").serialize(),
			   /* success: function(r) {
			   	   }, 
              error: function() {
                 alert("提交出错！");
              }
		 });
	 }
}); */

//分页代码开始
var elementpageorderLoad = $('#pageorderLoad');
//登陆用户订单的设置分页的总页数
var totalmessageNotice=${getDatas.total}/10;
if(parseInt(totalmessageNotice)==totalmessageNotice){
	var totalmessageNotice = parseInt(totalmessageNotice);
}else {
	var totalmessageNotice = parseInt(totalmessageNotice)+1;
}
var messageNoticeOptions = {
    bootstrapMajorVersion:3,
    currentPage: ${getDatas.p},
    numberOfPages: 10,
    totalPages:totalmessageNotice,
    pageUrl: function(type, page, current){
    	return "${ctx}/orderQuery.htm?&p="+page;
    }
}
elementpageorderLoad.bootstrapPaginator(messageNoticeOptions);

<!-- 分页显示表格数据 结束 -->
</script>
