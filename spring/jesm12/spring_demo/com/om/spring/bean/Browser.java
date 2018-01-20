package com.om.spring.bean;

public class Browser {

	private String name;

	public Browser() {
		System.out.println("Browser \t created...");
	}

	public void initResource() {
		System.out.println("init costly resource...");
	}

	public void dMethod() {
		System.out.println("calling destroy...");
	}

	public void connect() {
		System.out.println("connecting with :\t" + this.name);
	}

	public void setName(String name) {
		System.out.println("calling setName" + name);
		this.name = name;
	}

}
