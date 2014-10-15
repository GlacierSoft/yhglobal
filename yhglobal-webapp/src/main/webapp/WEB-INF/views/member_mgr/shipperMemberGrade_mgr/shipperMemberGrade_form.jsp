<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="memberGrade_mgr_grade_form" method="post" style="padding:15px">
	<table class="formtable" width="800">
		<tr>
			<td>等级名称：</td>
			<td>
				<input type="hidden" id="memberGrade_mgr_memberGrade_form_gradeId" name="gradeId" value="${gradeData.gradeId}" />
				<input id="memberGrade_mgr_memberGrade_form_gradeName" style="width:268px;height: 20px;" name="gradeName" value="${gradeData.gradeName}" class="easyui-validatebox spinner"  required="true"/>
			</td>
			<td>级别图标:</td>
	    	<td>
	    	<input class="ke-input-text" type="text" name="gradeImg" id="url" value="${gradeData.gradeImg}" readonly="readonly" />
	    	<input type="button" id="uploadButton" value="上传"/>
	    	</td>
		</tr>
		<tr>
			<td>积分开始值：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_scopeStart" style="width:268px;height: 20px;" name="scopeStart" value="${gradeData.scopeStart}" class="easyui-validatebox spinner"  required="true"/>
			</td>
			<td>积分结束值：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_scopeStop" style="width:268px;height: 20px;" name="scopeStop" value="${gradeData.scopeStop}" class="easyui-validatebox spinner"  required="true"/>
			</td>
		</tr>
		<tr>
			<td>GPS定位服务：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_gradeGps" style="width:268px;" name="gradeGps" value="${gradeData.gradeGps}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
			<td>邮件报告服务：</td>
			<td>
				<input id="memberGrade_mgr_memberGrade_form_gradeEmail" style="width:268px;" name="gradeEmail" value="${gradeData.gradeEmail}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>短信报告服务：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_gradeMobile" name="gradeMobile"  style="width:268px;" value="${gradeData.gradeMobile}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
			<td>订单优先处理：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_gradeFirst" name="gradeFirst"  style="width:268px;" value="${gradeData.gradeFirst}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>月结：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_gradeMonthly" name="gradeMonthly"  style="width:268px;" value="${gradeData.gradeMonthly}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
			<td>等级状态：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_status" name="status"  style="width:268px;" value="${gradeData.status}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>现付：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_gradeCashpayment" name="gradeCashpayment"  style="width:268px;" value="${gradeData.gradeCashpayment}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
			<td>到付：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_gradeDestination" name="gradeDestination"  style="width:268px;" value="${gradeData.gradeDestination}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>运输费用打折：</td>
			<td>
			<input id="memberGrade_mgr_memberGrade_form_gradeDiscount" name="gradeDiscount"  style="width:268px;height: 20px;" value="${gradeData.gradeDiscount}" class="easyui-validatebox spinner" required="true" missingMessage="必须至少输入一位数字(保留两位小数)" data-options="min:0,precision:2"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="memberGrade_mgr_memberGrade_form_remark" name="remark" style="width:670px;" class="spinner formta">${gradeData.remark}</textarea>
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