/**
 * @Title: OrdersDispatchingService.java 
 * @Package com.glacier.frame.service.orders 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2014-10-22 下午1:49:44 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-10-22
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.service.orders;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
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
import com.glacier.frame.dao.basicdatas.ParameterCarrierCreditworthinessTypeMapper;
import com.glacier.frame.dao.carrier.CarrierContractRecordMapper;
import com.glacier.frame.dao.carrier.CarrierMemberCreditworthinessMapper;
import com.glacier.frame.dao.carrier.CarrierMemberMapper;
import com.glacier.frame.dao.finace.FinanceCarrierDetailMapper;
import com.glacier.frame.dao.finace.FinanceCarrierMapper;
import com.glacier.frame.dao.finace.FinancePlatformDetailMapper;
import com.glacier.frame.dao.finace.FinancePlatformMapper;
import com.glacier.frame.dao.member.MemberContractTypeMapper;
import com.glacier.frame.dao.member.ShipperMemberContractRecordMapper;
import com.glacier.frame.dao.orders.OrdersDispatchingMapper;
import com.glacier.frame.dao.orders.OrdersOrderInfoMapper;
import com.glacier.frame.dao.orders.OrdersOrderMapper;
import com.glacier.frame.dao.orders.OrdersOrdispatchingDetailedMapper;
import com.glacier.frame.dao.storehouse.StorehouseBelaidupMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.dto.query.orders.OrdersDispatchingQueryDTO;
import com.glacier.frame.entity.basicdatas.ParameterCarrierCreditworthinessType;
import com.glacier.frame.entity.basicdatas.ParameterCarrierCreditworthinessTypeExample;
import com.glacier.frame.entity.carrier.CarrierContractRecord;
import com.glacier.frame.entity.carrier.CarrierContractRecordExample;
import com.glacier.frame.entity.carrier.CarrierMember;
import com.glacier.frame.entity.carrier.CarrierMemberCreditworthiness;
import com.glacier.frame.entity.finace.FinanceCarrier;
import com.glacier.frame.entity.finace.FinanceCarrierDetail;
import com.glacier.frame.entity.finace.FinanceCarrierExample;
import com.glacier.frame.entity.finace.FinancePlatform;
import com.glacier.frame.entity.finace.FinancePlatformDetail;
import com.glacier.frame.entity.finace.FinancePlatformExample;
import com.glacier.frame.entity.member.MemberContractType;
import com.glacier.frame.entity.member.MemberContractTypeExample; 
import com.glacier.frame.entity.member.ShipperMemberContractRecord;
import com.glacier.frame.entity.member.ShipperMemberContractRecordExample;
import com.glacier.frame.entity.orders.OrdersDispatching;
import com.glacier.frame.entity.orders.OrdersDispatchingExample;
import com.glacier.frame.entity.orders.OrdersDispatchingExample.Criteria;
import com.glacier.frame.entity.orders.OrdersOrder;
import com.glacier.frame.entity.orders.OrdersOrderInfo;
import com.glacier.frame.entity.orders.OrdersOrderInfoExample;
import com.glacier.frame.entity.orders.OrdersOrdispatchingDetailed;
import com.glacier.frame.entity.orders.OrdersOrdispatchingDetailedExample;
import com.glacier.frame.entity.storehouse.StorehouseBelaidup;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.system.UserExample;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: OrdersDispatchingService 
 * @Description:货物配送记录业务层
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2014-10-22 下午1:49:44
 */

@Service
@Transactional(readOnly=true,propagation=Propagation.REQUIRED)

public class OrdersDispatchingService {
   
	@Autowired
	private OrdersDispatchingMapper ordersDispatchingMapper;
	
	@Autowired
	private OrdersOrderInfoMapper ordersOrderInfoMapper;
	
	@Autowired
	private OrdersOrdispatchingDetailedMapper ordersOrdispatchingDetailedMapper;
	
	@Autowired
	private OrdersOrderMapper ordersOrderMapper;
	 
	@Autowired
	private FinanceCarrierMapper financeCarrierMapper;
	
