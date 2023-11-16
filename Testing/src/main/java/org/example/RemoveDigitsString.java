package org.example;

public class RemoveDigitsString {

    public static void main(String args[]){

    String str="r1@m3 u";

    str=str.replaceAll("[^a-zA-Z\\s]","");

    System.out.println(str);}
}
