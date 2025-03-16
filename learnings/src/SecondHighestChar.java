package learnings.src;//package com.nerchuko.lessThanjava8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondHighestChar {
    public static void main(String[] args) {
        String str = "hello world";
        findSecondHighestChar(str);
    }

    public static void findSecondHighestChar(String str) {
        // Step 1: Count occurrences of each character
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (c != ' ') { // Ignore spaces
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Step 2: Sort entries by value (frequency) in descending order
        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(charCountMap.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Descending order

        // Step 3: Get the second highest occurring character
        if (sortedEntries.size() < 2) {
            System.out.println("Not enough unique characters to determine second highest.");
            return;
        }

        char secondHighestChar = sortedEntries.get(1).getKey();
        int secondHighestCount = sortedEntries.get(1).getValue();

        System.out.println("Second highest repeated character: " + secondHighestChar + " (count: " + secondHighestCount + ")");
    }
}