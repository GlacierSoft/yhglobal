/**
 * @Title: StorehousePackCodeService.java 
 * @Package com.glacier.global.service.StorehousePackCode
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.frame.dao.storehouse.StorehousePackCodeMapper;
import com.glacier.frame.entity.storehouse.StorehousePackCode;

/*** 
 * @ClassName:  StorehousePackCodeService
 * @Description: TODO(packCode表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class StorehousePackCodeService {

	
	@Autowired
	private StorehousePackCodeMapper packcodeMapper;
    
	/**
	 * @Title: getpackCode
	 * @Description: TODO(根据货物Id获取packCode信息) 
	 * @param @param belaidupId
	 * @param @return    设定文件 
	 * @return Object    返回 
	 * @throws
	 */
    public Object getPackCode(String belaidupId) {
    	StorehousePackCode packCode = packcodeMapper.selectByBelaidup(belaidupId);
        return packCode;
    }
    
    
}
