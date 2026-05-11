package com.jsp.Mod1.Scanner;

import java.util.Scanner;

/**
 * Topic: Dynamic Read using Scanner Class
 * Purpose: Reading all primitive types and Strings from the user.
 */
public class ScannerPractice {

    public static void main(String[] args) {
        
        // Creating Scanner object to read from standard input (Keyboard)
        Scanner sc = new Scanner(System.in);

        System.out.println("--- User Registration Form ---");

        // 1. Reading a single word (String)
        System.out.print("Enter your first name: ");
        String firstName = sc.next(); 

        // 2. Reading a whole line/sentence (String)
        sc.nextLine(); // Consume the leftover newline character
        System.out.print("Enter your full address: ");
        String address = sc.nextLine();

        // 3. Reading an integer (int)
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // 4. Reading a decimal value (double)
        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        // 5. Reading a long value (long)
        System.out.print("Enter your phone number: ");
        long phone = sc.nextLong();

        // 6. Reading a boolean (boolean)
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        // 7. Reading a single character (char)
        // Note: Scanner doesn't have a nextChar() method. 
        // We use next().charAt(0) to get the first character.
        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.println("\n--- Summary of your Input ---");
        System.out.println("Name: " + firstName);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Phone: " + phone);
        System.out.println("Student Status: " + isStudent);
        System.out.println("Gender: " + gender);

        // Always close the scanner to prevent memory leaks
        sc.close();
    }
}
