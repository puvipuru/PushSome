package com.java.interview;

public class Factorial {
	private static void subMethod() {
		int a = 7;
		int fact = 1;
		for (int i = 1; i <=7; i++) {
			 fact = fact*i;
		}
		System.out.println("the factorial of 7 :"+fact);
	}

	public static void main(String[] args) {
		subMethod();
	}
}
