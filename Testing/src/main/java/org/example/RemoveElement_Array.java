package org.example;

public class RemoveElement_Array {

    public static void main(String args[]){

        int nums[]={0,1,2,2,3,0,4,2};
        int val=2;
       int num= RemoveElement_Array.removeElement(nums, val);
       System.out.println(num);

    }

    public static int removeElement(int[] nums, int val){

        int k=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]!=val){

                nums[k]=nums[i];
                k++;
            }
        }
    return k;

    }


}
