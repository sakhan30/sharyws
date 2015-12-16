package com.shary.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.shary.controller.WeatherController;
import com.shary.vo.WeatherVO;

@Service
public class WeatherDAO 
{
	private static final Logger LOGGER = Logger.getLogger(WeatherController.class.getName()); 

	public Map<String,Object> getWeatherByZipCode(String zip)
	{
		Map<String,Object> map = new HashMap<String,Object>();		
		LOGGER.info("Came in WeatherDAO by Zip  " + zip);
		WeatherVO m = new WeatherVO();
		m.setTemperature("5C");
		m.setHumidity("70%");
		m.setWind("5 MPH");
		LOGGER.info("finished in WeatherDAO by zip service");
		map.put("output", m); 
		return map;
	}
}
