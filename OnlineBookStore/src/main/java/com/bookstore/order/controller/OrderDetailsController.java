package com.bookstore.order.controller;





import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.order.entity.OrderDetails;
import com.bookstore.order.service.OrderDetailsService;







@RestController


public class OrderDetailsController  {
	@Autowired
	private OrderDetailsService orderDetailsService;
	
	
	
	
	
	@GetMapping("/vieworderhistory")
	public ResponseEntity<List<OrderDetails>> fetchAllOrders() {
		List<OrderDetails> Orderlist=orderDetailsService.getOrderHistory();
	    return new ResponseEntity<List<OrderDetails>> (Orderlist,HttpStatus.OK);
	}
	
}
	
