package com.capgemini.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(BookstoreApplication.class);
	
	public static void main(String[] args) {
		logger.info("this is a info message");
		logger.warn("this is a warning message");
		logger.error("this is a error message");
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
