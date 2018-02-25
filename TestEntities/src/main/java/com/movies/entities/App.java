package com.movies.entities;

import java.util.Arrays;

/**
 * Small main to showing the usage of the Entities.
 *
 */
public class App {
	public static void main(String[] args) {
		String[] genres = { "thriller", "terror" };
		Movie movie = new Movie("title", "false", "1982", Arrays.asList(genres));
		System.out.println(movie.toJson());
		movie = new Movie("title", "false", "1982", "comedy,documentary");
		System.out.println(movie.toJson());
	}
}
