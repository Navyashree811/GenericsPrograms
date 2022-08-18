/*
*  Refactor 1 : Refactor all the 3 to One Generic Method and find the maximum.
*/
package com.bridgelabz.GenericsPrograms;

public class FinndMax {

	public static <T extends Comparable<T>> T findMaximum(T x, T y, T z) {
		T max = x;

		if (y.compareTo(max) > 0)
			max = y;

		if (z.compareTo(max) > 0)
			max = z;

		return max;
	}

	public static void main(String args[]) {
		System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, findMaximum(3, 4, 5));

		System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, findMaximum(6.6, 8.8, 7.7));

		System.out.printf("Maximum of %s, %s and %s is %s\n", "pear", "apple", "orange",
				findMaximum("pear", "apple", "orange"));
	}
}