package com.monocept.movieApp;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieManager movieManager=new MovieManager();
		MovieController movieController=new MovieController(movieManager);
		movieController.start();

	}

}
