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
					    <div id="collapseOne" class="panel-collapse collapse">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					          <a href="${ctx}/member/index.htm" role="button" class="btn btn-default">会员信息</a>
					          <a href="${ctx}/member/release.htm" class="btn btn-default" role="button">发布货源</a>
					          <a href="${ctx}/member/releaseManager.htm?loanState=firstAudit&p=1" class="btn btn-default" role="button">货源管理</a>
					          <a href="${ctx}/messageNotice/intoMessageNotice.htm?&p=1" <%-- onclick="checksMember('${currentMember.memberId}','${ctx}/messageNotice/intoMessageNotice.htm?&p=1');" --%> class="btn btn-default" role="button">Content4</a>
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
					         	财政管理
					        </a>
					      </h4>
					    </div>
					    <div id="collapseTwo" class="panel-collapse collapse in">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
							  <a href="${ctx }/member/rechargeWithdraw.htm?p=1" class="btn btn-info" role="button">充值提现</a>							  
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
				    <h3 class="panel-title">充值/提现</h3>
				  </div>
				  <div class="panel-body">
				                  <div class="bs-example bs-example-tabs">
				      <ul id="myTab" class="nav nav-tabs">
				        <li class="active"><a href="#finance" data-toggle="tab">资金记录</a></li>
				        <li><a href="#recharge" data-toggle="tab">充值</a></li>
				        <li><a href="#withdraw" data-toggle="tab">提现</a></li>
				      </ul>
				      <div id="myTabContent" class="tab-content">
				        <div class="tab-pane fade in active" id="finance">
				        
				          <table class="table table-bordered">
				          	<tbody>
						          <tr>
						            <td>会员名称</td>
						            <td>账号总额</td> 
						            <td>可用金额</td>
						            <td>充值金额</td>
						            <td>优惠金额</td>
						            <td>获赔金额</td>
						          </tr>
						          <tr>
						            <td>${finaceMemberDate.memberDisplay }</td>
						            <td>￥<fmt:formatNumber value='${finaceMemberDate.mrechageRemain }' pattern='#,#00.00'/></td>
						            <td>￥<fmt:formatNumber value='${finaceMemberDate.mrechageRemain }' pattern='#,#00.00'/></td>
						            <td>￥<fmt:formatNumber value='${finaceMemberDate.mrechageAdd }' pattern='#,#00.00'/></td>
						            <td>￥<fmt:formatNumber value='${finaceMemberDate.mrechagePrefer }' pattern='#,#00.00'/></td>
						            <td>￥<fmt:formatNumber value='${finaceMemberDate.mrechargeMark }' pattern='#,#00.00'/></td>
						          </tr>
					      	</tbody>
					      </table>
					      <div class="panel panel-default">
							  <div class="panel-body" style="padding-bottom: 0px; padding-top: 10px; padding-left: 25px;"><!-- style="text-align:center;vertical-align: middle;" -->
							     <form id="financeTransactionSearch"  class="form-horizontal" role="form"  method="post" action="${ctx }/member/rechargeWithdraw.htm?p=1" >
								   <div class="form-group">
								    <div>
								      	<input type="hidden" id="dtp_input3" name="memberId" value="1" />
								      	货物名称：<input type="text" class="inp100x" id="belaidupDisplay" name="belaidupDisplay" value="${finaceMemberDetailsQueryDTO.belaidupDisplay }"/>
								      	起始时间：<input id="createStartTime" name="createStartTime" type="text" class="inp140"  value="<fmt:formatDate value="${finaceMemberDetailsQueryDTO.createStartTime }" type="date"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'createEndTime\')||\'%y-%M-%d\'}'})"/>
								      	结束时间：<input id="createEndTime" name="createEndTime" type="text" class="inp140"  value="<fmt:formatDate value="${finaceMemberDetailsQueryDTO.createEndTime }" type="date"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'createStartTime\')}',maxDate:'%y-%M-%d'})"/>
									 	<button id="financeTransactionSubmit" type="button" class="btn btn-primary" data-toggle="button" onclick="$('#financeTransactionSearch').submit();"> 提交</button>
									    <button id="financeTransactionReset" type="button" class="btn btn-primary" data-toggle="button" onclick="$('#financeTransactionSearch input').val('');$('#financeTransactionSearch').submit();"> 重置</button>
									</div>
								   </div>
							     </form>
							  </div>
						  </div>
					      <table class="table table-bordered">
				          	<thead>
					          <tr>
					            <th width="100px">会员名称</th>
					            <th>交易对象</th>
					            <th>付款方式</th>
					            <th>应付金额</th>
					            <th>实付金额</th>
					            <th>交易时间</th>
					            <th>备注</th>
					          </tr>
					        </thead>
				          	<tbody>
				          	<c:if test="${empty returnResult.rows}">
								<tr>
						            <td colspan="11" style="text-align:center;vertical-align: middle;"><strong>暂无信息</strong></td>
						        </tr>
							</c:if>	
							<c:if test="${!empty returnResult.rows}">
					          <c:forEach items="${returnResult.rows}" var="finaceMemberDetailDate">
						          <tr>
						            <td>${finaceMemberDetailDate.memberDisplay}</td>
						          	<td>${finaceMemberDetailDate.belaidupDisplay}</td>
						          	<td>${finaceMemberDetailDate.mdetailType}</td>
						          	<td>￥<fmt:formatNumber value='${finaceMemberDetailDate.mdetaillPayfor}' pattern='#,#00.00'/></td>
						          	<td>￥<fmt:formatNumber value='${finaceMemberDetailDate.mdetailPay}' pattern='#,#00.00'/></td>
						          	<td><fmt:formatDate value="${finaceMemberDetailDate.createTime}" type="both"/></td>
						          	<td><span class="label label-default" style="background-color: #FF5400">${finaceMemberDetailDate.remark}</td>
						          </tr>
					      		</c:forEach>
					      	</c:if>
					      	</tbody>
					      	<tfoot>
					          <tr>
					            <th colspan="9">
					                <div align="right">
									    <ul id='pagefinTransaction'></ul>
									</div>

								</th>
					          </tr>
					        </tfoot>
					      </table>
				        </div>
				        <div class="tab-pane fade" id="recharge">
				            <div class="rechargeFontSize" style="font-size: 12px;color: gray;padding: 10px;">
				            	温馨提示:凡是在冰川网贷充值未投标的用户，15天以内提现收取本金0.5%，15天以后提现免费 冰川网贷禁止信用卡套现、虚假交易等行为,一经发现将予以处罚,包括但不限于：限制收款、冻结账户、永久停止服务,并有可能影响相关信用记录。注：单笔充值金额上限为：10万元
				            </div>
				            <form id="financeRecharge" name="financeRecharge" class="form-horizontal" role="form" method="post" >
					        	<table class="table table-bordered" style="color:gray;">
						          	<tbody>
								          <tr>
								            <td align="right" >会员账号：</td>
								            <td>${currentMember.memberName}</td>
								          </tr>
								          <tr>
								            <td align="right" >账号类型：</td>
								            <td>${currentMember.memberName}</td>
								          </tr>
								          <tr>
								            <td align="right" >充值类型：</td>
								            <td>
								            	  <input type="radio" name="recharge_money" value="线上充值" checked="checked">线上充值
								            	  <input type="radio" name="recharge_money" value="线下充值">线下充值
    										</td>
								          </tr>
								          <tr>
								            <td align="right">充值金额：</td>
								            <td>￥<input maxlength="8" id="rechargeMoney" name="rechargeAmount" type="text" class="inp100x" onkeyup="clearNoNum(this)"/></td>
								          </tr>
								          <tr>
							            	<td align="right">充值回执：</td>
							            	<td>
							            		<input type="text" id="rechargeReceipt" name="rechargeReceipt" maxlength="50" class="inp200x"/>
							            	</td>
							              </tr>
								          <tr>
								            <td align="right">
								            	<button id="sub" type="submit" class="btn btn-primary" data-toggle="button" > 提交</button>
									        </td>
								            <td>
								            	<button type="reset" class="btn btn-primary" data-toggle="button"> 重置</button>
								            </td>
								          </tr>
							      	</tbody>
							    </table>
						    </form>
						    <br>
						    <div class="rechargeFontSize" style="font-size: 12px;color: gray;">
						    	支付宝简介:支付宝信息科技有限公司（以下简称“支付宝”）是商务部中国国际电子商务中心（以下简称“CIECC”）与海航商业控股有限公司（以下简称“海航商业”）合资成立，针对政府及企业的需求和电子商务的发展，精心打造的国有背景的，引入社会诚信体系的独立第三方电子支付平台，也是“金关工程”的重要组成部分。支付宝信息科技有限公司成立于2011年1月25日，由商务部中国国际电子商务中心与海航商业控股有限公司合作成立，主要经营第三方支付业务。公司注册资本14285.72万元，主要经营第三方支付业务，互联网支付及移动电话支付（全国）。
						    </div>
				        </div>
				        <div class="tab-pane fade" id="withdraw">
				        	<div class="rechargeFontSize" style="font-size: 12px;color: gray;padding: 10px;">
					        	<p>凡是在冰川网贷充值未投标的用户，15天以内提现收取本金0.5%，15天以后提现免费</p>
								<p>注：1、请输入您要取出金额,我们将在1至3个工作日(国家节假日除外)之内将钱转入您网站上填写的银行账号。<p> 
								<p>2、如你急需要把钱转到你的账号或者24小时之内网站未将钱转入到你的银行账号,请联系客服中心。 <p>
								<p>3、确保您的银行账号的姓名和您的网站上的真实姓名一致。 <p>
								<p>4、在钱打到您账号时会发一封站内信通知你。 <p>
								<p>5、每笔提现金额至少为100元以上（备注：如101、632等）<p>
								<p>6、每笔提现金额最高不能超过50000元。 <p>
								<p>7、您目前能提取的最高额度是<fmt:formatNumber value='${financeMemberData.amount}' pattern='#,#00.00'/>元。<p>
						    </div>
						    <form id="financeWithdraw" name="financeWithdraw" class="form-horizontal" role="form" method="post" >
							    <table class="table table-bordered" style="color:gray;">
						          	<tbody>
								          <tr>
								            <td>真实姓名</td> 
								            <td>郑俊杰</td>
								          </tr>
								          <tr>
								            <td>账号：</td>
								            <td>1203807137</td>
								          </tr>
								          <tr>
								            <td>账户余额</td> 
								            <td>￥<fmt:formatNumber value='129' pattern='#,#00.00'/></td>
								          </tr>
								          <tr>
								            <td>可用余额：</td>
								            <td >￥<lable id="usableMoney"><fmt:formatNumber value='139' pattern='#,#00.00'/></lable> </td>
								          </tr>
								          <tr>
								            <td>冻结总额：</td>
								            <td>￥<fmt:formatNumber value='159' pattern='#,#00.00'/></td>
								          </tr>
								          <tr>
								            <td>提现金额：</td>
								            <td>￥<input maxlength="8" id="withdrawAmount" name="withdrawAmount" type="text" class="inp100x"   onkeyup="clearNoNum(this)"/>
								            <input type="hidden" id="memberId" name="memberId" value="135" ></td>
								          </tr>
								          <tr>
								            <td>银行卡：</td>
								            <td>
									            <select name="bankCardId" id="bankCardId" class="inp100x" style="width: 122px"> 
