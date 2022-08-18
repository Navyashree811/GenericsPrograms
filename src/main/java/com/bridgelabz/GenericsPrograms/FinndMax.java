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

}