<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!-- 越海物流收费标准说明页面 -->
<!DOCTYPE html>
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
	</style> 
  </head>
  <body>
  <jsp:include page="../nav.jsp"/>
       
	    <div class="container">
	  	<div class="row">
		    <div class="col-md-2">
			    <div class="panel-group" id="accordion">
				    <div class="panel panel-default">
				  		<div class="bs-example">
					      <ul class="nav nav-pills nav-stacked" style="max-width: 300px;">
					        <li ><a href="${ctx}/contrabandExplain.htm">禁运品说明</a></li> 
					         <li><a href="${ctx}/weightExplain.htm">轻/重货说明</a></li> 
					         <li class="active"><a href="${ctx}/collectFees.htm">增值服务说明</a></li> 
					         <li><a href="${ctx}/insuranceExplain.htm">货运险承保说明</a></li> 
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
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">增值服务及收费标准</h3>
				  </div>
				  <div class="panel-body">
			          <h2  align="center">增值服务及收费标准</h2> <br>
			          <table class="table table-bordered" style="text-align: center;" >
                      <tr>
                       <td width="270px">保价收费标准</td>
                       <td style="text-align: left;">☆ 最低收费3元，费率1‰，最高保价20万/票</td>
                      </tr> 
                       <tr>
                       <td style="padding-top: 20px"> 回单收费标准</td>
                       <td style="text-align: left;">☆ 进仓回单：进仓业务，同时包含进仓费发票的回单业务；<br>☆ 普通回单：发货清单、出库单等签字业务；<br>☆ 收费标准：15元/票
                       </td>
                      </tr> 
                      <tr>
                       <td>燃油收费标准</td>
                       <td style="text-align: left;">☆ 燃油费：4元/票</td>
                      </tr> <tr>
                       <td>工本收费标准</td>
                       <td style="text-align: left;">☆ 工本费：6元/票</td>
                      </tr> <tr>
                       <td >到付收费标准</td>
                       <td style="text-align: left;">☆ 到付手续费：加收运费的2%</td>
                      </tr> <tr>
                       <td>上楼收费标准</td>
                       <td style="text-align: left;">☆上下楼定义：指货车停放位置一楼以上或楼下（无论有无电梯）派送
                              <br>☆  收费标准：0.1元/KG，最低收费20元/票；单件结算重量不超过50KG（含），超过此标准的由寄派两方自行协商处理</td>
                      </tr> 
                      <tr>
                       <td style="padding-top: 30px">仓储收费标准</td>
                       <td style="text-align: left;">☆ 自提货物到达自提派送部或派送网点三天内（含当天）免仓储费； 第四天开始按照0.03元/KG/天进行收费，最低10元/票/天；留仓时间七天以上（不含第七天当天），派件网点可按退件费用标准开单退回寄件网点，如寄件网点仍需续续仓储，经双方沟通确认，第八起天仓储费开始按照0.05元/KG/天收费，超过30天的货物派件网点必须重新开单按退件费用标准到付退回寄件中心（网点）</td>
                      </tr> <tr>
                       <td style="padding-top: 20px">开箱清点标准</td>
                       <td style="text-align: left;">☆ 外包装货破损、异常：提供免费清点服务
                            <br>☆ 外包装完好：提供有偿清点服务<br>☆ 收费标准：最低20元/票，超过最低标准按照内件数量加收0.5元/件，最高不超过300元/票</td>
                      </tr> <tr>
                       <td >不规则货物标准</td>
                       <td style="text-align: left;">☆ 单件长度不能超过4米；单件高度不能超过1.6米；单件宽度不能超过1.6米
								<br>☆ 市区件（明显标志禁卡）单件长度不超过2米、宽度和高度不超过宽1米，三边总和不超过4米
								<br>☆ 单件重量不超过400KG（≤400KG），大于400KG加收0.1元/KG给派件网点
								<br>☆ 市区件（明显标志禁卡）单件不超过200KG</td>
                      </tr> <tr>
                       <td>其它收费标准</td>
                       <td style="text-align: left;">☆ 网点正常派送区域包接送，超区或盲区须自提或者与网点协商费用
								<br>☆ 包装服务：具体咨询发货网点
								<br>☆ 发票服务：具体咨询发货网点
								<br>☆  进仓服务：进仓费用实报实销，进仓服务费30/票</td>
                      </tr>
                       <tr>
                        <td colspan="2" style="text-align: left;"><font size="3" color="#0697DA">空运速度，汽运价低， 安全快速，限时到达</font></td>
                       </tr>  
                       <tr>
                        <td colspan="2" style="text-align: left;"><font size="3" color="#FF7300">安全</font><br>
							                        高端厢式卡车直达往返运输，全程高速公路运行，配备GPS全球定位系统跟踪查询。   使您随时随地掌握货物在途信息。 
                        </td>
                       </tr>  
                        <tr>
                        <td colspan="2" style="text-align: left;"><font size="3" color="#FF7300">准时</font><br>
						   安能的卡车航班定时定点发车，杜绝中转，提供市场领先的速度和稳定性，同时安能丰富的线路组合可到达全国各主要城市。1000公里圈24小时内到达，2000公里圈48小时内到达，3000公里圈72小时内到达。保证您的货物在准时到达 
                        </td>
                       </tr>  
                        <tr>
                        <td colspan="2" style="text-align: left;"><font size="3" color="#FF7300">服务</font><br>
							独特的两纬客服体系，客户客服面向客户，专线客服面向内部运作流程，确保积极有效的快速响应处理问题机制。.保证您的货物一对一跟踪
                         </td>
                       </tr>  
                        <tr>
                        <td colspan="2" style="text-align: left;"><font size="3" color="#FF7300">经济</font><br>
							价格具有极强竞争力，服务和航空及快递运输相比差距不大，价格只有航空的1/3，快递的1/4左右。与市场上专线产品价格相当，保证您的货物在行内性价比极高！
                        </td>
                       </tr>  
                      </table>                                           
				</div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    </div>
	    
	    <jsp:include page="../foot.jsp"/>
  </body>
</html>