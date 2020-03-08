package com.ford.ierp.cims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
@SpringBootApplication
public class IerpApplication {

	public static void main(String[] args) {
		SpringApplication.run(IerpApplication.class, args);
	}

}
