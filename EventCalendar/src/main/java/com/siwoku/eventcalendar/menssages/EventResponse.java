package com.siwoku.eventcalendar.menssages;

public class EventResponse {
	private String id;
	private String title;
	private String start;

	public EventResponse(String id, String title, String start) {
		super();
		this.id = id;
		this.title = title;
		this.start = start;
	}

	public EventResponse() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

}
