package com.monocept.tictac.game;

public class ResultAnalyzer {
	
	Cell [][]board;
	
	public ResultAnalyzer(Cell[][] board) {
		this.board=board;
	}
	
	public boolean winCheck() {
		
		return diagonalWin() || rowWin() || colWin();
		
	}
	
	boolean diagonalWin() {
		
		if(board[0][0].getChoice()!=Choices.EMPTY && (board[0][0].getChoice()== board[1][1].getChoice() && board[1][1].getChoice()==board[2][2].getChoice())) {
			return true;
		}
		
		if(board[0][2].getChoice()!=Choices.EMPTY && (board[2][0].getChoice()== board[1][1].getChoice() && board[1][1].getChoice()==board[0][2].getChoice())) {
			return true;
		}
		
		return false;
		
	}
	
   boolean rowWin() {
		
		if(board[0][0].getChoice()!=Choices.EMPTY && (board[0][0].getChoice()== board[0][1].getChoice() && board[0][1].getChoice()==board[0][2].getChoice())) {
			return true;
		}
		
		if(board[1][0].getChoice()!=Choices.EMPTY && (board[1][0].getChoice()== board[1][1].getChoice() && board[1][1].getChoice()==board[1][2].getChoice())) {
			return true;
		}
		
		if(board[2][0].getChoice()!=Choices.EMPTY && (board[2][0].getChoice()== board[2][1].getChoice() && board[2][1].getChoice()==board[2][2].getChoice())) {
			return true;
		}
		
		return false;
		
	}
   
   boolean colWin() {
		
		if(board[0][0].getChoice()!=Choices.EMPTY && (board[0][0].getChoice()== board[1][0].getChoice() && board[1][0].getChoice()==board[2][0].getChoice())) {
			return true;
		}
		
		if(board[0][1].getChoice()!=Choices.EMPTY && (board[0][1].getChoice()== board[1][1].getChoice() && board[1][1].getChoice()==board[2][1].getChoice())) {
			return true;
		}
		
		if(board[0][2].getChoice()!=Choices.EMPTY && (board[0][2].getChoice()== board[1][2].getChoice() && board[1][2].getChoice()==board[2][2].getChoice())) {
			return true;
		}
		
		return false;
		
	}

}
