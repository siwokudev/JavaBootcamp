package com.siwoku.eventcalendar.test;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.siwoku.eventcalendar.model.Cohort;
import com.siwoku.eventcalendar.model.Event;
import com.siwoku.eventcalendar.model.EventType;
import com.siwoku.eventcalendar.model.User;
import com.siwoku.eventcalendar.repository.CohortRepository;
import com.siwoku.eventcalendar.repository.EventRepository;
import com.siwoku.eventcalendar.repository.EventTypeRepository;
import com.siwoku.eventcalendar.repository.UserRepository;



@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CohortRepository cohortRepository;
	
	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private EventTypeRepository eventTypeRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Cohort myCohort;
		myCohort = cohortRepository.findByName("Cohort 15").get();
		
		User myUser = new User();
		myUser.setName("Jaime");
		myUser.setEmail("ajimenez101287@gmail.com");
		myUser.setPassword("1234");
		myUser.setIsRegistered(true);
		myUser.setCohort(myCohort);
		
		//myUser = userRepository.save(myUser);
		
		Optional<User> optUser = userRepository.findByEmail("ajimenez101287@gmail.com");
		if (optUser.isPresent()) {
			System.out.println("hola mundo " + optUser.get().getCohort().getName());	
		} else {
			System.out.println("no existe el putito");
		}
		
		List<Cohort> cohorts = (List<Cohort>) cohortRepository.findAll();
		for(Cohort c : cohorts) {
			System.out.println(c.getName());
		}
		
		List<Event> events = (List<Event>) eventRepository.findAll();
		for(Event c : events) {
			System.out.println(c.toString());
		}
		
		List<EventType> eventTypes = (List<EventType>) eventTypeRepository.findAll();
		for(EventType c : eventTypes) {
			System.out.println(c.getType());
		}
//		User user = new User(1, "Jaimir", "jaimir@hotmail.com", "abc123", true);
//		
//		userRepository.save(user);
//		
//		System.out.println("hola mundo " + userRepository.findById(2).get().getName());
	}

}
