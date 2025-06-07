package org.java.practice;

public class FilterEmployees
{
    public static void main(String[] args) {

        String[] names = {"Raj", "Patrick", "Shyam"};
        int[] ages = {40, 32, 35};

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >33) {
                System.out.println("Employees age greater than 33 are : " +names[i]);

            }

        }
    }
}
