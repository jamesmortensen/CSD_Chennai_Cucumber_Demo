package main.java;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class RideValidator {
	
	GregorianCalendar calendar = new GregorianCalendar();
	int currentYear = 2015;
	int currentMonth = 8;
	int currentDay = 13;
	int currentHourOfDay = 14;
	int currentMinute = 35;
	
	long currentTimeInMillis = 0;
	
	
	public RideValidator(int year, int month, int day, int hourOfDay, 
			int minute) {
		
		calendar = new GregorianCalendar(currentYear, currentMonth, currentDay, 
				currentHourOfDay, currentMinute, 0);
		
		currentTimeInMillis = calendar.getTimeInMillis();
		
		calendar = new GregorianCalendar(year, month, day, hourOfDay, minute, 0);
	}

	public RideValidator(GregorianCalendar calendar) {
		this.calendar = calendar;
	}
	
	
	public boolean isTimeValid() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isDateValid() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isDateAndTimeInPast() {
		// TODO Auto-generated method stub
		
		long enteredTimeInMillis = calendar.getTimeInMillis();
		
		return (enteredTimeInMillis < currentTimeInMillis);
	}

}
