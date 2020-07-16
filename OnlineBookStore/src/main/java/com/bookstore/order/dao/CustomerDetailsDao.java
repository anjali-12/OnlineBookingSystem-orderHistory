package com.bookstore.order.dao;


	
	

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.order.entity.CustomerDetails;


	public interface CustomerDetailsDao extends JpaRepository<CustomerDetails, Integer> {
	   
	}

