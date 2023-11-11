package me.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {

	/*
		- Functional programming
		- Imperative to declarative


	 */

	public static void main(String[] args) {
		List<Player> players = fillPlayers();


		//Filter
		var defenders = players.stream()
				.filter(player -> Position.DEFENDER.equals(player.position()))
				.collect(Collectors.toList());
		//defenders.forEach(System.out::println);

		//Sort

		players.stream().sorted(Comparator.comparing(Player::position)
						.thenComparing(Player::number).reversed())
				.collect(Collectors.toList()).forEach(System.out::println);

		//All match
		var allMatch = players.stream().allMatch(player -> player.number() > 2);
		System.out.println("AllMatch: " + allMatch);
		allMatch = players.stream().allMatch(player -> player.position().equals(Position.DEFENDER));
		System.out.println("AllMatch: " + allMatch);

		//Any match
		var anyMatch = players.stream().anyMatch(player -> player.position().equals(Position.DEFENDER));
		System.out.println("AnyMatch: " + anyMatch);

		//None match
		var noneMatch = players.stream().noneMatch(player -> player.name().equals("Ronaldinho"));
		System.out.println("NoneMatch: " + noneMatch);


		//Max
		players.stream().max(Comparator.comparing(Player::number))
				.ifPresent(System.out::println);

		//Min
		players.stream().min(Comparator.comparing(Player::number))
				.ifPresent(System.out::println);

		//Group
		Map<Position, List<Player>> collect = players.stream().collect(Collectors.groupingBy(Player::position));
		collect.forEach((k, v) -> {
			System.out.println(k);
			v.stream().forEach(System.out::println);
		});


	}


	private static List fillPlayers() {
		return List.of(new Player("Grando", 12, Position.GOALKEEPER),
				new Player("Geromel", 3, Position.DEFENDER),
				new Player("Kannemann", 4, Position.DEFENDER),
				new Player("Carballo", 8, Position.MIDFIELDERS),
				new Player("Suarez", 9, Position.FORWARDS),
				new Player("Ferreira", 10, Position.FORWARDS));
	}
}
