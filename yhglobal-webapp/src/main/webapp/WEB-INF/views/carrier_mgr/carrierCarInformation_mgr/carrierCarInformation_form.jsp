<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="carrierCarInformation_mgr_grade_form" method="post" style="padding:15px">
	<table class="formtable" width="750">
		<tr>
			<td>车辆编号：</td>
			<td>
				<input type="hidden" id="carrier_mgr_carInformation_form_carId" name="carId" value="${carInfoformationData.carId}" />
				<input id="carrier_mgr_carInformation_form_routeName" style="width:268px;height: 20px;" name="routeName" value="${carInfoformationData.routeName}" class="easyui-validatebox spinner"  required="true"/>
			</td>
			<td>车辆牌号:</td>
	    	<td>
	    	<input id="carrier_mgr_carInformation_form_plateNumber" style="width:268px;height: 20px;" class="easyui-validatebox spinner" type="text" name="plateNumber" value="${carInfoformationData.plateNumber}" required="true" />
	    	</td>
		</tr>
		<tr>
			<td>承运商:</td>
	    	<td>
	    		<input id="carrier_mgr_carInformation_form_carrierMemberId" style="width:268px;height: 20px;" value="${carInfoformationData.carrierMemberId}" name="carrierMemberId" class="spinner" required="true"/>
	    	</td>
	    	<td>车辆类型：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_carType" style="width:268px;height: 20px;" name="carType" value="${carInfoformationData.carType}" required="true"/>
			</td>
		</tr>
		<tr>
			<td>运送类型:</td>
	    	<td>
	    	<input id="carrier_mgr_carInformation_form_transportType" style="width:268px;height: 20px;" type="text" name="transportType"  value="${carInfoformationData.transportType}" required="true" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.transportType"/>
	    	</td>
	    	<td>服务类型：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_serviceType" style="width:268px;height: 20px;" name="serviceType" value="${carInfoformationData.serviceType}" required="true" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.serviceType"/>
			</td>
		</tr>
		<tr>
			<td>车辆长度：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_carLength" style="width:268px;height: 20px;" name="carLength" value="${carInfoformationData.carLength}" class="easyui-numberbox" missingMessage="请输入整数，至少为1。单位默认为米（M）" required="true"/>
			</td>
			<td>车辆载重：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_carLoad" style="width:268px;height: 20px;" name="carLoad" value="${carInfoformationData.carLoad}" class="easyui-numberbox" missingMessage="请输入整数，至少为1。单位默认为吨（t）" required="true"/>
			</td>
		</tr>
		<tr>
			<td>车辆所在地：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_carAttribution55" style="width:268px;height: 20px;" name="carAttribution" value="${carInfoformationData.remark}" class="easyui-validatebox spinner"  required="true"/>
			</td>
			<td>车辆年龄：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_carAge" style="width:268px;height: 20px;" name="carAge" value="${carInfoformationData.carAge}" required="true" class="easyui-validatebox spinner"/>
			</td>
		</tr>
		<tr>
			<td>车辆状态：</td>
			<td>
			<input id="carrier_mgr_carInformation_form_carStatus" name="carStatus"  style="width:268px;" value="${carInfoformationData.carStatus}" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
			<td>车辆运输状态：</td>
			<td>
				<input id="carrier_mgr_carInformation_form_transportStatus" style="width:268px;height: 20px;" name="transportStatus" value="${carInfoformationData.transportStatus}" required="true" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.transportStatus"/>
			</td>
		</tr>
		<tr>
			<td>车辆描述：</td>
			<td colspan="3">
				<textarea id="carrier_mgr_carInformation_form_remark" name="remark" style="width:650px;" class="spinner formta">${carInfoformationData.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	//用于combogrid的车辆类型信息绑定
	$('#carrier_mgr_carInformation_form_carType').combogrid({
		panelWidth:450,
		fit:true,//控件自动resize占满窗口大小
		//iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
	    idField:'cartypeId',    
	    textField:'cartypeName',    
	    url: ctx + '/do/carrierCarType/list.json',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为faAlse
	    columns : [ [ {
			field : 'cartypeId',
			title : 'ID',
			checkbox : true
		}, {
			field : 'cartypeName',
			title : '车辆类型名称',
			width : 120,
			sortable : true
		},{
			field : 'status',
			title : '车辆类型状态',
			width : 120,
			sortable : true,
			formatter : function(value, row, index) {
				return renderGridValue(value, fields.status);
			}
		} ] ],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers : true,//True 就会显示行号的列
		loadMsg : '数据加载中....',
		mode : 'remote',
		delay : 200
	});
	//用于combogrid的绑定
	$('#carrier_mgr_carInformation_form_carrierMemberId').combogrid({
		panelWidth:450,
		fit:true,//控件自动resize占满窗口大小
		//iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
	    idField:'carrierMemberId',    
	    textField:'memberName',    
	    url: ctx + '/do/carrierMember/list.json',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
	    columns : [ [ 
		{
			field:'carrierMemberId',
			title:'ID',
			checkbox:true
		},{
			field : 'memberName',
			title : '承运商姓名',
			width : 80,
			sortable:true
		}, {
			field : 'memberType',
			title : '承运商类别',
			width : 60,
		}, {
			field : 'liveAddress',
			title : '地址',
			width : 100,
			sortable:true
		} ] ],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers : true,//True 就会显示行号的列
		loadMsg : '数据加载中....',
		mode : 'remote',
		delay : 200
	});
	
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
	
</script>