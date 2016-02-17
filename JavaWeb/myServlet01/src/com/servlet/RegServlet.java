package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Users;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		Users users = new Users();

		String username;
		String email;
		String textarea;

		try {
			username = request.getParameter("firstName") + " " + request.getParameter("lastName");
			email = request.getParameter("email");
			textarea = request.getParameter("textarea");

			users.setUsername(username);
			users.setEmail(email);
			users.setTextarea(textarea);
			
			System.out.println(users.getEmail());
			
			
			// save users object into session
			request.getSession().setAttribute("regUser", users);
			
			request.getRequestDispatcher("/RregistrationForms/Userinfo.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
