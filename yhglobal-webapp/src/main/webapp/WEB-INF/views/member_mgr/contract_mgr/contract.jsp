<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui"
	uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
%>

<script type="text/javascript">
	$.util.namespace('glacier.member_mgr.contract_mgr.contract');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.contract_mgr.contract.param = {
		toolbarId : 'contractDataGrid_toolbar',
		actions : {
             edit:{flag:'edit',controlType:'single'},
             del:{flag:'del',controlType:'multiple'},
             print:{flag:'print',controlType:'single'}
          }
     };

	//初始化客服DataGrid
	glacier.member_mgr.contract_mgr.contract.contractDataGrid = $('#contractDataGrid').datagrid({
						fit : true,//控件自动resize占满窗口大小
						iconCls : 'icon-save',//图标样式
						border : false,//是否存在边框
						fitColumns : false,//自动填充行
						nowrap : true,//禁止单元格中的文字自动换行
						autoRowHeight : false,//禁止设置自动行高以适应内容
						striped : true,//true就是把行条纹化。（即奇偶行使用不同背景色）
						singleSelect : true,//限制单选
						checkOnSelect : false,//选择复选框的时候选择该行
						selectOnCheck : false,//选择的时候复选框打勾
 						url : ctx + '/do/contract/list.json',
						sortName : 'createTime',//排序字段名称
						sortOrder : 'DESC',//升序还是降序
						remoteSort : true,//开启远程排序，默认为false
						idField : 'contractRecordId',
						columns : [ [ {
							field : 'contractRecordId',
							title : 'ID',
							checkbox : true
						}, {
							field : 'goodsId',
							title : '货物名称',
							width : 120,
							sortable : true
						}, {
							field : 'memberDisplay',
							title : '会员名称(乙方)',
							width : 120,
							sortable : true
						}, {
							field : 'platformId',
							title : '平台名称(甲方)',
							width : 120,
							sortable : true,
						}, {
							field : 'contractTypeDisplay',
							title : '合同类型',
							width : 120,
							sortable : true,
						},  {
							field : 'status',
							title : '合同状态',
							width : 120,
							sortable : true,
							formatter : function(value, row, index) {//数据格式化
								return renderGridValue(value, fields.status);
							}
						}, {
							field : 'contractContent',
							title : '合同内容',
							width : 120,
							sortable : true,
						}, {
							field : 'operationTime',
							title : '合同生效时间',
							width : 120,
							sortable : true
						}, {
							field : 'closeTime',
							title : '合同失效时间',
							width : 140,
							sortable : true,
						}, {
							field : 'createrDisplay',
							title : '创建人',
							sortable : true,
							width : 120
						}, {
							field : 'createTime',
							title : '创建时间',
							sortable : true,
							width : 200
						}, {
							field : 'updaterDisplay',
							title : '更新人',
							sortable : true,
							width : 120
						}, {
							field : 'updateTime',
							title : '更新时间',
							sortable : true,
							width : 200
						} , {
							field : 'remark',
							title : '备注',
							sortable : true,
							width : 120
						}] ],
						pagination : true,//True 就会在 datagrid 的底部显示分页栏
						pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
						pmemberList : [ 2, 10, 50, 100 ],//从session中获取
						rownumbers : true,//True 就会显示行号的列
						toolbar : '#contractDataGrid_toolbar',
						onCheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.member_mgr.contract_mgr.contract.param,this).check();
						},
						onCheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.member_mgr.contract_mgr.contract.param,this).check();
						},
						onUncheck : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.member_mgr.contract_mgr.contract.param,this).unCheck();
						},
						onUncheckAll : function(rows) {//取消勾选行状态触发事件
							action_controller(
									glacier.member_mgr.contract_mgr.contract.param,this).unCheck();
						},
						onSelect : function(rowIndex, rowData) {//选择行事件触发
							action_controller(
									glacier.member_mgr.contract_mgr.contract.param,this).select();
						},
						onUnselectAll : function(rows) {
							action_controller(
									glacier.member_mgr.contract_mgr.contract.param,this).unSelect();
						},
						onLoadSuccess : function(index, record) {//加载数据成功触发事件
							$(this).datagrid('clearSelections');
							$(this).datagrid('clearChecked');
							var rows=$(this).datagrid("getRows");
							if(rows.length==0){   
								var body = $(this).data().datagrid.dc.body2;
								body.find('table tbody').append('<tr><td width="' + body.width() + '" style="height: 25px; text-align: center;color:red">暂时没有记录</td></tr>');
							}
						},
						onDblClickRow : function(rowIndex, rowData){
                        $.easyui.showDialog({
								title : '【' + rowData.memberDisplay + '-'+rowData.platformId+'】合同详细信息',
								href : ctx+ '/do/contract/intoDetail.htm?contractRecordId='+ rowData.contractRecordId,//从controller请求jsp页面进行渲染
								width : 560,
								height : 360,
								resizable : false,
								enableApplyButton : false,
								enableSaveButton : false
							});
						}
					});
	
	
	  glacier.member_mgr.contract_mgr.contract.editContractorManager=function(){ 
	      location.href=ctx+"/do/contract/exp.json";
	  };
	  
	 //状态下拉项
	  $('#bankCardSearchForm_status').combobox({
			valueField : 'value',
			//height:18,
			width : 80,
			textField : 'label',
			panelHeight : 'auto',
			editable : false,
			//required:true,
			data : fields.status
		});
		
	  var CreatedOKLodop7766=null;
	  
	  glacier.member_mgr.contract_mgr.contract.printContractorManager=function(){
		 var LODOP=getLodop();
	  }
	  
	function print_Preview(str){
		var row =glacier.member_mgr.contract_mgr.contract.contractDataGrid.datagrid("getSelected");
		$("#spread_dialog").dialog({
	 		width: 380,    
			height: 160,
	 		href: ctx+"/do/contract/print.htm?contractRecordId="+row.contractRecordId+"&str="+str, 
	 		closed: false
	 	});
	};
	
	var CreatedOKLodop7766=null;
	 
	 function getLodop(oOBJECT,oEMBED){
		  /**************************
		    本函数根据浏览器类型决定采用哪个页面元素作为Lodop对象：
		 IE系列、IE内核系列的浏览器采用oOBJECT，
		    其它浏览器(Firefox系列、Chrome系列、Opera系列、Safari系列等)采用oEMBED,
		    如果页面没有相关对象元素，则新建一个或使用上次那个,避免重复生成。
		 64位浏览器指向64位的安装程序install_lodop64.exe。
		 **************************/
		 //=====全局变量 设定
	          var str_warn_install="0";
	          var str_warn_update="0";
	          var str_warn_firefox="0";
	          var str_warn_chrome="0";
	          var str_warn_total="0";
	  
	   //=====检测Lodop插件是否安装过，提供链接地址==========
	  	      var strHtmInstall="<br><font color='#FF00FF'>打印控件未安装!点击这里<a href='<%=basePath%>resources/js/lodop/install_lodop32.exe' target='_self'>执行安装</a>,安装后请刷新页面或重新进入。</font>";
	          var strHtmUpdate="<br><font color='#FF00FF'>打印控件需要升级!点击这里<a href='<%=basePath%>resources/js/lodop/install_lodop32.exe' target='_self'>执行升级</a>,升级后请重新进入。</font>";
	          var strHtm64_Install="<br><font color='#FF00FF'>打印控件未安装!点击这里<a href='<%=basePath%>resources/js/lodop/install_lodop64.exe' target='_self'>执行安装</a>,安装后请刷新页面或重新进入。</font>";
	          var strHtm64_Update="<br><font color='#FF00FF'>打印控件需要升级!点击这里<a href='<%=basePath%>resources/js/lodop/install_lodop64.exe' target='_self'>执行升级</a>,升级后请重新进入。</font>";
	          var strHtmFireFox="<br><font color='#FF00FF'>（注意：如曾安装过Lodop旧版附件npActiveXPLugin,请在【工具】->【附加组件】->【扩展】中先卸它）</font>";
	          var strHtmChrome="<br><font color='#FF00FF'>(如果此前正常，仅因浏览器升级或重安装而出问题，需重新执行以上安装）</font>";
	          var LODOP;		
	  	try{	
	  	     //=====判断浏览器类型:===============
	  	     var isIE	 = (navigator.userAgent.indexOf('MSIE')>=0) || (navigator.userAgent.indexOf('Trident')>=0);
	  	     var is64IE  = isIE && (navigator.userAgent.indexOf('x64')>=0);
	  	     //=====如果页面有Lodop就直接使用，没有则新建:==========
	  	     if (oOBJECT!=undefined || oEMBED!=undefined) { 
	                 	 if (isIE) 
	  	             LODOP=oOBJECT; 
	  	         else 
	  	             LODOP=oEMBED;
	  	     } else { 
	  		 if (CreatedOKLodop7766==null){
	            	     LODOP=document.createElement("object"); 
	  		     LODOP.setAttribute("width",0); 
	                       LODOP.setAttribute("height",0); 
	  		     LODOP.setAttribute("style","position:absolute;left:0px;top:-100px;width:0px;height:0px;");  		     
	                       if (isIE) LODOP.setAttribute("classid","clsid:2105C259-1E0C-4534-8141-A753534CB4CA"); 
	  		     else LODOP.setAttribute("type","application/x-print-lodop");
	  		     document.documentElement.appendChild(LODOP); 
	  	             CreatedOKLodop7766=LODOP;		     
	   	         } else 
	                       LODOP=CreatedOKLodop7766;
	  	     };
	  	     //=====判断Lodop插件是否安装过，没有安装或版本过低就提示下载安装:==========
	  	     if ((LODOP==null)||(typeof(LODOP.VERSION)=="undefined")) {
	  	             if (navigator.userAgent.indexOf('Chrome')>=0){
	  	            	str_warn_chrome=strHtmChrome;
	  	            	// document.documentElement.innerHTML=strHtmChrome+document.documentElement.innerHTML;
	  	             }
	  	              if (navigator.userAgent.indexOf('Firefox')>=0){
	  	            	str_warn_firefox=strHtmFireFox;
	  	            	  //document.documentElement.innerHTML=strHtmFireFox+document.documentElement.innerHTML; 
	  	             }
	  	             if (is64IE) {
	  	            	 //document.write(strHtm64_Install);
	  	            	$.messager.alert("操作提示",strHtm64_Install,"warning");
	  	            	 
	  	             }else if (isIE) {
	  	            		 //document.write(strHtmInstall);
	  	            	$.messager.alert("操作提示",strHtmInstall,"warning");
	  	            	 }else{
	  	            		//document.documentElement.innerHTML=strHtmInstall+document.documentElement.innerHTML;
	  	            		if(str_warn_chrome.trim()!="0")
	  	            			str_warn_total=str_warn_chrome;
	  	            		if(str_warn_firefox.trim()!="0")
	  	            			str_warn_total=str_warn_firefox;
	  	            		 $.messager.alert("操作提示",strHtmInstall+str_warn_total,"warning");
	  	            	 }
	  		         return LODOP;
	  	     } else if (LODOP.VERSION<"6.1.9.2") {
	  	              if (is64IE)
	  	            	$.messager.alert("操作提示",strHtm64_Update,"warning");
	  	            else if (isIE)
	  	            	$.messager.alert("操作提示",strHtm64_Update,"warning");
	  	            else
	  	            	$.messager.alert("操作提示",strHtm64_Update,"warning");
	  	            	
	  	             return LODOP;
	  	     }else{
	  	    	 $("#investDailogTest").dialog({
	  				  title:"选择操作",
	  				  width: 380,    
	  				  height: 150,
	  				  modal: true,
	  			      closed: false
	  			});
	  	     }
	  	     return LODOP; 
	  	} catch(err) {
	  	     if (is64IE)	
	              document.documentElement.innerHTML="Error:"+strHtm64_Install+document.documentElement.innerHTML;else
	              document.documentElement.innerHTML="Error:"+strHtmInstall+document.documentElement.innerHTML;
	  	     return LODOP; 
	  	};
	  }
	
	
	
