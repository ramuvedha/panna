package org.example;

public class Subsequese_Target {

    public static void main(String args[]){

        System.out.println(subsequenceTarget("ten","abcdef"));

    }

    private static boolean subsequenceTarget(String str, String str1) {

        int i=0,j=0;
        while(i<str.length() & j<str1.length()){

           if(str.charAt(i)==str1.charAt(j)){

               i++;
           }else j++;
        }
        return i==str.length();

    }
}
