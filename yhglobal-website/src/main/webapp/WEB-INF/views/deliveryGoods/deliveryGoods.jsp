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
					        <li  class="active"><a href="#">我要发货</a></li> 
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
      	   <div class="panel panel-default"  > 
					  <div class="panel-heading">
					    <b style="size: 4">发货方</b> &nbsp;&nbsp;填写完整、准确信息，物流跟进更及时 <a class="btn btn-primary" href="${ctx}/template/index.htm?&p=1" style="float: right;">发货模板</a>
					  </div>
					  <div class="panel-body">
					   <div class="form-group col-sm-9">
							 <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>发货区:</label>
						    <div class="col-sm-6" align="left">  
						           <input type="text" style="width: 295px;float: left;height: 35px;border-color: #c3d9e0;" name="belaidupInitiatin" autocomplete="off" type="text" placeholder="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll form-control">
			                 </div> 
						</div>  
						 <div class="form-group col-sm-9">
							 <label for="inputEmail3" class="col-sm-3 control-label"><font color="red">*</font>联系人:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text"  class="form-control" placeholder="请输入发货人姓名"  name="consignor">
						    </div>
						</div>  
					    <div class="form-group col-sm-9">
							 <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>联系电话:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text" class="form-control"   placeholder="请输入发货人联系电话" name="sendPhone" >
						    </div> 
						</div> 
						  <div class="form-group col-sm-9">
							<label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>所在街道地址:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text" class="form-control"  placeholder="请输入所在街道地址" name="sendAddress">
						    </div> 
						</div> 
					  </div>
				</div>
      	 
      	     <div class="panel panel-default"  > 
					  <div class="panel-heading">
					      <b style="size: 3">收货方</b> &nbsp;&nbsp;为了您货物安全，请填写完整、准确信息
					  </div> 
					  <div class="panel-body ">
					       <div class="form-group col-sm-9">
							 <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>收货区:</label>
						    <div class="col-sm-6" align="left">  
						           <input type="text" style="width: 295px;float: left;height: 35px;border-color: #c3d9e0;" name="belaidupTerminu" autocomplete="off" type="text" placeholder="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll form-control">
			                 </div> 
						</div>  
					     <div class="form-group col-sm-9" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>联系人:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text" class="form-control"  name="orderConsignee"  placeholder="请输入收货人姓名" >
						    </div> 
						  </div>
						  <div class="form-group col-sm-9">
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>联系电话:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text" maxlength="15" class="form-control"  name="orderPhone" onkeyup="this.value=this.value.replace(/\D/g,'')" placeholder="请输入收货人联系电话" >
						    </div> 
						  </div>
						  <div class="form-group col-sm-9" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>所在街道地址:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text" class="form-control" name="orderAddress" placeholder="请输入所在街道地址" >
						    </div> 
						  </div>
					  </div> 
			 </div>
        	 <div class="panel panel-default" > 
					  <div class="panel-heading">
					    <b style="size: 3">货物信息</b> &nbsp;&nbsp;填写货物信息，便于保证运输中不出现损坏
					  </div>
					  <div class="panel-body">
					     <div class="form-group col-sm-9" >
						    <label for="inputEmail3" class="col-sm-3 control-label"><font color="red">*</font>货物名称:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text" class="form-control" name="belaidupProdName"  placeholder="请输入物品名称" >
						    </div> 
						    <a href="${ctx}/contrabandExplain.htm" style="color: #FF7300">禁运品说明</a>
						  </div>
						  <div class="form-group col-sm-9"  >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>包装总件数:</label>
						    <div class="col-sm-6" align="left">
						     <input type="text" class="form-control"  name="number" placeholder="请输入物品包装件数" >
						    </div> 
						    <div class="col-sm-3" ></div>
						  </div>
						  <div class="form-group col-sm-9" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>货物类型:</label>
						    <div class="col-sm-6" align="left">
						          <select name="goodstypeId" id="goodstypeId" class="form-control" >
									<option value="">--请选择--</option>
									 <c:forEach items="${StorehouseGoodstypeSetList}" var="StorehouseGoodstypeSet" varStatus="status">
										<option value="${StorehouseGoodstypeSet.goodstypeId}">${StorehouseGoodstypeSet.goodstypeName}</option>
									 </c:forEach>
							     </select> 
						    </div>  
						  </div>
						  
						   <div class="form-group col-sm-9" >
						    <label for="inputEmail3" class="col-sm-3 control-label" ><font color="red">*</font>包装类型:</label>
						    <div class="col-sm-6" align="left">
						          <select class="form-control" name="packageDisplay"  >
							      <option value="">--请选择--</option>
								    <c:forEach items="${storehousePackagetype}" var="ty">  
						             	<option value="${ty.packagetypeId}" >${ty.packagetypeName}</option>
								    </c:forEach>   
						    	</select> 
						    </div>  
						  </div>
						  
						  <div class="form-group col-sm-9" >
						    <label for="inputEmail3" class="col-sm-3 control-label" >取货方式:</label>
						    <div class="col-sm-6" align="left">
						      <select class="form-control" name="replenishment">
							    <option value="storepickup">上门取货</option>  
							    <option value="deliversm">送货上门</option>  
							  </select>
						    </div>  
						  </div>  
					<%-- 	  <div class="form-group col-sm-9">
						    <label for="inputEmail3" class="control-label col-sm-3">总体积:</label>
						    <div class="col-sm-6">
						       <input type="text" placeholder="请填入货物体积(立方米)" class="form-control" name="belaidupBulk" onkeyup="if(this.value==this.value2)return;if(this.value.search(/^\d*(?:\.\d{0,2})?$/)==-1)this.value=(this.value2)?this.value2:'';else this.value2=this.value;">
						    </div> 
						</div>
						<div class="form-group col-sm-9">
						    <label for="inputEmail3" class="control-label col-sm-3">总重量：</label>
						    <div class="col-sm-6">
						       <input type="text" placeholder="请填入货物重量(公斤)" class="form-control" name="belaidupWeight" onkeyup="if(this.value==this.value2)return;if(this.value.search(/^\d*(?:\.\d{0,2})?$/)==-1)this.value=(this.value2)?this.value2:'';else this.value2=this.value;">
						    </div>
						      <a href="${ctx}/weightExplain.htm" style="color: #FF7300">什么是重货轻货？</a>
						 </div>  --%>
						  <div class="form-group col-sm-9" >
						    <label for="inputEmail3" class="col-sm-3 control-label" >注意事项:</label>
						    <div class="col-sm-6" align="left">
						      <textarea class="form-control" name="remark" rows="2"></textarea>
						    </div>  
						  </div>  
					  <input type="hidden" name="modeOfPayment"   value="spotpayment">
									
					<!--  <div class="form-group col-sm-9" >
						         <label for="inputEmail3" class="col-sm-3 control-label" >支付方式:</label>
							     <div class="col-sm-6" style="float: left;"> 
								     <div class="radio" style="float: left;">
										  <label>
										    <input type="radio" name="modeOfPayment"  checked="checked"  value="spotpayment">
										          发货人支付
										   </label>
									  </div> 
									  <div class="radio" style="float: left;padding-top: 15px;padding-left: 35px">
										  <label>
										    <input type="radio" name="modeOfPayment"   value="reachpayment">
										        收货人支付（到付）
										   </label>
									  </div>
							     </div>
						  </div>  -->
						  <div class="form-group col-sm-9" align="center">
					               <button style="width: 160px" type="submit" class="btn btn-primary">下一步</button> 
					       </div> 
					  </div>
					  <div class="panel-footer">该功能只在用户登录后操作有效,若无登录,请登录后操作!</div>
				   </div>
				</form>
      	  	</div> 
		 </div>
	</div> 
 
        <!-- 模态框（Modal） -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"  
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
			         <div class="modal-body"  style="color:#0697DA "> 
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
		<div class="modal fade" id="mymsg" tabindex="-1" role="dialog"  
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
			         <div class="modal-body"  style="color:#0697DA " id="msg"> 
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
	 $("#form_delivery").validate({
    	   rules:{
    		 consignor:{
    			 required:true
    		 },
    		 belaidupInitiatin:{
    		    required:true
    		 },
    		 sendAddress:{
    			 required:true
    		 },
    		 sendPhone:{
    			 required:true,
    			 number:true,
    			 isMobile:true
    		 },
    		 orderConsignee:{
       			 required:true
       		 },
       		 belaidupTerminu:{
       		    required:true
       		 },
       		orderAddress:{
       			 required:true
       		 },
       		orderPhone:{
       			 required:true,
       			 number:true,
       			 isMobile:true,
       		 },
       		belaidupProdName:{
       			required:true
       		},
       		goodstypeId:{
	    		required:true
	    	},
	    	number:{
       			required:true,
       			number:true,
       			min:1
       		}
       	  },
    	 messages:{
    		 consignor:{
    			 required:"发货人姓名不能为空!"
    		 },
    		 belaidupInitiatin:{
    			 required:"发货地址不能为空!"
    		 },
    		 sendAddress:{
    			 required:"发货详细地址不能为空!"
    		 },
    		 sendPhone:{
    			required:"发货人手机不能为空!",
 	    		number:"请输入合法手机号码!",
 	    		isMobile:"请输入合法手机号码!"
    		 },
    		 orderConsignee:{
    			 required:"收货人姓名不能为空!"
    		 },
    		 belaidupTerminu:{
    			 required:"收货地址不能为空!"
    		 },
    		 orderAddress:{
    			 required:"收货详细地址不能为空!"
    		 },
    		 orderPhone:{
    			required:"收货人手机不能为空!",
 	    		number:"请输入合法手机号码!",
 	    		isMobile:"请输入合法手机号码!"
    		 },
    		 belaidupProdName:{
    			 required:"货物名称不能为空!", 
    		 },
    		 goodstypeId:{
 	    		required:"寄送货物类型不能为空!"
 	    	},
    		 number:{
    			 required:"货物数量不能为空!",
    			 number:"请填写合法数量!"
    		 }
    	 },  
    	 submitHandler:function(){
    		 $('#myModal').modal('show'); 
    	 }
     });
   
	 $("#sub").click(function(){
		 $("#form_delivery").submit();
	});
	 
	  //提交表单
	 function sub(){
			  $.ajax({
				   type: "POST",
				   url: ctx + '/delivery/belaidup.json',
				   data: $("#form_delivery").serialize(),
				   dataType:'json',
				   success: function(r){
					   $("#msg").empty();
					   if(r.msg!=""){ 
						   $("#msg").text(r.msg); 
						   $('#mymsg').modal('show');  
					   } 
					    hiden(r); 
				   }
	   	     });
		} 
	  
	//隐藏消息提示层，如果是未登录的，直接转到登录页面
		function hiden(r){ 
			  $('#mymsg').modal('hide');  
			     var text=$("#msg").text(); 
			     if(text== "请先登录，再操作！"){ 
					 window.location.href=ctx +"/login.htm"; 
				 }
			     if(r.success){   //转到下一个选择班线页面
			    	 window.location.href=ctx +"/delivery/routeInfo.htm?p=1"; 
				  }
		} 
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
   </body>
</html>

