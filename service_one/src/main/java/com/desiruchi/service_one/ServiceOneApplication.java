package com.desiruchi.service_one;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceOneApplication {

	public static void main(String[] args) {

		final Logger logger = LogManager.getLogger(ServiceOneApplication.class);
		logger.debug("Debugging log");
		logger.info("Info log");
		logger.warn("Hey, This is a warning!");
		logger.error("Oops! We have an Error. OK");
		logger.fatal("Damn! Fatal error. Please fix me.");

		SpringApplication.run(ServiceOneApplication.class, args);
	}
}
