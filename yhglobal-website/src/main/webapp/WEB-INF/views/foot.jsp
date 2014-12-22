<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<% 
response.setContentType("text/html;charset=UTF-8");
request.setCharacterEncoding("utf-8"); 
%>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="<%=basePath %>resources/css/foot/footOne.css" type="text/css" rel="stylesheet" />
<script src="<%=basePath %>resources/js/foot/footOne.js"></script>

</head>
<style>
</style> 
<body>
  <footer id="footer-p-beta2">
  <hr />
  <div class="wrap">
    <div class="copyright">
      <div class="copy-side">
        服务热线 (免长话费)<br /><strong>400-8888-888</strong><br /><small>工作日8:00-18:00</small>
      </div>
      <div class="copy-main">
        <div class="item">
          <dl>
            <dt>简介</dt>
            <dd><a href="<%=basePath %>aboutUs.htm" target="_blank" rel="nofollow" style="font-size: 12px;">公司简介</a></dd>
            <dd><a href="<%=basePath %>announcement/announcement.htm?&p=1" target="_blank" rel="nofollow" style="font-size: 12px;">网站公告</a></dd>
            <dd><a href="<%=basePath %>hiring/hiring.htm?&p=1" target="_blank" rel="nofollow" style="font-size: 12px;">招贤纳士</a></dd>
            <dd><a href="<%=basePath %>others/otherAddress.htm" target="_blank" rel="nofollow" style="font-size: 12px;">公司地图</a></dd>
            <dd><a href="<%=basePath %>contactUs.htm" target="_blank" rel="nofollow" style="font-size: 12px;">联系我们</a></dd>
          </dl>
        </div>
        <div class="item">
          <dl>
            <dt>帮助</dt>
            <dd><a href="<%=basePath %>contrabandExplain.htm" target="_blank" rel="nofollow" style="font-size: 12px;">禁用品说明</a></dd>
            <dd><a href="<%=basePath %>weightExplain.htm" target="_blank" rel="nofollow" style="font-size: 12px;">轻/重货说明</a></dd>
            <dd><a href="<%=basePath %>collectFees.htm" target="_blank" rel="nofollow" style="font-size: 12px;">增殖服务说明</a></dd>
            <dd><a href="<%=basePath %>insuranceExplain.htm" target="_blank" rel="nofollow" style="font-size: 12px;">货运险承保说明</a></dd>
          </dl>
        </div>
        <div class="item">
          <dl>
            <dt>共赢</dt>
            <dd><a href="<%=basePath %>intoregisterCarrier.htm" target="_blank" rel="nofollow" style="font-size: 12px;">承运商合作</a></dd>
            <dd><a href="<%=basePath %>intoregister.htm" target="_blank" rel="nofollow" style="font-size: 12px;">货主合作</a></dd>
            <dd><a href="<%=basePath %>logisticsPark.htm" target="_blank" rel="nofollow" style="font-size: 12px;">物流园区</a></dd>
            <dd><a href="<%=basePath %>logisticsExhibition.htm" target="_blank" rel="nofollow" style="font-size: 12px;">物流展会</a></dd>
            <dd><a href="<%=basePath %>" target="_blank" rel="nofollow" style="font-size: 12px;">意见反馈</a></dd>
          </dl>
        </div>
        <div class="item">
          <dl>
            <dt>导航</dt>
            <dd><a href="<%=basePath %>delivery/index.htm" target="_blank" rel="nofollow" style="font-size: 12px;">我要发货</a></dd>
            <dd><a href="<%=basePath %>route/route.htm?&p=1&routeType=landCarriage" target="_blank" rel="nofollow" style="font-size: 12px;">查看班线</a></dd>
            <dd><a href="<%=basePath %>orderQuery.htm?&p=1" target="_blank" rel="nofollow" style="font-size: 12px;">查看订单</a></dd>
            <dd><a href="<%=basePath %>member/index.htm" target="_blank" rel="nofollow" style="font-size: 12px;">个人中心</a></dd>
            <dd><a href="<%=basePath %>logisticsPark.htm" target="_blank" rel="nofollow" style="font-size: 12px;">综合信息</a></dd>
          </dl>
        </div>
        <div class="item item-weibo">
          <a href="#" target="_blank" rel="nofollow"><i class="weibo"></i></a>
          <p>关注微博</p>
          <a class="btn-sina" href="#" target="_blank" rel="nofollow"></a>
        </div>
        <div class="item item-apps">
          <i class="mishu"></i>
          <p>关注微信</p>
        </div>
      </div>
    </div>
  </div>
  <div class="copy-footer">
    <p>京ICP备09000000号 京ICP证070000号 人才服务许可证:RC0710000 京公网安备1101000000</p>
    <p>Copyright © 2014 Glacier Software Company Co., Ltd. All rights reserved.</p>
  </div>
