package com.shary.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shary.service.WeatherService;
import com.shary.vo.WeatherVO;

@Controller
public class WeatherController 
{
	@Autowired
	public WeatherService service;
	private static final Logger LOGGER = Logger.getLogger(WeatherController.class.getName()); 

	@RequestMapping(value="/weather/{zip}", produces = {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}, method = RequestMethod.GET)
	public @ResponseBody Map<String,Object> getWeather(@PathVariable String zip)
	{
		LOGGER.info("Came in WeatherController1 by Zip  " + zip);
		Map<String,Object> map = service.getWeatherByZipCode(zip);		
		LOGGER.info("finished in WeatherConroller by zip service");
		return map;
	}
	
	@RequestMapping(value = "/weather/{miles}",	produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON, method = RequestMethod.POST) 
 	public @ResponseBody Map<String,Object> postTest(@RequestBody String miles)  
 	{ 
		Map<String,Object> map = new HashMap<String,Object>();		
		LOGGER.info("Came in controller1 with " + miles);
		WeatherVO m = new WeatherVO();
		LOGGER.info("Came in controller1 after calculating mortgage " + miles);
		map.put("result", m); 
		return map; 	
	} 
}