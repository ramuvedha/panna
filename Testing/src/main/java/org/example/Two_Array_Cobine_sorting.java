package org.example;

import java.util.ArrayList;
import java.util.List;

public class Two_Array_Cobine_sorting {

    public static void main(String args[]){

        int a[]={2,5,7,9,11,14};
        int b[]={1,3,4,6,8,13,16,17,18};
        System.out.println(sorting_combine_array(a,b));

    }
    private static List<Integer> sorting_combine_array(int[] a, int[] b) {

        List<Integer> li=new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length){

            if(a[i]<b[j]){
            li.add(a[i]);
            i++;
            }
            else{
                li.add(b[j]);
                j++;
            }
        }
        while(i<a.length){
            li.add(a[i]);
            i++;
        }
        while(j<b.length){
            li.add(b[j]);
            j++;
        }
        return li;
    }
}
