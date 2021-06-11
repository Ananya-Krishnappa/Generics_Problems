package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class TestMaximum<T extends Comparable<T>> {
	private T x, y, z;

	public TestMaximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public TestMaximum() {

	}

	/**
	 * This method is checking the maximum of three values
	 * 
	 * @param <T>
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */

	public <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		printMax(x, y, z, max);
		return max;
	}

	/**
	 * this method finds the maximum of variable number of parameters
	 * 
	 * @param <T>
	 * @param x
	 * @return
	 */
	public <T extends Comparable<T>> T max(T... x) {
		int j = 0;
		T max = null;
		List<T> inputArray = new ArrayList<T>();
		for (T i : x) {
			inputArray.add(i);
			if (j == 0) {
				max = i;
			}
			if (i.compareTo(max) > 0) {
				max = i;
			}
			j++;
		}
		System.out.println("Maximum of " + inputArray.toString() + " is " + max);
		return max;
	}

	/**
	 * this method prints the arguments passed
	 * 
	 * @param <T>
	 * @param x
	 * @param y
	 * @param z
	 * @param max
	 */
	private <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Maximum of %s, %s and %s is %s\n\n", x, y, z, max);
	}

	public static void main(String args[]) {
		TestMaximum testMaximum = new TestMaximum();
		testMaximum.maximum(3, 4, 5);
		testMaximum.maximum(9.2, 4.4, 5.6);
		testMaximum.maximum("Apple", "Peach", "Banana");
	}
}