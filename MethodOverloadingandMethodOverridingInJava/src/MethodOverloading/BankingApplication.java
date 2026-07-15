/*EXAMPLE//
Example 1: Banking Application
Scenario:A customer can transfer money in different ways:
Transfer only the amount
Transfer amount to another account
Transfer amount with remarks*/



package MethodOverloading;

public class BankingApplication{

    // 1. Transfer only the amount
    public void transfer(double amount) {
        System.out.println("Transferred ₹" + amount);
    }

    // 2. Transfer amount to another account
    public void transfer(double amount, String accountNumber) {
        System.out.println("Transferred ₹" + amount +
                " to Account No: " + accountNumber);
    }

    // 3. Transfer amount with remarks
    public void transfer(double amount, String accountNumber, String remarks) {
        System.out.println("Transferred ₹" + amount +
                " to Account No: " + accountNumber);
        System.out.println("Remarks: " + remarks);
    }

    public static void main(String[] args) {

    	BankingApplication obj = new BankingApplication  ();

        obj.transfer(5000);

        System.out.println("----------------");

        obj.transfer(10000, "327211974");

        System.out.println("----------------");

        obj.transfer(15000, "9876543210", "House Rent");
    }
}
