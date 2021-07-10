package com.example.palindrome;
import java.util.Scanner;

public class Palindromechecker {
    public static void main(String[] args) {
        //set up scanner object
       Scanner input = new Scanner(System.in);

       //prompt user for input and store it
        System.out.println("Please enter word or sentence: ");
        String sentence = input.nextLine();

        //remove spaces in sentence and change it to all lowercase letters
        sentence = sentence.replaceAll(" ", "").toLowerCase();

        //reverse sentence and store the result in another variable
        StringBuilder sb = new StringBuilder(sentence);

        if(sentence.equals(sb.reverse().toString())){
            System.out.println("String entered is a palindrome");
        }else {
            System.out.println("String entered is not a palindrome");
        }
    }
}
