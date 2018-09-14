package com.zss.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zss.order.domain.OrderInfo;

@Repository
public interface OrderRepository extends JpaRepository<OrderInfo, Long>{
	
	List<OrderInfo> queryByUserId(Long userId);
}