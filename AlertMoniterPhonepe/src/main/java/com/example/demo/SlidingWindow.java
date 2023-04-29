package com.example.demo;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SlidingWindow {
	
	

    LocalDateTime timeStamp = LocalDateTime.now();
	Queue<Event> queue = new LinkedList<>();
	
	
	public static HashMap<String, SlidingWindow> initSlidingWindow(HashMap<String, ClientConfig> map) {
		HashMap<String, SlidingWindow> sw = new HashMap<>();
		for (Map.Entry<String, ClientConfig> entry : map.entrySet()) {
			if (entry.getValue().alertConfig.type == AlertType.SLIDING_WINDOW) {
				sw.put(entry.getKey(), new SlidingWindow());
			}
		}
		return sw;
	}

}
