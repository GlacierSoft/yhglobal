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
                 <div class="panel panel-primary">
                    <div class="panel-heading">
    					<h3 class="panel-title">我要发货</h3>
  					</div>
					<div class="panel-body">
					      <div class="form-group col-sm-12">
							    <label for="inputEmail3" class="control-label col-sm-1">发货方</label>
							    <label for="inputEmail3" class="control-label col-sm-4"  style="color: #428BCA;">填写完整、准确信息，物流跟进更及时</label>
						  		<h4 class="panel-title"><a class="btn btn-primary" href="${ctx}/template/index.htm?&p=1" style="float: right;">发货模板</a></h4>
						  </div>
					      <div class="form-group col-sm-12">
							    <label for="inputEmail3" class="control-label col-sm-1">联系人</label>
							    <div class="col-sm-4">
							      <input type="text" placeholder="请选择联系人" class="form-control" name="consignor">
							    </div>
						</div> 
						<div class="form-group col-sm-12">
							    <label for="inputEmail3" class="control-label col-sm-1">所在地</label>
							    <div class="col-sm-4">
							        <input type="text" style="width: 265px;float: left;height: 35px;border-color: #c3d9e0;" name="belaidupInitiatin" autocomplete="off" type="text" placeholder="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll form-control">
							    </div>
						</div>
						<div class="form-group col-sm-12">
							    <label for="inputEmail3" class="control-label col-sm-1">街道</label>
							    <div class="col-sm-4">
							      <input type="text" placeholder="请填写发货公司街道地址" class="form-control" name="sendAddress">
							    </div>
							    <label for="inputEmail3" class="control-label col-sm-3" style="color: #FF7401;">不需要重复填写省/市/区</label>
						</div>
						<div class="form-group col-sm-12">
							    <label for="inputEmail3" class="control-label col-sm-1">手机</label>
							    <div class="col-sm-4">
							      <input type="text" placeholder="请选择联系人" class="form-control" name="sendPhone" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
							    </div>
						</div>
					</div>
					<div class="panel panel-default">
						 	 <div class="panel-body">
							      <div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">收货方</label>
								    <label for="inputEmail3" class="control-label col-sm-4" style="color: #428BCA;">填写完整、准确信息，物流跟进更及时</label>
							 	 </div>
						      	<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">联系人</label>
								    <div class="col-sm-4">
								      <input type="text" placeholder="请选择联系人" class="form-control" name="orderConsignee" >
								    </div>
								</div> 
								<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">所在地</label>
								    <div class="col-sm-4">
								      <input type="text" style="width: 265px;float: left;height: 35px;border-color: #c3d9e0;" name="belaidupTerminu" autocomplete="off" type="text" placeholder="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll form-control">
								    </div>
								</div>
								<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">街道</label>
								    <div class="col-sm-4">
								      <input type="text" placeholder="请填写收货公司街道地址" class="form-control" name="orderAddress">
								    </div>
								    <label for="inputEmail3" class="control-label col-sm-3" style="color: #FF7401;">不需要重复填写省/市/区</label>
								</div>
								<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">手机：</label>
								    <div class="col-sm-4">
								      <input type="text" placeholder="请填写合法手机号码" class="form-control"  name="orderPhone" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
								    </div>
								</div>
							</div>
					</div>
					<div class="panel-body">
					      <div class="form-group col-sm-12">
						    <label for="inputEmail3" class="control-label col-sm-6">货物信息&nbsp;&nbsp;&nbsp;
						        <font style="color: #428BCA;">填写完整、准确信息，物流跟进更及时</font>
						    </label>
						    <label for="inputEmail3" class="control-label col-sm-4" ></label>
						 </div>
				      	<div class="form-group col-sm-12">
						    <label for="inputEmail3" class="control-label col-sm-1">名称</label>
						    <div class="col-sm-4">
						      <input type="text" placeholder="请选择联系人" class="form-control" name="belaidupProdName">
						    </div>
						</div>
						<div class="form-group col-sm-12">
						    <label for="inputEmail3" class="col-sm-1 control-label">类型</label>
						    <div class="col-sm-4">
						          <select name="goodstypeId" id="goodstypeId" class="form-control" >
									<option value="">--请选择--</option>
									 <c:forEach items="${StorehouseGoodstypeSetList}" var="StorehouseGoodstypeSet" varStatus="status">
										<option value="${StorehouseGoodstypeSet.goodstypeId}">${StorehouseGoodstypeSet.goodstypeName}</option>
									 </c:forEach>
							     </select>
						    </div>
						 </div>
						<div class="form-group col-sm-12">
						    <label for="inputEmail3" class="control-label col-sm-1">件数</label>
						    <div class="col-sm-4">
						      <input type="text" placeholder="请填写件数" class="form-control" name="number">
						    </div>
						    <label for="inputEmail3" class="control-label col-sm-1" style="color: #FF7401;">件/个</label>
						</div>
						<div class="form-group col-sm-12">
						    <label for="inputEmail3" class="control-label col-sm-1">体积</label>
						    <div class="col-sm-4">
						       <input type="text" placeholder="请填入货物体积(立方米)" class="form-control" name="belaidupBulk" onkeyup="if(this.value==this.value2)return;if(this.value.search(/^\d*(?:\.\d{0,2})?$/)==-1)this.value=(this.value2)?this.value2:'';else this.value2=this.value;">
						    </div>
						    <label for="inputEmail3" class="control-label col-sm-2" style="color: #FF7401;">立方米</label>
						</div>
						<div class="form-group col-sm-12">
						    <label for="inputEmail3" class="control-label col-sm-1">重量</label>
						    <div class="col-sm-4">
						       <input type="text" placeholder="请填入货物重量(公斤)" class="form-control" name="belaidupWeight" onkeyup="if(this.value==this.value2)return;if(this.value.search(/^\d*(?:\.\d{0,2})?$/)==-1)this.value=(this.value2)?this.value2:'';else this.value2=this.value;">
						    </div>
						    <label for="inputEmail3" class="control-label col-sm-2" style="color: #FF7401;">千克(KG)</label>
						</div>
						<div class="form-group col-sm-12">
						    <label for="inputEmail3" class="control-label col-sm-1">备注</label>
						    <div class="col-sm-4">
						      <input type="text" placeholder="注意事项" class="form-control" name="remark">
						    </div>
						    <label for="inputEmail3" class="control-label col-sm-2" style="color: #FF7401;">备注信息选填</label>
						</div>
					</div>
					 <div class="panel panel-default">		
					       <div class="panel-body">
							      <div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">其他</label>
								    <label for="inputEmail3" class="control-label col-sm-4" style="color: #428BCA;">填写完整、准确信息，物流跟进更及时</label>
								 </div>
						      	<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">取货</label>
								    <div class="col-sm-4">
								      <span class="input-group-addon">
        								<input type="radio" name="replenishment" value="storepickup"  checked="checked">上门取货
        								<input type="radio" name="replenishment" value="deliversm">送货上门
      								  </span>
								    </div>
								</div>
								<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">加急</label>
								    <div class="col-sm-4">
								      <span class="input-group-addon">
        								<input type="radio" name="yesOrNo" value="yes"  checked="checked">加急
        								<input type="radio" name="yesOrNo" value="no">普通
      								  </span>
								    </div>
								</div>
					       </div>
					  </div>
					  <div class="panel-body">
					           <div class="form-group col-sm-5"></div>
					          <div class="form-group col-sm-2">
					               <button type="submit" class="btn btn-primary">提交</button>
					               <button type="button" class="btn btn-primary" onclick="doReset()">重置</button>
					          </div>
					   </div>  
					<div class="panel-footer">该功能只在用户登录后操作有效,若无登录,请登录后操作!</div>
                 </div>
              </form>
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
       		},
       		belaidupWeight:{
       			required:true,
       		    number:true,
       		    min:0.001 
       		},
       		belaidupBulk:{
       			required:true,
       			number:true,
       			min:0.001
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
    		 },
    		 belaidupWeight:{
    			 required:"货物重量不能为空！",
    			 number:"请填入合法重量!",
    			 min:"重量最少为0.001KG"
    		 },
    		 belaidupBulk:{
    			 required:"货物体积不能为空！",
    			 number:"请填入合法体积!",
    			 min:"体积最少为0.001(立方米)"
    		 }
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
		    					   data: $("#form_delivery").serialize(),
		    					   dataType:'json',
		    					   success: function(r){
		    						 if(r.success){
		    							doReset();
		    							doDailog("发货成功,等待后台审核,可在记录中查看该条信息!");
		    						 }
		    						 else{
		    							doDailog("发货失败，请联系管理员，刷新后在操作!");
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
   
     function doReset(){
    	 $("#form_delivery")[0].reset();  
     };
     
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

