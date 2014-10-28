/**
 * @author xichao.dong   
 * @email 406592176@qq.com
 * @date 2014-8-15 上午8:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) : 2014-8-15 上午8:50:38  xichao.dong 
 * @Review (审核人) ：xichao.dong 
 */
package com.glacier.frame.web.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: indexController 
 * @Description: TODO(公用控制器) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-10-28 上午9:33:46
 */
@Controller
@RequestMapping(value="/index")
public class indexController {
    
    @RequestMapping(value = "/center", method = RequestMethod.GET)
    public Object intoIndex() {
        
        ModelAndView mav = new ModelAndView("layout/center");
        return mav;
    }
}
