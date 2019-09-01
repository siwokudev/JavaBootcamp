package com.siwoku.eventcalendar.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siwoku.eventcalendar.menssages.EventResponse;
import com.siwoku.eventcalendar.model.Event;
import com.siwoku.eventcalendar.repository.EventRepository;

@RestController
public class EventController {
	
	@Autowired
	EventRepository repo; 
	
	@GetMapping(value = "/eventos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EventResponse> getEvents(){
		
		List<Event> events = (List<Event>) repo.findAll();
		List<EventResponse> eventsResponse = new ArrayList<EventResponse>();
		for(Event e : events) {
			eventsResponse.add(new EventResponse(e.getId().toString(),e.getName(),e.getDate().toString()));
		}
		
		return eventsResponse;
	}
}
