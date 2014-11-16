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
					        <li  class="active"><a href="#">订单查询</a></li> 
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
    					<h3 class="panel-title">订单查询${trackingData}</h3>
  					</div>
					<div class="panel-body">
					      <div class="form-group col-sm-12">
							    <label for="tisp" class="control-label col-sm-1">提示</label>
							    <label for="tisp1" class="control-label col-sm-4"  style="color: #428BCA;">未登录用户可凭单号进行货物跟踪查询</label>
						  </div>
					      <div class="form-group col-sm-12">
							    <label for="orderNumber" class="control-label col-sm-1">货物号</label>
							    <div class="col-sm-4">
							      <input type="text" placeholder="请输入订单号" class="form-control" name="codeNumber">
							    </div>
							    <button type="submit" class="btn btn-primary" style="float: left;">查询</button>
						</div>
					</div>
					<!-- 显示返回消息 -->
					<div id="returnTisp">
						
					</div>
                 </div>
              </form>
            </div>  
        </div>
    </div>

   
   <jsp:include page="../foot.jsp"/>
   
   <script type="text/javascript">
	 $("#form_delivery").validate({
    	 rules:{
    		 codeNumber:{
    			 required:true
    		 }
       	  },
    	 messages:{
    		 codeNumber:{
    			 required:"订单号不能为空!"
    		 }
    	 },
    	 submitHandler:function(){
    		 $.ajax({
				   type: "POST",
				   url: ctx+"/orderQuery/notLgoinQuery.htm",
				   dataType: "json",
				   data: $("#form_delivery").serialize(),
  			   	   success: function(r) {
  				   		var div='<div class="bs-example" style="margin-left: 40px">';
  				   			div+='<ul class="nav nav-pills" id="u3" style="width: 300px;text-align: center;">';
                   			div+='<li><font size="3"><b>货物跟踪</b></font></li>';
                   			div+='</ul>';
                   			div+='<table class="table table-bordered" style="text-align: left;">';
                   			div+='<thead><tr><th>处理时间</th><th>处理信息</th><th>操作人</th></tr></thead>';
                   			$.each(r,function(index,value){
                   				var time = new Date(value.createTime);//获取时间
                   				var years = time.getFullYear();
                   				var month = time.getMonth()+1;
                   				var date = time.getDate();
                   				var hour = time.getHours();
                   				var minute = time.getMinutes();
                   				var second = time.getSeconds();
                   				div+='<tbody>';
                   				div+='<tr>';
                   				div+='<td width="250">'+years+"-"+month+"-"+date+" "+hour+":"+minute+":"+second+'</td><td>'+value.message+'</td><td>'+value.createrDisplay+'</td>';
                   				div+='</tr>';
                   				div+='</tbody>';
                   			});
                   			//脚尾
                   			$.post("${ctx}/orderQuery/getBelaidup.htm",$("#form_delivery").serialize(),function(data){
                   				var sortingStauts = "";
                   				if(data[0].sortingStauts == 'waitsorting'){
                   					sortingStauts = "正在分拣货物中。。。";
               					}else if(data[0].sortingStauts == 'hassorting' && data[0].belaidupStatus == 'receiving'){
               						sortingStauts = "已分拣货物完毕，等待出库。";
               					}else if(data[0].sortingStauts == 'hassorting' && data[0].belaidupStatus == 'delivery'){
               						sortingStauts = "该货物已出库，请您耐心等待。";
               					}
                   				div+='<tfoot>';
                   				div+='<tr><th colspan="3"><h4 align="center"><a href="#" >'+sortingStauts+'</a></h4></th></tr>';
                   				div+='</tfoot>';
                   				div+='</table>';
                       			div+='</div>';
                       			$("#returnTisp").append(div);
                   			},"json");
  			   	   },
	               error: function() {
	                  alert("提交出错！");
	               }
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
   </script>
  </body>
</html>

