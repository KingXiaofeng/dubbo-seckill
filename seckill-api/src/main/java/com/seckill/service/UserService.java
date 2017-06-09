package com.seckill.service;

import com.seckill.exception.ServiceException;
import com.seckill.result.ResultDO;

/**
 * 用户服务
 * @author SongCi
 *
 */
public interface UserService {
	/**
	 * 用户登录服务
	 * @param name
	 * @param pwd
	 * @return
	 * @throws ServiceException
	 */
	ResultDO login(String name, String pwd)throws ServiceException;
    /**
     * 用户注册服务
     * @param object
     * @return
     * @throws ServiceException
     */
	ResultDO register(Object object)throws ServiceException ;

}
