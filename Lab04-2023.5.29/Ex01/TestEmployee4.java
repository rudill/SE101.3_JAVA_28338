package com.mycompany.testemployee4;
public class TestEmployee4 {
    public static void main(String[] args) {
        // Create objects for Mr. Bogdan and Ms. Bird
        Employee mrBogdan = new Employee();
        Employee msBird = new Employee();

        // Set required values using setters
        mrBogdan.setEmpID(101);
        mrBogdan.setEmpName("Mr. Bogdan");
        mrBogdan.setEmpDesignation("Manager");

        msBird.setEmpID(102);
        msBird.setEmpName("Ms. Bird");
        msBird.setEmpDesignation("Engineer");

        // Print them back on the console using getters
        System.out.println("Employee ID: " + mrBogdan.getEmpID());
        System.out.println("Employee Name: " + mrBogdan.getEmpName());
        System.out.println("Employee Designation: " + mrBogdan.getEmpDesignation());

        System.out.println("\nEmployee ID: " + msBird.getEmpID());
        System.out.println("Employee Name: " + msBird.getEmpName());
        System.out.println("Employee Designation: " + msBird.getEmpDesignation());
    }
}
