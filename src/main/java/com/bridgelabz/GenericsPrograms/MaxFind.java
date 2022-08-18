/*
 * Refactor 2 : Refactor to create Generic Class to take in 3 variable of Generic Type.
 */
package com.bridgelabz.GenericsPrograms;

public class MaxFind<T> {
	T x;
	T y;
	T z;

	public static <T extends Comparable<T>> T findMaximum(T x, T y, T z) {

		T max = x;

		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;

	}

	public static <T> void printMax(T x, T y, T z, T max) {

		System.out.printf("Max of %s , %s , %s is %s \n", x, y, z, max);

	}

	public static void main(String args[]) {

		MaxFind<Integer> obj1 = new MaxFind();
		System.out.println(obj1.findMaximum(1, 2, 4));

		MaxFind<Float> obj2 = new MaxFind();
		System.out.println(obj1.findMaximum(1.2f, 2.2f, 2.4f));

		MaxFind<String> obj3 = new MaxFind();
		System.out.println(obj1.findMaximum("rat", "mat", "cat"));

	}

}
