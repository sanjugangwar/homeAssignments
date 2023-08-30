package com.monocept.tictac.game;

public class AlreadymarkedException extends RuntimeException{
	
	public AlreadymarkedException() {
		super("Cell is Already Marked");
	}
}
