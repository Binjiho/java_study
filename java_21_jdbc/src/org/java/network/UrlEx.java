package org.java.network;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlEx {
	public static void main(String[] args) {
		String openApiUrl = "http://192.168.23.211:8090/shopping_mysql_0614";
		
		URL url = null;
		
		try {
			url = new URL(openApiUrl);
			System.out.println(url.getProtocol());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			System.out.println(url.getAuthority());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
