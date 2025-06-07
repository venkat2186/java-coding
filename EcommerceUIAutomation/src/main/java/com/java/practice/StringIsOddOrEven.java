package com.java.practice;

public class StringIsOddOrEven {

	public static void main(String[] args) {

		String input = "Sky is blue and vast";

		String data[] = input.split(" ");
		
		/*System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		System.out.println(data[3]);
		System.out.println(data[4]); */

		for (String word : data) {
			
			System.out.println(word);
			
			if(word.length()%2 ==0)
			System.out.println("Even word strings are  : " +word);

		}

	}

}
