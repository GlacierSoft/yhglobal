/**
 * @Title: ShipperMemberMessageNoticeService.java 
 * @Package com.glacier.frame.service.member 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-11-27 上午11:09:58 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-11-27
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.service.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.member.ShipperMemberMapper;
import com.glacier.frame.dao.member.ShipperMemberMessageNoticeMapper;
import com.glacier.frame.dto.query.member.ShipperMemberMessageNoticeQueryDTO;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.member.ShipperMemberMessageNotice;
import com.glacier.frame.entity.member.ShipperMemberMessageNoticeExample;
import com.glacier.frame.entity.member.ShipperMemberMessageNoticeExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: ShipperMemberMessageNoticeService 
 * @Description: TODO(会员站内信) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-11-27 上午11:09:58
 */

@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class ShipperMemberMessageNoticeService {
	
	@Autowired
	private ShipperMemberMessageNoticeMapper shipperMemberMessageNoticeMapper;
	
	@Autowired
	private ShipperMemberMapper shipperMemberMapper; 
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有消息通知信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGridWebsite(ShipperMemberMessageNoticeQueryDTO shipperMemberMessageNoticeQueryDTO,JqPager pager,int p) {
        
        JqGridReturn returnResult = new JqGridReturn();
        ShipperMemberMessageNoticeExample shipperMemberMessageNoticeExample = new ShipperMemberMessageNoticeExample();
        
        //删除信息隐藏
        List<String> list=new ArrayList<String>();
        list.add("delete");
        
        Criteria queryCriteria = shipperMemberMessageNoticeExample.createCriteria();
        queryCriteria.andLetterstatusNotIn(list);
        shipperMemberMessageNoticeQueryDTO.setQueryCondition(queryCriteria);
        
        pager.setSort("createTime");// 定义排序字段
	    pager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	shipperMemberMessageNoticeExample.setOrderByClause(pager.getOrderBy("temp_shipper_member_message_notice_"));
        }
        int startTemp = ((p-1)*6);//根据前台返回的页数进行设置
        shipperMemberMessageNoticeExample.setLimitStart(startTemp);
        shipperMemberMessageNoticeExample.setLimitEnd(10);
        List<ShipperMemberMessageNotice>  shipperMemberMessageNotices = shipperMemberMessageNoticeMapper.selectByExample(shipperMemberMessageNoticeExample); // 查询所有消息通知列表
        
        int total = shipperMemberMessageNoticeMapper.countByExample(shipperMemberMessageNoticeExample); // 查询总页数
        returnResult.setRows(shipperMemberMessageNotices);
        returnResult.setTotal(total);
        returnResult.setP(p);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有消息通知信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(ShipperMemberMessageNoticeQueryDTO shipperMemberMessageNoticeQueryDTO,JqPager pager) {
        
        JqGridReturn returnResult = new JqGridReturn();
        ShipperMemberMessageNoticeExample shipperMemberMessageNoticeExample = new ShipperMemberMessageNoticeExample();
        
        Criteria queryCriteria = shipperMemberMessageNoticeExample.createCriteria();
        shipperMemberMessageNoticeQueryDTO.setQueryCondition(queryCriteria);

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	shipperMemberMessageNoticeExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	shipperMemberMessageNoticeExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	shipperMemberMessageNoticeExample.setOrderByClause(pager.getOrderBy("temp_shipper_member_message_notice_"));
        }
        List<ShipperMemberMessageNotice>  shipperMemberMessageNotices = shipperMemberMessageNoticeMapper.selectByExample(shipperMemberMessageNoticeExample); // 查询所有消息通知列表
        int total = shipperMemberMessageNoticeMapper.countByExample(shipperMemberMessageNoticeExample); // 查询总页数
        returnResult.setRows(shipperMemberMessageNotices);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    
    /**
	 * @Title: getMemberShipperMessageNoticeNumber 
	 * @Description: TODO(获取消息分类数量) 
	 * @param @param messageNoticeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMemberShipperMessageNoticeNumber(){
    	Map<Object, String> map=new HashMap<Object, String>();
    	// 获取当前认证用户
    	Subject pricipalSubject = SecurityUtils.getSubject();
		ShipperMember pricipalMember = (ShipperMember) pricipalSubject.getPrincipal();
    	//已读
        ShipperMemberMessageNoticeExample NoticeExampleAlready= new ShipperMemberMessageNoticeExample();
        NoticeExampleAlready.createCriteria().andLetterstatusEqualTo("read").andReceiverEqualTo(pricipalMember.getMemberId());
        int countAlready=shipperMemberMessageNoticeMapper.countByExample(NoticeExampleAlready);
        //未读
        ShipperMemberMessageNoticeExample NoticeExampleWithout= new ShipperMemberMessageNoticeExample();
        NoticeExampleWithout.createCriteria().andLetterstatusEqualTo("unread").andReceiverEqualTo(pricipalMember.getMemberId());
        int countWithout=shipperMemberMessageNoticeMapper.countByExample(NoticeExampleWithout);
        //全部记录
        int countNumber=countAlready+countWithout;
        //保存
        map.put("countAlready", Integer.toString(countAlready));
        map.put("countWithout", Integer.toString(countWithout));
        map.put("countNumber", Integer.toString(countNumber));
        return map;
    }
    
    /**
	 * @Title: getMemberShipperMessageNotice 
	 * @Description: TODO(根据消息通知Id获取消息通知信息) 
	 * @param @param messageNoticeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMemberShipperMessageNotice(String messageNoticeId) {
    	ShipperMemberMessageNotice shipperMemberMessageNotice = shipperMemberMessageNoticeMapper.selectByPrimaryKey(messageNoticeId);
        return shipperMemberMessageNotice;
    }
    
    /**
     * @Title: editMemberMessageNotice 
     * @Description: TODO(修改消息通知) 
     * @param @param memberMessageNotice
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editMessageNoticeWebsit(ShipperMemberMessageNotice shipperMemberMessageNotice) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        shipperMemberMessageNotice.setUpdateTime(new Date());
        count = shipperMemberMessageNoticeMapper.updateByPrimaryKeySelective(shipperMemberMessageNotice);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("消息通知信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，消息通知信息修改失败");
        }
        return returnResult;
    }
    /**
     * @Title: addMemberMessageNotice 
     * @Description: TODO(新增消息通知) 
     * @param @param memberMessageNotice
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addMemberMessageNotice(ShipperMemberMessageNotice memberMessageNotice){
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        memberMessageNotice.setMessageNoticeId(RandomGUID.getRandomGUID());
        memberMessageNotice.setSender(pricipalUser.getUserId());
        memberMessageNotice.setRemark(memberMessageNotice.getTitle());
        memberMessageNotice.setSendtime(new Date());
        memberMessageNotice.setLetterstatus("unread");
        memberMessageNotice.setLettertype("system");
        memberMessageNotice.setCreater(pricipalUser.getUserId());
        memberMessageNotice.setCreateTime(new Date());
        memberMessageNotice.setUpdater(pricipalUser.getUserId());
        memberMessageNotice.setUpdateTime(new Date());
        boolean flag=(Boolean) sendMemberMessageNotice(memberMessageNotice);
        if(flag){
        	count = shipperMemberMessageNoticeMapper.insert(memberMessageNotice);
            if (count == 1) {
                returnResult.setSuccess(true);
                returnResult.setMsg("[" + memberMessageNotice.getTitle() + "] 消息通知信息已保存");
            } else {
                returnResult.setMsg("发生未知错误，消息通知信息保存失败");
            }	
        }else{
        	returnResult.setSuccess(false);
            returnResult.setMsg("邮件发送失败，请尽快联系管理员!");
        }
        return returnResult;
    }
    
    /**
     * @Title: sendMemberMessageNotice 
     * @Description: TODO(消息发送) 
     * @param @param memberMessageNotice
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    
    public Object sendMemberMessageNotice(ShipperMemberMessageNotice memberMessageNotice){
    	boolean flag=false;
    	//获取发送对象
    	ShipperMember shipperMember=shipperMemberMapper.selectByPrimaryKey(memberMessageNotice.getReceiver());
    	// 基于org.apache.commons.mail,封装好的mail，发邮件流程比较简单，比原生态mail简单。
        HtmlEmail email = new HtmlEmail();
        email.setHostName("smtp.qq.com");// QQ郵箱服務器
        // email.setHostName("smtp.163.com");// 163郵箱服務器
        // email.setHostName("smtp.gmail.com");// gmail郵箱服務器
        email.setSmtpPort(465);// 设置端口号
        email.setAuthenticator(new DefaultAuthenticator("1240033960@qq.com", "zx5304960"));// 用1240033960@qq.com这个邮箱发送验证邮件的
        email.setTLS(true);// tls要设置为true,没有设置会报错。
        email.setSSL(true);// ssl要设置为true,没有设置会报错。
        try {
            email.setFrom("1240033960@qq.com", "冰川物流管理员", "UTF-8");
            // email.setFrom("13798985542@163.com", "13798985542@163.com","UTF-8");
            // email.setFrom("yuzexu1@gmail.com", "yuzexu1@gmail.com", "UTF-8");
        } catch (EmailException e1) {
            e1.printStackTrace();
        }
        email.setCharset("UTF-8");// 没有设置会乱码。
        try {
            email.setSubject("冰川物流消息提示");// 设置邮件名称
            email.setHtmlMsg(memberMessageNotice.getContent());// 设置邮件内容
            email.addTo(shipperMember.getEmail());// 给会员发邮件
            // email.addTo("804346249@qq.com");
            email.send();// 邮件发送
            flag=true;
        } catch (EmailException e) {
            // throw new RuntimeException(e);
        	flag=false;
        }
        return flag;
    }
}