<%-- 										    		<c:forEach items="${financeBankCardDatas}" var="financeBankCard"> --%>
<%-- 										            	<option value="${financeBankCard.key}">${financeBankCard.value}</option> --%>
<%-- 										       		</c:forEach> --%>
                                                            <option value="1">工商卡</option>
                                                            <option value="1">支付宝</option>

												</select> 
												<input id="btnSendCode" disabled="disabled" class="btn btn-default" name="btnSendCode" type="button" value="银行卡设置" onClick="get_mobile_code();">&nbsp;
								            </td>
								          </tr>
								          <tr>
								            <td>交易密码：</td>
								            <td><input type="text" onfocus="this.type='password'" autocomplete="off"  id="tradersPassword" name="tradersPassword" maxlength="50" class="inp100x" value=""/></td>
								          </tr>
								          <tr>
								            <td>验证码：</td>
								            <td>
								                <input class="inp100x" type="text" size="8" name="mobile_code" id="mobile_code" maxlength="6" onkeyup='this.value=this.value.replace(/\D/gi,"")' />&nbsp;
								                <input id="btnSendCode" disabled="disabled" class="btn btn-default"  name="btnSendCode" type="button" value=" 发送手机验证码 " onClick="get_mobile_code();">&nbsp;
								            </td>
								          </tr>
								          <tr>
								            <td colspan="2" align="center">
								            	<button id="sub" type="submit" class="btn btn-primary" data-toggle="button" > 提交</button>
								            	<button type="reset" class="btn btn-primary" data-toggle="button"> 重置</button>
								            </td>
								          </tr>
							      	</tbody>
							    </table>
							</form>
						    <div class="rechargeFontSize" style="font-size: 12px;color: gray;">
						    	* 温馨提示：禁止信用卡套现
						    </div>
				        </div>
				      </div>
				    </div><!-- /example -->
				  </div>
	    	   </div>
	      </div>
	</div>	    
  </div>
  
  <jsp:include page="../foot.jsp"/>
  	    
  <script>
  
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
		    	return "${ctx}/member/rechargeWithdraw.htm?"+composeUrlParams()+"&p="+page;
		    }
		}
	
		element.bootstrapPaginator(options);
	})
  
  
  
  
  </script>
  	    
  	    
  	    
</body>
</html>