package org.example;

import java.math.BigInteger;

public class FactorialOfBigNumber
{
    public static void main(String[] args) {

        int number = 50;
        BigInteger result = BigInteger.ONE; //BigInteger is a class in java and non primitive datatype.


        for(int i=1; i<=number; i++)

        {
            result=result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result);



    }



}
