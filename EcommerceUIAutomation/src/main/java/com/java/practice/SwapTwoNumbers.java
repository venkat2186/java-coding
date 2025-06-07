package com.java.practice;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		//Solution 1 using "temp" variable
		/*int a =10;
		int b=20;
		int temp;
		temp =a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b); */
		
		//Solution 2 using without "temp" variable
		/*int a =20;
		int b =10;
		
		System.out.println("a: " +a);
		System.out.println("b: "  +b);
		
		a=a+b; //a=30
		b=a-b; //b=20
		a=a-b; //a=10
		
		System.out.println("a: " +a);
		System.out.println("b: "  +b); */
		
		//Solution 3 using "bitwise" operator 'EX-OR' "^"
		int a=20;
		int b=10;
		
		System.out.println("a: " +a);
		System.out.println("b: "  +b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("a: " +a);
		System.out.println("b: "  +b);
				

	}

}
