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
		      <img hspace="0" vspace="0" src="${pageContext.request.contextPath}/resources/images/delivery/delivery.png">
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
	        <form class="form-horizontal" role="search" method="post"  id="personalMessageForm" action="" >
			 <!-- <div class="panel panel-default" style="width: 863px" >
					  <div class="panel-heading">
					    <b style="size: 3">手机验证</b> &nbsp;&nbsp; 输入手机号码后，点击“获取验证码”按钮，验证码将发送到手机（免费），填写短信中的数字并点击“确认”
					  </div>
					  <div class="panel-body">
						  <div class="form-group">
						     <label for="enterpriseName" class="col-sm-2 control-label">*企业名称:</label>
							 <div class="col-sm-4">
								<input type="text" class="form-control"  placeholder="请输入手机号码" >
							 </div>
						  </div> 
					   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">*手机号码:</label>
						    <div class="col-sm-4">
						      <input type="text" class="form-control"  placeholder="请输入手机号码" >
						    </div>
						    <button type="button" class="btn btn-default">获取验证码</button>
						  </div>
						   <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">*验证码:</label>
						    <div class="col-sm-4">
						      <input type="text" class="form-control"  placeholder="请输入手机号码" >
						    </div> 
						  </div>
						  
					  </div>
				</div>  -->
				<input type="hidden" name="routerId" value="${router.routerId}">
				  <div class="panel panel-default" style="width: 863px" >
					  <div class="panel-heading">
					    <b style="size: 3">发货方</b> &nbsp;&nbsp;填写完整、准确信息，物流跟进更及时
					  </div>
					  <div class="panel-body">
					    <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" >发货区:</label>
						    <div class="col-sm-4" align="left">
						      <label for="inputEmail3" style="color:#0697DA ">${router.routeOrigin}</label> 
						     </div> 
						  </div>
					     <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label"><font color="red">*</font>联系人:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text"  class="form-control"  style="width: " placeholder="请输入发货人姓名" >
						    </div> 
						  </div>
						  <div class="form-group"  >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>联系电话:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text" class="form-control"   placeholder="请输入发货人联系电话" >
						    </div> 
						  </div>
						 <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>所在街道地址:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text" class="form-control"  placeholder="请输入所在街道地址" >
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
						   <select class="form-control" >
							  <option onclick="selectDeliver(this)">--请选择--</option> 
							  <c:forEach items="${router.deliverList}" var="deliver">  
					            <option  name="${deliver.address}" class="${deliver.telephone}" id="${deliver.deliverGoodsAreaId}" onclick="selectDeliver(this)"> ${deliver.deliverName} </option>
		                       </c:forEach>  
							</select>
							<div id="info" style="color:#FF7300"></div>
						    </div> 
						  </div>
						  <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>收货网点:</label>
						    <div class="col-sm-6" align="left">
						    <select class="form-control">
							  <option onclick="selectPickUp(this)">--请选择--</option>
							  <c:forEach items="${router.pickUpList}" var="deliver">  
					            <option name="${deliver.address}" class="${deliver.telephone}" id="${deliver.pickUpGoodsAreaId}" onclick="selectPickUp(this)"> ${deliver.deliverName} </option>
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
						     <input type="text" class="form-control"   placeholder="请输入物品包装件数" >
						    </div> 
						    <div class="col-sm-3" ></div>
						  </div>
						  <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>货物类型:</label>
						    <div class="col-sm-6" align="left">
						     <select class="form-control" name="goodstypeId">
							  <option>--请选择--</option>
							   <c:forEach items="${storehousePackagetype}" var="ty">  
					             <option>${ty.packagetypeName} </option>
					            </c:forEach>   
							</select>
						     </div> 
						    <div class="col-sm-3" ></div>
						  </div>
						  <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>取货方式:</label>
						    <div class="col-sm-6" align="left">
						     <select class="form-control" name="goodstypeId">
							  <option>上门取货</option>  
							  <option>送货上门</option>  
							</select>
						     </div> 
						    <div class="col-sm-3" ></div>
						  </div>  
						  <div class="form-group" >
						    <label for="inputEmail3" class="col-sm-3 control-label" >总重量:</label>
						    <div class="col-sm-2" align="left">
						     <input type="text" class="form-control" name="belaidupWeight"  placeholder="公斤" >
						     </div>  
						    <label for="inputEmail3"  class="col-sm-2 control-label" ><font color="#FF7300">或</font>    &nbsp;&nbsp;&nbsp;&nbsp;总体积:</label> 
						      <div class="col-sm-2" align="left">
						     <input type="text" class="form-control" name="belaidupBulk"  placeholder="立方米" >
						    </div> 
						     <a href="${ctx}/weightExplain.htm" style="color: #FF7300">什么是重货轻货？</a>
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
					    <b style="size: 3">增值服务</b> &nbsp;&nbsp;<a href="${ctx}/collectFees.htm"style="color: #FF7300">查看收费标准</a>
					  </div>
					  <div class="panel-body">
					     <div class="form-group" >
						     <div class="col-sm-12"> 
							     <div class="checkbox" style="float: left;margin-left: 150px">
								    <label>
								      <input type="checkbox" name="yesOrNo"> 加急配送 
								    </label>
								  </div>
								  <div class="checkbox" style="float: left;margin-left: 30px">
								    <label>
								      <input type="checkbox"> 货物保价&nbsp; &nbsp;
								    </label>
								  </div> 
								    <input   type="text" class="form-control" style="width: 50px;float: left;"><label style="margin-top: 5px;float: left">元</label>
							       <div class="checkbox" style="float: left;margin-left: 30px">
								    <label>
								      <input type="checkbox"> 送货上门
								    </label>
								  </div>  
						    </div> 
						  </div>
						   <div class="form-group" >
							     <div class="col-sm-12" style="float: left;"> 
							     <div class="checkbox" style="float: left;margin-left: 150px">
								    <label style="float: left;">
								      <input type="checkbox"> 短信通知<font color="#669900">(免费)</font>
								    </label>
								  </div>
								  <div class="checkbox" style="float: left;margin-left: 58px">
								    <label>
								      <input type="checkbox"> 签收回单&nbsp; &nbsp;
								    </label>
								  </div> 
								 <select class="form-control" style="width: 183px;float: left">
								  <option>运单签收联原件返回</option> 
								  <option>发货单签收联原件返回</option> 
								</select> 
							    </div> 
						   </div> 
						   <div class="form-group" >
							     <div class="col-sm-12" style="float: left;">
							      <div class="checkbox" style="float: left; margin-left: 150px">
							    <label>
							      <input type="checkbox">工本费<font color="red">(6元)</font>
							    </label>
							  </div>
							  <div class="checkbox" style="float: left;margin-left: 78px">
							    <label>
							     <input type="checkbox">燃油费<font color="red">(4元)</font>
							    </label>
							  </div>
							      </div>
							</div>
						  <div class="form-group" >
						     <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>支付方式:</label>
							     <div class="col-sm-6" style="float: left;"> 
								     <div class="radio" style="float: left;">
									  <label>
									    <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
									    发货人支付
									  </label>
									 </div>
									 
									 <div class="radio" style="float: left;">
									  <label>
									    <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
									    收货人支付（到付）
									  </label>
									 </div>
							    </div>
						  </div> 
						  
						    <div class="form-group" >
						     <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>货物价值:</label>
							     <div class="col-sm-9" style="float: left;"> 
							      <input   type="text" class="form-control" style="width: 100px;float: left;">
							      <div class="checkbox" style="float: left;margin-left: 20px">
								    <label>
								      <input type="checkbox">购买货运险（中国平安承保，费率1.5‰，最低3元起）<a href="${ctx}/insuranceExplain.htm" style="color: #FF7300">投保协议</a>
								    </label>
								   </div> 
							      </div>
							</div>
						  
					  </div>
				</div> 
				<center>
				<button type="button" class="btn btn-info" style="margin-bottom: 30px;width: 150px" id="sub">提交运单</button>
				</center>
				</form>
		    </div>
	</div>
	
	</div>
	 
			<!-- 模态框（Modal） -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"  
			   aria-labelledby="myModalLabel" aria-hidden="true">
			   <div class="modal-dialog">
			      <div class="modal-content">
			         <div class="modal-header">
			            <button type="button" class="close" 
			               data-dismiss="modal" aria-hidden="true">
			                  &times;
			            </button>
			            <h4 class="modal-title" id="myModalLabel">
			                                 提交运单
			            </h4>
			         </div>
			         <div class="modal-body" > 
			         为了您货物能准确到达目的地，请认真核对所填信息，信息一经提交不可更改~
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
		<div class="modal fade" id="mymsg" tabindex="-1" role="dialog"  
			   aria-labelledby="myModalLabel" aria-hidden="true">
			   <div class="modal-dialog">
			      <div class="modal-content">
			         <div class="modal-header">
			            <button type="button" class="close" 
			               data-dismiss="modal" aria-hidden="true">
			                  &times;
			            </button>
			            <h4 class="modal-title" id="myModalLabel">
			                            提示信息
			            </h4>
			         </div>
			         <div class="modal-body"  id="msg">
			            
			         </div><!-- 
			          <div class="modal-footer">
			            <button type="button" class="btn btn-default " 
			               data-dismiss="modal" onclick="hiden2()">确认
			            </button> 
			         </div> --> 
			      </div> 
			</div> 
		</div>
		
	<jsp:include page="../foot.jsp"/>
	<script type="text/javascript"> 
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
				   setTimeout(hiden, 2000)
			   }
   	     });
	} 
	//隐藏消息提示层，如果是未登录的，直接转到登录页面
	function hiden( ){ 
		  $('#mymsg').modal('hide');  
		     var text=$("#msg").text(); 
		     if(text== "请先登录，再操作！"){ 
				 window.location.href=ctx +"/login.htm"; 
			 }    
	} 
	
	$("#sub").click(function(){
		 $("#personalMessageForm").submit();
	});
	 
	$("#personalMessageForm").validate({
		  rules:{
			  orderConsignee:"required",  
			  orderPhone:{
	    			 required:true,
	    			 number:true,
	    			 isMobile:true
	    		 },  
  		  },
  		  messages:{
  			orderConsignee: "请输入收货人姓名", 
  			orderPhone:{
    			required:"发货人手机不能为空!",
 	    		number:"请输入合法手机号码!",
 	    		isMobile:"请输入合法手机号码!"
    		 },
  		  },
		  submitHandler:function(){     
			  $('#myModal').modal('show')
		  }
	  });
	    
	//发货区域
	function selectDeliver(str){ 
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
	function selectPickUp(str){
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
	</script>
	
	<!-- <script type="text/javascript"> 
	  $("#personalMessageForm").validate({
		  rules:{
			  orderConsignee:"required",  
			  orderPhone:{
	    			 required:true,
	    			 number:true,
	    			 isMobile:true
	    		 },  
  		  },
  		  messages:{
  			orderConsignee: "请输入收货人姓名", 
  			orderPhone:{
    			required:"发货人手机不能为空!",
 	    		number:"请输入合法手机号码!",
 	    		isMobile:"请输入合法手机号码!"
    		 },
  		  },
		  submitHandler:function(){    
	    		 KindEditor.ready(function(K) {
	   	   		  var dialog = K.dialog({
	   	   	          width : 500,
	   	   	          title : '我要发货',
	   	   	          body : '<div style="margin:10px;"><strong>你确定寄送此货物吗?</strong></div>',
	   	   	          closeBtn : {
	   	   	                  name : '关闭',
	   	   	                  click : function(e) {
	   	   	                          dialog.remove();
	   	   	                  }
	   	   	          },
	   	   	          yesBtn : {
	   	   	                  name : '确定',
	   	   	                  click : function(e) { 
	   	   	                      dialog.remove();
		   	   	                      $.ajax({
			    					   type: "POST",
			    					   url: ctx + '/delivery/addBelaidup.json',
			    					   data: $("#personalMessageForm").serialize(),
			    					   dataType:'json',
			    					   success: function(r){
			    						 if(r.success){ 
			    							doDailog("发货成功,等待后台审核,可在记录中查看该条信息!");
			    						 }
			    						 else{ 
			    							 if(r.msg == "请先登录，再操作！"){
			    								 doDailog("请先登录！");
			    								 window.location.href=ctx +"/login.htm"; 
			    							 }else{
			    								 doDailog(r.msg);
			    							 }
			    							
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
	  });
	  //公共对话框定义
	     function  doDailog(str){
	   	  KindEditor.ready(function(K) {
	   		  var dialog = K.dialog({
	   		        width : 500,
	   		        title : '发货提示',
	   		        body : '<div style="margin:10px;"><strong>'+str+'</strong></div>',
	   		        closeBtn : {
	    	                  name : '关闭',
	    	                  click : function(e) {
	    	                          dialog.remove();
	    	                  }
	    	          },
	   		     yesBtn : {
	   	                name : '确定',
	   	                click : function(e) {
	   	                	 dialog.remove();
	   	                }
	   	        },
	   	        noBtn : {
	   	                name : '取消',
	   	                click : function(e) {
	   	                		doClear();
	   	                        dialog.remove();
	   	                }
	   	        }
	   		}); 
	   	  });
	     }
	</script> -->
</body>
</html>