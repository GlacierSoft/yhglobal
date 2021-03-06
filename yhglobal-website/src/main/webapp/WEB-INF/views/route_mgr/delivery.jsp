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
	　　$(document).ready(function(){ 
	　　    $(window).scroll(function (){
	　　    	var offsetTop;
	        // 让浮动层距离窗口顶部 
	        if($(window).scrollTop()==0){
	        	  offsetTop = $(window).scrollTop() -0+"px";
	        }else{
	        	  offsetTop = $(window).scrollTop() -80+"px";
	        } 
	                 
	　　          $("#kk").animate({top : offsetTop },{ duration:500 , queue:false });
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
	        <div class="col-md-12" align="center" style="background-color: #E8E8E8" >
		      <img hspace="0" vspace="0" src="${pageContext.request.contextPath}/resources/images/delivery/delivery.png">
	        </div> 
    </div>
    <div class="row"> 
	        <!-- 左边导航 -->
	        <div class="col-md-3" style="padding-left: 0px;"  >
	          <div id="kk" class="panel panel-default" style="position: relative;top:0px;width: 267px">
				  <div class="panel-heading">班线信息</div>
				  <div class="panel-body" >
				  <input type="hidden" id="routeId" value="${router.routerId}"> 
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
						  <c:if test="${router.boxType eq 'flat'}">
						              平板
						  </c:if>
						 </td>
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
			             <td><label id="yun"  style="color: #FF7300;border-bottom-style: solid;border-bottom-color: red;border-bottom-width: 1.5px;width: 115px">0.00&nbsp;元</label></td>  
				      </tr> 
				      <tr height="30px">
				         <td><font size="2" color="#0697DA">保险费：</font></td>
			             <td><label id="bao" style="color: #FF7300;border-bottom-style: solid;border-bottom-color: red;border-bottom-width: 1.5px;width: 115px">0.00&nbsp;元</label></td>  
				      </tr>  <tr height="30px">
				         <td><font size="2" color="#0697DA">合  计：</font></td>
			             <td><label id="sum" style="color: #FF7300;border-bottom-style: solid;border-bottom-color: red;border-bottom-width: 1.5px;width: 115px">0.00&nbsp;元</label></td>  
				      </tr> 
				     </table>
				      
				  </div> 
				  
			   </div> 
			  
	        </div> 
	        <div class="col-md-9" > 
	        <form class="form-horizontal" role="search" method="post"  id="personalMessageForm" action="" >
		  	<input type="hidden" name="routerId" value="${router.routerId}">
				  <div class="panel panel-default" style="width: 863px" >
					  <div class="panel-heading">
					    <b style="size: 3">发货方</b> &nbsp;&nbsp;填写完整、准确信息，物流跟进更及时
					  </div>
					  <div class="panel-body">
					     <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" >发货区:</label>
						    <div class="col-sm-4" align="left">
						      <input type="hidden" name="belaidupInitiatin" value="${router.routeOrigin}">
						      <label for="inputEmail3" style="color:#0697DA ">${router.routeOrigin}</label> 
						    </div> 
						 </div>
					     <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label"><font color="red">*</font>联系人:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text"  class="form-control" placeholder="请输入发货人姓名"  name="consignor">
						    </div> 
						  </div>
						  <div class="form-group"  >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>联系电话:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text" class="form-control"   placeholder="请输入发货人联系电话" name="sendPhone" >
						    </div> 
						  </div>
						 <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>所在街道地址:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text" class="form-control"  placeholder="请输入所在街道地址" name="sendAddress">
						    </div> 
						  </div>
					  </div>
				</div>
				<div class="panel panel-default" style="width: 863px" >
					  <div class="panel-heading">
					    <b style="size: 3">收货方</b> &nbsp;&nbsp;为了您货物安全，请填写完整、准确信息
					  </div>
					  <div class="panel-body">
					      <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" >收货区:</label>
						    <input type="hidden" name="belaidupTerminu" value="${router.routeStop}">
						    <div class="col-sm-6" align="left">
						      <label for="inputEmail3" style="color:#0697DA ">${router.routeStop}</label> 
						     </div> 
						  </div>
					     <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>联系人:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text" class="form-control"  name="orderConsignee"  placeholder="请输入收货人姓名" >
						    </div> 
						  </div>
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>联系电话:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text" maxlength="15" class="form-control"  name="orderPhone" onkeyup="this.value=this.value.replace(/\D/g,'')" placeholder="请输入收货人联系电话" >
						    </div> 
						  </div>
						  <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>所在街道地址:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text" class="form-control" name="orderAddress" placeholder="请输入所在街道地址" >
						    </div> 
						  </div>
					  </div>
				</div>
				<div class="panel panel-default" style="width: 863px" >
					  <div class="panel-heading">
					    <b style="size: 3">选择网点</b> &nbsp;&nbsp;选择附近的网点，物流跟进更及时
					  </div>
					  <div class="panel-body">
					     <div class="form-group" >
						   <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>发货网点:</label>
						   <div class="col-sm-6" align="left">
						   <select class="form-control" name="sendSite" onchange="selectDeliver()" id="sendSite">
							  <option  value="">--请选择--</option> 
							  <c:forEach items="${router.deliverList}" var="deliver">  
					            <option  name="${deliver.address}" class="${deliver.telephone}" id="${deliver.deliverGoodsAreaId}" value=" ${deliver.deliverName}"> ${deliver.deliverName} </option>
		                       </c:forEach>  
							</select>
							<div id="info" style="color:#FF7300"></div>
						    </div> 
						  </div>
						  <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>收货网点:</label>
						    <div class="col-sm-6" align="left">
						    <select class="form-control" name="orderSite" onchange="selectPickUp()"  id="orderSite">
							  <option value="">--请选择--</option>
							  <c:forEach items="${router.pickUpList}" var="deliver">  
					            <option name="${deliver.address}" class="${deliver.telephone}" id="${deliver.pickUpGoodsAreaId}" value="${deliver.deliverName}"> ${deliver.deliverName} </option>
		                       </c:forEach>  
							</select>
							<div id="infos" style="color:#FF7300"></div>
						    </div> 
						  </div> 
					  </div>
				</div>
				<div class="panel panel-default" style="width: 863px" > 
					  <div class="panel-heading">
					    <b style="size: 3">货物信息</b> &nbsp;&nbsp;填写货物信息，便于保证运输中不出现损坏
					  </div>
					  <div class="panel-body">
					     <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label"><font color="red">*</font>货物名称:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text" class="form-control" name="belaidupProdName"  placeholder="请输入物品名称" >
						    </div> 
						    <a href="${ctx}/contrabandExplain.htm" style="color: #FF7300">禁运品说明</a>
						  </div>
						  <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>包装总件数:</label>
						    <div class="col-sm-6" align="left">
						     <input type="text" class="form-control"  name="number" placeholder="请输入物品包装件数" >
						    </div> 
						    <div class="col-sm-3" ></div>
						  </div>
						  <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>货物类型:</label>
						    <div class="col-sm-6" align="left">
						       <select class="form-control" name="goodstype" id="goodstype" onchange="getId()">
							      <option value="">--请选择--</option>
								    <c:forEach items="${storehouseGoodstype}" var="ty">  
						             	<option id="${ty.goodstypeId}" >${ty.goodstypeName}</option>
								    </c:forEach>   
						    	</select>
						    	<input type="hidden" id="goodstypeId" name="goodstypeId" >
						    </div> 
						    <div class="col-sm-3" ></div>
						  </div>
						  
						  <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>包装类型:</label>
						    <div class="col-sm-6" align="left">
						       <select class="form-control" name="packageDisplay"  >
							      <option value="">--请选择--</option>
								    <c:forEach items="${storehousePackagetype}" var="ty">  
						             	<option value="${ty.packagetypeId}" >${ty.packagetypeName}</option>
								    </c:forEach>   
						    	</select> 
						    </div> 
						    <div class="col-sm-3" ></div>
						  </div>
						  
						  <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" >取货方式:</label>
						    <div class="col-sm-6" align="left">
						      <select class="form-control" name="replenishment">
							    <option value="storepickup">上门取货</option>  
							    <option value="deliversm">送货上门</option>  
							  </select>
						    </div> 
						    <div class="col-sm-3" ></div>
						  </div>  
						  <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" >总重量:</label>
						    <div class="col-sm-2" align="left">
						      <input id="zhong" type="text" class="form-control" name="belaidupWeight"  placeholder="公斤" onkeyup="value=value.replace(/[^\d.]/g,'')" onafterpaste="this.value=this.value.replace(/[^/d]/g,'') ">
						    </div>  
						    <label for="inputEmail3"  class="col-sm-2 control-label" ><font color="#FF7300">或</font>    &nbsp;&nbsp;&nbsp;&nbsp;总体积:</label> 
						    <div class="col-sm-2" align="left">
						       <input id="qing" type="text" class="form-control" name="belaidupBulk"  placeholder="立方米" onkeyup="value=value.replace(/[^\d.]/g,'')" onafterpaste="this.value=this.value.replace(/[^/d]/g,'') ">
						    </div> 
						     <a href="${ctx}/weightExplain.htm" target=_blank style="color: #FF7300">什么是重货轻货？</a>
						  </div> 
						  <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" style="padding-left: 122px">注意事项:</label>
						    <div class="col-sm-6" align="left">
						      <textarea class="form-control" name="remark" rows="2"></textarea>
						    </div> 
						    <div class="col-sm-3" ></div>
						  </div> 
					  </div>
				</div>
				
				<div class="panel panel-default" style="width: 863px" >
					  <div class="panel-heading">
					    <b style="size: 3">增值服务</b> &nbsp;&nbsp;<a href="${ctx}/collectFees.htm" target=_blank style="color: #FF7300">查看收费标准</a>
					  </div>
					  <div class="panel-body">
					     <div class="form-group" >
						     <div class="col-sm-12"> 
							     <div class="checkbox" style="float: left;margin-left: 150px">
								    <label>
								      <input type="checkbox" name="urgentDelivery" value="yes"> 加急配送 
								    </label>
								  </div>
								     <div class="checkbox" style="float: left;margin-left: 30px">
								    <label>
								      <input type="checkbox" name="deliveryVisit" value="yes"> 送货上门
								    </label>
								  </div>  
								  <div class="checkbox" style="float: left;margin-left: 30px">
								    <label>
								      <input type="checkbox" name="doorDelivery" value="yes"> 上门接货
								    </label>
								  </div>  
						    </div> 
						  </div>
						   <div class="form-group" >
							     <div class="col-sm-12" style="float: left;"> 
							     <div class="checkbox" style="float: left;margin-left: 150px" >
								    <label style="float: left;">
								      <input type="checkbox" checked="checked" disabled="disabled" name="message" value="yes"> 短信通知<font color="#669900">(免费)</font>
								    </label>
								  </div>
								  <div class="checkbox" style="float: left;margin-left: 58px">
								    <label>
								      <input type="checkbox" name="signReceipt" value="yes"> 签收回单&nbsp; &nbsp;
								    </label>
								  </div> 
								 <select class="form-control" style="width: 183px;float: left" name="signReceiptType">
								  <option value="waybill">运单签收联原件返回</option> 
								  <option value="invoice">发货单签收联原件返回</option> 
								</select> 
							    </div> 
						   </div> 
						      <input type="hidden" name="modeOfPayment"    value="spotpayment">
										  
						   <!-- <div class="form-group" >
							  <div class="col-sm-12" style="float: left;">
							      <div class="checkbox" style="float: left; margin-left: 150px">
								    <label>
								      <input type="checkbox" checked="checked" disabled="disabled">工本费<font color="red">(6元)</font>
								    </label>
								  </div>
								  <div class="checkbox" style="float: left;margin-left: 78px">
								    <label>
								     <input type="checkbox" checked="checked" disabled="disabled">燃油费<font color="red">(4元)</font>
								    </label>
								  </div>
							   </div>  -->
						     <!--   <div class="form-group" >
						         <label for="inputEmail3" class="col-sm-3 control-label" >支付方式:</label>
							     <div class="col-sm-6" style="float: left;"> 
								     <div class="radio" style="float: left;">
										  <label>
										    <input type="radio" name="modeOfPayment"  checked="checked"  value="spotpayment">
										          发货人支付
										   </label>
									  </div> 
									  <div class="radio" style="float: left;">
										  <label>
										    <input type="radio" name="modeOfPayment"   value="reachpayment">
										        收货人支付（到付）
										   </label>
									  </div>
							     </div>
						    </div>   -->
						    <div class="form-group" >
						     <label for="inputEmail3" class="col-sm-3 control-label" >货物价值:</label>
							     <div class="col-sm-9" style="float: left;"> 
							      <input  id="price"  type="text" class="form-control" style="width: 100px;float: left;" name="goodsCost" onkeyup="value=value.replace(/[^\d.]/g,'')" onafterpaste="this.value=this.value.replace(/[^/d]/g,'') ">
							      <div class="checkbox" style="float: left;margin-left: 20px">
								    <label>
								      <input id="check1" type="checkbox" name="insurance"  value="yes" onchange="javaScript:prem(this)">购买货运险（中国平安承保，费率1.5‰，最低3元起）<a href="${ctx}/insuranceExplain.htm" target=_blank style="color: #FF7300">投保协议</a>
								    </label>
								   </div> 
							      </div>
							</div> 
					  </div>
				</div> 
				<center>
				<button type="button" class="btn btn-info" style="margin-bottom: 30px;width: 150px" id="sub">提交运单</button>
				</center>
				</div>
				<input type="hidden" value="route" name="type">
				<input id="insuranceCost" type="hidden" value="3.00" name="insuranceCost">
				<input id="transportationCost" type="hidden" value="0.00"  name="transportationCost">
				<input id="totalCost" type="hidden" value="0.00"  name="totalCost">
				
				</form>
		    </div>
		</div> 
		</div>
	 
		 <!-- 模态框（Modal） -->
		<div  class="modal fade" id="myModal" tabindex="-1" role="dialog"  
			   aria-labelledby="myModalLabel" aria-hidden="true">
			   <div style="position: absolute; top: 25%; left: 30%;" class="modal-dialog">
			      <div class="modal-content">
			         <div class="modal-header">
			            <button type="button" class="close" 
			               data-dismiss="modal" aria-hidden="true">
			                  &times;
			            </button>
			            <h4 class="modal-title" id="myModalLabel">
			                                  温馨提示
			            </h4>
			         </div>
			         <div class="modal-body" style="color:#0697DA " > 
			        <img width="87px" height="87px" hspace="0" vspace="0" src="${pageContext.request.contextPath}/resources/images/delivery/80e.png">
	                                               请认真核对所填信息，信息一经提交不可更改哟~
			         </div>
			         <div class="modal-footer">
			            <button type="button" class="btn btn-primary " 
			               data-dismiss="modal" onclick="sub()">确认
			            </button>
			            <button type="button" class="btn  btn-default" data-dismiss="modal">
			                                  取消
			            </button>
			         </div>
			      </div> 
			</div> 
		</div>
		 
		<!-- 模态框（Modal） -->
		<div  class="modal fade" id="mymsg" tabindex="-1" role="dialog"  
			   aria-labelledby="myModalLabel" aria-hidden="true">
			   <div style="position: absolute; top: 25%; left: 30%;" class="modal-dialog">
			      <div class="modal-content">
			         <div class="modal-header">
			            <button type="button" class="close" 
			               data-dismiss="modal" aria-hidden="true">
			                  &times;
			            </button>
			            <h4 class="modal-title" id="myModalLabel">
			                温馨提示
			            </h4>
			         </div>
			         <div class="modal-body" style="color:#0697DA "  id="msg"> 
			         </div> 
			         <div class="modal-footer"> 
			            <button type="button" class="btn  btn-primary" data-dismiss="modal">
			                                    确认
			            </button>
			         </div>
			      </div> 
			 </div> 
		</div> 
	<jsp:include page="../foot.jsp"/> 
	<script type="text/javascript"> 
	var sum=0;//费用总额
	var lighPrice=0;//计算轻货的价格
	var weightPrice=0;//计算重货的价格
	var insuranceCost=0;//保险费
	var yunPrice=0; //运输费
	//计算是否采用重货还是轻货价
	$("#qing").change(function(){
		var qing=$(this).val();
		lighPrice=qing*${router.lightGoodsPrice};
		var zhong=$("#zhong").val();
	    weightPrice=zhong*${router.weightGoodsPrice};
		$("#yun").empty(); 
		$("#sum").empty(); 
		if((lighPrice-0)>(weightPrice-0)){
			yunPrice=lighPrice;
			sum=yunPrice+insuranceCost; 
		}else{
			yunPrice=weightPrice;
			sum=yunPrice+insuranceCost; 
		} 
		$("#yun").append(yunPrice.toFixed(2)+"&nbsp;元"); 
		$("#sum").append(sum.toFixed(2)+"&nbsp;元");
		$("#transportationCost").attr("value",yunPrice.toFixed(2));
		$("#totalCost").attr("value",sum.toFixed(2));
	});
	
	$("#zhong").change(function(){
		var zhong=$(this).val();
		weightPrice=zhong*${router.weightGoodsPrice};
		var qing=$("#qing").val();
		lighPrice=qing*${router.lightGoodsPrice};
		$("#yun").empty(); 
		$("#sum").empty(); 
		if((lighPrice-0)>(weightPrice-0)){
			yunPrice=lighPrice;
			sum=yunPrice+insuranceCost;
		}else{
			yunPrice=weightPrice;
			sum=yunPrice+insuranceCost; 
		} 
		$("#yun").append(yunPrice.toFixed(2)+"&nbsp;元"); 
		$("#sum").append(sum.toFixed(2)+"&nbsp;元");
		$("#transportationCost").attr("value",yunPrice.toFixed(2));
		$("#totalCost").attr("value",sum.toFixed(2));
	});
	
	//计算保险费
	function prem(info){ 
		var check =document.getElementById("check1").checked;  
		var price=$("#price").val();
		$("#bao").empty();
		$("#sum").empty();   
		if(check==true){
			insuranceCost=price*0.0015;
			if((insuranceCost-0)<3){
				insuranceCost=3;
			} 
			sum=yunPrice+insuranceCost;
			$("#bao").append(insuranceCost.toFixed(2)+"&nbsp;元");   
		}else{  
			sum=yunPrice;
		   $("#bao").append("0.00&nbsp;元");  
		}
		$("#sum").append(sum.toFixed(2)+"&nbsp;元");
		//保险费放入隐藏域中
		$("#insuranceCost").attr("value",insuranceCost.toFixed(2)); 
		$("#totalCost").attr("value",sum.toFixed(2));
	}
	 
	$("#price").change(function(){
		var check =document.getElementById("check1").checked;  
		var price=$(this).val();
		$("#bao").empty();
		$("#sum").empty();   
		if(check==true){
			insuranceCost=price*0.0015;
			if((insuranceCost-0)<3){
				insuranceCost=3;
			} 
			sum=yunPrice+insuranceCost;
			$("#bao").append(insuranceCost.toFixed(2)+"&nbsp;元");   
		}else{
			$("#bao").append("0.00&nbsp;元");
		}
		$("#sum").append(sum.toFixed(2)+"&nbsp;元");
		//保险费放入隐藏域中
		$("#insuranceCost").attr("value",insuranceCost.toFixed(2));
		$("#totalCost").attr("value",sum.toFixed(2));
	});
	
	//提交表单
	function sub(){
		  $.ajax({
			   type: "POST",
			   url: ctx + '/delivery/addBelaidup.json',
			   data: $("#personalMessageForm").serialize(),
			   dataType:'json',
			   success: function(r){
				   $("#msg").empty();
				   $("#msg").text(r.msg); 
				   $('#mymsg').modal('show');   
				   hiden(r); 
			   }
   	     });
	} 
	//隐藏消息提示层，如果是未登录的，直接转到登录页面
	function hiden(r){ 
		 
		     var text=$("#msg").text(); 
		     if(text== "请先登录，再操作！"){ 
				 window.location.href=ctx +"/login.htm"; 
			 }
		     if(r.success){ 
		    	 var routeId=$("#routeId").attr("value");
		    	 send(routeId);
			   }
		   //  $('#mymsg').modal('hide');  
	} 
	
	$("#sub").click(function(){
		 $("#personalMessageForm").submit();
	});
	 
	$("#personalMessageForm").validate({ 
		   rules:{
			  consignor:"required",
			  sendPhone:{
	    			 required:true,
	    			 number:true,
	    			 isMobile:true
	    		 }, 
	    	 packageDisplay:"required",
	    	  sendAddress:"required",
	    	  goodsCost:"required",
	    	  orderAddress:"required",
	    	  sendSite:"required",
	    	  orderSite:"required",
			  orderConsignee:"required",
			  belaidupProdName:"required", 
			  number:{
				     required:true,
	    			 number:true,
	    			 min:1 
			  },
			  goodstype:"required",
			  orderPhone:{
	    			 required:true,
	    			 number:true,
	    			 isMobile:true
	    		 },  
  		  },
  		  messages:{
  			consignor:"请输入发货人姓名",
  			sendSite:"请选择发货网点",
  			goodsCost:"请填写货物价值",
  			belaidupProdName:"请输入货物名称",
  			packageDisplay:"请选择包装类型",
  			orderSite:"请选择收货网点",
  			sendAddress:"请输入发货地详细地址",
  			orderAddress:"请输入收货地详细地址", 
  		    number:{
			     required:"件数不能为空",
    			 number:"请输入数字",
    			 min:"数量至少为1"
		    },
  			sendPhone:{
    			required:"发货人手机不能为空!",
 	    		number:"请输入合法手机号码!",
 	    		isMobile:"请输入合法手机号码!"
    		 },
  			orderConsignee: "请输入收货人姓名", 
  			goodstype:"请选择货物类型",
  			orderPhone:{
    			required:"收货人手机不能为空!",
 	    		number:"请输入合法手机号码!",
 	    		isMobile:"请输入合法手机号码!"
    		 },
  		  },  
		  submitHandler:function(){     
			  $('#myModal').modal('show')
		  }
	  });
	    
	//发货区域
	function selectDeliver(){  
	  var str=$("#sendSite option:selected");
	  var address=$(str).attr("name");
	  var telephone=$(str).attr("class");
	  var id=$(str).attr("id");  
	  if(typeof(id) == "undefined"){
		  $("#info").empty();
	  }else{
	  $("#info").empty();
	  $("#info").append(address+"&nbsp;&nbsp;&nbsp;&nbsp;电话："+telephone+"&nbsp;&nbsp;&nbsp;&nbsp;"+
	  "<a href='${ctx}/delivery/address.htm?type=deliver&id="+id+"' target=_blank style='color:blue'>查看地图</a>");
	  }
	 }
	
	//收货区域
	function selectPickUp(){
	  var str=$("#orderSite option:selected");
	  var address=$(str).attr("name"); 
	  var telephone=$(str).attr("class");
	  var id=$(str).attr("id");
	  if(typeof(id) == "undefined"){
		  $("#infos").empty();
	  }else{
	  $("#infos").empty();
	  $("#infos").append(address+"&nbsp;&nbsp;&nbsp;&nbsp;电话："+telephone+"&nbsp;&nbsp;&nbsp;&nbsp;"+
	  "<a href='${ctx}/delivery/address.htm?type=pickUp&id="+id+"' target=_blank style='color:blue'>查看地图</a>");
	 }
	}
	
	//获取货物类型的id
	function getId(){ 
		var id=$("#goodstype option:selected").attr("id");
		$("#goodstypeId").attr("value",id);
	}
	
	//构建表单,进入发货页面
	function send(str){
		// 创建Form  
	    var form = $('<form></form>');  
		// 设置属性  
	    form.attr('action', '<%=basePath%>delivery/referDelivery.htm');  
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