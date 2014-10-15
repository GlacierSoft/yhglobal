<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="memberGrade_mgr_grade_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>等级名称：</td>
			<td>
				<input type="hidden" id="memberGrade_mgr_memberGrade_form_gradeId" name="gradeId" value="${gradeData.gradeId}" />
				<input id="memberGrade_mgr_memberGrade_form_gradeName" style="width:268px;height: 20px;" name="gradeName" value="${gradeData.gradeName}" class="easyui-validatebox spinner"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>级别图标:</td>
	    	<td>
	    	<input class="ke-input-text" type="text" name="gradeImg" id="url" value="${gradeData.gradeImg}" readonly="readonly" />
	    	<input type="button" id="uploadButton" value="上传"/>
	    	</td>
		</tr>
		<tr>
			<td>信誉开始值：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_scopeStart" style="width:268px;height: 20px;" name="scopeStart" value="${gradeData.scopeStart}" class="easyui-validatebox spinner"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>信誉结束值：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_scopeStop" style="width:268px;height: 20px;" name="scopeStop" value="${gradeData.scopeStop}" class="easyui-validatebox spinner"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>等级状态：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_status" name="status"  style="width:268px;" value="${gradeData.status}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td>
				<textarea id="memberGrade_mgr_memberGrade_form_remark" name="remark" style="width:268px;" class="spinner formta">${gradeData.remark}</textarea>
			</td>
		</tr>
	</table>
</form>

<script type="text/javascript">
		//图标上传。
	    KindEditor.ready(function(K) {
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
			});
</script>