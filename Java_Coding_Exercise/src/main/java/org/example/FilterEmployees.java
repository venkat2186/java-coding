package org.example;

public class FilterEmployees {
    public static void main(String[] args) {
        // Create employee data using arrays
        String[] names = {"Raj", "Patrick", "Shyam"};
        int[] ages = {40, 32, 35};

        System.out.println("Employees older than 33:");

        // Loop through the employees
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > 33) {
                System.out.println(names[i]);
            }
        }
    }
}

