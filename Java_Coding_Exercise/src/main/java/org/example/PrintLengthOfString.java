package org.example;

public class PrintLengthOfString
{
    public static void main(String[] args)
    {
        String input = "JAVA"; //String is nothing but series of characters.
        int size = input.length(); //length method is used to find the size of a String.

        System.out.println(size);
        if(size % 2 == 0) {
            System.out.println("Length of a String is even");
        }
        else {
            System.out.println("Length of a String is odd");
        }

    }
}
