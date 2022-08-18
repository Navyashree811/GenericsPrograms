/*
 * Given 3 Floats Find the Maximum.
 */
package com.bridgelabz.GenericsPrograms;

import java.util.Scanner;

public class Max3Floats {
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter 3 Integer number");

		Float num1 = sc1.nextFloat();
		Float num2 = sc1.nextFloat();
		Float num3 = sc1.nextFloat();

		Max3Floats.findingMaxNumber(num1, num2, num3);
	}

	public static Float findingMaxNumber(Float num1, Float num2, Float num3) {
		Float max = num1;
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
