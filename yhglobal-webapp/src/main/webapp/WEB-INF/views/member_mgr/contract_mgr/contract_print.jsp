<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
%>

<style>
.print_text:link {
   color: #561B8B;
  
}
</style>

<p><textarea rows="15" id="doc1" cols="102">
	   
		甲方：${contractData.memberDisplay }
		乙方：${contractData.platformId }
		
		甲、乙双方本着精诚合作、平等互利的原则，经友好协商，就相关租赁合作事宜， 达成如下，双方共同遵守
		
		第一条：合作范围
		
		甲方为乙方有条件配送货物，并使货物安全送出。
		乙方同时配合甲方制定货物运输路线及中途意外事故的保险。 
		第二条：合作期限 
		
		合作期限自${open_time }至${close_time }
		
		第三条：收费标准、结算方式 
		
		1、收费标准：配送物品的价值程度，开票加收8％） 
		2、结算方式：甲方签订本合同当日以现金预付总价款的30％为定金，进场验收后付30％，余款于活动结束当天以现金一次性付清予乙方 。
		
		第四条：甲乙双方的权利和义
		
		（一） 甲方的权利和义务 
		
		1、负责提供活动场地，提供必要的活动协助。 
		2、双方签署合同之日起，甲方配送物品时乙方的监督。
		3、负责维护活动的治安秩序及保障乙方工作人员的人身安全，财物保管。
		4、甲方应按约定如期向乙方支付器材租用费用，愈期3天无故不支付，则按每天5％的标准向乙方支付滞纳金。 
		
		（二） 乙方的权利和义务
		
		1、乙方管理及工作人员在甲方场所活动期间，应遵守国家的法律法规，自觉遵守甲方 的规章制度，配合甲方管理人员的安排。 
		
		2、乙方必须根据甲方要求按时、按质、按量地完成相关作业。
		3、甲方有权根据乙方活动内容及质量提出合理建议，乙方需积极与甲方进行协商，并 根据协商结果作相应调整。 
		4、 应在协议约定时间内提供合同内容中的租用器材及相关作业，如因天气原因及不可抗力因素阻碍活动进行，经甲方同意后可中止活动，已安排提供服务的活动项目费用需照常支付费用。
		
		
		第五条：违约责任
		1、乙方未能按合同规定时间如期合同内容中的租用器材及相关作业，则均属违约，应给予甲方经济赔偿，赔偿金额按合同法有关规定执行。 （赔偿金可明确规定，但必须符合合同法相关规定）
		2、若甲方未能够按期付款，则按合同法规定给乙方5％滞纳金。 
		3、本协议委托内容确定以及费用总额、委托变更、中止、解除和提前终止需双方书面确认。如任何一方违约，违约方须赔偿对方____违约金（或者其他具体违约条款）。
		
		第六条：其它
		
		1、本协议一式二份，甲乙双方各执一份。均具有同等法律效力。 
		2、本协议中未尽事宜，双方协商解决，并另行签定补充协议。 
		3、本协议自签定之日起生效。
		
		甲方（盖章）：____                          乙方（盖章）：____
		法定代表人（签名）：____                法定代表人（签名）：____
		或指定授权人：____                         或指定授权人：____
		帐户：____                                   开户行：____
		帐  号：____      全  称： ____
		
		本合同于____年____月____日签订于____
     
</textarea></p>

<script>
   var LODOP; //声明为全局变量  
   $('#spread_dialog').dialog('close');
   
   $(function(){
	   CheckIsInstall();
	});
 
   function CheckIsInstall() {
	   try{ 
		    var LODOP=getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM')); 
			if ((LODOP!=null)&&(typeof(LODOP.VERSION)!="undefined")){
				 doPrint('${str}'); 
			} 
		 }catch(err){ 
			 alert("Error:本机未安装或需要升级!"); 
		 } 
	}; 
   
	   
	function  doPrint(str){
	   if('${str}'=="preview_print"){
		    CreateOneFormPage();	
		    LODOP.SET_PREVIEW_WINDOW(0,0,0,760,540,"");
		  	LODOP.PREVIEW(); 
		}else if('${str}'=="direct_print"){
			CreateOneFormPage();
			LODOP.PRINT();
		}else if('${str}'=="design_print"){
			CreateOneFormPage();
			LODOP.PRINT_DESIGN();
		}else if('${str}'=="choose_print"){
			CreateOneFormPage();
		  	LODOP.PRINTA(); 
		}
	};	
	
  function CreateOneFormPage(){
	    LODOP=getLodop();  
		LODOP.PRINT_INITA(10,10,754,453,"珠海冰川科技有限公司");
		LODOP.ADD_PRINT_TEXT(21,300,300,30,"越海物流平台货主专属合同\n");
		LODOP.SET_PRINT_STYLEA(0,"FontSize",15);
		LODOP.SET_PRINT_STYLEA(0,"ItemType",1);
		LODOP.SET_PRINT_STYLEA(0,"Horient",2);
		LODOP.ADD_PRINT_TEXT(63,38,677,330,document.getElementById("doc1").value);
		LODOP.SET_PRINT_STYLEA(0,"FontSize",15);
		LODOP.SET_PRINT_STYLEA(0,"ItemType",4);
		LODOP.SET_PRINT_STYLEA(0,"Horient",3);
		LODOP.SET_PRINT_STYLEA(0,"Vorient",3);
		LODOP.ADD_PRINT_LINE(53,23,52,725,0,1);
		LODOP.SET_PRINT_STYLEA(0,"ItemType",1);
		LODOP.SET_PRINT_STYLEA(0,"Horient",3);
		LODOP.ADD_PRINT_LINE(414,23,413,725,0,1);
		LODOP.SET_PRINT_STYLEA(0,"ItemType",1);
		LODOP.SET_PRINT_STYLEA(0,"Horient",3);
		LODOP.SET_PRINT_STYLEA(0,"Vorient",1);
		LODOP.ADD_PRINT_TEXT(421,37,260,22,"珠海冰川科技有限公司版权所有");
		LODOP.SET_PRINT_STYLEA(0,"ItemType",1);
		LODOP.SET_PRINT_STYLEA(0,"Vorient",1);
		LODOP.ADD_PRINT_TEXT(421,542,260,22,"越海物流货主合同：第#页/共&页");
		LODOP.SET_PRINT_STYLEA(0,"ItemType",2);
		LODOP.SET_PRINT_STYLEA(0,"Horient",1);
		LODOP.SET_PRINT_STYLEA(0,"Vorient",1);

  }; 
		
</script>


	

