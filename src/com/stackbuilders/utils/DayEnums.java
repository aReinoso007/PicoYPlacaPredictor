package com.stackbuilders.utils;

import java.util.Calendar;

public enum DayEnums {
	
	MON(Calendar.MONDAY, "MONDAY"),
	TUE(Calendar.TUESDAY, "TUESDAY"),
	WED(Calendar.WEDNESDAY, "WEDNESDAY"),
	THU(Calendar.THURSDAY, "THURSDAY"),
	FRI(Calendar.FRIDAY, "FRIDAY");
	
	private int dayNumber;
	private String dayName;
	
	private DayEnums(int dayNumber, String dayName) {
		this.dayNumber = dayNumber;
		this.dayName = dayName;
	}
	
	public int getDayNumber() {
		return dayNumber;
	}
	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	

}
