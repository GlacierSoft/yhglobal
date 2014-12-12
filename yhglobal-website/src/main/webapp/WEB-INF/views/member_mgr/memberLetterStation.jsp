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
					      	  基本信息
					        </a>
					      </h4>
					    </div>
					    <div id="collapseOne" class="panel-collapse collapse in">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					          <ul class="nav nav-pills nav-stacked" id="u2" style="max-width: 300px;text-align: center;">
						          <li><a href="${ctx}/member/index.htm" class="btn btn-default" role="button">会员信息</a></li>
						          <li><a href="${ctx}/member/release.htm" class="btn btn-default" role="button">发布货源</a></li>
						          <li><a href="${ctx}/member/releaseManager.htm?loanState=firstAudit&p=1"  class="btn btn-default" role="button">货源管理</a></li>
						          <li class="active" style="width: 120px;"><a href="${ctx}/member/memberLetterStation.htm?loanState=firstAudit&p=1" class="btn btn-info" role="button">站内信</a></li>
								  <li><a href="${ctx}/member/memberDetail.htm" class="btn btn-default" role="button">详细信息</a></li>
								  <li><a href="${ctx}/member/memberPhotoInto.htm" class="btn btn-default" role="button">会员头像</a></li>
								  <li><a href="${ctx}/member/changeMemberPassword.htm" class="btn btn-default"  role="button">修改密码</a></li>
							  </ul>
							</div>
					      </div>
					    </div>
					  </div>
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
					         	财务信息
					        </a>
					      </h4>
					    </div>
					    <div id="collapseTwo" class="panel-collapse collapse">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					          <ul class="nav nav-pills nav-stacked" id="u2" style="max-width: 300px;text-align: center;">
							  <li><a href="${ctx }/member/rechargeWithdraw.htm?p=1" class="btn btn-default" role="button">充值提现</a></li>
							  <li><a href="#" class="btn btn-default" role="button">Content2</a></li>
							  <li><a href="#" class="btn btn-default" role="button">交易密码修改</a></li>
							  </ul>
							</div>
					      </div>
					    </div>
					  </div>
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseThree">
					    	     统计信息
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
				      <c:choose>
				         <c:when test="${buttonState == 'firstAudit'|| empty buttonState}">
					       <a id="repaymenting" href="${ctx}/member/memberLetterStation.htm?loanState=firstAudit&p=1" class="btn btn-default"  style="background: #FF5400;color: white;" role="button">全部记录【${NoticeNumb.countNumber}】</a>
				   	       <a id="completed" href="${ctx}/member/memberLetterStation.htm?loanState=secondAudit&p=1" class="btn btn-default" role="button">未读信息【${NoticeNumb.countWithout}】</a>
				   	       <a id="completed" href="${ctx}/member/memberLetterStation.htm?loanState=thirdAudit&p=1" class="btn btn-default" role="button">已读信息【${NoticeNumb.countAlready}】</a>
				   	       <a id="completed" href="#" class="btn btn-default" role="button" onclick="alreadyRead();">标记已读</a>
				   	       <a id="completed" href="#" class="btn btn-default" role="button" onclick="withoutRead();">标记未读</a>
				   	       <a id="completed" href="#" class="btn btn-default" role="button" onclick="deleteRead();">删除信息</a>
				        </c:when>
				         <c:when test="${buttonState == 'secondAudit'}">
					       <a id="repaymenting" href="${ctx}/member/memberLetterStation.htm?loanState=firstAudit&p=1" class="btn btn-default" role="button">全部记录【${NoticeNumb.countNumber}】</a>
				   	       <a id="completed" href="${ctx}/member/memberLetterStation.htm?loanState=secondAudit&p=1" class="btn btn-default" role="button" style="background: #FF5400;color: white;" >未读信息【${NoticeNumb.countWithout}】</a>
				   	       <a id="completed" href="${ctx}/member/memberLetterStation.htm?loanState=thirdAudit&p=1" class="btn btn-default" role="button">已读信息【${NoticeNumb.countAlready}】</a>
				   	       <a id="completed" href="#" class="btn btn-default" role="button" onclick="alreadyRead();">标记已读</a>
				   	       <a id="completed" href="#" class="btn btn-default" role="button" onclick="withoutRead();">标记未读</a>
				   	       <a id="completed" href="#" class="btn btn-default" role="button" onclick="deleteRead();">删除信息</a>
				        </c:when>
				        <c:when test="${buttonState == 'thirdAudit'}">
					       <a id="repaymenting" href="${ctx}/member/memberLetterStation.htm?loanState=firstAudit&p=1" class="btn btn-default">全部记录【${NoticeNumb.countNumber}】</a>
				   	       <a id="completed" href="${ctx}/member/memberLetterStation.htm?loanState=secondAudit&p=1" class="btn btn-default" role="button">未读信息【${NoticeNumb.countWithout}】</a>
				   	       <a id="completed" href="${ctx}/member/memberLetterStation.htm?loanState=thirdAudit&p=1" class="btn btn-default" role="button" style="background: #FF5400;color: white;">已读信息【${NoticeNumb.countAlready}】</a>
				   	       <a id="completed" href="#" class="btn btn-default" role="button" onclick="alreadyRead();">标记已读</a>
				   	       <a id="completed" href="#" class="btn btn-default" role="button" onclick="withoutRead();">标记未读</a>
				   	       <a id="completed" href="#" class="btn btn-default" role="button" onclick="deleteRead();">删除信息</a>
				        </c:when>
				     </c:choose>
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
						      	  	    <input name="messageNoticeIds" type="checkbox" value="${messageNotice.messageNoticeId}">
									</td>
									<td>
									     <c:if test="${messageNotice.letterstatus=='read'}">
									            <span class="label label-default" style="background-color: #FF5400">已读</span>
									     </c:if>   
									     <c:if test="${messageNotice.letterstatus=='unread'}">
									           <span class="label label-default" style="background-color: #FF5400">未读</span>
									     </c:if>
									     <c:if test="${messageNotice.letterstatus=='delete'}">
									           <span class="label label-default" style="background-color: #FF5400">已删</span>
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
					                    <button  type="button" class="btn btn-primary" data-toggle="button" onclick="doClick('${messageNotice.messageNoticeId}','${messageNotice.letterstatus}','${buttonState}');">详情</button>
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
     
     function doClick(id,letterstatus,buttonState){
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
     		    	   doChangeState(id,letterstatus,buttonState);
     		    	   
     		    	}
          });
       }
     
     function doChangeState(id,letterstatus,buttonState){
    	 if(letterstatus=='unread'){
    		 $.ajax({
  			   type: "POST",
  			   url: ctx + '/memberMessageNotice/editAlready.json?messageNoticeIds='+id,
  			   dataType:'json',
  			   success: function(r){
  				   alert(r.msg);
  				 window.location.href="${ctx}/member/memberLetterStation.htm?p=1&loanState="+buttonState;
  			   }
   	       });
     	 }
     };
     
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
     
     //身份标示
     var sign="alreadyRead";
     
     //标记已读
     function alreadyRead(){
    	  var messageNoticeIds = [];//删除的id标识
    	  $("input[name='messageNoticeIds']:checked").each(function() {
   			   messageNoticeIds.push($(this).val());
         });
    	 if(messageNoticeIds.length==0){
    		 doShowError('请选择至少一条未读信息进行操作!');
    	 }else{
    		 sign="alreadyRead";
    		 doWarn("你确定要对【"+messageNoticeIds.length+"】标记已读?","${ctx}/memberMessageNotice/editAlready.json?messageNoticeIds="+messageNoticeIds); 
    	 }
     }
     
     //标记未读
     function withoutRead(){
    	 var messageNoticeIds = [];//删除的id标识
   	      $("input[name='messageNoticeIds']:checked").each(function() {
  			messageNoticeIds.push($(this).val());
        });
   	    if(messageNoticeIds.length==0){
   		    doShowError('请选择至少一条已读信息进行操作!');
   	    }else{
   	    	sign="withoutRead";
   		   doWarn("你确定要对【"+messageNoticeIds.length+"】标记未读?","${ctx}/memberMessageNotice/editWithout.json?messageNoticeIds="+messageNoticeIds); 
   	    }
     }
     
     //删除信息
     function deleteRead(){
    	 var messageNoticeIds = [];//删除的id标识
  	      $("input[name='messageNoticeIds']:checked").each(function() {
 			messageNoticeIds.push($(this).val());
       });
  	    if(messageNoticeIds.length==0){
  		    doShowError('请选择至少一条站内信息进行删除操作!');
  	    }else{
  	    	sign="deleteRead";
  		    doWarn("你确定要删除【"+messageNoticeIds.length+"】条站内信息，删除后不可恢复?","${ctx}/memberMessageNotice/delRead.json?messageNoticeIds="+messageNoticeIds); 
  	    }   
     }
     
     //提示对话框
     function doWarn(str,url){
    	var d =art.dialog({
   		    title:'操作提示',
   		    fixed:true,
       	    lock: true,
       	    icon:'question',
       	    background:"#E6E6E6",
      		opacity:0.4,
   		    content: str,
   		    ok: function () {
   		    	 $.ajax({
 					   type: "POST",
 					   url: url,
 					   dataType:'json',
 					   success: function(r){
 						 if(r.success){
 							doShowRight(r.msg)  
 						 }
 						 else{
 							doShowError(r.msg)
 						 }
 					   }
           	     });
   		    },
   		    cancel: function () {
   		        this.close();
   		    }
   		});
   		d.show();  
     }
     
     //警告对话款
     function doShowError(str){
    	 var d =art.dialog({
    		    title: '提示',
    		    content:str ,
    		    fixed:true,
          	    lock: true,
          	    icon:'error',
          	    background:"#E6E6E6",
         		opacity:0.4,
    		    okValue: '确定',
    		    ok: function () {
    		    	this.close;
    		    }
    		});
    		d.show();
     }
     function doShowRight(str){
    	 var d =art.dialog({
    		    title: '提示',
    		    content:str ,
    		    fixed:true,
          	    lock: true,
          	    icon:'succeed',
          	    background:"#E6E6E6",
         		opacity:0.4,
    		    okValue: '确定',
    		    ok: function () {
    		    	this.close;
    		    	if("alreadyRead"==sign){
    	    			window.location.href="${ctx}/member/memberLetterStation.htm?loanState=thirdAudit&p=1";	
    	    		}else if("withoutRead"==sign){
    	    			window.location.href="${ctx}/member/memberLetterStation.htm?loanState=secondAudit&p=1";
    	    		}else if("deleteRead"==sign){
    	    			window.location.href="${ctx}/member/memberLetterStation.htm?loanState=firstAudit&p=1";
    	    		}
    		    }
    		});
    		d.show();
    }
     
</script>
</body>
</html>