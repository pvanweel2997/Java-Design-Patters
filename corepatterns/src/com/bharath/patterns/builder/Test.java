package com.bharath.patterns.builder;

import com.bharath.patterns.builder.HttpClient.HttpClientBuilder;
public class Test {

	public static void main(String[] args) {
//		HttpClient httpClient = new HttpClient("GET", "http://test.com", null, null, null, null);
		
			HttpClient client = new HttpClient.HttpClientBuilder()
					.method("GET")
					.url("http://test.com")
					.body("{}")
					.secure("username","password")
					.build();
				System.out.println(client.toString());
				
				HttpClientBuilder builder = new HttpClientBuilder();
				builder.method("GET")
						.url("http://test.com")
						.body("{}")
						.secure("username","password")
						.build();
				HttpClient client2 = builder.build();
				System.out.println(client2.toString());
	}

}
