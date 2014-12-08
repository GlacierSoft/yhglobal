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
	<!--引入地图库  -->
	<style type="text/css">
		body {
		    padding-top: 100px;
		}
		ol, ul {
		    list-style: none outside none;
		    margin: 0;
    		padding: 0;
		}
		
		#bg{ display: none; position: absolute; top: 0%; left: 0%; width: 100%; height: 150%; background-color: #F5F5F5; z-index:1001; opacity:0.2; filter: alpha(opacity=70);}
		
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
						          <li><a href="${ctx}/member/index.htm"  class="btn btn-default" role="button">会员信息</a></li>
						          <li><a href="${ctx}/member/release.htm" class="btn btn-default" role="button">发布货源</a></li>
						          <li class="active" style="width: 120px;"><a href="${ctx}/member/releaseManager.htm?loanState=firstAudit&p=1" class="btn btn-info" role="button">货源管理</a></li>
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
							  <li><a href="${ctx}/member/changeChargePassword.htm" class="btn btn-default" role="button">交易密码修改</a></li>
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
				    <h3 class="panel-title">货源管理</h3>
				  </div>
				  <div class="panel-body">
				      <c:choose>
				       <c:when test="${buttonState == 'firstAudit'|| empty buttonState}">
			                <a id="repaymenting" href="${ctx}/member/releaseManager.htm?loanState=firstAudit&p=1" class="btn btn-default"  style="background: #FF5400;color: white;" role="button">货源记录</a>
					   	    <a id="completed" href="${ctx}/member/releaseManager.htm?loanState=secondAudit&p=1&stauts=enable" class="btn btn-default" role="button">发布记录</a>
					   	    <a id="completed" href="${ctx}/member/releaseManager.htm?loanState=thirdAudit&p=1&stauts=disable" class="btn btn-default" role="button">撤销记录</a>						   	   
				            <div class="panel panel-default" style="margin-top: 20px;">
						         <div class="panel-body" style="padding-bottom: 0px; padding-top: 10px; padding-left: 25px;"><!-- style="text-align:center;vertical-align: middle;" -->
								     <form id="financeTransactionSearch"  class="form-horizontal" role="form"  method="post" action="${ctx}/member/releaseManager.htm?p=1&loanState=firstAudit&loanState=firstAudit" >
									   <div class="form-group">
									    <div>
									       <input type="hidden" id="dtp_input3" name="memberId" value="${currentMemberId}" />
									                            货物名称： <input id="belaidupProdName" name="belaidupProdName" type="text" class="inp140" value="${storehouseBelaidupsQuerysDTO.belaidupProdName}"/>              
									                            起始时间：<input id="createStartTime" name="createStartTime" type="text" class="inp140" value="<fmt:formatDate value="${storehouseBelaidupsQuerysDTO.createStartTime}" type="date"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'createEndTime\')||\'%y-%M-%d\'}'})"/>
									      	结束时间：<input id="createEndTime" name="createEndTime" type="text" class="inp140" value="<fmt:formatDate value="${storehouseBelaidupsQuerysDTO.createEndTime}" type="date"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'createStartTime\')}',maxDate:'%y-%M-%d'})"/>
										 	<button id="financeTransactionSubmit" type="button" class="btn btn-primary" data-toggle="button" onclick="$('#financeTransactionSearch').submit();">提交</button>
									        <button id="financeTransactionReset" type="button" class="btn btn-primary" data-toggle="button" onclick="$('#financeTransactionSearch input').val('');$('#financeTransactionSearch').submit();"> 重置</button>
									    </div>
									   </div>
								     </form>
						        </div>
						    </div>
				      </c:when>
				      <c:when test="${buttonState == 'secondAudit'}">
				            <a id="repaymenting" href="${ctx}/member/releaseManager.htm?loanState=firstAudit&p=1" class="btn btn-default" role="button">货源记录</a>
						   	<a id="completed" href="${ctx}/member/releaseManager.htm?loanState=secondAudit&p=1&stauts=enable" class="btn btn-default"  style="background: #FF5400;color: white;" role="button">发布记录</a>
						   	<a id="completed" href="${ctx}/member/releaseManager.htm?loanState=thirdAudit&p=1&stauts=disable" class="btn btn-default" role="button">撤销记录</a>	
				            <div class="panel panel-default" style="margin-top: 20px;">
						       <div class="panel-body" style="padding-bottom: 0px; padding-top: 10px; padding-left: 25px;"><!-- style="text-align:center;vertical-align: middle;" -->
								     <form id="financeTransactionSearch"  class="form-horizontal" role="form"  method="post" action="${ctx}/member/releaseManager.htm?p=1&stauts=enable&loanState=secondAudit" >
									   <div class="form-group">
									     <div>
									       <input type="hidden" id="dtp_input3" name="memberId" value="${currentMemberId}" />
									                        货物名称： <input id="belaidupProdName" name="belaidupProdName" type="text" class="inp140" value="${storehouseBelaidupsQuerysDTO.belaidupProdName}"/>              
									                       起始时间：<input id="createStartTime" name="createStartTime" type="text" class="inp140" value="<fmt:formatDate value="${storehouseBelaidupsQuerysDTO.createStartTime}" type="date"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'createEndTime\')||\'%y-%M-%d\'}'})"/>
									      	结束时间：<input id="createEndTime" name="createEndTime" type="text" class="inp140" value="<fmt:formatDate value="${storehouseBelaidupsQuerysDTO.createEndTime}" type="date"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'createStartTime\')}',maxDate:'%y-%M-%d'})"/>
										 	<button id="financeTransactionSubmit" type="button" class="btn btn-primary" data-toggle="button" onclick="$('#financeTransactionSearch').submit();">提交</button>
									        <button id="financeTransactionReset" type="button" class="btn btn-primary" data-toggle="button" onclick="$('#financeTransactionSearch input').val('');;$('#financeTransactionSearch').submit();"> 重置</button>
									     </div>
									   </div>
								     </form>
						        </div>
						    </div>
				      </c:when>
				      <c:when test="${buttonState == 'thirdAudit'}">
				            <a id="repaymenting" href="${ctx}/member/releaseManager.htm?loanState=firstAudit&p=1" class="btn btn-default" role="button">货源记录</a>
						   	<a id="completed" href="${ctx}/member/releaseManager.htm?loanState=secondAudit&p=1&stauts=enable" class="btn btn-default"  role="button">发布记录</a>
						   	<a id="completed" href="${ctx}/member/releaseManager.htm?loanState=thirdAudit&p=1&stauts=disable" class="btn btn-default"  style="background: #FF5400;color: white;" role="button">撤销记录</a>	
				            <div class="panel panel-default" style="margin-top: 20px;">
						         <div class="panel-body" style="padding-bottom: 0px; padding-top: 10px; padding-left: 25px;"><!-- style="text-align:center;vertical-align: middle;" -->
								     <form id="financeTransactionSearch"  class="form-horizontal" role="form"  method="post" action="${ctx}/member/releaseManager.htm?p=1&stauts=disableloanState=thirdAudit" >
									   <div class="form-group">
									    <div>
									       <input type="hidden" id="dtp_input3" name="memberId" value="${currentMemberId}" />
									                        货物名称： <input id="belaidupProdName" name="belaidupProdName" type="text" class="inp140" value="${storehouseBelaidupsQuerysDTO.belaidupProdName}"/>              
									                       起始时间：<input id="createStartTime" name="createStartTime" type="text" class="inp140" value="<fmt:formatDate value="${storehouseBelaidupsQuerysDTO.createStartTime}" type="date"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'createEndTime\')||\'%y-%M-%d\'}'})"/>
									      	结束时间：<input id="createEndTime" name="createEndTime" type="text" class="inp140" value="<fmt:formatDate value="${storehouseBelaidupsQuerysDTO.createEndTime}" type="date"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'createStartTime\')}',maxDate:'%y-%M-%d'})"/>
										 	<button id="financeTransactionSubmit" type="button" class="btn btn-primary" data-toggle="button" onclick="$('#financeTransactionSearch').submit();">提交</button>
									        <button id="financeTransactionReset" type="button" class="btn btn-primary" data-toggle="button" onclick="$('#financeTransactionSearch input').val('');;$('#financeTransactionSearch').submit();"> 重置</button>
									    </div>
									   </div>
								     </form>
						        </div>
						     </div>
				      </c:when>
				     </c:choose>
				     <table class="table table-bordered">
			          	<thead>
				          <tr>
				            <th width="100px">货物名称</th>
				            <th>货物重量</th>
				            <th>货物体积</th>
				            <th>货物类型</th>
				            <th>货物状态</th>
				            <th>起始站</th>
				            <th>终点站</th>
				            <th>创建时间</th>
				            <th>操作</th>
				            </tr>
				        </thead>
			          	<tbody>
			          	<c:if test="${empty returnResult.rows}">
							<tr>
					            <td colspan="11" style="text-align:center;vertical-align: middle;"><strong>暂无信息</strong></td>
					        </tr>
						</c:if>	
						<c:if test="${!empty returnResult.rows}">
				          <c:forEach items="${returnResult.rows}" var="storehouseBelaidupList">
					          <tr>
					            <td>${storehouseBelaidupList.belaidupProdName}</td>
					          	<td>${storehouseBelaidupList.belaidupWeight}</td>
					          	<td>${storehouseBelaidupList.belaidupBulk}</td>
					          	<td>${storehouseBelaidupList.goodsTypeDisplay}</td>
					          	<td>${storehouseBelaidupList.stauts=="enable"?"启用":"禁用"}</td>
					          	<td>${storehouseBelaidupList.belaidupInitiatin}</td>
					          	<td>${storehouseBelaidupList.belaidupTerminu}</td>
					          	<td><fmt:formatDate value="${storehouseBelaidupList.createTime}" type="both"/></td>
					            <td>
					                 <button  type="button" class="btn btn-primary" data-toggle="button" onclick="doCheck('${storehouseBelaidupList.belaidupId}');">详情</button>
	                                 <c:if test="${storehouseBelaidupList.stauts=='enable'}">
	                                      <button  type="button" class="btn btn-primary" data-toggle="button" onclick="doAction('${storehouseBelaidupList.belaidupId}','${storehouseBelaidupList.belaidupProdName}','${storehouseBelaidupList.stauts}');"> 撤销</button>
					                 </c:if>
					                 <c:if test="${storehouseBelaidupList.stauts=='disable'}">
	                                      <button  type="button" class="btn btn-primary" data-toggle="button" onclick="doAction('${storehouseBelaidupList.belaidupId}','${storehouseBelaidupList.belaidupProdName}','${storehouseBelaidupList.stauts}');">发布</button>
					                 </c:if>
					            </td>
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
         		    	return "${ctx}/member/releaseManager.htm?"+composeUrlParams()+"&p="+page;
         		    }
         		}
           element.bootstrapPaginator(options);
        });
       
       function doCheck(id){
    	   var url=ctx + '/delivery/intoDetail.htm?belaidupId='+id;
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
      
      //撤销发布操作
      function doAction(id,name,status){
    	  var action;//操作
    	  if(status=="enable"){
    		  action="撤销";
    	  }else{
    		  action="发布";
    	  }
    	  var d =art.dialog({
  		    title:'操作提示',
  		    fixed:true,
      	    lock: true,
      	    icon:'warning',
      	    background:"#E6E6E6",
     		opacity:0.4,
  		    content: '你确定对【'+name+'】信息进行【'+action+'】操作吗?',
  		    ok: function () {
  		    	 $.ajax({
					   type: "POST",
					   url: ctx + '/delivery/updateBelaidup.json',
					   data: {"belaidupId":id,"belaidupProdName":name,"stauts":status},
					   dataType:'json',
					   success: function(r){
						 if(r.success){
							 doShow("【"+name+"】货物【"+action+"】操作成功!")  
						 }
						 else{
							 doShow("【"+name+"】货物【"+action+"】操作失败,请联系管理员!")
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
      
     //提示对话款
     function doShow(str){
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
    		    	 location.reload();
    		    }
    		});
    		d.show();
     }
   </script>
</body>
</html>