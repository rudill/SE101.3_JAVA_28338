package com.mycompany.g6;

public interface MyFirstInterface 
{
    int x = 10;

    void display();
}

/*With public static final: If you declare x with the public static final keywords,
it becomes a constant variable, meaning its value cannot be changed once initialized. 
All interface variables are implicitly public static final, so it's not necessary to 
explicitly mention them.*/

/*Without public static final: If you declare x without the public static final keywords,
it becomes a normal instance variable, and its value can be changed in classes that
implement this interface.*/

/*You can declare the abstract method display() with or without the abstract keyword in
the interface. However, it is recommended to include the abstract keyword for clarity and
readability. If you omit the abstract keyword, the method is still considered
abstract by default.*/

/*Including the abstract keyword makes it explicitly clear that the method is intended
to be abstract and needs to be implemented in the classes that implement this interface.
It helps other developers understand the contract defined by the interface and encourages
them to implement the required methods.*/