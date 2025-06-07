package org.java.practice;

public class PrintFirstDuplicateNumberInArray
{
    public static void main(String[] args)
    {
        int[] number = {33,34,35,33,34};

        for (int i = 0; i < number.length; i++)
        {

            for (int j = i+1; j <number.length ; j++)
            {
                if (number[i] == number[j])
                {
                    System.out.println("First Duplicate Number in a Array is : " +number[i]);
                    return;

                }

            }

        }





    }
}
