package com.monocept.tictac.game;

import java.util.*;

public class Moves {
	
	List<Integer>moveList;
	
	public Moves() {
		moveList=new ArrayList();
	}
	
	public void filler() {
		moveList.clear();
		for(int i=1;i<=9;i++) {
			moveList.add(i);
		}
	}
	
	public void displayMoves() {
		System.out.println("Please enter from the available moves ");
		for(Integer move:moveList) {
			System.out.print(move+" ");
		}
		System.out.println();
	}
	
	public boolean isValidMove(Integer moveNumber) {
		if(!moveList.contains(moveNumber)) {
			throw new InValidException();
		}
		return true;
	}
	
	public void takeMove(Integer moveNumber) {
		moveList.remove(moveNumber);
	}

}
