package com.movies.entities.base;

import com.google.gson.Gson;
import com.movies.entities.TestEntity;

public class Rating implements TestEntity {
	private String userId;
	private String movieId;
	private int score;
	private String date;

	public Rating() {

	}

	/**
	 * 
	 * @param userId
	 *            is the user id that is making the score.
	 * @param movieId
	 *            is the movie id that is being rated.
	 * @param score
	 *            the rating score.
	 * @param date
	 *            when the rating was performed.
	 */
	public Rating(String userId, String movieId, int score, String date) {
		super();
		this.userId = userId;
		this.movieId = movieId;
		this.score = score;
		this.date = date;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String toJson() {
		return new Gson().toJson(this);
	}

}
