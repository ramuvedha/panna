package org.example;

public class countDigits {

    public static void main(String args[]){


        int n=1234567894;

        String s="234";

        int k=Integer.parseInt(s);

        System.out.println(k);



        String nu=String.valueOf(n);

        System.out.println(nu.length());
        int c=0;

        while(n>0){

            n=n/10;
                c++;
            }
        System.out.println("c value is "+ c);


    }
}
