package com.bookstore.order.service;

import java.util.List;

import com.bookstore.order.entity.OrderDetails;

public interface OrderDetailsService {

	List<OrderDetails> getOrderHistory();

}
