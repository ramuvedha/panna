package org.example;

import java.util.Scanner;

public class ReverseString {

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverseString(str));
        System.out.println("before reverse "+ str + " After reverse "+reverseString2(str));
    }
    private static String reverseString2(String str) {

        char[] ch=str.toCharArray();
        String reverse = "";
        for(int i=ch.length-1;i>=0;i--){
            reverse=reverse+ch[i];
        }
        return reverse;
    }

    //apporch 1
    private static boolean reverseString(String str) {

        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++; j--;
        }
return true;
    }
}
