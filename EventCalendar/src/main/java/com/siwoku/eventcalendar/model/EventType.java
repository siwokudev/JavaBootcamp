package com.siwoku.eventcalendar.model;

public class EventType {
	private int id;
	private EventType type;
	
	public EventType() {}
	
	public EventType(int id, EventType type) {
		super();
		this.id = id;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}
}
