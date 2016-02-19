package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class UserNameFilter
 */
@WebFilter("/hello.jsp")
public class UserNameFilter implements Filter {

	FilterConfig fConfig;

	public UserNameFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String username = request.getParameter("username");
		String initUser = fConfig.getInitParameter("username");
		if (!initUser.equals(username)) {
			System.out.println("User Name is invalid!");
			request.setAttribute("msg1", "User Name is invalid!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		System.out.println("User Name is valid!");
		chain.doFilter(request, response);

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {

		this.fConfig = fConfig;
	}

}
