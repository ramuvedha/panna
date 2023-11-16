package org.example;

public class ReverseWordString {

        public String reverseWords(String s) {
            // Split the input string by spaces
            String[] str = s.split("\\s+");
            String rev = "";

            // Iterate through the words in reverse order
            for (int i = str.length - 1; i >= 0; i--) {
                // Append the reversed word to the result string
                str[i]=str[i].replace(" ","");
                rev = rev + str[i] + " ";
            }

            // Trim any trailing spaces and return the result
            return rev.trim();
        }

        public static void main(String args[]) {
            String s = "a good   example";
            ReverseWordString so = new ReverseWordString();
            System.out.println(so.reverseWords(s)); // Output: "example good a"
        }
    }
