package com.booking.model;

import java.math.BigDecimal;

public class Discount {

	public String movieTime;
	
	public String movieName;
	
	public BigDecimal discountPrice;

	public Discount(String movieTime, String movieName, BigDecimal discountPrice) {
		this.movieTime = movieTime;
		this.movieName = movieName;
		this.discountPrice = discountPrice;
	}

	public String getMovieTime() {
		return movieTime;
	}

	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}


}
