package org.java.practice;

import java.math.BigInteger;

public class FactorialLargeNumber
{
    public static void main(String[] args) {

        int number = 50;
        BigInteger result = BigInteger.ONE;


        for (int i = 1; i <=number ; i++) {
            result = result.multiply(BigInteger.valueOf(i));

        }

        System.out.println(result);
    }
}
