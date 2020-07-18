package com.bookstore.order.dao;
import org.springframework.data.jpa.repository.JpaRepository;



	
import com.bookstore.order.entity.OrderDetails;

/*************************************************************
 * @author        Anjali Sharma
 * Description    It is an interface jpa repository of orderDetails
 * Version        1.0
 * Created Date   16-JULY-2020 
 *************************************************************/
		public interface OrderDetailsDao extends JpaRepository<OrderDetails, Integer> {
		   
		}




