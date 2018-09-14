package com.zss.order.domain;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "tb_order")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
    
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_amount")
	private String productAmount;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "order_status")
	private Integer orderStatus;
	
	@Column(name = "create_time")
	private Date createTime;
	
	@Column(name = "modify_time")
	private Date modifyTime;
}