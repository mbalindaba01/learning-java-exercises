package com.example.primenumbers;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        //set up scanner object
        Scanner input = new Scanner(System.in);

        //prompt user for input and store it
        System.out.println("Please enter integer: ");
        int cap = input.nextInt();

        //for loop to loop over the numbers up to cap
        for(int i = 1; i <= cap; i++){
            //set up counter to count how many times each number is divisible
            int counter = 0;
            //loop to check how many times current number is divisible up to cap
            for(int j = i; j >= 1; j--){
                if(i % j == 0){
                    counter = counter + 1;
                }
            }
            //prime numbers are only divisible two times, by 1 and by itself
            if(counter == 2) {
                System.out.println(i);
            }
        }
    }
}
