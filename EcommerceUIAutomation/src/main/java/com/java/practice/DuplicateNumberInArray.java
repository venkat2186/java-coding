package com.java.practice;
import java.util.Arrays;

public class DuplicateNumberInArray {

    public static void main(String[] args) {

        int[] numbers = {4, 5, 6, 7, 8, 9, 9};

        Arrays.sort(numbers);

        // Keep track of already printed numbers
        boolean[] printed = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (printed[i]) continue;

            int currentNumber = numbers[i];
            int count = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (currentNumber == numbers[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println("Duplicate Number = " + currentNumber);
                // Mark all duplicates as printed
                for (int j = i; j < numbers.length; j++) {
                    if (numbers[j] == currentNumber) {
                        printed[j] = true;
                    }
                }
            }
        }
    }
}
