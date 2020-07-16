package com.bookstore.order.dao;
import org.springframework.data.jpa.repository.JpaRepository;



	
import com.bookstore.order.entity.OrderDetails;


		public interface OrderDetailsDao extends JpaRepository<OrderDetails, Integer> {
		   
		}




