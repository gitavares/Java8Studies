package com.giselle;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("I'm not very good at that, can I go for a swin instead?");
	}

}
