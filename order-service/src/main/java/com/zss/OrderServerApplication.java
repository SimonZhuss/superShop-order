package com.zss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.alibaba.dubbo.container.Main;
import com.zss.order.config.DruidProperties;

/**
 * 用户服务启动类
 * @author zhushanshan
 * 2017年11月1日 下午5:51:41
 */
@SpringBootApplication(scanBasePackages = "com.zss.order")
@EnableConfigurationProperties(value = {DruidProperties.class})
@SpringBootConfiguration
public class OrderServerApplication {

    public static void main(String[] args) {
    	SpringApplication application = new SpringApplicationBuilder()
				.web(false)
				.sources(OrderServerApplication.class)
				.build();
		application.setWebEnvironment(false);
		application.run(args);
		synchronized (Main.class) {
			while (true) {
				try {
					Main.class.wait();
				} catch (Throwable e) {
				}
			}
		}
    }
}
