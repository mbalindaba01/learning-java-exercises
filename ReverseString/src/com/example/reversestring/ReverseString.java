package com.example.reversestring;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        //set up Scanner object
        Scanner input = new Scanner(System.in);

        //prompt user to enter input and store it
        System.out.println("Please enter word to be reversed: ");
        String str = input.nextLine();

        //loop over the string and reverse
        for(int i = str.length() - 1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