</footer>

 <!-- 客服数据 --> 
 <div id="keFu_daohang" style="top:200px;width:70px;right:8px;position:fixed;z-index:9999;box-shadow:0px 0px 10px rgba(0, 0, 0, 0.3);border: 0px solid red;">
      <div style="width: 60px;height: 60px;float: right;border: 0px solid  red;margin-top: 5px;">
           <img title="点击展开客服列表" src="<%=basePath %>resources/images/foot/one.png" id="KeFuDivOne" style="cursor: pointer;">
      </div>
      <div style="width: 60px;height: 60px;float: right;border: 0px solid  red;margin-top: 5px;" >
            <img title="点击返回主页" src="<%=basePath %>resources/images/foot/two.png" id="KeFuDivTwo" style="cursor: pointer;">
      </div>
      <div style="width: 60px;height: 60px;float: right;border: 0px solid  red;margin-top: 5px;">
           <img title="点击回到顶部" src="<%=basePath %>resources/images/foot/three.png" id="KeFuDivThree" style="cursor: pointer;">
      </div>
 </div>

<!--  客服展示页-->
<Div id="keFu_Show" style="top:200px;width:183px;right:8px;position:fixed;display: none;">
     <Div style="width:150px;border: 6px solid #FF5400;border-radius:10px;background: #FFFFFF;float: right;" >
      <Div style="float:left;margin-top: 10px;margin-left: 8px;width: 120px;height:40px;line-height:40px;border-top: 3px solid #FF5400;text-align: center;color: #FF5400;background: #E4E4E5;">
             QQ在线咨询
      </Div>
      <Div style="float:left;margin-top: 5px;margin-left: 8px;width: 120px;height:30px;line-height:30px;border: 0px solid #00724F;text-align: center;color: #FF5400;background: #FFFFFF">
           <img  src="<%=basePath %>resources/images/foot/zixun.png"> 在线咨询
      </Div>
       <Div style="float:left;margin-left: 8px;width: 120px;height:30px;line-height:30px;border: 0px solid #00724F;text-align: center;color: #FF5400;background: #FFFFFF">
           <a href="http://qiao.baidu.com/v3/?module=default&controller=im&action=index&ucid=7542571&type=n&siteid=5128180" target="_blank"><img  src="<%=basePath %>resources/images/foot/zixun.png"><font color="#FF5400">商桥交谈</font></a>
      </Div>
      <Div  id="KeFu_PutIn" style="float:left;width:120px;margin-top: 5px;margin-left: 8px;line-height:32px;border: 0px solid #00724F;text-align: center;color: #009CE7;vertical-align:middle;">
              <!--<a href="http://qiao.baidu.com/v3/?module=default&controller=im&action=index&ucid=7542571&type=n&siteid=5128180" target="_blank"></a> -->
      </Div>
      <Div style="float:left;margin-top: 10px;margin-left: 8px;width: 120px;height:30px;line-height:30px;border-top: 3px solid #E5E4E2;text-align: center;color: #FF5400;border-bottom: 3px solid #E5E4E2;">
                                                  电话咨询
      </Div>
      <Div style="float:left;margin-left: 8px;width: 120px;height:40px;line-height:40px;text-align: center;color: #FF5400;border-bottom: 3px solid #E5E4E2;">
           <img src="<%=basePath %>resources/images/foot/kefu_dianhua.png">0756-3628802
      </Div>
      <Div style="float:left;margin-left: 8px;width: 120px;height:35px;line-height:35px;text-align: center;color: #009CE7;border-bottom: 3px solid #E5E4E2;color: #FE8405;">
           <img src="<%=basePath %>resources/images/foot/kefu_zixun.png"><a href="http://www.glaciersoft.cn/index.html" target="_blank"><font color="#FF5400">点我咨询</font></a>
      </Div>
    </Div>
    
    <div style="width:30px;height:350px;border: 0px solid #009CE7;float: right;margin-bottom: 20px;">
             <Div style="width:30px;height: 155px;border:0px solid blue;background: #FF5400;color: white;text-align: center;margin-top: 100px;border-radius:5px;">
                 <a href="#" onclick="DoHide();" style="color: white;text-decoration: none;"><img src="<%=basePath %>resources/images/foot/online_kufu.png">在</br>线</br>客</br>服</br>>></a>
             </Div>
     </div>
</Div>

  <script>
  //显示
  function DoHide(){
	   $("#keFu_Show").hide();
	   $("#keFu_daohang").show();
  };
  
  //展开客服列表
  $("#KeFuDivOne").click(function(){
	   $("#keFu_daohang").hide();
	   $("#keFu_Show").show();
  });
  
  //返回主页
  $("#KeFuDivTwo").click(function(){
	   location.href="<%=basePath%>index.htm";
  });
  
  //回到底部
  $("#KeFuDivThree").click(function(){
	   $('body,html').animate({scrollTop:0},1000);
  });
  
  //填充客服数据
  $(function(){
    	   $.ajax({
     		   type:"post",
     		   url:"<%=basePath%>service/list.json",
     		   dataType:"json",
     		   success:function(data){
     			   //循环开始
     		        $.each(data.rows,function(i,v){
                           //alert("客服姓名:"+v.webServiceName+" 客服QQ:"+v.webServiceQq);	
                           var numb=v.webServiceQq;
                           $("<a target='_blank' href='http://wpa.qq.com/msgrd?v=3&uin="+v.webServiceQq+"&site=qq&menu=yes'><img border='0' src='http://wpa.qq.com/pa?p=1:"+numb+":51' alt='点击这里给我发消息' title='点击这里给我发消息'/></a>").appendTo("#KeFu_PutIn");     
     		       });
     		   }
     		});
    	 });
   </script>

</body>
</html>
