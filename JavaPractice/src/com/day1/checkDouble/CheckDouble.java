package com.day1.checkDouble;

import java.util.Scanner;
public class CheckDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//initiaze the scanner
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first value:");
		String input1= sc.nextLine();
		if(isDouble(input1)) {
			System.out.println("First value is valid");
			System.out.println(" Enter the second value");
			
			String input2=sc.nextLine();
			if(isDouble(input2)) {
				System.out.println("Second value is valid");
				if(input1.equals(input2)) {
					System.out.println("Values are equal. Value1: "+input1+"Value2: "+ input2+".");
				}
				else
					System.out.println("Values are not equal. Value1: "+input1+"Value2: "+ input2+".");
			}
			else
			 System.out.println("Second value is invalid");
		}
		else
			System.out.println("First value is invalid!!");
		
	}
	
	public static boolean isDouble(String input) {
		try {
			Double.parseDouble(input);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}

}
