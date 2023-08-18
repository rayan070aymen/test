package com.plantatree.web;

import com.plantatree.web.model.Item;
import com.plantatree.web.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner (ItemRepository repository) {
		return args -> {
			repository.save(new Item(null, "Hichem", "Hamza", "Hicehm@test"));
		};
	}
}

