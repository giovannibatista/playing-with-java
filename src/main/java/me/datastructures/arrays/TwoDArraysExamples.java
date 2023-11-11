package me.datastructures.arrays;

import java.util.Arrays;

public class TwoDArraysExamples {

	public static void main(String[] args) {
		char[][] board = new char[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = 'X';
			}
		}

		char[][] boardTwo = new char[][]{
				new char[]{'X', 'O', 'X'},
				new char[]{'X', 'O', 'X'},
				new char[]{'X', 'O', 'X'}
		};


		System.out.println(Arrays.deepToString(board));
		System.out.println(Arrays.deepToString(boardTwo));

	}
}
