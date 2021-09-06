package com.bridgelabz.tictactoe;

public class TicTacToeGame {
	public static char[] gameBoard = new char[10];
	public static void createBoard() {
		for(int index=1;index<=10;index++) {
			gameBoard[index]=' ';
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe game");
		createBoard();
	}

}
