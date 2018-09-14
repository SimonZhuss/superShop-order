package com.zss.order.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.zss.OrderServerApplication;
import com.zss.order.repository.OrderRepository;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ContextConfiguration(classes = OrderServerApplication.class)
@EnableAutoConfiguration
@ActiveProfiles("dev")	// 使用 application-dev.properties 本地测试
@EnableJpaRepositories(basePackages = {"com.zss.order"})
@EntityScan(basePackages = {"com.zss.order.domain"})
public class BaseTestRoot {

	@Autowired
	protected OrderRepository orderRepository;

}
