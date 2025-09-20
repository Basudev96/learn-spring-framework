package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorld {

	public static void main(String[] args) {
		
		//1: Launch a spring context
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2: Configure the things that we want Spring to manage 
		//HelloWorldConfiguration - @Configuration
		//name - @Bean
		//3: Retrieving Beans manage by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));

	}

}
