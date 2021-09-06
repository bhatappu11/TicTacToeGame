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
	public int decideFirstPlayer() {
		int firstPlayer = (int)Math.floor(Math.random()*2);
		String firstPlayerName = firstPlayer==0 ? "Player" : "Computer";
		System.out.println(firstPlayerName+" will play first");
		return firstPlayer;
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
		while(true) {
			System.out.println("Enter the index between 1-9");
			int index=scanner.nextInt();
			int indexCheck = checkFreeSpace(index);
			if(indexCheck==1) {
				gameBoard[index]=letter;
				displayBoard();
				break;
			}
			else {
				System.err.println("Index is not free");
				continue;
			}
		}
		
	}
	private int checkFreeSpace(int index) {
		if(gameBoard[index]==' ')
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe game");
		TicTacToeGame gameObject=new TicTacToeGame();
		char[] board = gameObject.createBoard();
		char playerLetter = gameObject.letterToPlay();
		char computerLetter = playerLetter=='X'?'O':'X';
		gameObject.displayBoard();
		int firstPlayer = gameObject.decideFirstPlayer();
		gameObject.makeMove(playerLetter);
		
	}
	
	

}
