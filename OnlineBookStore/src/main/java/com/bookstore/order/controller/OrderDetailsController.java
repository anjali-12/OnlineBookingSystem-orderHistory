package com.bookstore.order.controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.order.entity.OrderDetails;
import com.bookstore.order.service.OrderDetailsService;

import org.springframework.web.bind.annotation.PathVariable;



/*************************************************************
 * @author        Anjali Sharma
 * Description    It is a constructor class
 * Version        1.0
 * Created Date   15-MAY-2020 
 *************************************************************/


@RestController
public class OrderDetailsController  {
	/*************************************************************
	 * @author        Anjali Sharma
	 * Description    It is an autowired service class field
	 *************************************************************/
	@Autowired
	private OrderDetailsService orderService;
	
	
	
	
	/*************************************************************
	 * @author        Anjali Sharma
	 * Description    It is an REST API which shows all the list of 
	 * orders
	 *************************************************************/
	@GetMapping("/vieworderhistory")
	public ResponseEntity<List<OrderDetails>> fetchAllOrders() {
		final List<OrderDetails> orderList=orderService.getOrderHistory();
	    return new ResponseEntity<List<OrderDetails>> (orderList,HttpStatus.OK);
	}
	
}
	
