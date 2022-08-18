/*
 * Given 3 Strings Find the Maximum.
 */
package com.bridgelabz.GenericsPrograms;

import java.util.Scanner;

public class Max3Strings {
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter 3 Strings ");

		String num1 = sc1.nextLine();
		String num2 = sc1.nextLine();
		String num3 = sc1.nextLine();

		Max3Strings.findingMaxNumber(num1, num2, num3);
	}

	public static String findingMaxNumber(String num1, String num2, String num3) {
		String max = num1;
		if (num2.compareTo(max) > 0) {
			max = num2;
		}
		if (num3.compareTo(max) > 0) {
			max = num3;
		}
		System.out.println(" Max String is : " + max);
		return max;

	}

}
