package org.motivity;
// Java Program to demonstrate the Use of Reflection

// Importing required classes
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Class 1
// Of Whose object is to be created
public class Test {
    // creating a private field
    private String s;

    // Constructor of this class

    // Constructor 1
    // Public constructor
    public Test() { s = "GeeksforGeeks"; }

    // Constructor 2
    // no arguments
    public void method1()
    {
        System.out.println("The string is " + s);
    }

    // Constructor 3
    // int as argument
    public void method2(int n)
    {
        System.out.println("The number is " + n);
    }

    // Constructor 4
    // Private method
    private void method3()
    {
        System.out.println("Private method invoked");
    }
}

