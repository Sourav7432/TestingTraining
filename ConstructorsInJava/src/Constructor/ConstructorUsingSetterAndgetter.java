package Constructor;

public class ConstructorUsingSetterAndgetter {

    // Employee details
    private int id;
    private String name;
    private float salary;
    private String ssn;

    // Parameterized Constructor
    public ConstructorUsingSetterAndgetter(int id, String name, float salary, String ssn) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.ssn = ssn;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for salary
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Getter and Setter for ssn
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    // Main Method
    public static void main(String[] args) {

        // Creating object using constructor
        ConstructorUsingSetterAndgetter emp =
                new ConstructorUsingSetterAndgetter(101, "Sourav", 50000.0f, "SSN12345");

        // Displaying values using getters
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("SSN: " + emp.getSsn());

        // Updating values using setters
        emp.setSalary(60000.0f);
        emp.setName("Rahul");

        System.out.println("\nAfter Updating:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}