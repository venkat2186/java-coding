package org.java.practice;

public class FindSecondLargestWord {
    public static void main(String[] args) {
        // Input string
        String input = "Java is a powerful and widely used programming language";

        // Split the input string into words
        String[] words = input.split(" ");

        // Initialize variables to hold the largest and second-largest words
        String largest = "";
        String secondLargest = "";

        // Loop through each word
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // If current word is longer than the largest
            if (word.length() > largest.length()) {
                // Move largest to secondLargest before updating largest
                secondLargest = largest;
                largest = word;
            }
            // If current word is not equal to largest but longer than secondLargest
            else if (word.length() > secondLargest.length() && !word.equals(largest)) {
                secondLargest = word;
            }
        }

        // Check if a valid second largest word was found
        if (secondLargest.length() > 0) {
            System.out.println("Second largest word: " + secondLargest);
        } else {
            System.out.println("Could not find a second largest word.");
        }
    }
}

