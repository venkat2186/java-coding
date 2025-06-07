package org.example;

public class FindMissingSumArrayPart1
{
    public static void main(String[] args)
    {
       int[] numbers = {2,3,4,5,6}; // Condition is Min limit is 2 and Max limit is 6 and in between remaining numbers are not duplicated are sequential in order
       int totalNumbers = 6;
       int totalSumOfAllNumbers = totalNumbers*(totalNumbers+1)/2 ; //21
        int sum = 0;

        //Find the length of actual array numbers
        for (int i = 0; i < numbers.length ; i++)
        {
            sum = sum+numbers[i];

        }
        System.out.println("Missing Number Is : " +(totalSumOfAllNumbers-sum));
    }
}
