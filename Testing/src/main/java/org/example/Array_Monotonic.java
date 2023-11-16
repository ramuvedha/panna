package org.example;

public class Array_Monotonic {

        public boolean isMonotonic(int[] nums) {

            boolean inc=true;
            boolean des=true;

            for(int i=0;i<nums.length-1;i++){

                if(nums[i]>nums[i+1]){//{1, 2, 2, 3}

                    inc=false;
                }
                if(nums[i]<nums[i+1]){

                    des=false;
                }
            }
            return inc||des;


        }

        public static void main(String[] args) {
            int[] array1 = {1, 2, 2, 3}; // Monotone increasing
            int[] array2 = {3, 2, 1};    // Monotone decreasing
            int[] array3 = {1, 3, 2};    // Not dfdf monotonic

            Array_Monotonic solution = new Array_Monotonic();
            System.out.println(solution.isMonotonic(array1)); // Output: true
            System.out.println(solution.isMonotonic(array2)); // Output: true
            System.out.println(solution.isMonotonic(array3)); // Output: false
        }
    }



