package com.bajaj.java1dot8features;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStreamAPI {
	public static void main(String[] args) {
//		Empty stream created
		Stream<String> stream = Stream.empty();
		
		Collection<Integer> collection = Arrays.asList(1000, 200, 5000);
		collection.forEach(str -> System.out.println(str));
		
//		Converting collection to stream.
		Stream<Integer> streamOfCollection = collection.stream();
		
//		Filter
		/*streamOfCollection
		.filter(s -> s == 200)
		.forEach(str -> System.out.println(str));*/
		
//		Count
		/*Long count = streamOfCollection
		.filter(s -> s == 200)
		.count();
		
		System.out.println(count);*/
		
//		collect converts stream to list so that we can print it
//		filter returns stream and collect converts it to Collection
		/*Collection<Integer> collections = streamOfCollection
		.filter(s -> s == 200)
		.collect(Collectors.toList());
		
		collections.forEach(str -> System.out.println(str));*/
		
		Stream<Integer> streamofCollection=collection.stream();
		
//		max
		/*Optional<Integer> s=streamofCollection.max((i,j)->i.compareTo(j));
		System.out.println(s.get());*/
		
//		distinct
		Collection<Integer> collections = streamofCollection
		.distinct()
		.filter(value->value==200)
		.collect(Collectors.toList());
		
		collections.forEach(s->System.out.println(s));
	}
}
