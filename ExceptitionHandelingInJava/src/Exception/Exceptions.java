package Exception;

public class Exceptions {

    int x = 10;

    public void m1() {
        System.out.println("Value of x is: " + x);
    }

    public static void main(String[] args) {

        Exceptions obj = new Exceptions();

        try {
            Thread.sleep(2000); // Pause for 2 seconds
            obj.m1();
        } 
        catch (InterruptedException e) {
            System.out.println("Exception occurred: " + e);
        }

        System.out.println("Program executed successfully.");
    }
};