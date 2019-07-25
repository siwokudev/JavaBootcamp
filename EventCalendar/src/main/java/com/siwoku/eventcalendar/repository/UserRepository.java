package com.siwoku.eventcalendar.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.siwoku.eventcalendar.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	Optional<User> findByEmail(String email);

}
