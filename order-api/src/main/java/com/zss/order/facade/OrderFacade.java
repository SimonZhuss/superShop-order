package com.zss.order.facade;

import com.zss.order.request.UserReq;
import com.zss.order.response.BaseResEntity;

import io.swagger.annotations.Api;

/**
 * 对外提供dubbo接口
 * @author zhushanshan
 *
 */
@Api(value = "orderFacade", description = "订单服务接口")
public interface OrderFacade {

	BaseResEntity queryByUser(UserReq user);
}
