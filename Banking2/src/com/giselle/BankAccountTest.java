package com.giselle;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;


    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count =" + count++);
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("Giselle", "Tavares",10000000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void deposit() throws Exception {
        double balance = account.deposit(2555.00, true);
        assertEquals(10002555.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw_branch() throws Exception {
        double balance = account.withdraw(600.00, true);
        assertEquals(9999400.00, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
//        //this is another option in case to not use the "expected" parameter above
//        try {
//            account.withdraw(600.00, false);
//            fail("Should have thrown an IllegalArgumentException");
//        } catch (IllegalArgumentException e){
//
//        }
        account.withdraw(600.00, false);
        fail("Should have thrown an IllegalArgumentException");
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        account.deposit(2555.00, true);
        assertEquals(10002555.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        account.withdraw(2555.00, true);
        assertEquals(9997445.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true(){
        assertTrue("The account is not a checking account", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @org.junit.After
    public void teardown(){
        System.out.println("Count = " + count++);
    }
}