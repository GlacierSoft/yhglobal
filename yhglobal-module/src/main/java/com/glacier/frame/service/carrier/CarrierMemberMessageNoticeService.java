/**
 * @Title: CarrierMemberMessageNoticeService.java 
 * @Package com.glacier.frame.service.carrier 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-12-1 下午1:41:26 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-12-1
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.service.carrier;

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
import com.glacier.frame.dao.carrier.CarrierMemberMapper;
import com.glacier.frame.dao.carrier.CarrierMemberMessageNoticeMapper;
import com.glacier.frame.dto.query.carrier.CarrierMemberMessageNoticeQueryDTO;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.carrier.CarrierMemberMessageNotice;
import com.glacier.frame.entity.carrier.CarrierMemberMessageNoticeExample;
import com.glacier.frame.entity.carrier.CarrierMemberMessageNoticeExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: CarrierMemberMessageNoticeService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-12-1 下午1:41:26
 */

@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class CarrierMemberMessageNoticeService {
	
	
	@Autowired
	private CarrierMemberMessageNoticeMapper carrierMemberMessageNoticeMapper;
	
	@Autowired
	private CarrierMemberMapper carrierMemberMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有消息通知信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGridWebsite(CarrierMemberMessageNoticeQueryDTO carrierMemberMessageNoticeQueryDTO,JqPager pager,int p) {
        JqGridReturn returnResult = new JqGridReturn();
        CarrierMemberMessageNoticeExample carrierMemberMessageNoticeExample = new CarrierMemberMessageNoticeExample();
        
        //删除信息隐藏
        List<String> list=new ArrayList<String>();
        list.add("delete");
        
        Criteria queryCriteria = carrierMemberMessageNoticeExample.createCriteria();
        queryCriteria.andLetterstatusNotIn(list);
        carrierMemberMessageNoticeQueryDTO.setQueryCondition(queryCriteria);
        
        pager.setSort("createTime");// 定义排序字段
	    pager.setOrder("DESC");// 升序还是降序
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	carrierMemberMessageNoticeExample.setOrderByClause(pager.getOrderBy("temp_carrier_member_message_notice_"));
        }
        int startTemp = ((p-1)*6);//根据前台返回的页数进行设置
        carrierMemberMessageNoticeExample.setLimitStart(startTemp);
        carrierMemberMessageNoticeExample.setLimitEnd(10);
        List<CarrierMemberMessageNotice>  shipperMemberMessageNotices = carrierMemberMessageNoticeMapper.selectByExample(carrierMemberMessageNoticeExample); // 查询所有消息通知列表
        
        int total = carrierMemberMessageNoticeMapper.countByExample(carrierMemberMessageNoticeExample); // 查询总页数
        returnResult.setRows(shipperMemberMessageNotices);
        returnResult.setTotal(total);
        returnResult.setP(p);
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
    	//已读
    	CarrierMemberMessageNoticeExample NoticeExampleAlready= new CarrierMemberMessageNoticeExample();
        NoticeExampleAlready.createCriteria().andLetterstatusEqualTo("read");
        int countAlready=carrierMemberMessageNoticeMapper.countByExample(NoticeExampleAlready);
        //未读
        CarrierMemberMessageNoticeExample NoticeExampleWithout= new CarrierMemberMessageNoticeExample();
        NoticeExampleWithout.createCriteria().andLetterstatusEqualTo("unread");
        int countWithout=carrierMemberMessageNoticeMapper.countByExample(NoticeExampleWithout);
        //全部记录
        int countNumber=countAlready+countWithout;
        //保存
        map.put("countAlready", Integer.toString(countAlready));
        map.put("countWithout", Integer.toString(countWithout));
        map.put("countNumber", Integer.toString(countNumber));
        return map;
    }
    
    /**
     * @Title: countAlready 
     * @Description: TODO(已读消息通知) 
     * @param @param
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public int getCountAlready(String carrierId){
    	//已读
    	CarrierMemberMessageNoticeExample NoticeExampleAlready= new CarrierMemberMessageNoticeExample();
        NoticeExampleAlready.createCriteria().andLetterstatusEqualTo("read").andReceiverEqualTo(carrierId);
        int countAlready=carrierMemberMessageNoticeMapper.countByExample(NoticeExampleAlready);
        return countAlready;
    }
    
    /**
	 * @Title: getCountWithout 
	 * @Description: TODO(未读消息数量) 
	 * @param @param 
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public int getCountWithout(String carrierId){
        //未读
        CarrierMemberMessageNoticeExample NoticeExampleWithout= new CarrierMemberMessageNoticeExample();
        NoticeExampleWithout.createCriteria().andLetterstatusEqualTo("unread").andReceiverEqualTo(carrierId);
        int countWithout=carrierMemberMessageNoticeMapper.countByExample(NoticeExampleWithout);
        return countWithout;
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
    public Object editMessageNoticeWebsit(CarrierMemberMessageNotice carrierMemberMessageNotice) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        carrierMemberMessageNotice.setUpdateTime(new Date());
        count = carrierMemberMessageNoticeMapper.updateByPrimaryKeySelective(carrierMemberMessageNotice);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("消息通知信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，消息通知信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有消息通知信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(CarrierMemberMessageNoticeQueryDTO carrierMemberMessageNoticeQueryDTO,JqPager pager) {
        
        JqGridReturn returnResult = new JqGridReturn();
        CarrierMemberMessageNoticeExample carrierMemberMessageNoticeExample = new CarrierMemberMessageNoticeExample();
        
        Criteria queryCriteria = carrierMemberMessageNoticeExample.createCriteria();
        carrierMemberMessageNoticeQueryDTO.setQueryCondition(queryCriteria);

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	carrierMemberMessageNoticeExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	carrierMemberMessageNoticeExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	carrierMemberMessageNoticeExample.setOrderByClause(pager.getOrderBy("temp_carrier_member_message_notice_"));
        }
        List<CarrierMemberMessageNotice>  shipperMemberMessageNotices = carrierMemberMessageNoticeMapper.selectByExample(carrierMemberMessageNoticeExample); // 查询所有消息通知列表
        int total = carrierMemberMessageNoticeMapper.countByExample(carrierMemberMessageNoticeExample); // 查询总页数
        returnResult.setRows(shipperMemberMessageNotices);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getMemberShipperMessageNotice 
	 * @Description: TODO(根据消息通知Id获取消息通知信息) 
	 * @param @param messageNoticeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getCarrierMemberMessageNotice(String messageNoticeId) {
    	CarrierMemberMessageNotice carrierMemberMessageNotice = carrierMemberMessageNoticeMapper.selectByPrimaryKey(messageNoticeId);
        return carrierMemberMessageNotice;
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
    public Object addCarrierMemberMessageNotice(CarrierMemberMessageNotice carrierMemberMessageNotice){
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        carrierMemberMessageNotice.setMessageNoticeId(RandomGUID.getRandomGUID());
        carrierMemberMessageNotice.setSender(pricipalUser.getUserId());
        carrierMemberMessageNotice.setRemark(carrierMemberMessageNotice.getTitle());
        carrierMemberMessageNotice.setSendtime(new Date());
        carrierMemberMessageNotice.setLetterstatus("unread");
        carrierMemberMessageNotice.setLettertype("system");
        carrierMemberMessageNotice.setCreater(pricipalUser.getUserId());
        carrierMemberMessageNotice.setCreateTime(new Date());
        carrierMemberMessageNotice.setUpdater(pricipalUser.getUserId());
        carrierMemberMessageNotice.setUpdateTime(new Date());
        boolean flag=(Boolean) sendCarrierMemberMessageNotice(carrierMemberMessageNotice);
        if(flag){
        	count = carrierMemberMessageNoticeMapper.insert(carrierMemberMessageNotice);
            if (count == 1) {
                returnResult.setSuccess(true);
                returnResult.setMsg("[" + carrierMemberMessageNotice.getTitle() + "] 消息通知信息已保存");
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
    public Object sendCarrierMemberMessageNotice(CarrierMemberMessageNotice carrierMemberMessageNotice){
    	boolean flag=false;
    	//获取发送对象
    	CarrierMember carrierMember=carrierMemberMapper.selectByPrimaryKey(carrierMemberMessageNotice.getReceiver());
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
            email.setHtmlMsg(carrierMemberMessageNotice.getContent());// 设置邮件内容
            email.addTo(carrierMember.getEmail());// 给会员发邮件
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
