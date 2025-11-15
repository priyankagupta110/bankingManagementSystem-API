package com.BankingManagementAPI;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j // create static variable, variable name = org.slf4j.Logger log
@SpringBootApplication
public class BankingManagementApiApplication {

	public static void main(String[] args) {

        SpringApplication.run(BankingManagementApiApplication.class, args);
	    log.info("Application started.");
    }

}
