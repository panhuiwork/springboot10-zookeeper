package com.geral.springboot10.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.将服务器提供者注册到注册中心
 * 	1.引入dubbo和zkclient相关依赖
 * 	2.配置dubbo的扫描包和注册中心地址
 *  3.使用@service发布服务（dubbo的@service）
 * @author Panhui
 *
 */
@SpringBootApplication
public class Springboot10zookeeperTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot10zookeeperTicketApplication.class, args);
	}

}

