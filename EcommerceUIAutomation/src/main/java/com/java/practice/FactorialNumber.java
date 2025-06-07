package com.java.practice;
import java.math.BigInteger;

public class FactorialNumber {

	public static void main(String[] args) {
		
		
		
		int number=50;
		BigInteger result = BigInteger.ONE; //"BigInteger" is a non primitive data type in java and BigInteger is a class in java
		
		for (int i = 1; i <= number; i++) {
			
			result=result.multiply(BigInteger.valueOf(i));
			
		}
		
		System.out.println("Factorial of n: " +result);

	}

}
