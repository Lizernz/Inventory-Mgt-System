package com.example.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Product;


@SpringBootApplication(scanBasePackages = {"com.example.demo"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(ProductRepository productRepository) {
		return args -> {
		Product product1 = new Product();
		product1.setName("Sample Product1");
		product1.setPrice(19.99);
		product1.setQuantity(50);

		Product product2 = new Product();
		product2.setName("Sample Product2");
		product2.setPrice(9.99);
		product2.setQuantity(100);

		productRepository.save(product1);
		productRepository.save(product2);

		System.out.println("Products have been added to the database");

	};
		

	}

}
