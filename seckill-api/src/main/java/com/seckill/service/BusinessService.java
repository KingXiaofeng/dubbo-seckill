package com.seckill.service;

import com.seckill.exception.ServiceException;
import com.seckill.model.Order;
import com.seckill.model.Shopppig;
import com.seckill.result.ResultDO;

/**
 * 交易服务
 * @author wangxf
 *
 */
public interface BusinessService {
	/**
	 * 加入购物车
	 * @param shopppig
	 * @return
	 */
	ResultDO addShoppingCart(Shopppig shopppig) throws ServiceException; ;
	/**
	 * 支付订单(改变订单状态)
	 * @param id
	 * @param orderStats
	 * @return
	 */
	ResultDO toPay(Integer id, Integer orderStats)throws ServiceException;;
	/**
	 * 查看店铺订单
	 * @param sellerId
	 * @return
	 */
	ResultDO getMyStoreOrder(Integer sellerId);
	/**
	 * 生成订单
	 * @param order
	 * @return
	 */
	ResultDO addOrder(Order order) throws ServiceException;;
	/**
	 *查看我的订单列表 
	 * @param buyersId
	 * @return
	 */
	ResultDO getMyOrderList(Integer buyersId);

}
