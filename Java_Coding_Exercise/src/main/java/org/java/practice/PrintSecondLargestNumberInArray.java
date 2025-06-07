package org.java.practice;

public class PrintSecondLargestNumberInArray
{
    public static void main(String[] args)
    {

        int[] numbers = {44,96,34,23,11,109};
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for(int no: numbers){

            if (no>largestNumber){
                secondLargestNumber=largestNumber;
                largestNumber=no;
            }
            else if (no>secondLargestNumber && no!=largestNumber) {
                secondLargestNumber=no;

            }

        }
        System.out.println("Hello from PrintSecondLargestNumberInArray   : "  +secondLargestNumber);
    }
}
