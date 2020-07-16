package com.bookstore.order.controller;





import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.order.entity.OrderDetails;
import com.bookstore.order.service.OrderDetailsService;




@CrossOrigin(origins="http://localhost:4200")
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
	
