package com.seckill.model;

import com.seckill.model.base.BaseDO;

/**
 * 库存表
 * 
 * @author liliang
 *
 */
public class SeckStock extends BaseDO {

	private Integer commodityId;
	private Integer stock;

	public Integer getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "SeckStock [commodityId=" + commodityId + ", stock=" + stock + "]";
	}

}
