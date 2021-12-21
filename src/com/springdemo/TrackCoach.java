package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneservice;

	public TrackCoach() {
		super();

	}

	public TrackCoach(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;

	}

	@Override
	public String getDailyWorkout() {

		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it:" + fortuneservice.getFortune();
	}

}
