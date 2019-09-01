package com.siwoku.eventcalendar.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.siwoku.eventcalendar.model.EventType;



@Repository
public interface EventTypeRepository extends CrudRepository<EventType, Integer>{
	Optional<EventType> findByType(String type);
}
