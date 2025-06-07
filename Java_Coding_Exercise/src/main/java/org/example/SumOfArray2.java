package org.example;

public class SumOfArray2
{
    public static void main(String[] args)
    {
       int[] numbers = {1,24,33,44};

       int sum=0;

       for (int number: numbers){

           sum=sum+number;
       }
       System.out.println(sum);
    }
}
