package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/streamdata")

public class DriverController {
	
	@Autowired
	AlertService service;
	
	@Autowired
	SlidingWindowService slidingWindowService;

	
	HashMap<String, ClientConfig> configs = ClientConfig.getClientConfigs();
	HashMap<String, TumblingWindow> tws = TumblingWindow.initTumblingWindow(configs);
	HashMap<String, SlidingWindow> sws = SlidingWindow.initSlidingWindow(configs);

	
	

	

	@PostMapping("/sample")
	public void passData(@RequestBody Event event) {
		
//		if(tws.get)
		service.calculate(event,configs.get(event.getClient()),tws.get(event.getClient()));
		System.out.println(event.toString());
		
		slidingWindowService.calcuate(event, configs.get(event.getClient()),sws.get(event.getClient()));
		
		

	}

}
