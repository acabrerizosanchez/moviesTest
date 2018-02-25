package com.movies.main;

import java.util.Arrays;

import com.movies.entities.TestEntity;
import com.movies.entities.base.Movie;
import com.movies.entities.base.Rating;
import com.movies.entities.base.User;
import com.movies.entities.random.RandomRating;
import com.movies.entities.random.RandomUser;

/**
 * Small main to showing the usage of the Entities.
 *
 */
public class App {
	public static void main(String[] args) {
		String[] genres = { "thriller", "terror" };
		TestEntity movie = new Movie("title", "false", "1982", Arrays.asList(genres));
		System.out.println(movie.toJson());
		movie = new Movie("title", null, "1982", "comedy,documentary");
		System.out.println(movie.toJson());
		TestEntity user = new User("name", "surname", "1965-01-12");
		System.out.println(user.toJson());
		TestEntity rating = new Rating("1", "2", 4, "2018-01-07");
		System.out.println(rating.toJson());
		TestEntity randomRating = new RandomRating("random","rating");
		System.out.println(randomRating.toJson());
		TestEntity randomUser = new RandomUser();
		System.out.println(randomUser.toJson());
	}
}
