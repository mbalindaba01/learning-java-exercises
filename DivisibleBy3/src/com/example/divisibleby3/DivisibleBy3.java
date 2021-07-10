package com.example.divisibleby3;
import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {

        //set up scanner object
        Scanner input = new Scanner(System.in);

        //prompt user for input and store it
        System.out.println("Please enter 3 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        //loop through numbers from 1 to 300
        for(int i = 1; i <= 300; i++){
            if(i % num1 == 0 && i % num2 == 0 && i % num3 == 0 ){
                System.out.println(i);
            }
        }
    }
}
