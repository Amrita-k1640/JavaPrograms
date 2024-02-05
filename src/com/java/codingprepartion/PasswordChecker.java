package com.java.codingprepartion;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Welcome tp Set the Password");
		//boolean isValid;
		String password;
		do {
			System.out.println("PLease Enter the password");
			password=input.next();
			
		}while(!IsValidPassword(password));
			System.out.println("thanks for entering correct password");
			
		}
	
	
		
	

	
	public static boolean IsValidPassword(String password) {
		
		return password.length()>5;
	}
	
	
	
}	
	
	
	
	
