package com.om.spring.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext 
container = new ClassPathXmlApplicationContext("context.xml");
		//container.registerShutdownHook();
		container.close();
	}

}
