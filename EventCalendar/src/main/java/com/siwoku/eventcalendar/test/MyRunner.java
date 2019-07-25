package com.siwoku.eventcalendar.test;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.siwoku.eventcalendar.model.User;
import com.siwoku.eventcalendar.repository.UserRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Optional<User> optUser = userRepository.findByEmail("ajimenezs101287@gmail.com");
		if (optUser.isPresent()) {
			System.out.println("hola mundo " + optUser.get().getName());	
		} else {
			System.out.println("no existe el putito");
		}
		
		
		
//		User user = new User(1, "Jaimir", "jaimir@hotmail.com", "abc123", true);
//		
//		userRepository.save(user);
//		
//		System.out.println("hola mundo " + userRepository.findById(2).get().getName());
	}

}
