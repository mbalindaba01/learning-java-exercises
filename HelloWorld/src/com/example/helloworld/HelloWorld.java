package com.example.helloworld;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //set up scanner object
        Scanner input = new Scanner(System.in);

        //prompt user to enter name
        System.out.println("Please enter name: ");
        String name = input.nextLine();

        //display greeting with name
        System.out.println("Hello World:" + name);
    }
}
