package org.example;

public class StringPallindrome {
    public boolean isPalindrome(String s) {

        //s=s.toLowerCase();
        //String special="[.,: @]";


        // s=s.replace("."");
        //System.out.println("Given string is after  " + s);
        s = s.replaceAll("[:,.@]", "").toLowerCase();
        System.out.println("Given string is after  " + s);

        String rev="";


        for(int i=s.length()-1;i>=0;i--){
            rev +=s.charAt(i);

        }

        System.out.println("Given reverz is  " + rev);




        return (s.equals(rev))?true:false;



    }

    public static void main(String args[]){

        String s="A man, a plan, a canal: Panama";

        StringPallindrome st=new StringPallindrome();

        System.out.println(st.isPalindrome(s));
    }
}
