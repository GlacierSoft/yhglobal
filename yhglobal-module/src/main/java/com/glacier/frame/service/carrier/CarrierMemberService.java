/**
 * @Title: CarrierMemberService.java 
 * @Package com.glacier.global.service.carrier
 * @author songjundong   
 * @email 985776597@qq.com
 * @date 2014-10-11 下午1:40:53
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：songjundong
 * 
 */
package com.glacier.frame.service.carrier; 
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
import com.glacier.frame.dao.carrier.CarrierEnterpriserMemberMapper;
import com.glacier.frame.dao.carrier.CarrierIndividualityMemberMapper;
import com.glacier.frame.dao.carrier.CarrierMemberMapper;
import com.glacier.frame.dao.carrier.CarrierMemberTokenMapper;
import com.glacier.frame.dto.query.carrier.CarrierMemberQueryDTO;
import com.glacier.frame.entity.carrier.CarrierEnterpriserMember;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.carrier.CarrierMemberExample;
import com.glacier.frame.entity.carrier.CarrierMemberExample.Criteria;
import com.glacier.frame.entity.carrier.CarrierMemberToken;
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.security.util.Digests;
import com.glacier.security.util.Encodes;
/*** 
 * @ClassName:  CarrierMemberService
 * @Description: TODO(承运商会员表业务类)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-10-11 下午1:40:53
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class CarrierMemberService {

	@Autowired
	private CarrierMemberMapper carrierMemberMapper;
	
	@Autowired
	private CarrierEnterpriserMemberMapper carrierEnterpriserMemberMapper;
    
	@Autowired
	private CarrierIndividualityMemberMapper carrierIndividualityMemberMapper;

	@Autowired
    private CarrierMemberTokenMapper carrierMemberTokenMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
    public Object listAsGrid(JqPager jqPager, CarrierMemberQueryDTO memberQueryDTO, String q) {
        JqGridReturn returnResult = new JqGridReturn();
        CarrierMemberExample memberExample = new CarrierMemberExample(); 
        Criteria queryCriteria = memberExample.createCriteria();
        memberQueryDTO.setQueryCondition(queryCriteria, q); 
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	memberExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	memberExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	memberExample.setOrderByClause(jqPager.getOrderBy("temp_carrier_member_"));
        }
        List<CarrierMember>  shippermembers = carrierMemberMapper.selectByExample(memberExample); // 查询所有会员列表
        int total = carrierMemberMapper.countByExample(memberExample); // 查询总页数
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
    	CarrierMember member = carrierMemberMapper.selectByPrimaryKey(memberId);
    	list.add(member);
    	 //根据会员类型，获取对应的数据，如果是个体会员，则查询个体的相关数据
    	if(member.getMemberType().equals("enterprise")){ //企业会员
    		list.add(carrierEnterpriserMemberMapper.selectByPrimaryKey(memberId));
    	}else{ //个体会员
    		list.add(carrierIndividualityMemberMapper.selectByPrimaryKey(memberId));
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
    public CarrierMember getShipperMember(String memberId) {
    	CarrierMember carrierMember = carrierMemberMapper.selectByPrimaryKey(memberId);
        return carrierMember;
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
    public Object upStatus(String carrierMemberId){
    	 JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	 CarrierMember carrierMember= carrierMemberMapper.selectByPrimaryKey(carrierMemberId);
    	 if(carrierMember.getStatus().equals("enable")){
    		 carrierMember.setStatus("disable");
    	 }else{
    		 carrierMember.setStatus("enable");
    	 } 
    	 int count = carrierMemberMapper.updateByPrimaryKeySelective(carrierMember);
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
     * @Description: TODO(审核承运商信息) 
     * @param @param shipperEnterpriseMember
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public Object audit(CarrierMember carrierMember) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        CarrierMember enterpriseMember = carrierMemberMapper.selectByPrimaryKey(carrierMember.getCarrierMemberId());
        if(enterpriseMember.getAuditState().equals("authstr")==false){
        	returnResult.setMsg("该会员已进行过审核，不可重复操作");
       	    return returnResult;
        }
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject(); 
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        carrierMember.setAudit(pricipalUser.getUserId());
        carrierMember.setAuditTime(new Date());
        carrierMember.setUpdater(pricipalUser.getUserId()); 
        carrierMember.setUpdateTime(new Date());
        count = carrierMemberMapper.updateByPrimaryKeySelective(carrierMember);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员【"+enterpriseMember.getMemberName()+"】审核操作成功");
        } else {
            returnResult.setMsg("发生未知错误，企业信息审核失败");
        }
        return returnResult;
    } 
    
    /**
     * @Title: enterpriserAudit 
     * @Description: TODO(认证承运商信息) 
     * @param @param carrierEnterpriserMember
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false) 
    public Object enterpriserAudit(CarrierEnterpriserMember carrierEnterpriserMember) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        CarrierEnterpriserMember enterpriserMember = carrierEnterpriserMemberMapper.selectByPrimaryKey(carrierEnterpriserMember.getCarrierMemberId());
        CarrierMember carrierMember=carrierMemberMapper.selectByPrimaryKey(carrierEnterpriserMember.getCarrierMemberId());
        if(carrierMember.getAuditState().equals("pass")==false){
        	returnResult.setMsg("该企业未审核，或者审核未通过，不可进行认证操作!");
       	    return returnResult;
        } 
        if(enterpriserMember.getAuthState().equals("authstr")==false){
        	returnResult.setMsg("该企业已进行过认证，不可重复操作");
       	    return returnResult;
        }
        int count = 0; 
        Subject pricipalSubject = SecurityUtils.getSubject(); 
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        carrierEnterpriserMember.setAuth(pricipalUser.getUserId());
        carrierEnterpriserMember.setAuthTime(new Date()); 
        count = carrierEnterpriserMemberMapper.updateByPrimaryKeySelective(carrierEnterpriserMember);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("企业【"+enterpriserMember.getEnterpriseName()+"】认证操作成功");
        } else {
            returnResult.setMsg("发生未知错误，企业信息认证失败");
        }
        return returnResult;
    } 
    
    /**
     * @Title: getMember 
     * @Description: TODO(根据会员Id获取会员信息) 
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public CarrierMember getCarrierMember(String memberId) {
        CarrierMember carrierMember = carrierMemberMapper.selectByPrimaryKey(memberId);
        return carrierMember;
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
    private void entryptPassword(CarrierMemberToken carrierMemberToken) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        carrierMemberToken.setSalt(Encodes.encodeHex(salt));
        byte[] hashPassword = Digests.sha1(carrierMemberToken.getPassword().getBytes(), salt, HASH_INTERATIONS);
        carrierMemberToken.setPassword(Encodes.encodeHex(hashPassword));
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
    public CarrierMember retrieveEmail(String email) {  
        CarrierMemberExample carrierMemberExample = new CarrierMemberExample();
        carrierMemberExample.createCriteria().andEmailEqualTo(email);
        List<CarrierMember> carrierMemberlist= carrierMemberMapper.selectByExample(carrierMemberExample); 
        //如果取出来的是没数据的，就返回null,否则就把集合里的第一条数据返回
        return carrierMemberlist.size()==0?null:carrierMemberlist.get(0);
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
    public CarrierMember retrieveName(String name) {  
        CarrierMemberExample carrierMemberExample = new CarrierMemberExample();
        carrierMemberExample.createCriteria().andMemberNameEqualTo(name);
        List<CarrierMember> carrierMemberlist= carrierMemberMapper.selectByExample(carrierMemberExample); 
        //如果取出来的是没数据的，就返回null,否则就把集合里的第一条数据返回
        return carrierMemberlist.size()==0?null:carrierMemberlist.get(0);
    }
    
    /**
     * @Title: isUsernameRepeat 
     * @Description: TODO(判断会员名是否重复) 
     * @param  @param carrierCarrierMember
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object isUsernameRepeat(CarrierMember carrierCarrierMember){
          JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
          CarrierMemberExample carrierCarrierMemberExample = new CarrierMemberExample();
          // 防止会员名称重复
          carrierCarrierMemberExample.createCriteria().andMemberNameEqualTo(carrierCarrierMember.getMemberName());
          int count = carrierMemberMapper.countByExample(carrierCarrierMemberExample);// 查找相同名称的会员数量
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
     * @param  @param carrierCarrierMember
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object isEmailRepeat(CarrierMember carrierMember){
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        CarrierMemberExample carrierMemberExample = new CarrierMemberExample();
        // 防止邮箱重复
        carrierMemberExample.createCriteria().andEmailEqualTo(carrierMember.getEmail());
        int count = carrierMemberMapper.countByExample(carrierMemberExample);// 查找相同邮箱的会员数量
        if (count > 0) {
            returnResult.setMsg("该邮箱已注册！");
        }else{
          returnResult.setSuccess(true);
        }
        return returnResult;
    }
    
    /**
     * @Title: addCarrierMemberReception 
     * @Description: TODO(前台注册会员，生成会员信息和会员盐值记录) 
     * @param  @param carrierMember
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    public Object addCarrierMemberReception(CarrierMember carrierMember){  
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        //判断是否已经成功注册，如果成功注册，则提示已经注册信息，跳转到登录页面
        CarrierMember carrierMemberTemp = new CarrierMember();
        carrierMemberTemp = carrierMemberMapper.selectByMemberName(carrierMember.getMemberName());
        if (carrierMemberTemp != null){
            returnResult.setSuccess(true);
            returnResult.setMsg("您已经注册成功，请登录。");
            return returnResult;
        }
        int count = 0;
        int countToken = 0;
        String carrierMemberId = RandomGUID.getRandomGUID();  
        //设置carrierMembertoken信息
        CarrierMemberToken carrierMemberToken = new CarrierMemberToken();
        carrierMemberToken.setCarrierMemberId(carrierMemberId);
        carrierMemberToken.setMemberName(carrierMember.getMemberName());
        carrierMemberToken.setPassword(carrierMember.getMemberPassword()); 
        this.entryptPassword(carrierMemberToken); 
        //增加会员信息 
        carrierMember.setCarrierMemberId(carrierMemberId);
        carrierMember.setMemberPassword(carrierMemberToken.getPassword()); 
        carrierMember.setStatus("enable");
        carrierMember.setLoginCount(0);
        BigDecimal creditLimit = new BigDecimal("0");
        carrierMember.setCreditLimit(creditLimit);
        carrierMember.setCreditworthiness(0);
        carrierMember.setRegistrationTime(new Date());
        carrierMember.setLastLoginTime(new Date());
        carrierMember.setLoginCount(1); 
        BigDecimal surplusMonney = new BigDecimal("0");
        carrierMember.setSurplusMonney(surplusMonney);
        carrierMember.setDeliverSuccess(0);
        carrierMember.setDeliverFail(0);
        carrierMember.setAuditState("authstr");
        carrierMember.setMemberPhoto("http://bdmu.v068041.10000net.cn/netloan-website/resources/images/carrierMember/carrierMember.jpg");//会员注册后的默认头像
        carrierMember.setRemark("承运商创建帐号");
        carrierMember.setCreater("超级管理员");
        carrierMember.setCreateTime(new Date());
        carrierMember.setUpdater("超级管理员");
        carrierMember.setUpdateTime(new Date());
        carrierMember.setTradersPassword(carrierMemberToken.getPassword());//会员交易密码
        count = carrierMemberMapper.insert(carrierMember); 
        //增加carrierMembertoken信息 要先增加carrierMember记录，才能再生成外键表的记录
        carrierMemberToken.setTradersSalt(carrierMemberToken.getSalt());
        carrierMemberToken.setTradersPassword(carrierMemberToken.getPassword());//交易密码
        countToken = carrierMemberTokenMapper.insert(carrierMemberToken); 
        //判断增加信息是否成功，成功返回成功提示信息
        if (count == 1 && countToken == 1) {
            
            //注册成功，自动赋值菜单
            
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + carrierMember.getMemberName() + "] 会员信息已保存");
            returnResult.setObj(carrierMember);
        } else {
            returnResult.setMsg("发生未知错误，会员信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: modifyPsd 
     * @Description: TODO(修改承运商密码方法) 
     * @param  @param oldPassword
     * @param  @param newPassword
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    @Transactional(readOnly = false)
    public Object modifyPsd(String oldPassword,String memberPassword){
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        CarrierMember principalCarrier = (CarrierMember) SecurityUtils.getSubject().getPrincipal();// 获取通过认证用户
        CarrierMemberToken cToken = carrierMemberTokenMapper.selectByPrimaryKey(principalCarrier.getCarrierMemberId());//通过承运商Id查找Token
        //将前台传来的密码进行加密，
        byte[] salt = Encodes.decodeHex(cToken.getSalt());
        byte[] hashPassword = Digests.sha1(oldPassword.getBytes(), salt, HASH_INTERATIONS);
        String encodeHexPwd = Encodes.encodeHex(hashPassword);
        int count = 0;
        int countMT = 0; 
        //将加密后的密码和存在数据库里的密码进行比较。
        if ((principalCarrier.getMemberPassword()).equals(encodeHexPwd)) {
            //会员表的修改
            principalCarrier.setUpdater(principalCarrier.getCarrierMemberId());
            principalCarrier.setUpdateTime(new Date());
            cToken.setPassword(memberPassword);
            //将新密码进行加密
            this.updatePassword(cToken);
            //更新member和memberToken 
            principalCarrier.setMemberPassword(cToken.getPassword());
            countMT = carrierMemberTokenMapper.updateByPrimaryKeySelective(cToken);
            count = carrierMemberMapper.updateByPrimaryKeySelective(principalCarrier);
            if(count ==1 && countMT==1){
                returnResult.setSuccess(true);
                returnResult.setMsg("密码修改成功！");
            }else{
                returnResult.setMsg("密码修改失败！");
            }
        }else{
          returnResult.setMsg("原密码不正确！");
        }  
        return returnResult;
    }
    
    /**
     * @Title: updatePassword 
     * @Description: TODO(加密新密码) 
     * @param  @param cToken
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    private void updatePassword(CarrierMemberToken cToken) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        cToken.setSalt(Encodes.encodeHex(salt));
        byte[] hashPassword = Digests.sha1(cToken.getPassword().getBytes(), salt, HASH_INTERATIONS);
        cToken.setPassword(Encodes.encodeHex(hashPassword));
    }
}
