package org.example;

public class FIrst_Lalst_TwoChars {

    public static void main(String args[]){

        String str="Denvarson";
        String stratwith="";
        String endswith="";
        for(int i=0;i<str.length();i++){

            if (i <= 1) {

                stratwith=stratwith+str.charAt(i);
            } if(str.length()-2<=i){

                endswith=endswith+str.charAt(i);
            }

       }
        System.out.println(stratwith+ "  ----  "+ endswith);


    }


}
