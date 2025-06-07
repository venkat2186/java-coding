package org.example;

public class FirstDuplicate {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1};

        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[i] == numbers[j])
                {
                    System.out.println("First duplicate element is: " + numbers[i]);
                    return; // Exit after finding the first duplicate

                }

            }

        }

        System.out.println("No duplicate found.");
    }
}
