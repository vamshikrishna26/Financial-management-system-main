package com.Bankmanagementapp.AndhraState;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class AndhraStateApplication {

	public static void main(String[] args) {
		SpringApplication.run(AndhraStateApplication.class, args);
		System.out.println("Enter the bank.......");
	}

}

