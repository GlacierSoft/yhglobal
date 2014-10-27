<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>维修标题：</td>
			<td>
				<input type="hidden" id="storageRepairRepair_mgr_form_repairId" name="repairId" value="${storageRepairDate.repairId}" />
				<input id="storageRepairRepair_mgr_form_repairTitle" name="repairTitle" class="easyui-validatebox spinner" style="width:598px;height:18px;" required="true" maxlength="50" value="${storageRepairDate.repairTitle}"/>
			</td>
		</tr>
		<tr>
			<td>仓库名称：</td>
			<td>
				<input id="storageRepairRepair_mgr_form_storageId" name="storageId" value="${storageData.storageId}" disabled="disabled" style="width: 600px;height:18px;"/>
				 
			</td>
		</tr>
		<tr>
			<td>严重程度：</td>
			<td>
				<input name="repairGrade" value="${storageRepairDate.repairGrade}" value="10" style="width: 600px;height:18px;" class="easyui-combobox" style="height:18px;width:600px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.grade"/>
			</td>
		</tr>
		<tr>
			<td>维修状态：</td>
			<td>
				<input id="storageRepairRepair_mgr_form_repairStauts" name="repairStauts" value="${storageRepairDate.repairStauts}" class="easyui-combobox" style="height:18px;width:600px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.repairStauts"/>
			</td>
		</tr>
		<tr>
			<td>内容：</td>
			<td>
				<textarea id="storageRepairRepair_mgr_form_remark" name="remark" style="width:600px;height:280px;">${storageRepairDate.remark}</textarea>
			</td>
		</tr>
	</table>
</form>
<script>
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
		K.create('#storageRepairRepair_mgr_form_remark', {
			themeType : 'qq',
			allowFileManager : true,
			minWidth : "600px",
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
	
	//用于combogrid的仓库维修信息绑定
	$('#storageRepairRepair_mgr_form_storageId').combogrid({
		panelWidth:600,
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
	    //value:'${messageNoticeData.addresseeDisplay}',    
	    idField:'storageId',    
	    textField:'storageName',    
	    url: ctx + '/do/storage/list.json',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
	    columns : [ [ 
			{
				field:'storageId',
				title:'ID',
				checkbox:true
			},{
				field : 'storageName',
				title : '仓库名称',
				width : 80,
				sortable:true
			},{
				field : 'status',
				title : '仓库状态',
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
</script>
