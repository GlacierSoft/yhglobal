/**
 * @Title: ShipperMemberService.java 
 * @Package com.glacier.global.service.member
 * @author songjundong   
 * @email 985776597@qq.com
 * @date 2014-10-08 下午1:40:53
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：songjundong
 * 
 */
package com.glacier.frame.service.member; 
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.member.ShipperEnterpriseMemberMapper;
import com.glacier.frame.dao.member.ShipperIndividualityMemberMapper;
import com.glacier.frame.dao.member.ShipperMemberMapper;
import com.glacier.frame.dao.member.ShipperMemberTokenMapper;
import com.glacier.frame.dto.query.member.ShipperMemberQueryDTO;
import com.glacier.frame.entity.member.ShipperEnterpriseMember;
import com.glacier.frame.entity.member.ShipperIndividualityMember;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.member.ShipperMemberExample;
import com.glacier.frame.entity.member.ShipperMemberExample.Criteria;
import com.glacier.frame.entity.member.ShipperMemberToken;
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.security.util.Digests;
import com.glacier.security.util.Encodes;

/*** 
 * @ClassName:  ShipperMemberService
 * @Description: TODO(货主会员表业务类)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-08 下午1:40:53
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ShipperMemberService {

	@Autowired
	private ShipperMemberMapper shipperMemberMapper;
	
	@Autowired
	private ShipperEnterpriseMemberMapper shipperEnterpriseMemberMapper;
    
	@Autowired
	private ShipperIndividualityMemberMapper shipperIndividualityMemberMapper;

	@Autowired
    private ShipperMemberTokenMapper shipperMemberTokenMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    public Object listAsGrid(JqPager jqPager, ShipperMemberQueryDTO memberQueryDTO, String q) {
        JqGridReturn returnResult = new JqGridReturn();
        ShipperMemberExample memberExample = new ShipperMemberExample(); 
        Criteria queryCriteria = memberExample.createCriteria();
        memberQueryDTO.setQueryCondition(queryCriteria, q); 
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	memberExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	memberExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	memberExample.setOrderByClause(jqPager.getOrderBy("temp_shipper_member_"));
        }
        List<ShipperMember>  shippermembers = shipperMemberMapper.selectByExample(memberExample); // 查询所有会员列表
        int total = shipperMemberMapper.countByExample(memberExample); // 查询总页数
        returnResult.setRows(shippermembers);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getMember 
	 * @Description: TODO(根据会员Id获取会员信息) 
	 * @param @param memberId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public List<Object> getMember(String memberId) {
    	List<Object> list=new ArrayList<Object>(); 
    	ShipperMember member = shipperMemberMapper.selectByPrimaryKey(memberId);
    	list.add(member);
    	 //根据会员类型，获取对应的数据，如果是个体会员，则查询个体的相关数据
    	if(member.getMemberType().equals("enterprise")){ //企业会员
    		list.add(shipperEnterpriseMemberMapper.selectByPrimaryKey(memberId));
    	}else{ //个体会员
    		list.add(shipperIndividualityMemberMapper.selectByPrimaryKey(memberId));
    	} 
        return list;
    } 
     
    /**
     * @Title: getMember 
     * @Description: TODO(根据会员Id获取会员信息) 
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public ShipperMember getShipperMember(String memberId) {
        ShipperMember shipperMember = shipperMemberMapper.selectByPrimaryKey(memberId);
        return shipperMember;
    }
    
    /*** 
     * @Title: upStatus  
     * @Description: TODO(启用和禁用会员)  
     * @param @param shipperMemberId
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */ 
    @Transactional(readOnly = false)
    public Object upStatus(String shipperMemberId){
    	 JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	 ShipperMember shipperMember= shipperMemberMapper.selectByPrimaryKey(shipperMemberId);
    	 if(shipperMember.getStatus().equals("enable")){
    		 shipperMember.setStatus("disable");
    	 }else{
    		 shipperMember.setStatus("enable");
    	 } 
    	 int count = shipperMemberMapper.updateByPrimaryKeySelective(shipperMember);
    	 if(count == 1){
    		 returnResult.setSuccess(true);
    		 returnResult.setMsg("更改状态成功!");
    	 }else{
    		 returnResult.setMsg("发生未知错误，状态修改失败");
    	 }
    	return returnResult; 
    } 

    /**
     * @Title: audit 
     * @Description: TODO(审核企业信息) 
     * @param @param shipperEnterpriseMember
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public Object audit(ShipperEnterpriseMember shipperEnterpriseMember) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ShipperEnterpriseMember enterpriseMember = shipperEnterpriseMemberMapper.selectByPrimaryKey(shipperEnterpriseMember.getMemberId());
        if(enterpriseMember.getAuthState().equals("authstr")==false){
        	returnResult.setMsg("该企业已进行过审核，不可重复操作");
       	    return returnResult;
        }
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject(); 
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        shipperEnterpriseMember.setAuth(pricipalUser.getUserId());
        shipperEnterpriseMember.setAuthTime(new Date()); 
        count = shipperEnterpriseMemberMapper.updateByPrimaryKeySelective(shipperEnterpriseMember);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("企业【"+enterpriseMember.getEnterpriseName()+"】审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，企业信息审核失败");
        }
        return returnResult;
    } 
    
    /**
     * 加密方式
     */
    public static final String HASH_ALGORITHM = "SHA-1";

    /**
     * 计算次数
     */
    public static final int HASH_INTERATIONS = 1024;

    /**
     * 盐值长度
     */
    public static final int SALT_SIZE = 8;
    
    /**
     * 设定盐值和设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
     */
    private void entryptPassword(ShipperMemberToken shipperMemberToken) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        shipperMemberToken.setSalt(Encodes.encodeHex(salt));
        byte[] hashPassword = Digests.sha1(shipperMemberToken.getPassword().getBytes(), salt, HASH_INTERATIONS);
        shipperMemberToken.setPassword(Encodes.encodeHex(hashPassword));
    }
    
    /**
     * @Title: retrieveEmail 
     * @Description: TODO(判断该邮箱是否存在) 
     * @param @param member
     * @param @param  
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public ShipperMember retrieveEmail(String email) {  
        ShipperMemberExample shipperMemberExample = new ShipperMemberExample();
        shipperMemberExample.createCriteria().andEmailEqualTo(email);
        List<ShipperMember> shipperMemberlist= shipperMemberMapper.selectByExample(shipperMemberExample); 
        //如果取出来的是没数据的，就返回null,否则就把集合里的第一条数据返回
        return shipperMemberlist.size()==0?null:shipperMemberlist.get(0);
    }
    
    /**
     * @Title: retrieveName 
     * @Description: TODO(判断该会员名称是否存在) 
     * @param @param member
     * @param @param  
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public ShipperMember retrieveName(String name) {  
        ShipperMemberExample shipperMemberExample = new ShipperMemberExample();
        shipperMemberExample.createCriteria().andMemberNameEqualTo(name);
        List<ShipperMember> shipperMemberlist= shipperMemberMapper.selectByExample(shipperMemberExample); 
        //如果取出来的是没数据的，就返回null,否则就把集合里的第一条数据返回
        return shipperMemberlist.size()==0?null:shipperMemberlist.get(0);
    }
    
    /**
     * @Title: isUsernameRepeat 
     * @Description: TODO(判断会员名是否重复) 
     * @param  @param shipperShipperMember
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object isUsernameRepeat(ShipperMember shipperShipperMember){
          JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
          ShipperMemberExample shipperShipperMemberExample = new ShipperMemberExample();
          // 防止会员名称重复
          shipperShipperMemberExample.createCriteria().andMemberNameEqualTo(shipperShipperMember.getMemberName());
          int count = shipperMemberMapper.countByExample(shipperShipperMemberExample);// 查找相同名称的会员数量
          if (count > 0) {
              returnResult.setMsg("会员名称重复");
          }else{
              returnResult.setSuccess(true);
          }
          return returnResult;
    }
    
    /**
     * @Title: isEmailRepeat 
     * @Description: TODO(判断邮箱是否重复) 
     * @param  @param shipperShipperMember
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object isEmailRepeat(ShipperMember shipperMember){
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ShipperMemberExample shipperMemberExample = new ShipperMemberExample();
        // 防止邮箱重复
        shipperMemberExample.createCriteria().andEmailEqualTo(shipperMember.getEmail());
        int count = shipperMemberMapper.countByExample(shipperMemberExample);// 查找相同邮箱的会员数量
        if (count > 0) {
            returnResult.setMsg("该邮箱已注册！");
        }else{
          returnResult.setSuccess(true);
        }
        return returnResult;
    }
    
    /**
     * @Title: addShipperMemberReception 
     * @Description: TODO(前台注册会员，如果是个体会员生成个体会员详细信息表记录，如果是企业会员，生成企业会员详细信息记录) 
     * @param  @param shipperMember
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    public Object addShipperMemberReception(ShipperMember shipperMember){  
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        //判断是否已经成功注册，如果成功注册，则提示已经注册信息，跳转到登录页面
        ShipperMember shipperMemberTemp = new ShipperMember();
        shipperMemberTemp = shipperMemberMapper.selectByMemberName(shipperMember.getMemberName());
        if (shipperMemberTemp != null){
            returnResult.setSuccess(true);
            returnResult.setMsg("您已经注册成功，请登录。");
            return returnResult;
        }
        int count = 0;
        int countToken = 0;
        String shipperMemberId = RandomGUID.getRandomGUID();  
        //设置shipperMembertoken信息
        ShipperMemberToken shipperMemberToken = new ShipperMemberToken();
        shipperMemberToken.setMemberId(shipperMemberId);
        shipperMemberToken.setMemberName(shipperMember.getMemberName());
        shipperMemberToken.setPassword(shipperMember.getMemberPassword()); 
        this.entryptPassword(shipperMemberToken); 
        //增加会员信息 
        shipperMember.setMemberId(shipperMemberId);
        shipperMember.setMemberPassword(shipperMemberToken.getPassword()); 
        shipperMember.setStatus("enable");
        BigDecimal accountBalance =new BigDecimal("0");
        shipperMember.setAccountBalance(accountBalance);
        shipperMember.setIntegral(0);
        shipperMember.setRegistrationTime(new Date());
        shipperMember.setLastLoginTime(new Date());
        shipperMember.setLoginCount(1); 
        shipperMember.setMemberPhoto("http://bdmu.v068041.10000net.cn/netloan-website/resources/images/shipperMember/shipperMember.jpg");//会员注册后的默认头像
        shipperMember.setRemark("货主会员创建帐号");
        shipperMember.setCreater("超级管理员");
        shipperMember.setCreateTime(new Date());
        shipperMember.setUpdater("超级管理员");
        shipperMember.setUpdateTime(new Date());
        shipperMember.setTradersPassword(shipperMemberToken.getPassword());//会员交易密码
        count = shipperMemberMapper.insert(shipperMember); 
        //增加shipperMembertoken信息 要先增加shipperMember记录，才能再生成外键表的记录
        shipperMemberToken.setTradersSalt(shipperMemberToken.getSalt());
        shipperMemberToken.setTradersPassword(shipperMemberToken.getPassword());//交易密码
        countToken = shipperMemberTokenMapper.insert(shipperMemberToken); 
        //判断会员类型，如果是个体会员生成个体会员详细信息表记录，如果是企业会员，生成企业会员详细信息记录
        if (shipperMember.getMemberType().equals("enterprise")) {//企业会员，生成企业会员详细信息shipper_enterprise_member
            ShipperEnterpriseMember shipperEnterpriseMember = new ShipperEnterpriseMember();
            shipperEnterpriseMember.setMemberId(shipperMemberId);
            shipperEnterpriseMember.setAuthState("authstr");
            shipperEnterpriseMemberMapper.insert(shipperEnterpriseMember);
        } else {//个体会员，生成个体会员详细信息
            ShipperIndividualityMember shipperIndividualityMember = new ShipperIndividualityMember();
            shipperIndividualityMember.setMemberId(shipperMemberId);
            shipperIndividualityMemberMapper.insert(shipperIndividualityMember);
        }
        //判断增加信息是否成功，成功返回成功提示信息
        if (count == 1 && countToken == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + shipperMember.getMemberName() + "] 会员信息已保存");
            returnResult.setObj(shipperMember);
        } else {
            returnResult.setMsg("发生未知错误，会员信息保存失败");
        }
        return returnResult;
    }
    /**
     * @Title: editMemberPhotoReception 
     * @Description: TODO(上传个人头像) 
     * @param  @param member
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    public Object editMemberPhotoReception(ShipperMember shipperMember){
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        int count = 0;
        //会员表的修改
        shipperMember.setUpdater("超级管理员");
        shipperMember.setUpdateTime(new Date());
        count = shipperMemberMapper.updateByPrimaryKeySelective(shipperMember); 
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("个人头像保存成功");
        } else {
            returnResult.setMsg("发生未知错误，个人头像上传失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: retrievePassword 
     * @Description: TODO(会员忘记密码通过邮箱找回密码，设置新密码) 
     * @param @param member
     * @param @param  
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public Object setNewPassword(String email,String newPassword) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ShipperMemberExample shipperMemberExample = new ShipperMemberExample();
        shipperMemberExample.createCriteria().andEmailEqualTo(email);
        List<ShipperMember> list=new ArrayList<ShipperMember>();
        list  = shipperMemberMapper.selectByExample(shipperMemberExample);
        ShipperMember member=list.get(0);
        int countMT=0;
        int count=0;
       if(member==null||newPassword.equals("")){ 
           returnResult.setMsg("会话失效，请重新发邮件找回密码"); 
       }else{ 
            returnResult.setSuccess(true); 
            ShipperMemberToken mt = shipperMemberTokenMapper.selectByPrimaryKey(member.getMemberId());//通过memberId获取memberToken
            //将前台传来的密码进行加密，
            mt.setPassword(newPassword);
            this.updateentryptPassword(mt);
            //更新member和memberToken
            member.setMemberPassword(mt.getPassword());
            countMT = shipperMemberTokenMapper.updateByPrimaryKeySelective(mt);
            count = shipperMemberMapper.updateByPrimaryKeySelective(member);
            if(count ==1 && countMT == 1){
                returnResult.setSuccess(true);
                returnResult.setMsg("密码修改成功！");
            }else{
                returnResult.setMsg("密码修改失败！");
            } 
       }
        return returnResult;
    }
    
    private void updateentryptPassword(ShipperMemberToken shipperMemberToken) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        shipperMemberToken.setSalt(Encodes.encodeHex(salt));
        byte[] hashPassword = Digests.sha1(shipperMemberToken.getPassword().getBytes(), salt, HASH_INTERATIONS);
        shipperMemberToken.setPassword(Encodes.encodeHex(hashPassword));
    }
    
   /**
    * @Title: addProInfo 
    * @Description: TODO(会员忘记密码通过邮箱找回密码，设置新密码) 
    * @param @param member
    * @param @param  
    * @param @return    设定文件 
    * @return Object    返回类型 
    * @throws
    */
   @Transactional(readOnly = false) 
    public Object addProInfo(ShipperIndividualityMember shipperIndividualityMember,int mobileValidate,int mobile_true) {
    	JqReturnJson returnResult=new JqReturnJson();
    	if(mobileValidate!=mobile_true){
    		returnResult.setMsg("验证码错误，请重新填写!");
    	}else{
    		int count=shipperIndividualityMemberMapper.updateByPrimaryKeySelective(shipperIndividualityMember);
    		if(count>0){
    			returnResult.setSuccess(true);
    			returnResult.setMsg("信息更新成功!");
    		}else{
    			returnResult.setMsg("信息更新失败吗,请联系管理员!");
    		}
    	}
    	return returnResult;    
    }
}
