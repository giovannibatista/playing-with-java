package me.datastructures.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class MapExamples {
	/*

	Key/Value
	- Key is not duplicated


	Some implementations
	- HashTable = Null not allowed, Synchronised(multi thread)
	- HasMap = Null Allowed
	- LinkedHashMap = Null Allowed, Doubly LinkedListed based impl, slow
	- SortedMap <- NaviagagleMap <- TreeMap - Sorted, Null Not allowd
	-

	- Key alwaws user hash funtion and generate a hashcode.


	 */

	public static void main(String[] args) {
		Map<Integer, Player> players = new HashMap<>();

		players.put(3, new Player("Geromel"));
		players.put(4, new Player("Kannemann"));
		players.put(9, null);
		players.put(9, new Player("Suarez"));

		System.out.println(players);
		System.out.println(players.size());
		System.out.println(players.entrySet());
		System.out.println(players.keySet());



		Map<Player, Team> teams = new Hashtable<>();

		teams.put(new Player("Geromel"), new Team("Grêmio"));
		teams.put(new Player("Kannemann"), new Team("Grêmio"));

		System.out.println(teams);
		System.out.println(teams.get(new Player("Geromel")));

	}

	record Player(String name){
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Player player = (Player) o;
			return Objects.equals(name, player.name);
		}

		@Override
		public int hashCode() {
			return Objects.hash(name);
		}
	}

	record Team(String name){}
}
