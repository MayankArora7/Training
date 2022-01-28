package com.bajaj.collectionsjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie {//implements Comparable<Movie>{
	private String name;
	private float imdb;
	private int releaseYear;
	
	public Movie(String name, float imdb, int releaseYear) {
		super();
		this.name = name;
		this.imdb = imdb;
		this.releaseYear = releaseYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getImdb() {
		return imdb;
	}

	public void setImdb(float imdb) {
		this.imdb = imdb;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", imdb=" + imdb + ", releaseYear=" + releaseYear + "]";
	}

	/*@Override
	public int compareTo(Movie m2) {
		/*if(this.getReleaseYear() > m2.getReleaseYear()) {
			return 1;
		}
		else if(this.getReleaseYear() < m2.getReleaseYear()) {
			return -1;
		}
		else {
			return 0;
		}*/
		
		/*if(this.getImdb() > m2.getImdb()) {
			return 1;
		}
		else if(this.getImdb() < m2.getImdb()) {
			return -1;
		}
		else {
			return 0;
		}
		
		return this.getName().compareToIgnoreCase(m2.getName());
	}*/
}
public class ComparablePractice {
	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<Movie>();
		
		movies.add(new Movie("Avengers Endgame", 8.4f, 2019));
		movies.add(new Movie("The Dark Knight", 9.0f, 2005));
		movies.add(new Movie("Titanic", 8.5f, 1999));
		
//		Collections.sort(movies);
		
//		Collections.sort(movies, new SortByMovieName());
//		Collections.sort(movies, new SortByImdb());
		for(Movie m: movies) {
			System.out.println(m);
		}
	}
}
