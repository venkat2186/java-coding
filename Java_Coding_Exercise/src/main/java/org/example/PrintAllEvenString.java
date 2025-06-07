package org.example;

public class PrintAllEvenString

{
    public static void main(String[] args)
    {
        String input = "Sky Is Blue And Vast"; //String Declaration
        String[] dataArray =input.split(" "); //Using split method based on empty spaces String array is stored.

        for (String word: dataArray) //Using for each loop traversing through the String array
        {
            if (word.length() %2 == 0) {
                System.out.println(word);

            }
        }
    }
}
