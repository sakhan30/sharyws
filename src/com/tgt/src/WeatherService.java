package com.tgt.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class WeatherService 
{

	public String getWeather()
	{
		try
		{
			System.out.println("Reached Get Weather");

			String url = "http://www.geoplugin.net/json.gp";
		    HttpClient client = new DefaultHttpClient();
		    HttpPost post = new HttpPost(url);
			post.addHeader("ip", "192.172.1.0");
			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
			urlParameters.add(new BasicNameValuePair("ip", "192.100.0.4"));
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
