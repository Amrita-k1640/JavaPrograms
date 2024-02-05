package com.java.codingprepartion;

import java.util.Scanner;

class PrimeFor {
	public static void main(String arg)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Prime number checker :");
		System.out.print("Please Enter Number :");
		int num =input.nextInt();
		System.out.println("your number is " + (isPrime(num)? "Prime" : "Not Prime " ));
			
			
	}
	public static boolean isPrime(int num) {
		for(int i=2 ;i<num ;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
