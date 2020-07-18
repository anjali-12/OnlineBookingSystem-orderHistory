package com.bookstore.order;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class OnlineBookStoreApplication {
	private static final Logger logger = LoggerFactory.getLogger(OnlineBookStoreApplication.class);

	public static void main(String[] args) {
		logger.info("this shows list of all orders");
		   logger.warn("this is a warn message");
		   logger.error("this is a error message");
		SpringApplication.run(OnlineBookStoreApplication.class, args);
	}

}



