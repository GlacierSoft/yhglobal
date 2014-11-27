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
					          <a href="${ctx}/member/memberLetterStation.htm?p=1"  class="btn btn-info" role="button">站内信</a>
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
				<table  id="messageNoticeTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				  		<thead>
				  			<tr>
				              <td><input id="totalCheckbox" name="totalCheckbox" type="checkbox" value="" onclick="selectAll();"/></td>
				              <td><strong>标记</strong></td>
				              <td><strong>发件人</strong></td>
				              <td><strong>标题</strong></td>
				              <td><strong>类型</strong></td>
				              <td><strong>发送</strong></td>
				              <td><strong>操作</strong></td>
				            </tr>
				  		</thead>
				  		<tbody>
				  		     <c:if test="${empty shipperMemberMessageNoticeDate.rows}">
								<tr>
						            <td colspan="7"><strong>暂无信息</strong></td>
						        </tr>
							</c:if>	  		
							<c:if test="${!empty shipperMemberMessageNoticeDate.rows}">  		
					            <c:forEach items="${shipperMemberMessageNoticeDate.rows}" var="messageNotice" varStatus="status">
					             <tr>
						      	  	<td>
									    <input name="messageNoticeIds" type="checkbox" value="${messageNotice.messageNoticeId}" onclick="doChildCheck();">
									</td>
									<td>
									     <c:if test="${messageNotice.letterstatus=='read'}">
									            <span class="label label-default" style="background-color: #FF5400">已读</span>
									     </c:if>   
									     <c:if test="${messageNotice.letterstatus=='unread'}">
									           <span class="label label-default" style="background-color: #FF5400">未读</span>
									     </c:if>
									</td>	
					                <td>
					                    ${messageNotice.senderDisplay}
					                </td>
					                <td>
					              	    ${messageNotice.title}
					                </td>
					                <td>
					              	    ${messageNotice.lettertype=='system'?'系统消息':'账户消息'}
					                </td>
					                <td>
					                   <fmt:formatDate value="${messageNotice.sendtime}" type="both"/>
					                 </td>
					                 <td>
					                    <button  type="button" class="btn btn-primary" data-toggle="button" onclick="doClick(${messageNotice.messageNoticeId});">详情</button>
					                 </td>
					            </tr>
					            </c:forEach>
				            </c:if>
				         </tbody>
				  		<c:if test="${!empty shipperMemberMessageNoticeDate.rows}">  
				            <tfoot>
					          <tr>
					            <th colspan="7">
					            	<div align="right">
									    <ul id='pagemessageNotice'></ul>
									</div>
								</th>
					          </tr>
					        </tfoot>
					    </c:if>	
				</table>
				
				
				
	    	</div>
	    </div>
	  </div>
 </div>
 <jsp:include page="../foot.jsp"/>

<script type="text/javascript">
     $(function(){
    	//获得浏览器参数
 		$.extend({
 			getUrlVars: function(){
 				var vars = [], hash;
 				var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
 				for(var i = 0; i < hashes.length; i++){
 					hash = hashes[i].split('=');
 					vars.push(hash[0]);
 					vars[hash[0]] = hash[1];
 				}
 				return vars;
 			},
 			getUrlVar: function(name){
 				return $.getUrlVars()[name];
 			}
 		});
 		
 		//封装浏览器参数
 		var composeUrlParams=function(){
 			var param='';
 			$.each($.getUrlVars(), function(i, item) {
 				if(item!='p'){
 					var val=$.getUrlVar(item);
 					if(val) param += "&" + item+"="+val;
 				}
 			});
 			return param;
 		}
 		
 		var element = $('#pagemessageNotice');
 		
 		//设置分页的总页数
 		var total=${shipperMemberMessageNoticeDate.total}/5;
 		if(parseInt(total)==total){
 			var total = parseInt(total);
 		}else {
 			var total = parseInt(total)+1;
 		}
 		
 		var options = {
 		    bootstrapMajorVersion:3,
 		    currentPage: ${shipperMemberMessageNoticeDate.p},
 		    numberOfPages: 5,
 		    totalPages:total,
 		    pageUrl: function(type, page, current){
 		    	return "${ctx}/member/memberLetterStation.htm?"+composeUrlParams()+"&p="+page;
 		    }
 		}
 	    element.bootstrapPaginator(options);
     });          
     
     function doClick(id){
    	var url=ctx + '/memberMessageNotice/intoDetail.htm?messageNoticeId='+id;
      	art.dialog.open(url, {
               width: '500px',
               height: 'auto',
               lock: true,
               background:"#E6E6E6",
          	   opacity:0.4,
          	   fixed:true,
          	   okValue: '确定',
     		       ok: function () {
     		    	   this.close;
     		    	}
          })
       }
     
     function selectAll(){  
    	if ($("#totalCheckbox").prop("checked")) {  
    	        $(":input[name='messageNoticeIds']").prop("checked", true);  
    	}else{  
    	        $(":input[name='messageNoticeIds']").prop("checked", false);  
    	}  
    } 
     
     function doChildCheck(){
    	var messageNoticeIdsTrue = $("input[name=messageNoticeIds]:checked").length;
 		var messageNoticeIdsCount = $("input[name=messageNoticeIds]").length;
 		if(parseInt(messageNoticeIdsTrue) == parseInt(messageNoticeIdsCount)){
 			$("input[name='totalCheckbox']").prop("checked",true);
 		}else{
 			$("input[name='totalCheckbox']").prop("checked",false);
 		}
     }
     
</script>
</body>
</html>