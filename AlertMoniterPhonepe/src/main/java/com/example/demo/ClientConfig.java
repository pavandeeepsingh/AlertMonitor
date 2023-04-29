package com.example.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ClientConfig {

	String client;
	EventType eventType;
	AlertConfig alertConfig;
	List<DispatchStrategyList> dispatcherList;

	public static HashMap<String, ClientConfig> getClientConfigs() {
		
		
//		 try {
//		      File myObj = new File("config.txt");
//		      Scanner myReader = new Scanner(myObj);
//		      while (myReader.hasNextLine()) {
//		        String data = myReader.nextLine();
//		        System.out.println(data);
//		      }
//		      myReader.close();
//		    } catch (FileNotFoundException e) {
//		      System.out.println("An error occurred.");
//		      e.printStackTrace();
//		    }
//		
		
		
		AlertConfig alert = new AlertConfig(AlertType.TUMBLING_WINDOW, 10, 60);
		DispatchStrategyList list = new DispatchStrategyList(DispatcherType.CONSOLE, "payment Exception");
		DispatchStrategyList list1 = new DispatchStrategyList(DispatcherType.CONSOLE, "User Exception");
		ArrayList<DispatchStrategyList> disList = new ArrayList<>();
		disList.add(list1);
		disList.add(list);
		ClientConfig config = new ClientConfig("X", EventType.USERSERVICE_EXCEPTION, alert, disList);
		HashMap<String, ClientConfig> map = new HashMap<>();
		map.put("X", config);

		return map;

	}

	public ClientConfig(String client, EventType eventType, AlertConfig alertConfig,
		List<DispatchStrategyList> dispatcherList) {
		super();
		this.client = client;
		this.eventType = eventType;
		this.alertConfig = alertConfig;
		this.dispatcherList = dispatcherList;
	}

}
