package com.monocept.tictac.game;

public class Cell {
	
	Choices choice;
	
	public Cell() {
		choice=Choices.EMPTY;
	}

	public Choices getChoice() {
		return choice;
	}

	public void setChoice(Choices choice) {
		this.choice = choice;
	}
	
	

}
