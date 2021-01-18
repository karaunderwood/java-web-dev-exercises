package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {

    private static void characterCount(String inputString) {

        // initialize a HashMap where Characters will be the key amd Integers will be the value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        // Create an array of chars and set equal to given inputString, converted to a char array
        char[] strArray = inputString.toCharArray();

        // For each char c in strArray
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                // if charCountMap contains c, add 1 to its count
                charCountMap.put(c, charCountMap.get(c)+1);
            } else {
                // if charCountMap does not contain char c, put c into charCountMap with 1 as its value
                charCountMap.put(c, 1);
            }
        }
        // print our charCountMap
        System.out.println("The character counts are: "+charCountMap);

    }

    public static void main(String[] args) {
        String ourParagraph = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        // call the characterCount method using above string
        characterCount(ourParagraph);

        // call the characterCount method after prompting the user to enter the string in the command line.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string here: ");
        String textRaw = input.nextLine();
        String text = textRaw.toLowerCase();
        input.close();
    }
}
