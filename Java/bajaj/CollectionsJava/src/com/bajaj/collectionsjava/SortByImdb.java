package com.bajaj.collectionsjava;

import java.util.Comparator;

public class SortByImdb implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		if(m1.getImdb() > m2.getImdb()) {
			return 1;
		}
		else if(m1.getImdb() < m2.getImdb()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
