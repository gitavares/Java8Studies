package com.giselle;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public VipCustomer(){
        this("Giselle", 9000000, "gitavares@hotmail.com");
        System.out.println("Empty constructor");
    }

    public VipCustomer(String name, String email){
        this(name, 5000000, email);
        System.out.println("Two values constructor");
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}
