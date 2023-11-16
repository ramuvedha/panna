package org.example;

public class Wordsreverse {

        public String reverseWords(String s) {

            // StringBuffer sb=new StringBuffer();
            String str[]=s.split(" ");
            String rev="";

            for(int i=0;i<str.length;i++){

                String m=str[i];
             //   System.out.println(m);
                for(int j=m.length()-1;j>=0;j--){

                    rev=rev+m.charAt(j);
                }
                rev=rev+" ";

  
            }

            return rev.trim();
        }

        public static void main(String args[]){

            String p = "Let's take LeetCode contest";
            Wordsreverse s=new Wordsreverse();
            System.out.println(s.reverseWords(p));
        }
    }

