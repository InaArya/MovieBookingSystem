package com.discount.model;

import java.math.BigDecimal;

public class Discounts {

	public String movieTime;
	
	public String movieName;
	
	public BigDecimal discountPrice;

	public Discounts(String movieTime, String movieName, BigDecimal discountPrice) {
		this.movieTime = movieTime;
		this.movieName = movieName;
		this.discountPrice = discountPrice;
	}


}
