package org.java.practice;

public class PrintAllDuplicateIntArrayCount {
    public static void main(String[] args) {
        String input = "programming"; //11

        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);

            int count = 0;

            // Check if the character is already counted
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++)
            {
                if (input.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted)
            {
                continue;
            }

            // Count occurrences of the character
            for (int j = 0; j < input.length(); j++)
            {
                if (input.charAt(j) == ch)
                {
                    count++;
                }
            }

            // Print if count > 1
            if (count > 1)
            {
                System.out.println(ch + " = " + count);
            }
        }
    }
}

