package com.giselle;

public class Main {

    public static void main(String[] args) {
	    Pickup pickup = new Pickup(36);
	    pickup.steer(45);
	    pickup.accelerate(30);
	    pickup.accelerate(20);
	    pickup.accelerate(-42);
    }
}
