package org.java.practice;

public class PrintAllEvenLengthStringsInArray
{
    public static void main(String[] args)
    {


        String inputValue = "Sky Is Blue And Vast";
        String[] dataArray = inputValue.split(" ");

        for (String word: dataArray){
            if (word.length() %2 ==0){
                System.out.println("Hello from PrintAllEvenLengthStringsInArray : "  +word);
            }
        }

    }
}
