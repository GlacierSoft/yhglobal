/**
 * @Title: FinaceRechargeMemberServices.java 
 * @Package com.glacier.frame.service.finace 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-28 上午9:54:48 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-28
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.service.finace;

import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.glacier.frame.dao.finace.FinaceRechargeMemberMapper;
import com.glacier.frame.dto.query.finace.FinaceRechargeMemberQueryDTO;
import com.glacier.frame.entity.finace.FinaceRechargeMember;
import com.glacier.frame.entity.finace.FinaceRechargeMemberExample;
import com.glacier.frame.entity.finace.FinaceRechargeMemberExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: FinaceRechargeMemberServices 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-28 上午9:54:48
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class FinaceRechargeMemberService {
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员记录信息) 
     * @param @param padvertisementr,finaceRechargeMemberQueryDTO,q
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	@Autowired
	private FinaceRechargeMemberMapper finaceRechargeMemberMapper;
	
	
	public Object listAsGrid(JqPager jqPager, FinaceRechargeMemberQueryDTO finaceRechargeMemberQueryDTO, String q) {
	    JqGridReturn returnResult = new JqGridReturn();
	    FinaceRechargeMemberExample finaceRechargeMemberExample = new FinaceRechargeMemberExample();
	    Criteria queryCriteria = finaceRechargeMemberExample.createCriteria();
	    finaceRechargeMemberQueryDTO.setQueryCondition(queryCriteria, q);
	    if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
	    	finaceRechargeMemberExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
	    	finaceRechargeMemberExample.setLimitEnd(jqPager.getRows());
	    }
	    if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
	    	finaceRechargeMemberExample.setOrderByClause(jqPager.getOrderBy("temp_finace_recharge_member_"));
	    }
	    List<FinaceRechargeMember>  finaceRechargeMembers = finaceRechargeMemberMapper.selectByExample(finaceRechargeMemberExample); // 查询所有广告列表
	    int total = finaceRechargeMemberMapper.countByExample(finaceRechargeMemberExample); // 查询总页数
	    returnResult.setRows(finaceRechargeMembers);
	    returnResult.setTotal(total);
	    return returnResult;// 返回ExtGrid表
	 }
	
	
	public Object getFinaceRechargeMemberPro(String rechargeId){
      return finaceRechargeMemberMapper.selectByPrimaryKey(rechargeId); 
	}
	
public HSSFWorkbook export(List<FinaceRechargeMember> list) {
		
		//定义导出变量
		String[] excelHeader = { "充值编号", "充值名称", "充值金额", "优惠金额", "手续费","返现金额", "到账金额","取费方式", "充值方式", "充值会员","创建人", "创建时间" };
		int[] excelHeaderWidth = { 100, 100, 100, 150, 100,150, 100, 100,100, 100,100,100 };
		
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("会员充值报表统计");
		HSSFRow row = sheet.createRow((int) 0);
		
		// 生成一个样式  
       HSSFCellStyle style = wb.createCellStyle();  
       //设置这些样式  
       style.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);  
       style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);  
       style.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
       style.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
       style.setBorderRight(HSSFCellStyle.BORDER_THIN);  
       style.setBorderTop(HSSFCellStyle.BORDER_THIN);  
       style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
       // 生成另一个字体  
       HSSFFont font= wb.createFont();  
       font.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);  
       // 把字体应用到当前的样式  
       style.setFont(font); 
       
       HSSFCellStyle style2 = wb.createCellStyle();  
       style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
       style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
       style2.setBorderRight(HSSFCellStyle.BORDER_THIN);  
       style2.setBorderTop(HSSFCellStyle.BORDER_THIN);  
       style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
       style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); 
		
		for (int i = 0; i < excelHeader.length; i++) {
			HSSFCell cell = row.createCell(i);
			cell.setCellValue(excelHeader[i]);
			cell.setCellStyle(style);
			sheet.autoSizeColumn(i);
		}
		
		// 设置列宽度（像素）
		for (int i = 0; i < excelHeaderWidth.length; i++) {
			sheet.setColumnWidth(i, 32 * excelHeaderWidth[i]);
		}
		
	    if(list.size()>0){
			//遍历信息
			for (int i = 0; i < list.size(); i++) {
				//获取列值
				FinaceRechargeMember contract = list.get(i);
				//创建列
				HSSFRow row_two=sheet.createRow(i + 1);
				HSSFCell cell_Zero = row_two.createCell(0);
				HSSFCell cell_One = row_two.createCell(1);
				HSSFCell cell_Two = row_two.createCell(2);
				HSSFCell cell_Three = row_two.createCell(3);
				HSSFCell cell_Four = row_two.createCell(4);
				HSSFCell cell_Five = row_two.createCell(5);
				HSSFCell cell_Six = row_two.createCell(6);	
				HSSFCell cell_Seven = row_two.createCell(7);
				HSSFCell cell_Eight = row_two.createCell(8);
				HSSFCell cell_Nine=row_two.createCell(9);
				HSSFCell cell_Ten=row_two.createCell(10);
				HSSFCell cell_Eleven=row_two.createCell(11);
				//格式过滤
				String rechargeType=null;
				String feeWay=null;
				if(contract.getRechargeSetType().equals("online"))
					rechargeType="线上充值";
				else
					rechargeType="线下充值";
				
				if(contract.getFeeWay().equals("proportion"))
					feeWay="比例收费";
				else
					feeWay="直接取费";
				
				//时间格式转化
		        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
		       
				cell_Zero.setCellValue(contract.getRechargeCode());
				cell_One.setCellValue(contract.getRechargeSetName());
				cell_Two.setCellValue(contract.getRechargeMoney()+"");
				cell_Three.setCellValue(contract.getSaveMoney()+"");
				cell_Four.setCellValue(contract.getChargeMoney()+"");
				cell_Five.setCellValue(contract.getReturnMoney()+"");
				cell_Six.setCellValue(contract.getReceiveMoney()+"");
				cell_Seven.setCellValue(feeWay);
				cell_Eight.setCellValue(rechargeType);
				cell_Nine.setCellValue(contract.getMemberDisplay());
				cell_Ten.setCellValue(contract.getCreaterDisplay());
				cell_Eleven.setCellValue(sf.format(contract.getCreateTime()));
				
				
			    //列样式
	            cell_Zero.setCellStyle(style2);
				cell_One.setCellStyle(style2);
	            cell_Two.setCellStyle(style2);
				cell_Three.setCellStyle(style2);
				cell_Four.setCellStyle(style2);
				cell_Five.setCellStyle(style2);
				cell_Six.setCellStyle(style2);
				cell_Seven.setCellStyle(style2);
				cell_Eight.setCellStyle(style2);
				cell_Nine.setCellStyle(style2);
				cell_Ten.setCellStyle(style2);
				cell_Eleven.setCellStyle(style2);
			}
		}
		return wb;
	}
	
	
}
