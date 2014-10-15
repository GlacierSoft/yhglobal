<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 获取项目根path -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

    	<!-- NAVBAR START============================= -->
	    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="${ctx}/index.htm">越海物流</a>
	        </div>
	        <div class="navbar-collapse collapse">
	          <ul id="topNavBar" class="nav navbar-nav">
	            <script type="text/javascript">
	            	//页面进来即刻加载
	            	$(function(){
	            	    $.ajax({
	            	    	type:"post",
	            	    	url:"${ctx}/nav/levelWebNav.json",
	            	    	dataType:"json",
	            	    	success:function(data){
	            	    		var tips = '<%=session.getAttribute("tips")%>';
	            	    		//循环开始 
	            	    		$.each(data,function(index,comment){
	            	    			if(tips == 'null'){
	            	    		        if(index==0){
	            	    		        	$("<li class='active'><a id='navABar"+index+"' href='${ctx}/index.htm'>"+comment.webNavName+"</a></li>").appendTo("#topNavBar");
	            	    		        }else{
	            	    		        	$("<li id='nav"+index+"' class='dropdown' onclick='getWebNavPname(\""+comment.webNavId+"\",this,\""+comment.webNavName+"\",\""+comment.webNavUrl+"\");'><a id='navABar"
	            	    		        	+index+"' href='${ctx}"+comment.webNavUrl+"'  class='dropdown-toggle' data-toggle='dropdown'>"+comment.webNavName+"</a></li>").appendTo("#topNavBar");
	            	    		        }
	            	    			}else{
	            	    				if(tips == comment.webNavName){
	            	    		        	$("<li id='nav"+index+"' class='active' onclick='getWebNavPname(\""+comment.webNavId+"\",this,\""+comment.webNavName+"\",\""+comment.webNavUrl+"\");'><a id='navABar" + 
	            	    		        	index+"' class='dropdown-toggle' data-toggle='dropdown' href='${ctx}"+comment.webNavUrl+"'>"+comment.webNavName+"</a></li>").appendTo("#topNavBar");
	            	    		        }else{
	            	    		        	$("<li id='nav"+index+"' class='dropdown' onclick='getWebNavPname(\""+comment.webNavId+"\",this,\""+comment.webNavName+"\",\""+comment.webNavUrl+"\");'><a id='navABar"+index+"' href='${ctx}" + 
	            	    		        	comment.webNavUrl+"' class='dropdown-toggle' data-toggle='dropdown'>"+comment.webNavName+"</a></li>").appendTo("#topNavBar");
	            	    		        }
	            	    			}
	            	    		});
	            	    	}
	            	    });
	            	});
	            	//点击时取出子项
	            	function getWebNavPname(webNavId,obj,name,url){
	            		var id = $(obj).attr('id');//获取Id属性
	            		$.post("${ctx}/nav/list.json","webNavId="+webNavId+"&name="+name,function(data){
		            		if(data != ""){	//判断返回的数据是否为空
	            				//构建一个UL元素
		            			if(data != ""){
		            				var ul="<ul class='dropdown-menu'>";
		            			}
		            			$.each(data,function(i,v){
		            				ul+="<li><a href='${ctx}"+v.webNavUrl+"'>"+v.webNavName+"</a></li>";
		            			});
		            			if(data != ""){
		            				ul+="<ul>";
		            				$("#"+id).append(ul);//追加内容在某个元素结束前
		            			}
		            		}else{
		            			location.href="${ctx}"+url;
		            		}
	            		},"json");
	            	}
	            </script>
	          </ul>
	          	<p class="navbar-text navbar-right">
	          	<c:choose>
				   <c:when test="${empty currentMember}">  
		         		<span>您好！| <a href="${ctx}/login.htm" class="navbar-link">登录</a> |</span>
		         		<span><a href="${ctx}/intoregister.htm" class="navbar-link">货主注册</a> |</span>
		         		<span><a href="${ctx}/intoregisterCarrier.htm" class="navbar-link">承运商注册</a></span>
				   </c:when>
			   	<c:otherwise> 
				   		<span>您好！${currentMember.memberName}
				   		  <c:choose>
				   		      <c:when test="${empty currentMember.memberName}">
				   		     	 <a  href="${ctx}/member/memberDetail.htm?&p=1" class="navbar-link">
				   		         <span id="nav_messageNoticCount" class="badge">${messageNoticCount}</span>
				   		         </a>  
				   		      </c:when>
				   		      <c:otherwise>
				   		      	 <a  href="${ctx}/messageNotice/intoMessageNotice.htm?&p=1" class="navbar-link">
				   		         <span id="nav_messageNoticCount" class="badge">${messageNoticCount}</span>
				   		        </a> 
				   		      </c:otherwise>
				   		 </c:choose>|</span>
				   		<span><a href="${ctx}/member/index.htm" class="navbar-link">个人中心</a> |</span>
				   		<span><a href="${ctx}/logout.htm" class="navbar-link">退出</a></span>
				   </c:otherwise>
				</c:choose>
   				</p>
	        </div>
	      </div>
	    </nav>
	    <!-- NAVBAR END============================= -->
