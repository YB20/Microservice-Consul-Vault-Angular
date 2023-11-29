package com.example.customerservice;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repos.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.saveAll(List.of(
					Customer.builder().name("Youssef").email("youssef@gmail.com").build(),
					Customer.builder().name("Ayoub").email("ayoub@gmail.com").build(),
					Customer.builder().name("Imane").email("imane@gmail.com").build()
			));
			customerRepository.findAll().forEach(System.out::println);
		};
	}

}
