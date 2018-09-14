package com.zss.order.test;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.zss.order.request.UserReq;
import com.zss.order.service.OrderService;

@EnableAutoConfiguration
public class OrderServiceTest extends BaseTestRoot{

	@Autowired
    private OrderService orderService;
	
	@Test
	public void queryByUser(){
		UserReq user = new UserReq();
		user.setName("aa");
		orderService.queryByUser(user);
	}
}
