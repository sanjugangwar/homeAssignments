package com.monocept.tictac.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest{
	
	Board board;
	public BoardTest() {
		board=new Board();
	}

	@Test
	void testMarkTheCell() {
		
		board.filler();
		board.markTheCell(Choices.O, 1);
		assertThrows(AlreadymarkedException.class,()->board.markTheCell(Choices.O, 1));
		
	}

}
