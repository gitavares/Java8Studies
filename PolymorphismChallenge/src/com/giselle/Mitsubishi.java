package com.giselle;

class Mitsubishi extends Car {

	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Mitsubishi -> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Mitsubishi -> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Mitsubishi -> brake()";
	}
	
}