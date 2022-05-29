package com.discount.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.discount.model.Discounts;

@RestController
@RequestMapping("/discountService")
public class DiscountController {

	@RequestMapping(value="/discounts", method = RequestMethod.POST)
	public Discounts getDiscounts(@RequestParam String movie, @RequestParam String time) {
		if(time.equals("3:30") && movie.equals("ABC"))
			return new Discounts("3:30", "ABC", new BigDecimal(100));
		return null;
		
	} 
}
