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
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">互联网简介</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">产品服务</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">创新优势</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">友情链接</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">联系我们</a></dd>
          </dl>
        </div>
        <div class="item">
          <dl>
            <dt>帮助</dt>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">禁用品说明</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">轻/重货说明</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">发货流程说明</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">货运险承保说明</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">帮助中心</a></dd>
          </dl>
        </div>
        <div class="item">
          <dl>
            <dt>共赢</dt>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">承运商合作</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">货主合作</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">个体司机合作</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">意见反馈</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">加入互联网</a></dd>
          </dl>
        </div>
        <div class="item">
          <dl>
            <dt>导航</dt>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">我要发货</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">查看班线</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">查看订单</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">个人中心</a></dd>
            <dd><a href="#" target="_blank" rel="nofollow" style="font-size: 12px;">综合信息</a></dd>
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
       
</body>
</html>
