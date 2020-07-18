package com.bookstore.order.service;



import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.order.dao.OrderDetailsDao;
import com.bookstore.order.entity.OrderDetails;
import com.bookstore.order.exception.OrderNotFoundException;





/*************************************************************
 * @author        Anjali Sharma
 * Description    It is an implementation of orderdetails service 
 * Version        1.0
 * Created Date   16-JULY-2020 
 *************************************************************/

@Service
@Transactional
public class OrderDetailsServiceImpl implements OrderDetailsService {
	
	    /**
	     *  It is autowired dao class named as orderDetailsDao
	    **/
        @Autowired
       
		private OrderDetailsDao orderDetailsDao;
        public OrderDetailsServiceImpl() {
        	
        }

        /**
         *  It is the implemented method of service class
         *  for the list of all the order details
        **/
		@Override
		public List<OrderDetails> getOrderHistory() {
				return orderDetailsDao.findAll();
			}
		
}