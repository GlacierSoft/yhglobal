/**
 * @Title: StorehouseBelaidupService.java 
 * @Package com.glacier.global.service.StorehouseBelaidup
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
import java.math.BigDecimal;
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
import com.glacier.frame.dao.finace.FinanceMemberDetailMapper;
import com.glacier.frame.dao.finace.FinanceMemberMapper;
import com.glacier.frame.dao.finace.FinancePlatformDetailMapper;
import com.glacier.frame.dao.finace.FinancePlatformMapper;
import com.glacier.frame.dao.member.MemberContractTypeMapper;
import com.glacier.frame.dao.member.ShipperIntegralTypeMapper;
import com.glacier.frame.dao.member.ShipperMemberContractRecordMapper;
import com.glacier.frame.dao.member.ShipperMemberIntegralMapper;
import com.glacier.frame.dao.member.ShipperMemberMapper;
import com.glacier.frame.dao.orders.OrdersOrderInfoMapper;
import com.glacier.frame.dao.orders.OrdersOrdispatchingDetailedMapper;
import com.glacier.frame.dao.orders.OrdersTrackingMapper;
import com.glacier.frame.dao.storehouse.StorehouseAddedServiceMapper;
import com.glacier.frame.dao.storehouse.StorehouseBelaidupMapper;
import com.glacier.frame.dao.storehouse.StorehouseDamageMapper;
import com.glacier.frame.dao.storehouse.StorehousePackCodeMapper;
import com.glacier.frame.dao.storehouse.StorehouseStorageGoodsrunMapper;
import com.glacier.frame.dao.storehouse.StorehouseStorageMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.dto.query.storehouse.StorehouseBelaidupQueryDTO;
import com.glacier.frame.dto.query.storehouse.StorehouseBelaidupsQueryDTO;
import com.glacier.frame.entity.finace.FinanceMember;
import com.glacier.frame.entity.finace.FinanceMemberDetail;
import com.glacier.frame.entity.finace.FinanceMemberExample;
import com.glacier.frame.entity.finace.FinancePlatform;
import com.glacier.frame.entity.finace.FinancePlatformDetail;
import com.glacier.frame.entity.finace.FinancePlatformExample;
import com.glacier.frame.entity.member.MemberContractType;
import com.glacier.frame.entity.member.MemberContractTypeExample;
import com.glacier.frame.entity.member.ShipperIntegralType;
import com.glacier.frame.entity.member.ShipperIntegralTypeExample;
import com.glacier.frame.entity.member.ShipperMember;
import com.glacier.frame.entity.member.ShipperMemberContractRecord;
import com.glacier.frame.entity.member.ShipperMemberIntegral;
import com.glacier.frame.entity.orders.OrdersOrderInfo;
import com.glacier.frame.entity.orders.OrdersOrderInfoExample;
import com.glacier.frame.entity.orders.OrdersOrdispatchingDetailed;
import com.glacier.frame.entity.orders.OrdersOrdispatchingDetailedExample;
import com.glacier.frame.entity.orders.OrdersTracking;
import com.glacier.frame.entity.orders.OrdersTrackingExample;
import com.glacier.frame.entity.storehouse.StorehouseAddedService;
import com.glacier.frame.entity.storehouse.StorehouseBelaidup;
import com.glacier.frame.entity.storehouse.StorehouseBelaidupExample;
import com.glacier.frame.entity.storehouse.StorehouseBelaidupExample.Criteria;
import com.glacier.frame.entity.storehouse.StorehouseAddedServiceExample;
import com.glacier.frame.entity.storehouse.StorehouseDamageExample;
import com.glacier.frame.entity.storehouse.StorehousePackCode;
import com.glacier.frame.entity.storehouse.StorehouseStorage;
import com.glacier.frame.entity.storehouse.StorehouseStorageGoodsrun;
import com.glacier.frame.entity.storehouse.StorehouseStorageGoodsrunExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.system.UserExample;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
/*** 
 * @ClassName:  StorehouseBelaidupService
 * @Description: TODO(货物表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2014-10-15
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class StorehouseBelaidupService {

	@Autowired
	private StorehouseBelaidupMapper belaidupMapper;
	
	@Autowired
	private StorehouseDamageMapper damageMapper;
	
	@Autowired
	private StorehousePackCodeMapper packcodeMapper;
	
	@Autowired
	private StorehouseStorageGoodsrunMapper GoodsrunMapper;
	
	@Autowired
	private OrdersOrderInfoMapper order_infoMapper;
	
	@Autowired
	private OrdersOrdispatchingDetailedMapper ordersOrdispatchingDetailedMapper;
	
	@Autowired
	private OrdersTrackingMapper ordersTrackingMapper;
	
	@Autowired
	private StorehouseStorageMapper storageMapper;
	
	@Autowired
	private StorehouseAddedServiceMapper addedServiceMapper; 
	
	@Autowired
	private FinanceMemberDetailMapper financeMemberDetailMapper;
	
	@Autowired
	private FinanceMemberMapper financeMemberMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private FinancePlatformMapper financePlatformMapper;
	
	@Autowired
	private FinancePlatformDetailMapper financePlatformDetailMapper;
	
	@Autowired
	private ShipperIntegralTypeMapper shipperIntegralTypeMapper;
	
	@Autowired
	private ShipperMemberIntegralMapper shipperMemberIntegralMapper;
	
	@Autowired
	private ShipperMemberMapper shipperMemberMapper;
	
	@Autowired
	private MemberContractTypeMapper memberContractTypeMapper;
	
	@Autowired
	private ShipperMemberContractRecordMapper shipperMemberContractRecordMapper;
	
	/**
     * @Title: notLogin 
     * @Description: TODO(根据货物条形码获取货物状态) 
     * @param @param code
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
	public Object getCodeBelaidup(String code) {
		StorehouseBelaidupExample storehouseBelaidupExample = new StorehouseBelaidupExample();
		storehouseBelaidupExample.createCriteria().andBelaidupBarCodeEqualTo(code);
		List<StorehouseBelaidup> storehouseBelaidup = belaidupMapper.selectByExample(storehouseBelaidupExample);
		return storehouseBelaidup;
	}
	/**
     * @Title: notLogin 
     * @Description: TODO(根据货物条形码获取货物的跟踪信息) 
     * @param @param code
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
	public Object notLogin(String code) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		List<OrdersTracking> ordersTracking = null;
		//根据条形码查出货物信息
		StorehouseBelaidupExample storehouseBelaidupExample = new StorehouseBelaidupExample();
		storehouseBelaidupExample.createCriteria().andBelaidupBarCodeEqualTo(code);
		List<StorehouseBelaidup> storehouseBelaidup = belaidupMapper.selectByExample(storehouseBelaidupExample);
		//根据货物ID查询出是否在订单详情中存在
		OrdersOrderInfoExample ordersOrder_infoExample = new OrdersOrderInfoExample();
		ordersOrder_infoExample.createCriteria().andBelaidupIdEqualTo(storehouseBelaidup.get(0).getBelaidupId());
		List<OrdersOrderInfo> ordersOrder_info = order_infoMapper.selectByExample(ordersOrder_infoExample);
        //判断订单详情是否存在！
		if(null != ordersOrder_info && ordersOrder_info.size() > 0){
			//存在--根据订单详情中的订单号查询出配送详情
			OrdersOrdispatchingDetailedExample ordersOrdispatchingDetailedExample = new OrdersOrdispatchingDetailedExample();
			ordersOrdispatchingDetailedExample.createCriteria().andOrderIdEqualTo(ordersOrder_info.get(0).getOrderId());
			List<OrdersOrdispatchingDetailed> ordersOrdispatchingDetailed = ordersOrdispatchingDetailedMapper.selectByExample(ordersOrdispatchingDetailedExample);
			//判断该订单是否存在配送
			if(null != ordersOrdispatchingDetailed && ordersOrdispatchingDetailed.size() > 0){
				//存在--根据配送详情中的配送号查询出跟踪信息
				OrdersTrackingExample ordersTrackingExample = new OrdersTrackingExample();
				ordersTrackingExample.createCriteria().andDispatchingIdEqualTo(ordersOrdispatchingDetailed.get(0).getDispatchingId());
				ordersTracking = ordersTrackingMapper.selectByExample(ordersTrackingExample);
				return ordersTracking;
			}else{
				returnResult.setSuccess(false);
				returnResult.setMsg("已分配好订单，正在安排配送。");
				return returnResult;
			}
		}else{
			returnResult.setSuccess(false);
			returnResult.setMsg("存储仓库，正在分配订单。");
			return returnResult;
		}
    }
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有货物信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, StorehouseBelaidupQueryDTO belaidupSetQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        StorehouseBelaidupExample belaidupSetExample = new StorehouseBelaidupExample(); 
        Criteria queryCriteria = belaidupSetExample.createCriteria();
        belaidupSetQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	belaidupSetExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	belaidupSetExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	belaidupSetExample.setOrderByClause(jqPager.getOrderBy("temp_storehouse_belaidup_"));
        }
        List<StorehouseBelaidup> belaidupSetTypeList = belaidupMapper.selectByExample(belaidupSetExample); // 查询所有会员列表
        int total = belaidupMapper.countByExample(belaidupSetExample); // 查询总页数
        returnResult.setRows(belaidupSetTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(前台首页获取所有货物信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    public Object listAsGridWBE(JqPager jqPager) {
        JqGridReturn returnResult = new JqGridReturn();
        StorehouseBelaidupExample belaidupSetExample = new StorehouseBelaidupExample();
        belaidupSetExample.setOrderByClause("temp_storehouse_belaidup.create_time desc");
        List<StorehouseBelaidup> belaidupSetTypeList = belaidupMapper.selectByExample(belaidupSetExample); // 查询所有会员列表
        int total = belaidupMapper.countByExample(belaidupSetExample); // 查询总页数
        returnResult.setRows(belaidupSetTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    
    /**
     * @Title: listAsWebsite 
     * @Description: TODO(前台获取登录会员货源发布记录) 
     * @param @param pager
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsWebsite(JqPager pager, StorehouseBelaidupsQueryDTO storehouseBelaidupsQuerysDTO, String memberId, int p) {
        JqGridReturn returnResult = new JqGridReturn();
        StorehouseBelaidupExample belaidupSetExample = new StorehouseBelaidupExample();
        Criteria criteria = belaidupSetExample.createCriteria();
        storehouseBelaidupsQuerysDTO.setQueryConditions(criteria,memberId);//前台条件查询
        
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	belaidupSetExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	belaidupSetExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	belaidupSetExample.setOrderByClause(pager.getOrderBy("temp_storehouse_belaidup_"));
        }
        int startTemp = ((p-1)*5);//根据前台返回的页数进行设置
        belaidupSetExample.setLimitStart(startTemp);
        belaidupSetExample.setLimitEnd(5);
        List<StorehouseBelaidup>  StorehouseBelaidups = belaidupMapper.selectByExample(belaidupSetExample); // 查询所有会员资金记录列表
        int total = belaidupMapper.countByExample(belaidupSetExample); // 查询总页数
        returnResult.setRows(StorehouseBelaidups);
        returnResult.setTotal(total);
        returnResult.setP(p);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有货物信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    public Object listAsGridWeb(int p,JqPager jqPager, StorehouseBelaidupQueryDTO belaidupSetQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        StorehouseBelaidupExample belaidupSetExample = new StorehouseBelaidupExample(); 
        if(belaidupSetQueryDTO.getShorteslength() != null && belaidupSetQueryDTO.getShorteslength() > 0){
        	belaidupSetExample.createCriteria().andShorteslengthLessThanOrEqualTo(belaidupSetQueryDTO.getShorteslength());
        }
        if(belaidupSetQueryDTO.getBelaidupInitiatin() != null && belaidupSetQueryDTO.getBelaidupInitiatin().length() >0){
        	belaidupSetExample.createCriteria().andBelaidupInitiatinEqualTo(belaidupSetQueryDTO.getBelaidupInitiatin());
        }
        if(belaidupSetQueryDTO.getBelaidupTerminu() != null && belaidupSetQueryDTO.getBelaidupTerminu().length() >0){
        	belaidupSetExample.createCriteria().andBelaidupTerminuEqualTo(belaidupSetQueryDTO.getBelaidupTerminu());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	belaidupSetExample.setOrderByClause(jqPager.getOrderBy("temp_storehouse_belaidup_"));
        }
        int startTemp = ((p-1)*5);//根据前台返回的页数进行设置
        belaidupSetExample.setLimitStart(startTemp);
        belaidupSetExample.setLimitEnd(5);
        List<StorehouseBelaidup> belaidupSetTypeList = belaidupMapper.selectByExample(belaidupSetExample); // 查询所有会员列表
        int total = belaidupMapper.countByExample(belaidupSetExample); // 查询总页数
        returnResult.setRows(belaidupSetTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getBelaidup 
	 * @Description: TODO(根据货物Id获取货物信息) 
	 * @param @param belaidupId
	 * @param @return    设定文件 
	 * @return Object    返回 
	 * @throws
	 */
    public Object getBelaidup(String belaidupId) {
    	StorehouseBelaidup carrierCarType = belaidupMapper.selectByPrimaryKey(belaidupId);
        return carrierCarType;
    }
    
    /**
     * @Title: addBelaidup 
     * @Description: TODO(新增货物) 
     * @param @param belaidup
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addBelaidup(StorehouseBelaidup belaidup,String packageId) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehouseBelaidupExample belaidupSetExample = new StorehouseBelaidupExample(); 
        int count = 0;
        // 防止货物名称重复
        belaidupSetExample.createCriteria().andBelaidupProdNameEqualTo(belaidup.getBelaidupProdName());
        count = belaidupMapper.countByExample(belaidupSetExample);
        //获取库房
        StorehouseStorage storage = storageMapper.selectByPrimaryKey(belaidup.getStorehouseId());
        if (count > 0) {
            returnResult.setMsg("货物名称重复");
            return returnResult;
        }
        if(belaidup.getBelaidupWeight() > storage.getUsableWeight()){
        	returnResult.setMsg("库房的容量存储容纳不下！");
            return returnResult;
        }
        if(belaidup.getBelaidupBulk() > storage.getUsableBulk()){
        	returnResult.setMsg("库房的容量存储容纳不下！");
            return returnResult;
        }
        belaidup.setBelaidupId(RandomGUID.getRandomGUID());
        belaidup.setBelaidupStatus("receiving");
        belaidup.setSortingStauts("waitsorting");
        belaidup.setCreater(pricipalUser.getUserId());
        belaidup.setCreateTime(new Date());
        belaidup.setUpdater(pricipalUser.getUserId());
        belaidup.setUpdateTime(new Date());
        count = belaidupMapper.insert(belaidup);
        if (count == 1) {
        	//构建包装中间表
        	StorehousePackCode packCode = new StorehousePackCode();
        	packCode.setPackCodeId(RandomGUID.getRandomGUID());
        	packCode.setBelaidupId(belaidup.getBelaidupId());//货物ID
        	packCode.setPackagetypeId(packageId);//包装类型ID
        	packCode.setCreater(pricipalUser.getUserId());
        	packCode.setCreateTime(new Date());
        	packCode.setUpdater(pricipalUser.getUserId());
        	packCode.setUpdateTime(new Date());
        	//执行添加
        	packcodeMapper.insert(packCode);
        	
        	//构建货物流动
        	StorehouseStorageGoodsrun goodsrun = new StorehouseStorageGoodsrun();
        	goodsrun.setGoodsrunId(RandomGUID.getRandomGUID());
        	goodsrun.setBelaidupId(belaidup.getBelaidupId());
        	goodsrun.setGoodsrunNum(0);
        	goodsrun.setGoodsrunStatus(belaidup.getBelaidupStatus());
        	goodsrun.setStatus("enable");
        	goodsrun.setGoodsrunDate(new Date());
        	goodsrun.setRemark("写点什么好呢！。。。");
        	goodsrun.setCreater(pricipalUser.getUserId());
        	goodsrun.setCreateTime(new Date());
        	goodsrun.setUpdater(pricipalUser.getUserId());
        	goodsrun.setUpdateTime(new Date());
        	//执行添加
        	GoodsrunMapper.insert(goodsrun);
        	//货物添加成功后减去相应的库房容量
        	storage.setUsableWeight(storage.getUsableWeight()-belaidup.getBelaidupWeight());
        	storage.setUsableBulk(storage.getUsableBulk()-belaidup.getBelaidupBulk());
        	storageMapper.updateByPrimaryKey(storage);
        	
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + belaidup.getBelaidupProdName() + "] 货物信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，货物信息保存失败");
        }
        return returnResult;
    }
    
    
    /**
     * @Title: addBelaidup_website 
     * @Description: TODO(前台我要发货，发布货源方法) 
     * @param @param belaidup，packageId
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addBelaidup_website(StorehouseBelaidup belaidup,StorehouseAddedService storehouseAddedService,String type) { 
        Subject pricipalSubject = SecurityUtils.getSubject();
        ShipperMember pricipalUser = (ShipperMember) pricipalSubject.getPrincipal(); 
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        if( pricipalUser==null){
        	returnResult.setMsg("请先登录，再操作！");
        	return returnResult;
        } 
        //查询账户是否够运输费
        FinanceMemberExample finanMemberExample=new FinanceMemberExample();
        finanMemberExample.createCriteria().andMemberIdEqualTo(pricipalUser.getMemberId());
        FinanceMember fin=(FinanceMember)financeMemberMapper.selectByExample(finanMemberExample).get(0);
        if(fin.getMrechageRemain().compareTo(storehouseAddedService.getTotalCost())==-1){
        	returnResult.setMsg("账户余额不足，请先充值再发货！");
        	return returnResult;
        }
        //新增物品信息
        int count = 0;
        belaidup.setBelaidupId(RandomGUID.getRandomGUID());
        belaidup.setMemberId(pricipalUser.getMemberId());
        belaidup.setBelaidupStatus("receiving");
        belaidup.setSortingStauts("waitsorting");
        belaidup.setStauts("enable");
        belaidup.setCreater(pricipalUser.getMemberId());
        belaidup.setCreateTime(new Date());
        belaidup.setUpdater(pricipalUser.getMemberId());
        belaidup.setUpdateTime(new Date());
        count = belaidupMapper.insert(belaidup);
        //如果是关联班线发货，增值服务表添加数据
        if(type.equals("route")){
        	storehouseAddedService.setAddedServiceId(RandomGUID.getRandomGUID());
        	storehouseAddedService.setBelaidupId(belaidup.getBelaidupId()); 
        	storehouseAddedService.setMessage("yes");
        	addedServiceMapper.insert(storehouseAddedService);
        	//新增会员资金记录
        	FinanceMemberDetail financeMemberDetail=new FinanceMemberDetail();
        	financeMemberDetail.setMdetailId(RandomGUID.getRandomGUID());
        	financeMemberDetail.setMemberId(pricipalUser.getMemberId());
        	financeMemberDetail.setArticleId(belaidup.getBelaidupId());
        	financeMemberDetail.setMdetailType("nowPay");//现付
        	financeMemberDetail.setMdetailPay(storehouseAddedService.getTotalCost()); 
        	financeMemberDetail.setMdetaillPayfor(storehouseAddedService.getTotalCost());
        	financeMemberDetail.setRemark("提交发货单扣款");
        	financeMemberDetail.setCreater(getUserId());
        	financeMemberDetail.setCreateTime(new Date());
        	financeMemberDetail.setUpdater(getUserId());
        	financeMemberDetail.setUpdateTime(new Date());
        	financeMemberDetailMapper.insert(financeMemberDetail);
        	//修改会员资金,账户金额减去此次运输总费用
        	fin.setMrechageRemain(fin.getMrechageRemain().subtract(storehouseAddedService.getTotalCost()));
        	fin.setUpdateTime(new Date());
        	financeMemberMapper.updateByPrimaryKeySelective(fin);
        	//取出默认平台资金账户
        	FinancePlatformExample financePlatformExample=new FinancePlatformExample();
        	financePlatformExample.createCriteria().andBankTypeEqualTo("default");
        	FinancePlatform financePlatform=(FinancePlatform)financePlatformMapper.selectByExample(financePlatformExample).get(0);
            //新增平台资金记录
        	FinancePlatformDetail financePlatformDetail=new FinancePlatformDetail ();
        	financePlatformDetail.setDetailId(RandomGUID.getRandomGUID());
        	financePlatformDetail.setPlatformId(financePlatform.getPlatformId());
        	financePlatformDetail.setTradeTarget(pricipalUser.getMemberName());
        	financePlatformDetail.setTradeType("货主发货收款");
        	financePlatformDetail.setTradeEarn(storehouseAddedService.getTotalCost());
        	financePlatformDetail.setTradeSpend(new BigDecimal(0));
        	financePlatformDetail.setTradeAmount(financePlatform.getRemainMoney().add(storehouseAddedService.getTotalCost()));
        	financePlatformDetail.setCreater(getUserId());
        	financePlatformDetail.setCreateTime(new Date());
        	financePlatformDetail.setUpdater(getUserId());
        	financePlatformDetail.setUpdateTime(new Date());
        	financePlatformDetailMapper.insert(financePlatformDetail);
        	//修改平台资金
        	financePlatform.setRemainMoney(financePlatform.getRemainMoney().add(storehouseAddedService.getTotalCost()));
        	financePlatform.setUpdateTime(new Date());
        	financePlatformMapper.updateByPrimaryKeySelective(financePlatform);
        	//取出发货的积分类型
        	ShipperIntegralTypeExample integralTypeExample=new ShipperIntegralTypeExample();
        	integralTypeExample.createCriteria().andIntegralTypeEqualTo("deliver").andChangeTypeEqualTo("increase");
        	ShipperIntegralType shipperIntegralType=(ShipperIntegralType)shipperIntegralTypeMapper.selectByExample(integralTypeExample).get(0);
            //新增积分记录
        	ShipperMemberIntegral  shipperMemberIntegral =new ShipperMemberIntegral();
        	shipperMemberIntegral.setShipperMemberIntegralId(RandomGUID.getRandomGUID());
        	shipperMemberIntegral.setMemberId(pricipalUser.getMemberId());
        	shipperMemberIntegral.setIntegralTypeId(shipperIntegralType.getIntegralTypeId());
        	shipperMemberIntegral.setRemark("货主发货增加积分");
        	shipperMemberIntegral.setCreater(getUserId());
        	shipperMemberIntegral.setCreateTime(new Date());
        	shipperMemberIntegral.setUpdater(getUserId());
        	shipperMemberIntegral.setUpdateTime(new Date());
        	shipperMemberIntegralMapper.insert(shipperMemberIntegral);
        	//修改货主会员的资金和积分信息
        	pricipalUser.setAccountBalance(fin.getMrechageRemain());//账户余额等于自己的资金余额
        	pricipalUser.setIntegral(pricipalUser.getIntegral()+shipperIntegralType.getChangeValue());//原有积分+新增的
        	shipperMemberMapper.updateByPrimaryKeySelective(pricipalUser);
        	//查询合同类型--发货
        	MemberContractTypeExample  memberContractTypeExample=new MemberContractTypeExample();
        	memberContractTypeExample.createCriteria().andContractTypeNameEqualTo("货主承运商合同");
        	MemberContractType memberContractType=(MemberContractType)memberContractTypeMapper.selectByExample(memberContractTypeExample).get(0);
        	//生成合同信息
        	ShipperMemberContractRecord shipperMemberContractRecord=new ShipperMemberContractRecord();
        	shipperMemberContractRecord.setContractRecordId(RandomGUID.getRandomGUID());
        	shipperMemberContractRecord.setGoodsId(belaidup.getBelaidupId());
        	shipperMemberContractRecord.setMemberId(pricipalUser.getMemberId());
        	shipperMemberContractRecord.setContractTypeId(memberContractType.getContractTypeId());
        	shipperMemberContractRecord.setPlatformId("越海物流");
        	shipperMemberContractRecord.setStatus("enable");
        	shipperMemberContractRecord.setContractContent("合同内容。。。");
        	shipperMemberContractRecord.setOperationTime(new Date());
        	shipperMemberContractRecord.setRemark("此合同从订单成功提交即生效");
        	shipperMemberContractRecord.setCreater(getUserId());
        	shipperMemberContractRecord.setCreateTime(new Date());
        	shipperMemberContractRecord.setUpdater(getUserId());
        	shipperMemberContractRecord.setUpdateTime(new Date());
        	shipperMemberContractRecordMapper.insert(shipperMemberContractRecord);
        } 
        if (count == 1) {
        	 returnResult.setSuccess(true);
        	returnResult.setMsg("[" + belaidup.getBelaidupProdName() + "] 货物信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，货物信息保存失败");
        }
        return returnResult;
    }
     
    /**
     * @Title: editBelaidup 
     * @Description: TODO(修改货物信息) 
     * @param @param belaidup
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object editBelaidup(StorehouseBelaidup belaidup,String packageId) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        StorehouseBelaidupExample belaidupSetExample = new StorehouseBelaidupExample(); 
        int count = 0;
        // 防止货物名称重复
        belaidupSetExample.createCriteria().andBelaidupProdNameEqualTo(belaidup.getBelaidupProdName()).andBelaidupIdNotEqualTo(belaidup.getBelaidupId());
        count = belaidupMapper.countByExample(belaidupSetExample);
        //获取库房
        StorehouseStorage storageNew = storageMapper.selectByPrimaryKey(belaidup.getStorehouseId());
        if (count > 0) {
            returnResult.setMsg("货物名称重复");
            return returnResult;
        }
        if(belaidup.getBelaidupWeight() > storageNew.getUsableWeight()){
        	returnResult.setMsg("库房的容量存储容纳不下！");
            return returnResult;
        }
        if(belaidup.getBelaidupBulk() > storageNew.getUsableBulk()){
        	returnResult.setMsg("库房的容量存储容纳不下！");
            return returnResult;
        }
        //根据ID获取货物信息
        StorehouseBelaidup belaidupTime = (StorehouseBelaidup) getBelaidup(belaidup.getBelaidupId());
        belaidup.setBelaidupStatus(belaidupTime.getBelaidupStatus());
        belaidup.setSortingStauts(belaidupTime.getSortingStauts());
        belaidup.setCreater(belaidupTime.getCreater());
        belaidup.setCreateTime(belaidupTime.getCreateTime());
        belaidup.setUpdater(pricipalUser.getUserId());
        belaidup.setUpdateTime(new Date());
        count = belaidupMapper.updateByPrimaryKey(belaidup);
        
        if (count == 1) {
        	//修改中间表
            StorehousePackCode packCode = packcodeMapper.selectByBelaidup(belaidup.getBelaidupId());
            packCode.setPackagetypeId(packageId);
            packcodeMapper.updateByPrimaryKey(packCode);
            //原来的仓库
            StorehouseStorage storageOld = storageMapper.selectByPrimaryKey(belaidupTime.getStorehouseId());
            //判断仓库ID是否更改过
            if(storageOld.getStorageId() != storageNew.getStorageId()){
            	//修改过，新的库房减去相应的库房容量
            	storageNew.setUsableWeight(storageNew.getUsableWeight()-belaidup.getBelaidupWeight());
            	storageNew.setUsableBulk(storageNew.getUsableBulk()-belaidup.getBelaidupBulk());
            	storageMapper.updateByPrimaryKey(storageNew);
            	//修改过，旧的库房增加相应的库房容量
            	storageOld.setUsableWeight(storageOld.getUsableWeight()+belaidup.getBelaidupWeight());
            	storageOld.setUsableBulk(storageOld.getUsableBulk()+belaidup.getBelaidupBulk());
            	storageMapper.updateByPrimaryKey(storageOld);
            }
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + belaidup.getBelaidupProdName() + "] 货物信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，货物信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delBelaidup
     * @Description: TODO(删除货物) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object delBelaidup(List<String> belaidupIds, List<String> belaidupName) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        // 定义删除成功数据行数量
        int rightNumber = 0;
        // 定义返回结果
        String result_str = ""; 
        // 定义是否显示提示
        boolean isFlag = true;
        //数据行长度判断
        if (belaidupIds.size() > 0) { 
           //匹配删除信息
           for (int i = 0; i < belaidupIds.size(); i++) {  
                 // 相关联充值记录
        		StorehouseDamageExample damageExample = new StorehouseDamageExample();
        		damageExample.createCriteria().andBelaidupIdEqualTo(belaidupIds.get(i));
        		int count = damageMapper.countByExample(damageExample);
                // 判断是否关联
        		if (count <= 0) { 
        			StorehouseBelaidup belaidup = belaidupMapper.selectByPrimaryKey(belaidupIds.get(i));
        			//判断
        			if(belaidup !=null && belaidup.getBelaidupStatus() != "receiving"){
        				//先删除packcode的外键信息
            			StorehousePackCode packCode = packcodeMapper.selectByBelaidup(belaidup.getBelaidupId());
            			//执行删除
            			packcodeMapper.deleteByPrimaryKey(packCode.getPackCodeId());
            			//再删除货物流动表
            			StorehouseStorageGoodsrunExample goodsrunExample = new StorehouseStorageGoodsrunExample();
            			goodsrunExample.createCriteria().andBelaidupIdEqualTo(belaidup.getBelaidupId());
            			//执行删除
            			GoodsrunMapper.deleteByExample(goodsrunExample);
            			//执行删除货物的操作
    	    		    int number = belaidupMapper.deleteByPrimaryKey(belaidup.getBelaidupId());
    	    		    //货物删除成功后，进行仓库容量的业务
    	    		    StorehouseStorage storageOld = storageMapper.selectByPrimaryKey(belaidup.getStorehouseId());
            			storageOld.setUsableWeight(storageOld.getUsableWeight()+belaidup.getBelaidupWeight());
                    	storageOld.setUsableBulk(storageOld.getUsableBulk()+belaidup.getBelaidupBulk());
                    	storageMapper.updateByPrimaryKey(storageOld);
                    	//删除成功数据行数量记录 
    	    	        rightNumber += number;
        			}
                 } else { 
                       if(isFlag){ 
        				if(count > 0){
        					result_str=" 数据行第<font style='color:red;font-weight: bold;'>【"+ (i+1) +"】</font>条货物记录" + "存在<font style='color:red;font-weight: bold;'>已出库运输等其它原因！删除无法成功！</font>";
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
   
    /**
     * @Title: updateBelaidup
     * @Description: TODO(发布撤/销货源信息) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object updateBelaidup(StorehouseBelaidup belaidup){
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	String name=belaidup.getBelaidupProdName();
    	String action;//记录操作名称
    	if(belaidup.getStauts().equals("enable")){
    		belaidup.setStauts("disable");
    		action="撤销";
    	}else{
    		belaidup.setStauts("enable");
    		action="发布";
    	}
    	int count=belaidupMapper.updateByPrimaryKeySelective(belaidup);
    	if(count>0){
    		returnResult.setSuccess(true);
    		returnResult.setMsg("【"+name+"】货物【"+action+"】操作成功!");
    	}else{
    		returnResult.setSuccess(false);
    		returnResult.setMsg("【"+name+"】货物【"+action+"】操作失败!"); 
    	}
    	return returnResult;
    }
   
    /** 
     * @Title: selectTop  
     * @Description: TODO(查询当前登录会员，上一次提交的订单信息)  
     * @param @return    设定文件  
     * @return StorehouseBelaidup    返回类型  
     * @throws
     */
    public StorehouseBelaidup selectTop(){
    	 Subject pricipalSubject = SecurityUtils.getSubject();
         ShipperMember pricipalUser = (ShipperMember) pricipalSubject.getPrincipal();  
         StorehouseBelaidup sto=belaidupMapper.selectTop(pricipalUser.getMemberId());
         StorehouseAddedServiceExample addedExample=new StorehouseAddedServiceExample();
         addedExample.createCriteria().andBelaidupIdEqualTo(sto.getBelaidupId());
         StorehouseAddedService added= (StorehouseAddedService)addedServiceMapper.selectByExample(addedExample).get(0);
         sto.setAddedService(added);
         return sto;
    }
   
     /**
      * 
      * @Title: getUserId  
      * @Description: TODO(获取系统管理员的id)  
      * @param @return    设定文件  
      * @return String    返回类型  
      * @throws
      */
    public String getUserId(){ 
    	UserExample userExample=new UserExample();
    	userExample.createCriteria().andUsernameEqualTo("admin");
    	User use= (User)userMapper.selectByExample(userExample).get(0);
        return use.getUserId();
    }
    
}
