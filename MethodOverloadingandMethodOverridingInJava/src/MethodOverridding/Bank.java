package MethodOverridding;



class Banking{

 public void calculateInterest() {
     System.out.println("Default Bank Interest Rate: 5%");
 }
}


class SBI extends Banking {

 @Override
 public void calculateInterest() {
     System.out.println("SBI Interest Rate: 6.5%");
 }
}


class HDFC extends Banking {

 @Override
 public void calculateInterest() {
     System.out.println("HDFC Interest Rate: 7%");
 }
}


class ICICI extends Banking {

 @Override
 public void calculateInterest() {
     System.out.println("ICICI Interest Rate: 6.8%");
 }
}


public class Bank {

 public static void main(String[] args) {

    SBI sbi=new SBI();
    sbi.calculateInterest();
    
    HDFC hdfc =new HDFC();
    hdfc.calculateInterest();
    
    ICICI icici =new ICICI();
    icici.calculateInterest();
    
 }
}
