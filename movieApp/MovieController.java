package com.monocept.movieApp;

import java.util.List;
import java.util.Scanner;

public class MovieController {
	
	private static MovieManager movieManager;
	static Scanner scanner;
	static int movieId;
	
	public MovieController(MovieManager movieManager) {
		this.movieManager=movieManager;
		scanner=new Scanner(System.in);
	}
	
	
	void start() {
		
		displayMenu();
		
	}
	
	static void displayMenu() {
		
		int choice;
		do {
		System.out.println("Press 1 to add a movie ");
		System.out.println("Press 2 to show the movies ");
		System.out.println("Press 3 to delete  movies ");
		System.out.println("Press 4 to save in database ");
		System.out.println("press 5 for exit");
		
		choice = scanner.nextInt();
		
		switch(choice) {
		
		case 1:
			addMovie();
			break;
		case 2:
			showMovies();
			break;
		case 3: 
			deleteMovies();
			break;
		case 4:
			saveMovies();
			break;
		
		}
		}
		while(choice !=5);	
		
	}
	
	private static void saveMovies() {
		movieManager.saveMovie();
		
	}


	private static void deleteMovies() {
		
		movieManager.deleteAllMovies();
		
	}


	private static void showMovies() {
		
		List<Movie>movies=movieManager.getMovies();
		System.out.println("======================Showing All The Movies ============================");
		for(Movie movie:movies) {
			System.out.println(movie);
		}
		
	}


	private static void addMovie() {
		System.out.println("Enter name , year and genre of movie");
		String name=scanner.next();
		int year=scanner.nextInt();
		String genre=scanner.next();
		Movie movie =new Movie(++movieId,name,year,genre);
		movieManager.addMovie(movie);
		
	}
		
	}
	

