package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

        HashMap<Character, Integer> letterCount = new HashMap<>();
//        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has " +
//                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
//                "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done " +
//                "that, it’s pretty straightforward from there.";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to count the characters: ");
        String quote = input.nextLine();
        input.close();

        String lowerCaseQuote = quote.toLowerCase();

        char[] charactersInString = lowerCaseQuote.toCharArray();

        for (char character : charactersInString) {
//            if (character != ' ' || character != '\'' || character != ',' || character != '.') {
                if (letterCount.containsKey(character)) {
                    letterCount.put(character, letterCount.get(character) + 1);
                } else {
                    letterCount.put(character, 1);
                }
//            }
        }

        for(Map.Entry<Character, Integer> letter : letterCount.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }

    }
}
