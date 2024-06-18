package util;

import java.io.IOException;
import java.util.Map;
import java.net.URLEncoder;
import java.net.URLDecoder;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class Cookies {
	private Map<String, Cookie> cookieMap = new java.util.HashMap<String, Cookie>(); 
	// <해시 키, 해시 값>
	
	public Cookies(HttpServletRequest req) {
		Cookie[] cks = req.getCookies();
		if(cks != null) {
			for(int i=0;i<cks.length;i++) {
				cookieMap.put(cks[i].getName(), cks[i]);
			}
		}
	}
	
	public Cookie getCookies(String name) {
		return cookieMap.get(name);
	}
	public String getValue(String name) throws IOException {
		Cookie ck = cookieMap.get(name);
		if(ck == null)
			return null;
		return URLDecoder.decode(ck.getValue(),"utf-8");
	}
	
	public boolean exists(String name) {
		return cookieMap.get(name) != null;
	}
	
	public static Cookie createCookie(String name, String value) throws IOException{
		return new Cookie(name, URLEncoder.encode(value,"utf-8"));
	}
	
	public static Cookie createCookie(String name, String value, String path, int maxAge) throws IOException{
		Cookie ck = new Cookie(name, URLEncoder.encode(value,"utf-8"));
		ck.setPath(path);
		ck.setMaxAge(maxAge);
		return ck;
	}
	
	public static Cookie createCookie(String name, String value, String domain, String path, int maxAge) throws IOException{
		Cookie ck = new Cookie(name, URLEncoder.encode(value,"utf-8"));
		ck.setDomain(domain);
		ck.setPath(path);
		ck.setMaxAge(maxAge);
		return ck;	
	}
}
