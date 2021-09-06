package com.bridgelabz.tictactoe;

import java.util.*;

public class TicTacToeGame {
	public char[] gameBoard = new char[10];
	Scanner scanner=new Scanner(System.in);
	
	public char[] createBoard() {
		for(int index=1;index<gameBoard.length;index++) {
			gameBoard[index]=' ';
		}
		return gameBoard;
	}
	public char letterToPlay() {
		System.out.println("choose the letter to play option 1: X option 2: O");
		char letter=scanner.next().charAt(0);
		return letter;
	}
	private void displayBoard() {
		for(int index=1;index<gameBoard.length;index++) {
			if(index==4 || index==7)
				System.out.println();
			System.out.print(gameBoard[index]+"|");
		}
		System.out.println();
	}
	public void makeMove(char letter) {
		System.out.println("Enter the index between 1-9");
		int index=scanner.nextInt();
		if(gameBoard[index]==' ') {
			gameBoard[index]=letter;			
		}
		else
			System.err.println("Index is not free");
		
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe game");
		TicTacToeGame gameObject=new TicTacToeGame();
		char[] board = gameObject.createBoard();
		char computerLetter = ' ';
		char playerLetter = gameObject.letterToPlay();
		computerLetter = playerLetter=='X'?'O':'X';
		gameObject.displayBoard();
		gameObject.makeMove(playerLetter);
		gameObject.displayBoard();
		
	}
	
	

}
