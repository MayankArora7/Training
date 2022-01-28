package com.bajaj.java1dot8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

class WebSeries implements Comparable<WebSeries> {
	private String name;
	private float imdb;
	private int noOfSeasons;
	private int seasonOneYear;
	private String streamingService;
	private String genre;
	
	public WebSeries(String name, float imdb, int noOfSeasons, int seasonOneYear, String streamingService, String genre) {
		super();
		this.name = name;
		this.imdb = imdb;
		this.noOfSeasons = noOfSeasons;
		this.seasonOneYear = seasonOneYear;
		this.streamingService = streamingService;
		this.genre = genre;
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

	public int getNoOfSeasons() {
		return noOfSeasons;
	}

	public void setNoOfSeasons(int noOfSeasons) {
		this.noOfSeasons = noOfSeasons;
	}

	public int getSeasonOneYear() {
		return seasonOneYear;
	}

	public void setSeasonOneYear(int seasonOneYear) {
		this.seasonOneYear = seasonOneYear;
	}

	public String getStreamingService() {
		return streamingService;
	}

	public void setStreamingService(String streamingService) {
		this.streamingService = streamingService;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "WebSeries [name=" + name + ", imdb=" + imdb + ", noOfSeasons=" + noOfSeasons 
				+ ", seasonOneYear=" + seasonOneYear + ", streamingService=" 
				+ streamingService + ", genre=" + genre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(streamingService);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		WebSeries other = (WebSeries) obj;
		if(!streamingService.equalsIgnoreCase(other.streamingService)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(WebSeries o) {
		if(this.getSeasonOneYear() > o.getSeasonOneYear()) {
			return 1;
		}
		else if(this.getSeasonOneYear() < o.getSeasonOneYear()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

public class StreamPractice {
	
	public static void main(String[] args) {
		List<WebSeries> series = new ArrayList<WebSeries>();
		
		series.add(new WebSeries("Breaking Bad", 9.4f, 5, 2008, "Netflix", "Drama"));
		series.add(new WebSeries("Sacred Games", 8.7f, 2, 2018, "Netflix", "Thriller"));
		series.add(new WebSeries("The Family Man", 8.8f, 2, 2019, "Amazon Prime Video", "Dark Comedy"));
		series.add(new WebSeries("Special Ops", 8.6f, 1, 2020, "Disney+ Hostar", "Thriller"));
		series.add(new WebSeries("Scam 1992", 9.5f, 1, 2020, "Sony Liv", "Biography"));
		
//		Count
		Long count = series.stream()
		.filter(webSeries -> webSeries.getGenre().equalsIgnoreCase("thriller"))
		.count();
		
		System.out.println("Number of web series in 'Thriller' genre: " + count);
		
//		Min
		Optional<WebSeries> ls = series.stream()
		.min((i, j) -> i.getImdb() > j.getImdb()? 1: -1);
		
		System.out.println("\nWeb series with minimum IMDB rating: " + ls.get());
		
//		Max
		Optional<WebSeries> ls1 = series.stream()
		.max((i, j) -> i.getImdb() > j.getImdb()? 1: -1);
				
		System.out.println("\nWeb series with maximum IMDB rating: " + ls1.get());
		
//		Filter
		List<WebSeries> ls2 = series.stream()
		.filter(webSeries -> webSeries.getName().equalsIgnoreCase("The Family Man"))
		.collect(Collectors.toList());
		 
		 System.out.print("\nDetails of the web series named 'The Family Man': ");
		 ls2.forEach(s -> System.out.println(s));
		 
		 
//		Filter and Map
		List<String> ls3 = series.stream()
		.filter(webSeries -> webSeries.getStreamingService().equalsIgnoreCase("Sony Liv")) 
		.map(ws -> ws.getName()) 
		.collect(Collectors.toList());
		
		System.out.print("\nWeb series available on Sony Liv: ");
		ls3.forEach(s -> System.out.println(s));
		 
		
//		Filter and Map
		List<String> ls4 = series.stream() 
		.filter(webSeries -> webSeries.getSeasonOneYear() == 2020) 
		.map(ws -> ws.getName())
		.collect(Collectors.toList());
		
		System.out.print("\nWeb series released in 2020: ");
		ls4.forEach(s -> System.out.println(s));
		 
//		Map	
		List<String> ls5 = series.stream() 
		.map(webSeries -> webSeries.getName().toUpperCase())
		.collect(Collectors.toList());
		
		System.out.print("\nList of all web series: ");
		ls5.forEach(s -> System.out.println(s));
		
//		Distinct
		List<WebSeries> ls6 = series.stream()
		.filter(webSeries -> webSeries.getStreamingService().toLowerCase().contains("li"))
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println("\nWeb series with distinct streaming services: ");
		ls6.forEach(s -> System.out.println(s));
		
//		Sort ascending
		List<WebSeries> ls7 = series.stream()
//		.sorted(Comparator.comparingInt(ws -> ((WebSeries) ws).getSeasonOneYear()))
		.sorted()
		.collect(Collectors.toList());
		
		System.out.println("\nWeb series with release year of season one in ascending order:- ");
		ls7.forEach(s -> System.out.println(s));
		
//		Sort descending
		List<WebSeries> ls8 = series.stream()
//		.sorted(Comparator.comparingInt(ws -> ((WebSeries) ws).getSeasonOneYear()).reversed())
		.sorted(new Comparator<WebSeries>() {

			@Override
			public int compare(WebSeries o1, WebSeries o2) {
				if(o1.getSeasonOneYear() > o2.getSeasonOneYear()) {
					return -1;
				}
				else if(o1.getSeasonOneYear() < o2.getSeasonOneYear()) {
					return 1;
				}
				else {
					return 0;
				}
			}
		})
		.collect(Collectors.toList());

		System.out.println("\nWeb series with release year of season one in descending order:- ");
		ls8.forEach(s -> System.out.println(s));
		
//		Reduce
		System.out.println("\nSum: " + series.stream()
				.map(webSeries -> webSeries.getSeasonOneYear())
				.reduce(0, (a, b) -> a + b));
	}
}
