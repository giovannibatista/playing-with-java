package me.datastructures.list;

import java.util.List;
import java.util.Stack;

public class StacksExamples {

	/*
	 - Represents a last-in-first-out(LIFO) stack of objects
	 - extends class Vector
	 - Push and pop operations
	 - Peek to look the top item without removing it



	 */

	public static void main(String[] args) {
		Stack<Integer> numbers = new Stack<>();

		numbers.push(1);
		numbers.push(2);
		numbers.push(3);

		System.out.println(numbers.peek());
		System.out.println(numbers.size());
		numbers.pop();
		System.out.println(numbers.size());


		List<Character> letters = new Stack<>();
		letters.add('A');
		letters.add('B');
		letters.add('C');
		System.out.println(((Stack<Character>) letters).peek());



	}
}