	@Autowired
	private FinanceCarrierDetailMapper financeCarrierDetailMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private StorehouseBelaidupMapper belaidupMapper;
	
	@Autowired
	private MemberContractTypeMapper memberContractTypeMapper;
	
	@Autowired
	private FinancePlatformMapper platformMapper;
	
	@Autowired
	private FinancePlatformDetailMapper platformDetailMapper;
	
	@Autowired
	private ParameterCarrierCreditworthinessTypeMapper creditworthinessTypeMapper; 
	
	@Autowired
	private CarrierMemberCreditworthinessMapper creditworthinessMapper;
	
	@Autowired
	private CarrierMemberMapper carrierMemberMapper;
	
	@Autowired
	private CarrierContractRecordMapper carrierContractRecordMapper;
	
	@Autowired
	private ShipperMemberContractRecordMapper shipperMemberContractRecordMapper;
	
	/**
     * 
     * @Title: signOrdersDispatchingStatus 
     * @Description: TODO(修改配送记录签收状态信息) 
     * @param  @param 
      * @param  @return 设定文件返回类型 
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
	@Transactional(readOnly = false)
	public Object signOrdersDispatchingStatus(String dispatchingId) {
		Subject pricipalSubject = SecurityUtils.getSubject();
    	CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
    	//获取超级管理员的信息
    	UserExample userExample=new UserExample();
      	userExample.createCriteria().andUsernameEqualTo("admin");
      	User use= (User)userMapper.selectByExample(userExample).get(0);
    	
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		OrdersDispatching ordersDispatching = ordersDispatchingMapper.selectByPrimaryKey(dispatchingId);
		int count=0;
		//第一步修改配送记录签收完成状态havesigned
		ordersDispatching.setDispatchingStatus("completion");
		ordersDispatching.setDispatchingSignfor("havesigned");
		count=ordersDispatchingMapper.updateByPrimaryKeySelective(ordersDispatching);
		if(count==1){
			//第二步，根据配送记录查询出订单
			OrdersOrdispatchingDetailed ordersOrdispatchingDetailed = ordersOrdispatchingDetailedMapper.selectByDetailed(ordersDispatching.getDispatchingId());
			OrdersOrder order = ordersOrderMapper.selectByPrimaryKey(ordersOrdispatchingDetailed.getOrderId());
			//改变订单的交易完成状态
			order.setOrderStatus("takedelivery");
			order.setUpdater(use.getUserId());
			order.setUpdateTime(new Date());
			ordersOrderMapper.updateByPrimaryKeySelective(order);
			//根据订单ID取出关于此订单的订单详情中所有的信息
			OrdersOrderInfoExample ordersOrderInfoExample = new OrdersOrderInfoExample();
			ordersOrderInfoExample.createCriteria().andOrderIdEqualTo(order.getOrderId());
			List<OrdersOrderInfo> ordersOrderInfoList = ordersOrderInfoMapper.selectByExample(ordersOrderInfoExample);
			for (int i = 0; i < ordersOrderInfoList.size(); i++) {
				//循环取出货物信息
				StorehouseBelaidup belaidup =  belaidupMapper.selectByPrimaryKey(ordersOrderInfoList.get(i).getBelaidupId());
				belaidup.setBelaidupStatus("business");
				belaidupMapper.updateByPrimaryKeySelective(belaidup);//修改货物交易状态
				//修改货主-平台合同状态
				
				//生成合同信息
	        	ShipperMemberContractRecordExample shipperMemberContractRecordExample=new ShipperMemberContractRecordExample();
	        	shipperMemberContractRecordExample.createCriteria().andGoodsIdEqualTo(belaidup.getBelaidupId()).andMemberIdEqualTo(belaidup.getMemberId());
	        	ShipperMemberContractRecord shipperMemberContractRecord=shipperMemberContractRecordMapper.selectByExample(shipperMemberContractRecordExample).get(0);
	        	shipperMemberContractRecord.setStatus("disable");
	        	shipperMemberContractRecord.setCloseTime(new Date());
	        	shipperMemberContractRecord.setUpdateTime(new Date()); 
	        	shipperMemberContractRecordMapper.updateByPrimaryKeySelective(shipperMemberContractRecord);
			}
			//增加承运商资金明细信息
            FinanceCarrierDetail detail=new FinanceCarrierDetail();
            detail.setDetailId(RandomGUID.getRandomGUID());
            detail.setCarrierId(pricipalUser.getCarrierMemberId());
            detail.setArticleId(order.getOrderId());//订单id
            detail.setDetailIncome(order.getOrderPrice());//收入金额
            detail.setDetailFreeze(new BigDecimal(0));//冻结金额
            detail.setCreateTime(new Date());
            detail.setCreater(getUserId());
            detail.setRemoveFreeze(new BigDecimal(0));
            detail.setDetailStatus("normal");
            detail.setDetailMark(new BigDecimal(0));
            detail.setDetailReturn(new BigDecimal(0));
            detail.setRemark("运送成功获得运输费用！");
            detail.setUpdater(getUserId());
            detail.setUpdateTime(new Date());
            financeCarrierDetailMapper.insert(detail);//添加承运商资金明细信息
            //增加承运商解冻金额资金明细信息
            FinanceCarrierDetail removeFreezeDetail = new FinanceCarrierDetail();
            removeFreezeDetail.setDetailId(RandomGUID.getRandomGUID());
            removeFreezeDetail.setCarrierId(pricipalUser.getCarrierMemberId());
            removeFreezeDetail.setArticleId(order.getOrderId());//订单id
            removeFreezeDetail.setDetailIncome(order.getOrderCost().multiply(new BigDecimal(0.5)));//收入金额
            removeFreezeDetail.setDetailFreeze(new BigDecimal(0));//冻结金额
            removeFreezeDetail.setCreateTime(new Date());
            removeFreezeDetail.setCreater(getUserId());
            removeFreezeDetail.setRemoveFreeze(order.getOrderCost().multiply(new BigDecimal(0.5)));
            removeFreezeDetail.setDetailStatus("normal");
            removeFreezeDetail.setDetailMark(new BigDecimal(0));
            removeFreezeDetail.setDetailReturn(new BigDecimal(0));
            removeFreezeDetail.setRemark("获得解冻金额资金！");
            removeFreezeDetail.setUpdater(getUserId());
            removeFreezeDetail.setUpdateTime(new Date());
            financeCarrierDetailMapper.insert(removeFreezeDetail);//添加承运商资金明细信息
            //增加承运商资金余额
            FinanceCarrierExample financeCarrierExample=new FinanceCarrierExample();
            financeCarrierExample.createCriteria().andCarrierMemberIdEqualTo(pricipalUser.getCarrierMemberId());
            FinanceCarrier financeCarrier = financeCarrierMapper.selectByExample(financeCarrierExample).get(0);
            financeCarrier.setCarrierIncome(financeCarrier.getCarrierIncome().add(order.getOrderCost().multiply(new BigDecimal(0.5)).add(order.getOrderPrice())));//总余额+冻结金额+运输费用
            financeCarrier.setCarrierFreeze(financeCarrier.getCarrierFreeze().subtract(order.getOrderCost().multiply(new BigDecimal(0.5))));//冻结总金额-当前冻结金额
            financeCarrier.setUpdateTime(new Date());
            financeCarrierMapper.updateByPrimaryKeySelective(financeCarrier);//更资金信息
            //取出平台资金信息
            FinancePlatformExample platformExample = new FinancePlatformExample();
            platformExample.createCriteria().andBankTypeEqualTo("default");
            List<FinancePlatform> financePlatformList = platformMapper.selectByExample(platformExample);
            FinancePlatform financePlatform = financePlatformList.get(0);
            //平台资金增加运输费用明细信息
            FinancePlatformDetail platformDetail = new FinancePlatformDetail();
            platformDetail.setDetailId(RandomGUID.getRandomGUID());
            platformDetail.setPlatformId(financePlatform.getPlatformId());
            platformDetail.setTradeTarget(pricipalUser.getMemberName());
            platformDetail.setTradeType("支出");
            platformDetail.setTradeEarn(new BigDecimal(0));
            platformDetail.setTradeSpend(order.getOrderPrice());//支出金额
            platformDetail.setRemark("支出订单为"+order.getOrderCode()+"的运输费用金额");
            platformDetail.setCreateTime(new Date());
            platformDetail.setCreater(use.getUserId());
            platformDetail.setUpdater(use.getUserId());
            platformDetail.setUpdateTime(new Date());
            platformDetailMapper.insert(platformDetail);
            //平台资金余额减去相对扣除的支出资金(原来的总余额-运输费用金额)
            financePlatform.setRemainMoney(financePlatform.getRemainMoney().subtract(platformDetail.getTradeSpend()));
            financePlatform.setUpdateTime(new Date());
            platformMapper.updateByPrimaryKeySelective(financePlatform);
            
            //增加承运商信誉记录
            //第一步取出“运送信誉”类型信息
            ParameterCarrierCreditworthinessTypeExample creditworthinessTypeExample = new ParameterCarrierCreditworthinessTypeExample();
            creditworthinessTypeExample.createCriteria().andCreditworthinessTypeEqualTo("运送信誉");
            List<ParameterCarrierCreditworthinessType> creditworthinessTypeList = creditworthinessTypeMapper.selectByExample(creditworthinessTypeExample);
            //构建信誉记录类
            CarrierMemberCreditworthiness creditworthiness = new CarrierMemberCreditworthiness();
            creditworthiness.setCarrierMemberCreditworthinessId(RandomGUID.getRandomGUID());
            creditworthiness.setCarrierMemberId(pricipalUser.getCarrierMemberId());;
            creditworthiness.setCreditworthinessTypeId(creditworthinessTypeList.get(0).getCreditworthinessTypeId());
            creditworthiness.setChangeType(creditworthinessTypeList.get(0).getChangeType());
            creditworthiness.setChangeValue(creditworthinessTypeList.get(0).getChangeValue());
            creditworthiness.setRemark(creditworthinessTypeList.get(0).getRemark());
            creditworthiness.setCreateTime(new Date());
            creditworthiness.setCreater(use.getUserId());
            creditworthiness.setUpdater(use.getUserId());
            creditworthiness.setUpdateTime(new Date());
            creditworthinessMapper.insert(creditworthiness);
            //相对应增加该承运商信誉度(原来的信誉度+新增的信誉度)
            pricipalUser.setCreditworthiness(pricipalUser.getCreditworthiness()+creditworthinessTypeList.get(0).getChangeValue());
            carrierMemberMapper.updateByPrimaryKeySelective(pricipalUser);
            //合同作废
            CarrierContractRecordExample ex=new CarrierContractRecordExample();
            ex.createCriteria().andDeliverIdEqualTo(order.getOrderCode());
            CarrierContractRecord carrierContractRecord=carrierContractRecordMapper.selectByExample(ex).get(0);
            carrierContractRecord.setStatus("disable");
            carrierContractRecord.setDisableTime(new Date());
            carrierContractRecord.setUpdateTime(new Date());
            carrierContractRecordMapper.updateByPrimaryKeySelective(carrierContractRecord);
            //返回成功消息
            returnResult.setSuccess(true);
            returnResult.setMsg("配送签收成功！");
		}else{
			//返回消息
            returnResult.setSuccess(false);
            returnResult.setMsg("配送签收失败！");
		}
		return returnResult;
	}
	
	
	 /**
	    * 
	    * @Title: listAsGrid 
	    * @Description: TODO(获取货物配送记录信息) 
	    * @param  @param jqPager，ordersDispatchingQueryDTO，q
	    * @param  @return 设定文件返回类型 
	    * @throws 
	    * 备注<p>已检查测试:Green<p>
	    */
	public Object listAsGrid(JqPager jqPager, OrdersDispatchingQueryDTO ordersDispatchingQueryDTO, String q) {
	    JqGridReturn returnResult = new JqGridReturn();
	    OrdersDispatchingExample ordersDispatchingExample = new OrdersDispatchingExample();
	    Criteria queryCriteria = ordersDispatchingExample.createCriteria();
	    ordersDispatchingQueryDTO.setQueryCondition(queryCriteria, q); 
	    if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
	    	ordersDispatchingExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
	    	ordersDispatchingExample.setLimitEnd(jqPager.getRows());
	    }
	    if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
	    	ordersDispatchingExample.setOrderByClause(jqPager.getOrderBy("temp_orders_dispatching_"));
	    }
	    List<OrdersDispatching>   ordersDispatchings = ordersDispatchingMapper.selectByExample(ordersDispatchingExample); // 查询所有广告列表
	    int total = ordersDispatchingMapper.countByExample(ordersDispatchingExample); // 查询总页数
	    returnResult.setRows(ordersDispatchings);
	    returnResult.setTotal(total);
	    return returnResult;// 返回ExtGrid表
	 }
	
	/**
	    * 
	    * @Title: getStorehouseStorageGoodsrunPro 
	    * @Description: 获取货物配送记录对象
	    * @param  @param dispatchingId
	    * @param  @return
	    * @throws 
	    * 备注<p>已检查测试:Green<p>
	    */
	 public Object getOrdersDispatchingPro(String dispatchingId) {
			OrdersDispatching ordersDispatching = ordersDispatchingMapper.selectByPrimaryKey(dispatchingId);
			return ordersDispatching;
	 }
	 
	 /**
	    * @Title: changeOrdersDispatchingStatus 
	    * @Description: 启用/禁用货物配送记录信息
	    * @param  @param dispatchingId
	    * @param  @return
	    * @throws 
	    * 备注<p>已检查测试:Green<p> 
	  */
	 @Transactional(readOnly = false)
	 public Object changeOrdersDispatchingStatus(String dispatchingId){
		    JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		    OrdersDispatching ordersDispatching = ordersDispatchingMapper.selectByPrimaryKey(dispatchingId);
	    	String str="";
	    	if(ordersDispatching.getStatus().equals("enable")){
	    		ordersDispatching.setStatus("disable");
	    		str="禁用";
	    	}else{
	    		ordersDispatching.setStatus("enable");
	    		str="启用";
	    	}
	    	int count=ordersDispatchingMapper.updateByPrimaryKeySelective(ordersDispatching);
	    	if(count==1){
	    		returnResult.setSuccess(true);
	    		returnResult.setMsg("【"+ordersDispatching.getCarrierDisplay()+"】配送记录信息"+str+"操作成功!");
	    	}else{
	    	   returnResult.setSuccess(true);
	   		   returnResult.setMsg("发生未知错误,【"+ordersDispatching.getCarrierDisplay()+"】配送记录信息"+str+"操作失败!");
	    	}
	    	return returnResult;
	 }
	 

	 /**
	    * @Title: checkOrdersDispatchingNumb 
	    * @Description: 货物配送记录信息查询
	    * @param  @param belaidupId
	    * @param  @return
	    * @throws 
	    * 备注<p>已检查测试:Green<p> 
	  */
	 @Transactional(readOnly = false)
	 public Object checkOrdersDispatchingNumb(String belaidupId){
		 JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		 OrdersOrderInfoExample ordersOrder_infoExample= new OrdersOrderInfoExample();
		 ordersOrder_infoExample.createCriteria().andBelaidupIdEqualTo(belaidupId);
		 List<OrdersOrderInfo> ordersOrder_info=ordersOrderInfoMapper.selectByExample(ordersOrder_infoExample);
		 String id=ordersOrder_info.get(0).getOrderId();
		 OrdersOrdispatchingDetailedExample ordersOrdispatchingDetailedExample=new OrdersOrdispatchingDetailedExample();
		 ordersOrdispatchingDetailedExample.createCriteria().andOrderIdEqualTo(id);
		 int numb=ordersOrdispatchingDetailedMapper.countByExample(ordersOrdispatchingDetailedExample);
		 if(numb<=0)
			 returnResult.setSuccess(true);
		 else
			 returnResult.setSuccess(false);
		 return returnResult;
	 }
	 
	 /**
	     * @Title: addContractManager 
	     * @Description: TODO(更改分配记录信息) 
	     * @param @param memberContractType
	     * @param @return    设定文件 
	     * @return Object    返回类型 
	     * @throws
	     */ 
	    @Transactional(readOnly = false)
	    public Object updateDispatching(OrdersDispatching ordersDispatching,OrdersOrdispatchingDetailed ordersOrdispatchingDetailed) {
	        Subject pricipalSubject = SecurityUtils.getSubject();
	        User pricipalUser = (User) pricipalSubject.getPrincipal(); 
	        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	        OrdersOrder ordersOrder=ordersOrderMapper.selectByPrimaryKey(ordersOrdispatchingDetailed.getOrderId());
	        // ordersOrder.setDistributeStatus("hasdistribute");
	        ordersOrder.setOrderStatus("hasconfirmed");//设置订单状态为已确认
	        ordersOrder.setCarrierMemberId(ordersDispatching.getCarrierId());//关联承运商
	        ordersOrder.setUpdater(pricipalUser.getUserId());
	        ordersOrder.setUpdateTime(new Date());
	        int numb=ordersOrderMapper.updateByPrimaryKeySelective(ordersOrder); 
	        if(numb>0){
	        	//查询合同类型--配送
	        	MemberContractTypeExample  memberContractTypeExample=new MemberContractTypeExample();
	        	memberContractTypeExample.createCriteria().andContractTypeNameEqualTo("承运商-平台合同");
	        	MemberContractType memberContractType=(MemberContractType)memberContractTypeMapper.selectByExample(memberContractTypeExample).get(0);
	        	//生成合同信息
	        	CarrierContractRecord carrierContractRecord=new CarrierContractRecord();
	        	carrierContractRecord.setContractRecordId(RandomGUID.getRandomGUID());
	        	carrierContractRecord.setDeliverId(ordersOrder.getOrderCode());//订单编号
	        	carrierContractRecord.setCarrierMemberId(ordersDispatching.getCarrierId());//关联承运商
	        	carrierContractRecord.setContractType(memberContractType.getContractTypeId());//合同类型
	        	carrierContractRecord.setPlatformId("越海物流");
	        	carrierContractRecord.setStatus("enable");
	        	carrierContractRecord.setContractContent("承运商在运输过程中要确保物品完好无损");
	        	carrierContractRecord.setEnableTime(new Date());
	        	carrierContractRecord.setRemark("此合同从订单分配给承运商时即生效");
	        	carrierContractRecord.setCreater(getUserId());
	        	carrierContractRecord.setCreateTime(new Date());
	        	carrierContractRecord.setUpdater(getUserId());
	        	carrierContractRecord.setUpdateTime(new Date());
	        	carrierContractRecordMapper.insert(carrierContractRecord);
	        	 
	        	returnResult.setSuccess(true);
	        	returnResult.setMsg("分配成功!");
	        }else{
	        	returnResult.setSuccess(false);
	        	returnResult.setMsg("分配失败!");
	        } 
	        return returnResult;
	    } 
	     
	    /** 
	     * @Title: addDispatching  
	     * @Description: TODO(生成配送单)  
	     * @param @param ordersDispatching
	     * @param @param ordersOrdispatchingDetailed
	     * @param @return    设定文件  
	     * @return Object    返回类型  
	     * @throws
	     */
	    @Transactional(readOnly = false)
	    public Object addDispatching(OrdersDispatching ordersDispatching,OrdersOrdispatchingDetailed ordersOrdispatchingDetailed) {
	    	Subject pricipalSubject = SecurityUtils.getSubject();
	    	CarrierMember pricipalUser = (CarrierMember) pricipalSubject.getPrincipal();
	    	
	        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
	        int numb_two=0; 
	        OrdersOrder ordersOrder=ordersOrderMapper.selectByPrimaryKey(ordersOrdispatchingDetailed.getOrderId());
	        ordersOrder.setDistributeStatus("hasdistribute"); 
	        ordersOrder.setUpdater(getUserId());
	        ordersOrder.setUpdateTime(new Date());
	        int numb=ordersOrderMapper.updateByPrimaryKeySelective(ordersOrder); 
            SimpleDateFormat sf=new SimpleDateFormat("dd_hh_ss");
	        ordersDispatching.setDispatchingId(RandomGUID.getRandomGUID());
	        ordersDispatching.setDispatchingCode("ST_"+sf.format(new Date()));
	        ordersDispatching.setDispatchingSignfor("notsigned");
	        ordersDispatching.setDispatchingStatus("distribution");
	        ordersDispatching.setStatus("enable");
	        ordersDispatching.setDispatchTime(new Date());
	        ordersDispatching.setArriveTime(new Date());
	        ordersDispatching.setDispatchingGoodsDeposit(ordersOrder.getOrderCost().multiply(new BigDecimal(0.5)));//押金为订单价值的50%
	        ordersDispatching.setCarrierId(pricipalUser.getCarrierMemberId());
	        ordersDispatching.setCreater(getUserId());
	        ordersDispatching.setCreateTime(new Date());
	        ordersDispatching.setUpdater(getUserId());
	        ordersDispatching.setUpdateTime(new Date());
	        numb=ordersDispatchingMapper.insert(ordersDispatching);
	        if(numb>0){
	        	ordersOrdispatchingDetailed.setOrdisdetailedId(RandomGUID.getRandomGUID());
	        	ordersOrdispatchingDetailed.setDispatchingId(ordersDispatching.getDispatchingId());
	            numb_two=ordersOrdispatchingDetailedMapper.insert(ordersOrdispatchingDetailed);
	            //冻结承运商一部分资金  ,取出承运商资金
	            FinanceCarrierExample financeCarrierExample=new FinanceCarrierExample();
	            financeCarrierExample.createCriteria().andCarrierMemberIdEqualTo(pricipalUser.getCarrierMemberId());
	            FinanceCarrier financeCarrier = financeCarrierMapper.selectByExample(financeCarrierExample).get(0);
	            financeCarrier.setCarrierIncome(financeCarrier.getCarrierIncome().subtract(ordersOrder.getOrderCost().multiply(new BigDecimal(0.5))));//余额-冻结金额
	            financeCarrier.setCarrierFreeze(financeCarrier.getCarrierFreeze().add(ordersOrder.getOrderCost().multiply(new BigDecimal(0.5))));//当前冻结金额+以前的
	            //financeCarrier.setCarrierDeduct(financeCarrier.getCarrierDeduct().add(ordersOrder.getOrderCost().multiply(new BigDecimal(0.5))));//扣除金额=以前的+现在的
	            financeCarrier.setUpdateTime(new Date());
	            financeCarrierMapper.updateByPrimaryKeySelective(financeCarrier);//更资金信息
	            //新增资金详细记录
	            FinanceCarrierDetail detail=new FinanceCarrierDetail();
	            detail.setDetailId(RandomGUID.getRandomGUID());
	            detail.setCarrierId(pricipalUser.getCarrierMemberId());
	            detail.setArticleId(ordersOrder.getOrderId());//订单id
	            detail.setDetailIncome(new BigDecimal(0));
	            detail.setDetailFreeze(ordersDispatching.getDispatchingGoodsDeposit());//冻结金额
	            detail.setCreateTime(new Date());
	            detail.setCreater(getUserId() );
	            detail.setRemoveFreeze(new BigDecimal(0));
	            detail.setDetailStatus("normal");
	            detail.setDetailMark(ordersOrder.getOrderCost().multiply(new BigDecimal(0.5)));
	            detail.setDetailReturn(new BigDecimal(0));
	            detail.setRemark("配送冻结押金");
	            detail.setUpdater(getUserId());
	            detail.setUpdateTime(new Date());
	            financeCarrierDetailMapper.insert(detail);//添加资金记录
	            
	        }
	        if(numb>0&&numb_two>0){
	        	returnResult.setSuccess(true);
	        	returnResult.setMsg("配送成功!");
	        }else{
	        	returnResult.setSuccess(false);
	        	returnResult.setMsg("配送失败!");
	        } 
	        return returnResult;
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