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
    <Div class="Container">       
        <Div class="row">
           <Div class="col-md-1"></Div>
           <Div class="col-md-10">
               <form action="" method="post" id="form_delivery">
                 <div class="panel panel-primary">
                    <div class="panel-heading">
    					<h3 class="panel-title">我要发货</h3>
  					</div>
					<div class="panel-body">
					      <div class="form-group col-sm-12">
							    <label for="inputEmail3" class="control-label col-sm-1">发货方</label>
							    <label for="inputEmail3" class="control-label col-sm-4">填写完整、准确信息，物流跟进更及时</label>
						  </div>
					      <div class="form-group col-sm-12">
							    <label for="inputEmail3" class="control-label col-sm-1">联系人：</label>
							    <div class="col-sm-4">
							      <input type="text" placeholder="请选择联系人" class="form-control" name="sendPeople">
							    </div>
						</div>
						<div class="form-group col-sm-12">
							    <label for="inputEmail3" class="control-label col-sm-1">公司：</label>
							    <div class="col-sm-4">
							      <input type="text" placeholder="请填写发货方公司" class="form-control" name="sendCompany">
							    </div>
						</div>
						<div class="form-group col-sm-12">
							    <label for="inputEmail3" class="control-label col-sm-1">所在地：</label>
							    <div class="col-sm-4">
							      <input type="text" placeholder="请填写发货公司所在地" class="form-control" name="sendAddress">
							    </div>
						</div>
						<div class="form-group col-sm-12">
							    <label for="inputEmail3" class="control-label col-sm-1">街道地址</label>
							    <div class="col-sm-4">
							      <input type="text" placeholder="请填写发货公司街道地址" class="form-control" name="sendStreet">
							    </div>
							    <label for="inputEmail3" class="control-label col-sm-3">不需要重复填写省/市/区</label>
						</div>
						<div class="form-group col-sm-12">
							    <label for="inputEmail3" class="control-label col-sm-1">手机：</label>
							    <div class="col-sm-4">
							      <input type="text" placeholder="请选择联系人" class="form-control" name="sendPhone" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
							    </div>
							     <label for="inputEmail3" class="control-label col-sm-3">手机与固话必须填写其中的一项</label>
						</div>
						<div class="form-group col-sm-12">
							    <label for="inputEmail3" class="control-label col-sm-1">联系人</label>
							    <div class="col-sm-2">
							      <input type="text" placeholder="区号" class="form-control">
							    </div>
							    <div class="col-sm-2">
							      <input type="text" placeholder="电话号" class="form-control ">
							    </div>
							    <div class="col-sm-2">
							      <input type="text" placeholder="分机号" class="form-control ">
							    </div>
						</div>
					</div>
					<div class="panel panel-default">
						 	 <div class="panel-body">
							      <div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">收货方</label>
								    <label for="inputEmail3" class="control-label col-sm-4">填写完整、准确信息，物流跟进更及时</label>
							 	 </div>
						      	<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">联系人：</label>
								    <div class="col-sm-4">
								      <input type="text" placeholder="请选择联系人" class="form-control" name="receivePeople">
								    </div>
								</div>
								<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">公司：</label>
								    <div class="col-sm-4">
								      <input type="text" placeholder="请填写发货方公司" class="form-control" name="receiveCompany">
								    </div>
								</div>
								<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">所在地：</label>
								    <div class="col-sm-4">
								      <input type="text" placeholder="请填写发货公司所在地" class="form-control" name="receiveAddress">
								    </div>
								</div>
								<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">街道地址</label>
								    <div class="col-sm-4">
								      <input type="text" placeholder="请填写发货公司街道地址" class="form-control" name="receiveStreet">
								    </div>
								    <label for="inputEmail3" class="control-label col-sm-3">不需要重复填写省/市/区</label>
								</div>
								<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">手机：</label>
								    <div class="col-sm-4">
								      <input type="text" placeholder="请填写合法手机号码" class="form-control" name="receivePhone" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
								    </div>
								     <label for="inputEmail3" class="control-label col-sm-3">手机与固话必须填写其中的一项</label>
								</div>
							   <div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">联系人</label>
								    <div class="col-sm-2">
								      <input type="text" placeholder="区号" class="form-control ">
								    </div>
								    <div class="col-sm-2">
								      <input type="text" placeholder="电话号" class="form-control ">
								    </div>
								    <div class="col-sm-2">
								      <input type="text" placeholder="分机号" class="form-control ">
									</div>
								</div>
						  </div>
					</div>
					           <div class="panel-body">
							      <div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-2">货物信息</label>
								 </div>
						      	<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">货物名称</label>
								    <div class="col-sm-4">
								      <input type="text" placeholder="请选择联系人" class="form-control" name="goodsName">
								    </div>
								</div>
								<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">包装件数</label>
								    <div class="col-sm-3">
								      <input type="text" placeholder="请填写发货方公司" class="form-control" name="goodsNumber">
								    </div>
								    <label for="inputEmail3" class="control-label col-sm-1">件</label>
								</div>
								<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">总重量：</label>
								    <div class="col-sm-2">
								      <input type="text" placeholder="公斤" class="form-control" name="goodsWeight" onkeyup="if(this.value==this.value2)return;if(this.value.search(/^\d*(?:\.\d{0,2})?$/)==-1)this.value=(this.value2)?this.value2:'';else this.value2=this.value;">
								    </div>
								    <label for="inputEmail3" class="control-label col-sm-1">公斤</label>
								    <label for="inputEmail3" class="control-label col-sm-1">或</label>
								    <label for="inputEmail3" class="control-label col-sm-1">总体积：</label>
								    <div class="col-sm-2">
								      <input type="text" placeholder="立方米" class="form-control" name="goodsSpace" onkeyup="if(this.value==this.value2)return;if(this.value.search(/^\d*(?:\.\d{0,2})?$/)==-1)this.value=(this.value2)?this.value2:'';else this.value2=this.value;">
								    </div>
								    <label for="inputEmail3" class="control-label col-sm-1">立方米</label>
								    <label for="inputEmail3" class="control-label col-sm-2">用于估算运费</label>
								</div>
								<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">注意事项</label>
								    <div class="col-sm-4">
								      <input type="text" placeholder="注意事项" class="form-control">
								    </div>
								</div>
							</div>
					 <div class="panel panel-default">		
					       <div class="panel-body">
							      <div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-2">支付方式</label>
								 </div>
						      	<div class="form-group col-sm-12">
								    <label for="inputEmail3" class="control-label col-sm-1">货物名称</label>
								    <div class="col-sm-4">
								      <span class="input-group-addon">
        								<input type="radio" name="pay_way" value="发货人支付（现付）"  checked="checked">发货人支付（现付）
        								<input type="radio" name="pay_way" value="收货人支付（到付）">收货人支付（到付）
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
					<div class="panel-footer">地址：珠海市唐家镇哈工大路一号工大集团新经济资源开发港博士楼A301E</div>
                 </div>
              </form>
             </Div>
           <Div class="col-md-1"></Div>       
        </Div>       
    </Div> 
    

   
   <jsp:include page="../foot.jsp"/>
   
   <script type="text/javascript">
	 $("#form_delivery").validate({
    	 rules:{
    		 sendPeople:{
    			 required:true
    		 },
    		 sendCompany:{
    		     required:true
    		 },
    		 sendAddress:{
    		    required:true
    		 },
    		 sendStreet:{
    			 required:true
    		 },
    		 sendPhone:{
    			 required:true,
    			 number:true,
    			 isMobile:true
    		 },
    		 receivePeople:{
       			 required:true
       		 },
       		 receiveCompany:{
       		     required:true
       		 },
       		 receiveAddress:{
       		    required:true
       		 },
       		 receiveStreet:{
       			 required:true
       		 },
       		 receivePhone:{
       			 required:true,
       			 number:true,
       			 isMobile:true,
       		 },
       		goodsName:{
       			required:true
       		},
       		goodsNumber:{
       			required:true,
       			number:true,
       			min:1
       		},
       		goodsWeight:{
       			required:true,
       		    number:true,
       		    min:0.001 
       		},
       		goodsSpace:{
       			required:true,
       			number:true,
       			min:0.001
       		}
       	  },
    	 messages:{
    		 sendPeople:{
    			 required:"发货人姓名不能为空!"
    		 },
    		 sendCompany:{
    			 required:"发货公司不能为空!"
    		 },
    		 sendAddress:{
    			 required:"发货地址不能为空!"
    		 },
    		 sendStreet:{
    			 required:"发货详细地址不能为空!"
    		 },
    		 sendPhone:{
    			required:"发货人手机不能为空!",
 	    		number:"请输入合法手机号码!",
 	    		isMobile:"请输入合法手机号码!"
    		 },
    		 receivePeople:{
    			 required:"收货人姓名不能为空!"
    		 },
    		 receiveCompany:{
    			 required:"收货公司不能为空!"
    		 },
    		 receiveAddress:{
    			 required:"收货地址不能为空!"
    		 },
    		 receiveStreet:{
    			 required:"收货详细地址不能为空!"
    		 },
    		 receivePhone:{
    			required:"收货人手机不能为空!",
 	    		number:"请输入合法手机号码!",
 	    		isMobile:"请输入合法手机号码!"
    		 },
    		 goodsName:{
    			 required:"货物名称不能为空!", 
    		 },
    		 goodsNumber:{
    			 required:"货物数量不能为空!",
    			 number:"请填写合法数量!"
    		 },
    		 goodsWeight:{
    			 required:"货物重量不能为空！",
    			 number:"请填入合法重量!",
    			 min:"重量最少为0.001KG"
    		 },
    		 goodsSpace:{
    			 required:"货物体积不能为空！",
    			 number:"请填入合法体积!",
    			 min:"体积最少为0.001(立方米)"
    		 }
    	 },
    	 submitHandler:function(){
    		 alert("功能正在完善!!!!");
    	 }
     });
   
     function doReset(){
    	 $("#form_delivery")[0].reset();  
     };
  </script>
  
  </body>
</html>

