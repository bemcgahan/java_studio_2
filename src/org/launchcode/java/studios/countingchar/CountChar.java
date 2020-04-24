package org.launchcode.java.studios.countingchar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {

        HashMap<Character, Integer> charCount = new HashMap<>();
        Scanner input = new Scanner(System.in);
        //String myString = "Brenna";

        System.out.print("Enter a string: ");
        String inputString = input.nextLine();
        inputString = inputString.replaceAll("[^a-zA-Z0-9]", "");


        char[] charactersInString = inputString.toCharArray();

        Integer count = 1;

        for (char c : charactersInString){
            char newChar = c;

            if (charCount.containsKey(newChar)){
                count ++;
            }

            charCount.put(newChar, count);
        }
        for (Map.Entry<Character, Integer> characters : charCount.entrySet()) {
            System.out.println(characters.getKey() + ": " + characters.getValue());

        }

    }

}
