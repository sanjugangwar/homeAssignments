package com.monocept.tictac.game;

public class InValidException extends RuntimeException{
	
	public InValidException() {
		super("Please enter a valid choice");
	}
	
}
