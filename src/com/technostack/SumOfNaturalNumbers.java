package com.technostack;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int i = 1;
		int sum = 0;
		while (i <= n) {
			System.out.println(i);
			i++;
			sum += i;
		}

	}
}
