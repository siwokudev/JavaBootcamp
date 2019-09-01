package com.siwoku.eventcalendar.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "event")
public class Event {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "id_eventtype" , nullable = false)
	private Integer idEventType;
	
	@Column(name = "id_location", nullable = false)
	private Integer idLocation;
	
	@Column(name = "date_time" , nullable = false)
	private Date date;
	
	@Column(nullable = false)
	private String name;

	private String link;
	@Column(nullable = false)
	
	private String address;
	@Column(nullable = false)
	
	private String latitud;
	@Column(nullable = false)
	
	private String longitud;
	
	private String description;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Event() {}

	public Event(Integer id, Integer idEventType, Integer idLocation, Date date, String name, String link, String address,
			String latitud, String longitud, String description) {
		super();
		this.id = id;
		this.idEventType = idEventType;
		this.idLocation = idLocation;
		this.date = date;
		this.name = name;
		this.link = link;
		this.address = address;
		this.latitud = latitud;
		this.longitud = longitud;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdEventType() {
		return idEventType;
	}

	public void setIdEventType(Integer idEventType) {
		this.idEventType = idEventType;
	}

	public Integer getIdLocation() {
		return idLocation;
	}

	public void setIdLocation(Integer idLocation) {
		this.idLocation = idLocation;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", idEventType=" + idEventType + ", idLocation=" + idLocation + ", date=" + date
				+ ", name=" + name + ", link=" + link + ", address=" + address + ", latitud=" + latitud + ", longitud="
				+ longitud + ", description=" + description + "]";
	}
}
