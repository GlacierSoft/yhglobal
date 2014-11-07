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
        
        #bg{ display: none; position: absolute; top: 0%; left: 0%; width: 100%; height: 230%; background-color: gray; z-index:1001; opacity:0; filter: alpha(opacity=70);}
		
		
        
		
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
						                        <input type="text" id="belaidupInitiatin" name="belaidupInitiatin" style="margin-left: 10px;"  placeholder="请选择/输入城市名称(必填)" ><span style="color: red;font-weight: bold;font-size: 20px;">*</span>
						                        <input type="text" id="belaidupInitiatin_clear" name="belaidupInitiatin" style="margin-left: 10px;" placeholder="填写详细地址(必填)"><span style="color: red;font-weight: bold;font-size: 20px;">*</span>
						                   </td>
						               </tr>
						               <tr>
						                   <td class="td_release">收货地址</td>
						                   <td >
						                       <input type="text" id="orderAddress" name="orderAddress" style="margin-left: 10px;"  placeholder="请选择/输入城市名称(必填)" ><span style="color: red;font-weight: bold;font-size: 20px;">*</span>
						                       <input type="text"  id="orderAddress_clear" name="orderAddress" style="margin-left: 10px;" placeholder="填写详细地址(必填)"><span style="color: red;font-weight: bold;font-size: 20px;">*</span>
						                   </td>
						               </tr>
						               <tr>
						                   <td class="td_release">类型</td>
						                   <td >
						                          <select name="goodstypeId" id="goodstypeId" style="width:200px;margin-left: 10px; " >
												   <option value="">--请选择--</option>
												       <c:forEach items="${StorehouseGoodstypeSetList}" var="StorehouseGoodstypeSet" varStatus="status">
														   <option value="${StorehouseGoodstypeSet.goodstypeId}">${StorehouseGoodstypeSet.goodstypeName}</option>
														</c:forEach>
												  </select>
												 <span style="color: red;font-weight: bold;font-size: 20px;">*</span>
						                   </td>
						               </tr>
						               <tr>
						                   <td class="td_release">名称</td>
						                   <td >
						                      <input type="text" name="belaidupProdName" id="belaidupProdName" style="margin-left: 10px;width:200px;" placeholder="填写货物名称(必填)"><span style="color: red;font-weight: bold;font-size: 20px;">*</span>
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
							                        <input type="text" name="orderConsignee" id="orderConsignee" style="margin-left: 10px;"  placeholder="收货人名称(必填)" ><span style="color: red;font-weight: bold;font-size: 20px;">*</span>
							                   </td>
							                   <td class="td_release_two">收货人手机</td>
							                   <td style="text-align: left;">
							                        <input type="text" name="orderPhone"  id="orderPhone" style="margin-left: 10px;"  placeholder="交易手机(必填)" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')" ><span style="color: red;font-weight: bold;font-size: 20px;" >*</span>
							                   </td>
							                   <td class="td_release_two">加急配送</td>
							                   <td  style="text-align: left;">
							                          <select name="yesOrNo" style="margin-left: 10px;width:120px;height: 20px;" id="yesOrNo" >
													   <option value="">--请选择--</option>
													    <option value="yes" >是</option>
													    <option value="no">否</option>
													  </select>
													  <span style="color: red;font-weight: bold;font-size: 20px;">*</span>
							                   </td>
						               </tr>
						               
						               <tr>
						                     <td class="td_release_two">重量(吨)</td>
							                   <td style="text-align: left;">
							                        <input name="belaidupWeight" id="belaidupWeight" type="text" onkeyup="if(this.value==this.value2)return;if(this.value.search(/^\d*(?:\.\d{0,2})?$/)==-1)this.value=(this.value2)?this.value2:'';else this.value2=this.value;" placeholder="重量(吨)(必填)">
							                        <span style="color: red;font-weight: bold;font-size: 20px;">*</span>
							                   </td>
							                   <td class="td_release_two">体积(方)</td>
							                   <td style="text-align: left;">
							                        <input type="text"  name="belaidupBulk" id="belaidupBulk" style="margin-left: 10px;"  placeholder="体积(方)(必填)" onkeyup="if(this.value==this.value2)return;if(this.value.search(/^\d*(?:\.\d{0,2})?$/)==-1)this.value=(this.value2)?this.value2:'';else this.value2=this.value;" >
							                        <span style="color: red;font-weight: bold;font-size: 20px;">*</span>
							                   </td style="text-align: left;">
							                   <td class="td_release_two">数量(件)</td>
							                   <td style="text-align: left;">
							                        <input type="text" name="belaidupNum" id="belaidupNum"  placeholder="数量(件)(必填)" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"  >
							                        <span style="color: red;font-weight: bold;font-size: 20px;">*</span>
							                   </td>
						               </tr>
						         </table>
						        </form>
						      </div>
						      
						      <div style="width: 920px;height:33px;border: 0px solid red;float: left;margin-top: 20px;">
							      <div style="width:96px;height:33px;line-height: 33px;background: #428BCA;color: white;border-radius:5px;text-align: center;float: left;margin-left: 360px;">
					       	          <span onclick="doCheck();" style="cursor: pointer;">发布</span>
					       	     </dIV>
						         
						         <div style="width:96px;height:33px;line-height: 33px;background: #428BCA;color: white;border-radius:5px;text-align: center;float: left;margin-left: 10px;">
					       	          <span onclick="doClear();" style="cursor: pointer;">重置</span>
					          	 </dIV>
					          </div>
					         
				       	</div>
				       	<div style="width: 920px;margin-top: 25px;border: 1px solid #DDDDDD;height:40px;background: #F5F5F5;line-height: 40px;float: left;border-radius:5px;" >
				       	          &nbsp;&nbsp;&nbsp;<span style="font-weight: bold;">地址详情 : </span>珠海市唐家镇哈工大路一号工大集团新经济资源开发港博士楼A301E
				       	</div>
				  </div>
				</div>
	    	</div>
	    </div>
	    
	    <div id="bg"></div>
		
         <hr class="featurette-divider2">
	    </div>
	    <jsp:include page="../foot.jsp"/>
