package com.siwoku.eventcalendar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.siwoku.eventcalendar.model.Event;


@Repository
public interface EventRepository extends CrudRepository<Event, Integer>{

}
