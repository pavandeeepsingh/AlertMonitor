package com.example.demo;

import java.time.LocalDateTime;

public class Event {
	
	String client;
	
	EventType eventType;
	
	LocalDateTime timeStamp = LocalDateTime.now();
	

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

//	public void setTimeStamp(LocalDateTime timeStamp) {
//		this.timeStamp = timeStamp;
//	}

}
