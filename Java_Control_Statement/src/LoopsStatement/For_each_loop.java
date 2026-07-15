package LoopsStatement;

public class For_each_loop{

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array Elements:");

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}