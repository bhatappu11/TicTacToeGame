package com.bridgelabz.tictactoe;

import java.util.*;

public class TicTacToeGame {
	public static char[] gameBoard = new char[10];
	
	public static char[] createBoard() {
		for(int index=1;index<gameBoard.length;index++) {
			gameBoard[index]=' ';
		}
		return gameBoard;
	}
	public static char letterToPlay() {
		System.out.println("choose the letter to play option 1: X option 2: O");
		Scanner scanner=new Scanner(System.in);
		char letter=scanner.next().charAt(0);
		return letter;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe game");
		char[] board = createBoard();
		char computerLetter = ' ';
		char playerLetter = letterToPlay();
		if(playerLetter == 'X')
			computerLetter = 'O';
		else
			computerLetter = 'X';
		
	}

}
