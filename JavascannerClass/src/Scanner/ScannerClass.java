package Scanner;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter House Number: ");
        int houseNumber = keyboard.nextInt();
        keyboard.nextLine(); // Consume the leftover newline

        System.out.print("Enter First Name: ");
        String firstName = keyboard.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = keyboard.nextLine();

        System.out.print("Enter Street: ");
        String street = keyboard.nextLine();

        System.out.print("Enter Type (House/Flat/Apartment): ");
        String type = keyboard.nextLine();

        System.out.print("Enter City: ");
        String city = keyboard.nextLine();

        System.out.println("\n----- Address Details -----");
        System.out.println("Name         : " + firstName + " " + lastName);
        System.out.println("House Number : " + houseNumber);
        System.out.println("Street       : " + street);
        System.out.println("Type         : " + type);
        System.out.println("City         : " + city);

        keyboard.close();
    }
}