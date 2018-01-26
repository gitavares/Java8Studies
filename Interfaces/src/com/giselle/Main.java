package com.giselle;

public class Main {

	public static void main(String[] args) {
		ITelephone gisellePhone;
		gisellePhone = new DeskPhone(123456);
		gisellePhone.powerOn();
		gisellePhone.callPhone(123456);
		gisellePhone.answer();
		
		gisellePhone = new MobilePhone(258369);
		gisellePhone.powerOn();
		gisellePhone.callPhone(258369);
		gisellePhone.answer();

	}

}
