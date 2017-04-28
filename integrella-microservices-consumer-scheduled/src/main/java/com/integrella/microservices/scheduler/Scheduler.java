package com.integrella.microservices.scheduler;

import org.springframework.scheduling.annotation.Scheduled;

public interface Scheduler {
	@Scheduled
	public void scheduleStartComponent();

	@Scheduled
	public void scheduleStopComponent();
	
	default public void registerSchedule(){
		scheduleStartComponent();
		scheduleStopComponent();
	}
}
