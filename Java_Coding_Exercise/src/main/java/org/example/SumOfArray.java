package org.example;

public class SumOfArray {
    public static void main(String[] args) {

        int [] numbers = {1,24,33,44};
        int sum = 0;

        for (int i = 0; i <=numbers.length-1 ; i++) {

            sum=sum+numbers[i];

        }
        System.out.println(sum);
    }
}
