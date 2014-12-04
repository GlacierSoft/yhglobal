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
		      <img hspace="0" vspace="0" src="${pageContext.request.contextPath}/resources/images/delivery/delivery4_2.png">
	        </div> 
    </div>
     <div class="row" style="margin-top: 15px;padding-top:15px; height: 65px;background-color: #ddf0f9"> 
	       <!-- 左边导航 -->
	        <div class="col-md-3" align="center" style="" >
	                        <select class="form-control" name="replenishment" id="selectRoute">
							    <option  value="create_time" class="desc">默认排序</option>    
							    <option value="starting_price" class="asc">起步价由低到高</option>  
							    <option value="starting_price" class="desc">起步价由高到低</option>   
							    <option value="light_goods_price" class="asc">轻货单价由低到高</option>  
							    <option value="light_goods_price" class="desc">轻货单价由高到低</option>  
							    <option value="weight_goods_price" class="asc">重货单价由低到高</option> 
							    <option value="weight_goods_price" class="desc">重货单价由高到低</option> 
							    <option value="route_bytime" class="asc">运输时效由短到长</option>  
							    <option value="route_bytime" class="desc">运输时效由长到短</option>   
							  </select>
		      </div> 
		      <div class="col-md-1">
	                <button type="button" class="btn btn-warning"  onclick="sendInfo('starting_price','desc')">&nbsp;起步价↓&nbsp;&nbsp;</button>
		      </div> 
		       <div class="col-md-1">
	                <button type="button" class="btn btn-warning" onclick="sendInfo('light_goods_price','desc')">轻货单价↓</button>
		      </div> 
		      <div class="col-md-1">
	                 <button type="button" class="btn btn-warning" onclick="sendInfo('weight_goods_price','desc')">重货单价↓</button>
		      </div> 
		       <div class="col-md-1">
	               <button type="button" class="btn btn-warning" onclick="sendInfo('route_bytime','desc')">运输时效↓</button>
		      </div> 
		         
		       <div class="col-md-5" align="right">
	              共找到<font color="#FF7300">${routerDatas.total}</font>条线路
		      </div>   
    </div>
    <div class="row">  
    <table class="table table-hover" style="text-align: center;">
    <thead  >
	    <tr align="center">  
		    <th style="text-align: center;">承运商</th> 
		    <th style="text-align: center;">班线类型</th>
		    <th style="text-align: center;">起/终点</th>
		    <th style="text-align: center;">运输时效</th>
		    <th style="text-align: center;">价格</th>
		     <th style="text-align: center;"></th>
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
            <td style="padding-top: 23px">${router.carrierDisplay}</td> 
            <td style="padding-top: 23px">
                    <c:if test="${router.routeType eq 'landCarriage' }">
						              陆运
						  </c:if>   
						  <c:if test="${router.routeType eq 'seaTransportation'}">
						              海运
						  </c:if> 
						  <c:if test="${router.routeType eq 'air'}">
						              空运
					  </c:if>
            
            </td>
            <td style="color: #999;font-size: 3;padding-top: 15px">从：<font color="#FF7300">${router.routeOrigin}</font> <br>
                                                  到：<font color="#FF7300">${router.routeStop}</font>
            </td>
            <td style="color: #999;font-size: 3;padding-top: 15px" >
                 <font color="#FF7300">${router.routeBytime}</font>小时<br>
                                                    箱型：<font color="#FF7300">
                           <c:if test="${router.boxType eq 'fullClosed' }">
						              全封闭
						  </c:if>   
						  <c:if test="${router.boxType eq 'semiClosed'}">
						              半封闭
						  </c:if> 
						  <c:if test="${router.routeType eq 'air'}">
						              平板
						  </c:if>                  
                    </font> 
            </td> 
            <td style="color: #999;font-size: 3"> 
                                         起步价：<font color="#FF7300"><fmt:formatNumber value='${router.startingPrice}' pattern='#,#00.00'/></font>元&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>
                                        轻货价：<font color="#FF7300"><fmt:formatNumber value='${router.lightGoodsPrice}' pattern='#,#00.00'/></font>元/立方<br>
                                        重货价：<font color="#FF7300"><fmt:formatNumber value='${router.weightGoodsPrice}' pattern='#,#00.00'/></font>元/公斤<br>
            </td>
          	<td style="padding-top: 18px">
          	           <button type="button" onclick="send('${router.routerId}')" class="btn btn-warning">发货</button>
             </td>
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
  
   <!-- 模态框（Modal） -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"  
			   aria-labelledby="myModalLabel" aria-hidden="true" >
			   <div class="modal-dialog" >
			      <div class="modal-content" style="width: 800px;height: auto;">
			         <!-- 保存数据到数据库 -->
                     <form method="post" id="fom" class="form-horizontal" action="${ctx}/delivery/add.htm">
			         <div class="modal-header">
			            <button type="button" class="close" 
			               data-dismiss="modal" aria-hidden="true">
			                  &times;
			            </button>
			            <h4 class="modal-title" id="myModalLabel">
			                                 完善发货信息
			            </h4>
			         </div>
			         <div class="modal-body" style="float: left;width: 780px;height:auto;"> 
                        <div style="background-color:#fffbe4;width:180px;height: 220px;float: left;" >
                           <span style="color:#0697DA;padding-left: 5px" >起步价：<label id="qi" style="color: #FF7300"></label></span><br>
                           <span style="color:#0697DA;padding-left: 5px">轻&nbsp;&nbsp;货：<label id="qing" style="color: #FF7300"></label></span><br>
                           <span style="color:#0697DA;padding-left: 5px">重&nbsp;&nbsp;货：<label id="zhong" style="color: #FF7300"></label></span><br>
                           <label style="width: 180px;border-bottom-style: solid;border-bottom-width: 2px;border-bottom-color: #669900"></label>
                           <span style="color:#0697DA;padding-left: 5px">运输费：<label id="yun" style="color: #FF7300">0.00&nbsp;元</label></span><br>
                       	   <span style="color:#0697DA;padding-left: 5px">保险费：<label id="bao" style="color: #FF7300">0.00&nbsp;元</label></span><br>
                           <span style="color:#0697DA;padding-left: 5px">合&nbsp;&nbsp;&nbsp;计：<label id="sum" style="width:120px;color: #FF7300;border-bottom-style: solid;border-bottom-width: 1px;border-bottom-color: #669900">0.00&nbsp;元</label></span><br>
                        </div> 
                        <div style="float: left;width:550px;height: auto;">
                        
			            <div style="width:550px;height: auto; float: left;margin-left: 10px;">
			                 <div style="border: solid;border-width: 1px;border-color: #e7e5e5;height: auto">
			                   <b style="margin-left: 10px">选择网点</b><label style="margin-left: 10px;color:#999">选择附近的网点，物流跟进更及时</label><br>
			                    <div class="row" style="width:550px;"> 
							           <!-- 左边导航 -->
							          <div class="col-md-3" align="center">
							                               发货网点：
								      </div> 
								      <div class="col-md-9" align="left">
							             <select class="form-control"  name="sendSite" onchange="selectDeliver()" id="sendSite">
										          
										</select>
										<div id="info" style="color:#FF7300; "> </div>
								      </div> 
								    
						       </div>  
						          <div class="row" style="width:550px;margin-top: 5px"> 
							           <!-- 左边导航 -->
							          <div class="col-md-3" align="center">
							                               收货网点：
								      </div> 
								      <div class="col-md-9" align="left" style="margin-bottom: 5px">
							            <select class="form-control" name="orderSite" onchange="selectPickUp()"  id="orderSite">
										  
										</select>
										<div id="infos" style="color:#FF7300"></div>
								      </div> 
								    
						       </div>  
			                 </div>
                        </div>     
                        
                        <div style="width:550px;height: auto; float: left;margin-left: 10px;margin-top: 5px">
			                 <div style="border: solid;border-width: 1px;border-color: #e7e5e5;height: auto; ">
			                   <b style="margin-left: 10px">货物信息</b><label style="margin-left: 10px;color:#999">输入重量或体积可以估算运费</label><br>
			                    <div class="row" style="width:550px;"> 
							           
								      <div class="col-md-12" align="left" style="margin-bottom: 10px "> 
								      <span style="float: left;margin-left: 15px">总重量:</span>
								         <input id="zhongPrice" type="text" class="form-control" name="belaidupWeight" style="width: 80px;float: left;margin-left: 5px"  placeholder="公斤" onkeyup="value=value.replace(/[^\d.]/g,'')" onafterpaste="this.value=this.value.replace(/[^/d]/g,'') ">
								         <font color="#FF7300" style="float: left;margin-left: 10px">或</font>    &nbsp;&nbsp;&nbsp;&nbsp;<span style="float: left;margin-left: 10px">总体积:</span>
								         <input id="qingPrice" type="text" style="float: left;width: 80px;margin-left: 5px" class="form-control" name="belaidupBulk"  placeholder="立方米" onkeyup="value=value.replace(/[^\d.]/g,'')" onafterpaste="this.value=this.value.replace(/[^/d]/g,'') ">
								        <label style="color: #669900" id="why"></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								         <a href="${ctx}/weightExplain.htm"  target=_blank style="color: #FF7300">什么是重货轻货？</a>
								      </div> 
								    
						       </div>   
			                 </div>
                        </div>  
                                
                            <div style="width:550px;height: auto; float: left;margin-left: 10px;margin-top: 5px">
			                 <div style="border: solid;border-width: 1px;border-color: #e7e5e5;height: auto; ">
			                   <b style="margin-left: 10px">增值服务</b>&nbsp;&nbsp;<a href="${ctx}/collectFees.htm"  target=_blank style="color: #FF7300">查看收费标准</a><br>
			                    <div class="row" style="width:550px;"> 
							      <div class="col-sm-12"> 
								     <div class="checkbox" style="float: left;margin-left: 15px">
									    <label>
									      <input type="checkbox" name="urgentDelivery" value="yes"> 加急配送 
									    </label>
									  </div>
									  <div class="checkbox" style="float: left;margin-left: 10px; ">
										    <label>
										      <input type="checkbox" name="deliveryVisit" value="yes"> 送货上门
										    </label>
									  </div>  
									  <div class="checkbox" style="float: left;margin-left: 10px; ">
									    <label>
									      <input type="checkbox" name="doorDelivery" value="yes"> 上门接货
									    </label>
									  </div>  
						          </div>
								     <div class="col-sm-12" style="float: left;"> 
									     <div class="checkbox" style="float: left;margin-left: 15px" >
										    <label style="float: left;">
										      <input type="checkbox" checked="checked" disabled="disabled" name="message" value="yes"> 短信通知<font color="#669900">(免费)</font>
										    </label>
										  </div>
										  <div class="checkbox" style="float: left;margin-left: 10px; ">
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
			                 </div>
                        </div>       
                        
                        
                          <div style="width:550px;height: auto; float: left;margin-left: 10px;margin-top: 5px">
			                 <div style="border: solid;border-width: 1px;border-color: #e7e5e5;height: auto; ">
			                   <b style="margin-left: 10px">货物保险</b>&nbsp;&nbsp;<a href="${ctx}/insuranceExplain.htm"  target=_blank style="color: #FF7300">投保协议</a><br>
			                    <div class="row" style="width:550px;">  
								      <div class="col-md-12" align="left" style="margin-bottom: 10px "> 
								      <span style="float: left;margin-left: 15px">货物价值:</span>
								           <input  id="price"  type="text" class="form-control" style="width: 100px;float: left;" name="goodsCost" onkeyup="value=value.replace(/[^\d.]/g,'')" onafterpaste="this.value=this.value.replace(/[^/d]/g,'') ">元
							      <div class="checkbox" style="float: left;margin-left: 20px">
								    <label>
								      <input id="check1" type="checkbox" name="insurance"  value="yes" onchange="javaScript:prem(this)">购买货运险（中国平安承保，费率1.5‰，最低3元起）
								    </label>
								   </div> 
								     
								      </div> 
								    
						       </div>   
			                 </div>
                        </div>  
                         <input type="hidden" id="routerId"   name="routerId">
		                <input type="hidden" value="route" name="type">
						<input id="insuranceCost" type="hidden" value="3.00" name="insuranceCost">
						<input id="transportationCost" type="hidden" value="0.00"  name="transportationCost">
						<input id="totalCost" type="hidden" value="0.00"  name="totalCost">
						 
			         </div>                 
			         </div>
			         <div align="center"> 
			            <button type="button" style="margin-bottom: 10px;width: 110px" class="btn btn-primary " 
			              onclick="sub()">提交运单
			            </button>
			            <button type="button" style="margin-bottom: 10px;width: 80px" class="btn  btn-default" data-dismiss="modal">
			                                  取消
			            </button>
			         </div>
			         </form>
			      </div> 
			</div> 
		</div>
  
	<jsp:include page="../foot.jsp"/> 
		
	<script type="text/javascript">   
	
	 //select选择项不变效果
	 var index='${txt}'-0; 
	 var obj = document.getElementById("selectRoute"); 
	 obj.options[index].selected = true;
	 
    //select选择更新数据排序
	$("#selectRoute").change(function(){
		var str=$("#selectRoute option:selected").attr("value");
		var sta=$("#selectRoute option:selected").attr("class");
	 	sendInfo(str,sta);
	});
    
	//构建表单,进行数据筛选
	function sendInfo(str,sta){
		// 创建Form  
	    var form = $('<form></form>');  
		// 设置属性  
	    form.attr('action', '<%=basePath%>delivery/routeInfoList.htm?&p=1');  
	    form.attr('method', 'post');  
	    // form的target属性决定form在哪个页面提交  (_self -> 当前页面 _blank -> 新页面)  
	    form.attr('target', '_self');  
	    // 创建Input  
	    var my_inputSta = $('<input type="text" name="sta" />');  
	    my_inputSta.attr('value', sta);  
	    var my_input = $('<input type="text" name="str" />');   
	    my_input.attr('value', str);   
	    // 附加到Form  
	    form.append(my_input); 
	    form.append(my_inputSta); 
		var obj = document.getElementById("selectRoute");
		//保存序号，option自己设置的
		var txt=obj.selectedIndex;
	    var my_inputTxt = $('<input type="text" name="txt" />');   
	    my_inputTxt.attr('value', txt);   
	    // 附加到Form  
	    form.append(my_inputTxt);  
	    //表单设置隐藏
	    form.css('display','none');
	    //表单的构建 完成并提交
	   form.appendTo(document.body).submit();
	 }
	
	//提交fom表单数据,验证数据
	function sub(){
		var sendSite= $("#sendSite option:selected").attr("value"); 
		var orderSite= $("#orderSite option:selected").attr("value"); 
		 $("#err1").remove();
		 $("#err2").remove();
		 var boo=1;
		 if(sendSite==""){
			 $("#sendSite").after("<font id='err1' color='red'>请选择发货网点</font>");
			 boo=0;
		 } 
		 if(orderSite==""){
			 $("#orderSite").after("<font id='err2' color='red'>请选择收货网点</font>");
			 boo=0;
		 } 
		 if($("#zhongPrice").val()==""&&$("#qingPrice").val()==""){ 
			 alert("请填写重量或体积");
			 boo=0;
		 } 
		 
		 if(boo==1){
			 $("#fom").submit(); 
			 $('#myModal').modal('hide'); 
		 } 
	}
	
 	var sum=0;//费用总额
	var lighPrice=0;//计算轻货的价格
	var weightPrice=0;//计算重货的价格
	var insuranceCost=0;//保险费
	var yunPrice=0; //运输费
	var priceOne=0;//查询出班线的轻货价
	var priceTwo=0;//查询班线的重货价
	//计算是否采用重货还是轻货价
	$("#qingPrice").change(function(){
		var qing=$(this).val();
		lighPrice=qing*priceOne;
		var zhong=$("#zhongPrice").val();
	    weightPrice=zhong*priceTwo;
		$("#yun").empty(); 
		$("#sum").empty(); 
		$("#why").empty();
		if((lighPrice-0)>(weightPrice-0)){
			yunPrice=lighPrice;
			sum=yunPrice+insuranceCost; 
			$("#why").append("轻货");
		}else{
			yunPrice=weightPrice;
			sum=yunPrice+insuranceCost; 
			$("#why").append("重货");
		} 
		$("#yun").append(yunPrice.toFixed(2)+"&nbsp;元"); 
		$("#sum").append(sum.toFixed(2)+"&nbsp;元");
		$("#transportationCost").attr("value",yunPrice.toFixed(2));
		$("#totalCost").attr("value",sum.toFixed(2));
	});
	
	$("#zhongPrice").change(function(){
		$("#why").empty();
		var zhong=$(this).val();
		weightPrice=zhong*priceTwo;
		var qing=$("#qingPrice").val();
		lighPrice=qing*priceOne;
		$("#yun").empty(); 
		$("#sum").empty(); 
		if((lighPrice-0)>(weightPrice-0)){
			yunPrice=lighPrice;
			sum=yunPrice+insuranceCost;
			$("#why").append("轻货");
		}else{
			yunPrice=weightPrice;
			sum=yunPrice+insuranceCost; 
			$("#why").append("重货");
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
	function send(routeId){
		  $.ajax({
			   type: "POST",
			   url: ctx + '/delivery/getRoute.json',
			   data:"routeId="+routeId,
			   dataType:'json',
			   success: function(r){  
				   var route=r.obj; 
				   //往弹窗添加数据
				   addInfo(route);
				   $('#myModal').modal('show');    
			   }
   	     });
	} 
	
	//填充数据,先清空旧数据，再填充先数据
	function addInfo(route){
		$("#qi").empty(); 
		$("#qing").empty(); 
		$("#zhong").empty();
		$("#err1").remove();
		$("#err2").remove();
		$("#info").empty();
		$("#infos").empty(); 
		document.getElementById("fom").reset();  
		$("#price").val("0.00");
		$("#why").empty();
		$("#yun").empty().append("0.00&nbsp;元"); 
		$("#bao").empty().append("0.00&nbsp;元"); 
		$("#sum").empty().append("0.00&nbsp;元");  
		priceOne=route.lightGoodsPrice;//保存轻货价
		priceTwo=route.weightGoodsPrice;//保存重货价 
		$("#routerId").attr("value","");
		$("#routerId").attr("value",route.routerId);
		$("#qi").append(route.startingPrice+"元/公斤");
		$("#qing").append(route.lightGoodsPrice+"元/公斤"); 
		$("#zhong").append(route.weightGoodsPrice+"元/公斤");
		//填充发货网点数据
		$("#sendSite").empty();
		$("#sendSite").append("<option value=''>--请选择--</option>");
		$.each(route.deliverList,function(key,deliver){ 
			$("#sendSite").append("<option  name='"+deliver.address+"' class='"+deliver.telephone+"' id='"+deliver.deliverGoodsAreaId+"' value='"+deliver.deliverName+"'> "+deliver.deliverName+"</option>");
		}); 
		//填充收货网点数据
		$("#orderSite").empty();
		$("#orderSite").append("<option value=''>--请选择--</option>");
		$.each(route.pickUpList,function(key,deliver){ 
			$("#orderSite").append("<option  name='"+deliver.address+"' class='"+deliver.telephone+"' id='"+deliver.pickUpGoodsAreaId+"' value='"+deliver.deliverName+"'> "+deliver.deliverName+"</option>");
		});
	} 
	 
	//发货区域
	function selectDeliver(){  
	  var str=$("#sendSite option:selected");
	  var address=$(str).attr("name");
	  var telephone=$(str).attr("class");
	  var id=$(str).attr("id");  
	  $("#err1").remove();
	  $("#err2").remove();
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
	  $("#err1").remove();
	  $("#err2").remove();
	  if(typeof(id) == "undefined"){
		  $("#infos").empty();
	  }else{
	  $("#infos").empty();
	  $("#infos").append(address+"&nbsp;&nbsp;&nbsp;&nbsp;电话："+telephone+"&nbsp;&nbsp;&nbsp;&nbsp;"+
	  "<a href='${ctx}/delivery/address.htm?type=pickUp&id="+id+"' target=_blank style='color:blue'>查看地图</a>");
	 }
	}
	
	<!-- 分页显示表格数据 -->
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
</body>
</html>