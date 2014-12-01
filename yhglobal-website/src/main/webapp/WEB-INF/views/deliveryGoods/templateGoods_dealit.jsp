<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.LockedAccountException"%>
<%@ page import="com.glacier.basic.exception.IncorrectCaptchaException"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
					         <li  class="active"><a href="${ctx}/delivery/index.htm">我要发货</a></li>
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
      	 <form action="" method="post" id="form_delivery">
                 <div class="panel panel-primary">
                    <div class="panel-heading">
    					<h3 class="panel-title">发货模板管理</h3>
  					</div>
					<div class="panel-body">
						<div class="form-group col-sm-12">
						    <label for="templatename" class="control-label col-sm-1" style="width: 90px;">模板名称</label>
						    <div class="col-sm-4">
						      <input type="text" placeholder="请填写模板名称" class="form-control" readonly="readonly" name="templatename" value="${templateDate.templatename}">
						    </div>
						</div>
						<!-- 收货地 -->
				      	<div class="panel panel-default" style="width: 430px;height: 280px;float: left;">
				      	  <input type="hidden" id="templateid" name="templateid" value="${templateDate.templateid}" />
						  <div class="panel-heading">收货地</div>
						  <div class="form-group col-sm-12" style="margin-top: 10px;">
						    <label for="receivingarea" style="float: left;margin-top: 10px;">所在地区</label>
						    <div class="col-sm-4">
						        <input type="text" style="width: 265px;float: left;height: 35px;border-color: #c3d9e0;" name="receivingarea" value="${templateDate.receivingarea}" readonly="readonly" autocomplete="off" type="text" placeholder="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll form-control">
							</div>
						  </div>
						  <div class="form-group col-sm-12">
						    <label for="receivingaddress" style="float: left;margin-top: 5px;">详细地址</label>
						    <div class="col-sm-4">
						    	<input type="text" placeholder="请填写详细地址" class="form-control" name="receivingaddress" value="${templateDate.receivingaddress}" readonly="readonly" style="width: 265px;">
							</div>
						  </div>
						 </div>
						 
						 <!-- 发货地 -->
				      	 <div class="panel panel-default" style="width: 430px;height: 280px;float: left;margin-left: 20px;">
						  <div class="panel-heading">发货地</div>
						  <div class="form-group col-sm-12" style="margin-top: 10px;">
						    <label for="deliveryarea" style="float: left;margin-top: 10px;">所在地区</label>
						    <div class="col-sm-4">
						        <input type="text" style="width: 265px;float: left;height: 35px;border-color: #c3d9e0;" name="deliveryarea" readonly="readonly" value="${templateDate.deliveryarea}" autocomplete="off" type="text" placeholder="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll form-control">
							</div>
						  </div>
						  <div class="form-group col-sm-12" >
						    <label for="deliveryaddress2" style="float: left;margin-top: 5px;">详细地址</label>
						    <div class="col-sm-4">
						    	<input type="text" placeholder="请填写详细地址" class="form-control" name="deliveryaddress2" readonly="readonly" value="${templateDate.deliveryaddress2}" style="width: 265px;">
							</div>
						  </div>
						  <div class="form-group col-sm-12" >
						    <label for="receivingaddress" style="float: left;margin-top: 5px;">交易电话</label>
						    <div class="col-sm-4">
						    	<input type="text" placeholder="请填写交易电话" class="form-control" name="tradingphone" readonly="readonly" value="${templateDate.tradingphone}" style="width: 265px;">
							</div>
						  </div>
						  <div class="form-group col-sm-12" >
						    <label for="receivingaddress" style="float: left;margin-top: 5px;">交易手机</label>
						    <div class="col-sm-4">
						    	<input type="text" placeholder="请填写交易手机" class="form-control" name="tradingcellphone" readonly="readonly" value="${templateDate.tradingcellphone}" style="width: 265px;">
							</div>
						  </div>
						 </div>
						 
						 <!-- 货物信息 -->
				      	<div class="panel panel-default" style="width: 430px;height: 330px;float: left;">
						  <div class="panel-heading">货物信息</div>
						  <div class="form-group col-sm-12" style="margin-top: 10px;">
						    <label for="goodstypeid" style="float: left;margin-top: 10px;">货物类型</label>
						    <div class="col-sm-4">
						    	<select class="form-control col-sm-6" name="goodstypeid" readonly="readonly" id="goodstypeid" style="width: 265px;">
							    	<c:forEach items="${goodstypeList}" var="goodstype">
									  	<option value="${goodstype.goodstypeId }">${goodstype.goodstypeName }</option>
									 </c:forEach>
								</select>
							</div>
						  </div>
						  <div class="form-group col-sm-12">
						    <label for="belaidupprodname" style="float: left;margin-top: 5px;">货物名称</label>
						    <div class="col-sm-4">
						    	<input type="text" placeholder="请填写货物名称" class="form-control" readonly="readonly" name="belaidupprodname" value="${templateDate.belaidupprodname}" style="width: 265px;">
							</div>
						  </div>
						  <div class="form-group col-sm-12">
						    <label for="belaidupweight" style="float: left;margin-top: 5px;">重量(吨)</label>
						    <div class="col-sm-4">
						    	<input type="text" class="form-control" name="belaidupweight" readonly="readonly" value="${templateDate.belaidupweight}" style="width: 165px;">
							</div>
						  </div>
						  <div class="form-group col-sm-12">
						    <label for="belaidupbulk" style="float: left;margin-top: 5px;">体积(方)</label>
						    <div class="col-sm-4">
						    	<input type="text" class="form-control" name="belaidupbulk" readonly="readonly" value="${templateDate.belaidupbulk}" style="width: 165px;">
							</div>
						  </div>
						  <div class="form-group col-sm-12">
						    <label for="belaidupnumber" style="float: left;margin-top: 5px;">数量(件)</label>
						    <div class="col-sm-4">
						    	<input type="text" class="form-control" name="belaidupnumber" readonly="readonly" value="${templateDate.belaidupnumber}" style="width: 165px;">
							</div>
						  </div>
						 </div>
						 
						 <!-- 车辆要求 -->
				      	<div class="panel panel-default" style="width: 430px;height: 330px;float: left;margin-left: 20px;">
						  <div class="panel-heading">车辆要求</div>
						  <div class="form-group col-sm-12" style="margin-top: 10px;">
						    <label for="cartypeid" style="float: left;margin-top: 5px;">车辆类型</label>
						    <div class="col-sm-4">
						    	<select class="form-control col-sm-6" name="cartypeid" readonly="readonly" id="cartypeid" style="width: 265px;">
							    	<c:forEach items="${CarrierCarTypeList}" var="CarrierCarType">
									  	<option value="${CarrierCarType.cartypeId }">${CarrierCarType.cartypeName }</option>
									 </c:forEach>
								</select>
							</div>
						  </div>
						  <div class="form-group col-sm-12" style="margin-top: 10px;">
						    <label for="serviceType" style="float: left;margin-top: 5px;">运送服务</label>
						    <div class="col-sm-4">
						    	<select class="form-control col-sm-6" name="serviceType" readonly="readonly" id="serviceType" style="width: 265px;">
									  	<option value="all">整装</option>
									  	<option value="partial">零装</option>
								</select>
							</div>
						  </div>
						  <div class="form-group col-sm-12">
						    <label for="length" style="float: left;margin-top: 5px;">车长(米)</label>
						    <div class="col-sm-10">
						    	<input type="text" placeholder="请填写开始长度" class="form-control" readonly="readonly" name="lengthstart" value="${templateDate.lengthstart}" style="width: 100px;">
						    	<div style="margin-top: -35px;margin-left: 100px;">
							    	<font style="float: left;margin-top: 5px;">&nbsp;到&nbsp;</font>
							    	<input type="text" placeholder="请填写结束长度" class="form-control" readonly="readonly" name="lengthstop" value="${templateDate.lengthstop}" style="width: 100px;float: left;">
						    	</div>
							</div>
						  </div>
						 </div>
					</div>
                 </div>
              </form>
            </div>  
        </div>
    </div>

   
   <jsp:include page="../foot.jsp"/>
   
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
   </body>
</html>

<script type="text/javascript">
$("#cartypeid").val('${templateDate.cartypeid}');
$("#goodstypeid").val('${templateDate.goodstypeid}');
$("#serviceType").val('${templateDate.serviceType}');
</script>
