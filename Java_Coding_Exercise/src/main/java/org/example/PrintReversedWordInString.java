package org.example;

public class PrintReversedWordInString {
    public static void main(String[] args) {

        String s = "My Name is Venkatesh";
        String exp = "Venkatesh";


        if(s.contains(exp)){

            String reversedWord = new StringBuilder(exp).reverse().toString();
            String result = s.replace(exp,reversedWord);

            System.out.println(result);
        } else {

            System.out.println("The reversed word not found in the string");
        }
        
    }
}
