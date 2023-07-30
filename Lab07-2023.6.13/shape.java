package com.mycompany.p33;

abstract class Shape 
{

    public abstract double calculateArea();

    
    public void display() {
        double area = calculateArea();
        System.out.println("Area: " + area);
    }
}