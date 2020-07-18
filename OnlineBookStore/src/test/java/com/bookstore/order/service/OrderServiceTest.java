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
		OrderDetails order = new OrderDetails();
		order.setOrderId(1);
		order.setQty(5);
		order.setSubtotal(500);
		order.setTotal(550);
		order.setStatus("ordered");
		order.setPayment("COD");
Mockito.when(ticketBookingDao.save(order)).thenReturn(order);

	    assertThat(ticketBookingService.getOrderHistory()).isEqualTo(order);
	
	}
	
		
	}


