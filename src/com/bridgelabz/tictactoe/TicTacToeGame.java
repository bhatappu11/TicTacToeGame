package com.bridgelabz.tictactoe;

import java.util.*;

public class TicTacToeGame {
	public static char[] gameBoard = new char[10];
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
			System.out.println();
			System.out.println("Enter the index between 1-9");
			int index=scanner.nextInt();
			int indexCheck = checkFreeSpace(index);
			if(indexCheck==1) {
				gameBoard[index]=letter;
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
	private int checkForWinningPositionAvailability(char letter) {
		if (gameBoard[1] == letter && gameBoard[2] == letter && gameBoard[3] == ' ') {
			return 3;
		}
		if (gameBoard[1] == letter && gameBoard[3] == letter && gameBoard[2] == ' ') {
			return 2;
		}
		if (gameBoard[3] == letter && gameBoard[2] == letter && gameBoard[1] == ' ') {
			return 1;
		}
		if (gameBoard[4] == letter && gameBoard[5] == letter && gameBoard[6] == ' ') {
			return 6;
		}
		if (gameBoard[4] == letter && gameBoard[6] == letter && gameBoard[5] == ' ') {
			return 5;
		}
		if (gameBoard[6] == letter && gameBoard[5] == letter && gameBoard[4] == ' ') {
			return 4;
		}
		if (gameBoard[7] == letter && gameBoard[8] == letter && gameBoard[9] == ' ') {
			return 9;
		}
		if (gameBoard[7] == letter && gameBoard[9] == letter && gameBoard[8] == ' ') {
			return 8;
		}
		if (gameBoard[9] == letter && gameBoard[8] == letter && gameBoard[7] == ' ') {
			return 7;
		}
		if (gameBoard[1] == letter && gameBoard[4] == letter && gameBoard[7] == ' ') {
			return 7;
		}
		if (gameBoard[1] == letter && gameBoard[7] == letter && gameBoard[4] == ' ') {
			return 4;
		}
		if (gameBoard[7] == letter && gameBoard[4] == letter && gameBoard[1] == ' ') {
			return 1;
		}
		if (gameBoard[2] == letter && gameBoard[5] == letter && gameBoard[8] == ' ') {
			return 8;
		}
		if (gameBoard[2] == letter && gameBoard[8] == letter && gameBoard[5] == ' ') {
			return 5;
		}
		if (gameBoard[8] == letter && gameBoard[5] == letter && gameBoard[2] == ' ') {
			return 2;
		}
		if (gameBoard[3] == letter && gameBoard[6] == letter && gameBoard[9] == ' ') {
			return 9;
		}
		if (gameBoard[3] == letter && gameBoard[9] == letter && gameBoard[6] == ' ') {
			return 6;
		}
		if (gameBoard[9] == letter && gameBoard[6] == letter && gameBoard[3] == ' ') {
			return 3;
		}
		if (gameBoard[1] == letter && gameBoard[5] == letter && gameBoard[9] == ' ') {
			return 9;
		}
		if (gameBoard[1] == letter && gameBoard[9] == letter && gameBoard[5] == ' ') {
			return 5;
		}
		if (gameBoard[9] == letter && gameBoard[5] == letter && gameBoard[1] == ' ') {
			return 2;
		}
		if (gameBoard[3] == letter && gameBoard[5] == letter && gameBoard[7] == ' ') {
			return 7;
		}
		if (gameBoard[3] == letter && gameBoard[7] == letter && gameBoard[5] == ' ') {
			return 5;
		}
		if (gameBoard[7] == letter && gameBoard[5] == letter && gameBoard[3] == ' ') {
			return 3;
		} else
			return 0;

	}
	private int checkIfOpponentCanWin(char opponent) {
		int availability=checkForWinningPositionAvailability(opponent);
		return availability;
		
	}
	private int checkAvailableCorner() {
		if(gameBoard[1]==' ')
			return 1;
		else if(gameBoard[3]==' ')
			return 3;
		else if(gameBoard[7]==' ')
			return 7;
		else if(gameBoard[9]==' ')
			return 9;
		else
			return 0;
	}
	private int checkRemainingAvailableIndex() {
		if(gameBoard[2]==' ')
			return 2;
		else if(gameBoard[4]==' ')
			return 4;
		else if(gameBoard[6]==' ')
			return 6;
		else if(gameBoard[8]==' ')
			return 8;
		else
			return 0;
	}

	private int checkCenterAvailability() {
		if(gameBoard[5]==' ')
			return 5;
		else
			return 0;
	}

	public String checkWinner()
	{
		for (int index = 1; index < 9; index++) {
			String line = null;

			switch (index) {
			case 1:
				line = Character.toString(gameBoard[1]) + Character.toString(gameBoard[2]) + Character.toString(gameBoard[3]);
				break;
			case 2:
				line = Character.toString(gameBoard[4]) + Character.toString(gameBoard[5]) + Character.toString(gameBoard[6]);
				break;
			case 3:
				line = Character.toString(gameBoard[7]) + Character.toString(gameBoard[8]) + Character.toString(gameBoard[9]);
				break;
			case 4:
				line = Character.toString(gameBoard[1]) + Character.toString(gameBoard[4]) + Character.toString(gameBoard[7]);
				break;
			case 5:
				line = Character.toString(gameBoard[2]) + Character.toString(gameBoard[5]) + Character.toString(gameBoard[8]);
				break;
			case 6:
				line = Character.toString(gameBoard[3]) + Character.toString(gameBoard[6]) + Character.toString(gameBoard[9]);
				break;
			case 7:
				line = Character.toString(gameBoard[1]) + Character.toString(gameBoard[5]) + Character.toString(gameBoard[9]);
				break;
			case 8:
				line = Character.toString(gameBoard[3]) + Character.toString(gameBoard[5]) + Character.toString(gameBoard[7]);
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			}

			// For O winner
			else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 1; a < 10; a++) {
			if (gameBoard[a]==' ') {
				return "change turn";
			}
		}
		return "draw";
	}
	private void playAgain() {
		System.out.println("Do you want to play another game?: ");
		String wantToPlay=scanner.next().toLowerCase();
		if(wantToPlay.equals("yes")) {
			main(null);

		}
		else
		{
			return;
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe game");
		TicTacToeGame gameObject=new TicTacToeGame();
		char[] board = gameObject.createBoard();
		char playerLetter = gameObject.letterToPlay();
		char computerLetter = playerLetter=='X'?'O':'X';
		gameObject.displayBoard();
		int currentPlayer = gameObject.decideFirstPlayer();
		System.out.println(currentPlayer);
		String continueToPlay = gameObject.checkWinner();
		while(continueToPlay=="change turn" && continueToPlay!="draw") {
			if(currentPlayer==0) {
				System.out.println("player's turn");
				gameObject.makeMove(playerLetter);
				currentPlayer=1;
			} 
			else if(currentPlayer==1) {
				System.out.println("computer's turn");
				int winPositionAvailability = gameObject.checkForWinningPositionAvailability(playerLetter);
				if(winPositionAvailability!=0) {
					gameBoard[winPositionAvailability]=computerLetter;
				}
				else {
					int opponentWinPosition = gameObject.checkIfOpponentCanWin(playerLetter);
					if(opponentWinPosition!=0) {
						gameBoard[opponentWinPosition]=computerLetter;
					}
					else {
						int cornerAvailability = gameObject.checkAvailableCorner();
						if(cornerAvailability!=0) {
							gameBoard[cornerAvailability]=computerLetter;
						}
						else {
							int centerAvailability = gameObject.checkCenterAvailability();
							if(centerAvailability!=0) {
								gameBoard[centerAvailability]=computerLetter;
							}
							else {
								int remainingPositions = gameObject.checkRemainingAvailableIndex();
								if(remainingPositions!=0) {
									gameBoard[remainingPositions]=computerLetter;
								}
							}
						}
					}
				
				}
				currentPlayer=0;
			}
			continueToPlay=gameObject.checkWinner();
			gameObject.displayBoard();
			System.out.println();
		}
		if(continueToPlay.equals("X")){
			if(playerLetter=='X')
				System.out.println("Player has won");
			else
				System.out.println("Computer has won");
		}
		else if(continueToPlay.equals("O")){
			if(playerLetter=='O')
				System.out.println("Player has won");
			else
				System.out.println("Computer has won");
		}
		else if(continueToPlay.equals("draw")) {
			System.out.println("It is a draw");
		}
	gameObject.playAgain();
	}
}
