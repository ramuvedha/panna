package org.example;

public class Index_array_sum {

    public static void main(String args[]){

        int a[]={2,7,4,11,15,9};
        int t=13;
        for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){

                if(a[i]+a[j]==t){

                    System.out.println(i + " "+ j);
                   // break;
                }
            }
        }
    }
}
