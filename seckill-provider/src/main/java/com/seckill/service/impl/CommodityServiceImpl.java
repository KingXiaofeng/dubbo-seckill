package com.seckill.service.impl;

import com.seckill.exception.ServiceException;
import com.seckill.model.Commidity;
import com.seckill.result.ResultDO;
import com.seckill.service.CommodityService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangxf on 2017/6/9.
 */
public class CommodityServiceImpl implements CommodityService{
    public ResultDO countAllCommodity(Boolean type) {
        // TODO Auto-generated method stub
        ResultDO resultDO = new ResultDO();
        // 得到数量
        if (type) {
            resultDO.setMessage("秒杀商品数量");
            resultDO.setResult(23);
        } else {
            resultDO.setMessage("普通商品数量");
            resultDO.setResult(256);
        }
        return resultDO;
    }

    public ResultDO getAllCommodityList(Integer start, Integer stop, Boolean type) {
        // TODO Auto-generated method stub
        ResultDO resultDO = new ResultDO();
        List<Commidity> commidities = new ArrayList<Commidity>();
        for (int i = 0; i <= 10; i++) {
            Commidity commidity = new Commidity();
            commidity.setId(i);
            commidity.setSellerId(i);
            commidity.setName("测试商品" + i);

            commidities.add(commidity);
        }
        if (type) {
            resultDO.setMessage("秒杀商品");
            resultDO.setResult(commidities);
        } else {
            resultDO.setMessage("普通商品");
            resultDO.setResult(commidities);
        }
        return resultDO;
    }

    public ResultDO getMyStoreList(Integer id) {
        // TODO Auto-generated method stub
        ResultDO resultDO = new ResultDO();
        List<Commidity> commidities = new ArrayList<Commidity>();
        for (int i = 0; i <= 10; i++) {
            Commidity commidity = new Commidity();
            commidity.setId(i);
            commidity.setSellerId(i);
            commidity.setName("测试商品" + i);

            commidities.add(commidity);
        }
        if (true) {
            resultDO.setSuccess(true);
            resultDO.setMessage("得到我的店铺商品列表");
            resultDO.setResult(commidities);
        } else {
            resultDO.setSuccess(false);
            resultDO.setMessage("未得到我的店铺商品列表");
        }
        return resultDO;
    }

    public ResultDO getMyShoppingCartList(Integer id) {
        // TODO Auto-generated method stub
        ResultDO resultDO = new ResultDO();
        List<Commidity> commidities = new ArrayList<Commidity>();
        for (int i = 0; i <= 10; i++) {
            Commidity commidity = new Commidity();
            commidity.setId(i);
            commidity.setSellerId(i);
            commidity.setName("测试商品" + i);

            commidities.add(commidity);
        }
        if (true) {
            resultDO.setSuccess(true);
            resultDO.setMessage("得到我的购物车商品列表");
            resultDO.setResult(commidities);
        } else {
            resultDO.setSuccess(false);
            resultDO.setMessage("未得到我的购物车商品列表");
        }
        return resultDO;
    }

    public ResultDO addCommodity(Commidity commidity) throws ServiceException {
        // TODO Auto-generated method stub
        ResultDO resultDO = new ResultDO();
        // 商品添加

        if (true) {
            resultDO.setSuccess(true);
            resultDO.setMessage("商品添加成功");
        } else {
            resultDO.setSuccess(false);
            resultDO.setMessage("商品添加失败");
        }
        return resultDO;
    }

    public ResultDO getcommodityInfo(Commidity commidity) {
        // TODO Auto-generated method stub
        ResultDO resultDO = new ResultDO();
        // 商品详情

        resultDO.setSuccess(true);
        resultDO.setMessage("商品详情获取成功");
        resultDO.setResult("商品详情商品详情商品详情商品详情商品详情商品详情商品详情");
        return resultDO;
    }
}
