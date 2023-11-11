package me.streams;

public record Player(String name, Integer number, Position position) {

	@Override
	public String toString() {
		return "Player{" +
				"name='" + name + '\'' +
				", number=" + number +
				", position=" + position +
				'}';
	}
}
