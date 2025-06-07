package com.java.practice;

public class ReverseIntegers {

	public static void main(String[] args) {
		
		int number=123; //local variable
		System.out.println("Integer.MAX_VALUE :" +Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE :" +Integer.MIN_VALUE);
		int reverseNumber=0; //local variable
		int lastDigit=0; //local variable
		
		while (number!=0) {
			
			lastDigit=number%10; //number modules(%) 10, it will give reminder
			
			//check for overflow
			
			if (reverseNumber> Integer.MAX_VALUE/10 || (reverseNumber ==Integer.MAX_VALUE/10 && lastDigit>7)) {
				System.out.println(0);
				System.exit(0);;
				
			}
			
			if (reverseNumber< Integer.MIN_VALUE/10 || (reverseNumber ==Integer.MIN_VALUE/10 && lastDigit<-8)) {
				System.out.println(0);
				System.exit(0);; //underflow, return 0
				
			}
			
			
			
			
			
			
			
			
			
			
			reverseNumber= reverseNumber*10+lastDigit;
			number=number/10; //number divided by 10, it will quotient
			
			
			
		}
		
		System.out.println("reverseNumber : " +reverseNumber);
		
		

	}

}
