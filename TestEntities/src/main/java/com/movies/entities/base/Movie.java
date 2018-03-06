package com.movies.entities.base;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.movies.entities.TestEntity;

public class Movie implements TestEntity {
	private String title;
	private String isAdult;
	// Release date with format YYYY.
	private String date;
	private List<String> genres;
	private transient String splitby = ",";

	/**
	 * 
	 * @param title
	 *            is the string containing the title of the movie.
	 * @param isAdult
	 *            is a string (true or false) indicating whether the movie is for
	 *            adutls.
	 * @param date
	 *            is a string containing the movie release date (YYYY).
	 * @param genres
	 *            is a string containing all the genres separated by comma.
	 */
	public Movie(String title, String isAdult, String date, String genres) {
		super();
		this.title = title;
		this.isAdult = isAdult;
		this.date = date;
		this.genres = Arrays.asList(genres.split(splitby));
	}

	public Movie(String title, String isAdult, String date, List<String> genres) {
		super();
		this.title = title;
		this.isAdult = isAdult;
		this.date = date;
		this.genres = genres;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsAdult() {
		return isAdult;
	}

	public void setIsAdult(String isAdult) {
		this.isAdult = isAdult;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public String toJson() {
		return new Gson().toJson(this);
	}

}
