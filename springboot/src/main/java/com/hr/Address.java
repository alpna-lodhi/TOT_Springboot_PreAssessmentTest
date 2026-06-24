package com.hr;

import org.springframework.stereotype.Component;

@Component        
public class Address {
	String HomeNumber="5387";
	String Street="New Friends Colony";
	String City="New Delhi";
	String Country="India";
	
	public String getHomeNumber() {
		return HomeNumber;
	}
	public String getStreet() {
		return Street;
	}
	public String getCity() {
		return City;
	}
	public String getCountry() {
		return Country;
	}
}
