<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
%>


<%-- <script language="javascript" src="<%=basePath %>resources/js/lodop/LodopFuncs.js"></script> --%>
<object  id="LODOP_OB" classid="clsid:2105C259-1E0C-4534-8141-A753534CB4CA" width=0 height=0> 
       <embed id="LODOP_EM" type="application/x-print-lodop" width=0 height=0></embed>
</object>

<form id="form1">
	<table style="width: 600px;height: 800px;border: 1px solid red;">
	   
<tr><td style="font-size: 25px;">甲方：<u>${contractData.memberDisplay }</u></td></tr>
<tr><td style="font-size: 25px;">乙方：<u>${contractData.platformId }</u></td></tr>

<tr><td style="font-size: 25px;">甲、乙双方本着精诚合作、平等互利的原则，经友好协商，就相关租赁合作事宜， 达成如下，双方共同遵守： </td></tr>

<tr><td style="font-size: 25px;">第一条：合作范围 </td></tr>

<tr><td style="font-size: 25px;">甲方为乙方有条件配送货物，并使货物安全送出。</td></tr> 
<tr><td style="font-size: 25px;">乙方同时配合甲方制定货物运输路线及中途意外事故的保险。 </td></tr>

<tr><td style="font-size: 25px;">第二条：合作期限 </td></tr>

<tr><td style="font-size: 25px;">合作期限自<u>${contractData.operationTime }</u>至<u>${contractData.closeTime }</u></td></tr>

<tr><td style="font-size: 25px;">第三条：收费标准、结算方式 </td></tr>

<tr><td style="font-size: 25px;">1、收费标准：配送物品的价值程度，开票加收8％） </td></tr>
<tr><td style="font-size: 25px;">2、结算方式：甲方签订本合同当日以现金预付总价款的30％为定金，进场验收后付30％，余款于活动结束当天以现金一次性付清予乙方 。</td></tr>

<tr><td style="font-size: 25px;">第四条：甲乙双方的权利和义务 </td></tr>

<tr><td style="font-size: 25px;">（一） 甲方的权利和义务 </td></tr>

<tr><td style="font-size: 25px;">1、负责提供活动场地，提供必要的活动协助。 </td></tr>
<tr><td style="font-size: 25px;">2、双方签署合同之日起，甲方配送物品时乙方的监督。 </td></tr>
<tr><td style="font-size: 25px;">3、负责维护活动的治安秩序及保障乙方工作人员的人身安全，财物保管。 </td></tr>
<tr><td style="font-size: 25px;">4、甲方应按约定如期向乙方支付器材租用费用，愈期3天无故不支付，则按每天5％的标准向乙方支付滞纳金。 </td></tr>

<tr><td style="font-size: 25px;">（二） 乙方的权利和义务 </td></tr>

<tr><td style="font-size: 25px;">1、乙方管理及工作人员在甲方场所活动期间，应遵守国家的法律法规，自觉遵守甲方 的规章制度，配合甲方管理人员的安排。</td></tr> 

<tr><td style="font-size: 25px;">2、乙方必须根据甲方要求按时、按质、按量地完成相关作业。</td></tr>
<tr><td style="font-size: 25px;">3、甲方有权根据乙方活动内容及质量提出合理建议，乙方需积极与甲方进行协商，并 根据协商结果作相应调整。 </td></tr>
<tr><td style="font-size: 25px;">4、 应在协议约定时间内提供合同内容中的租用器材及相关作业，如因天气原因及不可抗力因素阻碍活动进行，经甲方同意后可中止活动，已安排提供服务的活动项目费用需照常支付费用。</td></tr>


<tr><td style="font-size: 25px;">第五条：违约责任</td></tr>
 
