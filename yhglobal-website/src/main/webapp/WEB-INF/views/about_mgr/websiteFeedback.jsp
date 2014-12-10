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
			    <div class="panel-group" id="accordion">
				    <div class="panel panel-default">
				  		<div class="bs-example">
					      <ul class="nav nav-pills nav-stacked" style="max-width: 300px;">
					        <li><a href="${ctx}/aboutUs.htm">公司简介</a></li>
					        <li><a href="${ctx}/announcement/announcement.htm?&p=1">网站公告</a></li>
						    <li><a href="${ctx}/hiring/hiring.htm?&p=1">招纳贤士</a></li>
					        <li><a href="${ctx}/contactUs.htm">联系我们</a></li>
					        <li><a href="${ctx}/others/otherAddress.htm">公司地图</a></li>
					        <li><a href="${ctx}/others/others.htm">其他业务</a></li>
					        <li class="active"><a href="${ctx}/feedback/feedback.htm">意见反馈</a></li>
					      </ul>
				  		</div>
				  	</div>
				  	<div class="panel panel-default">
				  		<div class="bs-example">
					      <ul class="nav nav-pills nav-stacked" style="max-width: 300px;">
					         <li><a href="#" id="new">新闻资讯>></a>
							   <ul class="nav nav-pills nav-stacked"   id="u2">
							       <li name="trade"><a href="${ctx}/news/news.htm?&p=1&type=trade">贸易新闻</a></li>
							       <li name="land"><a href="${ctx}/news/news.htm?&p=1&type=land">陆运新闻</a></li>
							       <li name="airlift"><a href="${ctx}/news/news.htm?&p=1&type=airlift">空运新闻</a></li>
							       <li name="sea"><a href="${ctx}/news/news.htm?&p=1&type=sea">海运新闻</a></li>
							    </ul>  
						    </li> 
					      </ul>
				  		</div>
				  	</div>
				  	
				  	<div class="panel panel-default">
						<img src="${pageContext.request.contextPath}/resources/images/newbie/about001.jpg" alt="联系我们">
					</div>
					<div class="panel panel-default">
						<img src="${pageContext.request.contextPath}/resources/images/index/weixin.jpg" width="163" height="163" alt="联系我们">
						<p>扫描二维码关注冰川越海物流微信，获取冰川越海物流最新动态 </p>
					</div>
				</div>
	  		</div>
         <div class="col-md-10">
      	 <form action="" method="post" id="form_delivery">
                 <div class="panel panel-primary">
                    <div class="panel-heading">
    					<h3 class="panel-title">意见反馈</h3>
  					</div>
					<div class="panel-body">
						<h4 style="margin-left: 30px;">您的联系方式</h4>
						<div class="form-group col-sm-9" style="margin-top: 20px;">
							 <label for="inputEmail3" class="col-sm-2 control-label"><font color="red">*</font>姓名:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text"  class="form-control" placeholder="请填写姓名" value="${memberData.memberName }"  name="webFdbName">
						    </div>
						</div>
						<div class="form-group col-sm-9">
							 <label for="inputEmail3" class="col-sm-2 control-label"><font color="red">*</font>号码:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text"  class="form-control" placeholder="请填写联系号码" value="${memberPhone }"  name="webFdbPhone">
						    </div>
						</div>  
						<div class="form-group col-sm-9">
							 <label for="inputEmail3" class="col-sm-2 control-label"><font color="red">*</font>邮箱:</label>
						    <div class="col-sm-6" align="left">
						      <input type="text"  class="form-control" placeholder="请填写常用邮箱" value="${memberData.email }"  name="webFdbEmail">
						    </div>
						</div> 
					</div>
					<div class="panel-body">
						<h4 style="margin-left: 30px;">您的意见与反馈</h4>
						<div class="form-group col-sm-9" style="margin-top: 20px;">
						    <div class="col-sm-6" align="left">
						      <textarea id="webAnnContent" name="remark" class="spinner" style="width:600px;height:280px;"></textarea>
						    </div>
						</div>
					</div>
					<div class="panel-body" style="margin-left: 30px;">
					<button type="submit" class="btn btn-primary" >发送</button>
					</div>
                 </div>
              </form>
            </div>  
        </div>
    </div>

   
   <jsp:include page="../foot.jsp"/>
   </body>
