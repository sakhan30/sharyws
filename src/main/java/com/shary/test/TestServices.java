package com.shary.test;

import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class TestServices 
{

	  public static void main(String[] args) 
	  {
		    DefaultHttpClient httpclient = new DefaultHttpClient();
		    try 
		    {
		      HttpHost target = new HttpHost("localhost", 8080, "http");
		      HttpGet getRequest = new HttpGet("/sharyapps/convert/80020");
		      System.out.println("executing request to " + target);
		      HttpResponse httpResponse = httpclient.execute(target, getRequest);
		      System.out.println("----------------------------------------");
		      System.out.println(httpResponse.getStatusLine());
		      Header[] headers = httpResponse.getAllHeaders();
		      for (int i = 0; i < headers.length; i++) {
		        System.out.println(headers[i]);
		      }
		      System.out.println("----------------------------------------");
		    } 
		    catch (Exception e) 
		    {
		      e.printStackTrace();
		    } 
		    finally 
		    {
		      // When HttpClient instance is no longer needed,
		      // shut down the connection manager to ensure
		      // immediate deallocation of all system resources
		      httpclient.getConnectionManager().shutdown();
		    }
		  }
}