<tr><td style="font-size: 25px;">1、乙方未能按合同规定时间如期合同内容中的租用器材及相关作业，则均属违约，应给予甲方经济赔偿，赔偿金额按合同法有关规定执行。 （赔偿金可明确规定，但必须符合合同法相关规定）</td></tr>
<tr><td style="font-size: 25px;">2、若甲方未能够按期付款，则按合同法规定给乙方5％滞纳金。 </td></tr>
<tr><td style="font-size: 25px;">3、本协议委托内容确定以及费用总额、委托变更、中止、解除和提前终止需双方书面确认。如任何一方违约，违约方须赔偿对方____违约金（或者其他具体违约条款）。</td></tr>

<tr><td style="font-size: 25px;">第六条：其它 </td></tr>

<tr><td style="font-size: 25px;">1、本协议一式二份，甲乙双方各执一份。均具有同等法律效力。 </td></tr>
<tr><td style="font-size: 25px;">2、本协议中未尽事宜，双方协商解决，并另行签定补充协议。 </td></tr>
<tr><td style="font-size: 25px;">3、本协议自签定之日起生效。

<tr><td style="font-size: 25px;">甲方（盖章）：____                          乙方（盖章）：____</td></tr>
<tr><td style="font-size: 25px;">法定代表人（签名）：____                法定代表人（签名）：____</td></tr>
<tr><td style="font-size: 25px;">或指定授权人：____                         或指定授权人：____</td></tr>
<tr><td style="font-size: 25px;">帐户：____                                   开户行：____</td></tr>
<tr><td style="font-size: 25px;">  帐  号：____      全  称： ____    </td></tr>

<tr><td style="font-size: 25px;">本合同于____年____月____日签订于____</td></tr>

	</table>
</form>
<script type="text/javascript">
   
	var LODOP; //声明为全局变量  
   
   $(function(){ 
	   $('#spread_dialog').dialog('close');
	     if('${str}'=="preview_print"){
	    	 CreateOneFormPage();	
	    	 LODOP.PREVIEW(); 
	     }else if('${str}'=="direct_print"){
	    	CreateOneFormPage();
	 		LODOP.PRINT();
	    }else if('${str}'=="design_print"){
	    	CreateTwoFormPage();
			LODOP.PRINT_SETUP();
	    	 
	     }else if('${str}'=="choose_print"){
	    	CreateOneFormPage();
	 		LODOP.PRINTA(); 
	     }
	 } );
   
	 function CreateOneFormPage(){
		LODOP=getLodop();  
		LODOP.PRINT_INIT("打印控件功能演示_Lodop功能_表单一");
		
		//LODOP.ADD_PRINT_TEXT(50,231,260,39,"珠海冰川科技有限公司");
		LODOP.ADD_PRINT_HTM(88,200,350,600,document.getElementById("form1").innerHTML);
		LODOP.SET_PREVIEW_WINDOW(0,0,0,760,540,"");
	 };	
	 
	 function CreateTwoFormPage(){
			LODOP=getLodop();  
			LODOP.PRINT_INIT("打印控件功能演示_Lodop功能_表单二");
			LODOP.ADD_PRINT_RECT(70,27,634,242,0,1);
			LODOP.ADD_PRINT_TEXT(29,236,279,38,"页面内容改变布局打印");
			LODOP.SET_PRINT_STYLEA(2,"FontSize",18);
			LODOP.SET_PRINT_STYLEA(2,"Bold",1);
			LODOP.ADD_PRINT_HTM(88,40,321,185,document.getElementById("form1").innerHTML);
			LODOP.ADD_PRINT_TEXT(319,58,500,30,"注：其中《表单一》按显示大小，《表单二》在程序控制宽度(285px)内自适应调整");
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
		  	            		 $.messager.alert("操作提示",strHtmInstall,"warning");
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
		  	     }
		  	     //=====如下空白位置适合调用统一功能(如注册码、语言选择等):====	     
	
	               //============================================================	     
		  	     return LODOP; 
		  	} catch(err) {
		  	     if (is64IE)	
		              document.documentElement.innerHTML="Error:"+strHtm64_Install+document.documentElement.innerHTML;else
		              document.documentElement.innerHTML="Error:"+strHtmInstall+document.documentElement.innerHTML;
		  	     return LODOP; 
		  	};
		  }
</script>
	

