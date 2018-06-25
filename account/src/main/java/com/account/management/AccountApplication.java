package com.account.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.account.management.details.User;
import com.account.management.repository.UserRepository;

@SpringBootApplication
public class AccountApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Jack", "Smith"));
		userRepository.save(new User("Jane", "Smith"));
		userRepository.save(new User("Angela", "Merkel"));
		userRepository.save(new User("Reese", "Witherspoon"));
		userRepository.save(new User("Bruce", "Lee"));
		
	}
}
