package com.movies.entities.random;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.github.javafaker.Faker;
import com.github.javafaker.Number;
import com.movies.entities.TestEntity;
import com.movies.entities.base.Rating;

public class RandomRating implements TestEntity {
	private Rating rating;

	public RandomRating(String userId, String movieId) {
		Faker faker = new Faker();
		Number number = faker.number();
		Date date = faker.date().birthday(0, 1);
		rating = new Rating();
		rating.setUserId(userId);
		rating.setMovieId(movieId);
		rating.setScore(number.numberBetween(1, 5));
		rating.setDate(formatDate(date));
	}

	/**
	 * 
	 * @param date
	 * @return a String containing the date with the format: YYYY-MM-DD
	 */
	private String formatDate(Date date) {
		String separator = "-";
		DateFormat formatter = new SimpleDateFormat("YYYY-MM-dd");
		return formatter.format(date);
	}

	public String toJson() {
		return this.rating.toJson();
	}

}
