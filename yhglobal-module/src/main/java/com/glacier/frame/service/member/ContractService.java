/**
 * @Title: ContractService.java 
 * @Package com.glacier.global.service.member
 * @author zhengjunjie   
 * @email 1203807137@qq.com
 * @date 2014-10-08 下午1:40:53
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：zhengjunjie
 * 
 */

package com.glacier.frame.service.member;

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

import com.glacier.frame.dao.member.ShipperMemberContractRecordMapper;
import com.glacier.frame.dto.query.member.ShipperMemberContractRecordQueryDTO;

import com.glacier.frame.entity.member.ShipperMemberContractRecord;
import com.glacier.frame.entity.member.ShipperMemberContractRecordExample;
import com.glacier.frame.entity.member.ShipperMemberContractRecordExample.Criteria;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ContractService
 * @Description: TODO(货主合同记录业务类)
 * @author zhengjunjie
 * @email 1203807137@QQ.com
 * @date 2014-10-08 下午1:40:53
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ContractService {
	
	@Autowired
    private ShipperMemberContractRecordMapper shipperMemberContractRecordMapper;
	  
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员合同记录信息) 
     * @param @param padvertisementr,contractRecordQueryDTO,q
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	public Object listAsGrid(JqPager jqPager, ShipperMemberContractRecordQueryDTO contractRecordQueryDTO, String q) {
	    JqGridReturn returnResult = new JqGridReturn();
	    ShipperMemberContractRecordExample shipperMemberContractRecordExample = new ShipperMemberContractRecordExample();
	    Criteria queryCriteria = shipperMemberContractRecordExample.createCriteria();
	    contractRecordQueryDTO.setQueryCondition(queryCriteria, q);
	    if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
	    	shipperMemberContractRecordExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
	    	shipperMemberContractRecordExample.setLimitEnd(jqPager.getRows());
	    }
	    if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
	    	shipperMemberContractRecordExample.setOrderByClause(jqPager.getOrderBy("temp_shipper_member_contract_record_"));
	    }
	    List<ShipperMemberContractRecord>  shipperMemberContractRecords = shipperMemberContractRecordMapper.selectByExample(shipperMemberContractRecordExample); // 查询所有广告列表
	    int total = shipperMemberContractRecordMapper.countByExample(shipperMemberContractRecordExample); // 查询总页数
	    returnResult.setRows(shipperMemberContractRecords);
	    returnResult.setTotal(total);
	    return returnResult;// 返回ExtGrid表
	 }
	
	/**
     * @Title: getContractPro 
     * @Description: TODO(获取会员合同记录信息对象) 
     * @param @param contractRecordId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */ 
	public Object getContractPro(String contractRecordId) {
	    ShipperMemberContractRecord shipperMemberContractRecord = shipperMemberContractRecordMapper.selectByPrimaryKey(contractRecordId);
		return shipperMemberContractRecord;
	}
	
	 /**
	  * @Title: export 
	  * @Description: TODO(货主合同记录信息导出EXCEL) 
	  * @param @param list
	  * @param @return    设定文件 
	  * @return Object    返回类型 
	  * @throws
	 */
	public HSSFWorkbook export(List<ShipperMemberContractRecord> list) {
		
		//定义导出变量
		String[] excelHeader = { "货物名称", "货主(乙方)", "甲方(平台)", "合同类型", "合同状态","合同内容", "合同生效时间","合同失效时间", "创建人", "创建时间","修改人","修改时间", "备注" };
		int[] excelHeaderWidth = { 100, 100, 100, 150, 100,150, 100, 100,100, 100,100,100,100 };
		
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("货主合同报表统计");
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
				ShipperMemberContractRecord contract = list.get(i);
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
				HSSFCell cell_Twelve=row_two.createCell(12);
				//格式过滤
				String statue_info=null;
				if(contract.getStatus().equals("enable")){
					statue_info="启用";
				}else{
					statue_info="禁用";
				}
				//时间格式转化
		        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
					
				cell_Zero.setCellValue(contract.getGoodsId());
				cell_One.setCellValue(contract.getMemberDisplay());
				cell_Two.setCellValue(contract.getPlatformId());
				cell_Three.setCellValue(contract.getContractTypeDisplay());
				cell_Four.setCellValue(statue_info);
				cell_Five.setCellValue(contract.getContractContent());
				cell_Six.setCellValue(sf.format(contract.getOperationTime()));
				cell_Seven.setCellValue(sf.format(contract.getCloseTime()));
				cell_Eight.setCellValue(contract.getCreaterDisplay());
				cell_Nine.setCellValue(sf.format(contract.getCreateTime()));
				cell_Ten.setCellValue(contract.getUpdaterDisplay());
				cell_Eleven.setCellValue(sf.format(contract.getUpdateTime()));
				cell_Twelve.setCellValue(contract.getRemark());
				
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
				cell_Twelve.setCellStyle(style2);
			}
		}
		return wb;
	}
}
