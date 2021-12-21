package com.springdemo;

public class BaseBallCoach implements Coach {

	private FortuneService fortuneservice;

	public BaseBallCoach(FortuneService thefortuneservice) {
		this.fortuneservice = thefortuneservice;

	}

	public String getDailyWorkout() {
		return "Spend 30 minutes in batting practice";
	}

	@Override
	public String getDailyFortune() {

		return fortuneservice.getFortune();
	}
}
