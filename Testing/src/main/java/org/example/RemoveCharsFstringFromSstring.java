package org.example;

public class RemoveCharsFstringFromSstring {

    public static void main(String args[]) {
        String str = "india is my greati";
        String str1 = "in";

        str = str.replaceAll("[" + str1 + "]", "");


        System.out.println(str);
    }

}
