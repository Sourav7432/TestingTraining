package com.AccessModifire;

class A {
    int x = 100;   // Default access modifier
}

public class Private {

    public static void main(String[] args) {

        A obj = new A();          // Create object of class A
        System.out.println(obj.x); // Access default variable
    }
}
