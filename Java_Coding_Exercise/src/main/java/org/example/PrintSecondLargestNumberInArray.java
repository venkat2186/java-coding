package org.example;

public class PrintSecondLargestNumberInArray
{
    public static void main(String[] args)
    {
      int[] numbers = {1,2,3,4,5,6,7};
      int largestnumber = Integer.MIN_VALUE;
      int secondLargestNumber = Integer.MIN_VALUE;

      for (int no: numbers)
      {

          if (no>largestnumber)
          {
              secondLargestNumber=largestnumber;
              largestnumber=no;
          } else if(no>secondLargestNumber && no!=largestnumber)
          {
            secondLargestNumber=no;
          }

      }
        System.out.println(secondLargestNumber);
    }
}
