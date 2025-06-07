package org.java.practice;

public class ReverseAnString
{
    public static void main(String[] args)
    {


                String original = "hello";
                String reversed = "";

                // Loop from the end of the string to the beginning
                for (int i = original.length() - 1; i >= 0; i--)
                {
                    reversed = reversed + original.charAt(i);
                }

                System.out.println("Reversed string: " + reversed);
            }
        }



