package com.example.helloworld;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {

        //set up scanner object
        Scanner input = new Scanner(System.in);

        //prompt user to enter numbers
        System.out.print("Please enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        //print out sum and product
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Product: " + (num1 * num2));

        //print out difference and quotient
        if(num1 > num2) {
            System.out.println("Difference: " + (num1 - num2));
            System.out.println("Quotient: " + (num1 / num2));
        }else {
            System.out.println("Difference: " + (num2 - num1));
            System.out.println("Quotient: " + (num2 / num1));
        }

    }
}
