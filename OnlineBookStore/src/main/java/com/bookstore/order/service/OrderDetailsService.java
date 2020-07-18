package com.bookstore.order.service;

import java.util.List;

import com.bookstore.order.entity.OrderDetails;

/*************************************************************
 * @author        Anjali Sharma
 * Description    It is an service interface  of order details 
 * Version        1.0
 * Created Date   16-JULY-2020 
 *************************************************************/

public interface OrderDetailsService {

	/**
	 *  It specifies the method interface and shows the orderhistory
	**/
	List<OrderDetails> getOrderHistory();
	

}
