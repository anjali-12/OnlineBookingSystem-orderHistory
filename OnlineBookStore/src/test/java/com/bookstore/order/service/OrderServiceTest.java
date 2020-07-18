package com.bookstore.order.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

import com.bookstore.order.dao.OrderDetailsDao;
import com.bookstore.order.entity.OrderDetails;

@RunWith(SpringRunner.class)
@SpringBootTest
class OrderServiceTest {
	@Autowired
	private OrderDetailsService ticketBookingService;
	
	@MockBean
	private OrderDetailsDao ticketBookingDao;

	@Test
	void test() {
		OrderDetails ticket = new OrderDetails();
		ticket.setOrderId(1);
		ticket.setQty(5);
		ticket.setSubtotal(500);
		ticket.setTotal(550);
		ticket.setStatus("ordered");
		ticket.setPayment("COD");
Mockito.when(ticketBookingDao.save(ticket)).thenReturn(ticket);
	    
	    assertThat(ticketBookingService.getOrderHistory()).isEqualTo(ticket);
	
	}
	
		
	}


