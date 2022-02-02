package com.technostack;

import java.util.Scanner;

public class SumOfNaturalNo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(sumOfNaturalNo(n));
	}

	static int sumOfNaturalNo(int n) {
		int i = 1;
		int sum = 0;
		while (i <= n) {
			System.out.println(i);
			i++;
			sum += i;
		}
		return sum;

	}
}
