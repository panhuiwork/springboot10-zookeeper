package com.geral.springboot10.ticket;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.geral.springboot10.ticket.service.TicketServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot10zookeeperTicketApplicationTests {

	@Autowired
	TicketServiceImpl ticketServiceImpl;
	
	@Test
	public void contextLoads() {
		System.out.println("ticketServiceImpl.getTicket()"+ticketServiceImpl.getTicket());
	}

}

