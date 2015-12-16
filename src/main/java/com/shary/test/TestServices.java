package com.shary.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class TestServices 
{

	  public static void main(String[] args) 
	  {
		    DefaultHttpClient httpclient = new DefaultHttpClient();
		    try 
		    {
//		      HttpHost target = new HttpHost("localhost", 8080, "http");
//		      HttpGet getRequest = new HttpGet("/sharyws/weather/80020");
//		      System.out.println("executing request to " + target);
//		      HttpResponse httpResponse = httpclient.execute(target, getRequest);
//		      System.out.println("---1------------------------------------");
//		      System.out.println(httpResponse.getStatusLine());
//		      Header[] headers = httpResponse.getAllHeaders();
//		      for (int i = 0; i < headers.length; i++) {
//		        System.out.println(headers[i]);
//		      }
//		      System.out.println("---2-------------------------------------");

		      HttpClient client = new DefaultHttpClient();
		      HttpGet request = new HttpGet("http://localhost:8080/sharyws/weather/55445");
		      HttpResponse response = client.execute(request);
		      BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
		      String line = "";
		      while ((line = rd.readLine()) != null)
              System.out.println("XXX" + line);

		      System.out.println("---3-------------------------------------");

		    } 
		    catch (Exception e) 
		    {
		      e.printStackTrace();
		    } 
		}
}
