package com.movies.entities.random;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.github.javafaker.Faker;
import com.movies.entities.TestEntity;
import com.movies.entities.base.User;

public class RandomUser implements TestEntity {
	private User user;

	public RandomUser() {
		Faker faker = new Faker();
		user = new User();
		user.setBirthDate(formatDate(faker.date().birthday()));
		user.setName(faker.name().firstName());
		user.setSurname(faker.name().lastName());
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
		return user.toJson();
	}

}
