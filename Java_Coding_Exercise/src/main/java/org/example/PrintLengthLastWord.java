package org.example;

public class PrintLengthLastWord
{
    public static void main(String[] args)
    {


       String s = "Hello    World    Moon";
       //s.trim(); //trim method removes white spaces before and after the String
       System.out.println(s);
       int count=0;
       char[] inputArray = s.toCharArray(); //Converting String to char Array to find the count of last word

        for (int i = inputArray.length-1; i >=0 ; i--)
        {

            if(inputArray[i] != ' ')
            {
                count = count+1;
            } else
            {
                if (count > 0)
                {
                    System.out.println(count);
                    break;

                }
            }

        }






    }
}
