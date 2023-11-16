package org.example;

public class IntegerToRoman {
String integerToRoman(int num){
        int nums[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String chars[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer result=new StringBuffer();

        for(int i=0;i<nums.length;i++) {

            while (num >= nums[i]) {
                    num-=nums[i];
                    result = result.append(chars[i]);

                }

        }
        return result.toString();
    }

    public static void main(String args[]){

        IntegerToRoman ir=new IntegerToRoman();

        System.out.println(ir.integerToRoman(3));
    }


}
