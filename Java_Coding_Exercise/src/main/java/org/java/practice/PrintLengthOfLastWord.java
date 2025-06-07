package org.java.practice;

public class PrintLengthOfLastWord
{
    public static void main(String[] args)
    {
        String word = "Hello World Moon Sky ";
        char [] inputArray= word.toCharArray();
        int count=0;

        for (int i = inputArray.length-1; i >=0 ; i--)
        {
            if (inputArray[i] != ' ')
            {
                count = count+1;
            }
            else if (count>0)
            {
                System.out.println("Hello from PrintLengthOfLastWord : "  +count);
                break;
            }
        }
    }
}
