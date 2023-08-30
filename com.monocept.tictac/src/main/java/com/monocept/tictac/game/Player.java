package com.monocept.tictac.game;

public class Player {
	
	Choices choice;
	String name;
	
	public Player(int playerNumber,String name) {
		if(playerNumber==1) {
			choice=Choices.X;
		}
		if(playerNumber==2) {
			choice=Choices.O;
		}
		
		this.name=name;
	}

	public Choices getChoice() {
		return choice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
