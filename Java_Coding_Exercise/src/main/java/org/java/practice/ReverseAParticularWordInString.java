package org.java.practice;

public class ReverseAParticularWordInString {
    public static void main(String[] args) {
        String S = "My name is Raja";
        String Exp = "name";

        // Check if the expected word exists in the string
        if (S.contains(Exp)) {
            // Reverse the word
            String reversedWord = new StringBuilder(Exp).reverse().toString();

            // Replace the word with the reversed version
            String result = S.replace(Exp, reversedWord);

            // Print the result
            System.out.println(result);
        } else {
            System.out.println("The word '" + Exp + "' was not found in the sentence.");
        }
    }
}

