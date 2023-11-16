package org.example;

    public class MaxRepeatedNum_Array {
        public int majorityElement(int nums[]){
            int max=1,num=nums[0];
            int n=nums.length;

            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[i] == nums[j]){
                        //2,2,1,1,1,2,2
                        count++;
                    }
                }
                if(count>max){
                    max=count;//66677
                    num=nums[i];
                }

            }
            return num;}

        public static void main(String args[]){

            int[] nums={2,2,1,1,1,2,2};
            org.example.MaxRepeatedNum_Array s=new org.example.MaxRepeatedNum_Array();
            System.out.println(s.majorityElement(nums));
        }
    }





