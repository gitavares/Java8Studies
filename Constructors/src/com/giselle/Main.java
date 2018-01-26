package com.giselle;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(123, 1000000.00, "Giselle", "gitavares@hotmail.com", "+55 81 988042050");
        //BankAccount account = new BankAccount();
        VipCustomer vipAccount1 = new VipCustomer("Peri", "peri_reis@hotmail.com");
        VipCustomer vipAccount2 = new VipCustomer();
        VipCustomer vipAccount3 = new VipCustomer("Mia", 800000, "mia@mia.com");

        System.out.println("Account created is " + account.getAccountNumber()
                + " / " + account.getBalance()
                + " / " + account.getCustomerName()
                + " / " + account.getEmail()
                + " / " + account.getPhoneNumber());

        account.depositFunds(1000);
        System.out.println("New balance is " + account.getBalance());

        account.withdrawFunds(1000);
        System.out.println("New balance is " + account.getBalance());

        account.withdrawFunds(2000000);
        System.out.println("New balance is " + account.getBalance());

        account.depositFunds(-2000);
        System.out.println("New balance is " + account.getBalance());

        account.depositFunds(1000000);
        System.out.println("New balance is " + account.getBalance());

        System.out.println("Account was updated to " + account.getAccountNumber()
                + " / " + account.getBalance()
                + " / " + account.getCustomerName()
                + " / " + account.getEmail()
                + " / " + account.getPhoneNumber());

        System.out.println("Account 1 - Name: " + vipAccount1.getName()
                + " / Credit limit: CAD $" + vipAccount1.getCreditLimit()
                + " / E-mail: " + vipAccount1.getEmail());

        System.out.println("Account 2 - Name: " + vipAccount2.getName()
                + " / Credit limit: CAD $" + vipAccount2.getCreditLimit()
                + " / E-mail: " + vipAccount2.getEmail());

        System.out.println("Account 3 - Name: " + vipAccount3.getName()
                + " / Credit limit: CAD $" + vipAccount3.getCreditLimit()
                + " / E-mail: " + vipAccount3.getEmail());

    }
}
