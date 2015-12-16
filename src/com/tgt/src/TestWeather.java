package com.tgt.src;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWeather {

	@Test
	public void test() 
	{
		WeatherService ws = new WeatherService();
		assertNotNull(ws.getWeather());
		fail("Not yet implemented");
	}

}
