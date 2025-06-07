package org.java.practice;

import java.util.Arrays;

public class SwapNonZeroWithZero {
    public static void main(String[] args) {
        int[] arr = {0, -1, 5, 0, 7, 8, 0, 0, 9, 0}; //10

        int index = 0; // pointer to place the next non-zero

        // Move all non-zero elements to the beginning
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Fill the remaining array with zeros
        while (index < arr.length)

        {
            arr[index++] = 0;
        }

        System.out.println("After swapping non-zero with zeros:");
        System.out.println(Arrays.toString(arr));
    }
}
