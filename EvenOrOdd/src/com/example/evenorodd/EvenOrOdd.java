package com.example.evenorodd;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        //set up scanner object
        Scanner input = new Scanner(System.in);

        //prompt user to enter number
        System.out.println("Please enter positive integer: ");
        int posInt = input.nextInt();

        //make sure number entered is positive
        while(posInt < 0) {
            System.out.print("Negative number entered. Please enter a positive integer: ");
            posInt = input.nextInt();
        }

        //loop over the number and all positive integers less than it
        for(int i = posInt; i > 0; i--){
            if(i % 2 == 0){
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }
        }
    }
}
