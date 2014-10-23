<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%><!-- 引入国际化标签 -->
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 获取项目根path -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<form id="role_mgr_role_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>角色名称：</td>
			<td>
				<input type="hidden" name="roleId" value="${roleData.roleId}" />
				<input name="roleCnName" class="easyui-validatebox spinner" style="width:268px" value="${roleData.roleCnName}" required="true" validType="customReg['^[\u0391-\uFFE5]{2,10}','<fmt:message key="Role.roleCnName.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>英文名称：</td>
			<td><input name="roleEnName" class="easyui-validatebox spinner" style="width:268px" value="${roleData.roleEnName}" required="true" validType="customReg['^[A-Z_]{4,16}$','<fmt:message key="Role.roleEnName.illegal"/>']"/></td>
		</tr>
	<%-- 	<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${roleData.remark}</textarea></td>
		</tr> --%>
	</table>
	
	<input name="remark" id="remark" autocomplete="off" type="text" value="请选择/输入城市名称" class="city_input  inputFocus proCityQueryAll proCitySelAll" ov="请选择/输入城市名称">
	<!--弹出省省市-->
	<div class="provinceCityAll">
	  <div class="tabsArea clearfix">
	    <ul class="">
	      <li><a href="javascript:" class="current" tb="hotCityAll">热门城市</a></li>
	      <li><a href="javascript:" tb="provinceAll">省份</a></li>
	      <li><a href="javascript:" tb="cityAll" id="cityAll">城市</a></li>
	      <li><a href="javascript:" tb="countyAll" id="countyAll">区县</a></li>
	    </ul>
	  </div>
	  <div class="con">
	    <div class="hotCityAll invis">
	      <div class="pre"><a></a></div>
	      <div class="list">
	        <ul>
	          <!-- 					<li><a href="javascript:"  class="current">南京</a></li> -->
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
</form>
<script src="${ctx}/resources/area/js/public.js"></script>