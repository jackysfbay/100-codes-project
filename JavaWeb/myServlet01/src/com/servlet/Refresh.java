package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HttpServletResponse interface provides a method setIntHeader() to set an
 * integer value to the response header. This method sets the integer value with
 * their corresponding name of header. This method overwrites the new value if
 * the value of the specified header has already set.
 * 
 * Syntax :
 * 
 * void setIntHeader(java.lang.String name, int value) First argument of this
 * method specifies the name of header and the second one specifies its
 * corresponding value.
 * 
 * Example :
 * 
 * In the example given below is illustrating the use of setIntHeader() method
 * as well as it also explains how to refresh a JSP page after a specified time.
 * In this example I have created a JSP page where used the setIntHeader()
 * method to set the value of the specified header. In the header name I have
 * used "Refresh" this is a predefined response header name which is a
 * proprietary non-standard header extension, instruct the browser to
 * update/refresh the page in seconds. To focus on refreshing that occurs in a
 * specified time I have used the Date class to display the date. In this
 * example on a web page date will be displayed in this format
 * "dd.MM.yyyy.HH.mm.ss" i.e. (day.month.year.hour.minute.second).
 */
@WebServlet("/Refresh")
public class Refresh extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Refresh() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setIntHeader("Refresh", 1);
		response.setContentType("text/html");

		Calendar calendar = new GregorianCalendar();
		String am_pm;
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		if (calendar.get(Calendar.AM_PM) == 0) {
			am_pm = "AM";
		} else {
			am_pm = "PM";

		}
		String CT = hour + ":" + minute + ":" + second + " " + am_pm;

		PrintWriter out = response.getWriter();

		String title = "Auto refresh by using Servlet";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		out.println(
				docType + "<html>\n" + "<head><title>" + title + "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
						+ "<h1 align=\"center\">" + title + "</h1>\n" + "<p>Current time is: " + CT + "</p>\n");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
