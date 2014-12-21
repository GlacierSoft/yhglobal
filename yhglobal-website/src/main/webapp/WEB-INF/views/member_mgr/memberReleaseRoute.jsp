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
   <div class="container" >  
      <div class="row" style="margin-top: 15px;height: 65px;background-color: #ddf0f9;width: 700px;"> 
           <div class="panel-body">
               <!-- 左边导航 -->
             	<button type="button" class="btn btn-warning"  style="background-color: #FF5400;" onclick="sendInfo('starting_price','desc')">&nbsp;起步价↓&nbsp;&nbsp;</button>
	      		<button type="button" class="btn btn-warning"  style="background-color: #FF5400;" onclick="sendInfo('light_goods_price','desc')">轻货单价↓</button>
	      		<button type="button" class="btn btn-warning"  style="background-color: #FF5400;" onclick="sendInfo('weight_goods_price','desc')">重货单价↓</button>
	            <button type="button" class="btn btn-warning"  style="background-color: #FF5400;" onclick="sendInfo('route_bytime','desc')">运输时效↓</button>
	       	    <div style="float:right;">
                       	 共找到<font color="#FF7300">
              			<c:if test="${empty routerDatas.rows}">0</c:if>
               			<c:if test="${! empty routerDatas.rows}">${routerDatas.total}</c:if>
               			</font>条线路
               </div>
          </div>   
     </div>
    <div class="row" style="margin-top: 15px;padding-top:15px; height: 65px;width: 700px;">  
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
	            <td style="color: #999;font-size: 3;padding-top: 15px">从：<font color="FF5400">${router.routeOrigin}</font> <br>
	                                                  到：<font color="FF5400">${router.routeStop}</font>
	            </td>
	            <td style="color: #999;font-size: 3;padding-top: 15px" >
	                 <font color="#FF5400">${router.routeBytime}</font>小时<br>
	                                                    箱型：<font color="#FF5400">
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
	                                         起步价：<font color="#FF5400"><fmt:formatNumber value='${router.startingPrice}' pattern='#,#00.00'/></font>元&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>
	                                         轻货价：<font color="#FF5400"><fmt:formatNumber value='${router.lightGoodsPrice}' pattern='#,#00.00'/></font>元/立方<br>
	                                         重货价：<font color="#FF5400"><fmt:formatNumber value='${router.weightGoodsPrice}' pattern='#,#00.00'/></font>元/公斤<br>
	            </td>
	          	<td style="padding-top: 18px">
	          	    <button type="button" onclick="send('${router.routerId}')" class="btn btn-warning" style="background-color: #FF5400">发货</button>
	             </td>
	          </tr>
	     	  </c:forEach>
	     	  <c:if test="${!empty routerDatas.rows}">  
		           <tr >
			           <th colspan="7"> 
				          	<div align="right"  >
							    <ul id='pageNews'></ul>
							</div> 
						</th>
		           	</tr>
	           	</c:if>
			 </tbody>
	    </table> 
   </div>
  </div> 
   
   <script>
      
   //记录提交次数
   var releaseRouteNumber=0;
   
   //定义window对象
   
   var window_Object;
   
   function send(id){
        	  var url=ctx + '/delivery/getRouteInfo.htm?routeId='+id;
        	   var memberReleaseRouteDialog=art.dialog.open(url, {
            		title:'发布信息完善',
            		 width: '750px',
                     height: 'auto',
                     lock: true,
                     background:"#E6E6E6",
                	   opacity:0.4,
                	   fixed:true,
                	   button:[{
                		    name: '提交',
                		    focus: true,
                		    callback: function () {
                		    	releaseRouteNumber=this.iframe.contentWindow.routeInfoNumber+this.iframe.contentWindow.routeInfoChangeNumber;
                		    	var belaidupId='${belaidupId}';
                		    	var sendSite= this.iframe.contentWindow.$("#sendSite option:selected").prop("value"); 
            		    		var orderSite=this.iframe.contentWindow.$("#orderSite option:selected").prop("value"); 
            		    		var zhongPrice=this.iframe.contentWindow.$("#zhongPrice").val();
            		    		var qingPrice=this.iframe.contentWindow.$("#qingPrice").val();
            		    		var window_Object=this.iframe.contentWindow;
            		    		if(sendSite=="--请选择--"||sendSite==""||sendSite==null){
            		    			this.iframe.contentWindow.doShowErrorRoute("请选择发货点!");
            		    		}else{
            		    			if(orderSite=="--请选择--"||orderSite==""||orderSite==null){
            		    				this.iframe.contentWindow.doShowErrorRoute("请选择收货点!");
            		    			}else{
            		    				if(zhongPrice==""||zhongPrice==null||qingPrice==""||qingPrice==null){
            		    					this.iframe.contentWindow.doShowErrorRoute("请填写重量或者体积!");
            		    				}else{
            		    					$.ajax({
          		   	    					   type: "POST",
          		   	    					   url:ctx + '/delivery/addRouteInfo.json?belaidupId='+belaidupId,
          		   	    					   data: this.iframe.contentWindow.$("#fom").serialize(),
          		   	    					   dataType:'json',
          		   	    					   success: function(rel){
          		   	    						 if(rel.success){
          		   	    							window_Object.doShowRight(rel.msg);
          		   	    						 }
          		   	    						 else{
          		   	    							window_Object.doShowError(rel.msg);
          		   	    						 }
          		   	    					   }
          		   	                	  });
            		    				}
            		    			}
            		    		}	
                		    	return false;
                		    }
                		}, {
                		    name: '取消',
                		    callback:function(){
                		    	sign=true;
                		    }
                		}]
           		 });
           }
    </script>
  </body>
</html>