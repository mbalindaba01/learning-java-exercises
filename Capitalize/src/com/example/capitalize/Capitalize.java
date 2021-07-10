package com.example.capitalize;
import java.util.*;

public class Capitalize {
    public static void main(String[] args) {

        //set up scanner object
        Scanner input = new Scanner(System.in);

        //prompt user for input and store it
        System.out.println("Please enter a sentence: ");
        String sentence = input.nextLine();


        //Split sentence into an array
        String splitSentence[] = sentence.split(" ");
        List<String> arrayFromSentence = Arrays.asList(splitSentence);

        //make new list to store capitalized words
        List<String> capitalizedWords = new ArrayList<>();

        //loop through array and capitalize each word
        for(int i = 0; i < arrayFromSentence.toArray().length; i++ ){
            String firstLetter = arrayFromSentence.get(i).substring(0, 1);
            String remainingLetters = arrayFromSentence.get(i).substring(1);

            //change first letter to uppercase
            firstLetter = firstLetter.toUpperCase();

            //concatenate first letter to remaining letters
            String capitalizedWord = firstLetter + remainingLetters;

            //push into capitalizedWords string
            capitalizedWords.add(capitalizedWord);
        }

        String joinedCapSentence = String.join(" ", capitalizedWords);
        System.out.println(joinedCapSentence);
    }
}
