package com.seckill.service;

import com.seckill.result.ResultDO;

/**
 * 库存服务
 * @author SongCi
 *
 */
public interface StockService {
	/**
	 * 获取商品库存
	 * @param id
	 * @return
	 */
	ResultDO getCommodityStock(Integer id);

}
