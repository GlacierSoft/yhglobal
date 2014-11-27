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
	<style type="text/css">
		body {
		    padding-top: 100px;
		}
		ol, ul {
		    list-style: none outside none;
		    margin: 0;
    		padding: 0;
		}
	  </style>
  </head>

  <body>
      
      <jsp:include page="../nav.jsp"/>
    
        <div class="container">
	    <div class="row">
		    <div class="col-md-2">
	    		<div class="panel-group" id="accordion">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
					      	  Titles Name
					        </a>
					      </h4>
					    </div>
					    <div id="collapseOne" class="panel-collapse collapse in">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					          <a href="${ctx}/member/index.htm" class="btn btn-default" role="button">会员信息</a>
					          <a href="${ctx}/member/release.htm" class="btn btn-default" role="button">发布货源</a>
					          <a href="${ctx}/member/releaseManager.htm?loanState=firstAudit&p=1"  class="btn btn-default" role="button">货源管理</a>
					          <a href="${ctx}/member/memberLetterStation.htm"  class="btn btn-info" role="button">站内信</a>
							  <a href="${ctx}/member/memberDetail.htm" class="btn btn-default" role="button">Content5</a>
							  <a href="${ctx}/member/memberPhotoInto.htm" <%-- onclick="checksMember('${currentMember.memberId}','${ctx}/member/memberPhotoInto.htm');" --%> class="btn btn-default" role="button">Content6</a>
							  <a href="${ctx}/member/memberEmail.htm" class="btn btn-default" role="button">Content7</a>
							</div>
					      </div>
					    </div>
					  </div>
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
					         	Titles Name Two
					        </a>
					      </h4>
					    </div>
					    <div id="collapseTwo" class="panel-collapse collapse">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
							  <a href="#" class="btn btn-default" role="button">Content1</a>
							  <a href="#" class="btn btn-default" role="button">Content2</a>
							  <a href="#" class="btn btn-default" role="button">Content3</a>
							</div>
					      </div>
					    </div>
					  </div>
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseThree">
					    	     Titles Name Three
					        </a>
					      </h4>
					    </div>
					    <div id="collapseThree" class="panel-collapse collapse">
					      <div class="panel-body">
					      	<div class="btn-group-vertical">
					      	  <a href="#" class="btn btn-default" role="button">Content1</a>
					      	  <a href="#" class="btn btn-default" role="button">Content2</a>
					      	  <a href="#" class="btn btn-default" role="button">Content3</a>
					      </div>
					    </div>
					  </div>
					</div>
				</div>
	    	</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">个人中心 /站内信</h3>
				  </div>
				  <div class="panel-body">
				       <a id="repaymenting" href="" class="btn btn-default"  style="background: #FF5400;color: white;" role="button">全部记录</a>
			   	       <a id="completed" href="" class="btn btn-default" role="button">未读信息</a>
			   	       <a id="completed" href="" class="btn btn-default" role="button">已读信息</a>
			   	       <a id="completed" href="" class="btn btn-default" role="button">标记已读</a>
			   	       <a id="completed" href="" class="btn btn-default" role="button">标记未读</a>
			   	       <a id="completed" href="" class="btn btn-default" role="button">删除信息</a>
				</div>
	    	</div>
	    </div>
	  </div>
 </div>
 <jsp:include page="../foot.jsp"/>

<script type="text/javascript">
            
              
</script>

</body>
</html>