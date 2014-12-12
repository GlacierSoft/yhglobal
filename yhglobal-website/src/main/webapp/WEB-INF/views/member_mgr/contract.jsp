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
							  <li><a href="${ctx }/member/memberFinance.htm?p=1" class="btn btn-default" role="button">资金记录</a></li>
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
				    <h3 class="panel-title">合同协议</h3>
				  </div>
				  <div class="panel-body"> 
				   <p>甲方（即托运方）：<label style=" border-bottom-style: solid;border-bottom-color: black;border-bottom-width: 1.5px;width: 200px">${currentMember.memberName}</label></p>
				   <p>乙方（即承运方）：<label style=" border-bottom-style: solid;border-bottom-color: black;border-bottom-width: 1.5px;width: 200px">${contractDate.platformId}</label></p>
				   <p>托运货物名称：<label style="margin-left:30px; border-bottom-style: solid;border-bottom-color: black;border-bottom-width: 1.5px;width: 200px">${belaidupDate.belaidupProdName}</label></p>
				   <p>生效日期为：<fmt:formatDate value="${contractDate.operationTime}" type="both"/></p>
				   <p>失效日期为：${contractDate.closeTime}</p>
				   <br><p>物品信息：</p>
				   <p>
				    <table class="table table-bordered" style="text-align: center;">
				       <tr style="background-color: #E8A088">
				          <td>物品名称</td>
				          <td>物品类型</td>
				          <td>重量(千克)</td>
				          <td>体积(立方米)</td>
				          <td>运输费</td>
				          <td>保险费</td>
				          <td>合计费用</td>  
				          <td>注意事项</td>
				       </tr>
				       <tr>
					       <td>${belaidupDate.belaidupProdName}</td>
					       <td>${belaidupDate.goodsTypeDisplay}</td>
					       <td>${belaidupDate.belaidupWeight}</td> 
					       <td>${belaidupDate.belaidupBulk}</td>
					       <td>${belaidupDate.transportationCost}</td>
					       <td>${belaidupDate.insuranceCost}</td>
					       <td>${belaidupDate.totalCost}</td>
					       <td>${belaidupDate.remark}</td>
				       </tr>
				    </table>
				   
				   </p>
				   <p>根据甲方与乙方的共同协商，在遵循《 <a class="bule" style="color: blue" target="_blank" href="http://www.chinalawedu.com/web/23251/" >合同法</a>   》的基础上，就甲方将发往全国各地的货物交给乙方承运事项制定如下条款： </p>
				   <br><p>一、甲方自愿将发往全国各地的货物交给乙方承运；</p>
				   <br><p>二、甲方将货物交给乙方承运时，须提供货物运输途中所需要的所有合法手续，以及规范、安全的货物包装，并不得将国家违禁物品（含各种易燃易爆物品）夹带货品中，否则由此造成所有损失由甲方承担；</p>
				   <br><p>三、甲方将货物交给乙方承运时，须按货物实际价值自行购买保险，或由乙方代为办理购买保险，否则由此产生货损、货丢，乙方不承担全部责任；</p>
				   <br><p>四、如果货物在运输过程中出现包装损坏、货品损失等情况必须经收货人、送货司机（或者到达货站经手人）共同签字出具书面证明，必要时由收货人扣押送货车辆或扣除到货应收运费等；如未有签字证明，则乙方可拒绝赔偿；</p>
				   <br><p>五、如果出现货物安全及时到达甲方指定地点而未能收取运费等应收费用，乙方可视情形扣押货物并达到一个月期限后自行处理；</p>
				   <br><p>六、货物从承运之日起有效查询日期和索赔期在四十五日内，过期乙方可不承担任何责任；</p>
				   <br><p>七、货物承运价格以及到货时间可由甲方与乙方根据实际情况加以协商确定，具体数量、金额、送货事宜等以每次乙方提货后所签的由乙方提供的《货物托运单》为准，并以此作为查询、索赔、结算等实际操作的依据；</p>
				   <br><p>八、本合同书一式两份，甲方乙方各执一份；</p>
				   <br><p>九、如有出现合同纠纷，在协商解决的基础上按《合同法》处理；</p>
				   <br><p>十、本合同自签订之日起即生效。</p> 
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