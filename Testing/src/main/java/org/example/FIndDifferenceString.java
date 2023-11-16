package org.example;

public class FIndDifferenceString {

        public char findTheDifference(String s, String t) {
            char result = 0;

            // XOR all characters in both strings
            for (char c : s.toCharArray()) {
                result ^= c;
            }
            for (char c : t.toCharArray()) {
                result ^= c;
            }

            return result;
        }

        public static void main(String args[]) {
            String s = "a";
            String t = "aa";
            FIndDifferenceString so = new FIndDifferenceString();
            System.out.println(so.findTheDifference(s, t)); // Output: 'e'

}}
