package com.java.codingprepartion;

import java.util.Scanner;

public class OccurancesNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Welcometo Array number occurnce");
		int num=ArrayUtility.InputArray();
		System.out.print("Enter the number that you want to search :");
		int element=input.nextInt();
		int occ= countOccurance(num ,element);
		
		

	}
	public static int countOccurance(int num[],int element) {
		int occ=0;
		return  -1;
	}

}
