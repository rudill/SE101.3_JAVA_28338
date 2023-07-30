package com.mycompany.testemployee;
public class TestEmployee {
    public static void main(String[] args) {
        // Using setters
        Employee emp1 = new Employee();
        emp1.setName("John");
        emp1.setAge(30);
        emp1.setSalary(50000.0);

        System.out.println("Employee 1:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Age: " + emp1.getAge());
        System.out.println("Salary: " + emp1.getSalary());

        // Using constructor
        Employee1 emp2 = new Employee1("Jane", 28, 60000.0);

        System.out.println("\nEmployee 2:");
        System.out.println("Name: " + emp2.getName());
        System.out.println("Age: " + emp2.getAge());
        System.out.println("Salary: " + emp2.getSalary());
    }
}






