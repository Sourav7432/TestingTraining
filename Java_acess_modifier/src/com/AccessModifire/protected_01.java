package com.AccessModifire;

public class protected_01 {

    
    protected String name = "Sourav";

    
    protected void display() {
        System.out.println("Protected Method Called");
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        protected_01 obj = new protected_01();

        obj.display();
    }
}



	
