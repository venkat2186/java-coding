package org.java.practice;

public class ReverseAnInteger {
    public static void main(String[] args) {

        int number = 2147483647;
        int reverseNumber = 0;
        int lastDigit=0;

        while (number!=0)
        {
            lastDigit = number %10;

            //overflow check
            if(reverseNumber>Integer.MAX_VALUE /10 || (reverseNumber==Integer.MAX_VALUE/10 && lastDigit>7)){
                System.out.println(0);
                System.exit(0);
            }

            //underflow check
            if (reverseNumber<Integer.MIN_VALUE /10 || (reverseNumber==Integer.MIN_VALUE /10 && lastDigit < -8)) {
                System.out.println(0);
                System.exit(0);
            }

            reverseNumber=reverseNumber*10 +lastDigit;
            number=number/10;

        }
        System.out.println(reverseNumber);

    }
}
