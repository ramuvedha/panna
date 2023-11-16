package org.example;

class Solution {

    public static void main(String args[]){
        int nums[]={1,1,2};
        int k=Solution.removeElement(nums);
        System.out.println(k);
    }
    public static int removeElement(int[] nums){
        if (nums.length == 0) {
            return 0; // Handle the case of an empty array
        }

        int k = 1;
        for(int i=1;i<nums.length;i++){

            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;

    }
}

