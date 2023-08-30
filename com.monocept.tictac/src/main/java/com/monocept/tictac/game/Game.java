package com.monocept.tictac.game;

import java.util.Scanner;

public class Game {
	
	Board grid=new Board();
	Player []players=new Player[2];
	Moves moves=new Moves();
	Scanner scanner=new Scanner(System.in);
	ResultAnalyzer result=new ResultAnalyzer(grid.board);
	int playerNumber=0;
	Player currentPlayer;
	
	public void takePlayer() {
		for(int i=1;i<=2;i++) {
			String name;
			System.out.println("Enter the name of player "+i);
			name=scanner.next();
			players[i-1]=new Player(i,name);
		}
	}
	
	public void setPlayer() {
		if(currentPlayer==null) {
			currentPlayer=players[0];
		}
		else if(playerNumber==0) {
			currentPlayer=players[1];
			playerNumber=1;
		}
		else {
			currentPlayer=players[0];
			playerNumber=0;
		}
	}
	
	public boolean playAgain() {
		
		System.out.println("Do you want to play Again?(yes/no)");
		String choice=scanner.next();
		if(choice.contentEquals("yes")) {
			grid.filler();
			moves.filler();
			return true;
		}
		
		return false;
	}
	
	public void play() {
		grid.filler();
		takePlayer();
		moves.filler();
		int moveNumber;
		while(true) {
			
			grid.display();
			boolean win=result.winCheck();
			if(win) {
				System.out.println(currentPlayer.getName()+" has won the game ");
				if(!playAgain()) {
					return ;
				}
			}
			
			this.setPlayer();
			System.out.println(currentPlayer.getName()+" 's Turn");
			moves.displayMoves();
			moveNumber=scanner.nextInt();
			try {
				
			  if(moves.isValidMove(moveNumber)) {
				  grid.markTheCell(currentPlayer.getChoice(), moveNumber);
				  moves.takeMove(moveNumber);
			  }
			  
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			
			
			
		}
	}

}
