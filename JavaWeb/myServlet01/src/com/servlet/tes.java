package com.servlet;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class tes {
  public static void main(String[] args) {
	  Calendar calendar = new GregorianCalendar();
		String am_pm;
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		if(calendar.get(Calendar.AM_PM) == 0){
			am_pm ="AM";
		}else{
			am_pm="PM";
		}
		
		
		System.out.println(calendar.get(Calendar.AM_PM));
}
}
