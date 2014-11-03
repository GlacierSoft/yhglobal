<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<form method="post" style="padding:15px" id="storehouseDamage_part_form">
	<table class="formtable">
		<tr>
			<td>损坏货物：</td>
			<td>
				<%--<input type="hidden" name="belaidupId" value="${belaidupDate.belaidupId}"> --%>
				<input type="text" class="easyui-validatebox spinner"  id="belaidup_date_combogrid"  width="360" required="true" style="height:18px;width:285px" name="StorehouseDamage_id_numbers" readonly="readonly" />
			</td>
		</tr>
		<tr>
			<td>是否退货：</td> 
		 	<td>
				<input id="yesOrNo" name="yesOrNo" required="true"  width="360" value="yes" style="height:18px;width:285px;" class="easyui-combobox"  data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.yesOrNo" readonly="readonly"/>
			</td> 
	    </tr>
		 <tr>
		    <td valign="top">损坏说明：</td>
		    <td ><textarea name="remark" style="width:285px;height: 80PX;" maxlength="185" class="spinner formta"  ></textarea></td>
		 </tr>
	</table> 
</form>

<!-- <a href="javascript:doCheck();">点我取值</a> -->

<script>
//用于combogrid的客户信息绑定
$('#belaidup_date_combogrid').combogrid({
	panelWidth:450,
	fit:true,//控件自动resize占满窗口大小
	//iconCls:'icon-save',//图标样式
	border:false,//是否存在边框
	fitColumns:true,//自动填充行
	nowrap: true,//禁止单元格中的文字自动换行
	autoRowHeight: false,//禁止设置自动行高以适应内容
	striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
	singleSelect:false,//限制单选
	checkOnSelect:true,//选择复选框的时候选择该行
	selectOnCheck:true,//选择的时候复选框打勾
	multiple:true,
	
    idField:'belaidupId',    
    textField:'belaidupProdName',    
    url : ctx + '/do/belaidup/list.json',
    sortName: 'createTime',//排序字段名称
	sortOrder: 'ASC',//升序还是降序
	remoteSort: true,//开启远程排序，默认为false
    columns : [ [ 
		{
			field:'belaidupId',
			title:'ID',
			checkbox:true
		},{
			field : 'belaidupProdName',
			title : '货物名称',
			width : 80,
			sortable:true
		}, {
			field : 'belaidupUnitprice',
			title : '货物单价',
			width : 120,
			sortable : true
		 }, {
			field : 'goodsTypeDisplay',
			title : '货物类型',
			width : 120,
			sortable : true
		}] ],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers : true,//True 就会显示行号的列
	loadMsg : '数据加载中....',
	mode : 'remote',
	delay : 200,
	onLoadSuccess:function(){
		var rows= $('#belaidup_date_combogrid').combogrid('grid').datagrid('getRows');
		if(rows.length>0)
			$('#belaidup_date_combogrid').combogrid('grid').datagrid('selectRow',0);
		
	}
});


  function doCheck(){
	  alert($("#storehouseDamage_part_form").serialize());
  }

</script>
 