</html>
<script type="text/javascript">
KindEditor.options.filterMode = false;
KindEditor.ready(function(K) {
	K.each({
		'plug-align' : {
			name : '对齐方式',
			method : {
				'justifyleft' : '左对齐',
				'justifycenter' : '居中对齐',
				'justifyright' : '右对齐'
			}
		},
		'plug-order' : {
			name : '编号',
			method : {
				'insertorderedlist' : '数字编号',
				'insertunorderedlist' : '项目编号'
			}
		},
		'plug-indent' : {
			name : '缩进',
			method : {
				'indent' : '向右缩进',
				'outdent' : '向左缩进'
			}
		}
	},function( pluginName, pluginData ){
		var lang = {};
		lang[pluginName] = pluginData.name;
		KindEditor.lang( lang );
		KindEditor.plugin( pluginName, function(K) {
			var self = this;
			self.clickToolbar( pluginName, function() {
				var menu = self.createMenu({
						name : pluginName,
						width : pluginData.width || 100
					});
				K.each( pluginData.method, function( i, v ){
					menu.addItem({
						title : v,
						checked : false,
						iconClass : pluginName+'-'+i,
						click : function() {
							self.exec(i).hideMenu();
						}
					});
				})
			});
		});
	});
	K.create('#webAnnContent', {
		themeType : 'qq',
		allowFileManager : true,
		minWidth : "600px",
		uploadJson : '../resources/js/kindeditor/jsp/upload_json.jsp',
        fileManagerJson : '../resources/js/kindeditor/jsp/file_manager_json.jsp',
        allowFileManager : true,
        urlType:'domain',
		afterBlur : function() {
			this.sync();
			K.ctrl(document, 13, function() {
				K('form[name=myform]')[0].submit();
			});
			K.ctrl(this.edit.doc, 13, function() {
				K('form[name=myform]')[0].submit();
			});
		},
		items : [
			'bold','italic','underline','fontname','fontsize','forecolor','hilitecolor','plug-align','plug-order','plug-indent','link','code','emoticons','flash','table','lineheight','fullscreen','image'
		]
	});
});

$("#form_delivery").validate({
	 rules:{
		 webFdbName:{
			 required:true
		 },
		 webFdbPhone:{
			number:true,
			required:true,
			isMobile:true
		 },
		 webFdbEmail:{
		    required:true
		 },
		 remark:{
			 required:true
		 }
 	  },
	 messages:{
		 webFdbName:{
			 required:"姓名不能为空!"
		 },
		 webFdbPhone:{
			 number:"请输入合法手机号码",
			 required:"号码不能为空",
			 sMobile:"请输入合法手机号码"
		 },
		 webFdbEmail:{
			 required:"邮箱不能为空!"
		 },
		 remark:{
			 required:"内容不能为空!"
		 }
	 },
	 submitHandler:function(){
		 $.ajax({
			   type: "POST",
			   url: ctx + '/feedback/addfeedback.json',
			   data: $("#form_delivery").serialize(),
			   dataType:'json',
			   success: function(r){
				 if(r.success){
					doDailog(r.msg);
				 }
				 else{
					doDailog(r.msg);
				 }
			   }
			 });
	 }
});

//公共对话框定义
function  doDailog(str){
	  KindEditor.ready(function(K) {
		  var dialog = K.dialog({
		        width : 500,
		        title : '温馨提示',
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
	                        dialog.remove();
	                }
	        }
		}); 
	  });
}
</script>
