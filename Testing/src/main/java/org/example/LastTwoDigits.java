package org.example;

public class LastTwoDigits {

    public static void main(String args[]) {
        int num = 1458714;
        String s="1458701";
        System.out.println(checkLastTwoDigits(num));
        System.out.println(checkLast(s));
    }
    public static boolean checkLastTwoDigits(int num) {
        // Extract the last digit
        int lastDigit = num % 100;
        System.out.println("Last digit: " + lastDigit);

        // Check if the last digit is in the range [1, 24]
      //  boolean isInRange=(lastDigit >= 01 && lastDigit <= 24)?true:false;

        return (lastDigit >= 01 && lastDigit <= 24)?true:false;
    }

public static int checkLast(String num) {

    String last=num.substring(num.length()-2);

    System.out.println(last);

    return Integer.parseInt(last);
}
}