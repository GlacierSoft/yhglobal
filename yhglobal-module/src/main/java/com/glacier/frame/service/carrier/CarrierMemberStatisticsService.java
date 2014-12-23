/**
 * @Title: CarrierMemberStatisticsService.java 
 * @Package com.glacier.frame.service.carrier 
 * @author wuting
 * @email 920339213@qq.com
 * @date 2014-10-10 上午10:16:16 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 *             
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.carrier;
 
import java.util.List; 

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
import com.glacier.frame.dao.carrier.CarrierMemberStatisticsMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.entity.carrier.CarrierMemberStatistics;
import com.glacier.jqueryui.util.JqGridReturn;

/**
 * @ClassName:  CarrierMemberStatisticsService
 * @Description: TODO(承运商统计信息service)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-12-17  上午10:16:16
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class CarrierMemberStatisticsService { 

	@Autowired
    private CarrierMemberStatisticsMapper carrierMemberStatisticsMapper;
	
	@Autowired
    private UserMapper userMapper;
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(承运商统计信息列表) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(String memberName) {
        JqGridReturn returnResult = new JqGridReturn();
        if(memberName == null){
        	memberName="%%";
        }else{
        	memberName="%"+memberName+"%";
        }
        List<CarrierMemberStatistics>  shipperMemberStatisticsList = carrierMemberStatisticsMapper.getStatisticsList(memberName); 
        int total = carrierMemberStatisticsMapper.countByExample(memberName); // 查询总页数
        returnResult.setRows(shipperMemberStatisticsList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getStatistics 
     * @Description: TODO(根据Id取出承运商统计信息) 
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getStatistics(String memberId) {
    	return carrierMemberStatisticsMapper.getStatistics(memberId);
    }
    
    /**
     * @Title: export 
     * @Description: TODO(导出会员统计信息) 
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
   public HSSFWorkbook export(List<CarrierMemberStatistics> list) { 
   	 
    	String[] excelHeader = {"承运商名称","收入总金额(元)","返还总金额(元)","充值总金额(元)","提现总金额(元)","驾驶员总人数","车辆总数","运送成功次数"};	      
    	int[] excelHeaderWidth = {120,120, 120, 120, 120, 120, 120, 120,};
        
    	HSSFWorkbook wb = new HSSFWorkbook();    
        HSSFSheet sheet = wb.createSheet("会员报表统计");    
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
        for (int i = 0; i < list.size(); i++) { 
        	//获取列值
        	CarrierMemberStatistics carrierMemberStatistics = list.get(i);
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
			
			//格式转化
			String value_one=carrierMemberStatistics.getIncome()+"";
			String value_two=carrierMemberStatistics.getRetruns()+"";
			String value_three=carrierMemberStatistics.getRecharge()+"";
			String value_four=carrierMemberStatistics.getWithdarw()+"";
			String value_five=carrierMemberStatistics.getDriverCount()+"";
			String value_six=carrierMemberStatistics.getCarCount()+"";
			String value_seven=carrierMemberStatistics.getDispatchingCount()+"";
			
			cell_Zero.setCellValue(carrierMemberStatistics.getMemberName());
		    cell_One.setCellValue(value_one);//借款总额
			cell_Two.setCellValue(value_two);//累计亏盈 
			cell_Three.setCellValue(value_three);//已还总额
			cell_Four.setCellValue(value_four);//待还总额
			cell_Five.setCellValue(value_five);//已收总额
			cell_Six.setCellValue(value_six);//待收总额
			cell_Seven.setCellValue(value_seven);//已还本金
			
			//列样式
            cell_Zero.setCellStyle(style2);
			cell_One.setCellStyle(style2);
            cell_Two.setCellStyle(style2);
			cell_Three.setCellStyle(style2);
			cell_Four.setCellStyle(style2);
			cell_Five.setCellStyle(style2);
			cell_Six.setCellStyle(style2);
			cell_Seven.setCellStyle(style2);
		}    
        return wb;    
    }     
}