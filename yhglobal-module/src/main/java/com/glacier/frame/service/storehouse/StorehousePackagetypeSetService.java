/**
 * @Title: StorehousePackagetypeSetService.java 
 * @Package com.glacier.global.service.StorehousePackagetypeSet
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2014-10-14
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.storehouse; 
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
import com.glacier.frame.dao.storehouse.StorehousePackCodeMapper;
import com.glacier.frame.dao.storehouse.StorehousePackagetypeSetMapper;
import com.glacier.frame.dto.query.storehouse.StorehousePackagetypeSetQueryDTO;
import com.glacier.frame.entity.storehouse.StorehousePackCodeExample;
import com.glacier.frame.entity.storehouse.StorehousePackagetypeSet;
import com.glacier.frame.entity.storehouse.StorehousePackagetypeSetExample;
import com.glacier.frame.entity.storehouse.StorehousePackagetypeSetExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
/*** 
 * @ClassName:  StorehousePackagetypeSetService
 * @Description: TODO(包装类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class StorehousePackagetypeSetService {

	@Autowired
	private StorehousePackagetypeSetMapper packagetypeSetMapper;
	
	@Autowired
	private StorehousePackCodeMapper packCodeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有包装类型信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, StorehousePackagetypeSetQueryDTO packagetypeSetQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        StorehousePackagetypeSetExample packagetypeSetExample = new StorehousePackagetypeSetExample(); 
        Criteria queryCriteria = packagetypeSetExample.createCriteria();
        packagetypeSetQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	packagetypeSetExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	packagetypeSetExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	packagetypeSetExample.setOrderByClause(jqPager.getOrderBy("temp_storehouse_packagetype_set_"));
        }
        List<StorehousePackagetypeSet> packagetypeSetTypeList = packagetypeSetMapper.selectByExample(packagetypeSetExample); // 查询所有会员列表
        int total = packagetypeSetMapper.countByExample(packagetypeSetExample); // 查询总页数
        returnResult.setRows(packagetypeSetTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getPackagetype 
	 * @Description: TODO(根据包装类型Id获取包装类型信息) 
	 * @param @param packagetypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getPackagetype(String packagetypeId) {
    	StorehousePackagetypeSet carrierCarType = packagetypeSetMapper.selectByPrimaryKey(packagetypeId);
        return carrierCarType;
    }
    
    /**
     * @Title: addPackagetype 
     * @Description: TODO(新增包装类型) 
     * @param @param packagetype
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addPackagetype(StorehousePackagetypeSet packagetype) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehousePackagetypeSetExample packagetypeSetExample = new StorehousePackagetypeSetExample(); 
        int count = 0;
        // 防止包装类型名称重复
        packagetypeSetExample.createCriteria().andPackagetypeNameEqualTo(packagetype.getPackagetypeName());
        count = packagetypeSetMapper.countByExample(packagetypeSetExample);
        if (count > 0) {
            returnResult.setMsg("包装类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        packagetype.setPackagetypeId(RandomGUID.getRandomGUID());
        packagetype.setCreater(pricipalUser.getUserId());
        packagetype.setCreateTime(new Date());
        packagetype.setUpdater(pricipalUser.getUserId());
        packagetype.setUpdateTime(new Date());
        count = packagetypeSetMapper.insert(packagetype);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + packagetype.getPackagetypeName() + "] 包装类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，包装类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editPackagetype 
     * @Description: TODO(修改包装类型信息) 
     * @param @param packagetype
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editPackagetype(StorehousePackagetypeSet packagetype) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehousePackagetypeSetExample packagetypeSetExample = new StorehousePackagetypeSetExample(); 
        int count = 0;
        // 防止包装类型名称重复
        packagetypeSetExample.createCriteria().andPackagetypeNameEqualTo(packagetype.getPackagetypeName()).andPackagetypeIdNotEqualTo(packagetype.getPackagetypeId());
        count = packagetypeSetMapper.countByExample(packagetypeSetExample);
        if (count > 0) {
            returnResult.setMsg("包装类型名称重复");
            return returnResult;
        }
        //根据ID获取承运商信誉等级信息
        StorehousePackagetypeSet packagetypeTime = (StorehousePackagetypeSet) getPackagetype(packagetype.getPackagetypeId());
        packagetype.setCreater(packagetypeTime.getCreater());
        packagetype.setCreateTime(packagetypeTime.getCreateTime());
        packagetype.setUpdater(pricipalUser.getUserId());
        packagetype.setUpdateTime(new Date());
        count = packagetypeSetMapper.updateByPrimaryKey(packagetype);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + packagetype.getPackagetypeName() + "] 包装类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，包装类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delPackagetype
     * @Description: TODO(删除包装类型) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delPackagetype(List<String> packagetypeIds, List<String> packagetypeName) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        // 定义删除成功数据行数量
        int rightNumber = 0;
        // 定义返回结果
        String result_str = ""; 
        // 定义是否显示提示
        boolean isFlag = true;
        //数据行长度判断
        if (packagetypeIds.size() > 0) { 
           //匹配删除信息
           for (int i = 0; i < packagetypeIds.size(); i++) {  
                 // 相关联充值记录
        		StorehousePackCodeExample packageExample = new StorehousePackCodeExample();
        		packageExample.createCriteria().andPackagetypeIdEqualTo(packagetypeIds.get(i));
        		int count = packCodeMapper.countByExample(packageExample);
                // 判断是否关联
        		if (count <= 0) { 
        			StorehousePackagetypeSetExample packagetypeSetExample = new StorehousePackagetypeSetExample();
        			packagetypeSetExample.createCriteria().andPackagetypeIdEqualTo(packagetypeIds.get(i));
        		      int number = packagetypeSetMapper.deleteByExample(packagetypeSetExample);
        	          rightNumber += number;// 删除成功数据行数量记录 
                 } else { 
                       if(isFlag){ 
        				if(count > 0){
        					result_str=" 数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) +"】</font>条记录与" + "【包装类型】存在<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖关系," + "须删除【包装类型】中<font style='color:red;font-weight: bold;'>【"+ count + "】</font>条依赖数据    ";
        					isFlag = false;
        					} 
                        }  
                       }
        			}
        		// 删除成功数量大于0即为操作成功,且提示关联信息
        		if(rightNumber>0){
        			returnResult.setMsg("成功删除<font style='color:red;font-weight: bold;'>【"+ rightNumber +"】</font> 条数据," +result_str);
        			returnResult.setSuccess(true);
        		}else{
        			returnResult.setMsg(result_str.trim());
        			returnResult.setSuccess(false);
        		     }
        	   }
        return returnResult;
    }
}
