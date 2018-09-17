package com.zss.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zss.order.domain.OrderInfo;
import com.zss.order.repository.OrderRepository;
import com.zss.order.request.UserReq;
import com.zss.order.response.BaseResEntity;
import com.zss.order.response.ResponseEntity;
import com.zss.order.service.OrderService;

/**
 * 订单实现类
 * @author zhushanshan
 * 2017年11月18日 下午3:14:41
 */
@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;
	

	@Override
	public BaseResEntity queryByUser(UserReq user) {
		List<OrderInfo> result = orderRepository.queryByUserId(1l);
		return ResponseEntity.success(result);
	}
}
