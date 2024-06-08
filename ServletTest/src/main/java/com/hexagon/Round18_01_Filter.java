package com.hexagon;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class Round18_01_Filter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException { }

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest h_request = (HttpServletRequest)req;
		String method = h_request.getMethod();
		if(method.equalsIgnoreCase("post")) {
			req.setCharacterEncoding("utf-8");
		}
		chain.doFilter(req, res);
	}
	
	public void destroy() {}

}
