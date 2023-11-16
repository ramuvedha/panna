package org.example;

public class LastWordLength {

        public int lengthOfLastWord(String s) {

            String str[]=s.split(" ");
            //int len= ;
            String s2=str[str.length-1];
            return s2.length();

        }

        public static void main(String args[]){

            String s="   fly me   to   the moon  ";

            LastWordLength stre=new LastWordLength();
            System.out.println(stre.lengthOfLastWord(s));
        }
    }

