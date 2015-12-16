package com.tgt.src;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeatherService 
{

	public String getWeather()
	{
		try
		{
			System.out.println("Reached Get Weather");

			String url = "http://localhost:8080/sharyws/weather/1";
		    HttpClient client = new DefaultHttpClient();
		    HttpPost post = new HttpPost(url);
			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
			post.setEntity(new UrlEncodedFormEntity(urlParameters));
         
			HttpResponse response = client.execute(post);
			
			
			System.out.println("\nSending 'POST' request to URL : " + url);
			System.out.println("Post parameters : " + post.containsHeader("ip"));
			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

			BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
			String line = "";
			while ((line = rd.readLine()) != null) 
			{
			    System.out.println(line);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
		
}
