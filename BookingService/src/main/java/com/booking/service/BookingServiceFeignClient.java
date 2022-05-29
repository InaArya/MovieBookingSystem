package com.booking.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.booking.model.Discount;

@FeignClient(name="DiscountService", url="http://localhost:8084/discountService")
public interface BookingServiceFeignClient {

	@RequestMapping(value="/discounts", method = RequestMethod.GET)
	public Discount getDiscounts();
	
}
