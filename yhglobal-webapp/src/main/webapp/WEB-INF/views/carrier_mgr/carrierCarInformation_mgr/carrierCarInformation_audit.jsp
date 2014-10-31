<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


	<table class="detailtable" width="750" style="margin: 15px;">
		<tr>
			<td>车辆编号：</td>
			<td>
				<input type="hidden" id="carrier_mgr_carInformation_form_carId" name="gradeId" value="${carInfoformationData.carId}" />
				<input id="carrier_mgr_carInformation_form_routeName" style="width:268px;height: 20px;" name="routeName" value="${carInfoformationData.routeName}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>车辆牌号:</td>
	    	<td>
	    	<input id="carrier_mgr_carInformation_form_plateNumber" style="width:268px;height: 20px;"  class="easyui-validatebox spinner" type="text" name="plateNumber" value="${carInfoformationData.plateNumber}" required="true" readonly="readonly"/>
	    	</td>
		</tr>
		<tr>
			<td>承运商:</td>
	    	<td>
	    	<input id="carrier_mgr_carInformation_form_carrierMemberId" style="width:268px;height: 20px;" value="${carInfoformationData.carrierMemberRealName}" class="spinner" required="true" readonly="readonly"/>
	    	</td>
	    	<td>车辆类型：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_carType" style="width:268px;height: 20px;" name="carType" value="${carInfoformationData.carTypeDisplay}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>运送类型:</td>
	    	<td>
	    	<input id="carrier_mgr_carInformation_form_transportType" class="easyui-validatebox spinner" style="width:268px;height: 20px;" type="text" name="transportType"  value="${carInfoformationData.transportType}" required="true" readonly="readonly"/>
	    	</td>
	    	<td>服务类型：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_serviceType" style="width:268px;height: 20px;" name="serviceType" value="${carInfoformationData.serviceType}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>车辆长度：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_carLength" style="width:268px;height: 20px;" name="carLength" value="${carInfoformationData.carLength}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>车辆载重：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_carLoad" style="width:268px;height: 20px;" name="carLoad" value="${carInfoformationData.carLoad}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>车辆所在地：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_carAttribution" style="width:268px;height: 20px;" name="carAttribution" value="${carInfoformationData.carAttribution}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
			<td>车辆年龄：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_carAge" style="width:268px;height: 20px;" name="carAge" value="${carInfoformationData.carAge}" required="true" class="easyui-validatebox spinner" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>车辆状态：</td>
			<td>
			<input id="carrier_mgr_carInformation_form_transportStatus" name="transportStatus"  style="width:268px;" value="${carInfoformationData.transportStatus}" readonly="readonly" class="easyui-validatebox spinner"/>
			</td>
			<td>车辆运输状态：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_carStatus" style="width:268px;height: 20px;" name="carStatus" value="${carInfoformationData.carStatus}" class="easyui-validatebox spinner"  required="true" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" value="${carInfoformationData.auditState}" class="spinner" style="height:18px;width:268px" readonly="readonly"/>
			</td>
			<td>审核说明：</td>
			<td>
				<input name="auditRemark" value="${carInfoformationData.auditOpinion}" class="spinner" style="height:18px;width:268px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input  class="spinner" style="width:268px" value="${carInfoformationData.auditorDisplay}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${carInfoformationData.auditTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:268px" value="${carInfoformationData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${carInfoformationData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:268px" value="${carInfoformationData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:268px" value="<fmt:formatDate value="${carInfoformationData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>车辆描述：</td>
			<td colspan="3">
				<textarea id="carrier_mgr_carInformation_form_remark" name="remark" style="width:650px;" class="spinner formta">${carInfoformationData.remark}</textarea>
			</td>
		</tr>
		
	</table>

<script type="text/javascript">
	KindEditor.options.filterMode = false;
	KindEditor.ready(function(K) {
		K.each({
			'plug-align' : {
				name : '对齐方式',
				method : {
					'justifyleft' : '左对齐',
					'justifycenter' : '居中对齐',
					'justifyright' : '右对齐'
				}
			},
			'plug-order' : {
				name : '编号',
				method : {
					'insertorderedlist' : '数字编号',
					'insertunorderedlist' : '项目编号'
				}
			},
			'plug-indent' : {
				name : '缩进',
				method : {
					'indent' : '向右缩进',
					'outdent' : '向左缩进'
				}
			}
		},function( pluginName, pluginData ){
			var lang = {};
			lang[pluginName] = pluginData.name;
			KindEditor.lang( lang );
			KindEditor.plugin( pluginName, function(K) {
				var self = this;
				self.clickToolbar( pluginName, function() {
					var menu = self.createMenu({
							name : pluginName,
							width : pluginData.width || 100
						});
					K.each( pluginData.method, function( i, v ){
						menu.addItem({
							title : v,
							checked : false,
							iconClass : pluginName+'-'+i,
							click : function() {
								self.exec(i).hideMenu();
							}
						});
					})
				});
			});
		});
		K.create('#carrier_mgr_carInformation_form_remark', {
			themeType : 'qq',
			allowFileManager : true,
			minWidth : "650px",
			uploadJson : '../resources/js/kindeditor/jsp/upload_json.jsp',
	        fileManagerJson : '../resources/js/kindeditor/jsp/file_manager_json.jsp',
	        allowFileManager : true,
	        urlType:'domain',
			afterBlur : function() {
				this.sync();
				K.ctrl(document, 13, function() {
					K('form[name=myform]')[0].submit();
				});
				K.ctrl(this.edit.doc, 13, function() {
					K('form[name=myform]')[0].submit();
				});
			},
			items : [
				'bold','italic','underline','fontname','fontsize','forecolor','hilitecolor','plug-align','plug-order','plug-indent','link','code','emoticons','flash','table','lineheight','fullscreen','image'
			]
		});
	});
	
	//审核按钮初始化
	if(${rechargeSetData.auditState == 'pass'}){
		document.all("carrier_mgr_carInformation_form_auditState")[1].checked=true;
	}else if(${rechargeSetData.auditState == 'failure'}){
		document.all("carrier_mgr_carInformation_form_auditState")[2].checked=true;
	}else{
		document.all("carrier_mgr_carInformation_form_auditState")[0].checked=true;
	}
</script>
<form id="memberGrade_mgr_grade_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>车辆信息审核：</td>
			<td><input type="hidden" id="carrier_mgr_carInformation_form_carId" name="carId" value="${carInfoformationData.carId}" />
				<input type="hidden" id="carrier_mgr_carInformation_form_plateNumber" name="plateNumber" value="${carInfoformationData.plateNumber}"/>
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="authstr" /><span>审核中</span>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="pass" /><span>审核通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="carrier_mgr_carInformation_form_auditState" name="auditState" type="radio" value="failure"  checked="checked"/><span>审核失败</span>
			</td>
		</tr>
		<tr>
			<td>审核说明：</td>
			<td colspan="3"><textarea name="auditOpinion" class="spinner formta" style="height:50px;width:650px">${carInfoformationData.auditOpinion}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
$('#carrier_mgr_carInformation_form_auditState').val(renderGridValue('${carInfoformationData.auditState}',fields.auditState));
$('#carrier_mgr_carInformation_form_transportType').val(renderGridValue('${carInfoformationData.transportType}',fields.transportType));
$('#carrier_mgr_carInformation_form_serviceType').val(renderGridValue('${carInfoformationData.serviceType}',fields.serviceType));
$('#carrier_mgr_carInformation_form_carStatus').val(renderGridValue('${carInfoformationData.carStatus}',fields.status));
$('#carrier_mgr_carInformation_form_transportStatus').val(renderGridValue('${carInfoformationData.transportStatus}',fields.transportStatus));
</script>