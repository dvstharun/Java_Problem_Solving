package Strings;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void printCharacterCount(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("Input string is empty or null.");
            return;
        }

        // Create a HashMap to store characters and their counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // getOrDefault returns the current count, or 0 if it's the first time we see the char.
            // We then add 1 to that count.
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the results
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times");
        }
    }
    public static void main(String[] args){
        String testString = "programming";
        System.out.println("Character occurrences for: " + testString);
        printCharacterCount(testString);

    }
}
