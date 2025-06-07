package com.java.practice;

public class VerifyEmailIsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    
		        // Step 1: Arrays for IDs and Emails
		        int[] ids = {1, 2};
		        String[] emails = {"a@x.com", " "}; // <-- second email is empty for testing

		        // Step 2: Start assuming test will pass
		        boolean shouldFail = false;

		        // Step 3: Loop through each email
		        for (int i = 0; i < emails.length; i++) {
		            if (emails[i] == null || emails[i].trim().isEmpty()) {
		                // Email is empty, print the ID
		                System.out.println("Email is empty for ID: " + ids[i]);
		                shouldFail = true;
		            }
		        }

		        // Step 4: Print appropriate status code
		        if (shouldFail) {
		            System.out.println("Status Code: 400"); // 400 - Bad Request (Failure)
		        } else {
		            System.out.println("Status Code: 200"); // 200 - OK (Success)
		        }
		    }
		


	}


