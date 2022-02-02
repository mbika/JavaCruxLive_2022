package com.technostack;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Privide principal");
		int principal = scanner.nextInt();

		System.out.println("privide rate of Interest");
		int roi = scanner.nextInt();

		System.out.println("Provide time duration in Years");
		int time = scanner.nextInt();

		int result;

		result = principal * time * roi / 100;
		System.out.println("Result" + result);

	}
}
