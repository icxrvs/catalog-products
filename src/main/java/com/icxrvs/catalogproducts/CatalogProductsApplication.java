package com.icxrvs.catalogproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CatalogProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogProductsApplication.class, args);
	}

}
