package com.booking.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.booking.model.Discount;
import com.booking.service.BookingService;
import com.booking.service.BookingServiceFeignClient;

@RestController
public class BookingServiceController {
	
	@Autowired
	private BookingServiceFeignClient feignClient;
	
	@Autowired
	private BookingService bookingService;

	@RequestMapping(value="/discountService/{movie}/{time}", method = RequestMethod.GET)
	public String getDiscounts(@PathVariable String movie, @PathVariable String time) {
		String message = "";
		Discount discounts = feignClient.getDiscounts();
		
		if(discounts != null)
		{
			message = "Discount value is :"+discounts.getDiscountPrice();
		}
		
		return message;	
		
	}
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public ArrayList<Integer> searchAvailableSeats(){
		return bookingService.getAllAvailableSeats("ABC", "1:30", "Delhi");
		
	}
}
