package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
        public int romanToInt(String s) {
            // Create a map to store the values of Roman numerals
            Map<Character, Integer> romanValues = new HashMap<>();
            romanValues.put('I', 1);
            romanValues.put('V', 5);
            romanValues.put('X', 10);
            romanValues.put('L', 50);
            romanValues.put('C', 100);
            romanValues.put('D', 500);
            romanValues.put('M', 1000);

            int result = 0;
            int prevValue = 0; // To track the previous numeral's value

            // Iterate through the Roman numeral string in reverse order
            for (int i = s.length() - 1; i >= 0; i--) {
                char currentChar = s.charAt(i);
                int currentValue = romanValues.get(currentChar);

                // If the current numeral is smaller than the previous one, subtract it
                if (currentValue < prevValue) {
                    result -= currentValue;
                    System.out.println(result); // Output: 1994

                } else {
                    result += currentValue;
                    System.out.println("else rest" + result); // Output: 1994

                }

                // Update the previous value for the next iteration
                prevValue = currentValue;
            }

            return result;
        }

        public static void main(String[] args) {
            RomanToInteger converter = new RomanToInteger();
            String romanNumeral = "MCMXCIV"; // Example: Roman numeral for 1994
            int result = converter.romanToInt(romanNumeral);
            System.out.println(result); // Output: 1994
        }
    }



