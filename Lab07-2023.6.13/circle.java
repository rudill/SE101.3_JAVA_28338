package com.mycompany.p33;
class Circle extends Shape 
{
    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}