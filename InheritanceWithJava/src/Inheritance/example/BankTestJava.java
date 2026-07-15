package Inheritance.example;

public class BankTestJava{

    String accountHolder = "Sourav Kumar";
    double balance = 10000;

    
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount: ₹" + amount);
    }

    
    public void withdraw(double amount) {
    	if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn Amount: ₹" + amount);
        
        } else {
            System.out.println("Insufficient Balance!");
        }
 
    }

   
    public void displayBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Current Balance:₹ " + balance);
    }
}