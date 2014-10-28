<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 获取项目根path -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<form method="post" style="padding:15px">
	<table  class="formtable" style="padding:15px">  
			<tr>  
			    <td>姓名：</td>
			    <td>
			    	<input type="hidden" name="ageId" value="${carrierDriverData.driverId}" />
			        <input  name="driverName" class="easyui-validatebox spinner" style="height:18px;width:168px" value='${carrierDriverData.driverName}' required="true"/>
                </td> 
				<td style="padding-left:10px;">头像:</td>
	    	<td>
	    	<input class="ke-input-text" type="text" name="driverPhoto" id="url" value="${carrierDriverData.driverPhoto}" required="true" style="width: 100px;height: 18px"/>
	    	<input type="button" id="uploadButton" value="上传"/>
	    	</td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td ><input name="age" class="easyui-validatebox spinner" style="height:18px;width:168px" value="${carrierDriverData.age}" required="true"/></td>
		 	  	<td style="padding-left:10px;">状态：</td>
				<td >
			 	 <input id="status" name="status" required="true"  style="height:18px;width:168px;" value="${carrierDriverData.status}"  style="height:18px;width:180px;"class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		 	</tr>  
		 	<tr>
		 	    <td>性别：</td>
				<td > 
				 <input id="sex" name="sex" required="true"  style="height:18px;width:168px;" value="${carrierDriverData.sex}"  style="height:18px;width:180px;"class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.sex"/>
			 </td>
			   <td style="padding-left:10px;">驾驶年龄：</td>
				<td ><input name="driverAge" class="easyui-validatebox spinner" style="height:18px;width:168px" value="${carrierDriverData.driverAge}" required="true"/></td>
			 </tr>
			  <tr>
				<td>身份证编号：</td>
				<td ><input name="cardId" class="easyui-validatebox spinner" style="height:18px;width:168px" value="${carrierDriverData.cardId}" required="true"/></td>
				<td style="padding-left:10px;">有效期限：</td>
				<td >
				<input name="driverLicenseTime" class="easyui-datetimebox"
						style="height:18px;width:168px" /> 
				</td>
			 </tr>
			  <tr>
				<td>驾驶证编号：</td>
				<td ><input name="driverLicenseId" class="easyui-validatebox spinner" style="height:18px;width:168px" value="${carrierDriverData.driverLicenseId}" required="true"/></td>
				<td style="padding-left:10px;">驾驶状态：</td>
				<td > 
				 <input id="driverStatus" name="driverStatus" required="true"  style="height:18px;width:168px;" value="${carrierDriverData.driverStatus}"  style="height:18px;width:180px;"class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.driverStatus"/>
			  </td>
			 </tr>
			   <tr>
				<td>联系电话：</td>
				<td ><input name="phone" class="easyui-validatebox spinner" style="height:18px;width:168px" value="${carrierDriverData.phone}" required="true"/></td>
			 	<td style="padding-left:10px;">邮箱：</td>
				<td ><input name="email" class="easyui-validatebox spinner" style="height:18px;width:168px" value="${carrierDriverData.email}" required="true"/></td>
		
			 </tr>
			 <tr>
			 <td >居住地址：</td>
			 <td colspan="3"><input  name="address" class="easyui-validatebox spinner" style="height:18px;width:415px" value="${carrierDriverData.address}" required="true"/></td>
			
			 </tr>
			 <tr>
				<td>备 注：</td>
				<td colspan="3"> <textarea   name="remark" class=" spinner" style="width:415px;margin-top: 5px;height: 90px" required="true" >${carrierDriverData.remark}</textarea></td>
			</tr>
	 </table>
</form>
<script type="text/javascript">
	$('#status').val(renderGridValue('${carrierDriverData.status}',fields.status));
	$('#sex').val(renderGridValue('${carrierDriverData.sex}',fields.sex));
	$('#driverStatus').val(renderGridValue('${carrierDriverData.driverStatus}',fields.driverStatus));
	 //图标上传。
    /* KindEditor.ready(function(K) {
			var uploadbutton = K.uploadbutton({
				button : K('#uploadButton')[0],
				fieldName : 'imgFile',
				//url : ctx+'/member/uploadFile.htm?dir=image',
				url : ctx+'/resources/js/kindeditor/jsp/upload_json.jsp?dir=image',
					//'../php/upload_json.php?dir=file'
				afterUpload : function(data) {
					if (data.error === 0) {
						var url = K.formatUrl(data.url, 'domain');
						K('#url').val(url);
						//K('#url').html(url);
						$("#creditPhotoDivImg").attr("src",url);
					} else {
						alert(data.message);
					}
				},
				afterError : function(str) {
					alert('自定义错误信息: ' + str);
				}
			});
			uploadbutton.fileBox.change(function(e) {
				uploadbutton.submit();
			});
		}); */
	
 </script> 