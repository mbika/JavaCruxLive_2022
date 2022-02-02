package com.technostack;

public class MaxofNumbers {

	public static void main(String[] args) {

		int a = 34;
		int b = 45;
		int c = 89;

		int temp;
		if (a > b && a > c) {
			temp = a;
			System.out.println("A is greater" + temp);
		} else if (b > a && b > c) {
			temp = b;
			System.out.println("B is greater" + temp);
		} else {
			System.out.println("C is greater" + c);
		}
	}
}
