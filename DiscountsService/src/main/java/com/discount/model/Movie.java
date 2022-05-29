package com.discount.model;

public class Movie {

	private String movieName;
	
	private String movieTime;

	public Movie(String movieName, String movieTime) {
		this.movieName = movieName;
		this.movieTime = movieTime;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieTime() {
		return movieTime;
	}

	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}
}
