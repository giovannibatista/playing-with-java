package me.datastructures.set;

import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
	/*
	- No duplicate elements
	- on null element
	- Set doesn't garantee any order
	- TreeSet preserves order
	- HashSet doesn't preserve order
	- Note that this implementation is not synchronized. If multiple threads access a hash set concurrently,
	 and at least one of the threads modifies the set, it must be synchronized externally
	 */

	public static void main(String[] args) {
		Set<Player> players = new TreeSet<Player>();

		players.add(new Player("Messi"));
		players.add(new Player("Geromel"));
		players.add(new Player("Luan"));
		players.add(new Player("Luan"));

		players.forEach(System.out::println);

	}

	static record Player(String name) implements Comparable<Player>{

		@Override
		public int compareTo(Player o) {
			return o.name.compareTo(this.name);
		}
	};

}
