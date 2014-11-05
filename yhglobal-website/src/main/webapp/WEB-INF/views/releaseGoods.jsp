<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

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
	<jsp:include page="inc.jsp"/>
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
      
      <jsp:include page="nav.jsp"/>
    
       <div class="container">
	  	<div class="row">
		    <div class="col-md-2">
			    <div class="panel-group" id="accordion">
			    	<div class="panel panel-default">
				  		<div class="bs-example">
					      <ul class="nav nav-pills nav-stacked" style="max-width: 300px;">
					        <li><a href="#" >公司简介</a></li>
					        <li><a href="#">网站公告</a></li>
						    <li><a href="#">网站新闻</a></li>
					        <li><a href="#">招纳贤士</a></li>
					        <li><a href="#">联系我们</a></li>
					        <li class="active"><a href="#">公司地图</a></li>
					        <li><a href="#">其他业务</a></li>
					      </ul>
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
				       	
				       	<div style="width:920px;height:820px;border: 1px solid #DADADA;margin-top: 20PX;float: left;border-radius:5px;z-index:9999;box-shadow:0px 0px 10px rgba(0, 0, 0, 0.3);">
						      <div style="width:900px;height:700px;border:#ccc solid 1px;margin-top: 10px;margin-left: 10px;" >
						         <table style="width:900px;margin: 0px auto;border: 1px solid #DDDDDD;height: 430px;" class="table_release">
						               <tr>
						                   <td class="td_release">发货地</td>
						                   <td >
						                        <input type="text" name="source_place" style="margin-left: 10px;"  placeholder="请选择/输入城市名称" >
						                        <input type="text" name="source_place" style="margin-left: 10px;" placeholder="填写详细地址">
						                   </td>
						               </tr>
						               <tr>
						                   <td class="td_release">收货地</td>
						                   <td >
						                       <input type="text" name="source_place" style="margin-left: 10px;"  placeholder="请选择/输入城市名称" >
						                       <input type="text" name="source_place" style="margin-left: 10px;" placeholder="填写详细地址">
						                   </td>
						               </tr>
						               <tr>
						                   <td class="td_release">发货地</td>
						                   <td >
						                       <input type="text" name="source_place" style="margin-left: 10px;"  placeholder="请选择/输入城市名称" >
						                       <input type="text" name="source_place" style="margin-left: 10px;" placeholder="填写详细地址">
						                   </td>
						               </tr>
						               <tr>
						                   <td class="td_release">货物类型</td>
						                   <td >
						                          <select class="form-control" name="loanPurposeId" id="loanPurposeId" style="width:200px;margin-left: 10px; " >
												   <option value="">--请选择--</option>
												    <option value="长期使用">长期使用</option>
												    <option value="资金周转">资金周转</option>
												    <option value="短期周转">短期周转</option>
												    <option value="创业借款">创业借款</option>
												    <option value="其他借款">其他借款</option>
												    <option value="普通借款">普通借款</option>
												    <option value="随便玩玩">随便玩玩</option>
												  </select>
						                   </td>
						               </tr>
						               <tr>
						                   <td class="td_release">车长(米)</td>
						                   <td >
						                        <select name="loanPurposeId" id="loanPurposeId" style="width:200px;margin-left: 10px; " >
												   <option value="">--请选择--</option>
												    <option value="长期使用">长期使用</option>
												    <option value="资金周转">资金周转</option>
												    <option value="短期周转">短期周转</option>
												    <option value="创业借款">创业借款</option>
												    <option value="其他借款">其他借款</option>
												    <option value="普通借款">普通借款</option>
												    <option value="随便玩玩">随便玩玩</option>
												  </select>&nbsp;至&nbsp;
						                          <select name="loanPurposeId"  style="width:200px; " >
												   <option value="">--请选择--</option>
												    <option value="长期使用">长期使用</option>
												    <option value="资金周转">资金周转</option>
												    <option value="短期周转">短期周转</option>
												    <option value="创业借款">创业借款</option>
												    <option value="其他借款">其他借款</option>
												    <option value="普通借款">普通借款</option>
												    <option value="随便玩玩">随便玩玩</option>
												  </select>
						                   </td>
						               </tr>
						               <tr>
						                   <td class="td_release">有效期</td>
						                   <td >
						                         <input type="radio" name="use_time" checked="checked" value="longt_imne" style="margin-left: 10px;">即时货源<span style="color: #BC9999;font-size: 15px;">（当晚12时前或次日晚12时前有效）</span>&nbsp;&nbsp;
						                         <input type="radio" name="use_time" value="short_time" >长期货源<span style="color: #BC9999;font-size: 15px;">（30天有效）</span>
						                   </td>
						               </tr>
						               <tr>
						                   <td class="td_release" style="margin-top: 5px;">备注</td>
						                   <td >
						                          <input type="text" name="source_place" style="margin-left: 10px;width: 540px;">  
						                   </td>
						               </tr>
						         </table>  
						         
						         <table style="width:650px;margin: 0px auto;border: 0px solid red;height: 230px;margin-left: 20px;" class="table_release_two">
						                   <tr>
							                   <td class="td_release_two">交易手机</td>
							                   <td style="text-align: left;" >
							                        <input type="text" name="source_place" style="margin-left: 10px;"  placeholder="交易手机" >
							                   </td>
							                   <td class="td_release_two">交易电话</td>
							                   <td style="text-align: left;">
							                        <input type="text" name="source_place" style="margin-left: 10px;"  placeholder="交易手机" >
							                   </td>
							                   <td class="td_release_two">重要程度</td>
							                   <td  style="text-align: left;">
							                          <select name="loanPurposeId" style="margin-left: 10px;width:120px;" >
													   <option value="">--请选择--</option>
													    <option value="长期使用">长期使用</option>
													    <option value="资金周转">资金周转</option>
													    <option value="短期周转">短期周转</option>
													    <option value="创业借款">创业借款</option>
													    <option value="其他借款">其他借款</option>
													    <option value="普通借款">普通借款</option>
													    <option value="随便玩玩">随便玩玩</option>
													  </select>
							                   </td>
						               </tr>
						               
						               <tr>
						                     <td class="td_release_two">重量(吨)</td>
							                   <td style="text-align: left;">
							                        <input type="text" name="source_place" style="margin-left: 10px;"  placeholder="重量(吨)" >
							                   </td>
							                   <td class="td_release_two">体积(方)</td>
							                   <td style="text-align: left;">
							                        <input type="text" name="source_place" style="margin-left: 10px;"  placeholder="体积(方)" >
							                   </td style="text-align: left;">
							                   <td class="td_release_two">数量(件)</td>
							                   <td style="text-align: left;">
							                        <input type="text" name="source_place" style="margin-left: 10px;"  placeholder="数量(件)" >
							                   </td>
						               </tr>
						               
						               <tr>
						                  <td class="td_release_two">重量(吨)</td>
							                   <td style="text-align: left;" >
							                        <input type="text" name="source_place" style="margin-left: 10px;"  placeholder="重量(吨)" >
							                   </td>
							                   <td class="td_release_two">体积(方)</td>
							                   <td style="text-align: left;">
							                        <input type="text" name="source_place" style="margin-left: 10px;"  placeholder="体积(方)" >
							                   </td>
							                   <td class="td_release_two">数量(件)</td>
							                   <td style="text-align: left;">
							                        <input type="text" name="source_place" style="margin-left: 10px;"  placeholder="数量(件)" >
							                   </td>
						               </tr>
						               
						               
						         </table>
						      </div>
						      
						      <div style="width:96px;height:33px;margin-top:20px;border: 0px solid black;line-height: 33px;background: #428BCA;color: white;border-radius:5px;text-align: center;float: left;margin-left: 420px;">
				       	                           确认发布
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
	    <jsp:include page="foot.jsp"/>
<!-- 分页显示表格数据 -->
<script type="text/javascript">

	
</script>
</body>
</html>