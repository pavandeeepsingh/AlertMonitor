package com.example.demo;

public class AlertConfig {
	public AlertConfig(AlertType type, int count, int windowSize) {
		super();
		this.type = type;
		this.count = count;
		this.windowSize = windowSize;
	}
	AlertType type;
	int count;
	long windowSize;

}
