<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %> 
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 获取项目根path -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/> 
<form id="belaidup_mgr_belaidup_form" method="post" style="padding:15px">
	<table class="formtable" width="800">
		<tr>
			<td>货物名称：</td>
			<td>
				<input type="hidden" id="belaidup_mgr_belaidup_form_belaidupId" name="belaidupId" value="${belaidupDate.belaidupId}" />
				<input id="belaidup_mgr_belaidup_form_belaidupProdName" style="width:268px;height: 20px;" name="belaidupProdName" value="${belaidupDate.belaidupProdName}" class="easyui-validatebox spinner"  required="true"/>
			</td>
			<td>存储货物库房：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_storehouseId" name="storehouseId"  style="width:268px;height: 20px;" value="${belaidupDate.storehouseId}" required="true" disabled="disabled"/>
			</td>
		</tr>
		<tr>
			<td>货物单价：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_belaidupUnitprice" style="width:268px;height: 20px;" name="belaidupUnitprice" value="${belaidupDate.belaidupUnitprice}" required="true" class="easyui-validatebox spinner" validType="customReg['^[0-9]+$','<fmt:message key="public.thisNum.illegal"/>']"/>
			</td>
			<td>货主名称：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_memberId" name="memberId"  style="width:268px;height: 20px;" value="${belaidupDate.memberId}" required="true" disabled="disabled"/>
			</td>
		</tr>
		<tr>
			<td>货物类型：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_goodstypeId" name="goodstypeId"  style="width:268px;height: 20px;" value="${belaidupDate.goodstypeId}" required="true" disabled="disabled"/>
			</td>
			<td>货物包装：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_packageDisplay" name="packageId"  style="width:268px;height: 20px;" value="${packTypeDate.packagetypeId}"  required="true" disabled="disabled"/>
			</td>
		</tr>
		<tr>
			<td>加急配送：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_yesOrNo" name="yesOrNo"  style="width:268px;height: 20px;" value="${belaidupDate.yesOrNo}" class="easyui-combobox" required="true" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.yesOrNo"/>
			</td>
			<td>启禁状态：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_stauts" name="stauts"  style="width:268px;height: 20px;" value="${belaidupDate.stauts}" class="easyui-combobox"  required="true" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
			</td>
		</tr>
		<tr>
			<td>入库物品重量：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_belaidupWeight" name="belaidupWeight"  style="width:268px;height: 20px;" value="${belaidupDate.belaidupWeight}" class="easyui-validatebox spinner" validType="customReg['^[0-9]+$','<fmt:message key="public.thisNum.illegal"/>']" required="true"/>
			</td>
			<td>入库物品体积：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_belaidupBulk" name="belaidupBulk"  style="width:268px;height: 20px;" value="${belaidupDate.belaidupBulk}" class="easyui-validatebox spinner" validType="customReg['^[0-9]+$','<fmt:message key="public.thisNum.illegal"/>']" required="true"/>
			</td>
		</tr>
		<tr>
			<td>货物仓库费：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_repertoryPrice" name="repertoryPrice"  style="width:268px;height: 20px;" value="${belaidupDate.repertoryPrice}" class="easyui-validatebox spinner" validType="customReg['^[0-9]+$','<fmt:message key="public.thisNum.illegal"/>']" required="true"/>
			</td>
			<td>货物存货费：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_stockPrice" name="stockPrice"  style="width:268px;height: 20px;" value="${belaidupDate.stockPrice}" class="easyui-validatebox spinner" validType="customReg['^[0-9]+$','<fmt:message key="public.thisNum.illegal"/>']" required="true"/>
			</td>
		</tr>
		<tr>
			<td>物品包装费：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_packPrice" name="packPrice"  style="width:268px;height: 20px;" value="${belaidupDate.packPrice}" class="easyui-validatebox spinner" validType="customReg['^[0-9]+$','<fmt:message key="public.thisNum.illegal"/>']" required="true"/>
			</td>
			<td>物品运输费：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_freightPrice" name="freightPrice"  style="width:268px;height: 20px;" value="${belaidupDate.freightPrice}" class="easyui-validatebox spinner" validType="customReg['^[0-9]+$','<fmt:message key="public.thisNum.illegal"/>']" required="true"/>
			</td>
		</tr>
		<tr>
			<td>起始站：</td>
			<td>
				<input name="belaidupInitiatin" id="remark" onkeydown="return false;" onfocus="adjustCssDel();" style="width:268px;height: 20px;border-color: #c3d9e0" autocomplete="off" type="text" value="${belaidupDate.belaidupInitiatin}" class="city_input  inputFocus proCityQueryAll proCitySelAll" >
			</td>
			<td>终点站：</td>
			<td>
				<input name="belaidupTerminu" id="remark" onkeydown="return false;" onfocus="adjustCssAdd();" style="width:268px;height: 20px;border-color: #c3d9e0" autocomplete="off" type="text" value="${belaidupDate.belaidupTerminu}" class="city_input  inputFocus proCityQueryAll proCitySelAll" >
			</td>
		</tr>
		<tr>
			<td>取货方式：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_replenishment" name="replenishment"  style="width:268px;height: 20px;" value="${belaidupDate.replenishment}" class="easyui-combobox" required="true" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.replenishment"/>
			</td>
			<td>收货人名称：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_orderConsignee" name="orderConsignee"  style="width:268px;height: 20px;" value="${belaidupDate.orderConsignee}" class="easyui-validatebox spinner" required="true"/>
			</td>
		</tr>
		<tr>
			<td>收货人手机：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_orderPhone" name="orderPhone" style="width:268px;height: 20px;" value="${belaidupDate.orderPhone}" class="easyui-validatebox spinner" required="true"/>
			</td>
			<td>收货人地址：</td>
			<td>
				<input id="belaidup_mgr_belaidup_form_orderAddress" name="orderAddress"  style="width:268px;height: 20px;" value="${belaidupDate.orderAddress}" class="easyui-validatebox spinner" required="true"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3">
				<textarea id="belaidup_mgr_belaidup_form_remark" name="remark" style="width:670px;" class="spinner formta">${belaidupDate.remark}</textarea>
			</td>
		</tr>
	</table>
	<!--弹出省省市-->
	<div class="provinceCityAll" id="provinceCityAll" style="z-index:20;position:absolute;margin-left: 85px;margin-top: -180px;">
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

