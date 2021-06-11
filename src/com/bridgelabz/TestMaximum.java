package com.bridgelabz;

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
	 * This method is checking the maximum of three numbers
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
		System.out.printf("Maximum of %s, %s and %s is %s\n\n", x, y, z, max);
		return max;
	}

	public static void main(String args[]) {
		TestMaximum testMaximum = new TestMaximum();
		testMaximum.maximum(3, 4, 5);
		testMaximum.maximum(9.2, 4.4, 5.6);
		testMaximum.maximum("Apple", "Peach", "Banana");
	}
}