package com.bookstore.order.service;



import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.order.dao.OrderDetailsDao;
import com.bookstore.order.entity.OrderDetails;





@Service
@Transactional
public class OrderDetailsServiceImpl implements OrderDetailsService {
	
        @Autowired
		private OrderDetailsDao orderDetailsDao;

		
		public List<OrderDetails> getOrderHistory() {
				return orderDetailsDao.findAll();
			}
        
       


		
			
}