package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/hello.jsp")
public class PasswordFilter implements Filter {
	FilterConfig fConfig;

	public PasswordFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String initPassword = fConfig.getServletContext().getInitParameter("password");
		String password = request.getParameter("password");
		if (!initPassword.equals(password)) {
			request.setAttribute("msg2", "Password is invalid!");
			request.getRequestDispatcher("/LoginFilter/login.jsp").forward(request, response);
			System.out.println("Password is invalid");
			return;
		}

		System.out.println("Password is valid");
		chain.doFilter(request, response);

	}

	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig = fConfig;
	}

}
