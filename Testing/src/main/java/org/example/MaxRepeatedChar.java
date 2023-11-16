package org.example;

import java.util.HashMap;

public class MaxRepeatedChar {
    static int maxrepeated=0;


    public static void main(String args[]){

        System.out.println("Max repeated char is "  +maxRepeatedChar("testineeertdee")+ " Number times is  " + maxrepeated);

    }

    public static char maxRepeatedChar(String str){

        char ch[]=str.toCharArray();
        char maxrepeatedchar='\0';

        HashMap<Character,Integer> hm=new HashMap<>();
        for(Character ch1:ch){

            if(hm.containsKey(ch1)){
                hm.put(ch1,hm.get(ch1)+1);
            }else
                hm.put(ch1,1);
            if(hm.get(ch1) >maxrepeated){

                maxrepeated=hm.get(ch1);
                maxrepeatedchar=ch1;

            }
        }
        return maxrepeatedchar;

    }
}
