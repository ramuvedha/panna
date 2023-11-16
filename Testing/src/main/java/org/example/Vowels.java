package org.example;

import java.util.HashMap;

public class Vowels {

    static String str="ukruiushnaarjunayudhameppuduai";
    static int max=0;
    static char maxchar='\0';

    public static void main(String args[]){

        System.out.println(vowels(str));
       // System.out.println(vowels_RegularExp(str));

    }

  /*  private static boolean vowels_RegularExp(String str) {
    }*/
    private static char vowels(String str) {

        String vowels="[aeiouAEIOU]";
        char chars[]=str.toCharArray();
        int c=0;
HashMap<Character,Integer> hm=new HashMap<>();
for(Character ch:chars)
    //char ch=str.charAt(i);

    if (str.valueOf(ch).matches(vowels)) {

        if (hm.containsKey(ch)) {
            // System.out.println(ch[i]);
            hm.put(ch, hm.get(ch) + 1);
        } else
            hm.put(ch, 1);
        if (hm.get(ch) > max) {

            max = hm.get(ch);
            maxchar = ch;

        }
    }

    System.out.println(maxchar + " is repeated " + max + " times ");
        return maxchar;
    }
}
