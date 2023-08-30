package com.monocept.tictac.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResultAnalyzerTest {

	Board board;
	ResultAnalyzer resultAnalyzer;
	public ResultAnalyzerTest() {
	}
	@BeforeEach
	void init() {
		board=new Board();
		board.filler();
		resultAnalyzer=new ResultAnalyzer(board.board);
	}
	@Test
	void testDiagonalWin() {
		board.markTheCell(Choices.X, 1);
		board.markTheCell(Choices.X, 5);
		board.markTheCell(Choices.X, 9);
		assertTrue(resultAnalyzer.diagonalWin(),"diagonal wise check");
	}

	@Test
	void testRowWin() {
		board.markTheCell(Choices.X, 1);
		board.markTheCell(Choices.X, 2);
		board.markTheCell(Choices.X, 3);
		assertTrue(resultAnalyzer.rowWin(),"row wise check");
	}

	@Test
	void testColWin() {
		board.markTheCell(Choices.X, 1);
		board.markTheCell(Choices.X, 4);
		board.markTheCell(Choices.X, 7);
		assertTrue(resultAnalyzer.colWin(),"column wise check");
	}

}
