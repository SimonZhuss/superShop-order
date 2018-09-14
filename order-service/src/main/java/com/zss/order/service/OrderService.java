package com.zss.order.service;

import com.zss.order.request.UserReq;
import com.zss.order.response.BaseResEntity;

/**
 * 用户服务层
 * @author zhushanshan
 * 2017年11月18日 下午2:30:41
 */
public interface OrderService {

	public BaseResEntity queryByUser(UserReq user);
}
