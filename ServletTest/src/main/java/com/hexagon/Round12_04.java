package com.hexagon;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round12_04 extends HttpServlet {
	
	public void init() { }
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String local_addr = req.getLocalAddr();
		String local_name = req.getLocalName();
		int local_port = req.getLocalPort();
		
		System.out.println();
		System.out.println("local_addr = " + local_addr);
		System.out.println("local_name = " + local_name);
		System.out.println("local_port = " + local_port);
		System.out.println();
		
		String remote_addr = req.getRemoteAddr();
		String remote_host = req.getRemoteHost();
		int remote_port = req.getRemotePort();
		
		System.out.println("remote_addr = " + remote_addr);
		System.out.println("remote_host = " + remote_host);
		System.out.println("remote_port = " + remote_port);
		System.out.println();
		
		int content_length = req.getContentLength();
		String content_type = req.getContentType();
		
		System.out.println("content_length = " + content_length);
		System.out.println("content_type = " + content_type);
		System.out.println();
		
		Locale locale = req.getLocale();
		Enumeration locales = req.getLocales();
		
		System.out.println("locale = " + locale);
		while(locales.hasMoreElements()) {
			System.out.println("locales = " + (Locale)locales.nextElement());
		}
		System.out.println();
		
		String protocol = req.getProtocol();
		String scheme = req.getScheme();
		String server_name = req.getServerName();
		int server_port = req.getServerPort();
		boolean secure = req.isSecure();
		
		System.out.println("protocol = " + protocol);
		System.out.println("scheme = " + scheme);
		System.out.println("server_name" + server_name);
		System.out.println("server_port" + server_port);
		System.out.println("is_secure = " + secure);
		System.out.println();
	}
	
	public void destroy() { }
}
