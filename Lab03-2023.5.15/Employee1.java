//modifying the same code by  trying to replace the setters using  a constructor. I have named this as ' Employee1 '
package com.mycompany.testemployee;
public class Employee1 {
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee1(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
