package com.mypackage;

public class Testtrycatch1 {
	public static void main(String args[]) {
		
		try {
			System.out.println("in try block");
		
			int data = 50 / 0;// may throw exception
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		System.out.println("rest of the code...");
	}
}