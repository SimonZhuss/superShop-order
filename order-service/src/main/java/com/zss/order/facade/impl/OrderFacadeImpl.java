package com.zss.order.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zss.order.facade.OrderFacade;
import com.zss.order.request.UserReq;
import com.zss.order.response.BaseResEntity;
import com.zss.order.service.OrderService;

@Service
public class OrderFacadeImpl implements OrderFacade{
	
	@Autowired
    private OrderService orderService;
    

	@Override
	public BaseResEntity queryByUser(UserReq user) {
		BaseResEntity result =orderService.queryByUser(user);
    	return result;
	}

}
