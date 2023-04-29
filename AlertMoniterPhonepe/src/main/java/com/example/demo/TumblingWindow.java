package com.example.demo;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class TumblingWindow {
	int currentCount = 0;
	LocalDateTime initialTimeStamp = LocalDateTime.now();

	public static HashMap<String, TumblingWindow> initTumblingWindow(HashMap<String, ClientConfig> map) {
		HashMap<String, TumblingWindow> tw = new HashMap<>();
		for (Map.Entry<String, ClientConfig> entry : map.entrySet()) {
			if (entry.getValue().alertConfig.type == AlertType.TUMBLING_WINDOW) {
				tw.put(entry.getKey(), new TumblingWindow());
			}
		}
		return tw;
	}

}
