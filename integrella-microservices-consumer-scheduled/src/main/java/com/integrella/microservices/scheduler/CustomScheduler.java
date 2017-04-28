package com.integrella.microservices.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CustomScheduler implements Scheduler {
	
	@Autowired
	private MessageChannel controlChannel;
	
	private CustomScheduler(){};
	
	@Autowired
	public CustomScheduler(MessageChannel controlChannel) {
		this.controlChannel = controlChannel;
	}
	
	@Override
	@Scheduled(cron="0 0 15 ? * MON,TUE,WED,THU,FRI")
	public void scheduleStartComponent(){
		controlChannel.send(new GenericMessage<String>("@inbound.start()"));

	}
	
	@Override
	@Scheduled(cron="0 01 15 ? * MON,TUE,WED,THU,FRI")
	public void scheduleStopComponent(){
		controlChannel.send(new GenericMessage<String>("@inbound.stop()"));

	}

}
