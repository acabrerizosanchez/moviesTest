package com.movies.entities.base;

import com.google.gson.Gson;
import com.movies.entities.TestEntity;

public class User implements TestEntity {
	private String name;
	private String surname;
	private String birthDate;

	public User() {

	}

	/**
	 * 
	 * @param name
	 *            is the users' name
	 * @param surname
	 *            is the users' surname
	 * @param birthDate
	 *            is the date of birth (YYYY-MM-DD)
	 */
	public User(String name, String surname, String birthDate) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String toJson() {
		return new Gson().toJson(this);
	}

}
