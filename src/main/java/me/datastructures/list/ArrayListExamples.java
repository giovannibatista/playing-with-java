package me.datastructures.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

	/*
	- An ordered collection aka sequence
	- Allow duplicates
	- Not Fixed in size like Arrays
	- Fast for data retrivals
	- Various implementations
		- ArrayList
		- Stack
		- Vector
		- Others
	 */

	public static void main(String[] args) {
		List colors = new ArrayList<String>();
		colors.add("yellow");
		colors.add("black");

		System.out.println(colors);

		List devices = List.of("laptop", "phone", "watch");


	}
}
