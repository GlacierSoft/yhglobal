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
	   #tab{margin: 10px;}
      
      #tab td{
          padding: 16px;    
      }
	</style>
  </head>
  <body>
  <jsp:include page="../nav.jsp"/>
	<!-- CONTAINER START======================== -->
	<div class="container">
		<div class="row">
			<div class="col-md-2">
				<div class="panel-group" id="accordion">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-toggle="collapse"
									data-parent="#accordion" href="#collapseOne"> 基本信息 </a>
							</h4>
						</div>
						<div id="collapseOne" class="panel-collapse collapse">
							<div class="panel-body">
								<div class="btn-group-vertical">
									<ul class="nav nav-pills nav-stacked" id="u2"
										style="max-width: 300px; text-align: center;">
										<li><a href="${ctx}/member/index.htm" class="btn btn-default" role="button">会员信息</a></li>
										<li><a href="${ctx}/member/release.htm" class="btn btn-default" role="button">发布货源</a></li>
										<li><a href="${ctx}/member/releaseManager.htm?loanState=firstAudit&p=1" class="btn btn-default" role="button">货源管理</a></li>
										<li><a href="${ctx}/member/memberLetterStation.htm?loanState=firstAudit&p=1" class="btn btn-default" role="button">站内信</a></li>
										<li><a href="${ctx}/member/memberDetail.htm" class="btn btn-default" role="button">详细信息</a></li>
										<li><a href="${ctx}/member/memberPhotoInto.htm" class="btn btn-default" role="button">会员头像</a></li>
										<li><a href="${ctx}/member/changeMemberPassword.htm" class="btn btn-default" role="button">修改密码</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-toggle="collapse"
									data-parent="#accordion" href="#collapseTwo"> 财务信息 </a>
							</h4>
						</div>
						<div id="collapseTwo" class="panel-collapse collapse in">
							<div class="panel-body">
								<div class="btn-group-vertical">
									<ul class="nav nav-pills nav-stacked" id="u2"
										style="max-width: 300px; text-align: center;">
										<li><a href="${ctx }/member/rechargeWithdraw.htm?p=1" class="btn btn-default" role="button">充值提现</a></li>
										<li class="active"><a href="${ctx }/member/memberFinance.htm?&p=1" class="btn btn-info" role="button">资金记录</a></li>
										<li  style="width: 120px;"><a href="${ctx}/member/changeChargePassword.htm" class="btn btn-default" role="button">交易密码修改</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-toggle="collapse"
									data-parent="#accordion" href="#collapseThree"> 统计信息 </a>
							</h4>
						</div>
						<div id="collapseThree" class="panel-collapse collapse">
							<div class="panel-body">
								<div class="btn-group-vertical">
									<ul class="nav nav-pills nav-stacked" id="u2"
										style="max-width: 300px; text-align: center;">
										<li style="width: 120px;"><a href="${ctx}/memberStatistics/memberStatistics.htm" class="btn btn-default" role="button">会员统计信息</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-10">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">资金流动明细</h3>
					</div>
					<div class="panel-body">
						<div class="panel panel-default" style="margin-top: 20px;">
						         <div class="panel-body" style="padding-bottom: 0px; padding-top: 10px; padding-left: 25px;"><!-- style="text-align:center;vertical-align: middle;" -->
								     <form id="financeTransactionSearch"  class="form-horizontal" role="form"  method="post" action="${ctx}/member/memberFinance.htm?p=1" >
									   <div class="form-group">
									    <div> 
									                            交易类型： <input   name="transactionType" type="text" class="inp140" value="${finaceMemberRecordQueryDTO.transactionType}"/>              
									                            起始时间：<input id="createStartTime" name="createStartTime" type="text" class="inp140" value="<fmt:formatDate value="${finaceMemberRecordQueryDTO.createStartTime}" type="date"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'createEndTime\')||\'%y-%M-%d\'}'})"/>
									      	  结束时间：<input id="createEndTime" name="createEndTime" type="text" class="inp140" value="<fmt:formatDate value="${finaceMemberRecordQueryDTO.createEndTime}" type="date"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'createStartTime\')}',maxDate:'%y-%M-%d'})"/>
										 	<button type="button" class="btn btn-primary" data-toggle="button" onclick="$('#financeTransactionSearch').submit();">查询</button>
										    <button id="financeTransactionReset" type="button" class="btn btn-primary" data-toggle="button" onclick="$('#financeTransactionSearch input').val('');$('#financeTransactionSearch').submit();"> 重置</button>
							               </div>
									   </div>
								     </form>
						        </div>
						    </div>
						    
					 <table class="table table-bordered">
			          	<thead>
				          <tr>
				            <th width="100px">交易对象</th>
				            <th>类型</th>
				            <th>收入金额</th>
				            <th>支出金额</th> 
				            <th>可用余额</th> 
				            <th>创建时间</th> 
				            </tr>
				        </thead>
			          	<tbody>
			          	<c:if test="${empty memberRecordDate.rows}">
							<tr>
					            <td colspan="11" style="text-align:center;vertical-align: middle;"><strong>暂无信息</strong></td>
					        </tr>
						</c:if>	
						<c:if test="${!empty memberRecordDate.rows}">
				          <c:forEach items="${memberRecordDate.rows}" var="memberRecord">
					          <tr>
					            <td>${memberRecord.transactionTarget}</td>
					          	<td>${memberRecord.transactionType}</td>
					          	<td>￥<fmt:formatNumber value='${memberRecord.earningMoney}' pattern='#,#00.00'/></td>
					          	<td>￥<fmt:formatNumber value='${memberRecord.expendMoney}' pattern='#,#00.00'/></td>
					            <td>￥<fmt:formatNumber value='${memberRecord.usableMoney}' pattern='#,#00.00'/></td>
					           	<td><fmt:formatDate value="${memberRecord.createTime}" type="both"/></td>
					           </tr>
				      		</c:forEach>
				      	</c:if>
				      	</tbody>
				      	<tfoot>
				          <tr>
				            <th colspan="10">
				               <div align="right">
								    <ul id='pagefinTransaction'></ul>
								</div>
 							</th>
				          </tr>
				        </tfoot>
					</table>     
					</div>
				</div>
			</div>
		</div>
		<hr class="featurette-divider2">
	</div>
  <jsp:include page="../foot.jsp" />
<script type="text/javascript"> 
function ss(){
	$('#financeTransactionSearch').submit();
}

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
   
    var element = $('#pagefinTransaction');
    //设置分页的总页数
	    var total=${returnResult.total}/5;
    if(parseInt(total)==total){
			var total = parseInt(total);
		}else {
			var total = parseInt(total)+1;
		}
    var options = {
 		    bootstrapMajorVersion:3,
 		    currentPage: ${returnResult.p},
 		    numberOfPages: 5,
 		    totalPages:total,
 		    pageUrl: function(type, page, current){
 		    	return "${ctx}/member/memberFinance.htm?"+composeUrlParams()+"&p="+page;
 		    }
 		}
   element.bootstrapPaginator(options);
});


</script>
</body>
</html>