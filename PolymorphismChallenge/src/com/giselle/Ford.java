package com.giselle;

class Ford extends Car {

	public Ford(int cylinders, String name) {
		super(cylinders, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "Ford -> startEngine()";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Ford -> accelerate()";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Ford -> brake()";
	}
	
}