package com.monocept.tictac.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MovesTest {
	
	Moves moves;
	
	public MovesTest() {
		moves=new Moves();
	}

	@Test
	void testIsValidMove() {
		
		moves.filler();
		moves.takeMove(1);
		
		assertThrows(InValidException.class,()->moves.isValidMove(1));
		
	}

}
