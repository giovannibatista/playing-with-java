package me.datastructures.arrays;

import java.util.Arrays;

public class ArrayExamples {

	/*
		- Fixed in size
		- Fast for data retrivals
		- Compact memory usage if size is known
		- Delete operation very hard
		- 2D Arrays
		- Vector is synchronized, it's thread safe. If thread-safe implementation is not needed, use ArrayList in
		place of Vector.
		-


	 */

	public static void main(String[] args) {

		int[] numbers = {1, 2, 3, 4};

		String[] colors = new String[5];
		colors[0] = "purple";
		colors[1] = "green";

		System.out.println(Arrays.toString(colors));
		System.out.println(Arrays.toString(numbers));


		Arrays.stream(numbers).forEach(System.out::println);

		System.out.println("index of that key is: " + Arrays.binarySearch(numbers, 1));
		System.out.println("index of that key is: " + Arrays.binarySearch(numbers, 2));



	}

}
