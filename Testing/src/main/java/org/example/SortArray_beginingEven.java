package org.example;

import java.util.Arrays;

public class SortArray_beginingEven {

        public int[] sortArrayByParity(int[] nums) {

            int n=nums.length,even=0, odd=n-1;
            int[] res =new int[n];

            for (int num : nums) {

                if (num % 2 == 0) {
                    res[even] = num;
                    even++;
                } else {
                    res[odd] = num;
                    odd--;
                }
            }
            return res;
        }

        public static void main(String[] args){
            int[] n ={3,1,2,4};
            SortArray_beginingEven s=new SortArray_beginingEven();
            System.out.println(Arrays.toString(s.sortArrayByParity(n)));
    }

}
