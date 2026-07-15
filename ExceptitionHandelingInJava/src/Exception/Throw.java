package Exception;

public class Throw {
    int x=143;

    public void m1() {
        System.out.println("Value of x is: " +x);
    }

    public static void main(String[] args) throws InterruptedException {
        new Throw();
        Thread.sleep(0);
    }
}