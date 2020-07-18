package com.bookstore.order.dao;

	
	
import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.order.entity.BookDetails;



	public interface BookDetailsDao extends JpaRepository<BookDetails, Integer> {
		
	   
	}



