package day12.network;

import java.net.MalformedURLException;
import java.net.URL;

public class MainClass02 {
	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=s");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		String query = url.getQuery();
		
		System.out.println("protocol : " + protocol);
		System.out.println("host : " + host);
		System.out.println("query : " + query);
		
		
	}

}
