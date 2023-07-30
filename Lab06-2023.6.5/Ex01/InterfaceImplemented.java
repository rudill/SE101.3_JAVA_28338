package com.mycompany.g6;
public class InterfaceImplemented implements MyFirstInterface 
{
    @Override
    public void display() 
    {
        x = 20; // This will cause a compilation error
        System.out.println("Value of x inside display(): " + x);
    }
}

/*Since x is declared in the interface, it is implicitly public static
final, making it a constant. Constants cannot be modified after their
initialization. When you try to change the value of x inside the display() method,
it will result in a compilation error, stating that you cannot assign a value
to a final variable.*/

/*So, no, it is not possible to change the value of x inside the implementing
class, as it is a constant defined in the interface.*/