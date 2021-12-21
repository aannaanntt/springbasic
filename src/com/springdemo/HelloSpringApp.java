package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach ch = context.getBean("myCoach", Coach.class);

//		System.out.println(ch.getDailyWorkout());
//
		System.out.println(ch.getDailyFortune());
		System.out.println(ch.getDailyWorkout());
		context.close();
	}

}