<!-- 分页显示表格数据 -->
<script type="text/javascript">

    function doCheck(){
    	
    	if($("#belaidupInitiatin").val()!=""&&$("#belaidupInitiatin_clear").val()!=""&&
           $("#orderAddress").val()!=""&&$("#orderAddress_clear").val()!=""&&$("#goodstypeId").val()!=""&&
           $("#belaidupProdName").val()!=""&&$("#orderConsignee").val()!=""&&$("#orderPhone").val()!=""&&$("#goodstypeId").val()!=""&&$("#yesOrNo").val()!=""&&
           $("#belaidupWeight").val()>=0&&$("#belaidupBulk").val()>=0&&$("#belaidupNum").val()>=0&& $("#belaidupWeight").val()!=""&&$("#belaidupBulk").val()!=""&&$("#belaidupNum").val()!=""){
           
    		document.getElementById("bg").style.display ="block";
    		var d = dialog({
    		    title: '提示',
    		    width:360,
    		    height:40,
    		    lock:false,
    		    fixed: true,
    		    content: '你确定要对此货源吗?',
    		    okValue: '确定',
    		    ok: function () {
    		    	$.ajax({
    					   type: "POST",
    					   url: ctx + '/member/add.json',
    					   data: $("#form_release_goods").serialize(),
    					   dataType:'json',
    					   success: function(r){
    						 if(r.success){
    							 var d = dialog({
    					    			title:'提示',
    					    			width:300,
    					    		    height:30,
    					    		    fixed: true,
    					    		    content: '货源发布成功，在记录中查看!',
    					    		    okValue: '确定',
    					    		    ok: function () {
    					    		    	this.close();
    					    		        return false;
    					    		    },
    					    		});
    					    		d.show();
    					    		setTimeout(function () {
    					    		    d.close().remove();
    					    		}, 5000);
    					    		doClear();
    						 }else{
    							 var d = dialog({
 					    			title:'提示',
 					    			width:300,
 					    		    height:30,
 					    		    fixed: true,
 					    		    content: '货物发布失败，，请联系管理员!!!!',
 					    		    okValue: '确定',
 					    		    ok: function () {
 					    		    	this.close();
 					    		        return false;
 					    		    },
 					    		    
 					    		});
 					    		d.show();
 					    		setTimeout(function () {
 					    		    d.close().remove();
 					    		}, 5000);
 					    		doClear();
    						 }   
    						}
    					});
    		    	document.getElementById("bg").style.display ='none';
    		        this.close();
    		    },
    		    cancelValue: '取消',
    		    cancel: function () {
    		    	document.getElementById("bg").style.display ='none';
    		    }
    		});
    		d.show();
    	}else{
    		var d = dialog({
    			title:'提示',
    			width:300,
    		    height:30,
    		    fixed: true,
    		    content: '信息填写不完整，请填写完善之后在坐操作!!!!',
    		    okValue: '确定',
    		    ok: function () {
    		    	this.close();
    		        return false;
    		    },
    		    
    		});
    		d.show();
    		setTimeout(function () {
    		    d.close().remove();
    		}, 5000);
    	}
    	  
    }
    
    function doClear(){
    	$('#form_release_goods')[0].reset();
    }
</script>
</body>
</html>