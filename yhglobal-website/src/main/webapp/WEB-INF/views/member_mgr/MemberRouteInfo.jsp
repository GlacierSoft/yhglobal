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
    <title>冰川网贷平台</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="../inc.jsp"/>
     <style>
     </style>
   </head>
   <body>
      
      <div style="width: 700px;margin: 0px auto;vertical-align: middle;">
            <!-- 表单构建 -->
            <form method="post" id="fom" action="${ctx}/delivery/add.htm">
             <!--右侧 -->
             <div style="width: 130px;height: 245px;float: left;background-color: #FFFBE4;margin-top: 10px;border: 1px solid #E7E5E5;border-radius:5px;">
               	 <span style="color:#0697DA;padding-left: 5px" >起步价：<label id="qi" style="color: #FF7300">${route.startingPrice}</label></span><br>
               	 <span style="color:#0697DA;padding-left: 5px">轻&nbsp;&nbsp;货：<label id="qing" style="color: #FF7300">${route.lightGoodsPrice }</label></span><br>
                 <span style="color:#0697DA;padding-left: 5px">重&nbsp;&nbsp;货：<label id="zhong" style="color: #FF7300">${route.weightGoodsPrice}</label></span> 
                 <label style="width: 130px;border-bottom-style: solid;border-bottom-width: 2px;border-bottom-color: #669900"></label>
                 <span style="color:#0697DA;padding-left: 5px">运输费：<label id="yun" style="color: #FF7300">0.00&nbsp;元</label></span><br>
             	 <span style="color:#0697DA;padding-left: 5px">保险费：<label id="bao" style="color: #FF7300">0.00&nbsp;元</label></span><br>
                 <span style="color:#0697DA;padding-left: 5px">合&nbsp;&nbsp;&nbsp;计：<label id="sum" style="color: #FF7300;">0.00&nbsp;元</label></span>
                 <label style="width: 130px;border-bottom-style: solid;border-bottom-width: 2px;border-bottom-color: #669900"></label>
             </div>
             
             <!--左侧  -->
             <div style="width: 540px;float: left;margin-top: 10px;margin-left: 10px;">
   	                <!--选择网点  -->
   	                <div style="width: 530px;float: left;background-color: #FFFBE4;border-radius:5px;border: 1px solid #E7E5E5;">
   	                      <div style="float: left;width: 515px;margin-left: 10px;margin-top: 5px;">
   	                          <b>选择网点</b><label style="color:#999">&nbsp;&nbsp;&nbsp;&nbsp;选择附近的网点，物流跟进更及时</label>
   	                      </div>
   	                      <div style="float:left;width: 515px;margin-left: 15px;">
   	                         	发货网点：&nbsp;&nbsp;&nbsp;&nbsp;<select  style="width: 300px;height: 30px;"   name="sendSite" onchange="selectDeliver()" id="sendSite">
   	                         	      <option>--请选择--</option>
   	                         	      <c:if test="${!empty route.deliverList}">
   	                         	           <c:forEach  items="${route.deliverList }" var="deliver" varStatus="status">
   	                         	                <option  name="${deliver.address }"  value="${deliver.deliverName}" class="${deliver.telephone }"  id="${deliver.deliverGoodsAreaId}" >${deliver.deliverName}</option>
   	                         	           </c:forEach>
   	                         	      </c:if>
   	                         	      </select>
   	                      </div>
   	                      <div id="info" style="color:#FF7300;margin-left: 100px;"></div>	
   	                      <div style="float:left;width: 515px;margin-top: 5px;margin-left: 15px;margin-bottom: 10px;" id="receiveDiv">
   	                         	收货网点：&nbsp;&nbsp;&nbsp;&nbsp;<select  style="width: 300px;height: 30px;" id="orderSite" onchange="selectPickUp()" name="orderSite">
   	                         	      <option>--请选择--</option>
   	                         	        <c:if test="${!empty route.pickUpList}">
   	                         	         <c:forEach items="${route.pickUpList}" var="deliver" varStatus="state">
   	                         	             <option  name="${deliver.address }"  value="${deliver.deliverName}" class="${deliver.telephone }"  id="${deliver.pickUpGoodsAreaId}">${deliver.deliverName}</option>
   	                         	         </c:forEach>
   	                         	         </c:if>
   	                         	      </select>
   	                      </div>
   	                      <div id="infos" style="color:#FF7300;margin-left: 100px;"></div>
   	                </div>
   	                
   	                <!--货物信息  -->
   	                <div style="width: 530px;height: 80px;float: left;background-color: #FFFBE4;border-radius:5px;border: 1px solid #E7E5E5;margin-top: 10px;">
   	                      <div style="float: left;width: 515px;margin-top: 5px;margin-left: 15px;">
   	                          <b>货物信息</b><label style="color:#999">&nbsp;&nbsp;&nbsp;&nbsp;输入重量或体积可以估算运费</label>
   	                      </div>
   	                      <div style="float:left;width: 515px;margin-left: 15px;">
   	                         	总重量：<input type="text"  id="zhongPrice" style="border:1px solid #CCCCCC;width: 100px;border-radius:5px;" name="belaidupWeight" placeholder="公斤" onkeyup="value=value.replace(/[^\d.]/g,'')" onafterpaste="this.value=this.value.replace(/[^/d]/g,'')">
   	                            <font color="#FF7300" style="margin-left: 10px">或</font>&nbsp;<span style="margin-left: 10px">总体积：</span>
   	                            <input type="text" id="qingPrice" style="border:1px solid #CCCCCC;width: 100px;border-radius:5px;margin-left: 5px"  name="belaidupBulk"  placeholder="立方米" onkeyup="value=value.replace(/[^\d.]/g,'')" onafterpaste="this.value=this.value.replace(/[^/d]/g,'') ">
						        <label style="color: #669900" id="why"></label>&nbsp;
						        <a href="${ctx}/weightExplain.htm"  target=_blank style="color: #FF7300">什么是重货轻货？</a>
   	                      </div>
   	                </div>
   	                
   	                <!--增值服务  -->
   	                 <div style="width: 530px;height: 120px;float: left;background-color: #FFFBE4;border-radius:5px;border: 1px solid #E7E5E5;margin-top: 10px;">
   	                      <div style="float: left;width: 515px;margin-top:5px;margin-left:  15px;">
   	                          <b>增值服务</b><label style="color:#999">&nbsp;&nbsp;&nbsp;&nbsp;查看收费标准</label>
   	                      </div>
   	                      <div style="float:left;width: 515px;height:20px;line-height: 20px;margin-left:  15px;">
   	                              <input type="checkbox" name="urgentDelivery" value="yes">&nbsp;&nbsp;加急配送&nbsp;&nbsp;
   	                              <input type="checkbox" name="deliveryVisit" value="yes">&nbsp;&nbsp;送货上门&nbsp;&nbsp;
   	                              <input type="checkbox" name="doorDelivery" value="yes">&nbsp;&nbsp;上门接货&nbsp;&nbsp;
   	                      </div>
   	                      <div style="float:left;width: 515px;height:20px;line-height: 20px;margin-top: 10px;margin-left:15px;">
   	                               <input type="checkbox" checked="checked" disabled="disabled" name="message" value="yes"> 短信通知<font color="#669900">(免费)</font>
   	                               <input type="checkbox" name="signReceipt" value="yes"> 签收回单&nbsp; &nbsp;
   	                               <select  style="width: 300px;height: 30px;" name="signReceiptType">
									  <option value="waybill">运单签收联原件返回</option> 
									  <option value="invoice">发货单签收联原件返回</option> 
								  </select> 
   	                      </div>
   	                </div>
   	              
   	              <!-- 货物保险 -->
   	               <div style="width: 530px;height: 110px;float: left;background-color: #FFFBE4;border-radius:5px;margin-top: 10px;">
   	                      <div style="float: left;width: 515px;margin-left: 15px;margin-top: 5px;">
   	                          <b>货物保险服务</b><label style="color:#999">&nbsp;&nbsp;&nbsp;&nbsp;<a href="${ctx}/insuranceExplain.htm"  target=_blank style="color: #FF7300">保险协议</a></label>
   	                      </div>
   	                      <div style="float:left;width: 515px;height:20px;line-height: 20px;margin-left: 15px;">
   	                            	货物价值：<input type="text"  id="price" style="border:1px solid #CCCCCC;width: 100px;border-radius:5px;" name="goodsCost" placeholder="公斤" onkeyup="value=value.replace(/[^\d.]/g,'')" onafterpaste="this.value=this.value.replace(/[^/d]/g,'')"> 
   	                      </div>
   	                      <div style="float:left;width: 515px;height:20px;margin-top: 10px;margin-left: 15px;">
   	                              <input id="check1" type="checkbox" name="insurance"  value="yes" onchange="javaScript:prem(this)">&nbsp;购买货运险（中国平安承保，费率1.5‰，最低3元起）
   	                      </div>
   	                </div>
   	                      
   	                <input type="hidden" id="routerId"  value="${route.routerId}"  name="routerId">
	                <input type="hidden" value="route" name="type">
					<input id="insuranceCost" type="hidden" value="3.00" name="insuranceCost">
					<input id="transportationCost" type="hidden" value="0.00"  name="transportationCost">
					<input id="totalCost" type="hidden" value="0.00"  name="totalCost">      
   	         </div>
            </form> 
        </div>
   </body>
 <script>
      //发货区域
      function selectDeliver(){
    	  //deliverListInfo pickUpListInfo
    	  var str=$("#sendSite option:selected");
    	  var address=$(str).attr("name");
    	  var telephone=$(str).attr("class");
    	  var id=$(str).attr("id");  
    	  if(typeof(id) == "undefined"||id==""||id==null){
    		  $("#info").empty();
    		}else{
    		  $("#info").empty();
    		  $("#info").append(address+"&nbsp;&nbsp;&nbsp;&nbsp;电话："+telephone+"&nbsp;&nbsp;&nbsp;&nbsp;"+
    		  "<a href='${ctx}/delivery/address.htm?type=deliver&id="+id+"' target=_blank style='color:blue'>查看地图</a>");
    	  }
      };
      
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
  		$("#receiveDiv").css("margin-bottom","10px");
  	  }else{
  	  $("#infos").empty();
  	   $("#receiveDiv").css("margin-bottom","0px");
  	  $("#infos").append(address+"&nbsp;&nbsp;&nbsp;&nbsp;电话："+telephone+"&nbsp;&nbsp;&nbsp;&nbsp;"+
  	  "<a href='${ctx}/delivery/address.htm?type=pickUp&id="+id+"' target=_blank style='color:blue'>查看地图</a>");
  	 }
  	} 
    
  	var sum=0;//费用总额
	var lighPrice=0;//计算轻货的价格
	var weightPrice=0;//计算重货的价格
	var insuranceCost=0;//保险费
	var yunPrice=0; //运输费
	var priceOne='${route.lightGoodsPrice}';//查询出班线的轻货价
	var priceTwo='${route.weightGoodsPrice}';//查询班线的重货价
	
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
	
	
	var routeInfoNumber=1;
	var routeInfoChangeNumber=0;
	
	//警告对话款
    function doShowErrorRoute(str){
     routeInfoNumber=artDialog.open.origin.releaseRouteNumber;
     routeInfoChangeNumber+=1;
     if(routeInfoNumber+1==2){
    	 var d =art.dialog({
 		    title: '提示',
 		    content:str ,
 		    fixed:true,
       	    lock: true,
       	    icon:'error',
       	    background:"#E6E6E6",
       	 	opacity:0.4,
 		    okValue: '确定',
 		    ok: function () {
 		    	routeInfoNumber=1;
 		    	routeInfoChangeNumber=0;
 		    	this.close;
 		    }
 		});
 		d.show();
     }
	}
	
    //警告对话款
    function doShowError(str){
    	routeInfoNumber=artDialog.open.origin.releaseRouteNumber;
        routeInfoChangeNumber+=1;
        if(routeInfoNumber+1==2){
 	    var d =art.dialog({
    		    title: '提示',
    		    content:str ,
    		    fixed:true,
          	    lock: true,
          	    icon:'error',
          	    background:"#E6E6E6",
          	 	opacity:0.4,
    		    okValue: '确定',
    		    ok: function () {
    		    	routeInfoNumber=1;
     		    	routeInfoChangeNumber=0;
     		    	this.close;
    		    }
    		});
    		d.show();
        }
   	}
    
    function doShowRight(str){
    	routeInfoNumber=artDialog.open.origin.releaseRouteNumber;
        routeInfoChangeNumber+=1;
        if(routeInfoNumber+1==2){
 	    var d =art.dialog({
   		    title: '提示',
   		    content:str ,
   		    fixed:true,
         	    lock: true,
         	    icon:'succeed',
         	    background:"#E6E6E6",
        		opacity:0.4,
   		    okValue: '确定',
   		    ok: function () {
   		    	routeInfoNumber=1;
 		    	routeInfoChangeNumber=0;
 		    	this.close;
   		    }
   		});
   		d.show();
      }
   }
</script>
</html>