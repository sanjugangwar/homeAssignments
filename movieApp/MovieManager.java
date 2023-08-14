package com.monocept.movieApp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
	
	List<Movie>movies;
	static final String path="/home/sanjay/Desktop/Temp/movieStore.txt";
	FileOutputStream fileOutputStream;
	ObjectOutputStream objectOutPutStream;
	ObjectInputStream objectInputStream;
	FileInputStream fileInputStream;
	
	public MovieManager() {
		movies=new ArrayList();
		try {
			
		     fileOutputStream=new FileOutputStream(path);
		     objectOutPutStream=new ObjectOutputStream(fileOutputStream);
		     loadMovies();
		}
		catch(Exception ex) {
			System.out.println("File Not Found , please check the file");
			System.out.println(ex);
		}
		
		
	}
	
	public List<Movie> loadMovies() {	
	List<Movie>movieList =null;
		
		try {
			 fileInputStream=new FileInputStream(path);
			 objectInputStream=new ObjectInputStream(fileInputStream);
			 movieList=(List<Movie>)objectInputStream.readObject();
			System.out.println(movieList);
		} catch (Exception e) {
			System.out.println("There are no previous added movies" +e);
		}
		
		return movieList;
		
	}
	
	public void addMovie(Movie movie) {
		movies.add(movie);
		System.out.println("Movie added Successfully "+movie);
	}
	
	public void clearMovies() {
		movies.clear();
		System.out.println("Movies has been cleared ");
	}
	
	public List<Movie> getMovies() {
		List<Movie>savedMovies=loadMovies();
		if(savedMovies!=null && savedMovies.size()>0)
		movies.addAll(savedMovies);
		return movies;
	}
	
	public void saveMovie() {
			
		 try {
			objectOutPutStream.writeObject(movies);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 clearMovies();
	}
	
	public void deleteAllMovies() {
		
		clearMovies();
		
		System.out.println("Current and previously added Movies has been deleted ");

	}

}
