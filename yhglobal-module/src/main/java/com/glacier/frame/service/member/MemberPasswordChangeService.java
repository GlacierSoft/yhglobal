/**
 * @Title: MemberPasswordChange.java 
 * @Package com.glacier.frame.service.member 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-12-2 下午1:55:57 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-12-2
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.service.member;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.member.ShipperMemberMapper;
import com.glacier.frame.dao.member.ShipperMemberTokenMapper;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.member.ShipperMemberToken;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.security.util.Digests;
import com.glacier.security.util.Encodes;

/**
 * @ClassName: MemberPasswordChange 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-12-2 下午1:55:57
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MemberPasswordChangeService {
   
	@Autowired
	private ShipperMemberMapper shipperMemberMapper;
	
	@Autowired
	private ShipperMemberTokenMapper shipperMemberTokenMapper;
	
	/**
     * @Title: modifyPsd 
     * @Description: TODO(修改用户密码方法) 
     * @param  @param oldPassword
     * @param  @param newPassword
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
	
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
	 public static final int SALT_SIZE =8;
	
	@Transactional(readOnly = false)
    public Object modifyPsd(String oldPassword, String newPassword) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ShipperMember pricipalMember= (ShipperMember) SecurityUtils.getSubject().getPrincipal();//获取当前认证用户
        pricipalMember = shipperMemberMapper.selectByPrimaryKey(pricipalMember.getMemberId());// 获取通过认证用户最新信息，防止更新出错
        ShipperMemberToken shipperMemberToken=shipperMemberTokenMapper.selectByPrimaryKey(pricipalMember.getMemberId()); 
        byte[] salt = Encodes.decodeHex(shipperMemberToken.getSalt());// 对盐值进行解密
        byte[] hashPassword = Digests.sha1(oldPassword.getBytes(), salt, HASH_INTERATIONS);// 对通过输入的密码进行重新加密
        if (Encodes.encodeHex(hashPassword).equals(shipperMemberToken.getPassword())) {// 比较用户输入的密码和原密码是否一致
        	ShipperMemberToken ShipperMemberTokenSeconde=new ShipperMemberToken();
        	ShipperMemberTokenSeconde.setMemberId(shipperMemberToken.getMemberId());
        	ShipperMemberTokenSeconde.setPassword(newPassword);
            this.entryptPassword(ShipperMemberTokenSeconde);
            int count = shipperMemberTokenMapper.updateByPrimaryKeySelective(ShipperMemberTokenSeconde);
            if (count == 1) {
            	pricipalMember.setMemberPassword(shipperMemberToken.getPassword());
                 int countSecond=shipperMemberMapper.updateByPrimaryKeySelective(pricipalMember);
                		 if(countSecond==1){
                			 returnResult.setMsg("用户登录密码已修改!");
                             returnResult.setSuccess(true);
                		 }else{
                			 returnResult.setMsg("发生未知错误，用户登录密码修改失败!");
                		 }
            } else {
                returnResult.setMsg("发生未知错误，用户登录密码修改失败!");
            }

        } else {
            returnResult.setMsg("原用户登录密码错误，请正确填写!");
        }
        return returnResult;
    }
	
	 /**
     * @Title: entryptPassword  
     * @Description: TODO(设定盐值和设定安全的密码，生成随机的salt并经过1024次 sha-1 hash)  
     * @param @param user    设定文件  
     * @return void    返回类型  
     * @throws
     */
    private void entryptPassword(ShipperMemberToken shipperMemberToken) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        shipperMemberToken.setSalt(Encodes.encodeHex(salt));
        byte[] hashPassword = Digests.sha1(shipperMemberToken.getPassword().getBytes(), salt, HASH_INTERATIONS);
        shipperMemberToken.setPassword(Encodes.encodeHex(hashPassword));
    }
    
    /**
     * @Title: modifyPsd 
     * @Description: TODO(修改用户密码方法) 
     * @param  @param oldPassword
     * @param  @param newPassword
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    @Transactional(readOnly = false)
    public Object modifyChargePsd(String oldPassword, String newPassword) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ShipperMember pricipalMember= (ShipperMember) SecurityUtils.getSubject().getPrincipal();//获取当前认证用户
        pricipalMember = shipperMemberMapper.selectByPrimaryKey(pricipalMember.getMemberId());// 获取通过认证用户最新信息，防止更新出错
        ShipperMemberToken shipperMemberToken=shipperMemberTokenMapper.selectByPrimaryKey(pricipalMember.getMemberId()); 
        byte[] tradersSalt = Encodes.decodeHex(shipperMemberToken.getTradersSalt());// 对盐值进行解密
        byte[] hashPassword = Digests.sha1(oldPassword.getBytes(), tradersSalt, HASH_INTERATIONS);// 对通过输入的密码进行重新加密
        if (Encodes.encodeHex(hashPassword).equals(shipperMemberToken.getTradersPassword())) {// 比较用户输入的密码和原密码是否一致
        	ShipperMemberToken ShipperMemberTokenSeconde=new ShipperMemberToken();
        	ShipperMemberTokenSeconde.setMemberId(shipperMemberToken.getMemberId());
        	ShipperMemberTokenSeconde.setTradersPassword(newPassword);
            this.entryptChargePassword(ShipperMemberTokenSeconde);
            int count = shipperMemberTokenMapper.updateByPrimaryKeySelective(ShipperMemberTokenSeconde);
            if (count == 1) {
            	pricipalMember.setTradersPassword(shipperMemberToken.getTradersPassword());
                 int countSecond=shipperMemberMapper.updateByPrimaryKeySelective(pricipalMember);
                		 if(countSecond==1){
                			 returnResult.setMsg("用户交易密码已修改!");
                             returnResult.setSuccess(true);
                		 }else{
                			 returnResult.setMsg("发生未知错误，用户交易密码修改失败!");
                		 }
            } else {
                returnResult.setMsg("发生未知错误，用户交易密码修改失败!");
            }

        } else {
            returnResult.setMsg("原用户交易密码错误，请正确填写!");
        }
        return returnResult;
    }
	
    /**
     * @Title: entryptPassword  
     * @Description: TODO(设定盐值和设定安全的密码，生成随机的salt并经过1024次 sha-1 hash)  
     * @param @param user    设定文件  
     * @return void    返回类型  
     * @throws
     */
    private void entryptChargePassword(ShipperMemberToken shipperMemberToken) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        shipperMemberToken.setTradersSalt(Encodes.encodeHex(salt));
        byte[] hashPassword = Digests.sha1(shipperMemberToken.getTradersPassword().getBytes(), salt, HASH_INTERATIONS);
        shipperMemberToken.setTradersPassword(Encodes.encodeHex(hashPassword));
    }
}
