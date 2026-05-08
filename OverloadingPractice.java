package com.jsp.Mod1.Overloading;

/**
 * Topic: Method Overloading
 * Purpose: Same method name, different behavior based on input.
 */
public class OverloadingPractice {

    // 1. Overloading by Number of Parameters
    // Adding two integers
    public static void calculate(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }

    // Adding three integers
    public static void calculate(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }

    // 2. Overloading by Data Type
    // Multiplication with integers
    public static void multiply(int a, int b) {
        System.out.println("Integer Multiplication: " + (a * b));
    }

    // Multiplication with double values (decimal)
    public static void multiply(double a, double b) {
        System.out.println("Double Multiplication: " + (a * b));
    }

    // 3. Overloading by Order of Parameters
    // Order: String then Int
    public static void displayInfo(String name, int id) {
        System.out.println("Student Name: " + name + " | ID: " + id);
    }

    // Order: Int then String
    public static void displayInfo(int id, String name) {
        System.out.println("ID: " + id + " | Student Name: " + name);
    }

    public static void main(String[] args) {
        System.out.println("--- Method Overloading Results ---");

        // Calling overloaded 'calculate' methods
        calculate(10, 20);
        calculate(10, 20, 30);

        // Calling overloaded 'multiply' methods
        multiply(5, 4);
        multiply(5.5, 2.0);

        // Calling overloaded 'displayInfo' methods
        displayInfo("Abhisheka", 501);
        displayInfo(502, "John Doe");
        
        System.out.println("----------------------------------");
    }
}