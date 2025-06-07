package org.java.practice;

public class FindMissingNumberInArray
{
    public static void main(String[] args)
    {

        int[] numbers = {1,2,4,5,6};
        int missingNumber =0;

        for(int no: numbers)
        {
            missingNumber = missingNumber^no;
        }
        for (int i = 0; i <numbers.length; i++)
        {
            missingNumber = missingNumber^i;

        }
        System.out.println(missingNumber);
    }
}
