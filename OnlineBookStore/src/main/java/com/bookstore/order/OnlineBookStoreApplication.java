package com.bookstore.order;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/*************************************************************
 * @author        Anjali Sharma
 * Description    It is a Spring Boot Main Class
 * Version        1.0
 * Created Date   06-MAY-2020 
 *************************************************************/
@SpringBootApplication
public class OnlineBookStoreApplication {
/*************************************************************
* @author        Anjali Sharma
* Description    It is a logger field
*************************************************************/
private static final Logger LOGGER = LoggerFactory.getLogger(OnlineBookStoreApplication.class);
public OnlineBookStoreApplication()
{
}
/*************************************************************
* @author        Anjali Sharma
* Description    It is a Spring Boot Main method
* Version        1.0
* Created Date   06-MAY-2020 
*************************************************************/
public static void main( final String[] args) {
LOGGER.info("this shows list of all orders");
LOGGER.warn("this is a warn message");
LOGGER.error("this is a error message");
SpringApplication.run(OnlineBookStoreApplication.class, args);  
	}

}



