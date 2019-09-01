package com.siwoku.eventcalendar.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.siwoku.eventcalendar.model.Cohort;

@Repository
public interface CohortRepository extends CrudRepository<Cohort,Integer> {
	Optional<Cohort> findByName(String name);
}