<script type="text/javascript">
	//终点站的增加距离
	function adjustCssAdd(){
		var provinceCityAlls = document.getElementById("provinceCityAll");
		provinceCityAlls.style.marginLeft = "490px";
	}	
	
	//终点站的减少距离
	function adjustCssDel(){
		var provinceCityAlls = document.getElementById("provinceCityAll");
		provinceCityAlls.style.marginLeft = "85px";
	}
	
	//用于combogrid的负责人信息绑定
	$('#belaidup_mgr_belaidup_form_memberId').combogrid({
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
	    //value:'${messageNoticeData.addresseeDisplay}',    
	    idField:'memberId',    
	    textField:'memberName',    
	    url: ctx + '/do/shippermember/list.json',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
	    columns : [ [ 
			{
				field:'memberId',
				title:'ID',
				checkbox:true
			},{
				field : 'memberName',
				title : '会员姓名',
				width : 80,
				sortable:true
			},{
				field : 'status',
				title : '会员状态',
				width : 120,
				sortable : true,
				formatter : function(value, row, index) {//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value, fields.status);
				}
			}, {
				field : 'memberType',
				title : '会员类型',
				width : 120,
				sortable : true,
				formatter : function(value, row, index) {//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value, fields.memberType);
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
	
	//用于combogrid的货物类型信息绑定
	$('#belaidup_mgr_belaidup_form_goodstypeId').combogrid({
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
	    //value:'${messageNoticeData.addresseeDisplay}',    
	    idField:'goodstypeId',    
	    textField:'goodstypeName',    
	    url: ctx + '/do/goodstype/list.json',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为faAlse
	    columns : [ [ {
			field : 'goodstypeId',
			title : 'ID',
			checkbox : true
		}, {
			field : 'goodstypeName',
			title : '货物类型名称',
			width : 120,
			sortable : true
		},{
			field : 'status',
			title : '货物类型状态',
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
	
	//用于combogrid的包装类型信息绑定
	$('#belaidup_mgr_belaidup_form_packageDisplay').combogrid({
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
	    //value:'${messageNoticeData.addresseeDisplay}',    
	    idField:'packagetypeId',    
	    textField:'packagetypeName',    
	    url: ctx + '/do/packagetype/list.json',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
	    columns : [ [ {
			field : 'packagetypeId',
			title : 'ID',
			checkbox : true
		}, {
			field : 'packagetypeName',
			title : '包装类型名称',
			width : 120,
			sortable : true
		},{
			field : 'status',
			title : '包装类型状态',
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
	
	//用于combogrid的库房信息绑定
	$('#belaidup_mgr_belaidup_form_storehouseId').combogrid({
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
	    //value:'${messageNoticeData.addresseeDisplay}',    
	    idField:'storageId',    
	    textField:'storageName',    
	    url: ctx + '/do/storage/list.json',
	    sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
	    columns : [ [ {
			field : 'storageId',
			title : 'ID',
			checkbox : true
		},{
			field : 'storageName',
			title : '仓库名称',
			width : 120,
			sortable : true
		},{
			field : 'storageTyperDisplay',
			title : '仓库类型',
			width : 120,
			sortable : true
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
		K.create('#belaidup_mgr_belaidup_form_remark', {
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
</script>