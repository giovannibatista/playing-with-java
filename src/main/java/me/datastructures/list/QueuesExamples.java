package me.datastructures.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesExamples {
	/*
	- FIFO(First in First OUT)
	- A collection designed for holding elements prior to processing.
	- Insert in tail
	- Remove from head
	- offer - add element when using a capacity-restricted queue
	 */

	public static void main(String[] args) {
		Queue<Person> store = new LinkedList<>();

		store.add(new Person("Giovanni", 32));
		store.add(new Person("Iasmim", 26));

		System.out.println(store.peek());
		System.out.println(store.size());
		System.out.println(store.poll());
		System.out.println(store.peek());
		System.out.println(store.size());



	}

	static record Person(String name, int age){}
}
