package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestCoinfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User a1 = new User(null, "Paulo Cardoso", "paulocardoso@gmail.com", "19997074340", "123456"); 
		User b1 = new User(null, "Reginaldo Cardoso", "reginaldocardoso@gmail.com", "19997074340", "123456"); 
		
		userRepository.saveAll(Arrays.asList(a1, b1));
	}
	
	

}
