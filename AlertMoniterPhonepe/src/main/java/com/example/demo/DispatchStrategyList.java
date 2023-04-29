package com.example.demo;


public class DispatchStrategyList {
	public DispatchStrategyList(DispatcherType type, String message) {
		super();
		this.type = type;
		this.message = message;
	}
	DispatcherType type;
	String message;
}
