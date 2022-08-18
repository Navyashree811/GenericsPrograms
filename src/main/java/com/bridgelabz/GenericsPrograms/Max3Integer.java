/*
 * Given 3 Integers Find the Maximum.
 */
package com.bridgelabz.GenericsPrograms;

import java.util.Scanner;

public class Max3Integer {
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter 3 Integer number");

		Integer num1 = sc1.nextInt();
		Integer num2 = sc1.nextInt();
		Integer num3 = sc1.nextInt();

		Max3Integer.findingMaxNumber(num1, num2, num3);
	}

	public static Integer findingMaxNumber(Integer num1, Integer num2, Integer num3) {
		int max = num1;
		if (num2.compareTo(max) > 0) {
			max = num2;
		}
		if (num3.compareTo(max) > 0) {
			max = num3;
		}
		System.out.println(" Max number is : " + max);
		return max;

	}

}
