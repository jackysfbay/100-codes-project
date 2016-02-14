package com.javabean;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CalDate {
	private String date1;
	private String date2;

	public String result() throws ParseException {
		String newStrDay = "";
		long t2 = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		if (getDate1() != null && getDate2() != null) {
			Date d1 = sdf.parse(date1);
			Date d2 = sdf.parse(date2);
			long time1 = d1.getTime();
			long time2 = d2.getTime();

			if (time1 >= time2) {
				t2 = time1 - time2;

				long x = t2 / (1000 * 60 * 60 * 24);
				newStrDay = x + "";

			} else {
				newStrDay = "error";
			}
		}
		return newStrDay;
	}

	public String getDate1() {
		return date1;
	}

	public void setDate1(String date1) {
		this.date1 = date1;

	}

	public String getDate2() {
		return date2;
	}

	public void setDate2(String date2) {
		this.date2 = date2;
	}

	// public static void main(String[] args) throws ParseException {
	// CalDate calDate = new CalDate();
	//
	// System.out.println(calDate.result());
	// }

}
