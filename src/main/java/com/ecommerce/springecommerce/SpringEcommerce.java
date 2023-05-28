package com.ecommerce.springecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//DE MOMENTO EXCLUIMOS LA BBDD
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringEcommerce {

	private static Logger logger = LoggerFactory.getLogger(SpringEcommerce.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringEcommerce.class, args);
		logger.warn("Mensaje warn");
		logger.debug("Mensaje debug");
		logger.info("Mensaje info");

	}

}
