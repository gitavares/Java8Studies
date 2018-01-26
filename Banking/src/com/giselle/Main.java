package com.giselle;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("National Australia Bank");
		
		if(bank.addBranch("Adelaide")){
			System.out.println("Adelaide branch created");
		}
		bank.addCustomer("Adelaide", "Giselle", 1100000.00);
		bank.addCustomer("Adelaide", "Peri", 1000000.00);
		bank.addCustomer("Adelaide", "Percy", 200.00);
		
		bank.addBranch("Sydney");
		bank.addCustomer("Sydney", "Bob", 500.00);
		
		bank.addCustomerTransaction("Adelaide", "Giselle", 500000.00);
		bank.addCustomerTransaction("Adelaide", "Peri", 800000.00);
		bank.addCustomerTransaction("Adelaide", "Percy", 500.00);
		
		bank.listCustomer("Adelaide", true);
		bank.listCustomer("Sydney", true);
		
		bank.addBranch("Melbourne");
		
		if(!bank.addCustomer("Melbourne", "Brian", 5.53)){
			System.out.println("Error Melbourne branch does not exist");
		}
		
		if(!bank.addBranch("Adelaide")){
			System.out.println("Adelaide branch already exist");
		}
		
		if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)){
			System.out.println("Customer does not existe at branch");
		}
		
		if(!bank.addCustomer("Adelaide", "Giselle", 56875.00)){
			System.out.println("Customer Giselle already exists");
		}
		
		

	}

}
