package com.shary.service;

import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shary.controller.WeatherController;
import com.shary.dao.WeatherDAO;

@Service
public class WeatherService 
{
    @Autowired
	WeatherDAO dao;
	private static final Logger LOGGER = Logger.getLogger(WeatherController.class.getName()); 

	public Map<String,Object> getWeatherByZipCode(String zip)
	{
		LOGGER.info("Came in WeatherService by Zip  " + zip);
		Map<String,Object> map = dao.getWeatherByZipCode(zip);		
		LOGGER.info("finished in WeatherService by zip service");
		return map;
	}
}
