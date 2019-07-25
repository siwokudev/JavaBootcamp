package com.siwoku.eventcalendar.model;

import java.util.Date;

public class Event {
	private int id;
	private int idEventType;
	private int idLocation;
	private Date date;
	private String name;
	private String link;
	private String address;
	private String lattitud;
	private String longitud;
	
	public Event() {}

	public Event(int id, int idEventType, int idLocation, Date date, String name, String link, String address,
			String lattitud, String longitud) {
		super();
		this.id = id;
		this.idEventType = idEventType;
		this.idLocation = idLocation;
		this.date = date;
		this.name = name;
		this.link = link;
		this.address = address;
		this.lattitud = lattitud;
		this.longitud = longitud;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdEventType() {
		return idEventType;
	}

	public void setIdEventType(int idEventType) {
		this.idEventType = idEventType;
	}

	public int getIdLocation() {
		return idLocation;
	}

	public void setIdLocation(int idLocation) {
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

	public String getLattitud() {
		return lattitud;
	}

	public void setLattitud(String lattitud) {
		this.lattitud = lattitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
}
