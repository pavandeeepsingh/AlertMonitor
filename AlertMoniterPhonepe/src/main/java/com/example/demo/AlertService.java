package com.example.demo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;


@Component
public class AlertService {
	
	
	public void calculate(Event event,ClientConfig config, TumblingWindow tWindow)
	{

		LocalDateTime current = event.getTimeStamp();
		Duration duration = Duration.between(tWindow.initialTimeStamp, current);
		long diffSeconds  = TimeUnit.SECONDS.toSeconds(duration.toSeconds());

		
	
		
		if (diffSeconds <= config.alertConfig.windowSize) {
			tWindow.currentCount++;
			if (tWindow.currentCount == config.alertConfig.count) {
				System.out.println(
						"Dispatched for client " + event.client + "Tumbling***************" + current.toString());
				tWindow.currentCount = 0;
			}
		} else {
			tWindow.currentCount = 1;
			tWindow.initialTimeStamp = current.minusSeconds(diffSeconds % config.alertConfig.windowSize);

		}

	}

}
