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
  <body>
  <jsp:include page="../nav.jsp"/>
  <!-- center-center --> 
  <div class="container"> 
	 <div class="row"> 
	       <!-- 左边导航 -->
	        <div class="col-md-12" align="center" style="background-color: #E8E8E8" >
		      <img hspace="0" vspace="0" src="${pageContext.request.contextPath}/resources/images/delivery/delivery2.png">
	        </div> 
    </div>
    <div class="row"> 
	        <!-- 左边导航 -->
	        <div class="col-md-3" style="padding-left: 0px">
	          <div class="panel panel-default">
				  <div class="panel-heading">班线信息</div>
				  <div class="panel-body">
				      <table style="width: 257px">
				      <tr align="center" height="20px">
				        <td colspan="2"><font size="4" color="#0697DA" >${router.routeName}</font></td>
				      </tr> 
				      <tr height="30px">
				        <td ><font size="2" color="#0697DA">承运商:</font></td>
				        <td>${router.carrierDisplay}</td>
				      </tr>
				      <tr height="30px">
				        <td ><font size="2" color="#0697DA">起点:</font></td>
				        <td>${router.routeOrigin}</td>
				      </tr>
				      <tr height="30px">
				        <td ><font size="2" color="#0697DA">终点:</font></td>
				        <td>${router.routeStop}</td>
				      </tr>
				      <tr height="30px">
				        <td ><font size="2" color="#0697DA">在途时间:</font></td>
				        <td>${router.routeBytime}小时</td>
				      </tr> 
				      <tr height="30px">
				        <td ><font size="2" color="#0697DA">车辆箱型:</font></td>
				        <td>
				        <c:if test="${router.boxType eq 'fullClosed' }">
						              全封闭
						  </c:if>   
						  <c:if test="${router.boxType eq 'semiClosed'}">
						              半封闭
						  </c:if> 
						  <c:if test="${router.routeType eq 'air'}">
						              平板
						  </c:if>
						 </td>
				      </tr> 
				      <tr height="30px">
				         <td><font size="2" color="#0697DA">保险费：</font></td>
			             <td><fmt:formatNumber value='${router.premium}' pattern='#,#00.00'/>元</td>  
				      </tr> 
				      <tr height="30px">
				         <td><font size="2" color="#0697DA">起步价：</font></td>
			             <td><fmt:formatNumber value='${router.startingPrice}' pattern='#,#00.00'/>元</td>  
				      </tr>  
				      <tr height="30px">
				         <td><font size="2" color="#0697DA">轻货价：</font></td>
			             <td><fmt:formatNumber value='${router.lightGoodsPrice}' pattern='#,#00.00'/>元/立方</td> 
				      </tr>
				      <tr height="30px">
				         <td><font size="2" color="#0697DA">重货价：</font></td>
			             <td><fmt:formatNumber value='${router.weightGoodsPrice}' pattern='#,#00.00'/>元/公斤</td>  
				      </tr> 
				      
				      <tr height="30px">
				         <td><font size="2" color="#0697DA">运输费：</font></td>
			             <td><label id="yun"  style="color: #FF7300;border-bottom-style: solid;border-bottom-color: red;border-bottom-width: 1.5px;width: 115px">${referDelivery.addedService.transportationCost}&nbsp;元</label></td>  
				      </tr> 
				      <tr height="30px">
				         <td><font size="2" color="#0697DA">保险费：</font></td>
			             <td><label id="bao" style="color: #FF7300;border-bottom-style: solid;border-bottom-color: red;border-bottom-width: 1.5px;width: 115px">${referDelivery.addedService.insuranceCost}&nbsp;元</label></td>  
				      </tr>  <tr height="30px">
				         <td><font size="2" color="#0697DA">合  计：</font></td>
			             <td><label id="sum" style="color: #FF7300;border-bottom-style: solid;border-bottom-color: red;border-bottom-width: 1.5px;width: 115px">${referDelivery.addedService.totalCost}&nbsp;元</label></td>  
				      </tr>
				     </table> 
				  </div>
			   </div> 
			   <div align="center"> 
					<img src="${pageContext.request.contextPath}/resources/images/newbie/about001.jpg" alt="联系我们">
				 
					<img src="${pageContext.request.contextPath}/resources/images/index/weixin.jpg" width="163px" height="163" alt="联系我们">
					<p>扫描二维码关注越海物<br>流微信，获取越海物流最新动态 </p>
				 </div>
	        </div> 
	        <div class="col-md-9" > 
	       	  <div class="panel panel-default" style="width: 863px" >
					  <div class="panel-heading" style="padding-bottom: 20px">
					    <b style="size: 3">订单信息</b> &nbsp;&nbsp;订单生成成功，等待通知
					  </div>
					  <div class="panel-body" >  
					       <h3  style="text-align: center; margin-left: -150px">订单详情</h3>   
					     <table  style="border-style: none;">
				            <tr height="30px">
				              <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">货物名称:</font></td>
				              <td>${referDelivery.belaidupProdName}</td>  
				              <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">商品类型：</font></td>
				              <td>${referDelivery.goodsTypeDisplay}</td>  
				            </tr> 
				            <tr height="30px">
				              <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">起始站:</font></td>
				              <td>${referDelivery.belaidupInitiatin}</td>  
				              <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">终点站：</font></td>
				              <td>${referDelivery.belaidupTerminu}</td>  
				            </tr> 
				            <tr height="30px">
				              <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">发货人名称:</font></td>
				              <td>${referDelivery.consignor}</td>  
				              <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">联系电话：</font></td>
				              <td>${referDelivery.sendPhone}</td>  
				            </tr>  
				             <tr height="30px">
				              <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">发货站点：</font></td>
				              <td>${referDelivery.sendSite}</td>   
				              <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">发货地址:</font></td>
				              <td>${referDelivery.sendAddress}</td>  
				            </tr>  
				            
				            <tr height="30px">
				              <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">收货人名称:</font></td>
				              <td>${referDelivery.orderConsignee}</td>  
				              <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">联系电话：</font></td>
				              <td>${referDelivery.orderPhone}</td>  
				            </tr>  
				            <tr height="30px">
				              <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">收货站点：</font></td>
				              <td>${referDelivery.orderSite}</td>  
				              <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">收货地址:</font></td>
				              <td>${referDelivery.orderAddress}</td>   
				            </tr>  
				            <tr height="30px">
				              <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">支付方式:</font></td>
				              <td> 
				               <c:if test="${referDelivery.modeOfPayment eq 'reachpayment' }">
						                       到付
						       </c:if> 
				               <c:if test="${referDelivery.modeOfPayment eq 'spotpayment' }">
						                     现 付
						       </c:if>  
				              </td>  
				              <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">货物数量：</font></td>
				              <td>${referDelivery.number}</td>  
				            </tr>  
				            
				             <tr height="30px">
				              <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">上门收货：</font></td>
				              <td>
				              <c:if test="${referDelivery.addedService.doorDelivery eq 'yes' }">
						                      是
						       </c:if> 
				               <c:if test="${referDelivery.addedService.doorDelivery eq 'no' }">
						                     否
						       </c:if>  
				              </td>  
				              <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">加急配送:</font></td>
				              <td>
				              <c:if test="${referDelivery.addedService.urgentDelivery eq 'yes' }">
						                      是
						       </c:if> 
				               <c:if test="${referDelivery.addedService.urgentDelivery eq 'no' }">
						                     否
						       </c:if>  
				              </td>   
				            </tr> 
				            
				             <tr height="30px">
				              <td align="left" style="padding-left:120px;"><font size="2" color="#0697DA">短信通知：</font></td>
				              <td>
				              <c:if test="${referDelivery.addedService.message eq 'yes' }">
						                      是
						       </c:if> 
				               <c:if test="${referDelivery.addedService.message eq 'no' }">
						                     否
						       </c:if>  
				              </td>  
				              <td align="left" style="padding-left:110px;"><font size="2" color="#0697DA">送货上门:</font></td>
				              <td>
				              <c:if test="${referDelivery.addedService.deliveryVisit eq 'yes' }">
						                      是
						       </c:if> 
				               <c:if test="${referDelivery.addedService.deliveryVisit eq 'no' }">
						                     否
						       </c:if>  
				              </td>   
				            </tr> 
				            
			             </table>   
					     <div class="form-group" >
						    <label class="col-sm-3"><font size="2" color="red" style="margin-left: 105px">注意事项:</font></label>
						    <div class="col-sm-6" align="left" style="overflow-y:auto;word-break:break-all;">
						     ${referDelivery.remark}
						    </div> 
						  </div>
					<br><br>
				<center>
				<button type="button" class="btn btn-info" style="margin-bottom: 30px;width: 150px" id="sub">返回首页</button>
				</center>
					  </div>
				</div>     
		    </div>
		</div> 
		</div>  
	<jsp:include page="../foot.jsp"/> 
	<script type="text/javascript">
	$("#sub").click(function(){
		 window.location.href=ctx +"/index.htm"; 
	});
	
	</script>
</body>
</html>