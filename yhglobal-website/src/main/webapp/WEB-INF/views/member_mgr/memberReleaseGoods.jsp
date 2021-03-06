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
						          <li><a href="${ctx}/member/index.htm" class="btn btn-default" role="button">会员信息</a></li>
						          <li class="active" style="width: 120px;"><a href="${ctx}/member/release.htm" class="btn btn-info" role="button">发布货源</a></li>
						          <li><a href="${ctx}/member/releaseManager.htm?loanState=firstAudit&p=1"  class="btn btn-default" role="button">货源管理</a></li>
						          <li><a href="${ctx}/member/belaidup.htm?p=1"  class="btn btn-default" role="button">运单记录</a></li>
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
				    <h3 class="panel-title">个人中心 /发布货源</h3>
				  </div>
				  <div class="panel-body">
				         <div class="row">
				              <form class="form-horizontal" role="form" id="form_release_goods">
				                  <div class="form-group">
								    <label for="inputEmail3" class="col-sm-2 control-label">发货地址</label>
								    <div class="col-sm-3">
								      <input type="text" style="width: 200px;float: left;height: 35px;border-color: #c3d9e0;" name="originationStation" autocomplete="off" type="text" placeholder="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll form-control">
								    </div>
								    <div class="col-sm-5">
								      <input type="text" class="form-control" placeholder="填写详细地址(必填)" name="originationAddress">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="inputEmail3" class="col-sm-2 control-label">收获地址</label>
								    <div class="col-sm-3">
								       <input type="text" style="width: 200px;float: left;height: 35px;border-color: #c3d9e0;" name="endStation" autocomplete="off" type="text" placeholder="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll form-control">
								    </div>
								    <div class="col-sm-5">
								      <input type="text" class="form-control" placeholder="填写详细地址(必填)" name="endAddress">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="inputEmail3" class="col-sm-2 control-label">类型/名称</label>
								    <div class="col-sm-4">
								          <select name="belaidupTypeId" id="belaidupTypeId" class="form-control" >
											<option value="">--请选择--</option>
											 <c:forEach items="${StorehouseGoodstypeSetList}" var="StorehouseGoodstypeSet" varStatus="status">
												<option value="${StorehouseGoodstypeSet.goodstypeId}">${StorehouseGoodstypeSet.goodstypeName}</option>
											 </c:forEach>
									     </select>
								    </div>
								    <div class="col-sm-4">
								       <input type="text" class="form-control" name="belaidupProdName" placeholder="填写货物名称(必填)">
								    </div>
								  </div>
								   <div class="form-group">
								    <label for="inputEmail3" class="col-sm-2 control-label">发货/手机</label>
								    <div class="col-sm-4">
								         <input type="text" class="form-control" name="sendMember" placeholder="填写发货人姓名">
								    </div>
								    <div class="col-sm-4">
								       <input type="text" class="form-control" name="sendMobile" placeholder="填写发货人联系手机)" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="inputEmail3" class="col-sm-2 control-label">加急/取货</label>
								    <div class="col-sm-4">
								      <select name="belaidupUrgent" class="form-control" id="belaidupUrgent" >
										   <option value="">--请选择--</option>
										   <option value="yes" >是</option>
										   <option value="no">否</option>
									  </select>
								    </div>
								    <div class="col-sm-4">
								        <select name="receivcStyle" class="form-control" >
										    <option value="">--请选择--</option>
										    <option value="storepickup" >送货上门</option>
										    <option value="deliversm">上门取货</option>
									  </select>
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="inputEmail3" class="col-sm-2 control-label">备注</label>
								    <div class="col-sm-8">
								      <input type="text" class="form-control" name="remark" placeholder="写在最后(选填)">
								    </div>
								  </div>
								  
								  <div class="form-group ">
								    <label for="inputEmail3" class="col-sm-2 control-label">收货人名称</label>
								    <div class="col-sm-2">
								      <input type="text" class="form-control" name="receiveMember" placeholder="收货人名称(必填)">
								    </div>
								    <DIV CLASS="col-sm-8">
									    <label for="inputEmail3" class="col-sm-2 control-label">收货人手机</label>
									    <div class="col-sm-3">
									      <input type="text" class="form-control" name="receiveMobile" placeholder="收货人手机(必填)" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
									    </div>
									    <label for="inputEmail3" class="col-sm-2 control-label">单价(元)</label>
									    <div class="col-sm-3">
									      <input type="text" class="form-control" name="belaidupUnitprice" placeholder="单价(元)(必填)" onkeyup="if(this.value==this.value2)return;if(this.value.search(/^\d*(?:\.\d{0,2})?$/)==-1)this.value=(this.value2)?this.value2:'';else this.value2=this.value;">
									    </div>
									 </DIV>
								  </div>
								  
								  <div class="form-group ">
								    <label for="inputEmail3" class="col-sm-2 control-label">重量(吨)</label>
								    <div class="col-sm-2">
								      <input type="text" class="form-control" name="belaidupWeight" placeholder="重量(吨)(必填)" onkeyup="if(this.value==this.value2)return;if(this.value.search(/^\d*(?:\.\d{0,2})?$/)==-1)this.value=(this.value2)?this.value2:'';else this.value2=this.value;">
								    </div>
								    <DIV CLASS="col-sm-8">
									    <label for="inputEmail3" class="col-sm-2 control-label">体积(方)</label>
									    <div class="col-sm-3">
									      <input type="text" class="form-control" name="belaidupVolume" placeholder="体积(方)(必填)" onkeyup="if(this.value==this.value2)return;if(this.value.search(/^\d*(?:\.\d{0,2})?$/)==-1)this.value=(this.value2)?this.value2:'';else this.value2=this.value;">
									    </div>
									    <label for="inputEmail3" class="col-sm-2 control-label">数量(件)</label>
									    <div class="col-sm-3">
									      <input type="text" class="form-control" name="belaidupNumber" placeholder="数量(件)(必填)" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')">
									    </div>
									 </DIV>
								  </div>
								  <div class="form-group">
								    <div class="col-sm-offset-2 col-sm-10">
								         <button type="submit"  class="btn btn-primary">发布</button>
								         <button type="button"  class="btn btn-primary" onclick="doClear();">重置</button>
								    </div>
								  </div>
								</form>
						 </div>
    			 </div>
	    	</div>
	    </div>
	  </div>
	    
	    <div id="bg"></div>
		
         
   <!--弹出省省市style="z-index:30;position:absolute;margin-left: 85px;margin-top: -820px;"-->
	<div class="provinceCityAll" id="provinceCityAll" style="z-index:30;position:absolute;">
	  <div class="tabsArea clearfix" >
	    <ul class="">
	      <li><a href="javascript:" class="current" tb="hotCityAll">热门城市</a></li>
	      <li><a href="javascript:" tb="provinceAll">省份</a></li>
	      <li><a href="javascript:" tb="cityAll" id="cityAll">城市</a></li>
	      <li><a href="javascript:" tb="countyAll" id="countyAll">区县</a></li>
	    </ul>
	  </div>
	  <div class="con" style="height: 150px;">
	    <div class="hotCityAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	    <div class="provinceAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	          <!-- 					<li><a href="javascript:"  class="current">江西省</a></li> -->
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	    <div class="cityAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	          <!-- 					<li><a href="javascript:"  class="current">南京</a></li> -->
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	    <div class="countyAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	        </ul>
	      </div>
	      <div class="next"><a class="can"></a></div>
	    </div>
	  </div> 
	</div> 
	<script src="${ctx}/resources/area/js/public.js"></script> 
         
   <hr class="featurette-divider2">
   </div>
   <jsp:include page="../foot.jsp"/>
   
   <div id="bg"></div>
   
