<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!-- 越海物流轻重货物标准说明页面 -->
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>越海物流</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="../inc.jsp"/>
	<style type="text/css">
		body {
		    padding-top: 100px;
		}
		p{
		padding-left: 30px
		}
	</style> 
  </head>
  <body>
  <jsp:include page="../nav.jsp"/>
       
	    <div class="container">
	  	<div class="row">
		    <div class="col-md-2">
			    <div class="panel-group" id="accordion">
				    <div class="panel panel-default">
				  		<div class="bs-example">
					      <ul class="nav nav-pills nav-stacked" style="max-width: 300px;">
					        <li ><a href="${ctx}/contrabandExplain.htm">禁运品说明</a></li> 
					         <li ><a href="${ctx}/weightExplain.htm">轻/重货说明</a></li> 
					         <li ><a href="${ctx}/collectFees.htm">增值服务说明</a></li> 
					         <li class="active"><a href="${ctx}/insuranceExplain.htm">货运险承保说明</a></li> 
					      </ul>
				  		</div>
				  	</div>  
				  	<div class="panel panel-default">
						<img src="${pageContext.request.contextPath}/resources/images/newbie/about001.jpg" alt="联系我们">
					</div>
					<div class="panel panel-default">
						<img src="${pageContext.request.contextPath}/resources/images/index/weixin.jpg" width="163" height="163" alt="联系我们">
						<p style="padding-left: 0px">扫描二维码关注冰川越海物流微信，获取冰川越海物流最新动态 </p>
					</div>
				</div>
	  		</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">货运险承保条件说明</h3>
				  </div>
				  <div class="panel-body">
			          <h2  align="center">货运险承保条件说明</h2>  <br>
			          <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;为了保障越海物流有限公司之客户（即“投保人”）货物在水路、铁路、公路和联运运输中，
			          因遭受保险责任范围内的自然灾害或意外事故所造成的损失能够得到经济补偿，并加强货物的安全防损工作，更好的保障投保人利益，解除投保人在货运运输途中的后顾之忧，
			          根据《中华人民共和国保险法》等有关法律、法规 ，
			          中国平安财产保险股份有限公司（以下简称“我司”） 就投保人为其在越海物流平台上所托运的货物投保货运险事宜进行如下说明： 
				      </p><br>
				 <font size="3" color="#FF7300"> 一、投保</font>
				 <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;投保人于每次货物起运前,投保人支付保费且运单状态更新为“运输中”后，我司确认信息生成保险单证方视为承保。若投保人已投保的运单状态更新为“已撤销”或“揽件失败”，则每笔运单对应的保费将退至投保人支付宝帐户中。
				 </p><br>
				 
				 <font size="3" color="#FF7300"> 二、承保货物种类</font><br>
				 <p>  对以下17类货物，我司予以承保：</p> 
				 <p>  1、植物产品</p>  
				 <p>  2、动、植物油、脂及其分解产品；精制的食用油脂；动、植物蜡</p>
				 <p>  3、食品；饮料、酒及醋；烟草、烟草及烟草代用品的制品</p>
				 <p>  4、矿产品</p>
				 <p>  5、化学工业及其相关工业的产品</p>
				 <p>  6、塑料及其制品；橡胶及其制品</p>
				 <p>  7、生皮、皮革、毛皮及其制品；鞍具及挽具；旅行制品、手提包及其类似容器、动物肠线（蚕胶丝除外）制品</p>
				 <p>  8、木及木制品；木炭；软木及软木制品；稻草、秸秆、针茅或其他编结材料制品；篮筐及柳条编结品</p>
				 <p>  9、木浆及其他纤维状纤维素浆；回收（废碎）纸或纸板；纸、纸板及其制品</p>
				 <p>  10、纺织原料及纺织制品</p>
				 <p>  11、鞋、帽、伞、杖、鞭及其零件；已加工的羽毛及其制品；人造花；人发制品</p>
				 <p>  12、石料、石膏、水泥、石棉、云母及 类似材料的制品；陶瓷产品；玻璃及其制品似材料的制品</p>
				 <p>  13、天然或养殖珍珠、宝石或半宝石、贵金属、包贵金属及其制品；仿首饰；硬币</p>
				 <p>  14、贱金属及其制品</p>
				 <p>  15、机器、机械器具、电气设备及其零件；录音机及放声机、电视图像、声音的录制和重放设备及其零件、附件</p>
				 <p>  16、光学、照相、电影、计量、检验、医疗或外科用仪器及设备、精密仪器及设备；钟表；乐器；上述物品的零件、附件疗或外科用仪器及设备、精密仪器及设备；上述物品的零件、附件</p>
				 <p>  17、杂项制品</p>
				 <p style="color: red">  对于以下4类货物，我司不予承保：</p> 
				 <p>  1、活动物；动物产品；</p>  
				 <p>  2、车辆、航空器、船舶及有关运输设备；</p>  
				 <p>  3、武器、弹药及其零件、附件；</p>  
				 <p>  4、艺术品、收藏品及古物</p>  <br>
				 <font size="3" color="#FF7300"> 三、运输方式及适用条款</font><br>
				 <p>  国内公路、水路、航空</p>  
				 <p>  适用国内航空、水路、陆路货物运输保险条款</p>  
				 <p>  附加《国内公路货物运输盗抢险条款》</p><br>
				 <font size="3" color="#FF7300"> 四、投保险别</font><br> 
				 <p>  1、对于全新货物适用：国内水路、陆路货物运输综合险</p> 
				 <p>  2、对于旧器材、退运原产地修复的已受损货物适用基本险</p> <br>
				 <font size="3" color="#FF7300"> 五、运输限额</font> <br>
				 <p>  每次货物运输限额为RMB300万元（保险金额超过RMB300万元或者保险标的或条件超出本合同约定的范围，必须经过我司确认，除非经我司同意，我司不承担任何保险责任。）</p><br>
				 <font size="3" color="#FF7300"> 六、运输范围:</font> 全国各大城市之间（港澳台地区除外）<br><br>
				 <font size="3" color="#FF7300"> 七、包装方式:</font> 国家或行业发布的强制性或建议性标准包装<br><br>
				<font size="3" color="#FF7300"> 八、保额确定:</font> 保险金额按货物的发票金额确定<br><br>
				<font size="3" color="#FF7300"> 九、免赔额：</font>  <br>
				<P> 1、裸装的钢材及其制品，包括卷钢：本保单不负责货物的锈损和标的受到刮擦导致的损失；</P>
				<P > 2、无包装或简易包装的纸张及其制品：每次事故绝对免赔为保额的1%；</P>
				<P  ><SPAN style="text-decoration: underline;"> 3、针对灯具、家具、石料、陶瓷制品、玻璃制品等易碎易破裂的货物，每次事故绝对免赔额为保额的20%。（家具包括但不限于浴室柜、柜板茶几、折叠桌、木制品等；陶瓷制品包括但不限于花瓶、洁具等）</SPAN></P>
				<P  ><SPAN style="text-decoration: underline;"> 4、针对白板、黑板、床垫、沙发等易弯曲变形、凹陷、磨损的货物，每次事故绝对免赔额为保额的20%。</SPAN></P>
				<P ><SPAN style="text-decoration: underline;"> 5、附加《国内公路货物运输盗抢险条款》，每次事故绝对免赔额为损失金额的20%</SPAN></P><br>
				<font size="3" color="#FF7300"> 十、保险费及支付方式</font>  <br>
				<P > 1、保险费的确定</P>
				<P > 保险费=保险金额*保险费率（保险费率：0.15%）。单张保单最低收费为RMB3.00元。</P>
				<P > 我司有权根据实际情况对保险费率进行调整，并适用于其后投保的保险合同。</P>
				<P > 2、支付方式</P>
				<P > 投保人于越海<a href="http://s.1688.com/wiki/k-%CE%EF%C1%F7_n-y.html" target="_blank" onmousedown="return aliclick(this,'?tracelog=baike_detail_internallinks_tag_searchlist');">物流</a>平台投保经我司系统审核通过后，支付至我司的支付宝帐户。</P>
				<br><font size="3" color="#FF7300"> 十一、理赔与服务</font> <br>
				<P > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;每份保险合同的理赔基本原则是在保险金额范围内以实际损失为限，对未实际发生的损失不予赔付。</P>
				<P > 投保人在发现运输的货物受损后应当于发生保险事故48小时内通过越海物流平台设置的报案链接向我司报案。</P>
				<P >&nbsp;索赔凭证如下：根据赔付金额的不同，对单证的要求分成三类：</P>
				<P >（1）(0 , 1000】：</P>
				<P >a. 越海物流平台的运单状态为已签收时：投保人提供提货单、货运单（物流公司备注货损字样等）照片。越海物流平台的运单状态为异常签收时，投保人提供越海物流平台显示的异常签收页面的截屏，以此向我司证明货损事故发生在运输途中。</P>
				<P >b.货损金额证明（请提供受损货物的价值证明，如发票、<a href="http://s.1688.com/wiki/k-%B9%BA%CF%FA%BA%CF%CD%AC_n-y.html" target="_blank" onmousedown="return aliclick(this,'?tracelog=baike_detail_internallinks_tag_searchlist');">购销合同</a>、货损型号等，以此向我司证明受损货物的金额）</P>
				<P >c. 整批货物价值证明（请提供所投保的这批货物的发票、买卖合同等，以此向我司证明投保比例）</P>
				<P >d. 事故照片（请提供受损货物的整体与局部情况+有型号铭牌等的需要拍到+对应拍摄日期）</P>
				<P >e. 保险利益的证明(可以是交易截屏、购销合同或购销发票)</P>
				<P >f. 支付三者时，需填授权委托书(授权委托书挂网)</P>
				<P >&nbsp;(2)(1000,10000】</P>
				<P >a. 越海物流平台的运单状态为已签收时：投保人提供提货单、货运单（物流公司备注货损字样等）照片。越海物流平台的运单状态为异常签收时，投保人提供越海物流平台显示的异常签收页面的截屏，以此向我司证明货损事故发生在运输途中</P>
				<P >b.货损金额证明（请提供受损货物的价值证明，如发票、购销合同、货损型号、维修清单等，以此向我司证明受损货物的金额）</P>
				<P >c. 整批货物价值证明（请提供所投保的这批货物的发票、买卖合同等，以此向我司证明投保比例）</P>
				<P >d. 事故照片（请提供受损货物的整体与局部情况+有型号铭牌等的需要拍到+对应拍摄日期）</P>
				<P >e. 保险利益的证明(可以是交易截屏、购销合同或购销发票)</P>
				<P >f. 快速处理表（小额快赔流程处理表，挂网，告知如何填写）</P>
				<P >（3）(10000, &infin;)&nbsp; 报损金额大于RMB10000的案件，被保险人报案后，根据每个案件的不同情况，由机构理赔人员电话与被保险人联系，并发送索赔资料清单，逐案处理。</P>
				<br><font size="3" color="#FF7300"> 十二、特别约定</font> <br> 
				<P >针对越海物流平台上所托运的货物之货运险保单，保险责任自保单记载的签单日期开始（签单日期为客户支付保费的日期）</P>
				<br><font size="3" color="#FF7300"> 十三、权益转让</font> <br> 
				<P >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;货物发生保险责任范围内的损失，如果根据法律规定或者有关约定，应当由承运人或其他第三者负责赔偿部分或全部损失的，被保险人应首先向承运人或其他第三者索赔。如被保险人提出要求，我司也可以先予赔偿，但被保险人应签发权益转让书给我司，并协助我司向责任方追偿。</P>
				<br><font size="3" color="#FF7300"> 十四、司法管辖</font> <br> 
				<P >本协议适用中华人民共和国法律，司法管辖中国。</P>
				<br><font size="3" color="#FF7300"> 十五、合同解除</font> <br>
				<P >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;如投保人完成保费支付后，因投保人撤销运单或物流公司揽件失败，且状态经越海物流平台确认，则保险合同解除，投保人已支付的保险费将默认退回至其支付该笔保费的<a href="http://s.1688.com/selloffer/k-%D6%A7%B8%B6%B1%A6_n-y.html" target="_blank" onmousedown="return aliclick(this,'?tracelog=baike_detail_internallinks_offer_tooffer');">支付宝</a>账户，如有特别约定的情况除外。</P>
				<P >投保人运单状态一旦变为&ldquo;运输中&rdquo;，则保险合同将不能解除。</P>
				<P ><SPAN style="text-indent: 2.0em;">&nbsp; &nbsp;</SPAN></P>
				<P >&nbsp;</P>
				<P >&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 中国平安财产保险股份有限公司</P>
				<P ><SPAN style="text-indent: 2.0em;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 日期：2014年11月13日</SPAN></P>	
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    </div>
	    </div>
	    <jsp:include page="../foot.jsp"/>
  </body>
</html>