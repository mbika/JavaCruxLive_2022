package com.technostack;

public class GradeCard {

	public static void main(String[] args) {

		int marks = 78;

		if (marks >= 80) {
			System.out.println("Grade A");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("Grade B");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("Grade C");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}
}
