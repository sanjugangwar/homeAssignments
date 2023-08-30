package com.monocept.tictac.game;

public class Board {
	
	Cell [][]board=new Cell[3][3];
	
	public Board() {
	}
	
	public void filler() {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j]=new Cell();
			}
		}
		
	}
	
	public void display() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(board[i][j].getChoice()==Choices.EMPTY?"*  ":board[i][j].getChoice().toString()+"  ");
			}
			System.out.println("\n");
		}
	}
	
	public void markTheCell(Choices choice,int moveNumber){
		
		int count=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				count++;
				if(count==moveNumber) {
					if(board[i][j].getChoice()==Choices.X || board[i][j].getChoice()==Choices.O) {
						throw new AlreadymarkedException();
					}
					board[i][j].setChoice(choice);
				}
			}
		}
		
	}
	
}
