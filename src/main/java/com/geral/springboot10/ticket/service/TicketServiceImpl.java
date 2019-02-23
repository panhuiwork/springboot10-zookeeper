package com.geral.springboot10.ticket.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;


@Service(version="1.0.0") //dubbo的@service将服务发布出去
@Component
public class TicketServiceImpl implements TicketService{

	@Override
	public String getTicket() {
		return "《速度与激情》";
	}

}
