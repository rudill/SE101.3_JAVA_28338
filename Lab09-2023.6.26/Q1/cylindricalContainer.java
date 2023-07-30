package com.mycompany.p26;

public class cylindricalContainer extends container
{
    private double height,radius;
    
    public cylindricalContainer(double h,double r)
    {
        height=h;
        radius=r;
    }
    
    public double volume()
    {
        return 3.14159*radius*radius*height;
    }
}
