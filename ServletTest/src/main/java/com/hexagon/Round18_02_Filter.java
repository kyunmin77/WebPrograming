package com.hexagon;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class Round18_02_Filter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException { }

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		String id = req.getParameter("ID");
		if(id==null || id.trim().length() == 0) {
			HttpServletResponse h_response = (HttpServletResponse)res;
			h_response.sendRedirect("Round18_02_Error.html");
		}
		chain.doFilter(req, res);
	}
	
	public void destroy() {}

}