<script type="text/javascript">
  //表单提交
   $("#form_release_goods").validate({
	    rules:{
	    	originationStation:{
	    		required:true
	    	},
	    	originationAddress:{
	    		required:true
	    	},
	    	endStation:{
	    		required:true
	    	},
	    	endAddress:{
	    		required:true
	    	},
	    	belaidupTypeId:{
	    		required:true
	    	},
	    	belaidupProdName:{
	    		required:true
	    	},
	    	sendMember:{
	    		required:true
	    	},
	    	sendMobile:{
	    		required:true,
	    		isMobile:true
	    	},
	    	belaidupUrgent:{
	    		required:true
	    	},
	    	receivcStyle:{
	    		required:true
	    	},	
	    	receiveMember:{
	    		required:true
	    	},
	    	receiveMobile:{
	    		required:true,
	    		number:true,
	    		isMobile:true
	    	},
	    	belaidupUnitprice:{
	    		required:true,
	    		number:true,
	    		min:0.1,
	    		
	    	},
	    	belaidupWeight:{
	    		required:true,
	    		number:true,
	    		min:0.0001
	    	},
	    	belaidupVolume:{
	    		required:true,
	    		number:true,
	    		min:0.0001
	    	},
	    	belaidupNumber:{
	    		required:true,
	    		number:true,
	    		min:1
	    	}
	    },
	    messages:{
	    	originationStation:{
	    		required:"发货城市名称不能为空!"
	    	},
	    	originationAddress:{
	    		required:"发货详细地址不能为空!"
	    	},
	    	endStation:{
	    		required:"收货城市名称不能为空!"
	    	},
	    	endAddress:{
	    		required:"收货详细地址不能为空!"
	    	},
	    	belaidupTypeId:{
	    		required:"寄送货物类型不能为空!"
	    	},
	    	belaidupProdName:{
	    		required:"寄送货物名称不能为空!"
	    	},
	    	sendMember:{
	    		required:"发货人不能为空!"
	    	},
	    	sendMobile:{
	    		required:"发货人联系手机不能为空!",
	    		isMobile:"请填写正确格式电话号码!"
	    	},
	    	belaidupUrgent:{
	    		required:"货物是否加急配送!"
	    	},
	    	receivcStyle:{
	    		required:"取货方式不能为空!"
	    	},
	    	receiveMember:{
	    		required:"收货人姓名不能为空!"
	    	},
	    	receiveMobile:{
	    		required:"收货人手机不能为空!",
	    		number:"请输入合法手机号码!",
	    		isMobile:"请输入合法手机号码!"
	    		
	    	},
	    	belaidupUnitprice:{
	    		required:"货物单价不能为空!",
	    		number:"请输入整数或者小数!",
	    		min:"最低单价为0.1(元)"
	    	},
	    	belaidupWeight:{
	    		required:"货物重量不能为空!",
	    		number:"请输入整数或者小数!",
		    	min:"最低重量为0.0001(吨)"
	    	},
	    	belaidupVolume:{
	    		required:"货物体积不能为空!",
	    		number:"请输入整数或者小数!",
		    	min:"最低体积为0.001(立方米)"
	    	},
	    	belaidupNumber:{
	    		required:"货物数量不能为空!",
	    		number:"请输入整数或者小数!",
	    	    min:"最低数量为1(个/张)"
	    	}
	    },
	    submitHandler:function(){
	    	doWarn("你确定要发布此条货源信息吗?","${ctx}/storehouseBelaidupSource/belaidupSource.json"); 
	    }
   });
  
  //表单重置
  function doClear(){
	  $('#form_release_goods')[0].reset();
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
					   data:$("#form_release_goods").serialize(),
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
 		    	 doClear();
 		    }
 		});
 		d.show();
 }
  
  
</script>
</body>
</html>