package com.siwoku.eventcalendar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "id_cohort")
	private Integer idCohort;

	@Column(length = 100)
	private String name;

	@Column(unique = true, length = 100, nullable = false)
	private String email;

	@Column(length = 100)
	private String password;

	@Column(name = "registered")
	private Boolean isRegistered;
	
	public User() { }

	public User(Integer idCohort, String name, String email, String password, Boolean isRegistered) {
		this.idCohort = idCohort;
		this.name = name;
		this.email = email;
		this.password = password;
		this.isRegistered = isRegistered;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdCohort() {
		return idCohort;
	}

	public void setIdCohort(Integer idCohort) {
		this.idCohort = idCohort;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsRegistered() {
		return isRegistered;
	}

	public void setIsRegistered(Boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

}
