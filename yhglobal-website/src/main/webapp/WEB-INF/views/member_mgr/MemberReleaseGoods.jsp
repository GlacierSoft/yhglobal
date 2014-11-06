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
		
		.td_release{text-align: right;color: balck;font-weight: bold;font-size: 15px;}
        
        .table_release input[type='text']{width:180px;height:40px; border:1px solid #CCCCCC; border-radius: 5px;} 
        
        .table_release select{width:180px;height:40px; border:1px solid #CCCCCC; border-radius: 5px;} 
        
        .table_release_two{text-align: right;color: balck;font-weight: bold;font-size: 12px;}
        
        .table_release_two input[type='text']{width:120px;height:30px; border:1px solid #CCCCCC; border-radius: 5px;}
        
        
		
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
					          <a href="${ctx}/member/index.htm" class="btn btn-default" role="button">Content1</a>
					          <a href="${ctx}/member/release.htm" <%-- onclick="checkRechargeWithdraw('${currentMember.memberId}','${ctx}/financeMember/rechargeWithdraw.htm?p=1');" --%>  class="btn btn-info" role="button">Content2</a>
					          <a href="${ctx}/member/memberAuth.htm?&p=0" <%-- onclick="checksMember('${currentMember.memberId}','${ctx}/member/memberAuth.htm?&p=0');" --%> class="btn btn-default" role="button">Content3</a>
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
				    <h3 class="panel-title">个人中心 /发布货源</h3>
				  </div>
				  <div class="panel-body">
				       	<div style="width:96px;height:33px;border: 0px solid black;margin-top: 10px;line-height: 33px;background: #428BCA;color: white;border-radius:5px;text-align: center;float: left;">
				       	            信息发布
				       	</dIV>
				       	 <div style="width:600px;height:33px;border: 0px solid black;margin-top: 10px;line-height: 40px;color: white;border-radius:5px;float: left;color:#404040;margin-left: 10px;font-family:'微软雅黑'">
								亲，您还未使用过<font color="#428BCA">模板发货功能</font>，快来体验一下快速发货吧！ 立即体验>>
				       	</dIV>
				       	
				       	<div style="width:920px;height:740px;border: 1px solid #DADADA;margin-top: 20PX;float: left;border-radius:5px;z-index:9999;box-shadow:0px 0px 10px rgba(0, 0, 0, 0.3);">
						      <div style="width:900px;height:650px;border:#ccc solid 1px;margin-top: 10px;margin-left: 10px;" >
						         <form name="" id="form_release_goods" method="post"> 
						         <table style="width:900px;margin: 0px auto;border: 1px solid #DDDDDD;height: 430px;" class="table_release">
						               <tr>
						                   <td class="td_release">发货地址</td>
						                   <td >
						                        <input type="text" name="belaidupInitiatin" style="margin-left: 10px;"  placeholder="请选择/输入城市名称" >
						                        <input type="text" name="belaidupInitiatin" style="margin-left: 10px;" placeholder="填写详细地址">
						                   </td>
						               </tr>
						               <tr>
						                   <td class="td_release">收货地址</td>
						                   <td >
						                       <input type="text" name="orderAddress" style="margin-left: 10px;"  placeholder="请选择/输入城市名称" >
						                       <input type="text" name="orderAddress" style="margin-left: 10px;" placeholder="填写详细地址">
						                   </td>
						               </tr>
						               <tr>
						                   <td class="td_release">类型</td>
						                   <td >
						                          <select name="goodstypeId" id="loanPurposeId" style="width:200px;margin-left: 10px; " >
												   <option value="">--请选择--</option>
												       <c:forEach items="${StorehouseGoodstypeSetList}" var="StorehouseGoodstypeSet" varStatus="status">
														   <option value="${StorehouseGoodstypeSet.goodstypeId}">${StorehouseGoodstypeSet.goodstypeName}</option>
													   </c:forEach>
												  </select>
												 
						                   </td>
						               </tr>
						               <tr>
						                   <td class="td_release">名称</td>
						                   <td >
						                      <input type="text" name="belaidupProdName" style="margin-left: 10px;width:200px;" placeholder="填写货物名称">
						                   </td>
						               </tr>
						               <tr>
						                   <td class="td_release" style="margin-top: 5px;">备注</td>
						                   <td >
						                          <input type="text" name="remark" style="margin-left: 10px;width: 540px;">  
						                   </td>
						               </tr>
						         </table>  
						         
						         <table style="width:650px;margin: 0px auto;border: 0px solid red;height: 200px;margin-left: 20px;" class="table_release_two">
						                   <tr>
							                   <td class="td_release_two">收货人名称</td>
							                   <td style="text-align: left;" >
							                        <input type="text" name="orderConsignee" style="margin-left: 10px;"  placeholder="交易手机" >
							                   </td>
							                   <td class="td_release_two">收货人手机</td>
							                   <td style="text-align: left;">
							                        <input type="text" name="orderPhone" style="margin-left: 10px;"  placeholder="交易手机" >
							                   </td>
							                   <td class="td_release_two">加急配送</td>
							                   <td  style="text-align: left;">
							                          <select name="yesOrNo" style="margin-left: 10px;width:120px;" >
													   <option value="">--请选择--</option>
													    <option value="yes" selected="selected">是</option>
													    <option value="no">否</option>
													  </select>
							                   </td>
						               </tr>
						               
						               <tr>
						                     <td class="td_release_two">重量(吨)</td>
							                   <td style="text-align: left;">
							                        <input name="belaidupWeight" type="text" onkeyup="if(this.value==this.value2)return;if(this.value.search(/^\d*(?:\.\d{0,2})?$/)==-1)this.value=(this.value2)?this.value2:'';else this.value2=this.value;" placeholder="重量(吨)">
							                   </td>
							                   <td class="td_release_two">体积(方)</td>
							                   <td style="text-align: left;">
							                        <input type="text" name="belaidupBulk" style="margin-left: 10px;"  placeholder="体积(方)" onkeyup="if(this.value==this.value2)return;if(this.value.search(/^\d*(?:\.\d{0,2})?$/)==-1)this.value=(this.value2)?this.value2:'';else this.value2=this.value;" >
							                   </td style="text-align: left;">
							                   <td class="td_release_two">数量(件)</td>
							                   <td style="text-align: left;">
							                        <input type="text" name="belaidupNum"   placeholder="数量(件)" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"  >
							                   </td>
						               </tr>
						         </table>
						        </form>
						      </div>
						      
						      <div style="width:96px;height:33px;margin-top:20px;border: 0px solid black;line-height: 33px;background: #428BCA;color: white;border-radius:5px;text-align: center;float: left;margin-left: 420px;">
				       	          <span onclick="doCheck();" style="cursor: pointer;">发布</span>
				       	          <span onclick="doClear();" style="cursor: pointer;">重置</span>
				          	 </dIV>
					         
				       	</div>
				       	<div style="width: 920px;margin-top: 25px;border: 1px solid #DDDDDD;height:40px;background: #F5F5F5;line-height: 40px;float: left;border-radius:5px;" >
				       	          &nbsp;&nbsp;&nbsp;<span style="font-weight: bold;">地址详情 : </span>珠海市唐家镇哈工大路一号工大集团新经济资源开发港博士楼A301E
				       	</div>
				  </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    </div>
	    <jsp:include page="../foot.jsp"/>
<!-- 分页显示表格数据 -->
<script type="text/javascript">
        function doCheck(){
        	alert($("#form_release_goods").serialize());
        }
</script>
</body>
</html>