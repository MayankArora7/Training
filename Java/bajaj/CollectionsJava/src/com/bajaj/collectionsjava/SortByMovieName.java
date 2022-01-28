package com.bajaj.collectionsjava;

import java.util.Comparator;

public class SortByMovieName implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		return m1.getName().compareToIgnoreCase(m2.getName());
	}
	
}