</script>


<!--自定义对话款  -->
<div id="investDailogTest" class="easyui-dialog"  buttons="#dlg-buttons-invest" closed="true" style="position:relative; z-index:9999;">
       <div style="width:320px;height: 60px;border:0px solid red;margin: 0px auto;margin-top: 10px;">
		  <div style="float: left;">
		     <img alt="" src="<%=basePath %>resources/images/warning.png" style="width:50px;height: 50px; "> 
		  </div>
		  <div style="float: left;line-height: 50px;margin-left: 20px;">
		  	<a href="javascript:print_Preview('preview_print');">打印预览</a>&nbsp;
		  	<a href="javascript:print_Preview('direct_print');">直接打印</a>&nbsp;
		  	<a href="javascript:print_Preview('design_print');">打印设计</a>&nbsp;
		  	<a href="javascript:print_Preview('choose_print');">选择打印机</a>&nbsp;
		   </div>
		 </div>
</div>
<!--自定义按钮  -->
<div id="dlg-buttons-invest">   
    <table cellpadding="0" cellspacing="0" style="width:100%">   
        <tr>   
            <td style="text-align:right">   
                <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#investDailogTest').dialog('close');">关闭</a>   
            </td>   
        </tr>   
    </table>   
</div> 

<!--自定义对话框(媒介)-->
<div id="spread_dialog" class="easyui-dialog" closed="true" style="position:relative; z-index:-1;"></div>  

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="contractGridPanel" data-options="region:'center',border:true">
		<table id="contractDataGrid">
			<glacierui:toolbar panelEnName="ContractList"
				toolbarId="contractDataGrid_toolbar" menuEnName="contract" />
			<!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="contractSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input name="memberDisplay" style="width: 80px;"
						class="spinner" /></td>
					<td>类型：</td>
					<td><input id="bankCardSearchForm_status" name="status" style="width: 80px;" class="spinner"/></td>
					<td>生效时间：</td>
					<td><input name="contractTypeStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="contractTypeEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td>失效时间：</td>
					<td><input name="contractRemoveStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="contractTypeRemoveEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.member_mgr.contract_mgr.contract.contractDataGrid.datagrid('load',glacier.serializeObject($('#contractSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#contractSearchForm input').val('');glacier.member_mgr.contract_mgr.contract.contractDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
