package me;

public class JavaMiscApplication {

	public static int biggestInteger(int n) {
		var maxLength = getLenthOfInteger(Integer.MAX_VALUE);
		var length = getLenthOfInteger(n);
		return length < maxLength ? Integer.valueOf("9".repeat(length)) : Integer.MAX_VALUE;
	}

	public static int getLenthOfInteger(int n){
		return String.valueOf(Math.abs(n)).length();
	}

}
