package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Checkwords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        System.out.printf("Text verification is " + checkWords(str1,str2));

        }
    private static boolean checkWords(String str1, String str2) {

        return str1.equalsIgnoreCase(str2);
    }
    }


