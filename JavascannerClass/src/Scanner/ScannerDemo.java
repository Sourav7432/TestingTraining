
package Scanner;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.println("Your Name is: " + name);

        input.close();
    }
}