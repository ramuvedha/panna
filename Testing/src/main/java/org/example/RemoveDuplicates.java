package org.example;

public class RemoveDuplicates {

    public static void main(String args[]) {

        String str = "java";

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
    System.out.println(sb.indexOf(str.valueOf(ch)));
            if(sb.indexOf(str.valueOf(ch)) == -1){

                sb.append(ch);

            }
        }

        System.out.println(sb.toString());

    }
}
