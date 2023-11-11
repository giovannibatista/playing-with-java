package me.datastructures.list;

import java.util.LinkedList;

public class LinkedListExamples {

	/*
		- Each node has the referece to the next node and previous node
		- there are head node and tail node
		- expensive memory, big cost
	 */

	public static void main(String[] args) {

		LinkedList<Person> people = new LinkedList<>();
		people.add(new Person("Kannemann", 33));
		people.add(new Person("Suarez", 35));
		people.add(1, new Person("Geromel", 38));

		people.forEach(System.out::println);
		System.out.println(people.get(2));

		var personListIterator = people.listIterator();

		while (personListIterator.hasNext()){
			System.out.println(personListIterator.next());
		}

		while (personListIterator.hasPrevious()){
			System.out.println(personListIterator.previous());
		}
	}

	static record Person(String name, int age){}
}
