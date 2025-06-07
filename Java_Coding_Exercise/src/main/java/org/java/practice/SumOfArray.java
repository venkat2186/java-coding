package org.java.practice;

public class SumOfArray
{
    public static void main(String[] args)
    {

        int[] numbers = {10,20,30,40,50,60,70,80};
        int sum = 0;

        for (int number: numbers){
            sum=sum+number;
        }

        System.out.println("Hello from SumOfArray is : " +sum);
    }
}
