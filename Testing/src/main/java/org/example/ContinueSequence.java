package org.example;

public class ContinueSequence {

    public static void main(String args[]){

        String str="raammmmmuuraaaaaoo";
        int max=0;
        char ch='\0';
        int count=0;

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else count=1;
            if(count>max){
                max=count;
                ch=str.charAt(i);

            }

        }
       if(max>1){
       System.out.println(" continues char is " + ch + " time "+ max);}

    }

}
