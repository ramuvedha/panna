package org.example;

class Test {

    public static void main(String... args) {
        String st = "a_b5d@8uy54!";
        System.out.println(" Given Alphanumeric string " + st);
        System.out.println(" Sum of given digits from the string " +Test.sumNum(st));
        System.out.println(" Removing digits from the string " +removeDigits(st));
    }

    public static int sumNum(String s) {
        int sum = 0;
        String n = "[0-9]";
        String chars = "[^a-zA-Z]";
        String numbers;
        StringBuilder str = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            String c = String.valueOf(ch);
            if (c.matches(n)) {
                numbers = "" + ch;
                int n5 = Integer.parseInt(numbers);
                sum = sum + n5;
            } else if (c.matches(chars)) {
                str = str.append(ch);
            } else {
                special = special.append(ch);
            }
        }
         return sum;
    }

    public static String removeDigits(String str){

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            String str1=str.valueOf(ch);
            String strnum="[0-9]";
            if(str1.matches(strnum)){

                str=str.replace(ch,' ');
            }
        }
        return str;

    }
}
