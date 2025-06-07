package org.example;

public class ReverseAnInteger
{

    public static void main(String[] args)
    {

        int number = 2147483647; //7463847412

        int reverseNumber = 0;

        int lastDigit;

        while(number !=0)
        {

            lastDigit = number % 10;

            //Check for overflow

            if (reverseNumber> Integer.MAX_VALUE / 10 || (reverseNumber == Integer.MAX_VALUE / 10 && lastDigit > 7)){
                System.out.println(0);
                System.exit(0);

            }

            //check for underflow

            if (reverseNumber < Integer.MIN_VALUE / 10 || (reverseNumber == Integer.MIN_VALUE / 10 && lastDigit < -8)){
                System.out.println(0);
                System.exit(0);

            }

            reverseNumber = reverseNumber * 10+ lastDigit;

            number = number / 10;

        }
        System.out.println(reverseNumber);

    }


}
