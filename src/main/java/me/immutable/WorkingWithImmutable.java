package me.immutable;

public class WorkingWithImmutable {
	/*
	- Object whose contents cannot be changed once the object has been created.
	- Steing class is an immutable class, and String objects are immutable.

	- All data fields must be private
	- There can't be any setter methods
	- No getter methods can return a data field that is mutable
	-- if there is a getter method
	 */

	public static void main(String[] args) {
		Player p1 = new Player("Geromel");
		System.out.println(p1.getName());


		/*
			- Java save string in String Pool
			- In this example below, playerName and playerName2 have the same value, so java does not created another
			string object in memory with the same value. Java check in String pool if exist that value and
			 use the value that was created before.
			- IF we have a thousand of string with the value "Kannemann", Java will have one object in memory. This
			is the meaning immutable on String. That value will never be changed.

		 */
		String playerName = "Kannemann";
		String playerName2 = "Kannemann";
		System.out.println(playerName2 == playerName);


		/*
		- In this another example below, when we declare a new String with the String's constructor, Java will create
		an object out of string pool. So Java will not use the same string value.
		 */
		String playerName3 = new String("Kannemann");

		System.out.println(playerName == playerName3);

	}
}
